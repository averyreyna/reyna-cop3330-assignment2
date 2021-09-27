/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex30;

public class App
{
    public static void main(String[] args)
    {
        // two for loops for all of the multiplication table, excluding 0
        for (int i = 1; i <= 12; i++)
        {
            for (int j = 1; j <= 12; j++)
            {
                // using %5s to pad it at the start by 5, used for formatting
                // doing the math in the format (i * j, instead of initializing another variable
                System.out.print(String.format("%5s", i * j));
            }
            // printing a new line at the end so the next set of calculations is on its own line
            System.out.print(String.format("\n"));
        }
    }
}
