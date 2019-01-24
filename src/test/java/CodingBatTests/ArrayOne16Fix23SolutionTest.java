package CodingBatTests;

import arrayOne16Fix23.ArrayOne16Fix23Solution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by trevorgraham on 19/08/2017.
 * Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
 * Return the changed array.

 fix23([1, 2, 3]) → [1, 2, 0]
 fix23([2, 3, 5]) → [2, 0, 5]
 fix23([1, 2, 1]) → [1, 2, 1]

 */
public class ArrayOne16Fix23SolutionTest {
    int[] array123 ={1,2,3};
    int[] array120 ={1,2,0};
    int[] array235 ={2,3,5};
    int[] array205 ={2,0,5};
    int[] array121 ={1,2,1};

    ArrayOne16Fix23Solution calc = new ArrayOne16Fix23Solution();

    @Test
    public void givenArray123ReturnArray120(){
        assertArrayEquals(array120, calc.fix23(array123));
    }

    @Test
    public void givenArray235ReturnArray205(){
        assertArrayEquals(array205, calc.fix23(array235));
    }

    @Test
    public void givenArray121ReturnArray121(){
        assertArrayEquals(array121, calc.fix23(array121));
    }
}
