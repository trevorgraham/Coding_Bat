package CodingBatTests;

import org.junit.Test;
import warmupTwo10Array123.WarmupTwo10Array123Solution;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by trevorgraham on 17/07/2017.
 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

 array123([1, 1, 2, 3, 1]) → true
 array123([1, 1, 2, 4, 1]) → false
 array123([1, 1, 2, 1, 2, 3]) → true

 */
public class WarmupTwo10Array123SolutionTest {
    WarmupTwo10Array123Solution calc = new WarmupTwo10Array123Solution();

    int array11231 [] = {1,1,2,3,1};
    int array11241 [] = {1,1,2,4,1};

    @Test
    public void givenArray11231ReturnTrue(){
        assertTrue(calc.array123(array11231));
    }

    @Test
    public void givenArray11241ReturnTrue(){
        assertFalse(calc.array123(array11241));
    }


}
