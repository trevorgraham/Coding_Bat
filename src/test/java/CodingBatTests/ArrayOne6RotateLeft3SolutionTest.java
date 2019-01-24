package CodingBatTests;

import arrayOne6RotateLeft3.ArrayOne6RotateLeft3Solution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 11/07/2017.
 * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

 rotateLeft3([1, 2, 3]) → [2, 3, 1]
 rotateLeft3([5, 11, 9]) → [11, 9, 5]
 rotateLeft3([7, 0, 0]) → [0, 0, 7]

 */
public class ArrayOne6RotateLeft3SolutionTest {

    ArrayOne6RotateLeft3Solution calc = new ArrayOne6RotateLeft3Solution();

    int [] array123 = {1,2,3};
    int [] array231 = {2,3,1};
    int [] array5119 = {5,11,9};
    int [] array1195 = {11,9,5};
    int [] array700 = {7,0,0};
    int [] array007 = {0,0,7};

    @Test
    public void givenArray123ReturnArray231(){
        assertArrayEquals(array231, calc.rotateLeft3(array123));
    }

    @Test
    public void givenArray5119ReturnArray1195(){
        assertArrayEquals(array1195, calc.rotateLeft3(array5119));
    }

    @Test
    public void givenArray700ReturnArray007(){
        assertArrayEquals(array007, calc.rotateLeft3(array700));
    }



}
