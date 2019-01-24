package CodingBatTests;

import org.junit.Test;
import warmupOneMax1020.WarmupOne27Max1020Solution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 19/08/2017.
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither
 * is in that range.

 max1020(11, 19) → 19
 max1020(19, 11) → 19
 max1020(11, 9) → 11
 */
public class WarmupOne27Max1020SolutionTest {

    WarmupOne27Max1020Solution calc = new WarmupOne27Max1020Solution();

    @Test
    public void givenInt11andInt19Return19(){
        assertEquals(19, calc.max1020(11,19));
    }
}
