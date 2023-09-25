// Author: Richard Sharp
// Date: 9-24-2023
// Class: CSC1060
// Project: Triangle creator
//
// Description: custom triangle creator/generator

import java.util.Scanner;

public class Triangles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char choice = 'y';

        // loop to continue until the user decides to exit
        while (choice == 'y' || choice == 'Y') {
            // ask user for the size of the triangle and make sure it is valid
            System.out.print("Enter size: ");
            int size = in.nextInt();
            while (size < 1 || size > 50) {
                System.out.println("Size must be between 1-50!");
                System.out.print("Enter size: ");
                size = in.nextInt();
            }

            // ask user for the fill character (what they want the triangle to be made with)
            System.out.print("Enter fill: ");
            char fill = in.next().charAt(0);
            System.out.println();

            // creates the triangle
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(fill + " ");
                }
                System.out.println();
            }

            // Ask the user if they'd like to create another triangle
            System.out.print("Would you like another triangle (Y/N)?");
            choice = in.next().charAt(0);
            System.out.println();
        }

        // close the scanner
        in.close();
    }
}
