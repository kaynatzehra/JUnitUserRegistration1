package com.bridgelabz.junituserregistration;
import org.junit.Test;
import junit.framework.Assert;

public class ExceptionTest {
    @Test
    public void givenFirstName_IsNull_ShouldThrowNullException() throws UserValidationException {
        UserRegistration register = new UserRegistration();
        try {
            register.validateName.validate(null);
        } catch (UserValidationException e) {
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void givenFirstName_WhenEmpty_ShouldThrowEmptyException() throws UserValidationException{

        UserRegistration register = new UserRegistration();
        try {
            register.validateName.validate("");
        } catch (UserValidationException e) {
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
    @Test
    public void givenLastName_IsNull_ShouldThrowNullException() throws 	UserValidationException {
        UserRegistration register = new UserRegistration();
        try {
            register.validateName.validate(null);
        } catch (UserValidationException e) {
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void givenLastName_WhenEmpty_ShouldThrowEmptyException() throws UserValidationException{

        UserRegistration register = new UserRegistration();
        try {
            register.validateName.validate("");
        } catch (UserValidationException e) {
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
    @Test
    public void givenEmail_IsNull_ShouldThrowNullException() throws UserValidationException {
        UserRegistration register = new UserRegistration();
        try {
            register.validateEmail.validate(null);
        } catch (UserValidationException e) {
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void givenEmail_WhenEmpty_ShouldThrowEmptyException() throws UserValidationException{

        UserRegistration register = new UserRegistration();
        try {
            register.validateEmail.validate("");
        } catch (UserValidationException e) {
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
    @Test
    public void givenPhoneNumber_IsNull_ShouldThrowNullException() throws UserValidationException {
        UserRegistration register = new UserRegistration();
        try {
            register.validatePhoneNumber.validate(null);
        } catch (UserValidationException e) {
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void givenPhoneNumber_WhenEmpty_ShouldThrowEmptyException() throws UserValidationException{

        UserRegistration register = new UserRegistration();
        try {
            register.validatePhoneNumber.validate("");
        } catch (UserValidationException e) {
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
    @Test
    public void givenPassword_IsNull_ShouldThrowNullException() throws UserValidationException {
        UserRegistration register = new UserRegistration();
        try {
            register.validatePassword.validate(null);
        } catch (UserValidationException e) {
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void givenPassword_WhenEmpty_ShouldThrowEmptyException() throws UserValidationException{

        UserRegistration register = new UserRegistration();
        try {
            register.validatePassword.validate("");
        } catch (UserValidationException e) {
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

}