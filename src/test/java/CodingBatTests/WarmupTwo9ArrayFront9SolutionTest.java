package CodingBatTests;

import org.junit.Test;
import warmupTwo9arrayFront9.WarmupTwo9ArrayFront9Solution;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by trevorgraham on 17/07/2017.
 * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length
 * may be less than 4.

 arrayFront9([1, 2, 9, 3, 4]) → true
 arrayFront9([1, 2, 3, 4, 9]) → false
 arrayFront9([1, 2, 3, 4, 5]) → false
 */
public class WarmupTwo9ArrayFront9SolutionTest {
    WarmupTwo9ArrayFront9Solution calc = new WarmupTwo9ArrayFront9Solution();
    int array12934 []= {1,2,9,3,4};
    int array12349 []= {1,2,3,4,9};
    int array12345 []= {1,2,3,4,5};
    int array129[]= {1,2,9};
    int array123[]= {1,2,3};

    @Test
    public void givenArray12934ReturnTrue(){
        assertTrue(calc.arrayFront9(array12934));
    }

    @Test
    public void givenArray12349ReturnFalse(){
        assertFalse(calc.arrayFront9(array12349));
    }

    @Test
    public void givenArray12345ReturnFalse(){
        assertFalse(calc.arrayFront9(array12345));
    }

    @Test
    public void givenArray129ReturnTrue(){
        assertTrue(calc.arrayFront9(array129));
    }

    @Test
    public void givenArray123ReturnFalse(){
        assertFalse(calc.arrayFront9(array123));
    }
}
