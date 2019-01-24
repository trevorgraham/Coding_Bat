package CodingBatTests;

import StringOne9ComboString.StringOne9ComboSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 11/07/2017.
 * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and
 * the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

 comboString("Hello", "hi") → "hiHellohi"
 comboString("hi", "Hello") → "hiHellohi"
 comboString("aaa", "b") → "baaab"
 */
public class StringOne9ComboStringSolutionTest {

    StringOne9ComboSolution calcString = new StringOne9ComboSolution();

    @Test
    public void givenStringHelloAndStringHiReturnHIHELLOHI(){
        assertEquals("hiHellohi", calcString.comboString("Hello","hi"));
    }

    @Test
    public void givenStringHiAndStringHelloReturnHIHELLOHI(){
        assertEquals("hiHellohi", calcString.comboString("hi","Hello"));
    }

    @Test
    public void givenStringAAAAndStringBReturnBAAAB(){
        assertEquals("baaab", calcString.comboString("aaa","b"));
    }
}
