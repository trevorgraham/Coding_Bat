package CodingBatTests;

import org.junit.Test;
import warmupOne8PosNeg.WarmupOne8PosNegSolution;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by trevorgraham on 14/07/2017.
 * Given 2 int values, return true if one is negative and one is positive. Except if the parameter
 * "negative" is true, then return true only if both are negative.

 posNeg(1, -1, false) → true
 posNeg(-1, 1, false) → true
 posNeg(-4, -5, true) → true
 */
public class WarmupOne8PosNegSolutionTest {

    WarmupOne8PosNegSolution calc = new WarmupOne8PosNegSolution();

    @Test
    public void given1andMinus1andFalseReturnTrue(){
        assertTrue(calc.posNeg(1,-1,false));
    }

    @Test
    public void givenminus1and1andFalseReturnTrue(){
        assertTrue(calc.posNeg(-1,1,false));
    }

    @Test
    public void givenMinus4andMinus5andTrueReturnTrue(){
        assertTrue(calc.posNeg(-4,-5,true));
    }
}
