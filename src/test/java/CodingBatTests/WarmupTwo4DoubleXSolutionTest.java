package CodingBatTests;

import org.junit.Test;
import warmupTwo4DoubleX.WarmupTwo4DoubleXSolution;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by trevorgraham on 15/07/2017.
 * Given a string, return true if the first instance of "x" in the string is immediately followed by
 * another "x".

 doubleX("axxbb") → true
 doubleX("axaxax") → false
 doubleX("xxxxx") → true
 */
public class WarmupTwo4DoubleXSolutionTest {

    WarmupTwo4DoubleXSolution calc = new WarmupTwo4DoubleXSolution();

    @Test
    public void givenAStringAXXBBReturnTrue(){
        assertTrue(calc.doubleX("axxbb"));
    }

    @Test
    public void givenAStringAXaxaxReturnFalse(){
        assertFalse(calc.doubleX("axaxax"));
    }

    @Test
    public void givenAStringABBReturnFalse(){
        assertFalse(calc.doubleX("abb"));
    }

    @Test
    public void givenAStringXReturnFalse(){
        assertFalse(calc.doubleX("x"));
    }
}
