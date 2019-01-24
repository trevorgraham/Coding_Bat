package CodingBatTests;

import org.junit.Test;
import warmupOne10MissingChar.WarmupOne10MissingCharSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 21/07/2017.
 * Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value
 * of n will be a valid index of a char in the original string (i.e. n will be in the range
 * 0..str.length()-1 inclusive).

 missingChar("kitten", 1) → "ktten"
 missingChar("kitten", 0) → "itten"
 missingChar("kitten", 4) → "kittn"
 */
public class WarmupOne10MissingCharSolutionTest {

    WarmupOne10MissingCharSolution calc = new WarmupOne10MissingCharSolution();

    @Test
    public void givenStringKittenAndint1ReturnKtten(){
        assertEquals("ktten", calc.missingChar("kitten", 1));
    }

    @Test
    public void givenStringKittenAndint0Returnitten(){
        assertEquals("itten", calc.missingChar("kitten", 0));
    }

    @Test
    public void givenStringKittenAndint4ReturnKittn(){
        assertEquals("kittn", calc.missingChar("kitten", 4));
    }
}
