package CodingBatTests;

/*
Given a string, compute a new string by moving the first char to come after the next two chars,
so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef"
yields "bcaefd". Ignore any group of fewer than 3 chars at the end.


oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import stringTwo17OneTwo.StringTwo17OneTwoSolution;

public class StringTwo17OneTwoSolutionTest {

  StringTwo17OneTwoSolution calc = new StringTwo17OneTwoSolution();

  @Test
  public void givenStringAbcRecturnBca(){
    assertEquals("bca", calc.oneTwo("abc"));
  }

  @Test
  public void givenStringTcaRecturnCat(){
    assertEquals("cat", calc.oneTwo("tca"));
  }

  @Test
  public void givenStringtcagdoRecturnCatdog(){
    assertEquals("catdog", calc.oneTwo("tcagdo"));
  }

  @Test
  public void givenStringtTcagdoppRecturnCatDog(){
    assertEquals("catdog", calc.oneTwo("tcagdopp"));
  }



}
