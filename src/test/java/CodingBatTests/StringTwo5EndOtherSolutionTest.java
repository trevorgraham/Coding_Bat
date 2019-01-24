package CodingBatTests;

import org.junit.Test;
import stringTwo5EndOther.StringTwo5EndOtherSolution;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by trevorgraham on 18/07/2017.
 * Given two strings, return true if either of the strings appears at the very end of the other string, ignoring
 * upper/lower case differences (in other words, the computation should not be "case sensitive").
 * Note: str.toLowerCase() returns the lowercase version of a string.

 endOther("Hiabc", "abc") → true
 endOther("AbC", "HiaBc") → true
 endOther("abc", "abXabc") → true
 */
public class StringTwo5EndOtherSolutionTest {
    StringTwo5EndOtherSolution calc = new StringTwo5EndOtherSolution();

    @Test
    public void givenStringsHIABCAndABCReturnTrue(){
        assertTrue(calc.endOther("Hiabc", "abc"));
    }

    @Test
    public void givenStringsAbCAndHiaBcReturnTrue(){
        assertTrue(calc.endOther("AbC", "HiaBc"));
    }

    @Test
    public void givenStringsabcAndHiabXabcReturnTrue(){
        assertTrue(calc.endOther("abc", "abXabc"));
    }

    @Test
    public void givenStringsAXXXAndICECREAMreturnFalse(){
        assertFalse(calc.endOther("AXXX", "ICECREAM"));
    }
}
