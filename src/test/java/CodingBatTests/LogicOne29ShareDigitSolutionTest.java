package CodingBatTests;

/*
Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2
in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)


shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
 */

import logicOne29ShareDigit.LogicOne29ShareDigitSolution;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class LogicOne29ShareDigitSolutionTest {

    LogicOne29ShareDigitSolution calc = new LogicOne29ShareDigitSolution();

    @Test
    public void givenInt12AndInt23ReturnTrue(){
        assertTrue(calc.shareDigit(12,23));
    }

    @Test
    public void givenInt12Int43ReturnFalse(){
        assertFalse(calc.shareDigit(12,43));
    }

    @Test
    public void givenInt12AndInt32ReturnTrue(){
        assertTrue(calc.shareDigit(12,32));
    }
}
