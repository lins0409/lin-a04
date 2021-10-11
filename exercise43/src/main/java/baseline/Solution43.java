/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Sue Lin
 */

package baseline;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/*
*Programming languages can create files and folders too.
*
*Create a program that generates a website skeleton with the following specifications:
**
*Prompt for the name of the site.
*Prompt for the author of the site.
*Ask if the user wants a folder for JavaScript files.
*Ask if the user wants a folder for CSS files.
*Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.
 */
public class Solution43 {
    //initialize scanner and Solution43 instance
    private static final Scanner scanner = new Scanner(System.in);
    public static final Solution43 sol = new Solution43();

    public static void main(String[] args) throws IOException {
        String filePath = "./data/";
        //initialize booleans
        boolean yesJavaScript;
        boolean yesCSS;

        //prompt user for name of the website
        System.out.print("Enter the name of the website: ");
        //scan it in and store the value
        String webName = scanner.nextLine();

        //prompt user to enter the author of the site
        System.out.print("Enter the author's name: ");
        //scan it in and store the value
        String author = scanner.nextLine();

        //ask the user if they want to create a JavaScript file
        System.out.print("Do you want a folder for JavaScript? Y/N ");
        //scan it in and store the value
        String createJavaScript = scanner.nextLine();
        //set the boolean to true or false depending on the value read in
        yesJavaScript = (Objects.equals(createJavaScript, "y")) || (Objects.equals(createJavaScript, "Y"));

        //ask if the user wants to create a folder for CSS files
        System.out.print("Do you want a folder for CSS? Y/N ");
        //set a boolean to true or false depending on the value
        String createCSS = scanner.nextLine();
        //scan it in and store the value
        yesCSS = (Objects.equals(createCSS, "y")) || (Objects.equals(createCSS, "Y"));

        //call the file creator function to create the file for the website
        sol.createSite(webName, filePath);
        System.out.println("Created " + filePath + webName);

        //call the function to create the html file
        sol.createHTML(webName, filePath, author);
        System.out.println("Created " + filePath + webName + "/index.html");

        //call function to create js folder
        sol.createJavaScriptFile(yesJavaScript, webName, filePath);
        System.out.println("Created " + filePath + webName +"/js/");

        //call function to create css folder
        sol.createCSSFile(yesCSS, webName, filePath);
        System.out.println("Created " + filePath + webName +"/css/");
    }

    void createSite(String name, String path){
        //create the directory
        String directory = path + name;
        File newFile = new File(directory);

        //actually makes the folder
        newFile.mkdirs();
    }

    //pass in the bool
    void createJavaScriptFile(boolean status, String name, String path){
        //if the bool is true, have the program create a new file in the directory
        if(status){
            //create the
            String directory = path + name + "/js";
            File newFile = new File(directory);

            //make the folder
            newFile.mkdirs();
        }
    }

    //pass in the bool
    void createCSSFile(boolean status, String name, String path){
        //if the bool is true, have the program create a new file in the directory
        if(status){
            String directory = path + name + "/css";
            File newFile = new File(directory);

            //make the folder
            newFile.mkdirs();
        }

    }

    //makes html file
    void createHTML(String name, String path, String author) throws IOException {
        String directory = path + name +"/index.html";
        //create a new file in the directory
        FileWriter HTMLWriter = new FileWriter(new File(directory));

        //write in all the elements of the website into the HTML file
        HTMLWriter.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
        HTMLWriter.write("\t<meta author=\"" + author + "\">\n");
        HTMLWriter.write("\t<title>" + name + "</title>\n");
        HTMLWriter.write("</head>\n<body>\n\n</body>\n</html>");

        //close the file so it actually outputs something
        HTMLWriter.close();
    }
}
