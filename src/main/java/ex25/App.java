/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex25;
import java.util.Scanner;

public class App
{
    static int passwordValidator(String passwordInput)
    {
        // initializing variables so we can check the password strength, along with having a special characters array
        int passwordLength = passwordInput.length();
        char[] passwordInputArray = passwordInput.toCharArray();
        char[] specialCharacters = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'};
        boolean letterChar = false;
        int numberChar = 0;
        boolean specialChar = false;
        int passwordStrength = 0;

        // looping through the inputted password to check for each of the constraints
        for (int i = 0; i < passwordLength; i++)
        {
            if (Character.isLetter(passwordInputArray[i]))
            {
                letterChar = true;
            }
            else if (Character.isDigit(passwordInputArray[i]))
            {
                numberChar++;
            }
            for (int j = 0; j < specialCharacters.length; j++)
            {
                if (passwordInputArray[i] == specialCharacters[j])
                {
                    specialChar = true;
                }
            }
        }

        // this binds the password strength to a number so we can use it for our output statement
        if (letterChar && (numberChar >= 2) && specialChar && (passwordLength >= 8))
        {
            passwordStrength = 4;
        }
        else if (letterChar && (numberChar >= 1) && (passwordLength >= 8))
        {
            passwordStrength = 3;
        }
        else if (letterChar && (passwordLength < 8))
        {
            passwordStrength = 2;
        }
        else if ((numberChar >= 1) && (passwordLength < 8))
        {
            passwordStrength = 1;
        }
        else
        {
            passwordStrength = 0;
        }

        return passwordStrength;
    }

    public static void main(String[] args)
    {
        // asks the user to input their password, along with a validator output so we can check the strength and the
        // necessary output
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String inputPassword = input.nextLine();
        String passwordValidatorOutput = "";

        if (passwordValidator(inputPassword) == 4)
        {
            passwordValidatorOutput = "a very strong password";
        }
        else if (passwordValidator(inputPassword) == 3)
        {
            passwordValidatorOutput = "a strong password";
        }
        else if (passwordValidator(inputPassword) == 2)
        {
            passwordValidatorOutput = "a weak password";
        }
        else if (passwordValidator(inputPassword) == 1)
        {
            passwordValidatorOutput = "a very weak password";
        }
        else if (passwordValidator(inputPassword) == 0)
        {
            passwordValidatorOutput = "not included in the constraints";
        }

        System.out.println(String.format("The password '%s' is %s", inputPassword, passwordValidatorOutput));
    }
}