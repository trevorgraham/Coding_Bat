package CodingBatTests;

import org.junit.Test;
import warmupOne15Front22.WarmupOne15Front22Solution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 22/07/2017.
 * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
 * so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

 front22("kitten") → "kikittenki"
 front22("Ha") → "HaHaHa"
 front22("abc") → "ababcab"
 */
public class WarmupOne15Front22SolutionTest {

    WarmupOne15Front22Solution calc = new WarmupOne15Front22Solution();

    @Test
    public void givenStringKittenRetrunStringKikittenki(){
        assertEquals("kikittenki", calc.front22("kitten"));
    }

    @Test
    public void givenStringHaRetrunStringHaHaHa(){
        assertEquals("hahaha", calc.front22("ha"));
    }

    @Test
    public void givenStringARetrunStringAAA(){
        assertEquals("aaa", calc.front22("a"));
    }
}
