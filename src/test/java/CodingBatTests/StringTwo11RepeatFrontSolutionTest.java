package CodingBatTests;

/*
Given a string and an int n, return a string made of the first n characters of the string,
followed by the first n-1 characters of the string, and so on. You may assume that n is between
0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).


repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import stringTwo11RepeatFront.StringTwo11RepeatFrontSolution;

public class StringTwo11RepeatFrontSolutionTest {

  StringTwo11RepeatFrontSolution calc = new StringTwo11RepeatFrontSolution();

  @Test
  public void givenStringChocolateAndInt4ReturnChocChoChC(){
    assertEquals("ChocChoChC", calc.repeatFront("Chocloate", 4));
  }

  @Test
  public void givenStringChocolateAndInt3ReturnChoChC(){
    assertEquals("ChoChC", calc.repeatFront("Chocloate", 3));
  }

  @Test
  public void givenStringIceCreamAndInt2ReturnIcI(){
    assertEquals("IcI", calc.repeatFront("Ice Cream", 2));
  }

  @Test
  public void givenStringChocolateAndInt0ReturnAnEmptyString(){
    assertEquals("", calc.repeatFront("Chocloate", 0));
  }



}
