package CodingBatTests;

import StringOne25SeeColor.StringOne25SeeColorSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 04/09/2017.
 * Given a string, if the string begins with "red" or "blue" return that color string,
 * otherwise return the empty string.

 seeColor("redxx") → "red"
 seeColor("xxred") → ""
 seeColor("blueTimes") → "blue"

 */
public class StringOne25SeeColorSolutionTest {

    StringOne25SeeColorSolution calc = new StringOne25SeeColorSolution();

    @Test
    public void givenStringREDXXReturnRED(){
        assertEquals("red", calc.seeColor("redxx"));
    }

    @Test
    public void givenStringXXREDReturnEmptyString(){
        assertEquals("", calc.seeColor("xxred"));
    }

    @Test
    public void givenStringBLUETIMESReturnBLUE(){
        assertEquals("blue", calc.seeColor("bluetimes"));
    }
}
