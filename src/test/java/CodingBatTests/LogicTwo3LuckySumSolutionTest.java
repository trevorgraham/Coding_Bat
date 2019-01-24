package CodingBatTests;

import logicTwo3LuckySum.LogicTwo3LuckySumSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 12/07/2017.
 * Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the
 * sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

 luckySum(1, 2, 3) → 6
 luckySum(1, 2, 13) → 3
 luckySum(1, 13, 3) → 1
 */
public class LogicTwo3LuckySumSolutionTest {

    LogicTwo3LuckySumSolution calc = new LogicTwo3LuckySumSolution();

    @Test
    public void given123Return6(){
        assertEquals(6, calc.luckySum(1,2,3));
    }

    @Test
    public void given1213Return3(){
        assertEquals(3, calc.luckySum(1,2,13));
    }

    @Test
    public void given1133Return1(){
        assertEquals(1, calc.luckySum(1,13,3));
    }

    @Test
    public void given1323Return0(){
        assertEquals(0, calc.luckySum(13,2,3));
    }

}
