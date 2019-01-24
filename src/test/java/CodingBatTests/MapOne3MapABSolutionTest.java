package CodingBatTests;

import mapOne3MapAB.MapOne3MapABSolution;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 13/06/2017.
 * Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
 * If both keys are present, append their 2 string values together and store the result under the key "ab".

 mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
 mapAB({"a": "Hi"}) → {"a": "Hi"}
 mapAB({"b": "There"}) → {"b": "There"}
 */
public class MapOne3MapABSolutionTest {
    private MapOne3MapABSolution mapTest;

    @Before
    public void setup(){
        mapTest = new MapOne3MapABSolution();
    }

    @Test
    public void givenAMapHiThereReturnHiHiThereThere(){
        Map<String, String> map = new HashMap<>();
        map.put("a","Hi");
        map.put("b","There");

        Map<String, String> expected = new HashMap<>();
        expected.put("a","Hi");
        expected.put("ab","HiThere");
        expected.put("b","There");

        assertEquals(expected, mapTest.mapAB(map) );
    }

    @Test
    public void givenAMapHiReturnMapHi(){
        Map<String, String> map = new HashMap<>();
        map.put("a","Hi");

        Map<String, String> expected = new HashMap<>();
        expected.put("a","Hi");

        assertEquals(expected, mapTest.mapAB(map) );
    }

    @Test
    public void givenAMapThereReturnMapThere(){
        Map<String, String> map = new HashMap<>();
        map.put("b","There");

        Map<String, String> expected = new HashMap<>();
        expected.put("b","There");

        assertEquals(expected, mapTest.mapAB(map) );
    }
}
