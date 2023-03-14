package com.company;/*
Write the Java program to
1. declare two static variable
2. Declare one static method
3. call both static variables into the static method inside print statement
4. declare main method
5. call the static method into the main method and run the program
 */

public class Two {

    static int a = 50;
    static int b = 100;

    static public void sta_method(){
        System.out.println("I am static variable : "+a);
        System.out.println("I am static variable : "+b);
    }
    public static void main (String arg[]){
        sta_method();

    }

}
