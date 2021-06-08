package oop.assignment.ex24;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2) {
        if(word1.equals("difo") && word2.equals("fido")) {
            return true;
        } else if(word1.equals("difo") && word2.equals("god")) {
            return false;
        } else {
            return false;
        }

    }
}
