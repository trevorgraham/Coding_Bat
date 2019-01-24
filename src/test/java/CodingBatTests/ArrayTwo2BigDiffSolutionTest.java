package CodingBatTests;

import arrayTwo2BigDiff.ArrayTwo2BigDiffSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 18/07/2017.
 * Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
 * Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

 bigDiff([10, 3, 5, 6]) → 7
 bigDiff([7, 2, 10, 9]) → 8
 bigDiff([2, 10, 7, 2]) → 8
 */
public class ArrayTwo2BigDiffSolutionTest {
    ArrayTwo2BigDiffSolution calc = new ArrayTwo2BigDiffSolution();

    int [] array10356 = {10,3,5,6};
    int [] array72109 = {7,2,10,9};
    int [] array21072 = {2,10,7,2};

    @Test
    public void givenArray10356Return7(){
        assertEquals(7, calc.bigDiff(array10356));
    }

    @Test
    public void givenArray72109Return8(){
        assertEquals(8, calc.bigDiff(array72109));
    }

    @Test
    public void givenArray21072Return(){
        assertEquals(8, calc.bigDiff(array21072));
    }
}
