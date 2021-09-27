/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex29;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App
{
    public static void main(String[] args)
    {
        // initializing variables so we can check if the input is valid and do the math later on
        boolean isValid = false;
        int convertedRateOfReturn = 0;
        int doubledInvestment = 0;
        Scanner input = new Scanner(System.in);

        // checking whether or not the input is valid
        while (!isValid)
        {
            System.out.print("What is your rate of return? ");
            String inputRateOfReturn = input.nextLine();

            // if it is valid, set the boolean to true and do the math outside of the while loop
            if (Pattern.matches("\\d+", inputRateOfReturn) && Integer.parseInt(inputRateOfReturn) != 0)
            {
                isValid = true;
                convertedRateOfReturn = Integer.parseInt(inputRateOfReturn);
            }
            else
            {
                System.out.println("Sorry. That's not a valid input.");
            }
        }

        // math to get months until doubled investment
        doubledInvestment = 72 / convertedRateOfReturn;

        System.out.println(String.format("It will take %d years to double your initial investment.", doubledInvestment));
    }
}
