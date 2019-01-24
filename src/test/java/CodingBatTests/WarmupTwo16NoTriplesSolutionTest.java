package CodingBatTests;

import org.junit.Test;
import warmupTwo16NoTriples.WarmupTwo16NoTriplesSolution;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by trevorgraham on 11/09/2017.
 * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
 * Return true if the array does not contain any triples.

 noTriples([1, 1, 2, 2, 1]) → true
 noTriples([1, 1, 2, 2, 2, 1]) → false
 noTriples([1, 1, 1, 2, 2, 2, 1]) → false

 */
public class WarmupTwo16NoTriplesSolutionTest {
    WarmupTwo16NoTriplesSolution calc = new WarmupTwo16NoTriplesSolution();
    int [] array11221 = {1,1,2,2,1};
    int [] array112221 = {1,1,2,2,2,1};
    int [] array1112221 = {1,1,1,2,2,2,1};

    @Test
    public void givenArray11221ReturnTrue(){
        assertTrue(calc.noTriples(array11221));
    }

    @Test
    public void givenArray112221ReturnFalse(){
        assertFalse(calc.noTriples(array112221));
    }

    @Test
    public void givenArray1112221ReturnTrue(){
        assertFalse(calc.noTriples(array1112221));
    }


}
