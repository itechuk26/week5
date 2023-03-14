/*
Write a Java program that takes a number as input and prints its
multiplication table up to 10
 */

package com.company;

import java.util.Scanner;

public class Ten {

    public static void printMultiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Java program to print multiplication table ");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        printMultiplicationTable(num);
    }
}
