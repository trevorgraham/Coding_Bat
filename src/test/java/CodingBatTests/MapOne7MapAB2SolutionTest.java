package CodingBatTests;

import mapOne7MapAB2.MapOne7MapAB2Solution;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 03/07/2017.
 * Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values,
 * remove them both.

 mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
 mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
 mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
 */
public class MapOne7MapAB2SolutionTest {
    private MapOne7MapAB2Solution testMap;

    @Before
    public void setup (){
        testMap = new MapOne7MapAB2Solution();
    }

    @Test
    public void givenMapAaaaBaaaCcakeReturnCcake(){
        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("c","cake");

        Map<String, String> expected = new HashMap<String, String>();

        expected.put("c", "cake");

        assertEquals(expected, testMap.mapAB2(map));
    }

    @Test
    public void givenMapAaaaBbbbReturnAaaaBbbb(){
        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "aaa");
        map.put("b", "bbb");


        Map<String, String> expected = new HashMap<String, String>();

        expected.put("a", "aaa");
        expected.put("b", "bbb");


        assertEquals(expected, testMap.mapAB2(map));
    }
}
