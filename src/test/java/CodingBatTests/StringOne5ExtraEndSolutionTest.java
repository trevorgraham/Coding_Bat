package CodingBatTests;

import org.junit.Before;
import org.junit.Test;
import stringOne5ExtraEnd.StringOne5ExtraEndSolution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by trevorgraham on 13/06/2017.
 * * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length
 * will be at least 2.

 extraEnd("Hello") → "lololo"
 extraEnd("ab") → "ababab"
 extraEnd("Hi") → "HiHiHi"
 */
public class StringOne5ExtraEndSolutionTest {
    private StringOne5ExtraEndSolution testString;

    @Before
    public void setup(){
        testString= new StringOne5ExtraEndSolution();
    }

    @Test
    public void givenAStringHelloReturnNotNull(){
        assertNotNull(testString.extraEnd("Hello"));
    }

    @Test
    public void givenAStringHelloReturnLoLoLo(){
        assertEquals("lololo", testString.extraEnd("Hello"));
    }

    @Test
    public void givenAStringABReturnABABAB(){
        assertEquals("ababab", testString.extraEnd("ab"));
    }

    @Test
    public void givenAStringHiReturnHiHiHi(){
        assertEquals("HiHiHi", testString.extraEnd("Hi"));
    }
}
