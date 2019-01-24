package CodingBatTests;

import org.junit.Test;
import stringOne7FirstHalf.StringOne7FirstHalfSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 28/06/2017.
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

 firstHalf("WooHoo") → "Woo"
 firstHalf("HelloThere") → "Hello"
 firstHalf("abcdef") → "abc"
 */
public class StringOne7FirstHalfSolutionTest {
    StringOne7FirstHalfSolution calc = new StringOne7FirstHalfSolution();

    @Test
    public void givenStringWoohooReturnStringWoo(){
        assertEquals("Woo", calc.firstHalf("WooHoo"));
    }

    @Test
    public void givenStringHelloThereReturnStringHello(){
        assertEquals("Hello", calc.firstHalf("HelloThere"));
    }

    @Test
    public void givenStringABCDEFReturnStringABC(){
        assertEquals("ABC", calc.firstHalf("ABCDEF"));
    }


}
