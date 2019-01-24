package CodingBatTests;

import logicTwo6CloseFar.LogicTwo6CloseFarSolution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 12/09/2017.
 * Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other
 * is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

 closeFar(1, 2, 10) → true
 closeFar(1, 2, 3) → false
 closeFar(4, 1, 3) → true
 */
public class LogicTwo6CloseFarSolutionTest {

    LogicTwo6CloseFarSolution calc = new LogicTwo6CloseFarSolution();

    @Test
    public void givenInt1Int2Int10ReturnTrue(){
        assertTrue(calc.closeFar(1,2,10));
    }

    @Test
    public void givenInt1Int2Int3ReturnFalse(){
        assertFalse(calc.closeFar(1,2,3));
    }

}
