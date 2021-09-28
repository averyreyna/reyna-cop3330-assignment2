/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex37;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class App
{
    public static void main(String[] args)
    {
        // setting scanners and random up for later use
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // created password list along with special charatcter lists that we can draw from later on
        List<Character> passwordList = new ArrayList<Character>();
        List<Character> specialCharacters = Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+');
        List<Character> letters = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        List<Character> numbers = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');

        // asks the user about their desired password constraints
        System.out.print("What's the minimum length? ");
        int length = Integer.parseInt(input.nextLine());

        System.out.print("How many special characters? ");
        int numSpecials = Integer.parseInt(input.nextLine());

        System.out.print("How many numbers? ");
        int numNumbers = Integer.parseInt(input.nextLine());

        // checks if the length has as many letters as numbers
        if (length < numNumbers + numNumbers + numNumbers)
        {
            System.out.print("Password must have as at least as many letters as numbers. Rerun with a larger maximum length");
            return;
        }

        // adds the number of specific characters to the password
        for (int i = 0; i < numSpecials; i++)
        {
            passwordList.add(specialCharacters.get(rand.nextInt(specialCharacters.size())));
        }
        for (int i = 0; i < numNumbers; i++)
        {
            passwordList.add(numbers.get(rand.nextInt(numbers.size())));
        }
        for (int i = 0; i < (length - numNumbers - numSpecials); i++)
        {
            passwordList.add(letters.get(rand.nextInt(letters.size())));
        }

        // shuffles passwordList so it comes out random
        Collections.shuffle(passwordList);

        System.out.print("Your password is ");

        for (int i = 0; i < passwordList.size(); i++)
        {
            System.out.print(passwordList.get(i));
        }
    }
}
