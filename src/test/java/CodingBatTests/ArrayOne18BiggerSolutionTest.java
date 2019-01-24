package CodingBatTests;

import arrayOne18BiggerTwo.ArrayOne18BiggerTwoSolution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by trevorgraham on 19/08/2017.
 * * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
 * Return the array which has the largest sum. In event of a tie, return a.

 biggerTwo([1, 2], [3, 4]) → [3, 4]
 biggerTwo([3, 4], [1, 2]) → [3, 4]
 biggerTwo([1, 1], [1, 2]) → [1, 2]
 */

public class ArrayOne18BiggerSolutionTest {

    ArrayOne18BiggerTwoSolution calc = new ArrayOne18BiggerTwoSolution();

    int [] array12={1,2};
    int [] array34={3,4};
    int [] array35={3,5};
    int [] array44={4,4};


    @Test
    public void givenArray12AndArray34ReturnArray34(){
        assertArrayEquals(array34, calc.biggerTwo(array12, array34));
    }

    @Test
    public void givenArray34AndArray12ReturnArray12(){
        assertArrayEquals(array34, calc.biggerTwo(array34, array12));
    }

    @Test
    public void givenArray35AndArray44ReturnArray35(){
        assertArrayEquals(array35, calc.biggerTwo(array35, array44));
    }
}
