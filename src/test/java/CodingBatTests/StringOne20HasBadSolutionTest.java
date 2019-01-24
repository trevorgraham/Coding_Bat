package CodingBatTests;

import org.junit.Test;
import stringOne20HasBad.StringOne20HasBadSolution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 07/08/2017.
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
 * with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals()
 * to compare 2 strings.

 hasBad("badxx") → true
 hasBad("xbadxx") → true
 hasBad("xxbadxx") → false
 */
public class StringOne20HasBadSolutionTest {
    StringOne20HasBadSolution calc = new StringOne20HasBadSolution();

    @Test
    public void givenStringBadxxReturnTrue(){
        assertTrue(calc.hasBad("badxx"));
    }

    @Test
    public void givenStringXbadxxReturnTrue(){
        assertTrue(calc.hasBad("xbadxx"));
    }

    @Test
    public void givenStringXxbadxxReturnFalse(){
        assertFalse(calc.hasBad("xxbadxx"));
    }

    @Test
    public void givenStringXxReturnFalse(){
        assertFalse(calc.hasBad("xx"));
    }
}
