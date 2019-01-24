package CodingBatTests;

import org.junit.Before;
import org.junit.Test;
import stringOne6FirstTwo.StringOne6FirstTwoSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 13/06/2017.
 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
 * If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty
 * string "" yields the empty string "". Note that str.length() returns the length of a string.

 firstTwo("Hello") → "He"
 firstTwo("abcdefg") → "ab"
 firstTwo("ab") → "ab"
 */
public class StringOne6FirstTwoSolutionTest {
    private StringOne6FirstTwoSolution testString;

    @Before
    public void setup(){
        testString = new StringOne6FirstTwoSolution();
    }

    @Test
    public void givenAStringHelloReturnHe(){
        assertEquals("He", testString.firstTwo("Hello"));
    }

    @Test
    public void givenAStringAbcdefReturnAb(){
        assertEquals("ab", testString.firstTwo("abcdef"));
    }

    @Test
    public void givenAStringAbReturnAb(){
        assertEquals("ab", testString.firstTwo("ab"));
    }

    @Test
    public void givenAStringAReturnA(){
        assertEquals("a", testString.firstTwo("a"));
    }

    @Test
    public void givenAnEmptyStringReturnAnEmptyString(){
        assertEquals("", testString.firstTwo(""));
    }
}
