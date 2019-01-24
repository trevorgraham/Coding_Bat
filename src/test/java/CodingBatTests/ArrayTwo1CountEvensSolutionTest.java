package CodingBatTests;

import arrayTwo1CountEvens.ArrayTwo1CountEvensSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 18/07/2017.
 */
public class ArrayTwo1CountEvensSolutionTest {
    int [] array21234 ={2,1,2,3,4};
    int [] array220 ={2,2,0};
    int [] array135 = {1,3,5};

    ArrayTwo1CountEvensSolution calc = new ArrayTwo1CountEvensSolution();

    @Test
    public void givenArray21234Return3(){
        assertEquals(3, calc.countEvens(array21234));
    }

    @Test
    public void givenArray220Return3(){
        assertEquals(3, calc.countEvens(array220));
    }

    @Test
    public void givenArray135Return0(){
        assertEquals(0, calc.countEvens(array135));
    }


}
