package baseline;

import java.io.File;

public class makeJava {
    //pass in the bool
    String createJavaScriptFile(boolean status, String name, String path){
        String directory = path + name + "/js/";
        //if the bool is true, have the program create a new file in the directory
        if(status){
            //create the file
            //create the file
            File newFile = new File(directory);

            //make the folder
            newFile.mkdirs();
        }
        return "Created " + directory;
    }
}
