package CodingBatTests;

import org.junit.Test;
import warmupOne22MixStart.WarmupOne22MixStartSolution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 18/08/2017.
 * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

 mixStart("mix snacks") → true
 mixStart("pix snacks") → true
 mixStart("piz snacks") → false
 */
public class WarmupOne22MixStartSolutionTest {

    WarmupOne22MixStartSolution calc = new WarmupOne22MixStartSolution();

    @Test
    public void givenTheStringMixSnacksReturnTrue(){
        assertTrue(calc.mixStart("mix snacks"));
    }

    @Test
    public void givenTheStringMPixSnacksReturnTrue(){
        assertTrue(calc.mixStart("pix snacks"));
    }

    @Test
    public void givenTheStringPizSnacksReturnFalse(){
        assertFalse(calc.mixStart("piz snacks"));
    }
}
