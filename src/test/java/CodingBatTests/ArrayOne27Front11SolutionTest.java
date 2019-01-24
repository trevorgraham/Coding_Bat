package CodingBatTests;

import arrayOne27Front11.ArrayOne27Front11Solution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by trevorgraham on 20/10/2017.
 * Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
 * If either array is length 0, ignore that array.


 front11([1, 2, 3], [7, 9, 8]) → [1, 7]
 front11([1], [2]) → [1, 2]
 front11([1, 7], []) → [1]
 */
public class ArrayOne27Front11SolutionTest {
    ArrayOne27Front11Solution calc = new ArrayOne27Front11Solution();
    int [] array123 = {1,2,3};
    int [] array789 = {7,8,9};
    int [] array17 = {1,7};
    int [] array1 ={1};
    int [] array2 ={2};
    int [] array12 ={1,2};
    int [] arrayEmpty ={};


    @Test
    public void givenArray123AndArray789ReturnArray17(){
        assertArrayEquals(array17, calc.front11(array123, array789));
    }

    @Test
    public void givenArray1AndArray2ReturnArray1(){
        assertArrayEquals(array12, calc.front11(array1, array2));
    }

    @Test
    public void givenArray17AndArrayEmptyReturnArray1(){
        assertArrayEquals(array1, calc.front11(array17, arrayEmpty));
    }
}
