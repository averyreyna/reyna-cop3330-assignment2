/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex24;
import java.util.Scanner;
import java.util.Arrays;

public class App
{
    static boolean isAnagram(String firstString, String secondString)
    {
        // initializing variables so we can check the length and individual index of each string
        int firstStringLength = firstString.length();
        int secondStringLength = secondString.length();
        char[] firstStringArray = firstString.toCharArray();
        char[] secondStringArray = secondString.toCharArray();

        // checks to see if the string length matches
        if (firstStringLength != secondStringLength)
        {
            return false;
        }

        // sorting the string arrays alphabetically
        Arrays.sort(firstStringArray);
        Arrays.sort(secondStringArray);

        for (int i = 0; i < firstStringLength; i++)
        {
            // if the arrays don't match exactly according to their index, they can't be anagrams
            if (firstStringArray[i] != secondStringArray[i])
            {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args)
    {
        // asks the user to inout two strings
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        String inputString1 = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the second string: ");
        String inputString2 = input.nextLine();

        if (isAnagram(inputString1, inputString2))
        {
            System.out.println(String.format("\"%s\" and \"%s\" are anagrams", inputString1, inputString2));
        }
        else
        {
            System.out.println(String.format("\"%s\" and \"%s\" are not anagrams", inputString1, inputString2));
        }
    }
}
