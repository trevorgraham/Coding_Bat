package CodingBatTests;

import arrayOne4CommonEnd.ArrayOne4CommonEndSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 28/05/2017.
 * Given 2 arrays of ints, a and b, return true if they have the same first element
 * or they have the same last element. Both arrays will be length 1 or more.

 commonEnd([1, 2, 3], [7, 3]) → true
 commonEnd([1, 2, 3], [7, 3, 2]) → false
 commonEnd([1, 2, 3], [1, 3]) → true
 */
public class ArrayOne4CommonEndSolutionTest {

    int[] array123 = {1,2,3};
    int[] array73  = {7,3};
    int[] array732 = {7,3,2};
    int[] array13 = {1,3};

    ArrayOne4CommonEndSolution calc = new ArrayOne4CommonEndSolution();

    @Test
    public void givenTwoArrayBothEndingWithInt3ReturnTrue()
    {
        assertEquals(true,calc.commonEnd(array123, array73));
    }

    @Test
    public void givenTwoArrayBothEndingWithDifferentIntsReturnFalse()
    {
        assertFalse(calc.commonEnd(array123, array732));
    }

    @Test
    public void givenTwoArrayBothEndingWithInt1ReturnTrue()
    {
        assertTrue(calc.commonEnd(array123, array13));
    }

}
