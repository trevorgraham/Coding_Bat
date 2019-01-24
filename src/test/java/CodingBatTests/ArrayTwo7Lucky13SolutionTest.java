package CodingBatTests;

/*
Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import arrayTwo7Lucky13.ArrayTwo7Lucky13Solution;
import org.junit.Test;

public class ArrayTwo7Lucky13SolutionTest {

  ArrayTwo7Lucky13Solution calc = new ArrayTwo7Lucky13Solution();

  int[] array024 = {0,2,4};
  int[] array123 = {1,2,3};
  int[] array124 = {1,2,4};

  @Test
  public void givenaNumberArrayReturnABoolean(){
    assertTrue(calc.lucky13(array024));
    assertFalse(calc.lucky13(array123));
  }

}
