package CodingBatTests;

import org.junit.Test;
import warmupOne13BackAround.WarmupOne13BackAroundSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 22/07/2017.
 * Given a string, take the last char and return a new string with the last char added at the front and back,
 * so "cat" yields "tcatt". The original string will be length 1 or more.

 backAround("cat") → "tcatt"
 backAround("Hello") → "oHelloo"
 backAround("a") → "aaa"
 */
public class WarmupOne13BackAroundSolutionTest {
    WarmupOne13BackAroundSolution calc = new WarmupOne13BackAroundSolution();

    @Test
    public void givenStrinCatReturnStringTcatt(){
        assertEquals("tcatt", calc.backAround("cat"));
    }

    @Test
    public void givenStrinHelloReturnStringOHello(){
        assertEquals("oHelloo", calc.backAround("Hello"));
    }

    @Test
    public void givenStrinAReturnStringAAA(){
        assertEquals("aaa", calc.backAround("a"));
    }
}
