package org.example;

import java.util.Scanner;

public class InchConversion {

    public static void main(String[] args) {
        //accept as user input the amount of inches
        // write two methods
            // one to convert inches to feet
            // and a second to convert to yards
        // Display the results
        // 12 inches in a foot
        // 36 inches in a yard

        //Declare Initial Variables
        int inches;

        // Gather user's input (in inches)
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter an amount of inches to be converted");
        inches = inputDevice.nextInt();

        //Call Methods for Conversion and assign to feet and yards
        double feet = convertToFeet(inches);
        double yards = convertToYards(inches);

        //Display the conversions back to user
        System.out.println(inches + " inches is equal to " + feet + " feet");
        System.out.println(inches + " inches is equal to " + yards + " yards");

    }

    //Created Method to convert inches to feet
    public static double convertToFeet(int inches){
        double feet = (double)inches/(double)12;
        return feet;

    }

    //Created Method to convert inches to yards
    public static double convertToYards(int inches){
        double yards = (double)inches/(double)36;
        return yards;
    }

}