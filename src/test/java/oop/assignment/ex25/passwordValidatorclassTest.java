package oop.assignment.ex25;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class passwordValidatorclassTest {
/*
    @Test
    void passwordValidator() {
    }
*/
    @Test
    void special_character_validator_exists_test() {
        passwordValidatorclass passwordValidatorclassObject = new passwordValidatorclass();
        int expected = 0;
        int actual = passwordValidatorclassObject.special_character_validator("to@styss");

        assertEquals(expected, actual);
    }

    @Test
    void special_character_validator_does_not_exist_test2() {
        passwordValidatorclass passwordValidatorclassObject = new passwordValidatorclass();
        int expected = 1;
        int actual = passwordValidatorclassObject.special_character_validator("toastyss");

        assertEquals(expected, actual);
    }
}