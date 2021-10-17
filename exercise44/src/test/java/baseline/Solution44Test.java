package baseline;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Solution44Test {

    @Test
    void testingJsonReader(){
        JsonOpener jOpen = new JsonOpener();
        String product = "iPad";
        String actual = jOpen.JsonReader(product);
        String expected = "Sorry, that product was not found in our inventory\n";

        assertEquals(expected, actual);
    }

}