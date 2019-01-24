package CodingBatTests;
/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y'
char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance
multiple 'x's. Return true if the given string is xy-balanced.


xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import stringTwo8XyBalance.StringTwo8XyBalanceSolution;

public class StringTwo8XyBalanceSolutionTest {

  StringTwo8XyBalanceSolution calc = new StringTwo8XyBalanceSolution();

  @Test
  public void givenStringBobreturnTrue(){
    assertTrue(calc.xyBalance("bob"));
  }

  @Test
  public void givenStringAaxbbyReturnTrue(){
    assertTrue(calc.xyBalance("aaxbby"));
  }

  @Test
  public void givenStringAaxbbReturnFalse(){
    assertFalse(calc.xyBalance("aaxbb"));
  }

  @Test
  public void givenStringYaaxbbReturnFalse(){
    assertFalse(calc.xyBalance(("yaaxbb")));
  }

}
