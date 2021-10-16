package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class addEmployees {

    ArrayList<String> addToList(Scanner inputFile, ArrayList<String> names){
        while (inputFile.hasNextLine()) {
            names.add(inputFile.nextLine());
        }
        return names;
    }
}
