package baseline;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonOpener {

    //pass in the string that has the product name
    String JsonReader(String product) {
        //initialize string value that will be returned
        String results = " ";
        //initialize class so mainCaller and findings can be applied
        Solution44 sol = new Solution44();

        JSONParser parser = new JSONParser();

        //put it into a try
        try {
            //direct the parser into the right file for reading
            Object obj = parser.parse(new FileReader("./data/exercise44_input.json"));

            //make json object to read the values
            JSONObject jsonObject = (JSONObject) obj;

            //read in the array from the file and assign it to a value, so it can be accessed
            JSONArray array = (JSONArray) jsonObject.get("products");

            //make a flag so that the program knows when to stop if they found the product name
            int flag = 0;

            for (Object subject : array) {

                JSONObject jObj = (JSONObject) subject;

                //as it goes through the list, get the name for comparison
                String itemName = (String) jObj.get("name");

                //compare the value with items on the list
                if (product.equalsIgnoreCase(itemName)) {
                    results = "Name: " + itemName + "\nPrice: " + jObj.get("price") + "\nQuantity: " + jObj.get("quantity");
                    System.out.print(results);

                    //change flag value to 1
                    flag = 1;
                }
            }

            //if flag is still zero, product not found
            if (flag == 0) {
                results = "Sorry, that product was not found in our inventory\n";
                System.out.print(results);

                //call main and have it loop until it finds a product on the list
                sol.mainCaller();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return results;
    }
}
