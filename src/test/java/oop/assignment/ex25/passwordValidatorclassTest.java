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
        int actual = password_Validator_class.special_character_validator("to@styss");

        assertEquals(expected, actual);
    }

    @Test
    void special_character_validator_does_not_exist_test2() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class.special_character_validator("toastyss");

        assertEquals(expected, actual);
    }


    @Test
    void special_character_validator_exists_test3() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class.special_character_validator("toast*yss");

        assertEquals(expected, actual);
    }

    @Test
    void special_character_validator_exists_test4() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class.special_character_validator("toas^yss");

        assertEquals(expected, actual);
    }

    @Test
    void number_only_validator_test5() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class.number_only_validator("123456");

        assertEquals(expected, actual);
    }

    @Test
    void number_only_validator_test6() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class.number_only_validator("1234g6");

        assertEquals(expected, actual);
    }

    @Test
    void number_only_validator_test7() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class.number_only_validator("1#3456");

        assertEquals(expected, actual);
    }

    @Test
    void number_only_validator_test8() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class.number_only_validator("1234D6");

        assertEquals(expected, actual);
    }

    @Test
    void length_validator_test9() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class.length_validator("1#3456");

        assertEquals(expected, actual);
    }

    @Test
    void length_validator_test10() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class.length_validator("123456789");

        assertEquals(expected, actual);
    }

    @Test
    void length_validator_test11() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class.length_validator("Jones12@");

        assertEquals(expected, actual);
    }

    @Test
    void letter_only_validator_test12() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class.only_letter_validator("hellothere");

        assertEquals(expected, actual);
        }

    @Test
    void letter_only_validator_test13() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class.only_letter_validator("G3neralKenobi");

        assertEquals(expected, actual);
    }

    @Test
    void letter_only_validator_test14() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class.only_letter_validator("hel!othere");

        assertEquals(expected, actual);
    }

    @Test
    void at_least_one_number_validator_test15() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class.at_least_one_number("G3neralKenobi");

        assertEquals(expected, actual);
    }

    @Test
    void at_least_one_number_validator_test16() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class.at_least_one_number("hel!othere");

        assertEquals(expected, actual);
    }

    @Test
    void at_least_two_letters_validator_test17() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class.at_least_two_letters_validator("G3neralKenobi");

        assertEquals(expected, actual);
    }

    @Test
    void at_least_two_letters_validator_test18() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class.at_least_two_letters_validator("124842G");

        assertEquals(expected, actual);
    }

    @Test
    void at_least_two_letters_validator_test19() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class.at_least_two_letters_validator("Wh4539554");

        assertEquals(expected, actual);
    }

    @Test
    void at_least_two_letters_validator_test20() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class.at_least_two_letters_validator("1!24842g");

        assertEquals(expected, actual);
    }

    @Test
    void password_validator_test21() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 0;
        int actual = password_Validator_class_Object.passwordValidator("12345");

        assertEquals(expected, actual);
    }

    @Test
    void password_validator_test22() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 1;
        int actual = password_Validator_class_Object.passwordValidator("abcdef");

        assertEquals(expected, actual);
    }

    @Test
    void password_validator_test23() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 2;
        int actual = password_Validator_class_Object.passwordValidator("abc123xyz4");

        assertEquals(expected, actual);
    }

    @Test
    void password_validator_test24() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 3;
        int actual = password_Validator_class_Object.passwordValidator("1337h@xor!");

        assertEquals(expected, actual);
    }

    @Test
    void password_validator_other_scenario_test25() {
        password_Validator_class password_Validator_class_Object = new password_Validator_class();
        int expected = 4;
        int actual = password_Validator_class_Object.passwordValidator("%%");

        assertEquals(expected, actual);
    }

}