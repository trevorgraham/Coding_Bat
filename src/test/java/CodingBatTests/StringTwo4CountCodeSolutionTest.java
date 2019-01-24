package CodingBatTests;

import org.junit.Test;
import stringTwo4CountCode.StringTwo4CountCodeSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 17/07/2017.
 * Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any
 * letter for the 'd', so "cope" and "cooe" count.

 countCode("aaacodebbb") → 1
 countCode("codexxcode") → 2
 countCode("cozexxcope") → 2
 */
public class StringTwo4CountCodeSolutionTest {
    StringTwo4CountCodeSolution calc = new StringTwo4CountCodeSolution();

    @Test
    public void givenStringAAACODEBBBReturn1(){
        assertEquals(1, calc.countCode("aaacodebbb"));
    }

    @Test
    public void givenStringCODEXXCODEReturn2(){
        assertEquals(2, calc.countCode("codexxcode"));
    }

    @Test
    public void givenStringCOZEXXCOPEReturn2(){
        assertEquals(2, calc.countCode("cozexxcope"));
    }

}
