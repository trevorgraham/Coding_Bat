package CodingBatTests;

import arrayOne14MakeLast.ArrayOne14MakeLastSolution;
import arrayOne15Double23.ArrayOne15Double23Solution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 02/08/2017.
 * Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

 double23([2, 2]) → true
 double23([3, 3]) → true
 double23([2, 3]) → false

 */
public class ArrayOne15Double23SolutionTest {
    ArrayOne15Double23Solution calc = new ArrayOne15Double23Solution();
    int[] array22 = {2,2};
    int[] array33 = {3,3};
    int[] array23 = {2,3};

    @Test
    public void givenArray22(){
        assertTrue(calc.double23(array22));
    }

    @Test
    public void givenArray33(){
        assertTrue(calc.double23(array33));
    }

    @Test
    public void givenArray23(){
        assertFalse(calc.double23(array23));
    }


}
