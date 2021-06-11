package oop.assignment.ex24;
/*
 *  UCF COP3330 Summer 2021 Assignment 24 Solution
 *  Copyright 2021 Jerry Saffold
 */

/*
Exercise 24 - Anagram Checker
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt for both input strings and display the output as shown in the example that follows.

Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.
Constraints
Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false. Invoke this function from your main program.
Check that both words are the same length.
 */
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