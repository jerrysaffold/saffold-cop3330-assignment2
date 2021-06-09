package oop.assignment.ex24;

import java.util.Scanner;

public class Solution24 {
    private static final Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void main(String[] args) {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        //read in two strings
        readuserInput();
        AnagramDetector AnagramDetectorObject = new AnagramDetector();
        boolean result = AnagramDetectorObject.isAnagram(word1, word2);

        generateOutput(result);



    }

    public static void generateOutput(boolean isAnagram) {
        if (isAnagram){
            System.out.printf("\"%s\" and \"%s\" are anagrams.", word1, word2);
        } else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", word1, word2);
        }

    }


    public static void readuserInput() {
        System.out.println("Enter word 1");
        word1 = in.next();

        System.out.println("Enter word2 ");
        word2 = in.next();
    }
}