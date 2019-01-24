package CodingBatTests;

import StringOne12Right2.StringOne12Right2Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 13/07/2017.
 * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
 * The string length will be at least 2.

 right2("Hello") → "loHel"
 right2("java") → "vaja"
 right2("Hi") → "Hi"
 */
public class StringOne12Right2SolutionTest {

    StringOne12Right2Solution calc = new StringOne12Right2Solution();

    @Test
    public void givenAStringHelloReturnLohel(){
        assertEquals("loHel",calc.right2("Hello"));
    }

    @Test
    public void givenAStringJavaReturnVaja(){
        assertEquals("vaja",calc.right2("java"));
    }

    @Test
    public void givenAStringHiReturnHi(){
        assertEquals("Hi",calc.right2("Hi"));
    }
}
