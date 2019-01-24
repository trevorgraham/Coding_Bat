package CodingBatTests;

import logicOne6AlarmClock.LogicOne6AlarmClockSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 18/07/2017.
 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
 * return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
 * and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and
 * weekends it should be "off".

 alarmClock(1, false) → "7:00"
 alarmClock(5, false) → "7:00"
 alarmClock(0, false) → "10:00"
 */
public class LogicOne6AlarmClockSolutionTest {
    LogicOne6AlarmClockSolution calc = new LogicOne6AlarmClockSolution();

    @Test
    public void given1AndFalseReturn7(){
        assertEquals("7:00", calc.alarmClock(1, false));
    }

    @Test
    public void given5AndFalseReturn7(){
        assertEquals("7:00", calc.alarmClock(5, false));
    }

    @Test
    public void given0AndFalseReturn10(){
        assertEquals("10:00", calc.alarmClock(0, false));
    }
}
