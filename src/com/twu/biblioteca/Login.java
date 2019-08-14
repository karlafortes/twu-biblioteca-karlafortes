package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

    private List<Customer> users = new ArrayList() {
        {
            add(new Customer("135791", "password", "Hanna Lawrence", "hlawrence@email.com", "+1 321 3440907"));
            add(new Customer("135798", "pwd123", "John Smith", "jsmith@email.com", "+1 344 3457327"));
        }
    };

    private String userLoggedId;

    public Boolean validatesCustomerLogin() {
        System.out.println("Please, enter your library number:");
        String login = new Scanner(System.in).nextLine();
        System.out.println("\nNow, enter your password:");
        String password = new Scanner(System.in).nextLine();

        if(isValidLogin(login, password)){
            userLoggedId = login;
            return true;
        }
        else {
            System.out.println("\nLogin and/or password invalid!");
            return false;
        }
    }

    private boolean isValidLogin(String userLogin, String password){

        return users.stream().anyMatch(users -> users.isLoginValid(userLogin, password));
    }

    public Customer getUserLogged() {

        return users.stream().
                filter(user -> user.getLogin().equals(userLoggedId)).
                findFirst().orElse(null);
    }
}
