package CodingBatTests;

import StringOne15MiddleTwo.StringOne15MiddleTwoSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 14/07/2017.
 * Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
 * The string length will be at least 2.

 middleTwo("string") → "ri"
 middleTwo("code") → "od"
 middleTwo("Practice") → "ct"
 */
public class StringOne15MiddleTwoSolutionTest {

    StringOne15MiddleTwoSolution calc = new StringOne15MiddleTwoSolution();

    @Test
    public void givenStringStringReturnStringRi(){
        assertEquals("ri", calc.middleTwo("String"));
    }

    @Test
    public void givenStringCodeReturnStringOd(){
        assertEquals("od", calc.middleTwo("Code"));
    }

    @Test
    public void givenStringPracticeReturnStringct(){
        assertEquals("ct", calc.middleTwo("Practice"));
    }
}
