package CodingBatTests;

import logicOne5sortaSum.LogicOne5SortaSumSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 18/07/2017.
 * Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
 * so in that case just return 20.

 sortaSum(3, 4) → 7
 sortaSum(9, 4) → 20
 sortaSum(10, 11) → 21
 */
public class LogicOne5SortaSumSolutionTest {
    LogicOne5SortaSumSolution calc = new LogicOne5SortaSumSolution();

    @Test
    public void givenInts3And4return7(){
        assertEquals(7, calc.sortaSum(3, 4));
    }

    @Test
    public void givenInts9And4return20(){
        assertEquals(20, calc.sortaSum(9, 4));
    }

    @Test
    public void givenInts10And11return21(){
        assertEquals(21, calc.sortaSum(10, 11));
    }
}
