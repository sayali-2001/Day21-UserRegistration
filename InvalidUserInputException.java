package com.bl.userRegistration;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class InvalidUserInputException extends Exception{
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.firstNameValidate("Sayali");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }
    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.firstNameValidate("sayali");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }
    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        try{
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.lastNameValidate("Thakare");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.lastNameValidate("thakare");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.phoneNumberValidate("91 9561864842");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.phoneNumberValidate("9561864842");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.passwordValidate("Ag23#%");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }
}
