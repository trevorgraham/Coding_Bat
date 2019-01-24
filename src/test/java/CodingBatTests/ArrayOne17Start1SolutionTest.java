package CodingBatTests;

import arrayOne17Start1.ArrayOne17Start1Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 19/08/2017.
 * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

 start1([1, 2, 3], [1, 3]) → 2
 start1([7, 2, 3], [1]) → 1
 start1([1, 2], []) → 1
 */
public class ArrayOne17Start1SolutionTest {

    int[] array123 ={1,2,3};
    int[] array13 ={1,3};
    int[] array723 = {7,2,3};
    int[] array1 = {1};
    int[] array12 = {1,2};
    int[] emptyArray={};

    ArrayOne17Start1Solution calc = new ArrayOne17Start1Solution();

    @Test
    public void givenArray123AndArray13Return2(){
        assertEquals(2,calc.Start1(array123, array13));
    }

    @Test
    public void givenArray723AndArray11Return1(){
        assertEquals(1,calc.Start1(array723, array1));
    }

    @Test
    public void givenArray12AndEmptyArrayReturn0(){
        assertEquals(1,calc.Start1(array12, emptyArray));
    }
}
