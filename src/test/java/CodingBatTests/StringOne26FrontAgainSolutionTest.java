package CodingBatTests;

import StringOne25SeeColor.StringOne25SeeColorSolution;
import StringOne26FrontAgain.StringOne26FrontAgainSolution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 04/09/2017.
 * Given a string, return true if the first 2 chars in the string also appear at the end of
 * the string, such as with "edited".

 frontAgain("edited") → true
 frontAgain("edit") → false
 frontAgain("ed") → true
 */
public class StringOne26FrontAgainSolutionTest {

    StringOne26FrontAgainSolution calc = new StringOne26FrontAgainSolution();

    @Test
    public void givenAStringEditedReturnTrue(){
        assertTrue(calc.frontAgain("edited"));
    }

    @Test
    public void givenAStringEditReturnFalse(){
        assertFalse(calc.frontAgain("edit"));
    }

    @Test
    public void givenAStringEdReturnTrue(){
        assertTrue(calc.frontAgain("ed"));
    }
}
