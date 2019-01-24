package CodingBatTests;

import StringOne11Left2.StringOne11Left2Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 13/07/2017.
 * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
 * The string length will be at least 2.

 left2("Hello") → "lloHe"
 left2("java") → "vaja"
 left2("Hi") → "Hi"
 */
public class StringOne11Left2SolutionTest {

    StringOne11Left2Solution calc = new StringOne11Left2Solution();

    @Test
    public void givenAStringHelloReturnLLOHE(){
        assertEquals("lloHe",calc.left2("Hello"));
    }

    @Test
    public void givenAStringJavaReturnVAJA(){
        assertEquals("vaja",calc.left2("java"));
    }
}
