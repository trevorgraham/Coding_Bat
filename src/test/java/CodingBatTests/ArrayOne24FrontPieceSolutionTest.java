package CodingBatTests;

import arrayOne24FrontPiece.ArrayOne24FrontPieceSolution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by trevorgraham on 17/10/2017.
 * Given an int array of any length, return a new array of its first 2 elements.
 * If the array is smaller than length 2, use whatever elements are present.


 frontPiece([1, 2, 3]) → [1, 2]
 frontPiece([1, 2]) → [1, 2]
 frontPiece([1]) → [1]
 */
public class ArrayOne24FrontPieceSolutionTest {

    ArrayOne24FrontPieceSolution calc = new ArrayOne24FrontPieceSolution();

    int[] array123 = {1,2,3};
    int[] array12 = {1,2};
    int[] array1 = {1};

    @Test
    public void givenArray123ReturnArray12(){
        assertArrayEquals(array12, calc.frontPiece(array123));
    }

    @Test
    public void givenArray12ReturnArray12(){
        assertArrayEquals(array12, calc.frontPiece(array12));
    }

    @Test
    public void givenArray1ReturnArray1(){
        assertArrayEquals(array1, calc.frontPiece(array1));
    }
}
