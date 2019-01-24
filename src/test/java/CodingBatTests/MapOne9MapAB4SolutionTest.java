package CodingBatTests;

import mapOne9MapAB4.MapOne9MapAB4Solution;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 19/07/2017.
 * Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
 * then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty
 * string in the map.

 mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
 mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
 mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
 */
public class MapOne9MapAB4SolutionTest {
    MapOne9MapAB4Solution calc = new MapOne9MapAB4Solution();



    @Test
    public void givenMapAaaBbCakeReturnAaaBbAaa(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("a", "aaa");
        map.put("b", "bb");
        map.put("c", "cake");

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("a" , "aaa");
        expected.put("b", "bb");
        expected.put("c", "aaa");

        assertEquals(expected, calc.mapAB4(map));

    }

    @Test
    public void givenMapAaBbbCakeReturnAaBbbBbb(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("a", "aa");
        map.put("b", "bbb");
        map.put("c", "cake");

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("a" , "aa");
        expected.put("b", "bbb");
        expected.put("c", "bbb");

        assertEquals(expected, calc.mapAB4(map));

    }
}
