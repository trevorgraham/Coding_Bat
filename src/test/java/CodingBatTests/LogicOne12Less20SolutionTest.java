package CodingBatTests;

import logicOne12Less20.LogicOne12Less20Solution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 23/07/2017.
 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return
 * true, but 40 returns false. See also: Introduction to Mod

 less20(18) → true
 less20(19) → true
 less20(20) → false
 */
public class LogicOne12Less20SolutionTest {

    LogicOne12Less20Solution calc = new LogicOne12Less20Solution();

    @Test
    public void givenInt18ReturnTrue(){
        assertTrue(calc.less20(18));
    }

    @Test
    public void givenInt19ReturnTrue(){
        assertTrue(calc.less20(19));
    }

    @Test
    public void givenInt20ReturnFalse(){
        assertFalse(calc.less20(20));
    }

    @Test
    public void givenInt38ReturnTrue(){
        assertTrue(calc.less20(38));
    }
}
