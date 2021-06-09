package oop.assignment.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_anagrams() {
        AnagramDetector AnagramDetectorObject = new AnagramDetector();

        boolean expected = true;
        boolean actual = AnagramDetectorObject.isAnagram("note", "note");

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_true_for_anagrams2() {
        AnagramDetector AnagramDetectorObject = new AnagramDetector();

        boolean expected = true;
        boolean actual = AnagramDetectorObject.isAnagram("desserts", "stressed");

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_for_anagrams_different_lengths() {
        AnagramDetector AnagramDetectorObject = new AnagramDetector();

        boolean expected = false;
        boolean actual = AnagramDetectorObject.isAnagram("not", "note");

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_for_anagrams() {
        AnagramDetector AnagramDetectorObject = new AnagramDetector();

        boolean expected = false;
        boolean actual = AnagramDetectorObject.isAnagram("desserts", "desertsd");

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_true_for_anagrams_different_upper_lower_cases() {
        AnagramDetector AnagramDetectorObject = new AnagramDetector();

        boolean expected = true;
        boolean actual = AnagramDetectorObject.isAnagram("Angel", "glean");

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_for_anagrams_different_upper_lower_cases() {
        AnagramDetector AnagramDetectorObject = new AnagramDetector();

        boolean expected = false;
        boolean actual = AnagramDetectorObject.isAnagram("Anjel", "glean");

        assertEquals(expected, actual);
    }
}