/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex34;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        // creating a list of all the employee names given
        List<String> employeeList = new ArrayList<String>(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));

        // initial print out of all the employee names
        System.out.println("There are 5 employees:");
        employeeList.forEach(System.out::println);

        // asks the user for what employee they would like to remove
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an employee name to remove: ");
        String inputRemoveEmployee = input.nextLine();

        // checks if the employee name matches any in the list, if it does then it is removed, if not, an error message
        // is displayed
        if (employeeList.contains(inputRemoveEmployee))
        {
            employeeList.remove(inputRemoveEmployee);
        }
        else
        {

            System.out.print("\nThis employee does not exist\n");
        }

        System.out.println(String.format("\nThere are %d employees: ", employeeList.size()));
        employeeList.forEach(System.out::println);
    }
}
