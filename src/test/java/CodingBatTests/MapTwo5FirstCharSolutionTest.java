package CodingBatTests;

import mapTwo5FirstChar.MapTwo5FirstCharSolution;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 19/07/2017.
 * Given an array of non-empty strings, return a Map<String, String> with a key for every different first character
 * seen, with the value of all the strings starting with that character appended together in the order they appear
 * in the array.

 firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
 firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
 firstChar([]) → {}
 */
public class MapTwo5FirstCharSolutionTest {
    MapTwo5FirstCharSolution calc = new MapTwo5FirstCharSolution();

    @Test
    public void givenArray1RetunMap1(){
        String [] array1 = {"salt","tea","soda","toast"};

        Map<String, String> expected = new HashMap<String, String>();

        expected.put("s", "saltsoda");
        expected.put("t", "teatoast");

        assertEquals(expected, calc.firstChar(array1));

    }

    @Test
    public void givenArray2RetunMap2(){
        String [] array2 = {"aa","bb","cc","aAA","cCC","d"};

        Map<String, String> expected = new HashMap<String, String>();

        expected.put("a", "aaaAA");
        expected.put("b", "bb");
        expected.put("c", "cccCC");
        expected.put("d", "d");

        assertEquals(expected, calc.firstChar(array2));

    }
}
