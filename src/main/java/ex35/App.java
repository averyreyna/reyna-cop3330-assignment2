/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex35;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        // initializing varibables so we can create a list of names and keep track of its size
        List<String> nameList = new ArrayList<String>();
        int nameListSize = 0;
        // asks the user to input a name
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String emptyLine;

        // while the inputted name is not empty, it keeps prompting the user to input a name
        while (!(emptyLine = input.nextLine()).equals(""))
        {
            nameList.add(emptyLine);
            System.out.print("Enter a name: ");
        }

        // setting randomIndex to hold some random number so a winner could get chosen
        Random rand = new Random();
        int randomIndex = rand.nextInt(nameList.size());
        String randomName = nameList.get(randomIndex);

        System.out.println(String.format("The winner is... %s", randomName));
    }
}
