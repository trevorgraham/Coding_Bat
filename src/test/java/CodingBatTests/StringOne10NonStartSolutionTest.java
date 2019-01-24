package CodingBatTests;

import org.junit.Test;
import stringOne10NonStart.StringOne10NonStartSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 13/07/2017.
 * Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least
 * length 1.

 nonStart("Hello", "There") → "ellohere"
 nonStart("java", "code") → "avaode"
 nonStart("shotl", "java") → "hotlava"
 */
public class StringOne10NonStartSolutionTest {
    StringOne10NonStartSolution calc = new StringOne10NonStartSolution();

    @Test
    public void givenHelloThereReturnEllohere(){
        assertEquals("ellohere", calc.nonStart("Hello", "There"));
    }

    @Test
    public void givenJavaCodeReturnAvaode(){
        assertEquals("avaode", calc.nonStart("Java", "Code"));
    }
}
