package CodingBatTests;
/*
Given a string, consider the prefix string made of the first N chars of the string. Does that
prefix string appear somewhere else in the string? Assume that the string is not empty and that N
is in the range 1..str.length().


prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false

 */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import stringTwo13prefixAgain.StringTwo13PrefixAgainSolution;

public class StringTwo13PrefixAgainSolutionTest {

  StringTwo13PrefixAgainSolution calc = new StringTwo13PrefixAgainSolution();

  @Test
  public void givenStringAbXYabcAndInt1ReturnTrue(){
    assertTrue(calc.prefixAgain("abXYabc", 1));
  }

  @Test
  public void givenStringAbXYabcAndInt2ReturnTrue(){
    assertTrue(calc.prefixAgain("abXYabc", 2));
  }

  @Test
  public void givenStringAbXYabcAndInt3ReturnFalse(){
    assertFalse(calc.prefixAgain("abXYabc", 3));
  }

}
