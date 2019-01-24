package CodingBatTests;

import arrayOne21SwapEnds.ArrayOne21SwapEndsSolution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by trevorgraham on 07/09/2017.
 * Given an array of ints, swap the first and last elements in the array. Return the modified array.
 * The array length will be at least 1.

 swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
 swapEnds([1, 2, 3]) → [3, 2, 1]
 swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */
public class ArrayOne21SwapEndsSolutionTest {

    ArrayOne21SwapEndsSolution calc = new ArrayOne21SwapEndsSolution();

    int [] array1234 = {1,2,3,4};
    int [] array4231 = {4,2,3,1};
    int [] array123 = {1,2,3};
    int [] array321 = {3,2,1};
    int [] array86795 = {8,6,7,9,5};
    int [] array56798 = {5,6,7,9,8};

    @Test
    public void givenArray1234ReturnArray4231(){
        assertArrayEquals(array4231, calc.swapEnds(array1234));
    }

    @Test
    public void givenArray123ReturnArray321(){
        assertArrayEquals(array321, calc.swapEnds(array123));
    }

    @Test
    public void givenArray86795ReturnArray56798(){
        assertArrayEquals(array86795, calc.swapEnds(array56798));
    }

}
