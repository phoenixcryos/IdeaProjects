/*
Author: Richard Sharp
Date: 9/26/2023
Class: CSC1060
Description: Exam1 part 5
 */

import java.util.Scanner;
public class Summer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int input;

        //prompt for number and add till sum equals 0
        do {
            System.out.print("Please enter a number, enter 0 to stop: ");
            input = in.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println("The sum of your numbers is: " + sum);

        //closing scanner
        in.close();
    }
}
