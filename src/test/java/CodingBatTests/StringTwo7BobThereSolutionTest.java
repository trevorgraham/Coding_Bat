package CodingBatTests;

/*
Return true if the given string contains a "bob" string, but where the middle 'o' char can
be any char.


bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false


 */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import stringTwo7BobThere.StringTwo7BobThereSolution;

public class StringTwo7BobThereSolutionTest {

  StringTwo7BobThereSolution calc = new StringTwo7BobThereSolution();

  @Test
  public void givenStringAbcbobReturnTrue(){
    assertTrue(calc.bobThere("abcbob"));
  }

  @Test
  public void givenStringBacReturnFalse(){
    assertFalse(calc.bobThere("bac"));
  }



}
