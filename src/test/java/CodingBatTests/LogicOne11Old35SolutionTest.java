package CodingBatTests;

import logicOne11Old35.LogicOne11Old35Solution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 23/07/2017.
 * Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator
 * -- see Introduction to Mod

 old35(3) → true
 old35(10) → true
 old35(15) → false
 */
public class LogicOne11Old35SolutionTest {
    LogicOne11Old35Solution calc = new LogicOne11Old35Solution();

    @Test
    public void givenInt3ReturnTrue(){
        assertTrue(calc.old35(3));
    }

    @Test
    public void givenInt8ReturnFalse(){
        assertFalse(calc.old35(8));
    }

    @Test
    public void givenInt15ReturnFalse(){
        assertFalse(calc.old35(15));
    }
}
