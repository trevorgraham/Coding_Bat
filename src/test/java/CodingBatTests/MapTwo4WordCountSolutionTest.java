package CodingBatTests;

import mapTwo4WordCount.MapTwo4WordCountSolution;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 17/07/2017.
 * The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each
 * different string, with the value the number of times that string appears in the array.

 wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
 wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
 wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */
public class MapTwo4WordCountSolutionTest {
    MapTwo4WordCountSolution mapTest = new MapTwo4WordCountSolution();

    String [] arrayABACB = {"a", "b", "a", "c", "b"};
    String [] arrayCBA = {"c", "b", "a"};
    String [] arrayCCCC = {"c", "c", "c", "c"};

    @Test
    public void givenArrayABACBReturnMapA2B2C1(){

        Map<String, Integer> expected = new HashMap<String,Integer>();
        expected.put("a", 2);
        expected.put("b", 2);
        expected.put("c", 1);

        assertEquals(expected, mapTest.wordCount(arrayABACB));
    }

    @Test
    public void givenArrayCBAReturnMapA1B1C1(){

        Map<String, Integer> expected = new HashMap<String,Integer>();
        expected.put("a", 1);
        expected.put("b", 1);
        expected.put("c", 1);

        assertEquals(expected, mapTest.wordCount(arrayCBA));
    }

    @Test
    public void givenArrayCCCCeturnMapC4(){

        Map<String, Integer> expected = new HashMap<String,Integer>();
        expected.put("c", 4);


        assertEquals(expected, mapTest.wordCount(arrayCCCC));
    }


}
