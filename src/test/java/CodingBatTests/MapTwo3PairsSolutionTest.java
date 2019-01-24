package CodingBatTests;

import mapTwo3Pairs.MapTwo3PairsSolution;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 17/07/2017.
 * Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its
 * first character as a key with its last character as the value.

 pairs(["code", "bug"]) → {"b": "g", "c": "e"}
 pairs(["man", "moon", "main"]) → {"m": "n"}
 pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

 */
public class MapTwo3PairsSolutionTest {
    MapTwo3PairsSolution mapTest = new MapTwo3PairsSolution();
    String [] arrayCodeBug = {"code", "bug"};
    String [] arrayManMoonMain = {"man", "moon", "main"};

    @Test
    public void givenArrayCodeBugReturnMapBGCE(){
        Map<String, String> expected = new HashMap<String, String>();
        expected.put("b", "g");
        expected.put("c", "e");
        assertEquals(expected, mapTest.pairs(arrayCodeBug));

    }

    @Test
    public void givenArrayManMoonMainReturnMapMN(){
        Map<String, String> expected = new HashMap<String, String>();
        expected.put("m", "n");
        assertEquals(expected, mapTest.pairs(arrayManMoonMain));

    }
}
