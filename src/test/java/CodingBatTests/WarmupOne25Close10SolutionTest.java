package CodingBatTests;

import org.junit.Test;
import warmupOne25Close10.WarmupOne25Close10Solution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 18/08/2017.
 * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event
 * of a tie. Note that Math.abs(n) returns the absolute value of a number.

 close10(8, 13) → 8
 close10(13, 8) → 8
 close10(13, 7) → 0
 */
public class WarmupOne25Close10SolutionTest {
    WarmupOne25Close10Solution calc = new WarmupOne25Close10Solution();

    @Test
    public void givenint8AndInt13return8(){
        assertEquals(8, calc.close10(8,13));
    }

    @Test
    public void givenint13AndInt8return8(){
        assertEquals(8, calc.close10(13,8));
    }

    @Test
    public void givenint13AndInt7return0(){
        assertEquals(0, calc.close10(13,7));
    }
}
