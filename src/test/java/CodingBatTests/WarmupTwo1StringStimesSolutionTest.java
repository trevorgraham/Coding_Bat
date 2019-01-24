package CodingBatTests;

import org.junit.Before;
import org.junit.Test;
import warmupTwo1StringTimes.WarmupTwo1StringTimesSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 13/06/2017.
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.

 stringTimes("Hi", 2) → "HiHi"
 stringTimes("Hi", 3) → "HiHiHi"
 stringTimes("Hi", 1) → "Hi"

 */
public class WarmupTwo1StringStimesSolutionTest {
    private WarmupTwo1StringTimesSolution stringTest;
    @Before
    public void setup(){
        stringTest = new WarmupTwo1StringTimesSolution();
    }

    @Test
    public void givnAStringHiAndInt2ReturnHiHi(){
        assertEquals("HiHi", stringTest.stringTimes("Hi", 2));
    }

    @Test
    public void givnAStringHiAndInt3ReturnHiHiHi(){
        assertEquals("HiHiHi", stringTest.stringTimes("Hi", 3));
    }

    @Test
    public void givnAStringHippoAndInt4ReturnHippoHippoHippoHippo(){
        assertEquals("HippoHippoHippoHippo", stringTest.stringTimes("Hippo", 4));
    }
}
