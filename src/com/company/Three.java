/*
Write the java program
1. Declare one instance and one static variable
2. Declare one instance method
3. Declare one static method
4. call both instance and static variable into both instance and static methods inside print statement
5. Declare main method
6. call both instance and static method into main method and run the programme
 */

package com.company;

public class Three {
    int ins_var = 100;
    static int sta_var = 50;

    public void ins_method(){
        System.out.println("I am instance variable : "+ins_var);
        System.out.println("I am static variable : "+sta_var);
    }

    static public void sta_method(){
        //System.out.println("I am instance variable : "+ins_var);
        System.out.println("I am static variable : "+sta_var);
    }

        public static void main(String arg[]){

        Three obj = new Three();
        sta_method();
        obj.ins_method();

    }
}
