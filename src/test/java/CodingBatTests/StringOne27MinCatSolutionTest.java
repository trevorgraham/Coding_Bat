package CodingBatTests;

import StringOne27MinCat.StringOne27MinCatSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 04/09/2017.
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the strings are different lengths, omit chars from the longer string so it is
 * the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

 minCat("Hello", "Hi") → "loHi"
 minCat("Hello", "java") → "ellojava"
 minCat("java", "Hello") → "javaello"
 */
public class StringOne27MinCatSolutionTest {
    StringOne27MinCatSolution calc = new StringOne27MinCatSolution();

    @Test
    public void givenAStringHelloAndAStringHiReturnLoHi(){
        assertEquals("lohi", calc.minCat("hello" , "hi"));
    }
}
