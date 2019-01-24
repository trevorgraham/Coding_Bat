package CodingBatTests;

import arrayOne19MakeMiddle.ArrayOne19MakeMiddleSolution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by trevorgraham on 06/09/2017.
 * Given an array of ints of even length, return a new array length 2 containing the middle two elements
 * from the original array. The original array will be length 2 or more.

 makeMiddle([1, 2, 3, 4]) → [2, 3]
 makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
 makeMiddle([1, 2]) → [1, 2]
 */
public class ArrayOne19MakeMiddleSolutionTest {
    ArrayOne19MakeMiddleSolution calc = new ArrayOne19MakeMiddleSolution();
    int[] array1234 = {1,2,3,4};
    int [] array23 = {2,3};
    int [] array712349 = {7,1,2,3,4,9};

    @Test
    public void givenArray1234returnArray23(){
        assertArrayEquals(array23, calc.makeMiddle(array1234));
    }

    @Test
    public void givenArray712349returnArray23(){
        assertArrayEquals(array23, calc.makeMiddle(array712349));
    }

    @Test
    public void givenArray23returnArray23(){
        assertArrayEquals(array23, calc.makeMiddle(array23));
    }
}
