package CodingBatTests;

import org.junit.Test;
import stringOne23ConCat.StringOne23ConCatSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 17/08/2017.
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

 conCat("abc", "cat") → "abcat"
 conCat("dog", "cat") → "dogcat"
 conCat("abc", "") → "abc"

 */
public class StringOne23ConCatSolutionTest {
    StringOne23ConCatSolution calc = new StringOne23ConCatSolution();

    @Test
    public void givenAStringABCandAStringCATReturnABCAT(){
        assertEquals("abcat", calc.conCat("abc", "cat"));
    }

    @Test
    public void givenAStringDOGandAStringCATReturnABCAT(){
        assertEquals("dogcat", calc.conCat("dog", "cat"));
    }

    @Test
    public void givenAStringABCandAnEmptyStringReturnABC(){
        assertEquals("abc", calc.conCat("abc", ""));
    }
}
