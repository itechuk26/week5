/*
Write a java program to insert temperature in Fahrenheit and convert into celcius
Degree celsius = ((F - 32) * 5/9


  Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius + "°C");
 */
package com.company;

import java.util.Scanner;

public class Sevan {
    double cals;

    public void celsius(double faren){
        cals =  (faren - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + cals + "°C");
    }
    public static void main(String[] args) {

        double faren;
        Scanner input = new Scanner(System.in);

        Sevan obj = new Sevan();
        System.out.println("Enter temperature in Farenheit: ");
        faren = input.nextDouble();
        obj.celsius(faren);

        input.close();
    }
}
