package CodingBatTests;

import org.junit.Test;
import warmupOne26In3050.WarmupOne26in3050Solution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 18/08/2017.
 * Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range
 * 40..50 inclusive.

 in3050(30, 31) → true
 in3050(30, 41) → false
 in3050(40, 50) → true
 */
public class WarmupOne26in3050SolutionTest {
    WarmupOne26in3050Solution calc = new WarmupOne26in3050Solution();

    @Test
    public void givenInt30AndInt31ReturnTrue(){
        assertTrue(calc.in3050(30,31));
    }

    @Test
    public void givenInt30AndInt41ReturnFalse(){
        assertFalse(calc.in3050(30,41));
    }

    @Test
    public void givenInt40AndInt50ReturnTrue(){
        assertTrue(calc.in3050(40,50));
    }
}
