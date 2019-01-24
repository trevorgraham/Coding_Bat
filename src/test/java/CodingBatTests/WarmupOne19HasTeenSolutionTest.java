package CodingBatTests;

import org.junit.Test;
import warmupOne19HasTeen.WarmupOne19HasTeenSolution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 16/08/2017.
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1
 * or more of them are teen.

 hasTeen(13, 20, 10) → true
 hasTeen(20, 19, 10) → true
 hasTeen(20, 10, 13) → true
 */
public class WarmupOne19HasTeenSolutionTest {
    WarmupOne19HasTeenSolution calc = new WarmupOne19HasTeenSolution();

    @Test
    public void givenInt13Int20Int10ReturnTrue(){
        assertTrue(calc.hasTeen(13,20,10));
    }

    @Test
    public void givenInt12Int19Int10ReturnTrue(){
        assertFalse(calc.hasTeen(12,20,10));
    }

    @Test
    public void givenInt20Int19Int10ReturnTrue(){
        assertTrue(calc.hasTeen(20,19,10));
    }
}
