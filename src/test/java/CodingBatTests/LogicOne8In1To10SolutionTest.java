package CodingBatTests;

import logicOne8In1To10.LogicOne8In1To10Solution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 10/07/2017.
 * Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true,
 * in which case return true if the number is less or equal to 1, or greater or equal to 10.

 in1To10(5, false) → true
 in1To10(11, false) → false
 in1To10(11, true) → true
 */
public class LogicOne8In1To10SolutionTest {
    LogicOne8In1To10Solution calc = new LogicOne8In1To10Solution();

    @Test
    public void given5andFalseReturnTrue(){
        assertTrue(calc.in1To10(5,false));
    }

    @Test
    public void given11andFalseReturnFalse(){
        assertFalse(calc.in1To10(11,false));
    }

    @Test
    public void given11andTrueReturnTrue(){
        assertTrue(calc.in1To10(11,true));
    }

    @Test
    public void given0andTrueReturnTrue(){
        assertTrue(calc.in1To10(0,true));
    }
}
