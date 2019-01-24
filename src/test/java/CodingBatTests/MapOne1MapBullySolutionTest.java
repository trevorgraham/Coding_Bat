package CodingBatTests;

import mapOne1MapBully.MapOne1MapBullySolution;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 12/06/2017.
 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
 * and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with
 * the empty string.

 mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
 mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
 mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */
public class MapOne1MapBullySolutionTest {
    private MapOne1MapBullySolution mapTest;

    @Before
    public void setup(){
        mapTest = new MapOne1MapBullySolution();



    }

    @Test
    public void mapBully() throws Exception{
        Map<String, String> map = new HashMap<>();
        map.put("a","Candy");
        map.put("b", "Dirt");

        Map<String, String> expected = new HashMap<>();
        expected.put("a","");
        expected.put("b","Candy");
        assertEquals(expected, mapTest.mapBully(map));
    }

}
