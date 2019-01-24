package CodingBatTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import arrayTwo8sum28.ArrayTwo8Sum28Solution;
import org.junit.Test;

/*
Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.


sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
 */

public class ArrayTwo8Sum28SolutionTest {

  ArrayTwo8Sum28Solution calc = new ArrayTwo8Sum28Solution();

  int [] array232242 = {2,3,2,2,4,2};
  int [] array2322422 = {2,3,2,2,4,2,2};

  @Test
  public void givenAnArrayTwosDoTotalEightReturnTrue(){
    assertTrue(calc.sum28(array232242));
  }

  @Test
  public void givenArrayTwosDoNotTotalEightReturnFalse(){
    assertFalse(calc.sum28(array2322422));
  }

}
