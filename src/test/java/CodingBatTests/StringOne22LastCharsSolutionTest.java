package CodingBatTests;

import org.junit.Test;
import stringOne22LastChars.StringOne22LastCharsSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 16/08/2017.
 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo"
 * and "java" yields "ya". If either string is length 0, use '@' for its missing char.

 lastChars("last", "chars") → "ls"
 lastChars("yo", "java") → "ya"
 lastChars("hi", "") → "h@"
 */
public class StringOne22LastCharsSolutionTest {
    StringOne22LastCharsSolution calc = new StringOne22LastCharsSolution();

    @Test
    public void givenStringLastAndStringCharsReturnStringLS(){
        assertEquals("ls", calc.lastChars("last", "chars"));
    }

    @Test
    public void givenStringYoAndStringJavaReturnStringYA(){
        assertEquals("ya", calc.lastChars("yo", "java"));
    }

    @Test
    public void givenStringHiAndAnEmptyStringReturnStringHAmpersand(){
        assertEquals("h@", calc.lastChars("hi", ""));
    }
}
