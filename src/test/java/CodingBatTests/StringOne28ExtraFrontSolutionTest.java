package CodingBatTests;

import org.junit.Test;
import stringOne28ExtraFront.StringOne28ExtraFrontSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 11/09/2017.
 * Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
 * The string may be any length. If there are fewer than 2 chars, use whatever is there.

 extraFront("Hello") → "HeHeHe"
 extraFront("ab") → "ababab"
 extraFront("H") → "HHH"

 */
public class StringOne28ExtraFrontSolutionTest {

    StringOne28ExtraFrontSolution calc = new StringOne28ExtraFrontSolution();

    @Test
    public void givenAStringHelloReturnStringHeHeHe(){
        assertEquals("HeHeHe", calc.extraFront("Hello"));
    }


}
