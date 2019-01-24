package CodingBatTests;

import arrayOne22MidThree.ArrayOne22MidThreeSolution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 17/10/2017.
 * Given an array of ints of odd length, return a new array length 3 containing the elements from
 * the middle of the array. The array length will be at least 3.


 midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
 midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
 midThree([1, 2, 3]) → [1, 2, 3]
 */
public class ArrayOne22MidThreeSolutionTest {
    ArrayOne22MidThreeSolution calc = new ArrayOne22MidThreeSolution();

    int[] array12345 ={1,2,3,4,5};
    int[] array234 = {2,3,4};
    int[] array8675309 ={8,6,7,5,3,0,9};
    int[] array753 = {7,5,3};
    int[] array123 = {1,2,3};

    @Test
    public void givenArray12345returnArray234(){
        assertArrayEquals(array234,calc.midThree(array12345));
    }

    @Test
    public void givenArray8675309returnArray753(){
        assertArrayEquals(array753,calc.midThree(array8675309));
    }

    @Test
    public void givenArray123returnArray123(){
        assertArrayEquals(array123,calc.midThree(array123));
    }
}
