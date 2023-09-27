/*
Author: Richard Sharp
Date: 9/26/2023
Class: CSC1060
Description: Exam1 part 2
 */

import java.util.Scanner;
public class BeverageSelector {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //beverage selection
        System.out.println("Please choose a beverage:");

        System.out.println("1) Water");

        System.out.println("2) Coke");

        System.out.println("3) Coffee");

        System.out.print("Enter your selection (1, 2, or 3): ");


        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected Water as you drink choice.");
                break;

            case 2:
                System.out.println("You selected Coke as your drink choice.");
                break;

            case 3:
                System.out.println("You selected Coffee as you drink choice.");
                break;

            default:
                System.out.println("You made an invalid selection.");

        }

        //closing the scanner
        in.close();
    }


}
