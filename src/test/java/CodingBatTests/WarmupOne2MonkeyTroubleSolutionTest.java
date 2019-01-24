package CodingBatTests;

import org.junit.Test;
import warmupOne2MonkeyTrouble.WarmupOne2MonkeyTroubleSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 24/05/2017.
 */
public class WarmupOne2MonkeyTroubleSolutionTest {
    WarmupOne2MonkeyTroubleSolution calc = new WarmupOne2MonkeyTroubleSolution();

    @Test
    public void givenASmileTrueAndBSmileTrueReturnTrue(){
        assertEquals(true, calc.monkeyTrouble(true, true));
    }

    @Test
    public void givenASmileFalseAndBSmileTrueReturnFalse(){
        assertEquals(false, calc.monkeyTrouble(false, true));
    }

    @Test
    public void givenASmileTrueAndBSmileFalseReturnFalse(){
        assertEquals(false, calc.monkeyTrouble(true, false));
    }

    @Test
    public void givenNotASmileTrueAndNotBSmileFalseReturnTrue(){
        assertEquals(true, calc.monkeyTrouble(false, false));
    }
}
