package CodingBatTests;

import arrayTwo5Sum67.ArrayTwo5Sum67Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 19/07/2017.
 * Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending
 * to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

 sum67([1, 2, 2]) → 5
 sum67([1, 2, 2, 6, 99, 99, 7]) → 5
 sum67([1, 1, 6, 7, 2]) → 4

 *
 */
public class ArrayTwo5Sum67SolutionTest {
    ArrayTwo5Sum67Solution calc = new ArrayTwo5Sum67Solution();

    int [] array122 ={1,2,2};
    int [] array122699997 = {1,2,2,6,99,99,7};
    int [] array11672 ={1,1,6,7,2};

    @Test
    public void givenArray122Return5(){
        assertEquals(5, calc.sum67(array122));
    }

    @Test
    public void givenArray122699997Return5(){
        assertEquals(5, calc.sum67(array122699997));
    }

    @Test
    public void givenArray11672Return5(){
        assertEquals(4, calc.sum67(array11672));
    }
}
