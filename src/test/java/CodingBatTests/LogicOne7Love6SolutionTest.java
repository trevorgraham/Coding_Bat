package CodingBatTests;

import logicOne7Love6.LogicOne7Love6Solution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 18/07/2017.
 * The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
 * Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.

 love6(6, 4) → true
 love6(4, 5) → false
 love6(1, 5) → true
 */
public class LogicOne7Love6SolutionTest {

    LogicOne7Love6Solution calc = new LogicOne7Love6Solution();

    @Test
    public void givenInt6AndInt4returnTrue(){
        assertTrue(calc.love6(6,4));
    }

    @Test
    public void givenInt4AndInt5returnTrue(){
        assertFalse(calc.love6(4,5));
    }

    @Test
    public void givenInt1AndInt5returnTrue(){
        assertTrue(calc.love6(1,5));
    }
}
