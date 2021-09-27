/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex33;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        // creating a list to hold all the potential answers, along with how we're gonna be picking them at random which
        // is by selecting a random index from the list
        List<String> answerList = new ArrayList<String>(Arrays.asList("Yes.", "No.", "Maybe.", "Ask me again later."));
        Random rand = new Random();
        int randomIndex = rand.nextInt(answerList.size());
        String randomAnswer = answerList.get(randomIndex);

        // asks the user for their question
        Scanner input = new Scanner(System.in);
        System.out.print("What is your question? \n> ");
        String inputQuestion = input.nextLine();

        System.out.println(randomAnswer);
    }
}
