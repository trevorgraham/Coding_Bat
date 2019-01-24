package CodingBatTests;

import MapOne8MapAB.MapOne8MapAB3Solution;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 04/07/2017.
 * Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map
 * (but not both), set the other to have that same value in the map.

 mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
 mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
 mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
 */
public class MapOne8MapAB3SolutionTest {
    private MapOne8MapAB3Solution testMap;

    @Before
    public void setup(){
        testMap = new MapOne8MapAB3Solution();
    }

    @Test
    public void givenMapAaaaCcakeReturnAaaaBaaaCcake(){
        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "aaa");
        map.put("c", "cake");

        Map<String, String> expected = new HashMap<String, String>();

        expected.put("a", "aaa");
        expected.put("b", "aaa");
        expected.put("c", "cake");

        assertEquals(expected, testMap.mapAB3(map));
    }

    @Test
    public void givenMapBbbbCcakeReturnAbbbBbbbCcake(){
        Map<String, String> map = new HashMap<String, String>();

        map.put("b", "bbb");
        map.put("c", "cake");

        Map<String, String> expected = new HashMap<String, String>();

        expected.put("a", "bbb");
        expected.put("b", "bbb");
        expected.put("c", "cake");

        assertEquals(expected, testMap.mapAB3(map));
    }

    @Test
    public void givenMapAaaaBbbbCcakeReturnAaaaBbbbCcake(){
        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "cake");

        Map<String, String> expected = new HashMap<String, String>();

        expected.put("a", "aaa");
        expected.put("b", "bbb");
        expected.put("c", "cake");

        assertEquals(expected, testMap.mapAB3(map));
    }
}
