package oop.assignment.ex24;

import java.util.Scanner;

public class Solution24 {
    private static final Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void main(String[] args) {
        //read in two strings
        readuserInput();
        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1, word2);

        String output = generateOutput(result);

        System.out.println(output);
    }

    public static void readuserInput() {
        System.out.println("Enter word 1");
        word1 = in.next();

        System.out.println("Enter word2 ");
        word2 = in.next();
    }

    public static String generateOutput(boolean isAnagram) {
        //store output in string
        String output;
        if (isAnagram) {
            output = "is anagram";
        } else {
            output = "is not anagram";
        }

        return output;
    }
}