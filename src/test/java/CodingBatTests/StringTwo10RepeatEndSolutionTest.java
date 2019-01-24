package CodingBatTests;

/*
Given a string and an int n, return a string made of n repetitions of the last n characters of
the string. You may assume that n is between 0 and the length of the string, inclusive.


repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"

 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import stringTwo10RepeatEnd.StringTwo10RepeatEndSolution;

public class StringTwo10RepeatEndSolutionTest {

  StringTwo10RepeatEndSolution calc = new StringTwo10RepeatEndSolution();

  @Test
  public void givenStringHelloAndInt3ReturnLlollollo(){
    assertEquals("llollollo", calc.repeatEnd("Hello", 3));
  }

  @Test
  public void givenStringHelloAndInt2ReturnLolo(){
    assertEquals("lolo", calc.repeatEnd("Hello", 2));
  }

  @Test
  public void givenStringHelloAndInt1ReturnO(){
    assertEquals("o", calc.repeatEnd("Hello", 1));
  }

  @Test
  public void givenStringHelloAndInt0ReturnAnEmptyString(){
    assertEquals("", calc.repeatEnd("Hello", 0));
  }

  @Test
  public void givenStringHiAndInt2ReturnHiHiHi(){
    assertEquals("HiHi", calc.repeatEnd("Hi", 2));
  }

}
