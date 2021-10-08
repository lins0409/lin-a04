/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Sue Lin
 */
package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
*Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts the list alphabetically:
 */
public class Solution41 {
    //Initialize function caller
    public static final  Solution41 sol = new Solution41();

    public static void main (String[] args) throws IOException {
        //create an int to keep track of the number of employees
        int count = 0;
        //initialize scanner and create a file path that is going to the text file
        Scanner inputFile = new Scanner(new File("./data/exercise41_input.txt"));

        //this is to test to make sure that the file was opened without an issue
        if (inputFile != null){
            System.out.println("Successfully opened file\n");
        }
        else {
            System.out.println("Error opening file\n");
        }

        //then create a buffer and an array for the file
        ArrayList <String> names = new ArrayList<String>();

        //loop it so that while the file doesn't end it'll read everything in and store it in an array
        while (inputFile.hasNextLine()) {
            names.add(inputFile.nextLine());
            //increment the number of employees every time a new one is added
            count++;
        }

        //then call a function that will sort the names
        sol.nameSorter(names);

        //then call a function to print out the results
        sol.printOutResults(names, count);

        //close the file
        inputFile.close();
    }

    //function to sort the array
    //maybe make it into a separate class? idk yet
    void nameSorter(ArrayList <String> names){
        //use sort function to sort the names
        Collections.sort(names);
    }

    //formatting of the output file is all done here
    void printOutResults(ArrayList <String> names, int count) throws IOException {
        FileWriter fileWriter = new FileWriter("./data/exercise41_output.txt");
        fileWriter.write("Total of " + count + " names\n");
        fileWriter.write("-----------------\n");

        //loops and prints out all the names
        for (String i : names) {
            fileWriter.write(i + "\n");
        }

        //close output file
        fileWriter.close();
    }
}
