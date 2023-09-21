package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserAccountTest {
    private UserAccount login;

    @BeforeEach
    public void set() {login = new UserAccount("UncleJohnny","TheRenaissance@123");}

    @Test
    public void constructorTest01(){
        String expected = "UncleJohnny, TheRenaissance@123";
        String actual = login.toString();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getUserNameTest01(){
        String expected = "UncleJohnny";
        String actual = login.getUserName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setUserNameTest01(){
        login.setUserName("UncleJohnny");
        Assertions.assertEquals("UncleJohnny", login.getUserName());
    }

    @Test
    public void getPasswordTest01(){
        String expected = "TheRenaissance@123";
        String actual = login.getPassword();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPasswordTest01(){
        login.setPassword("TheRenaissance@123");
        Assertions.assertEquals("TheRenaissance@123", login.getPassword());
    }
}