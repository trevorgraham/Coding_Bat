package CodingBatTests;

import org.junit.Test;
import warmupOne11FrontBack.WarmupOne11FrontBackSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 21/07/2017.
 * Given a string, return a new string where the first and last chars have been exchanged.

 frontBack("code") → "eodc"
 frontBack("a") → "a"
 frontBack("ab") → "ba"
 */
public class WarmupOne11FrontBackSolutionTest {

    WarmupOne11FrontBackSolution calc = new WarmupOne11FrontBackSolution();

    @Test
    public void givenAStringCodeReturnStringEodc(){
        assertEquals("eodc", calc.frontBack("code"));
    }

    @Test
    public void givenAStringAReturnStringA(){
        assertEquals("a", calc.frontBack("a"));
    }

    @Test
    public void givenAStringAbReturnStringBa(){
        assertEquals("ba", calc.frontBack("ab"));
    }
}
