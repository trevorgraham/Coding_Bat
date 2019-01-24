package CodingBatTests;

import org.junit.Test;
import warmupTwo17Has271.WarmupTwo17Has271Solution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 11/09/2017.
 * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5,
 * followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less
 * from the correct value.

 has271([1, 2, 7, 1]) → true
 has271([1, 2, 8, 1]) → false
 has271([2, 7, 1]) → true
 */
public class WarmupTwo17Has271SolutionTest {
    WarmupTwo17Has271Solution calc = new WarmupTwo17Has271Solution();
    int [] array1271 = {1,2,7,1};
    int [] array1281 = {1,2,8,1};
    int [] array271 = {2,7,1};
    int [] array1273 = {1,2,7,3};

    @Test
    public void givenArray1271ReturnTrue(){
        assertTrue(calc.has271(array1271));
    }

    @Test
    public void givenArray1281ReturnFalse(){
        assertFalse(calc.has271(array1281));
    }

    @Test
    public void givenArray271ReturnTrue(){
        assertTrue(calc.has271(array271));
    }

    @Test
    public void givenArray1273ReturnTrue(){
        assertTrue(calc.has271(array1273));
    }


}
