/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex36;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App
{
    // these are all the stat helper functions needed for calculations
    static double average(List<Integer> numberList)
    {
        double total = 0;
        double averageStat = 0;

        for (int i = 0; i < numberList.size(); i++)
        {
            total += numberList.get(i);
            averageStat = total / numberList.size();
        }

        return averageStat;
    }

    static double min(List<Integer> numberList)
    {
        return Collections.min(numberList);
    }

    static double max(List<Integer> numberList)
    {
        return Collections.max(numberList);
    }

    static double std(List<Integer> numberList)
    {
        double mean = average(numberList);
        double temp = 0;

        for (int i = 0; i < numberList.size(); i++)
        {
            int value = numberList.get(i);
            double squareDistanceToMean = Math.pow(value - mean, 2);
            temp += squareDistanceToMean;
        }

        double meanOfDifferences = temp / (double) (numberList.size());

        return Math.sqrt(meanOfDifferences);
    }

    public static void main(String[] args)
    {
        // creating a list of integers that holds the inputted values
        List<Integer> numberList = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        String addedNumber;

        // while the inputted value is not "done", it keeps prompting the user to input another number
        while (!(addedNumber = input.nextLine()).equals("done"))
        {
            numberList.add(Integer.parseInt(addedNumber));
            System.out.print("Enter a number: ");
        }

        // used to print out the numbers on a singular line
        String numbersInArray = numberList.stream().map(Object::toString).collect(Collectors.joining(", "));

        System.out.println("Numbers: " + numbersInArray);

        System.out.println(String.format("The average is %.1f", average(numberList)));
        System.out.println(String.format("The minimum is %.2f", min(numberList)));
        System.out.println(String.format("The maximum is %.2f", max(numberList)));
        System.out.println(String.format("The standard deviation is %.2f", std(numberList)));

    }
}
