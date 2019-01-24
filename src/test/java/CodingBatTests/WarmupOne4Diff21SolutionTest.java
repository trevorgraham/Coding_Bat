package CodingBatTests;

import org.junit.Test;
import warmupOne4Diff21.WarmupOne4Diff21Solution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 24/05/2017.
 */
public class WarmupOne4Diff21SolutionTest {

    WarmupOne4Diff21Solution calc = new WarmupOne4Diff21Solution();

    @Test
    public void given19Return2(){
        assertEquals(2, calc.diff21(19));
    }

    @Test
    public void given23Return4(){
        assertEquals(4, calc.diff21(23));
    }

    @Test
    public void given21Return0(){
        assertEquals(0, calc.diff21(21));
    }
}
