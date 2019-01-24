package CodingBatTests;

import org.junit.Test;
import warmupTwo12StringX.WarmupTwo12StringXSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 23/08/2017.
 * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end
 * should not be removed.

 stringX("xxHxix") → "xHix"
 stringX("abxxxcd") → "abcd"
 stringX("xabxxxcdx") → "xabcdx"
 */
public class WarmupTwo12StringXSolutionTest {

    WarmupTwo12StringXSolution calc = new WarmupTwo12StringXSolution();

    @Test
    public void givenAStringXXHXIXReturnXHIX(){
        assertEquals("xHix", calc.StringX("xxHxix"));
    }

    @Test
    public void givenAStringABXXXCDReturnABCD(){
        assertEquals("abcd", calc.StringX("abxxxcd"));
    }

    @Test
    public void givenAStringXABXXXCDXReturnXABCDX(){
        assertEquals("xabcdx", calc.StringX("xabxxxcdx"));
    }

    @Test
    public void givenAStringXXReturnXX(){
        assertEquals("xx", calc.StringX("xx"));
    }

    @Test
    public void givenAStringXReturnX(){
        assertEquals("x", calc.StringX(" x"));
    }
}
