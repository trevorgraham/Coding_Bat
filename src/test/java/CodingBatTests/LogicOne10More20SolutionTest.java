package CodingBatTests;

import logicOne10More20.LogicOne10More20Solution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 18/07/2017.
 * Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod

 more20(20) → false
 more20(21) → true
 more20(22) → true
 */


public class LogicOne10More20SolutionTest {
    LogicOne10More20Solution calc = new LogicOne10More20Solution();

    @Test
    public void given20returnFalse(){
        assertFalse(calc.more20(20));
    }

    @Test
    public void given21returnTrue(){
        assertTrue(calc.more20(21));
    }

    @Test
    public void given30returnFalse(){
        assertFalse(calc.more20(30));
    }

}
