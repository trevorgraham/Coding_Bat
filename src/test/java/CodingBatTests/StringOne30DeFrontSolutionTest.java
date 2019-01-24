package CodingBatTests;

import org.junit.Test;
import stringOne30DeFront.StringOne30DeFrontSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 22/10/2017.
 * Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
 * and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


 deFront("Hello") → "llo"
 deFront("java") → "va"
 deFront("away") → "aay"
 */
public class StringOne30DeFrontSolutionTest {
    StringOne30DeFrontSolution calc = new StringOne30DeFrontSolution();

    @Test
    public void givenStringHelloReturnStringLlo(){
        assertEquals("llo", calc.DeFront("Hello"));
    }

    @Test
    public void givenStringHeReturnEmptyString(){
        assertEquals("", calc.DeFront("He"));
    }

    @Test
    public void givenStringArtReturnStringAt(){
        assertEquals("at", calc.DeFront("art"));
    }

    @Test
    public void givenStringAbleReturnAble(){
        assertEquals("able", calc.DeFront("able"));
    }

    @Test
    public void givenStringCbrrReturnStringBrr(){
        assertEquals("brr", calc.DeFront("cbrr"));
    }

    @Test
    public void givenStringAtReturnStringA(){
        assertEquals("a", calc.DeFront("at"));
    }

    @Test
    public void givenStringAReturnStringA(){
        assertEquals("a", calc.DeFront("a"));
    }
}
