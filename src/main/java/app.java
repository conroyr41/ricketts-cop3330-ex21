/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        int monthInt = 0;
        String monthString = "", output;

        while(monthInt < 1 || monthInt > 12)
        {
            try
            {
                System.out.println("Please enter a whole number representing the month between 1 and 12 inclusive:");
                scan = new Scanner(System.in);
                monthInt = Integer.parseInt(scan.next());
            }
            catch(Exception e)
            {
                System.out.println("You must enter a whole number!");
            }
        }

        switch (monthInt) {
            case 1 -> monthString = "January";
            case 2 -> monthString = "February";
            case 3 -> monthString = "March";
            case 4 -> monthString = "April";
            case 5 -> monthString = "May";
            case 6 -> monthString = "June";
            case 7 -> monthString = "July";
            case 8 -> monthString = "August";
            case 9 -> monthString = "September";
            case 10 -> monthString = "October";
            case 11 -> monthString = "November";
            case 12 -> monthString = "December";
        }

        output = String.format("The name of the month is %s.", monthString);

        System.out.println(output);
    }
}