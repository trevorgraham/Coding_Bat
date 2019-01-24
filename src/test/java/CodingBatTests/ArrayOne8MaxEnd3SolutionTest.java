package CodingBatTests;

import arrayOne8MaxEnd3.ArrayOne8MaxEnd3Solution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by trevorgraham on 18/07/2017.
 * Given an array of ints length 3, figure out which is larger, the first or last element in the array,
 * and set all the other elements to be that value. Return the changed array.

 maxEnd3([1, 2, 3]) → [3, 3, 3]
 maxEnd3([11, 5, 9]) → [11, 11, 11]
 maxEnd3([2, 11, 3]) → [3, 3, 3]
 */
public class ArrayOne8MaxEnd3SolutionTest {
    ArrayOne8MaxEnd3Solution calc = new ArrayOne8MaxEnd3Solution();
    int [] array123 ={1,2,3};
    int [] array333 ={3,3,3};
    int [] array1159 ={11,5,9};
    int [] array111111 ={11,11,11};
    int [] array2113 ={2,11,3};


    @Test
    public void givenArray123ReturnArray333(){
        assertArrayEquals(array333, calc.maxEnd3(array123));
    }

    @Test
    public void givenArray1159ReturnArray111111(){
        assertArrayEquals(array111111, calc.maxEnd3(array1159));
    }

    @Test
    public void givenArray2113ReturnArray333(){
        assertArrayEquals(array333, calc.maxEnd3(array2113));
    }
}
