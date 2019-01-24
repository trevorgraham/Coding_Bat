package CodingBatTests;

import MapTwo6WordAppend.MapTwo6WordAppendSolution;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by trevorgraham on 23/07/2017.
 * Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th,
 * etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.

 wordAppend(["a", "b", "a"]) → "a"
 wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
 wordAppend(["a", "", "a"]) → "a"

 */
public class MapTwo6WordAppendSolutionTest {
    MapTwo6WordAppendSolution calc = new MapTwo6WordAppendSolution();
    String [] arrayABA = {"a", "b", "a"};

    @Test
    public void givenArrayABAreturnA(){
        assertEquals("a", calc.wordAppend(arrayABA));
    }
}
