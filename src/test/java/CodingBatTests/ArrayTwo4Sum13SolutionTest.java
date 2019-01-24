package CodingBatTests;

import arrayTwo4Sum13.ArrayTwo4Sum13Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 18/07/2017.
 * Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
 * so it does not count and numbers that come immediately after a 13 also do not count.

 sum13([1, 2, 2, 1]) → 6
 sum13([1, 1]) → 2
 sum13([1, 2, 2, 1, 13]) → 6
 */
public class ArrayTwo4Sum13SolutionTest {
    ArrayTwo4Sum13Solution calc = new ArrayTwo4Sum13Solution();
    int [] array1221 = {1,2,2,1};
    int [] array11 ={1,1};
    int [] array122113 = {1,2,2,1,13};
    int [] array122113111 = {1,2,2,1,13,1,1,1};
    int [] array1312313123 = {13,1,2,3,13,1,2,3};

    @Test
    public void givenArray1221Return6(){
        assertEquals(6, calc.sum13(array1221));
    }

    @Test
    public void givenArray11Return2(){
        assertEquals(2, calc.sum13(array11));
    }

    @Test
    public void givenArray122113Return6(){
        assertEquals(6, calc.sum13(array122113));
    }

    @Test
    public void givenArray122113111Return8(){
        assertEquals(8, calc.sum13(array122113111));
    }

    @Test
    public void givenArray1312313123Return10(){
        assertEquals(10,calc.sum13(array1312313123));
    }
}
