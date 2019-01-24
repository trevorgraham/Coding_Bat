package CodingBatTests;

import org.junit.Test;
import warmupTwo8ArrayCount.WarmupTwo8ArrayCountSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 17/07/2017.
 * Given an array of ints, return the number of 9's in the array.

 arrayCount9([1, 2, 9]) → 1
 arrayCount9([1, 9, 9]) → 2
 arrayCount9([1, 9, 9, 3, 9]) → 3
 */
public class WarmupTwo8ArrayCountSolutionTest {
    WarmupTwo8ArrayCountSolution calc = new WarmupTwo8ArrayCountSolution();
    int array129[]={1,2,9};
    int array199[]={1,9,9};
    int array19939[]={1,9,9,3,9};

    @Test
    public void givenArray129return1(){
        assertEquals(1,calc.arrayCount9(array129));
    }

    @Test
    public void givenArray199return2(){
        assertEquals(2,calc.arrayCount9(array199));
    }

    @Test
    public void givenArray19939return3(){
        assertEquals(3,calc.arrayCount9(array19939));
    }
}
