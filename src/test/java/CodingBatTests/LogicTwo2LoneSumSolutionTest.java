package CodingBatTests;

import logicTwo2LoneSum.LogicTwo2LoneSumSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 12/07/2017.
 * Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
 * it does not count towards the sum.

 loneSum(1, 2, 3) → 6
 loneSum(3, 2, 3) → 2
 loneSum(3, 3, 3) → 0
 */
public class LogicTwo2LoneSumSolutionTest {

    LogicTwo2LoneSumSolution calc = new LogicTwo2LoneSumSolution();

    @Test
    public void given12And3Return6(){
        assertEquals(6,calc.loneSum(1,2,3));
    }

    @Test
    public void given32And3Return2(){
        assertEquals(2,calc.loneSum(3,2,3));
    }

    @Test
    public void given33And3Return0(){
        assertEquals(0,calc.loneSum(3,3,3));
    }
}
