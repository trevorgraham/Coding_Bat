package CodingBatTests;

import logicOne3SquirrelPlay.LogicOne3SquirrelPlaySolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 24/05/2017.
 * The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60
 * and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a
 * boolean isSummer, return true if the squirrels play and false otherwise.

 squirrelPlay(70, false) → true
 squirrelPlay(95, false) → false
 squirrelPlay(95, true) → true
 */


public class LogicOne3SquirrelPlaySolutionTest {

    LogicOne3SquirrelPlaySolution calc = new LogicOne3SquirrelPlaySolution();

    @Test
    public void given70andNotSummerReturnTrue(){
        assertEquals(true, calc.squirrelPlay(70,false));
    }

    @Test
    public void given95andNotSummerReturnFalse(){
        assertEquals(false, calc.squirrelPlay(95,false));
    }

    @Test
    public void given95andSummerReturnTrue(){
        assertEquals(true, calc.squirrelPlay(95,true));
    }

    @Test
    public void given105andSummerReturnFalse(){
        assertEquals(false, calc.squirrelPlay(105,true));
    }

    @Test
    public void given55andSummerReturnFalse(){
        assertEquals(false, calc.squirrelPlay(55,true));
    }

    @Test
    public void given55andNotSummerReturnFalse(){
        assertEquals(false, calc.squirrelPlay(55,false));
    }
}
