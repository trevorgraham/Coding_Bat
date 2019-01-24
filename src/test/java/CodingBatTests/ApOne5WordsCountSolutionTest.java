package CodingBatTests;
/*
Given an array of strings, return the count of the number of strings with the given length.


wordsCount(["a", "bb", "b", "ccc"], 1) → 2
wordsCount(["a", "bb", "b", "ccc"], 3) → 1
wordsCount(["a", "bb", "b", "ccc"], 4) → 0

 */

import static org.junit.Assert.assertEquals;

import apOne5WordsCount.ApOne5WordsCountSolution;
import org.junit.Test;

public class ApOne5WordsCountSolutionTest {
  ApOne5WordsCountSolution calc = new ApOne5WordsCountSolution();

  String[] arrayA = {"a", "bb", "b", "ccc"};

  @Test
  public void givenArrayAReturn2(){
    assertEquals(2,calc.wordsCount(arrayA,1));
  }

  @Test
  public void givenArrayAReturn1(){
    assertEquals(1,calc.wordsCount(arrayA,3));
  }

  @Test
  public void givenArrayAReturn0(){
    assertEquals(0,calc.wordsCount(arrayA,4));
  }


}
