package CodingBatTests;

import org.junit.Test;
import warmupTwo15Array667.WarmupTwo15Array667Solution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 11/09/2017.
 * Given an array of ints, return the number of times that two 6's are next to each other in the array.
 * Also count instances where the second "6" is actually a 7.

 array667([6, 6, 2]) → 1
 array667([6, 6, 2, 6]) → 1
 array667([6, 7, 2, 6]) → 1
 */
public class WarmupTwo15Array667SolutionTest {
    WarmupTwo15Array667Solution calc = new WarmupTwo15Array667Solution();
    int [] array662 ={6,6,2};
    int [] array6626 = {6,6,2,6};
    int [] array6726 = {6,7,2,6};
    int [] array1 = {1};
    int [] array66266 = {6,6,2,6,6};

    @Test
    public void givenArray662Return1(){
        assertEquals(1, calc.array667(array662));
    }

    @Test
    public void givenArray6626Return1(){
        assertEquals(1, calc.array667(array6626));
    }

    @Test
    public void givenArray6726Return1(){
        assertEquals(1, calc.array667(array6726));
    }

    @Test
    public void givenArray1Return0(){
        assertEquals(0, calc.array667(array1));
    }

    @Test
    public void givenArray66266Return2(){
        assertEquals(2, calc.array667(array66266));
    }
}
