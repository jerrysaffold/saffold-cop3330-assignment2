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
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class_Object.special_character_validator("to@styss");

        assertEquals(expected, actual);
    }

    @Test
    void special_character_validator_does_not_exist_test2() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class_Object.special_character_validator("toastyss");

        assertEquals(expected, actual);
    }


    @Test
    void special_character_validator_exists_test3() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class_Object.special_character_validator("toast*yss");

        assertEquals(expected, actual);
    }

    @Test
    void special_character_validator_exists_test4() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class_Object.special_character_validator("toas^yss");

        assertEquals(expected, actual);
    }

    @Test
    void number_only_validator_test5() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class_Object.number_only_validator("123456");

        assertEquals(expected, actual);
    }

    @Test
    void number_only_validator_test6() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class_Object.number_only_validator("1234g6");

        assertEquals(expected, actual);


    }

    @Test
    void number_only_validator_test7() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class_Object.number_only_validator("1#3456");

        assertEquals(expected, actual);
    }

    @Test
    void number_only_validator_test8() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class_Object.number_only_validator("1234D6");

        assertEquals(expected, actual);


    }

    @Test
    void length_validator_test9() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class_Object.length_validator("1#3456");

        assertEquals(expected, actual);
    }

    @Test
    void length_validator_test10() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class_Object.length_validator("123456789");

        assertEquals(expected, actual);


    }

    @Test
    void length_validator_test11() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class_Object.length_validator("Jones12@");

        assertEquals(expected, actual);


    }
}