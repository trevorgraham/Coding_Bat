package CodingBatTests;

import org.junit.Test;
import warmupTwo7Last2.WarmupTwo7Last2Solution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 16/07/2017.
 * Given a string, return the count of the number of times that a substring length 2 appears in the string and also
 * as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

 last2("hixxhi") → 1
 last2("xaxxaxaxx") → 1
 last2("axxxaaxx") → 2
 */
public class WarmupTwo7Last2SolutionTest {

    WarmupTwo7Last2Solution calc = new WarmupTwo7Last2Solution();

    @Test
    public void givenaStringHixxhireturn1(){
        assertEquals(1,calc.last2("hixxhi"));
    }
}
