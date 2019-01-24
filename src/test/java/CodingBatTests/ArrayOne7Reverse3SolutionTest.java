package CodingBatTests;

import ArrayOne7Reverse3.ArrayOne7Reverse3Solution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by trevorgraham on 18/07/2017.
 * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3}
 * becomes {3, 2, 1}.

 reverse3([1, 2, 3]) → [3, 2, 1]
 reverse3([5, 11, 9]) → [9, 11, 5]
 reverse3([7, 0, 0]) → [0, 0, 7]
 */
public class ArrayOne7Reverse3SolutionTest {
    ArrayOne7Reverse3Solution arrayCalc = new ArrayOne7Reverse3Solution();

    int [] array123 ={1,2,3};
    int [] array321 ={3,2,1};
    int [] array5119 ={5,11,9};
    int [] array9115 = {9,11,5};
    int [] array700 = {7,0,0};
    int [] array007 = {0,0,7};

    @Test
    public void givenArray123ReturnArray321(){
        assertArrayEquals(array321, arrayCalc.reverse3(array123));
    }

    @Test
    public void givenArray5119ReturnArray9115(){
        assertArrayEquals(array9115, arrayCalc.reverse3(array5119));
    }

    @Test
    public void givenArray700ReturnArray007(){
        assertArrayEquals(array007, arrayCalc.reverse3(array700));
    }

}
