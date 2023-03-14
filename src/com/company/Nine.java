package com.company;
/*
Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class Nine {

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
