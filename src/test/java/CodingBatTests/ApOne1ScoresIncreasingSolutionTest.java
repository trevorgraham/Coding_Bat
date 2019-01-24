package CodingBatTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import apOne1ScoresIncreasing.ApOne1ScoresIncreasingSolution;
import org.junit.Test;

/*
Given an array of scores, return true if each score is equal or greater than the one before.
The array will be length 2 or more.


scoresIncreasing([1, 3, 4]) → true
scoresIncreasing([1, 3, 2]) → false
scoresIncreasing([1, 1, 4]) → true

 */

public class ApOne1ScoresIncreasingSolutionTest {

  ApOne1ScoresIncreasingSolution calc = new ApOne1ScoresIncreasingSolution();

  int[] array134 = {1,3,4};
  int[] array132 = {1,3,2};
  int[] array114 = {1,1,4};

  @Test
  public void GivenArray134ReturnTrue(){
    assertTrue(calc.scoresIncreasing(array134));
  }

  @Test
  public void GivenArray132ReturnFalse(){
    assertFalse(calc.scoresIncreasing(array132));
  }

  @Test
  public void GivenArray114ReturnTrue(){
    assertTrue(calc.scoresIncreasing(array114));
  }

}
