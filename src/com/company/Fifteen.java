/*

Write a Java program to swap two variables.
 */

package com.company;

import java.util.Scanner;

public class Fifteen {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping, a = " + a + " and b = " + b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = input.nextInt();

        System.out.print("Enter the value of b: ");
        int b = input.nextInt();

        System.out.println("Before swapping, a = " + a + " and b = " + b);

        swap(a, b);
    }
}
