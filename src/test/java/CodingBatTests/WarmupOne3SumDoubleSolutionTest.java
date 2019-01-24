package CodingBatTests;

import org.junit.Test;
import warmupOne3SumDouble.WarmupOne3SumDoubleSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 24/05/2017.
 */
public class WarmupOne3SumDoubleSolutionTest {
    WarmupOne3SumDoubleSolution calc = new WarmupOne3SumDoubleSolution();

    @Test
    public void given1And2Return3(){
        assertEquals(3, calc.SumDouble(1,2));
    }

    @Test
    public void given5And3Return8(){
        assertEquals(8, calc.SumDouble(5,3));
    }

    @Test
    public void given2And2Return8(){
        assertEquals(8, calc.SumDouble(2,2));
    }
}
