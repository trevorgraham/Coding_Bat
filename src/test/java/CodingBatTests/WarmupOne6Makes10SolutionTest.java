package CodingBatTests;

import org.junit.Before;
import org.junit.Test;
import warmupOne6Makes10.WarmupOne6Makes10Solution;


import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by trevorgraham on 28/06/2017.
 */
public class WarmupOne6Makes10SolutionTest {
    private WarmupOne6Makes10Solution calc = new WarmupOne6Makes10Solution();

    @Test
    public void given9And10returnTrue(){
        assertTrue(calc.makes10(9,10));
    }

    @Test
    public void given9And7returnFalse(){
        assertFalse(calc.makes10(9,7));
    }

    @Test
    public void given4And6returnTrue(){
        assertTrue(calc.makes10(4,6));
    }


}
