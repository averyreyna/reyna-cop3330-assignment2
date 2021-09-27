/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex32;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.Random;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        // initialing variables to chcek inputs, whether or not the input is correct, and the number of guesses
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean isContinuing = true;
        boolean isCorrect = false;
        int numberGuesses = 0;

        System.out.print("Let's play Guess the Number!");

        // plays the game for as long as they want to continue
        while (isContinuing)
        {
            // asks user for their choice of difficulty
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            String chosenDifficulty = input.nextLine();

            // sets the upper limit of the range for each difficulty
            int upper = 0;

            switch (chosenDifficulty)
            {
                case "1":
                    upper = 9;
                    break;
                case "2":
                    upper = 99;
                    break;
                case "3":
                    upper = 999;
                    break;
                default:
                    System.out.print("Invalid difficulty");
                    return;
            }

            // chooses number and adds one since random includes 0
            int chosenNumber = rand.nextInt(upper) + 1;

            System.out.print("I have my number. What's your guess? ");

            // tracks everything needed for the game
            while (!isCorrect)
            {
                numberGuesses++;
                String guess = input.nextLine();

                if (!Pattern.matches("\\d+", guess))
                {
                    System.out.println(String.format("%s is not a number! Guess again: ", guess));
                }
                else if (Integer.parseInt(guess) == chosenNumber)
                {
                    System.out.println(String.format("You got it in %d guesses!", numberGuesses));
                    isCorrect = true;
                }
                else if (Integer.parseInt(guess) < chosenNumber)
                {
                    System.out.print("Too low. Guess again: ");
                }
                else if (Integer.parseInt(guess) > chosenNumber)
                {
                    System.out.print("Too high. Guess again: ");
                }
            }

            // asks the user whether not they want to play again
            System.out.print("Do you wish to play again (Y/N)? ");

            String another = input.nextLine();

            // checks the the input of whether or not they want to play again
            if (another.toLowerCase().equals("n"))
            {
                isContinuing = false;
            }
            else if (another.toLowerCase().equals("y"))
            {
                isCorrect = false;
                isContinuing = true;
            }
            else
            {
                return;
            }

            System.out.print("\n");
        }
    }
}


