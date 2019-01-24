package CodingBatTests;

import logicTwo4NoTeenSum.LogicTwo4NoTeenSumSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 12/07/2017.
 * Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19
 * inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public
 * int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you
 * avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level
 * as the main noTeenSum().
 */
public class LogicTwo4NoTeenSumSolutionTest {

    LogicTwo4NoTeenSumSolution calc = new LogicTwo4NoTeenSumSolution();

    @Test
    public void given121019return22(){
        assertEquals(22,calc.noTeenSum(12,10,19));
    }
}
