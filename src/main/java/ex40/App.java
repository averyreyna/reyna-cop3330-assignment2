/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Avery Reyna
 */

package ex40;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        // this initializes the hash map needed to store the information needed
        List<HashMap<String,String>> employees = new ArrayList<HashMap<String,String>>();

        HashMap<String, String> john = new HashMap<String, String>();
        john.put("First Name", "John");
        john.put("Last Name", "Johnson");
        john.put("Position Name", "Manager");
        john.put("Separation Date", "2016-12-31");
        employees.add(john);

        HashMap<String, String> tou = new HashMap<String, String>();
        tou.put("First Name", "Tou");
        tou.put("Last Name", "Xiong");
        tou.put("Position Name", "Software Engineer");
        tou.put("Separation Date", "2016-10-05");
        employees.add(tou);

        HashMap<String, String> michaela = new HashMap<String, String>();
        michaela.put("First Name", "Michaela");
        michaela.put("Last Name", "Michaelson");
        michaela.put("Position Name", "District Manager");
        michaela.put("Separation Date", "2015-12-19");
        employees.add(michaela);

        HashMap<String, String> jake = new HashMap<String, String>();
        jake.put("First Name", "Jake");
        jake.put("Last Name", "Jacobson");
        jake.put("Position Name", "Programmer");
        jake.put("Separation Date", "");
        employees.add(jake);

        HashMap<String, String> jacquelyn = new HashMap<String, String>();
        jacquelyn.put("First Name", "Jacquelyn");
        jacquelyn.put("Last Name", "Jackson");
        jacquelyn.put("Position Name", "DBA");
        jacquelyn.put("Separation Date", "");
        employees.add(jacquelyn);

        HashMap<String, String> sally = new HashMap<String, String>();
        sally.put("First Name", "Sally");
        sally.put("Last Name", "Webber");
        sally.put("Position Name", "Web Developer");
        sally.put("Separation Date", "2015-12-18");
        employees.add(sally);

        // asks the user what they want to search
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search string: ");
        String searchString = input.nextLine();

        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        // this starts to fill in the information for the table
        for (int i = 0; i < employees.size(); i++)
        {
            HashMap<String, String> currentEmployee = employees.get(i);
            String employeeName = currentEmployee.get("First Name") + " " + currentEmployee.get("Last Name");

            // this fills in the table with the appropriate information according what the search string wanted to find
            if (employeeName.contains(searchString))
            {
                System.out.println(String.format("%-20s| %-18s| %-15s", employeeName, currentEmployee.get("Position Name"), currentEmployee.get("Separation Date")));
            }
        }
    }
}
