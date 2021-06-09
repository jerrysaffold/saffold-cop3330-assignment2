package oop.assignment.ex24;

import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        if(word1.length() != word2.length()) {
            return false;
        }
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        return Arrays.equals(w1, w2);
    }

}
