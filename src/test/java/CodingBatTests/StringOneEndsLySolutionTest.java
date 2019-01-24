package CodingBatTests;

import org.junit.Test;
import stringOne16Endsly.StringOne16EndsLySolution;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by trevorgraham on 14/07/2017.
 * Given a string, return true if it ends in "ly".

 endsLy("oddly") → true
 endsLy("y") → false
 endsLy("oddy") → false
 */
public class StringOneEndsLySolutionTest {

    StringOne16EndsLySolution calc= new StringOne16EndsLySolution();

    @Test
    public void givenAStringOddlyReturnTrue(){
        assertTrue(calc.endsLy("Oddly"));
    }

    @Test
    public void givenAStringYReturnFalse(){
        assertFalse(calc.endsLy("Y"));
    }

}
