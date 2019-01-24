package CodingBatTests;

import org.junit.Test;
import stringTwo6XYZThere.StringTwo6XYZThereSolution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 27/11/2017.
 * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a
 * period (.). So "xxyz" counts but "x.xyz" does not.


 xyzThere("abcxyz") → true
 xyzThere("abc.xyz") → false
 xyzThere("xyz.abc") → true
 */
public class StringTwo6XYZThereSolutionTest {

    StringTwo6XYZThereSolution calc = new StringTwo6XYZThereSolution();

    @Test
    public void givenStringABCXYZReturnTrue(){
        assertTrue(calc.xyzThere("abcxyz"));
    }

    @Test
    public void givenStringABCPeriodXYZReturnFalse(){
        assertFalse(calc.xyzThere("abc.xyz"));
    }
}
