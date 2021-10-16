package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {

    @Test
    void testAdding() throws FileNotFoundException {
        addEmployees emp = new addEmployees();
        ArrayList <String> names = new ArrayList<>();
        Scanner inputFile = new Scanner(new File("./data/exercise42_input.txt"));
        ArrayList<String> actual = emp.addToList(inputFile, names);

        ArrayList <String> expected = new ArrayList<>();
        expected.add("Ling,Mai,55900");
        expected.add("Johnson,Jim,56500");
        expected.add("Jones,Aaron,46000");
        expected.add("Jones,Chris,34500");
        expected.add("Swift,Geoffrey,14200");
        expected.add("Xiong,Fong,65000");
        expected.add("Zarnecki,Sabrina,51500");

        assertEquals(expected, actual);
    }
}