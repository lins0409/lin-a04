/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Sue Lin
 */
package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
*There will be times when you'll need to read in one file, modify it, and then write a modified version of that file to a new file.
 */
public class Solution45 {

    public static void main (String[] args) throws IOException {
        //initialize scanner and class instance
        Solution45 sol = new Solution45();
        Scanner scanner = new Scanner(System.in);

        //create an array to store the text in the file
        Scanner inputFile = new Scanner(new File("./data/exercise45_input.txt"));
        ArrayList <String> list = new ArrayList<>();

        //prompt user for name of the file to write
        System.out.print("What is the name of the output file? ");
        //scan in the name and store in string
        String outputFileName = scanner.next();

        //read the file
        while (inputFile.hasNext()){
            String fileInfo = inputFile.nextLine();
            list.add(fileInfo);
        }
        inputFile.close();

        //call function to write output
        sol.writeNewOutput(list, outputFileName);
    }

    void writeNewOutput(ArrayList<String> list, String fileName) throws IOException {
        //direct the output file to the correct location and make sure it is names properly
        FileWriter fileWriter = new FileWriter("./data/" + fileName);
        int i;
        //make a loop so that as long as it is not the end of the file it will find all instances where the word utilized is called, and replace it with use.
        for (i = 0; i < list.size(); i++){
            String tempList = list.get(i);

            tempList = tempList.replaceAll("utilize", "use");
            fileWriter.write(tempList+ "\n");
        }
        //close file
        fileWriter.close();
    }
}
