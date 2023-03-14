/*
Write a program a calculator with addition, subtraction, multiplication and division methods
All methods with parameters and use string concatenation methods
note com.company.Two static methods and com.company.Two instance methods.
 */
package com.company;

import java.util.Scanner;

public class Five {
    int a;
    int b;

    public void addition(int a, int b){
        System.out.println(+a+ "+" +b+ " = " +(a+b));
    }

    public void subtraction(int a, int b){
        System.out.println(+a+ "-" +b+ " = " +(a-b));
    }

    public static void multiplication(int a, int b){
        System.out.println(+a+"*" +b+ " = " +(a*b));
    }

    public static void division(int a, int b){
        System.out.println(+a+"/" +b+ " = " +(a/b));
    }


    public static void main(String arg[]){

        Five obj = new Five();

        Scanner kb = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");

        System.out.print("\nWhat would you like to do?: ");
        int choice = kb.nextInt();
        System.out.println("Enter number 1 : ");
        int a = kb.nextInt();
        System.out.println("Enter number 2 : ");
        int b = kb.nextInt();

        if (choice == 1){
            obj.addition(a,b);
        }
        else if (choice == 2){
            obj.subtraction(a,b);
        }
        else if (choice == 3){
            division(a,b);
        }
        else if (choice == 4){
            multiplication(a,b);
        }

        System.out.println();
        kb.close();

    }
}
