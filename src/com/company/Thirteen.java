/*
Write a Java program that takes three numbers as input to calculate and
print the average of the numbers
 */
package com.company;

import java.util.Scanner;

public class Thirteen {


        public static double calculateAverage(double num1, double num2, double num3) {
            double average = (num1 + num2 + num3) / 3;
            return average;
        }

        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            System.out.print("Enter the third number: ");
            double num3 = input.nextDouble();

            double result = calculateAverage(num1, num2, num3);
            System.out.println("The average is: " + result);
        }

    }

