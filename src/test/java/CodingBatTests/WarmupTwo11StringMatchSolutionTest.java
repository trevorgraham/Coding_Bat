package CodingBatTests;

import org.junit.Test;
import warmupTwo11StringMatch.WarmupTwo11StringMatchSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 23/08/2017.
 * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
 * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in
 * both strings.

 stringMatch("xxcaazz", "xxbaaz") → 3
 stringMatch("abc", "abc") → 2
 stringMatch("abc", "axc") → 0
 */
public class WarmupTwo11StringMatchSolutionTest {

    WarmupTwo11StringMatchSolution calc = new WarmupTwo11StringMatchSolution();

    @Test
    public void givenAStringXXCAAZZandStringXXBAAZReturn3(){
        assertEquals(3, calc.StringMatch("xxcaazz", "xxbaaz"));
    }

    @Test
    public void givenAStringABCandStringABCReturn2(){
        assertEquals(2, calc.StringMatch("abc", "abc"));
    }
}
