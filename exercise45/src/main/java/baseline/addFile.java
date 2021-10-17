package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class addFile {

    String readFile(Scanner inputFile, ArrayList<String> list){
        //read the file
        while (inputFile.hasNext()){
            String fileInfo = inputFile.nextLine();
            list.add(fileInfo);
            System.out.print(list);
        }
        inputFile.close();

        return "File read";
    }
}
