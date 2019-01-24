package CodingBatTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import apOne3ScoresClump.ApOne3ScoresClumpSolution;
import org.junit.Test;

/*
Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent
scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.


scoresClump([3, 4, 5]) → true
scoresClump([3, 4, 6]) → false
scoresClump([1, 3, 5, 5]) → true
 */

public class ApOne3ScoreClumpSolutionTest {

  ApOne3ScoresClumpSolution calc = new ApOne3ScoresClumpSolution();

  int[] array345 = {3, 4, 5};
  int[] array346 = {3, 4, 6};
  int[] array349 = {3, 4, 9};
  int[] array12389054 = {1,2,3,8,9,0,5,4};
  int[] array1355 = {1,3,5,5};

  @Test
  public void givenArray345ReturnTrue(){
    assertTrue(calc.scoresClump(array345));
  }

  @Test
  public void givenArray346ReturnFalse(){
    assertFalse(calc.scoresClump(array346));
  }

  @Test
  public void givenArray349ReturnFalse(){
    assertFalse(calc.scoresClump(array349));
  }

  @Test
  public void givenArray12389054ReturnFalse(){
    assertTrue(calc.scoresClump(array12389054));
  }

  @Test
  public void givenArray1355ReturnTrue(){
    assertTrue(calc.scoresClump(array1355));
  }

}
