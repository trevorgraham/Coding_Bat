package CodingBatTests;

import org.junit.Test;
import stringOne29Without2.StringOne29Without2Solution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 11/09/2017.
 */
public class StringOne29Without2SolutionTest {
    StringOne29Without2Solution calc = new StringOne29Without2Solution();

    @Test
    public void givenAStringHelloHeReturnlloHe(){
        assertEquals("lloHe", calc.without2("HelloHe"));
    }

    @Test
    public void givenAStringHelloHiReturnHelloHi(){
        assertEquals("HelloHi", calc.without2("HelloHi"));
    }
}
