/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex31;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        // asks the user for their age and resting heartrate
        Scanner input = new Scanner(System.in);
        System.out.print("What is the age? ");
        int age = Integer.parseInt(input.nextLine());

        System.out.print("What is the resting heartrate? ");
        int resting = Integer.parseInt(input.nextLine());

        // initial print out of resting pulse, age, and beginning of table
        System.out.println(String.format("Resting Pulse: %s\tAge: %s", resting, age));
        System.out.println(String.format("%-13s| Rate", "Intensity"));
        System.out.println("-------------|-------");

        // loops through percentages in order to fill in the rest of the table
        for (int i = 55; i <= 95; i += 5)
        {
            double karvonenHeartRate = (((220 - age) - resting)* (i / 100.0)) + resting;
            System.out.println(String.format("%s%%          |%7d bpm", i, (int)Math.round(karvonenHeartRate)));
        }
    }
}