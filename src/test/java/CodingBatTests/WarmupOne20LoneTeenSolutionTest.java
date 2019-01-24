package CodingBatTests;

import org.junit.Test;
import warmupOne20LoneTeen.WarmupOne20LoneTeenSolution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 16/08/2017.
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
 * return true if one or the other is teen, but not both.

 loneTeen(13, 99) → true
 loneTeen(21, 19) → true
 loneTeen(13, 13) → false
 */
public class WarmupOne20LoneTeenSolutionTest {

    WarmupOne20LoneTeenSolution calc = new WarmupOne20LoneTeenSolution();

    @Test
    public void givenInt13AndInt99ReturnTrue(){
        assertTrue(calc.loneTeen(13,99));
    }

    @Test
    public void givenInt13AndInt13ReturnFalse(){
        assertFalse(calc.loneTeen(13,13));
    }

    @Test
    public void givenInt21AndInt7ReturnFalse(){
        assertFalse(calc.loneTeen(21,7));
    }
}
