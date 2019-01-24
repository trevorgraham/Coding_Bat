package CodingBatTests;

import logicOne9Special11.LogicOne9Special11Solution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 10/07/2017.
 * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
 * Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod

 specialEleven(22) → true
 specialEleven(23) → true
 specialEleven(24) → false
 */
public class LogicOne9SpecialElevenSolutionTest {
    LogicOne9Special11Solution calc = new LogicOne9Special11Solution();

    @Test
    public void given22ReturnTrue(){
        assertTrue(calc.specialEleven(22));
    }

    @Test
    public void given23ReturnTrue(){
        assertTrue(calc.specialEleven(23));
    }

    @Test
    public void given24ReturnFalse(){
        assertFalse(calc.specialEleven(24));
    }




}
