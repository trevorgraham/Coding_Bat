package CodingBatTests;

import arrayOne5Sum3.ArrayOne5Sum3Solution;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 11/07/2017.
 * Given an array of ints length 3, return the sum of all the elements.

 sum3([1, 2, 3]) → 6
 sum3([5, 11, 2]) → 18
 sum3([7, 0, 0]) → 7
 */


public class ArrayOne5Sum3SolutionTest {


    int [] array123 = {1,2,3};
    int [] array5112 = {5,11,2};
    int [] array700 =   {7,0,0};

    ArrayOne5Sum3Solution calc = new ArrayOne5Sum3Solution();



    @Test
    public void givenArray123Return6(){
        assertEquals(6, calc.sum3(array123));
    }

    @Test
    public void givenArray5112Return18(){
        assertEquals(18, calc.sum3(array5112));
    }

    @Test
    public void givenArray700return7(){
        assertEquals(7,calc.sum3(array700));
    }



}
