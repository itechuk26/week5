/*
Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers
 */

package com.company;

import java.util.Scanner;

public class Eighteen {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static double divide(int num1, int num2) {
        return (double) num1 / num2;
    }

    public static int remainder(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = add(num1, num2);
        int product = multiply(num1, num2);
        int difference = subtract(num1, num2);
        double quotient = divide(num1, num2);
        int remainder = remainder(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("multiply: " + product);
        System.out.println("substraction : " + difference);
        System.out.println("Division : " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}

