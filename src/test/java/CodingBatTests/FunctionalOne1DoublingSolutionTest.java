package CodingBatTests;

import functionalOne1Doubling.FunctionalOne1DoublingSolution;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 27/05/2017.
 * Given a list of integers, return a list where each integer is multiplied by 2.

 doubling([1, 2, 3]) → [2, 4, 6]
 doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
 doubling([]) → []
 */
public class FunctionalOne1DoublingSolutionTest {

    private FunctionalOne1DoublingSolution testFunc;

    @Before
            public void setup(){
        testFunc = new FunctionalOne1DoublingSolution();
    }




    @Test
    public void givenAnArrayOf126Return2412(){
        ArrayList<Integer> nums =new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        assertEquals(expected, testFunc.doubling(nums));
    }


}
