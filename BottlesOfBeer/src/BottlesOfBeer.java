// Author: Richard Sharp
// Date: 9-24-2023
// Class: CSC1060
// Project: BottlesOfBeer
//
// Description: song "99 Bottles of Beer" based on a user entered starting number.

import java.util.Scanner;

public class BottlesOfBeer {

    public static void main(String[] args) {
        // scanner creation to read input from user
        Scanner sc = new Scanner(System.in);

        // prompts the user to enter the starting number of bottles
        System.out.print("Enter the number of bottles to start with: ");
        int bottles = sc.nextInt();
        int startingBottles = bottles;

        // loop for each bottle of beer
        while (bottles >= 0) {

            // verse output based on the number of bottles
            if (bottles > 1) {
                System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (bottles - 1) + " bottles of beer on the wall.");
                System.out.println();
            } else if (bottles == 1) {
                System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer.");
                System.out.println("Take one down and pass it around, 0 bottles of beer on the wall.");
                System.out.println();
            } else {
                System.out.println("0 bottles of beer on the wall, 0 bottles of beer.");
                System.out.println("Go to the store and buy some more, " + startingBottles + " bottles of beer on the wall.");
            }

            // added a 1 second pause between verses so it doesn't scroll too fast
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            bottles--;
        }

        // Close the Scanner
        sc.close();
    }
}
