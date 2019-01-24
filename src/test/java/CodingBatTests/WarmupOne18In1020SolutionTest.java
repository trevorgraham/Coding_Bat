package CodingBatTests;

import org.junit.Test;
import warmupOne18In1020.WarmupOne18In1020Solution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 16/08/2017.
 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.

 in1020(12, 99) → true
 in1020(21, 12) → true
 in1020(8, 99) → false
 */
public class WarmupOne18In1020SolutionTest {
    WarmupOne18In1020Solution calc = new WarmupOne18In1020Solution();

    @Test
    public void givenInt12AndInt99ReturnTrue(){
        assertTrue(calc.in1020(12,99));
    }

    @Test
    public void givenInt21AndInt12ReturnTrue(){
        assertTrue(calc.in1020(21,12));
    }

    @Test
    public void givenInt8AndInt99ReturnFalse(){
        assertFalse(calc.in1020(8,99));
    }
}
