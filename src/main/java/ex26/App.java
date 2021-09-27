/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex26;
import java.util.Scanner;
import java.lang.Math;

class PaymentCalculator
{
    public static double calculateMonthsUntilPaidOff(double inputBalance, double inputAPR, double inputMonthlyPayment)
    {
        // math for the calculated months to pay off credit card, along with the constant being used for the first
        // part of the calculations
        double dividedAPR = (inputAPR / 100) / 365;
        double constant = 1.0 / 30.0;
        double calculatedMonths = -constant * (Math.log(1 + (inputBalance / inputMonthlyPayment) * (1 - Math.pow((1 + dividedAPR), 30))) / Math.log(1 + dividedAPR));
        return Math.ceil(calculatedMonths);
    }
}

public class App
{
    public static void main(String[] args)
    {
        // needed in order to access returned value in previous class
        PaymentCalculator calculatedMonths = new PaymentCalculator();

        // asks the user for their information in order to return how many months it takes to pay their card off
        Scanner input = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double inputBalance = Double.parseDouble(input.nextLine());

        Scanner input2 = new Scanner(System.in);
        System.out.print("What is the APR on the card (as a percent)? ");
        double inputAPR = Double.parseDouble(input2.nextLine());

        Scanner input3 = new Scanner(System.in);
        System.out.print("What is the monthly payment you can make? ");
        double inputMonthlyPayment = Double.parseDouble(input3.nextLine());

        double monthsOutput = calculatedMonths.calculateMonthsUntilPaidOff(inputBalance, inputAPR, inputMonthlyPayment);

        System.out.println(String.format(("It will take you %.0f months to pay off this card."), monthsOutput));
    }
}
