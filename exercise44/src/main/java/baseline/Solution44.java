/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Sue Lin
 */

package baseline;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

/*
*Pulling data from a file into a complex data structure makes parsing much simpler. Many programming languages support the JSON format, a popular way of representing data.
*
*Create a program that takes a product name as input and retrieves the current price and quantity for that product. The product data is in a data file in the JSON format  and looks like this
*
 */
public class Solution44 {

    public static void main (String[] args){
        //import scanner
        Scanner scanner = new Scanner(System.in);
        //initialize instance of Solution 44 class
        Solution44 sol = new Solution44();

        //prompt user for the product name
        System.out.print("What is the product name? ");
        //save the name in a string
        String product = scanner.nextLine();

        //call a function to find the object in the json file
        String findings = sol.JsonReader(product);
        System.out.print(findings);

        if(Objects.equals(findings, "Sorry, that product was not found in our inventory.\n")){
            sol.mainCaller();
        }
        else {
            System.exit(0);
        }
    }

    void mainCaller (){
        main(null);
    }

    //pass in the string that has the saved name
    String JsonReader(String product){
        String results = " ";

        //put it into a try
        try {
            //direct the parser into the right file
            Object obj = JsonParser.parseReader(new FileReader("./data/exercise44_input.json"));
            //create JSONObject to get the file
            JsonObject jsonObj = (JsonObject) obj;
            JsonArray items = (JsonArray) jsonObj.get("products");

            //create an iterator for looping
            Iterator<JsonElement> iterator = items.iterator();

            while (iterator.hasNext()) {
                JsonObject object = (JsonObject) iterator.next();
                String productName = object.get("name").toString();

                //loop until the name matches or until it reaches the end of the file and can't find it
                if (product.equalsIgnoreCase(productName)) {
                    //if the item exists, print out the name, price, and quantity
                    results = "Name: " + productName + "\nPrice: " + jsonObj.get("price") + "\nQuantity: " + jsonObj.get("quantity");
                } else {
                    //if the item isn't on the list, print out that it doesn't exist
                    results = "Sorry, that product was not found in our inventory.\n";
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        return results;
    }
}
