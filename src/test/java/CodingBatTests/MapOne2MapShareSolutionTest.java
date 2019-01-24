package CodingBatTests;

import mapOne2MapShare.MapOne2MapShareSolution;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 13/06/2017.
 * * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
 * In all cases remove the key "c", leaving the rest of the map unchanged.

 mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
 mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
 mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 */
public class MapOne2MapShareSolutionTest {

    private MapOne2MapShareSolution mapTest;

    @Before
    public void setup(){
        mapTest = new MapOne2MapShareSolution();
    }

    @Test
    public void givenAMapAAABBBCCCReturnMAPAAAAAA(){
        Map<String, String>map = new HashMap<>();
        map.put("a","aaa");
        map.put("b","bbb");
        map.put("c","ccc");

        Map<String, String>expected = new HashMap<>();
        expected.put("a","aaa");
        expected.put("b","aaa");
        assertEquals(expected, mapTest.mapShare(map));
    }

    @Test
    public void givenAMapXYZCCCReturnXYZ(){
        Map<String, String>map = new HashMap<>();
        map.put("b","xyz");
        map.put("c","ccc");

        Map<String, String>expected = new HashMap<>();
        expected.put("b","xyz");
        assertEquals(expected, mapTest.mapShare(map));
    }

    @Test
    public void givenAMapAAAMEHHIReturnAAAAAAHI(){
        Map<String, String>map = new HashMap<>();
        map.put("a","aaa");
        map.put("c","meh");
        map.put("d","hi");

        Map<String, String>expected = new HashMap<>();
        expected.put("a", "aaa");
        expected.put("b","aaa");
        expected.put("d","hi");
        assertEquals(expected, mapTest.mapShare(map));
    }

}
