/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Sue Lin
 */

package baseline;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.util.Iterator;

/*
*Pulling data from a file into a complex data structure makes parsing much simpler. Many programming languages support the JSON format, a popular way of representing data.
*
*Create a program that takes a product name as input and retrieves the current price and quantity for that product. The product data is in a data file in the JSON format  and looks like this
*
 */
public class Solution44 {

    public static void main (String[] args) {
        //initialize instance of Solution 44 class
        Solution44 sol = new Solution44();

        sol.JsonReader();
    }

    //call it to repeat until it makes the program exit
    void mainCaller () throws IOException {
        main(null);
    }

    //pass in the string that has the saved name
    void JsonReader() {

    }
}
