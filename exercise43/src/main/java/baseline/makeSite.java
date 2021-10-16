package baseline;

import java.io.File;

public class makeSite {
    //pass in string name and path
    String createSite(String name, String path){
        //create the directory
        String directory = path + name;
        File newFile = new File(directory);

        //actually makes the folder
        newFile.mkdirs();

        return "Created " + directory;
    }
}
