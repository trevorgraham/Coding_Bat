package CodingBatTests;

import org.junit.Test;
import stringOne1HelloName.StringOne1HelloNameSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 24/05/2017.
 */
public class StringOne1HelloNameSolutionTest {
    StringOne1HelloNameSolution calc = new StringOne1HelloNameSolution();

    @Test
    public void givenANameBobReturnHelloBoB(){
        assertEquals("Hello Bob!", calc.helloName("Bob"));
    }

    @Test
    public void givenANameAliceReturnHelloAlice(){
        assertEquals("Hello Alice!", calc.helloName("Alice"));
    }


}
