package com.bridgelabz.junituserregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserDetailsTest {
    UserRegistration register = new UserRegistration();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserValidationException {
        boolean isValid = register.validateName.validate("Ravi");
        assertTrue(isValid);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
        boolean isValid = register.validateName.validate("ravi");
        assertFalse(isValid);
    }
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() throws UserValidationException {
        boolean isValid = register.validateName.validate("ra");
        assertFalse(isValid);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() throws UserValidationException {
        boolean isValid = register.validateName.validate("Kumar");
        assertTrue(isValid);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
        boolean isValid = register.validateName.validate("kumar");
        assertFalse(isValid);
    }
    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() throws UserValidationException {
        boolean isValid = register.validateName.validate("ku");
        assertFalse(isValid);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() throws UserValidationException {
        boolean isValid = register.validateEmail.validate("abc@gmail.com");
        assertTrue(isValid);
    }
    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
        boolean isValid = register.validateEmail.validate(".abc@gmail.com");
        assertFalse(isValid);
    }
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() throws UserValidationException {
        boolean isValid = register.validatePhoneNumber.validate("917620690906");
        assertTrue(isValid);
    }
    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
        boolean isValid4 = register.validatePhoneNumber.validate("56545");
        assertFalse(isValid4);
    }
    @Test
    public void givenPassword_When1UpperCase_ShouldReturnTrue() throws UserValidationException {
        boolean isValid = register.validatePassword.validate("aBd5gd2@g");
        assertTrue(isValid);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() throws UserValidationException {
        boolean isValid = register.validatePassword.validate("aBd5gd2@g");
        assertTrue(isValid);
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
        boolean isValid = register.validatePassword.validate("b31fr7skd");
        assertFalse(isValid);
    }
    @Test
    public void givenEmail_WhenHaveConsecutiveDots_ShouldReturnFalse() throws UserValidationException {
        boolean isValid = register.validateEmail.validate("abc..23@gmail.com");
        Assertions Assert;
        assertFalse(isValid);
    }

}

