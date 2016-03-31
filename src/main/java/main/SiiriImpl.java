package main;

import authentication.Authenticator;
import authentication.AuthenticatorImpl;
import data.Course;

import java.util.List;

public class SiiriImpl implements Siiri {

    private Authenticator authenticator;

    public SiiriImpl() {
        this.authenticator = new AuthenticatorImpl();
    }

    public boolean login(String username, String password) {
        return authenticator.login(username, password);
    }

    public List<Course> courseByName(String courseName) {
        checkLogin();
        // TODO
        return null;
    }

    public List<Course> courseByCode(String courseCode) {
        checkLogin();
        // TODO
        return null;
    }


    private void checkLogin() {
        authenticator.checkLogin();
    }

}
