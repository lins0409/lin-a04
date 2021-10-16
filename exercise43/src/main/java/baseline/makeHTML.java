package baseline;

import java.io.FileWriter;
import java.io.IOException;

public class makeHTML {
    //makes html file
    String createHTML(String name, String path, String author) throws IOException {
        String directory = path + name +"/index.html";
        //create a new file in the directory
        FileWriter HTMLWriter = new FileWriter(directory);

        //write in all the elements of the website into the HTML file
        HTMLWriter.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
        HTMLWriter.write("\t<meta author=\"" + author + "\">\n");
        HTMLWriter.write("\t<title>" + name + "</title>\n");
        HTMLWriter.write("</head>\n<body>\n\n</body>\n</html>");

        //close the file so it actually outputs something
        HTMLWriter.close();
        return "Created " + directory;
    }
}
