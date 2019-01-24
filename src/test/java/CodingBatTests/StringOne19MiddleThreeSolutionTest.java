package CodingBatTests;

import org.junit.Test;
import stringOne19MiddleThree.StringOne19MiddleThreeSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 07/08/2017.
 * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
 * The string length will be at least 3.

 middleThree("Candy") → "and"
 middleThree("and") → "and"
 middleThree("solving") → "lvi"
 */
public class StringOne19MiddleThreeSolutionTest {
    StringOne19MiddleThreeSolution calc = new StringOne19MiddleThreeSolution();

    @Test
    public void givenStringCandyReturnStringAnd(){
        assertEquals("and", calc.middleThree("Candy"));
    }

    @Test
    public void givenStringAndyReturnStringAnd(){
        assertEquals("and", calc.middleThree("and"));
    }

    @Test
    public void givenStringSolvingReturnStringlvi(){
        assertEquals("lvi", calc.middleThree("solving"));
    }
}
