package CodingBatTests;

import org.junit.Before;
import org.junit.Test;
import stringOne4MakeOutWord.StringOne4MakeOutWordSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 13/06/2017.
 * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word
 * is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j)
 * to extract the String starting at index i and going up to but not including index j.

 makeOutWord("<<>>", "Yay") → "<<Yay>>"
 makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
 makeOutWord("[[]]", "word") → "[[word]]"
 */
public class StringOne4MakeOutWordSolutionTest {
    private StringOne4MakeOutWordSolution stringTest;

    @Before
    public void setup(){
        stringTest = new StringOne4MakeOutWordSolution();
    }

    @Test
    public void givenYayReturnYaySurroundeBySymbols(){
        assertEquals("<<Yay>>", stringTest.makeOutWord("<<>>", "Yay"));
    }

    @Test
    public void givenWooHooReturnWooHooSurroundeBySymbols(){
        assertEquals("<<WooHoo>>", stringTest.makeOutWord("<<>>", "WooHoo"));
    }

    @Test
    public void givenWordReturnWordSurroundeBySymbols(){
        assertEquals("[[word]]", stringTest.makeOutWord("[[]]", "word"));
    }
}
