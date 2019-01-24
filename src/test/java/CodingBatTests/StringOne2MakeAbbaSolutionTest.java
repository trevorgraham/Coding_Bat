package CodingBatTests;

import org.junit.Test;
import stringOne2MakeAbba.StringOne2MakeAbbaSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 24/05/2017.
 */
public class StringOne2MakeAbbaSolutionTest {
    StringOne2MakeAbbaSolution calc = new StringOne2MakeAbbaSolution();

    @Test
    public void givenTinAndHatReturnTinHatHatTin(){
        assertEquals("TinHatHatTin", calc.makeAbba("Tin", "Hat"));
    }

    @Test
    public void givenYoAndAliceReturnYoAliceAliceYo(){
        assertEquals("YoAliceAliceYo", calc.makeAbba("Yo", "Alice"));
    }
}
