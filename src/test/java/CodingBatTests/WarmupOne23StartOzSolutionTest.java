package CodingBatTests;

import org.junit.Test;
import warmupOne23StartOz.WarmupOne23StartOzSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 18/08/2017.
 * Given a string, return a string made of the first 2 chars (if present), however include first char only if it is
 * 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

 startOz("ozymandias") → "oz"
 startOz("bzoo") → "z"
 startOz("oxx") → "o"
 */
public class WarmupOne23StartOzSolutionTest {
    WarmupOne23StartOzSolution calc = new WarmupOne23StartOzSolution();

    @Test
    public void givenStringOZYMANDIASreturnOZ(){
        assertEquals("oz", calc.startOz("ozymandias"));
    }

    @Test
    public void givenStringBZOOreturnZ(){
        assertEquals("z", calc.startOz("bzoo"));
    }

    @Test
    public void givenStringOXXMANDIASreturnO(){
        assertEquals("o", calc.startOz("oxx"));
    }
}
