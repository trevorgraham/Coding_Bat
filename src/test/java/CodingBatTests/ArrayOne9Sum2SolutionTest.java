package CodingBatTests;

import arrayOne9Sum2.ArrayOne9Sum2Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 18/07/2017.
 * Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2,
 * just sum up the elements that exist, returning 0 if the array is length 0.

 sum2([1, 2, 3]) → 3
 sum2([1, 1]) → 2
 sum2([1, 1, 1, 1]) → 2

 */
public class ArrayOne9Sum2SolutionTest {

    ArrayOne9Sum2Solution calc = new ArrayOne9Sum2Solution();

    int [] array123 = {1,2,3};
    int [] array11 = {1,1};
    int [] array1111 = {1,1,1,1};

    @Test
    public void givenArray123Return3(){
        assertEquals(3, calc.sum2(array123));
    }

    @Test
    public void givenArray11Return2(){
        assertEquals(2, calc.sum2(array11));
    }

    @Test
    public void givenArray1111Return2(){
        assertEquals(2, calc.sum2(array11));
    }



}
