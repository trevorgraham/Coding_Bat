package CodingBatTests;

import arrayOne23MaxTriple.ArrayOne23MaxTripleSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 17/10/2017.
 * Given an array of ints of odd length, look at the first, last, and middle values in the array
 * and return the largest. The array length will be a least 1.


 maxTriple([1, 2, 3]) → 3
 maxTriple([1, 5, 3]) → 5
 maxTriple([5, 2, 3]) → 5

 */
public class ArrayOne23MaxTripleSolutionTest {
    ArrayOne23MaxTripleSolution calc = new ArrayOne23MaxTripleSolution();

    int[] array123 = {1,2,3};
    int[] array153 = {1,5,3};
    int[] array12345 = {1,2,3,4,5};

    @Test
    public void givenArray123ReturnInt3(){
        assertEquals(3,calc.maxTriple(array123));
    }

    @Test
    public void givenArray153ReturnInt5(){
        assertEquals(5,calc.maxTriple(array153));
    }

    @Test
    public void givenArray12345ReturnInt5(){
        assertEquals(5,calc.maxTriple(array12345));
    }
}
