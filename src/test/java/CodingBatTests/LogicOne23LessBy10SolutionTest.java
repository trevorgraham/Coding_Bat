package CodingBatTests;

import logicOne23lessBy10.LogicOne23LessBy10Solution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 12/09/2017.
 * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

 lessBy10(1, 7, 11) → true
 lessBy10(1, 7, 10) → false
 lessBy10(11, 1, 7) → true
 */
public class LogicOne23LessBy10SolutionTest {

    LogicOne23LessBy10Solution calc = new LogicOne23LessBy10Solution();

    @Test
    public void givenInt1Int7Int11ReturnTrue(){
        assertTrue(calc.lessBy10(1,7,11));
    }

    @Test
    public void givenInt1Int7Int10ReturnFalse(){
        assertFalse(calc.lessBy10(1,7,10));
    }

    @Test
    public void givenInt11Int1Int7ReturnTrue(){
        assertTrue(calc.lessBy10(11,1,7));
    }

}
