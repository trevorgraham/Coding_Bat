package CodingBatTests;

import logicOne21InOrderEqual.LogicOne21InOrderEqualSolution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 12/09/2017.
 * Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7
 * or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.

 inOrderEqual(2, 5, 11, false) → true
 inOrderEqual(5, 7, 6, false) → false
 inOrderEqual(5, 5, 7, true) → true
 */
public class LogicOne21InOrderEqualSolutionTest {

    LogicOne21InOrderEqualSolution calc = new LogicOne21InOrderEqualSolution();

    @Test
    public void givenInt2Int5In11AndFalseReturnTrue(){
        assertTrue(calc.inOrderEqual(2,5,11,false));
    }

    @Test
    public void givenInt5Int7In6AndFalseReturnFalse(){
        assertFalse(calc.inOrderEqual(5,7,6,false));
    }

    @Test
    public void givenInt5Int5In7AndFalseReturnTrue(){
        assertTrue(calc.inOrderEqual(5,5,7,true));
    }
}
