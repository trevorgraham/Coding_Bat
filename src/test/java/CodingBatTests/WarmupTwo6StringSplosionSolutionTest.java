package CodingBatTests;

import org.junit.Test;
import warmupTwo6StringSplosion.WarmupTwo6StringSplosionSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 16/07/2017.
 * Given a non-empty string like "Code" return a string like "CCoCodCode".

 stringSplosion("Code") → "CCoCodCode"
 stringSplosion("abc") → "aababc"
 stringSplosion("ab") → "aab"
 */
public class WarmupTwo6StringSplosionSolutionTest {

    WarmupTwo6StringSplosionSolution calc = new WarmupTwo6StringSplosionSolution();

    @Test
    public void givenAStringCodeReturnCCoCodCode(){
        assertEquals("CCoCodCode", calc.stringSplosion("Code"));
    }

    @Test
    public void givenAStringAbcReturnAababc(){
        assertEquals("aababc", calc.stringSplosion("abc"));
    }

    @Test
    public void givenAStringAbReturnAab(){
        assertEquals("aab", calc.stringSplosion("ab"));
    }
}
