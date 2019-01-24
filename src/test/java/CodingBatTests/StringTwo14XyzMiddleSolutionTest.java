package CodingBatTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import stringTwo14XyzMiddle.StringTwo14XyzMiddleSolution;

/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that
the number of chars to the left and right of the "xyz" must differ by at most one. This problem
is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */
public class StringTwo14XyzMiddleSolutionTest {

  StringTwo14XyzMiddleSolution calc = new StringTwo14XyzMiddleSolution();

  @Test
  public void givenStringAaxyzBBReturnTrue(){
    assertTrue(calc.xyzMiddle("AAxyzBB"));
  }

  @Test
  public void givenStringAxyzBBReturnTrue(){
    assertTrue(calc.xyzMiddle("AxyzBB"));
  }

  @Test
  public void givenStringAxyzBBBReturnFalse(){
    assertFalse(calc.xyzMiddle("AxyzBBB"));
  }




}
