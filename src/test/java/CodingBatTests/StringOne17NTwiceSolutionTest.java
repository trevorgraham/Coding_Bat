package CodingBatTests;

import org.junit.Test;
import stringOne17NTwice.StringOne17NTwiceSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 26/07/2017.
 * Given a string and an int n, return a string made of the first and last n chars from the string.
 * The string length will be at least n.

 nTwice("Hello", 2) → "Helo"
 nTwice("Chocolate", 3) → "Choate"
 nTwice("Chocolate", 1) → "Ce"
 */
public class StringOne17NTwiceSolutionTest {

    StringOne17NTwiceSolution calc = new StringOne17NTwiceSolution();

    @Test
    public void givenStringHelloAndInt2ReturnHelo(){
        assertEquals("Helo", calc.nTwice("Hello", 2));
    }

    @Test
    public void givenStringChocolateAndInt3ReturnChoate(){
        assertEquals("Choate", calc.nTwice("Chocolate", 3));
    }

    @Test
    public void givenStringChocolateAndInt1ReturnCe(){
        assertEquals("Ce", calc.nTwice("Chocolate", 1));
    }
}
