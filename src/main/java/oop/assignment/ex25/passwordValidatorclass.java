package oop.assignment.ex25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class passwordValidatorclass {
    public int passwordValidator(String password) {
        int pass_strength_Number;
        int special_char_validator = special_character_validator(password);

        if (password.length() >= 8)
        {

        }

        return 1;
    }
    public static int special_character_validator(String password) {
    Pattern p = Pattern.compile("[^A-Za-z0-9 ]");
    Matcher m = p.matcher(password);
        
        if(m.find())
                return 0;
        else
                return 1;
    }

}
