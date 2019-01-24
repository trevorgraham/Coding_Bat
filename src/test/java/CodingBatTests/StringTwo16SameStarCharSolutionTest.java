package CodingBatTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import stringTwo16SameStarChar.StringTwo16SameStarCharSolution;

/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and
after the star, they are the same.


sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
 */
public class StringTwo16SameStarCharSolutionTest {

  StringTwo16SameStarCharSolution calc = new StringTwo16SameStarCharSolution();

  @Test
  public void givenStringXYstarYZZReturnTrue(){
    assertTrue(calc.sameStarChar("xy*yzz"));
  }

  @Test
  public void givenStringXYStarZZZReturnFalse(){
    assertFalse(calc.sameStarChar("xy*zzz"));
  }

  @Test
  public void givenStringStarXAStarAZReturnTrue(){
    assertTrue(calc.sameStarChar("*xa*az"));
  }

  @Test
  public void givenStringStarXAStarAZStarReturnTrue(){
    assertTrue(calc.sameStarChar("*xa*az*"));
  }


}
