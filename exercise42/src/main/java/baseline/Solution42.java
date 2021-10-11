/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Sue Lin
 */
package baseline;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
*Sometimes data comes in as a structured format that you have to break down and turn into records so you can process them. CSV, or comma-separated values, is a common standard for doing this.
*
*Construct a program that reads in the following data file
 */
public class Solution42 {
    //Initialize function caller
    public static final  Solution42 sol = new Solution42();

    public static void main (String[] args) throws IOException {
        //set the scanner to the file that the program needs to read
        Scanner inputFile = new Scanner(new File("./data/exercise42_input.txt"));

        //this is to test to make sure that the file was opened without an issue
        if (inputFile != null){
            System.out.println("Successfully opened file\n");
        }
        else {
            System.out.println("Error opening file\n");
        }

        //create an array to store the names
        ArrayList<String> names = new ArrayList<String>();

        //scan in the file and separate each bit into their own pieces (last name, first name, salary)
        while (inputFile.hasNextLine()) {
            names.add(inputFile.nextLine());
        }

        //store it into an array list?
        //send the list into the printing function
        sol.printBeginningOfOutput(names);

        //close the input file
        inputFile.close();
    }

    //printing out the output, make sure it's formatted correctly
    //may change it into a string and just have it return the current list to main
    void printBeginningOfOutput(ArrayList <String> names) throws IOException {
        FileWriter fileWriter = new FileWriter("./data/exercise42_output.txt");
        //take in the list, then print it out with spacing
        fileWriter.write("Last      First     Salary\n");
        fileWriter.write("--------------------------\n");

        for (String i : names){
            String[] tempString = i.split(",");
            String formatLastName = String.format("%-10s", tempString[0]);
            String formatFirstName = String.format("%-10s", tempString[1]);
            String formatSalary = String.format("%-11s", tempString[2]);
            fileWriter.write(formatLastName + formatFirstName + formatSalary + "\n");
        }

        //close the file otherwise it won't actually print
        fileWriter.close();
    }
}
