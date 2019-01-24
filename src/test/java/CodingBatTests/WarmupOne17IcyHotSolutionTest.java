package CodingBatTests;

import org.junit.Test;
import warmupOne17IcyHot.WarmupOne17IcyHotSolution;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by trevorgraham on 16/08/2017.
 * Given two temperatures, return true if one is less than 0 and the other is greater than 100.

 icyHot(120, -1) → true
 icyHot(-1, 120) → true
 icyHot(2, 120) → false

 */
public class WarmupOne17IcyHotSolutionTest {

    WarmupOne17IcyHotSolution calc = new WarmupOne17IcyHotSolution();

    @Test
    public void givenInt120AndIntMinus1ReturnTrue(){
        assertTrue(calc.icyHot(120, -1));
    }

    @Test
    public void givenInt120AndInt1ReturnFalse(){
        assertFalse(calc.icyHot(120, 1));
    }

    @Test
    public void givenIntMinus10AndInt101ReturnTrue(){
        assertTrue(calc.icyHot(-10, 101));
    }





}
