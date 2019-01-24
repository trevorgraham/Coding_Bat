package CodingBatTests;

import org.junit.Before;
import org.junit.Test;
import warmupOne5ParrotTrouble.WarmupOne5ParrotTroubleSolution;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by trevorgraham on 13/06/2017.
 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

 parrotTrouble(true, 6) → true
 parrotTrouble(true, 7) → false
 parrotTrouble(false, 6) → false
 */
public class WarmupOne5ParrotTroubleSolutionTest {

    private WarmupOne5ParrotTroubleSolution parrotTest;

    @Before
    public void setup(){
        parrotTest = new WarmupOne5ParrotTroubleSolution();
    }

    @Test
    public void givenParrotTalkingAndHourIs6ReturnTrue(){
        assertTrue(parrotTest.parrotTrouble(true,6));
    }

    @Test
    public void givenParrotTalkingAndHourIs7ReturnFalse(){
        assertFalse(parrotTest.parrotTrouble(true,7));
    }

    @Test
    public void givenParrotNotTalkingAndHourIs6ReturnFalse(){
        assertFalse(parrotTest.parrotTrouble(false,6));
    }

    @Test
    public void givenParrotTalkingAndHourIs21ReturnTrue(){
        assertTrue(parrotTest.parrotTrouble(true,21));
    }

    @Test
    public void givenParrotNotTalkingAndHourIs21ReturnFalse(){
        assertFalse(parrotTest.parrotTrouble(false,21));
    }

    @Test
    public void givenParrotNotTalkingAndHourIs7ReturnFalse(){
        assertFalse(parrotTest.parrotTrouble(false,7));
    }
}
