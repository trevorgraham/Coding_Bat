package CodingBatTests;

import arrayTwo3CentredAverage.ArrayTwo3CenteredAverageSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 18/07/2017.
 * Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except
 * ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
 * ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
 * You may assume that the array is length 3 or more.

 centeredAverage([1, 2, 3, 4, 100]) → 3
 centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
 centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 */
public class ArrayTwo3CenteredAverageSolutionTest {

    ArrayTwo3CenteredAverageSolution calc = new ArrayTwo3CenteredAverageSolution();

    int [] array1234100 ={1,2,3,4,100};
    int [] array11551087 ={1,1,5,5,10,8,7};
    int [] arrayMinus1042420 ={-10,-4,-2,-4,-2,0};

    @Test
    public void givenArray1234100Return3(){
        assertEquals(3, calc.centeredAverage(array1234100));
    }

    @Test
    public void givenArray11551087Return5(){
        assertEquals(5, calc.centeredAverage(array11551087));
    }

    @Test
    public void givenArrayMinus1042420ReturnMinus3(){
        assertEquals(-3, calc.centeredAverage(arrayMinus1042420));
    }
}
