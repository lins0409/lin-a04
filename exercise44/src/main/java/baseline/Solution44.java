/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Sue Lin
 */

package baseline;

import java.util.Scanner;

/*
*Pulling data from a file into a complex data structure makes parsing much simpler. Many programming languages support the JSON format, a popular way of representing data.
*
*Create a program that takes a product name as input and retrieves the current price and quantity for that product. The product data is in a data file in the JSON format  and looks like this
*
 */
public class Solution44 {

    public static void main(String[] args) {
        //initialize instance of JsonOpener class and import Scanner
        JsonOpener jOpen = new JsonOpener();
        Scanner scanner = new Scanner(System.in);

        //prompt user for the product name
        System.out.print("What is the product name? ");
        String product = scanner.nextLine();

        //run it through the JSON reader
        jOpen.JsonReader(product);
    }

    //call it to repeat until it makes the program exit
    void mainCaller() {
        main(null);
    }


}
