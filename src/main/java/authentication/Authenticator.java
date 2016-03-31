package authentication;

import exceptions.LoginException;
import exceptions.NotLoggedInException;

public interface Authenticator {


    /**
     * <p>Attempt to log in using provided credentials.</p>
     * <p>Note: This method only needs to be called once, session renewal is handled automatically.</p>
     *
     * @param username
     * @param password
     * @return true if login was successful, false otherwise
     */
    boolean login(String username, String password);

    /**
     * <p>Check if we are logged in. Renew session if needed.</p>
     *
     * @throws NotLoggedInException if no login has been initiated before
     * @throws LoginException       if log-in fails
     */
    void checkLogin() throws NotLoggedInException, LoginException;

}
