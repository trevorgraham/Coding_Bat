package CodingBatTests;

import mapTwo2WordLen.MapTwo2WordLenSolution;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 17/07/2017.
 * Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
 * and the value is that string's length.

 wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
 wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
 wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
 */
public class MapTwo2WordLenSolutionTest {
    MapTwo2WordLenSolution mapTest = new MapTwo2WordLenSolution();
    String [] arrayABBABB = {"a", "bb", "a", "bb"};
    String [] arrayThisAndThat = {"this", "and", "that", "and"};

    @Test
    public void givenArrayABBABBReturnMapBB2A1(){
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("bb",2);
        expected.put("a",1);

        assertEquals(expected, mapTest.wordLen(arrayABBABB));
    }

    @Test
    public void givenArrayThisandthatReturnMapThis4And3This4(){
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("that",4);
        expected.put("and",3);
        expected.put("this",4);

        assertEquals(expected, mapTest.wordLen(arrayThisAndThat));
    }
}
