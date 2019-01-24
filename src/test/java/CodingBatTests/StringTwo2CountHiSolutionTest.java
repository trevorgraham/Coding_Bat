package CodingBatTests;

import org.junit.Test;
import stringTwo2CountHi.StringTwo2CountHiSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 17/07/2017.
 * Return the number of times that the string "hi" appears anywhere in the given string.

 countHi("abc hi ho") → 1
 countHi("ABChi hi") → 2
 countHi("hihi") → 2
 */
public class StringTwo2CountHiSolutionTest {
    StringTwo2CountHiSolution calc = new StringTwo2CountHiSolution();

    @Test
    public void givenAStringABC_HI_HOReturn1(){
        assertEquals(1, calc.countHi("abc hi ho"));
    }

    @Test
    public void givenAStringABCHI_HIReturn2(){
        assertEquals(2, calc.countHi("ABChi hi"));
    }

    @Test
    public void givenAStringHIHIReturn2(){
        assertEquals(2, calc.countHi("hihi"));
    }
}
