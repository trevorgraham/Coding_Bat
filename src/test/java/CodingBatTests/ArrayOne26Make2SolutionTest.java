package CodingBatTests;

import arrayOne26Make2.ArrayOne26Make2Solution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by trevorgraham on 20/10/2017.
 * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
 * the elements from a followed by the elements from b. The arrays may be any length, including 0,
 * but there will be 2 or more elements available between the 2 arrays.


 make2([4, 5], [1, 2, 3]) → [4, 5]
 make2([4], [1, 2, 3]) → [4, 1]
 make2([], [1, 2]) → [1, 2]

 */
public class ArrayOne26Make2SolutionTest {
    ArrayOne26Make2Solution calc = new ArrayOne26Make2Solution();
    int[] array45 ={4,5};
    int [] array123 ={1,2,3};
    int [] array4 = {4};
    int [] array41 = {4,1};
    int [] arrayEmpty = {};
    int [] array12 = {1,2};

    @Test
    public void givenArray45AndArray123ReturnArray45(){
        assertArrayEquals(array45, calc.make2(array45, array123));
    }

    @Test
    public void givenArray4AndArray123ReturnArray41(){
        assertArrayEquals(array41,calc.make2(array4, array123));
    }

    @Test
    public void givenArrayEmptyAndArray12ReturnArray12(){
        assertArrayEquals(array12,calc.make2(arrayEmpty, array12));
    }
}
