/*
Write a Java program to do follow
1. Declare com.company.Two instance variable
2. Declare one instance method
3. call both instance variable into instance method inside the print statement
4. Declare main method
5. Call the above instance method into main method and run the programme.
 */

package com.company;

public class One {

    int a = 50;
    int b = 100;

    void ins_method_display()
    {
        System.out.println("I am instant variable A :" +a);
        System.out.println("I am instant variable B : " +b);
    }


    public static void main(String[] args) {
	// write your code here
        System.out.println("Hellow Java");
        One obj = new One();
        obj.ins_method_display();
    }
}
