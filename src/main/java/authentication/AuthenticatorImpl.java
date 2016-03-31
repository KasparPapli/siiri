package authentication;

import exceptions.LoginException;
import exceptions.NotLoggedInException;

public class AuthenticatorImpl implements Authenticator {

    private String username;
    private String password;

    public boolean login(String username, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("A username must be provided");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("A password must be provided");
        }
        this.username = username;
        this.password = password;
        return login();
    }

    public void checkLogin() throws NotLoggedInException, LoginException {
        boolean authenticated = isAuthenticated();
        if (!authenticated) {
            if (username != null && password != null) {
                // The session has expired, need to renew
                boolean loginSuccessful = login();
                if (!loginSuccessful) {
                    throw new LoginException("Login failed");
                }
            } else {
                // No login performed
                throw new NotLoggedInException("Must be logged in to perform this activity");
            }
        }
    }


    private boolean isAuthenticated() {
        // TODO
        return false;
    }

    private boolean login() {
        // TODO
        return false;
    }

}
