package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class Solution46Test {

    @Test
    void testingFileReader() throws FileNotFoundException {
        readFile rf = new readFile();
        HashMap<String, Integer> map = rf.readInput();

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("badger", 7);
        expected.put("mushroom", 2);
        expected.put("snake", 1);

        assertEquals(expected, map);
    }

    @Test
    void testingSorting() throws FileNotFoundException {
        Solution46 sol = new Solution46();
        readFile rf = new readFile();
        HashMap<String, Integer> map = rf.readInput();
        String[] tempKeys = sol.sortResults(map);

        String[] expected = {"badger", "mushroom", "snake"};

        assertArrayEquals(expected, tempKeys);
    }
}