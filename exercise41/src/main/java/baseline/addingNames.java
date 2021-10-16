package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class addingNames {

    int nameAdder(ArrayList<String> names, Scanner inputFile, int count){
        //loop it so that while the file doesn't end it'll read everything in and store it in an array
        while (inputFile.hasNextLine()) {
            names.add(inputFile.nextLine());
            //increment the number of employees every time a new one is added
            count++;
        }
        return count;
    }
}
