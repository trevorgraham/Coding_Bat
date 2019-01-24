package CodingBatTests;

import org.junit.Test;
import stringOne31StartWord.StringOne31StartOneSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 22/10/2017.
 * Given a string and a second "word" string, we'll say that the word matches the string if it appears at the
 * front of the string, except its first char does not need to match exactly. On a match, return the front of
 * the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and
 * "xip" returns "hip". The word will be at least length 1.


 startWord("hippo", "hi") → "hi"
 startWord("hippo", "xip") → "hip"
 startWord("hippo", "i") → "h"
 */
public class StringOne31StartWordSolutionTest {
    StringOne31StartOneSolution calc = new StringOne31StartOneSolution();

    @Test
    public void givenStringHippoAndStringHiReturnStringHi(){
        assertEquals("hi" , calc.startWord("hippo", "hi"));
    }

    @Test
    public void givenStringHippoAndStringXipReturnStringHip(){
        assertEquals("hip" , calc.startWord("hippo", "xip"));
    }

    @Test
    public void givenStringHippoAndStringIReturnStringH(){
        assertEquals("h" , calc.startWord("hippo", "i"));
    }
}
