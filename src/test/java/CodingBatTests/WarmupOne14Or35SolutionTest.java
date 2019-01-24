package CodingBatTests;

import org.junit.Test;
import warmupOne14Or35.WarmupOne14Or35Solution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 22/07/2017.
 * Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
 * Use the % "mod" operator -- see Introduction to Mod

 or35(3) → true
 or35(10) → true
 or35(8) → false
 */
public class WarmupOne14Or35SolutionTest {

    WarmupOne14Or35Solution calc = new WarmupOne14Or35Solution();

    @Test
    public void givenInt3ReturnTrue(){
        assertTrue(calc.or35(3));
    }

    @Test
    public void givenInt10ReturnTrue(){
        assertTrue(calc.or35(10));
    }

    @Test
    public void givenInt8ReturnFalse(){
        assertFalse(calc.or35(8));
    }
}
