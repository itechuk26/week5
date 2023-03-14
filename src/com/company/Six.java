/*
Write a java program to enter any radius value of circle and find out Area
Area = pie * r * r
 */

package com.company;

import java.util.Scanner;

public class Six {

    static double radius;
    double pi =  3.14;
    double area;
    public double area(double radius){
        area =  (3.14 *(radius*radius));
        return area;
    }

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        Six obj = new Six();

        System.out.println("simple program to Find Area of circle");
        System.out.println("Enter radius of the circle : ");
        radius = sc.nextDouble();

        System.out.println("Area of circle is "+obj.area(radius));


    }
}
