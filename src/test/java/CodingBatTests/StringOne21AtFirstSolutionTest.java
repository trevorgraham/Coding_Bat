package CodingBatTests;

import org.junit.Test;
import stringOne21AtFirst.StringOne21AtFirstSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 07/08/2017.
 * Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2,
 * use '@' for the missing chars.

 atFirst("hello") → "he"
 atFirst("hi") → "hi"
 atFirst("h") → "h@"
 */
public class StringOne21AtFirstSolutionTest {

    StringOne21AtFirstSolution calc = new StringOne21AtFirstSolution();

    @Test
    public void givenStringHelloReturnStringHe(){
        assertEquals("he", calc.atFirst("hello"));
    }

    @Test
    public void givenAnEmptyStringHelloReturnStringOfTwoAmpersands(){
        assertEquals("@@", calc.atFirst(""));
    }


}
