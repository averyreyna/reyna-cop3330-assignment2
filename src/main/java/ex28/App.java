/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex28;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        // creating a list to hold the inputted numbers and a sum that we can use in a for loop later on
        List<Integer> numberList = new ArrayList<Integer>();
        int sum = 0;

        // looping through the number inputs and adding them to the list
        for (int i = 0; i < 5; i++)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int numberInput = Integer.parseInt(input.nextLine());
            numberList.add(numberInput);
        }
        // math for adding the sum through each iteration
        for (int j = 0; j < 5; j++)
        {
            sum += numberList.get(j);
        }

        System.out.println(String.format("The total is %d", sum));
    }
}
