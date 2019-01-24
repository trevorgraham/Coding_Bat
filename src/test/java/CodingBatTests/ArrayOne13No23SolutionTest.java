package CodingBatTests;

import arrayOne13No23.ArrayOne13No23Solution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 02/08/2017.
 * Given an int array length 2, return true if it does not contain a 2 or 3.

 no23([4, 5]) → true
 no23([4, 2]) → false
 no23([3, 5]) → false
 */
public class ArrayOne13No23SolutionTest {
    ArrayOne13No23Solution calc = new ArrayOne13No23Solution();

    int[] array45 ={4,5};
    int[] array42 ={4,2};
    int[] array35 ={3,5};

    @Test
    public void givenArray45ReturnTrue(){
        assertTrue(calc.no23(array45));
    }

    @Test
    public void givenArray42ReturnFalse(){
        assertFalse(calc.no23(array42));
    }

    @Test
    public void givenArray35returnFalse(){
        assertFalse(calc.no23(array35));
    }
}
