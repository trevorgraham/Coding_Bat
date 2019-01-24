package CodingBatTests;

import logicOne14TeenSum.LogicOne14TeenSumSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 08/08/2017.
 * Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
 * So if either value is a teen, just return 19.

 teenSum(3, 4) → 7
 teenSum(10, 13) → 19
 teenSum(13, 2) → 19

 */
public class LogicOne14TeenSumSolutionTest {

    LogicOne14TeenSumSolution calc = new LogicOne14TeenSumSolution();

    @Test
    public void givenInt3AndInt4Return7(){
        assertEquals(7, calc.teenSum(3,4));
    }

    @Test
    public void givenInt10AndInt13Return19(){
        assertEquals(19, calc.teenSum(10,13));
    }

    @Test
    public void givenInt13AndInt2Return19(){
        assertEquals(19, calc.teenSum(13,2));
    }
}
