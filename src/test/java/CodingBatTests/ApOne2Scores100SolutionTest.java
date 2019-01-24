package CodingBatTests;

/*
Given an array of scores, return true if there are scores of 100 next to each other in the array.
The array length will be at least 2.


scores100([1, 100, 100]) → true
scores100([1, 100, 99, 100]) → false
scores100([100, 1, 100, 100]) → true
 */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import apOne2Scores100.ApOne2Scores100Solution;
import org.junit.Test;

public class ApOne2Scores100SolutionTest {

  ApOne2Scores100Solution calc = new ApOne2Scores100Solution();

  int[] array1100100 = {1, 100, 100};
  int[] array110099100 = {1,100, 99, 100};

  @Test
  public void GivenArray1100100ReturnTrue(){
    assertTrue(calc.scores100(array1100100));
  }

  @Test
  public void GivenArray110099100ReturnTrue(){
    assertFalse(calc.scores100(array110099100));
  }
}
