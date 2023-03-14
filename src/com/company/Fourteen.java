/*
Write a Java program to print the area and perimeter of a rectangle
 */
package com.company;

import java.util.Scanner;

public class Fourteen {

    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
    public static double calculatePerimeter(double length, double width) {
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        double area = calculateArea(length, width);
        double perimeter = calculatePerimeter(length, width);

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}

