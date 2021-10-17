/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Sue Lin
 */
package baseline;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
*There will be times when you'll need to read in one file, modify it, and then write a modified version of that file to a new file.
 */
public class Solution45 {

    public static void main (String[] args) throws IOException {
        //initialize scanner and class instance
        addFile af = new addFile();
        writeFile wf = new writeFile();
        Scanner scanner = new Scanner(System.in);

        //create an array to store the text in the file
        Scanner inputFile = new Scanner(new File("./data/exercise45_input.txt"));
        ArrayList <String> list = new ArrayList<>();

        //prompt user for name of the file to write
        System.out.print("What is the name of the output file? ");
        //scan in the name and store in string
        String outputFileName = scanner.next();

        //call function to read file
        //set as a string so that I can test them
        String adding = af.readFile(inputFile, list);

        //call function to write output
        //this is set as a string, so I can test that it is being printed
        String results = wf.writeNewOutput(list, outputFileName);
    }
}
