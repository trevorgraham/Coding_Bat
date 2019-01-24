package CodingBatTests;

import org.junit.Test;
import warmupTwo13AltPairs.WarmupTwo13AltPairsSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 01/09/2017.
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

 altPairs("kitten") → "kien"
 altPairs("Chocolate") → "Chole"
 altPairs("CodingHorror") → "Congrr"
 */
public class WarmupTwo13AltPairsSolutionTest {
    WarmupTwo13AltPairsSolution calc = new WarmupTwo13AltPairsSolution();

    @Test
    public void givenAStringKittenReturnStringKien(){
        assertEquals("kien", calc.altPairs("kitten"));
    }

    @Test
    public void givenAStringChocolateReturnStringChole(){
        assertEquals("chole", calc.altPairs("chocolate"));
    }

    @Test
    public void givenAStringCodinghorrorReturnStringCongrr(){
        assertEquals("Congrr", calc.altPairs("CodingHorror"));
    }

}
