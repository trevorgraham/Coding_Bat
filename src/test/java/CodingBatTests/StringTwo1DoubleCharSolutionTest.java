package CodingBatTests;

import org.junit.Test;
import stringTwo1DoubleChar.StringTwo1DoubleCharSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 27/05/2017.
 * Given a string, return a string where for every char in the original, there are two chars.

 doubleChar("The") → "TThhee"
 doubleChar("AAbb") → "AAAAbbbb"
 doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class StringTwo1DoubleCharSolutionTest {

    StringTwo1DoubleCharSolution calc = new StringTwo1DoubleCharSolution();

    @Test
    public void givenAStringTheReturnTThhee(){
        assertEquals("TThhee", calc.doubleChar("The"));
    }

    @Test
    public void givenAStringAAbbReturnAAAAbbbb(){
        assertEquals("AAAAbbbb", calc.doubleChar("AAbb"));
    }

    @Test
    public void givenAStringHiThereReturnHHiiTThheerree(){
        assertEquals("HHiiTThheerree", calc.doubleChar("HiThere"));
    }
}
