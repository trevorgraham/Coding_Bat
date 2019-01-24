package CodingBatTests;

/*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.


has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
 */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import arrayTwo6Has22.ArrayTwo6Has22Solution;
import org.junit.Test;

public class ArrayTwo6Has22SolutionTest {

  ArrayTwo6Has22Solution calc = new ArrayTwo6Has22Solution();

  int [] array122 = {1,2,2};
  int [] array1212 = {1,2,1,2};
  int [] array212 = {2,1,2};

  @Test
  public void givenArrayOfIntsReturnBoolean(){
    assertTrue(calc.has22(array122));
    assertFalse(calc.has22(array1212));
    assertFalse(calc.has22(array212));

  }

}
