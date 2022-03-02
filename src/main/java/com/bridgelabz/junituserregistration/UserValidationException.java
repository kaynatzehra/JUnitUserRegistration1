package com.bridgelabz.junituserregistration;

public class UserValidationException extends RuntimeException{

    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }

    ExceptionType type;

    public UserValidationException(ExceptionType type, String message) {

        super(message);
        this.type = type;

    }
}