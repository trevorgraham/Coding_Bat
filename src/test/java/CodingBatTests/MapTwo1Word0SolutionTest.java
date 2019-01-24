package CodingBatTests;

import mapTwo1Word0.MapTwo1Word0Solution;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 17/07/2017.
 * Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
 * always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting
 * later, but for this problem the value is simply 0.

 word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
 word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
 word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}



 */
public class MapTwo1Word0SolutionTest {
    private MapTwo1Word0Solution testMap;

    String [] arrayABAB = {"a", "b", "a" , "b"};
    String [] arrayABACB = {"a", "b", "a", "c", "a"};

    @Before
    public void setup(){
        testMap = new MapTwo1Word0Solution();

    }

    @Test
    public void givenArrayABABReturnMapA0B0(){
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("a",0);
        expected.put("b",0);

        assertEquals(expected, testMap.word0(arrayABAB));
    }

    @Test
    public void givenArrayABACBReturnMapA0B0C0(){
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("a",0);
        expected.put("b",0);
        expected.put("c",0);

        assertEquals(expected, testMap.word0(arrayABACB));
    }

}
