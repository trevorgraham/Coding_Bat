package CodingBatTests;

import static org.junit.Assert.assertArrayEquals;

import arrayTwo10FizzArray.ArrayTwo10FizzArraySolution;
import org.junit.Test;

/*
Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2,
... n-1. The given n may be 0, in which case just return a length 0 array. You do not need a
separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in
that case, so it just works. The syntax to make a new int array is: new int[desired_length]
(See also: FizzBuzz Code)


fizzArray(4) → [0, 1, 2, 3]
fizzArray(1) → [0]
fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

public class ArrayTwo10FizzArraySolutionResult {

  ArrayTwo10FizzArraySolution calc = new ArrayTwo10FizzArraySolution();

  int[] array4 = {0,1,2,3};
  int[] array0 = {};

  @Test
  public void givenIntReturnArrayWithNumberSequenceforPositions(){
    assertArrayEquals(array4, calc.fizzArray(4));
    assertArrayEquals(array0, calc.fizzArray(0));

  }

}
