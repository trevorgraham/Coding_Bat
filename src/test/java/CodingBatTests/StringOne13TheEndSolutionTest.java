package CodingBatTests;

import org.junit.Test;
import stringOne13TheEnd.StringOne13TheEndSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 13/07/2017.
 * Given a string, return a string length 1 from its front, unless front is false, in which case return a string
 * length 1 from its back. The string will be non-empty.

 theEnd("Hello", true) → "H"
 theEnd("Hello", false) → "o"
 theEnd("oh", true) → "o"
 */
public class StringOne13TheEndSolutionTest {
    StringOne13TheEndSolution calc = new StringOne13TheEndSolution();

    @Test
    public void givenAStringHelloAndTrueReturnH(){
        assertEquals("H", calc.theEnd("Hello", true));
    }

    @Test
    public void givenAStringHelloAndFalseReturno(){
        assertEquals("o", calc.theEnd("Hello", false));
    }

    @Test
    public void givenAStringOhAndTrueReturnO(){
        assertEquals("o", calc.theEnd("oh", true));
    }
}
