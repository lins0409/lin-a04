package baseline;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class writeFile {
    String writeNewOutput(ArrayList<String> list, String fileName) throws IOException {
        //direct the output file to the correct location and make sure it is names properly
        FileWriter fileWriter = new FileWriter("./data/" + fileName);
        int i;

        //make a loop so that as long as it is not the end of the file it will find all instances where the word utilized is called, and replace it with use.
        for (i = 0; i < list.size(); i++){
            String tempList = list.get(i);

            //replace the words
            tempList = tempList.replaceAll("utilize", "use");
            fileWriter.write(tempList+ "\n");
        }
        //close file
        fileWriter.close();

        return "File printed";
    }
}
