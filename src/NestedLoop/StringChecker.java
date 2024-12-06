package NestedLoop;

import java.util.Arrays;
import java.util.Scanner;

public class StringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int characterCount;
        int wordCount = 1;
        int vowelCount = 0;
        boolean palindrome;

        int[] charCounter = new int[127];
        Arrays.fill(charCounter, 0);

        System.out.print("Enter a sentence: ");
        input = scanner.nextLine();

        characterCount = input.length();

        for (char character : input.toCharArray()) {
            if (character == ' ') {
                wordCount++;
            } else if ("AEIOUaeiou".indexOf(character) != -1) {
                vowelCount++;
            }
        }

        String palindromeCheck = input.replaceAll("\\W+","");
        StringBuilder palindromeCheck2 = new StringBuilder(palindromeCheck);
        palindrome = palindromeCheck.equalsIgnoreCase(palindromeCheck2.reverse().toString());

        for (char character : input.toLowerCase().toCharArray()) {
            charCounter[character]++;
        }

        System.out.println("Characters: " + characterCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Palindrome? " + palindrome);

        for (int i = 0; i < charCounter.length; i++) {
            if(i == (int)' '){
                System.out.println((char) i + ": " + "*".repeat(charCounter[i]));
            } else if (i >= (int)'0' && i <= (int)'9' ){
                System.out.println((char) i + ": " + "*".repeat(charCounter[i]));
            } else if (i >= (int)'a' && i <= (int)'z'){
                System.out.println((char) i + ": " + "*".repeat(charCounter[i]));
            }
        }
    }
}
