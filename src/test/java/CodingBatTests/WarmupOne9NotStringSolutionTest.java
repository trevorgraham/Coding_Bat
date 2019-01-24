package CodingBatTests;

import org.junit.Test;
import warmupOne9NotString.WarmupOne9NotStringSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 21/07/2017.
 * Given a string, return a new string where "not " has been added to the front. However, if the string already begins
 * with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

 notString("candy") → "not candy"
 notString("x") → "not x"
 notString("not bad") → "not bad"
 */
public class WarmupOne9NotStringSolutionTest {

    WarmupOne9NotStringSolution calc = new WarmupOne9NotStringSolution();

    @Test
    public void givenAStringCandyReturnNotCandy() {
        assertEquals("not candy", calc.notString("candy"));
    }

    @Test
    public void givenAStringXReturnNotX() {
        assertEquals("not X", calc.notString("X"));
    }

    @Test
    public void givenAStringNotBadReturnNoBad() {
        assertEquals("not bad", calc.notString("not bad"));
    }

}
