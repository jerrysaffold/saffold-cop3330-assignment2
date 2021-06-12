package oop.assignment.ex25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class password_Validator_class {
    public int passwordValidator(String password) {
        int pass_strength_Number;
        int special_char_result = special_character_validator(password);
        int number_validator_result = number_only_validator(password);
        int length_validator_result = length_validator(password);

        if(length_validator_result == 0 && number_validator_result == 0)
            return 0;



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

    public static int number_only_validator(String password) {
        if(password.matches("[0-9]+"))
            return 0;
        else
            return 1;

    }

    public static int length_validator(String password) {
        if(password.length() >= 8)
            return 0;
        else
            return 1;

    }
}
