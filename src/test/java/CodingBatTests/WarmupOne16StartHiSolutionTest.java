package CodingBatTests;

import org.junit.Test;
import warmupOne16StartHi.WarmupOne16StartHiSolution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 22/07/2017.
 * Given a string, return true if the string starts with "hi" and false otherwise.

 startHi("hi there") → true
 startHi("hi") → true
 startHi("hello hi") → false
 */
public class WarmupOne16StartHiSolutionTest {
    WarmupOne16StartHiSolution calc = new WarmupOne16StartHiSolution();

    @Test
    public void givenStringHi_thereReturnTrue(){
        assertTrue(calc.startHi("hi there"));
    }

    @Test
    public void givenStringHiReturnTrue(){
        assertTrue(calc.startHi("hi"));
    }

    @Test
    public void givenStringHello_hiReturnFalse(){
        assertFalse(calc.startHi("hello hi"));
    }
}
