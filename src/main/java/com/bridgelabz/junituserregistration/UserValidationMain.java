package com.bridgelabz.junituserregistration;
import java.util.Scanner;

public class UserValidationMain {
    static UserRegistration register = new UserRegistration();
    public static void main(String[] args) throws UserValidationException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First-Name: ");
        String firstName = sc.next();
        register.validateName.validate(firstName);
        System.out.println("Enter Last-Name: ");
        String lastName = sc.next();
        register.validateName.validate(lastName);
        System.out.println("Enter Email: ");
        String mail = sc.next();
        register.validateEmail.validate(mail);
        System.out.println("Enter Phone Number: ");
        String number = sc.next();
        register.validatePhoneNumber.validate(number);
        System.out.println("Enter Password: ");
        String password = sc.next();
        register.validateEmail.validate(password);

    }
}

