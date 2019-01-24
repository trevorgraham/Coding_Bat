package CodingBatTests;

import LogicOne4CaughtSpeeding.LogicOne4CaughtSpeedingSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 04/07/2017.
 * You are driving a little too fast, and a police officer stops you. Write code to compute the result,
 * encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
 * If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2.
 * Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

 caughtSpeeding(60, false) → 0
 caughtSpeeding(65, false) → 1
 caughtSpeeding(65, true) → 0
 */
public class LogicOne4CaughtSpeedingSolutionTest {
    LogicOne4CaughtSpeedingSolution calcFine = new LogicOne4CaughtSpeedingSolution();

    @Test
    public void given60andFalseReturn0(){
        assertEquals(0, calcFine.caughtSpeeding(60,false));
    }

    @Test
    public void given65andFalseReturn1(){
        assertEquals(1, calcFine.caughtSpeeding(65,false));
    }

    @Test
    public void given81andFalseReturn2(){
        assertEquals(2, calcFine.caughtSpeeding(81,false));
    }

    @Test
    public void given60andTrueReturn0(){
        assertEquals(0, calcFine.caughtSpeeding(60,true));
    }

    @Test
    public void given65andTrueReturn0(){
        assertEquals(0, calcFine.caughtSpeeding(65,true));
    }

    @Test
    public void given85andTrueReturn1(){
        assertEquals(1, calcFine.caughtSpeeding(85,true));
    }

    @Test
    public void given86andTrueReturn2(){
        assertEquals(2, calcFine.caughtSpeeding(86,true));
    }

}
