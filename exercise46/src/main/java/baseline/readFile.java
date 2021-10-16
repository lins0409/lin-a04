package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class readFile{

    HashMap<String, Integer> readInput() throws FileNotFoundException {
        int count;
        //read in the file
        Scanner inputFile = new Scanner(new File("./data/exercise46_input.txt"));
        //create a map for storing all the elements
        HashMap<String, Integer> map = new HashMap<>();

        //while it is not the end of the file
        while(inputFile.hasNext()){
            String input = inputFile.nextLine();
            //create an array to store the elements of the input file, also make sure that it's not read as a full string by separating it at every space
            String[] array = input.split(" ");

            for (String key : array) {
                // if key is already in map then
                if (map.containsKey(key)) {
                    // update value by 1
                    count = map.get(key);
                    count++;
                    map.put(key, count);
                }
                else {
                    map.put(key, 1);
                }
            }
        }
        //close the file to prevent memory leaks and other issues in regard to printing
        inputFile.close();

        //return map value for printing
        return map;
    }
}
