/*
Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.
 */

package com.company;

import java.util.Scanner;

public class Nighteen {
    public static String convertToUpper(String str) {
        String result = str.toLowerCase();
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string in upper case: ");
        String str = input.nextLine();

        String result = convertToUpper(str);
        System.out.println("The string in lower case is: " + result);
    }
}
