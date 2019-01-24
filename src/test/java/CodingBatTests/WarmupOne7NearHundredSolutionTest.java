package CodingBatTests;

import org.junit.Test;
import warmupOne7NearHundred.WarmupOne7NearHundredSolution;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by trevorgraham on 14/07/2017.
 * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num)
 * computes the absolute value of a number.

 nearHundred(93) → true
 nearHundred(90) → true
 nearHundred(89) → false
 */
public class WarmupOne7NearHundredSolutionTest {

    WarmupOne7NearHundredSolution calc = new WarmupOne7NearHundredSolution();

    @Test
    public void given93ReturnTrue(){
        assertTrue(calc.nearHundred(93));
    }

    @Test
    public void given90ReturnTrue(){
        assertTrue(calc.nearHundred(90));
    }

    @Test
    public void given89ReturnFalse(){
        assertFalse(calc.nearHundred(89));
    }

    @Test
    public void given193ReturnTrue(){
        assertTrue(calc.nearHundred(193));
    }

    @Test
    public void given210ReturnTrue(){
        assertTrue(calc.nearHundred(210));
    }

    @Test
    public void given150ReturnFalse(){
        assertFalse(calc.nearHundred(150));
    }

    @Test
    public void given211ReturnFalse(){
        assertFalse(calc.nearHundred(211));
    }
}
