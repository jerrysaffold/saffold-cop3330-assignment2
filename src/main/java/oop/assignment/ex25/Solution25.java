package oop.assignment.ex25;
/*
 *  UCF COP3330 Summer 2021 Assignment 25 Solution
 *  Copyright 2021 Jerry Saffold
 */
/*
Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.
Constraints
Create a passwordValidator function that takes in the password as its argument and returns a
value you can evaluate to determine the password strength.
Do not have the function return a string—you may need to support multiple languages in the future.
Use a single output statement.
 */
import java.util.Scanner;

public class Solution25 {
    private static final Scanner in = new Scanner(System.in);
    private static String password;

    public static void main(String[] args) {
        System.out.println("How many numbers would you like to add? ");
        readuserInput();
        //allows access to new class
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int result = password_Validator_class_Object.passwordValidator(password);
        //method to print output using integer returned from passwordValidator method in other class
        generateOutput(result);
    }

    //reads user input
    public static void readuserInput()
    {
        password = in.next();
    }

    //generates output based on integer returned from passwordValidator method in password_validator_class
    public static void generateOutput(int result) {
        if (result == 0)
            System.out.printf("The password '%s' is a very weak password. ", password);
        else if(result == 1)
            System.out.printf("The password '%s' is a weak password. ", password);
        else if(result == 2)
            System.out.printf("The password '%s' is a strong password. ", password);
        else if(result == 3)
            System.out.printf("The password '%s' is a very strong password. ", password);
        //Instructions do not include every scenario, so I created this option.
        else
        System.out.printf("The password '%s' does not fit parameters of program so password strength" +
                "can not be determined. ", password);
    }
}
