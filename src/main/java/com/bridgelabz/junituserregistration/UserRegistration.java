package com.bridgelabz.junituserregistration;
import java.util.regex.*;

import com.bridgelabz.junituserregistration.UserValidationException.ExceptionType;

@FunctionalInterface
interface ValidationIF {
    public boolean validate(String x) throws UserValidationException;
}

public class UserRegistration {
    private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
    private static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]{2,})*(?![a-zA-Z0-9.]+)*$";
    private static final String PHONE_NUMBER_REGEX = "^[0-9]{2}[0-9]{10}";
    private static final String PASSWORD_REGEX = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";
    static boolean isNameValid,isMailValid,isNumberValid,isPasswordValid,isMoodValid;

    static ValidationIF validateName= firstName -> {
        try {
            isNameValid= Pattern.matches(FIRST_NAME_REGEX, firstName);
            if(!isNameValid) {
                System.out.println("Name is invalid...Please enter proper name");
            }
            if(firstName.length() == 0) {
                throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");

            }
        }
        catch (NullPointerException e) {
            throw new UserValidationException(ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
        }
        return isNameValid;
    };
    static ValidationIF validateEmail= email -> {
        try {
            isMailValid= Pattern.matches(EMAIL_REGEX, email);
            if(!isMailValid) {
                System.out.println("Email is invalid...Please enter proper email");
            }
            if(email.length() == 0) {
                throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");

            }
        }
        catch (NullPointerException e) {
            throw new UserValidationException(ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
        }
        return isMailValid;
    };
    static ValidationIF validatePhoneNumber= number -> {
        try {
            isNumberValid= Pattern.matches(PHONE_NUMBER_REGEX, number);
            if(!isNumberValid) {
                System.out.println("Phone Number is invalid...Please enter proper phone number");
            }
            if(number.length() == 0) {
                throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");

            }
        }
        catch (NullPointerException e) {
            throw new UserValidationException(ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
        }
        return isNumberValid;
    };
    static ValidationIF validatePassword= password -> {
        try {
            isPasswordValid= Pattern.matches(PASSWORD_REGEX, password);
            if(!isPasswordValid) {
                System.out.println("Password is invalid...Please enter proper password");
            }
            if(password.length() == 0) {
                throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");

            }
        }
        catch (NullPointerException e) {
            throw new UserValidationException(ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
        }
        return isPasswordValid;
    };



}