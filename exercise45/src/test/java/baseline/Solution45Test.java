package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution45Test {

    @Test
    void testReading() throws FileNotFoundException {
        addFile af = new addFile();

        Scanner inputFile = new Scanner(new File("./data/exercise45_input.txt"));
        ArrayList <String> list = new ArrayList<>();

        String actual = af.readFile(inputFile, list);
        String expected = "File read";

        assertEquals(expected, actual);
    }

    @Test
    void testWriting() throws IOException {
        writeFile wf = new writeFile();

        ArrayList <String> list = new ArrayList<>();

        String outputFileName = "exercise45_output.txt";

        String actual = wf.writeNewOutput(list, outputFileName);
        String expected = "File printed";

        assertEquals(expected, actual);
    }
}