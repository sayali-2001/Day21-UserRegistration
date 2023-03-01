package com.bl.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL = "^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$";
    private static final String PHONE_NUMBER = "^[\\d]{2}[\\s][\\d]{10}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$";

    public boolean firstNameValidate(String fName)
    {
        return Pattern.matches(NAME, fName);
    }
    public boolean lastNameValidate(String lName)
    {
        return Pattern.matches(NAME, lName);
    }

    public boolean emailValidate(String email)
    {
        return Pattern.matches(EMAIL, email);
    }

    public boolean phoneNumberValidate(String phNum)
    {
        return Pattern.matches(PHONE_NUMBER, phNum);
    }

    public boolean passwordValidate(String pw)
    {
        return Pattern.matches(PASSWORD, pw);
    }
    public boolean validateEmail(String email)
    {
        return Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
    }
}
