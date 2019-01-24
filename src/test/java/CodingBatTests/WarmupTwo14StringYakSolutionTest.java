package CodingBatTests;

import WarmupTwo14StringYak.WarmupTwo14StringYakSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 04/09/2017.
 * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
 * but the "a" can be any char. The "yak" strings will not overlap.

 stringYak("yakpak") → "pak"
 stringYak("pakyak") → "pak"
 stringYak("yak123ya") → "123ya"
 */
public class WarmupTwo14StringYakSolutionTest {

    WarmupTwo14StringYakSolution calc = new WarmupTwo14StringYakSolution();

    @Test
    public void givenAStringYAKPAKReturnPAK(){
        assertEquals("pak", calc.stringYak("yakpak"));
    }

    @Test
    public void givenAStringPAKYAKReturnPAK(){
        assertEquals("pak", calc.stringYak("pakyak"));
    }

    @Test
    public void givenAStringYAK123YAReturn123YA(){
        assertEquals("123ya", calc.stringYak("yak123ya"));
    }
}
