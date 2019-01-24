package CodingBatTests;

import org.junit.Test;
import stringOne14WithoutEnd.StringOne14WithoutEndSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 14/07/2017.
 * Given a string, return a version without both the first and last char of the string. The string may be any length,
 * including 0.

 withouEnd2("Hello") → "ell"
 withouEnd2("abc") → "b"
 withouEnd2("ab") → ""
 */
public class StringOne14WithoutEndSolutionTest {

    StringOne14WithoutEndSolution calc = new StringOne14WithoutEndSolution();

    @Test
    public void givenAStringHelloReturnEll(){
        assertEquals("ell", calc.withouEnd2("Hello"));
    }

    @Test
    public void givenAStringABCReturnB(){
        assertEquals("ell", calc.withouEnd2("Hello"));
    }

    @Test
    public void givenAStringABReturnAnEmptyString(){
        assertEquals("", calc.withouEnd2("ab"));
    }
}
