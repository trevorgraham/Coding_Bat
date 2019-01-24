package CodingBatTests;

import org.junit.Test;
import warmupOne12Front3.WarmupOne12Front3Solution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 21/07/2017.
 * Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3,
 * the front is whatever is there. Return a new string which is 3 copies of the front.

 front3("Java") → "JavJavJav"
 front3("Chocolate") → "ChoChoCho"
 front3("abc") → "abcabcabc"
 *
 */
public class WarmupOne12Front3SolutionTest {
    WarmupOne12Front3Solution calc = new WarmupOne12Front3Solution();

    @Test
    public void givenStringJavaReturnJavJavJav(){
        assertEquals("JavJavJav", calc.front3("Java"));
    }

    @Test
    public void givenStringChocolateReturnChoChoCho(){
        assertEquals("ChoChoCho", calc.front3("Chocolate"));
    }

    @Test
    public void givenStringAReturnAAA(){
        assertEquals("AAA", calc.front3("A"));
    }
}
