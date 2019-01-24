package CodingBatTests;

import arrayOne11MakeEnds.ArrayOne11MakeEndsSolution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by trevorgraham on 01/08/2017.
 * Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
 * The original array will be length 1 or more.

 makeEnds([1, 2, 3]) → [1, 3]
 makeEnds([1, 2, 3, 4]) → [1, 4]
 makeEnds([7, 4, 6, 2]) → [7, 2]

 */
public class ArrayOne11MakeEndsSolutionTest {

    ArrayOne11MakeEndsSolution calc = new ArrayOne11MakeEndsSolution();

    int[] array123 = {1,2,3};
    int[] array13 = {1,3};
    int[] array1234 = {1,2,3,4};
    int[] array14 = {1,4};

    @Test
    public void givenArray123ReturnArray13(){
        assertArrayEquals(array13, calc.makeEnds(array123));
    }

    @Test
    public void givenArray1234ReturnArray14(){
        assertArrayEquals(array14, calc.makeEnds(array1234));
    }

}
