package CodingBatTests;

import logicOne20InOrder.LogicOne20InOrderSolution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 15/08/2017.
 * Given three ints, a b c, return true if b is greater than a, and c is greater than b. However,
 * with the exception that if "bOk" is true, b does not need to be greater than a.

 inOrder(1, 2, 4, false) → true
 inOrder(1, 2, 1, false) → false
 inOrder(1, 1, 2, true) → true
 */
public class LogicOne20InOrderSolutionTest {

    LogicOne20InOrderSolution calc = new LogicOne20InOrderSolution();

    @Test
    public void givenInt1Int2Int4AndBoolFalseReturnTrue(){
        assertTrue(calc.inOrder(1,2,4,false));
    }

    @Test
    public void givenInt1Int2Int1AndBoolFalseReturnFalse(){
        assertFalse(calc.inOrder(1,2,1,false));
    }

    @Test
    public void givenInt1Int1Int2AndBoolTrueReturnTrue(){
        assertTrue(calc.inOrder(1,2,4,true));
    }
}
