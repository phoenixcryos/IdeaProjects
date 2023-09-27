/*
Author: Richard Sharp
Date: 9/26/2023
Class: CSC1060
Description: Exam1 part 3
 */

import java.util.Scanner;

public class TenMaker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ask user for first number
        System.out.print("First number selection: ");
        int num1 = in.nextInt();

        //ask user for second number
        System.out.print("Second number selection: ");
        int num2 = in.nextInt();

        //perform sum check - check if it add to ten
        if (makes10(num1, num2)) {
            System.out.println("Your selected numbers " + num1 + " and " + num2 + " add to 10.");
        } else {
            System.out.println("Your selected numbers " + num1 + " and " + num2 + " do not add to 10.");
        }

        //closing the scanner
        in.close();

        }

        //method for number check
        public static boolean makes10(int a, int b) {
            return (a + b) == 10;
    }
}
