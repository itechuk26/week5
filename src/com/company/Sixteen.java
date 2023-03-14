/*
16. Write a Java program to add two binary numbers
 */
package com.company;

import java.util.Scanner;

public class Sixteen {

    public static int[] addBinary(int[] num1, int[] num2) {
            int[] result = new int[num1.length];
            int carry = 0;

            for (int i = num1.length - 1; i >= 0; i--) {
                int sum = num1[i] + num2[i] + carry;
                result[i] = sum % 2;
                carry = sum / 2;
            }

            if (carry != 0) {
                int[] newResult = new int[result.length + 1];
                newResult[0] = carry;
                for (int i = 1; i < newResult.length; i++) {
                    newResult[i] = result[i - 1];
                }
                return newResult;
            }

            return result;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the first binary number: ");
            String binary1 = input.nextLine();

            System.out.print("Enter the second binary number: ");
            String binary2 = input.nextLine();

            int[] num1 = new int[binary1.length()];
            for (int i = 0; i < binary1.length(); i++) {
                num1[i] = binary1.charAt(i) - '0';
            }

            int[] num2 = new int[binary2.length()];
            for (int i = 0; i < binary2.length(); i++) {
                num2[i] = binary2.charAt(i) - '0';
            }

            int[] result = addBinary(num1, num2);

            System.out.print("The sum of " + binary1 + " and " + binary2 + " is: ");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
            }
            System.out.println();
        }
    }

