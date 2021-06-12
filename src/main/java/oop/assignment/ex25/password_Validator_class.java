package oop.assignment.ex25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class password_Validator_class {
    //method determines strength of password, does not return a string as per the instructions, returns an integer.
    public int passwordValidator(String password) {

        int special_char_result = special_character_validator(password);
        int number_validator_result = number_only_validator(password);
        int length_validator_result = length_validator(password);
        int letter_only_validator_result = only_letter_validator(password);
        int at_least_one_number_validator_result = at_least_one_number(password);
        int at_least_two_letters_validator_result = at_least_two_letters_validator(password);

        if(length_validator_result == 1 && number_validator_result == 0)
            return 0;
        else if(length_validator_result == 1 && letter_only_validator_result == 0)
            return 1;
        else if(at_least_one_number_validator_result == 0 && at_least_two_letters_validator_result == 0
                && length_validator_result ==0 && special_char_result == 1)
            return 2;
        else if(length_validator_result == 0 && at_least_two_letters_validator_result == 0
                && at_least_one_number_validator_result == 0 && special_char_result == 0)
            return 3;
        //exists for any other password that does not fit the criteria. (Example "%%" as a password)
        else
            return 4;


    }

    //method takes string input and checks if special character exists, if it exists, returns 0.
    public static int special_character_validator(String password) {
    Pattern p = Pattern.compile("[^A-Za-z0-9 ]");
    Matcher m = p.matcher(password);

        if(m.find())
                return 0;
        else
                return 1;
    }
    //method takes string input and checks if password contains only numbers, if it does, returns 0.
    public static int number_only_validator(String password) {
        if(password.matches("[0-9]+"))
            return 0;
        else
            return 1;
    }
    //method takes string input and checks if password contains at least one number, if it does returns 0.
    public static int at_least_one_number(String password) {
        if (password.matches(".*\\d+.*"))
            return 0;
        else
            return 1;
    }
    //method takes string input and checks if password is of at least length 8 or more. Returns 0 if true.
    public static int length_validator(String password) {
        if(password.length() >= 8)
            return 0;
        else
            return 1;
    }
    //method takes string input and checks if password contains only letters. Returns 0 if true.
    public static int only_letter_validator(String password) {
        if (Pattern.matches("[a-zA-Z]+",password))
            return 0;
        else
            return 1;
    }
    //method takes string input and checks if password contains at least two letters. (Instructions says letters, plural)
    public static int at_least_two_letters_validator(String password) {
        if (Pattern.matches("^.*[a-zA-Z].*[a-zA-Z].*$",password))
            return 0;
        else
            return 1;
    }
}
