package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {
    @Test
    void testAdding() throws FileNotFoundException {
        addingNames add = new addingNames();
        Scanner inputFile = new Scanner(new File("./data/exercise41_input.txt"));
        ArrayList<String> names = new ArrayList<>();
        int expected = 7;
        int count = 0;
        int actual = add.nameAdder(names, inputFile, count);

        assertEquals(expected, actual);
    }

    @Test
    void testingSort(){
        Solution41 sol = new Solution41();
        ArrayList <String> names = new ArrayList<>();
        names.add("Ling, Mai");
        names.add("Johnson, Jim");
        names.add("Zarnecki, Sabrina");
        ArrayList<String> actual = sol.nameSorter(names);

        ArrayList <String> tester = new ArrayList<>();
        tester.add("Johnson, Jim");
        tester.add("Ling, Mai");
        tester.add("Zarnecki, Sabrina");

        assertEquals(tester, actual);
    }
}