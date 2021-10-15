/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Sue Lin
 */

package baseline;

import java.io.FileNotFoundException;
import java.util.*;

/*
*Knowing how often a word appears in a sentence or block of text is helpful for creating word clouds and other types of word analysis. And it’s more useful when running it against lots of text.
*
*Create a program that reads in a file named `exercise46_input.txt` and counts the frequency of words in the file. Then construct a histogram displaying the words and the frequency, and display the histogram to the screen.
 */
public class Solution46 {

    public static void main (String[] args) throws FileNotFoundException {
        //initialize classes for file reading
        readFile rf = new readFile();
        Solution46 sol = new Solution46();

        //read the file and start inputting information into a map
        HashMap <String, Integer> map = rf.readInput();

        //print out the results, pass in the map
        sol.printResults(map);
    }

    //printing function
    void printResults(HashMap<String, Integer> map){
        int k = 0;
        int i, j;
        String[] keys = new String[map.size()];
        //create arrays and strings to store the values from the file
        Integer[] counts = new Integer[map.size()];

        //go through the map to store everything into the array
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            keys[k] = entry.getKey();
            counts[k++] = entry.getValue();
        }

        int[] tempCount = new int[map.size()];
        //transfer values from the count over to temp values for looping
        for(i = 0; i < counts.length; i++){
            tempCount[i] = counts[i];
        }

        //sort the array in reverse order
        Arrays.sort(counts, Collections.reverseOrder());

        //temporary keys for printing
        String[] tempKeys = new String[map.size()];

        //loop for the size of the map, so that all items are accounted for
        for (i = 0; i < map.size(); i ++) {
            int value = counts[i];

            for (j = 0; j < tempCount.length; j++) {

                if (value == tempCount[j]) {

                    tempKeys[i] = keys[j];
                    break;
                }
            }
        }

        System.out.println();

        //print out the histogram
        for(i = 0;i < map.size(); i++) {

            int value = map.get(tempKeys[i]);
            //print out the item, and then indent it
            System.out.print(tempKeys[i] + " : \t");

            //print out an asterisk for the number of kes
            for (j = 0; j < value; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
