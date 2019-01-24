package CodingBatTests;

/*
Given an array of scores, compute the int average of the first half and the second half, and return
whichever is larger. We'll say that the second half begins at index length/2. The array length will
be at least 2. To practice decomposition, write a separate helper method
int average(int[] scores, int start, int end) { which computes the average of the elements between
indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper
method after your scoresAverage() method in the JavaBat text area. Normally you would compute
averages with doubles, but here we use ints so the expected results are exact.


scoresAverage([2, 2, 4, 4]) → 4
scoresAverage([4, 4, 4, 2, 2, 2]) → 4
scoresAverage([3, 4, 5, 1, 2, 3]) → 4
 */

import static org.junit.Assert.assertEquals;

import apOne4ScoresAverage.ApOne4ScoresAverageSolution;
import org.junit.Test;

public class ApOne4ScoresAverageSolutionTest {

  ApOne4ScoresAverageSolution calc = new ApOne4ScoresAverageSolution();

  int[] array2244 = {2,2,4,4};
  int[] array444222 ={4,4,4,2,2,2};
  int[] array345123 ={3,4,5,1,2,3};

  @Test
  public void givenArray2244Return4(){
    assertEquals(4,calc.scoresAverage(array2244));
  }

  @Test
  public void givenArray444222Return4(){
    assertEquals(4,calc.scoresAverage(array444222));
  }

  @Test
  public void givenArray345123Return4(){
    assertEquals(4,calc.scoresAverage(array345123));
  }

}
