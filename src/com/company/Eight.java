package com.company;

import java.util.Scanner;
/*
Write a program to calculate the area of a triangle.
Triangle Area = 0.5(base * height)
 */

public class Eight {


    public static double calculateTriangleArea(double base, double height) {
        double area = 0.5 * base * height;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program to calculate Area of Triangle");
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();

        double area = calculateTriangleArea(base, height);
        System.out.println("The area of the triangle is " + area);
    }
}
