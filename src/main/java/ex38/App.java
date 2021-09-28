/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex38;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App
{
    public static Integer[] filterEvenNumbers(String[] inputList)
    {
        // using a list to begin with because we don't know how many elements long the array is gonna be
        List<Integer> outputList = new ArrayList<Integer>();

        // iterating through the integer list to check each number in it
        for (int i = 0; i < inputList.length; i++)
        {
            int number = Integer.parseInt(inputList[i]);

            // if the number is even, we add it to the inputList
            if (number % 2 == 0)
            {
                outputList.add(number);
            }
        }

        // turning the output into an array becuase now we know how many even numbers there are
        Integer[] outputArray = new Integer[outputList.size()];
        outputArray = outputList.toArray(outputArray);
        return outputArray;

    }
    public static void main(String[] args)
    {
        // user inputs lists of numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");

        // calling the function that filters through the numbers to find the even ones
        String inputNumber = input.nextLine();
        String[] inputList = inputNumber.split(" ");
        Integer[] evenList = filterEvenNumbers(inputList);

        System.out.print("The even numbers are ");

        for (int i = 0; i < evenList.length; i++)
        {
            System.out.print(evenList[i] + " ");
        }
    }
}
