//sable vinay brahmadev

package com.company;

import java.util.Random;
import java.util.Scanner;

public class guessing_no {
    
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = 1 + (int) (100 * Math.random());//here random number will be guessed
        int Trials = 6;
        int i, j;

        System.out.println("A Number is chosen between 1 to 100 Guess the number .");
        int l;
        do {
            for (i = 0; i < Trials; i++) {
                System.out.println("Enter the Number :");
                j = s.nextInt();

                if (n == j) {
                    System.out.println("Congratulations!,You Guess a Correct Number  ");
                    break;

                } else if (n > j && i != n - 1) {
                    System.out.println("Your number is greater than " + j);

                } else if (n < j && i != n - 1) {
                    System.out.println("Your number is smaller than "+j);

                } else {
                    System.out.println("Enter the number between 1 to 100");
                }

            }

            System.out.println("You Enter a wrong numbers");
            System.out.println("The actual number is :" + n);


            System.out.println("Do you want to continue press 1.");
            l = s.nextInt();
        } while (l == 1);

    }
}
