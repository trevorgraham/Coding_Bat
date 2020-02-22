package CodingBatTests;

/*
Given a string and a non-empty word string, return a string made of each char just before and just after every
appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char
may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 */

import org.junit.Test;
import stringTwo21WordEnds.StringTwo21WordEndsSolution;

import static org.junit.Assert.assertEquals;

public class StringTwo21WordEndsSoultionTest {

    StringTwo21WordEndsSolution calc = new StringTwo21WordEndsSolution();

    @Test
    public void GivenStringXY123XYAndStringXYReturnC13i(){
        assertEquals("c13i", calc.wordEnds("XY123XY", "XY"));
    }
}
