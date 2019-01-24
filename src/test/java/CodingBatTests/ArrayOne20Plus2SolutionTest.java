package CodingBatTests;

import arrayOne20PlusTwo.ArrayOne20PlusTwoSolution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by trevorgraham on 07/09/2017.
 * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

 plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
 plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
 plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */
public class ArrayOne20Plus2SolutionTest {
    ArrayOne20PlusTwoSolution calc = new ArrayOne20PlusTwoSolution();

    int [] array12 = {1,2};
    int [] array34 = {3,4};
    int [] array1234 = {1,2,3,4};

    @Test
    public void givenArray12AndArray34ReturnArray1234(){
        assertArrayEquals(array1234, calc.plusTwo(array12, array34));
    }
}
