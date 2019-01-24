package CodingBatTests;

import org.junit.Test;
import warmupOne1SleepIn.WarmupOne1SleepInSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 24/05/2017.
 */
public class WarmupOne1SleepInSolutionTest {

    WarmupOne1SleepInSolution calc = new WarmupOne1SleepInSolution();

    @Test
    public void givenWeekdayFalseAndVactionFalseReturnTrue(){
        assertEquals(true, calc.sleepIn(false, false));
    }

    @Test
    public void givenWeekdayTrueAndVactionFalseReturnFalse(){
        assertEquals(false, calc.sleepIn(true, false));
    }

    @Test
    public void givenWeekdayFalseAndVactionTrueReturnTrue(){
        assertEquals(true, calc.sleepIn(false, true));
    }

    @Test
    public void givenWeekdayTrueAndVactionTrueReturnTrue(){
        assertEquals(true, calc.sleepIn(true, true));
    }


}
