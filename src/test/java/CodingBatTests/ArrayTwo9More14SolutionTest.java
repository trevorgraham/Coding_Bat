package CodingBatTests;

/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import arrayTwo9More14.ArrayTwo9More14Solution;
import org.junit.Test;

public class ArrayTwo9More14SolutionTest {

  ArrayTwo9More14Solution calc = new ArrayTwo9More14Solution();

  int [] array141 = {1,4,1};
  int [] array11 = {1,1};
  int [] array1414 = {1,4,1,4};

  @Test
  public void givenArrayMoreOnesThanFoursReturnTrue(){
    assertTrue(calc.more14(array141));
    assertTrue(calc.more14(array11));
  }

  @Test
  public void givenArrayMoreForsThanOnesReturnFalse(){
    assertFalse(calc.more14(array1414));
  }

}
