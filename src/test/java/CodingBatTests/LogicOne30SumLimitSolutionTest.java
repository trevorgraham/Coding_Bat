package CodingBatTests;

/*
Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the
sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative
int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)


sumLimit(2, 3) → 5
sumLimit(8, 3) → 8
sumLimit(8, 1) → 9
 */


import logicOne30SumLimit.LogicOne30SumLimitSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogicOne30SumLimitSolutionTest {

    LogicOne30SumLimitSolution calc = new LogicOne30SumLimitSolution();

    @Test
    public void givenInt2AndInt3Return5(){
        assertEquals(5, calc.sumLimit(2,3));
    }

    @Test
    public void givenInt8Int3Return8(){
        assertEquals(8, calc.sumLimit(8,3));
    }
}
