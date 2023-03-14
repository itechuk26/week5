/*
Write a Java program to convert a decimal number to binary number
*/


package com.company;

import java.util.Scanner;

public class Seventeen {

    public static String convertToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.append(decimal % 2);
            decimal /= 2;
        }
        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        String binary = convertToBinary(decimal);

        System.out.println(decimal + " in binary is: " + binary);
    }
}

