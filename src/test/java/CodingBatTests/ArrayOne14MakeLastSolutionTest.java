package CodingBatTests;

import arrayOne14MakeLast.ArrayOne14MakeLastSolution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by trevorgraham on 02/08/2017.
 */
public class ArrayOne14MakeLastSolutionTest {
    ArrayOne14MakeLastSolution calc = new ArrayOne14MakeLastSolution();

    int[] array456 ={4,5,6};
    int[] array000006 ={0,0,0,0,0,6};
    int[] array12 = {1,2};
    int[] array0002 = {0,0,0,2};
    int[] array3 = {3};
    int[] array03 = {0,3};

    @Test
    public void givenArray456ReturnArray000006(){
        assertArrayEquals(array000006, calc.makeLast(array456));
    }

    @Test
    public void givenArray12ReturnArray0002(){
        assertArrayEquals(array0002, calc.makeLast(array12));
    }

    @Test
    public void givenArray3ReturnArray03(){
        assertArrayEquals(array03, calc.makeLast(array3));
    }


}
