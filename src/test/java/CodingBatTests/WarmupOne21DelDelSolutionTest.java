package CodingBatTests;

import org.junit.Test;
import warmupOne21DelDel.WarmupOne21DelDelSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 18/08/2017.
 *
 * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
 * Otherwise, return the string unchanged.

 delDel("adelbc") → "abc"
 delDel("adelHello") → "aHello"
 delDel("adedbc") → "adedbc"
 */
public class WarmupOne21DelDelSolutionTest {

    WarmupOne21DelDelSolution calc = new WarmupOne21DelDelSolution();

    @Test
    public void givenStringAdelbcReturnStringABC(){
        assertEquals("abc", calc.delDel("adelbc"));
    }

    @Test
    public void givenStringAdelHelloReturnStringAHello(){
        assertEquals("aHello", calc.delDel("adelHello"));
    }

    @Test
    public void givenStringAdedbcHelloReturnStringAdedbc(){
        assertEquals("adedbc", calc.delDel("adedbc"));
    }
}
