package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

    private List<Customer> users = new ArrayList() {
        {
            add(new Customer("135791", "password"));
            add(new Customer("135798", "pwd123"));
        }
    };

    public Boolean validatesCustomerLogin() {
        System.out.println("Please, enter your library number:");
        String login = new Scanner(System.in).nextLine();
        System.out.println("\nNow, enter your password:");
        String password = new Scanner(System.in).nextLine();

        if(isValidLogin(login, password)){
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
}
