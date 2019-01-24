package CodingBatTests;

import arrayOne10MiddleWay.ArrayOne10MiddleWaySolution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 01/08/2017.
 * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

 middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
 middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
 middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */
public class ArrayOne10MiddleWaySolutionTest {

    ArrayOne10MiddleWaySolution calc = new ArrayOne10MiddleWaySolution();
    int[] array123 = {1,2,3};
    int[] array456 = {4,5,6};
    int[] array25 = {2,5};
    int[] array777 = {7,7,7};
    int[] array380 = {3,8,0};
    int[] array78 = {7,8};

    @Test
    public void givenArray123AndArray456ReturnArray25(){
        assertArrayEquals(array25, calc.middleWay(array123, array456));
    }

    @Test
    public void givenArray777AndArray380ReturnArray78(){
        assertArrayEquals(array78, calc.middleWay(array777, array380));
    }
}
