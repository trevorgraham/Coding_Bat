package CodingBatTests;

import org.junit.Test;
import stringOne8WithoutEnd.StringOne8WithoutEndSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 28/06/2017.
 * Given a string, return a version without the first and last char, so "Hello" yields "ell".
 * The string length will be at least 2.

 withoutEnd("Hello") → "ell"
 withoutEnd("java") → "av"
 withoutEnd("coding") → "odin"

 */
public class StringOne8WithoutEndSolutionTest {
    StringOne8WithoutEndSolution calc = new StringOne8WithoutEndSolution();

    @Test
    public void givenAStringHelloReturnEll(){
        assertEquals("ell",calc.withoutEnd("Hello"));
    }

    @Test
    public void givenAStringJavaReturnAv(){
        assertEquals("av",calc.withoutEnd("Java"));
    }
}
