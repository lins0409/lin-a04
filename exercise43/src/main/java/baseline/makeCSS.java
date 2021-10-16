package baseline;

import java.io.File;

public class makeCSS {
    //pass in the bool
    String createCSSFile(boolean status, String name, String path){
        String directory = path + name + "/css/";
        //if the bool is true, have the program create a new file in the directory
        if(status){
            File newFile = new File(directory);

            //make the folder
            newFile.mkdirs();
        }
        return "Created " + directory;
    }
}
