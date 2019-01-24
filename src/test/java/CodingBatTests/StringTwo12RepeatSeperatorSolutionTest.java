package CodingBatTests;
/*
Given two strings, word and a separator sep, return a big string made of count occurrences of
the word, separated by the separator string.


repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import stringTwo12RepeatSeperator.StringTwo12RepeatSeperatorSolution;

public class StringTwo12RepeatSeperatorSolutionTest {

  StringTwo12RepeatSeperatorSolution calc = new StringTwo12RepeatSeperatorSolution();

  @Test
  public void givenStringWordAndStringXAndInt3ReturnWordXWordXWord(){
    assertEquals("WordXWordXWord", calc.repeatSeperator("Word", "X", 3));
  }

  @Test
  public void givenStringThisAndStringAndAndInt2ReturnThisAndThis(){
    assertEquals("ThisAndThis", calc.repeatSeperator("This", "And", 2));
  }

  @Test
  public void givenStringThisAndStringAndAndInt1ReturnThis(){
    assertEquals("ThisAndThis", calc.repeatSeperator("This", "And", 2));
  }

}
