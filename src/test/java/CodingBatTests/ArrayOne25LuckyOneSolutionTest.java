package CodingBatTests;

import arrayOne25LuckyOne.ArrayOne25LuckyOneSolution;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by trevorgraham on 19/10/2017.
 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky"
 * 1.Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.


 unlucky1([1, 3, 4, 5]) → true
 unlucky1([2, 1, 3, 4, 5]) → true
 unlucky1([1, 1, 1]) → false
 */
public class ArrayOne25LuckyOneSolutionTest {

    ArrayOne25LuckyOneSolution calc = new ArrayOne25LuckyOneSolution();

    int[] array1345 = {1,3,4,5};
    int[] array21345 = {2,1,3,4,5};
    int[] array111 = {1,1,1};
    int[] array22222213= {2,2,2,2,2,2,1,3};

    @Test
    public void givenArray1345ReturnTrue(){
        assertTrue(calc.luckyOne(array1345));
    }

    @Test
    public void givenArray21345ReturnTrue(){
        assertTrue(calc.luckyOne(array21345));
    }

    @Test
    public void givenArray111ReturnTrue(){
        assertFalse(calc.luckyOne(array111));
    }

    @Test
    public void givenArray22222213ReturnTrue(){
        assertTrue(calc.luckyOne(array22222213));
    }
}
