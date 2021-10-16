/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Sue Lin
 */

package baseline;
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

    public static void main(String[] args) throws IOException {
        //initialize scanner
        Scanner scanner = new Scanner(System.in);
        String filePath = "./data/website/";
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
        makeSite ms = new makeSite();
        String file = ms.createSite(webName, filePath);
        System.out.println(file);

        //call the function to create the html file
        makeHTML mhtml = new makeHTML();
        String html = mhtml.createHTML(webName, filePath, author);
        System.out.println(html);

        //call function to create js folder
        makeJava mj = new makeJava();
        String java = mj.createJavaScriptFile(yesJavaScript, webName, filePath);
        System.out.println(java);

        //call function to create css folder
        makeCSS mcss = new makeCSS();
        String css = mcss.createCSSFile(yesCSS, webName, filePath);
        System.out.println(css);
    }
}
