package CodingBatTests;

import StringOne24LastTwo.StringOne24LastTwoSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 04/09/2017.
 * Given a string of any length, return a new string where the last 2 chars, if present, are swapped,
 * so "coding" yields "codign".

 lastTwo("coding") → "codign"
 lastTwo("cat") → "cta"
 lastTwo("ab") → "ba"
 */
public class StringOne24LastTwoSolutionTest {

    StringOne24LastTwoSolution calc = new StringOne24LastTwoSolution();

    @Test
    public void givenAStringCODINGReturnCODIGN(){
        assertEquals("codign", calc.lastTwo("coding"));
    }

    @Test
    public void givenAStringCATReturnCTA(){
        assertEquals("cta", calc.lastTwo("cat"));
    }

    @Test
    public void givenAStringABReturnBA(){
        assertEquals("ba", calc.lastTwo("ab"));
    }

}
