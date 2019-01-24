package CodingBatTests;

import org.junit.Test;
import stringOne32WithoutX.StringOne32WithouXSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 22/10/2017.
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
 * and otherwise return the string unchanged.


 withoutX("xHix") → "Hi"
 withoutX("xHi") → "Hi"
 withoutX("Hxix") → "Hxi"
 */
public class StringOne32WithoutXSolutionTest {
    StringOne32WithouXSolution calc = new StringOne32WithouXSolution();

    @Test
    public void givenAStringXHIXreturnStringHI(){
        assertEquals("hi", calc.withoutX("xhix"));
    }
}
