package CodingBatTests;

import org.junit.Test;
import stringOne17NTwice.StringOne17NTwiceSolution;
import stringOne18TwoChar.StringOne18TwoCharSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 26/07/2017.
 * Given a string and an index, return a string length 2 starting at the given index.
 * If the index is too big or too small to define a string length 2, use the first 2 chars.
 * The string length will be at least 2.

 twoChar("java", 0) → "ja"
 twoChar("java", 2) → "va"
 twoChar("java", 3) → "ja"
 */
public class StringOne18TwoCharSolutionTest {

    StringOne18TwoCharSolution calc = new StringOne18TwoCharSolution();

    @Test
    public void givenStringJavaAndInt0ReturnJa(){
        assertEquals("ja", calc.twoChar("java", 0));
    }

    @Test
    public void givenStringJavaAndInt2ReturnVa(){
        assertEquals("va", calc.twoChar("java", 2));
    }

    @Test
    public void givenStringJavaAndInt3ReturnJa(){
        assertEquals("ja", calc.twoChar("java", 3));
    }
}
