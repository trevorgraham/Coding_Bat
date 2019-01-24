package CodingBatTests;

import arrayOne12Has23.ArrayOne12Has23Solution;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by trevorgraham on 02/08/2017.
 * Given an int array length 2, return true if it contains a 2 or a 3.

 has23([2, 5]) → true
 has23([4, 3]) → true
 has23([4, 5]) → false
 */
public class ArrayOne12Has23SolutionTest {
    ArrayOne12Has23Solution calc = new ArrayOne12Has23Solution();

    int[] array25 = {2,5};
    int[] array43 = {4,3};
    int[] array45 = {4,5};

    @Test
    public void givenArray25ReturnTrue(){
        assertTrue(calc.has23(array25));
    }

    @Test
    public void givenArray43ReturnTrue(){
        assertTrue(calc.has23(array43));
    }

    @Test
    public void givenArray45ReturnFalse(){
        assertFalse(calc.has23(array45));
    }
}
