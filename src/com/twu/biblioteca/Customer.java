package com.twu.biblioteca;

public class Customer {

    private String login;
    private String password;

    public Customer(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Boolean isLoginValid(String userLogin, String password) {
        return userLogin.equals(this.login) && password.equals(this.password);
    }
}
