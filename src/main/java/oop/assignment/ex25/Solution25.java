package oop.assignment.ex25;

import java.util.Scanner;

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
public class Solution25 {
    private static final Scanner in = new Scanner(System.in);
    private static String word1;

    public static void main(String[] args) {
        System.out.println("Enter a password and I will tell you the strength. ");

        //read in string
        readuserInput();
        passwordValidatorclass passwordValidatorclassObject = new passwordValidatorclass();
        int result = passwordValidatorclassObject.passwordValidator(word1);

        generateOutput(result);



    }

    public static void readuserInput() {

        word1 = in.next();
    }

}
