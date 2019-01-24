package CodingBatTests;

import logicOne22LastDigit.LogicOne22LastDigitSolution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 12/09/2017.
 * Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.
 * Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

 lastDigit(23, 19, 13) → true
 lastDigit(23, 19, 12) → false
 lastDigit(23, 19, 3) → true
 */
public class LogicOne22LastDigitSolutionTest {

    LogicOne22LastDigitSolution calc = new LogicOne22LastDigitSolution();

    @Test
    public void givenInt23Int19Int13ReturnTrue(){
        assertTrue(calc.lastDigit(23,19, 13));
    }

    @Test
    public void givenInt23Int19Int12ReturnFalse(){
        assertFalse(calc.lastDigit(23,19, 12));
    }

    @Test
    public void givenInt23Int19Int3ReturnTrue(){
        assertTrue(calc.lastDigit(23, 19, 3));
    }
}
