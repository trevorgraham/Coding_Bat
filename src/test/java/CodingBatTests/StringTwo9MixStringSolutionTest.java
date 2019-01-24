package CodingBatTests;

/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of
b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of
the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import stringTwo9MixString.StringTwo9MixStringSolution;

public class StringTwo9MixStringSolutionTest {

  StringTwo9MixStringSolution calc = new StringTwo9MixStringSolution();

  @Test
  public void givenStringAbcAndXyzReturnAxbycz(){
    assertEquals("axbycz", calc.mixString("abc", "xyz"));
  }

  @Test
  public void givenStringHiAndThereReturnHTihere(){
    assertEquals("HTihere", calc.mixString("Hi", "There"));
  }

  @Test
  public void givenStringXxxxAndThereReturnXTxhxexre(){
    assertEquals("xTxhxexre", calc.mixString("xxxx", "There"));
  }


}
