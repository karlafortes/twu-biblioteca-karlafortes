package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void shouldReturnTrueWhenPasswordAndLoginMatchesInput() {
        String loginInput = "123456";
        String passwordInput = "123456";

        Customer expectedCustomer = new Customer("123456", "123456");

        assertTrue(expectedCustomer.isLoginValid(loginInput, passwordInput));
    }

    @Test
    public void shouldReturnFalseWhenPasswordAndLoginDoNotMatchesInput() {
        String loginInput = "123456";
        String passwordInput = "ABCDEF";

        Customer expectedCustomer = new Customer("123456", "123456");

        assertFalse(expectedCustomer.isLoginValid(loginInput, passwordInput));
    }

}