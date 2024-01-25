package com.emiyaconsulting.number_guesser;

import java.util.Scanner;

public class GuessNumberApp {
    private static void displayWelcome(int limit) {
        System.out.println("Guess the number!");
        System.out.println("I'm thinking of a number between 1 and " + limit);
        System.out.println();
    } 
    
    public static int getRandomInt(int limit) {
        double d = Math.random() * limit;
        int i = (int)d;
        i++;
        return i;
    }
    public static void main(String[] args) {
        final int LIMIT = 10;
        
        displayWelcome(LIMIT);
        int number = getRandomInt(LIMIT);

        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (true) {
            System.out.print("Your guess: ");
            int guess = 0;
            try {
                guess = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number - " + e);
                //continue; // Will skip out of the loop back to the top
                // of the while statement
            }

            if (guess < 1 || guess > LIMIT) {
                System.out.println("Invalid guess, try again.");
                continue;
            } 
            if (guess < number) {
                System.out.println("Too low.");
            } else if (guess > number) {
                System.out.println("Too high.");
            } else {
                System.out.println("You guessed it in " + count + " tries!");
                break;
            }
            count++;
        }
        System.out.println("Bye!");
    }
}
