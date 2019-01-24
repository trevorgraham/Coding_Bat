package CodingBatTests;

import arrayOne2SameFirstLast.ArrayOne2SameFirstLastSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 24/05/2017.
 */
public class ArrayOne2SameFirstLastSolutionTest {
    ArrayOne2SameFirstLastSolution calc = new ArrayOne2SameFirstLastSolution();

    int[] array123 = {1,2,3};
    int[] array1231 = {1,2,3,1};
    int[] array121 = {1,2,1};
    int[] array1 = {1};

    @Test
    public void givenAnArray123returnFalse(){
        assertEquals(false, calc.sameFirstLast(array123));
    }

    @Test
    public void givenAnArray1231returnTrue(){
        assertEquals(true, calc.sameFirstLast(array1231));
    }

    @Test
    public void givenAnArray121returnTrue(){
        assertEquals(true, calc.sameFirstLast(array121));
    }

    @Test
    public void givenAnArray1returnTrue(){
        assertEquals(true, calc.sameFirstLast(array1));
    }

}
