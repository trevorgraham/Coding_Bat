package CodingBatTests;

import org.junit.Before;
import org.junit.Test;
import warmupTwo2FrontTimes.WarmupTwo2FrontTimesSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 13/06/2017.
 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
 * or whatever is there if the string is less than length 3. Return n copies of the front;

 frontTimes("Chocolate", 2) → "ChoCho"
 frontTimes("Chocolate", 3) → "ChoChoCho"
 frontTimes("Abc", 3) → "AbcAbcAbc"
 */
public class WarmupTwo2FrontTimesSolutionTest {

    private WarmupTwo2FrontTimesSolution stringTest;

    @Before
    public void setup(){
        stringTest= new WarmupTwo2FrontTimesSolution();
    }

    @Test
    public void givenAStringChocolateAndInt1ReturnChoCho(){
        assertEquals("Cho", stringTest.frontTimes("Chocolate", 1));
    }

    @Test
    public void givenAStringItAndInt1ReturnIt(){
        assertEquals("It", stringTest.frontTimes("It", 1));
    }

    @Test
    public void givenAStringChocolateAndInt2ReturnChoCho(){
        assertEquals("ChoCho", stringTest.frontTimes("Chocolate", 2));
    }

    @Test
    public void givenAStringChocolateAndInt3ReturnChoChoCho(){
        assertEquals("ChoChoCho", stringTest.frontTimes("Chocolate", 3));
    }

    @Test
    public void givenAStringAAndInt2ReturnAA(){
        assertEquals("AA", stringTest.frontTimes("A", 2));
    }

    @Test
    public void givenAnEmptyStringAAndInt2ReturnAnEmptyString(){
        assertEquals("", stringTest.frontTimes("", 2));
    }


}
