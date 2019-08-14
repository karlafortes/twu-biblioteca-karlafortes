package com.twu.biblioteca;

public class Customer {

    private String login;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;

    public Customer(String login, String password, String name, String email, String phoneNumber) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Boolean isLoginValid(String userLogin, String password) {
        return userLogin.equals(this.login) && password.equals(this.password);
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
