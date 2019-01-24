package CodingBatTests;

import LogicOne13Near10.LogicOne13Near10Solution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 23/07/2017.
 * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b)
 * is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod

 nearTen(12) → true
 nearTen(17) → false
 nearTen(19) → true
 */
public class LogicOne13Near10SolutionTest {

    LogicOne13Near10Solution calc = new LogicOne13Near10Solution();

    @Test
    public void givenInt12ReturnTrue(){
        assertTrue(calc.nearTen(12));
    }

    @Test
    public void givenInt17ReturnFalse(){
        assertFalse(calc.nearTen(17));
    }

    @Test
    public void givenInt8ReturnTrue(){
        assertTrue(calc.nearTen(8));
    }

    @Test
    public void givenInt19ReturnTrue(){
        assertTrue(calc.nearTen(19));
    }
}
