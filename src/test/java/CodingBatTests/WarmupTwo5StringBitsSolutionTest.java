package CodingBatTests;

import org.junit.Test;
import warmupTwo5StringBits.WarmupTwo5StringBitsSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 15/07/2017.
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

 stringBits("Hello") → "Hlo"
 stringBits("Hi") → "H"
 stringBits("Heeololeo") → "Hello"
 */
public class WarmupTwo5StringBitsSolutionTest {

    WarmupTwo5StringBitsSolution calc = new WarmupTwo5StringBitsSolution();

    @Test
    public void givenAStringHelloReturnHlo(){
        assertEquals("Hlo", calc.stringBits("Hello"));
    }

    @Test
    public void givenAStringHiReturnH(){
        assertEquals("H", calc.stringBits("Hi"));
    }

    @Test
    public void givenAStringHeeololeoReturnHello(){
        assertEquals("Hello", calc.stringBits("Heeololeo"));
    }


}
