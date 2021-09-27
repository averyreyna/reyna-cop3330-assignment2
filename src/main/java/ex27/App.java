/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex27;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App
{
    // these functions check each of the constraints and update the error message accordingly
    static String isFirstName(String inputFirstName)
    {
        String errorMessage = "";
        int firstNameLength = inputFirstName.length();

        if (firstNameLength < 2)
        {
            errorMessage += "The first name must be at least 2 characters long.\n";
        }
        if (firstNameLength == 0)
        {
            errorMessage += "The first name must be filled in.\n";
        }

    return errorMessage;
    }

    static String isLastName(String inputLastName)
    {
        String errorMessage = "";
        int lastNameLength = inputLastName.length();

        if (lastNameLength < 2)
        {
            errorMessage += "The last name must be at least 2 characters long.\n";
        }
        if (lastNameLength == 0)
        {
            errorMessage += "The last name must be filled in.\n";
        }

        return errorMessage;
    }
    static String isEmployeeID(String inputEmployeeID)
    {
        String errorMessage = "";

        if (!Pattern.matches("[A-Z]{2}-\\d{4}", inputEmployeeID))
        {
            errorMessage = "The employee ID must be in the format of AA-1234.\n";
        }

        return errorMessage;
    }
    static String isZIPCode(String inputZIPCode)
    {
        String errorMessage = "";

        if (!Pattern.matches("[1-9]{5}", inputZIPCode))
        {
            errorMessage = "The zipcode must be a 5 digit number.\n";
        }

    return errorMessage;
    }


    public static void main(String[] args)
    {
        // asks the user for their information
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String inputFirstName = input.nextLine();
        String checkFirstName = isFirstName(inputFirstName);

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the last name: ");
        String inputLastName = input2.nextLine();
        String checkLastName = isLastName(inputLastName);

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the ZIP code: ");
        String inputZIPCode = input3.nextLine();
        String isZIPCode = isZIPCode(inputZIPCode);

        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter the employee ID: ");
        String inputEmployeeID = input4.nextLine();
        String checkEmployeeID = isEmployeeID(inputEmployeeID);

        // checks for errors by calling the previous functions
        // if there are any errors, the else statement concatonates any error messages
        if (checkFirstName == "" && checkLastName == "" && isZIPCode == "" && checkEmployeeID == "")
        {
            System.out.println("There were no errors found.");
        }
        else
        {
            System.out.println(checkFirstName + checkLastName + isZIPCode + checkEmployeeID);
        }
    }
}
