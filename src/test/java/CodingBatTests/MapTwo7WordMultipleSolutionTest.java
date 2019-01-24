package CodingBatTests;

import mapTwo7WordMultiple.MapTwo7WordMultipleSolution;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 12/09/2017.
 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and
 * its value is true if that string appears 2 or more times in the array.

 wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
 wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
 wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */
public class MapTwo7WordMultipleSolutionTest {

    MapTwo7WordMultipleSolution calc = new MapTwo7WordMultipleSolution();

    @Test
    public void givenArray1ReturnMap1(){
        String [] array1 = {"a", "b", "a", "c", "b"};

        Map<String, Boolean> expected = new HashMap<String, Boolean>();
        expected.put("a", true);
        expected.put("b", true);
        expected.put("c", false);

        assertEquals(expected, calc.wordMultiple(array1));
    }

    @Test
    public void givenArray2ReturnMap2(){
        String [] array2 = {"c", "b", "a"};

        Map<String, Boolean> expected = new HashMap<String, Boolean>();
        expected.put("a", false);
        expected.put("b", false);
        expected.put("c", false);

        assertEquals(expected, calc.wordMultiple(array2));
    }

    @Test
    public void givenArray3ReturnMap3(){
        String [] array3 = {"c", "c", "c", "c"};

        Map<String, Boolean> expected = new HashMap<String, Boolean>();
        expected.put("c", true);

        assertEquals(expected, calc.wordMultiple(array3));
    }



}
