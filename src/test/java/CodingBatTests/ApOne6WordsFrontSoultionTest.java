package CodingBatTests;

/*
Given an array of strings, return a new array containing the first N strings. N will be in the
range 1..length.


wordsFront(["a", "b", "c", "d"], 1) → ["a"]
wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]

 */

import static org.junit.Assert.assertArrayEquals;

import apOne6WordsFront.ApOne6WordsFrontSolution;
import org.junit.Test;

public class ApOne6WordsFrontSoultionTest {
  ApOne6WordsFrontSolution calc = new ApOne6WordsFrontSolution();

  String[] arrayABCD = {"a", "b", "c", "d"};
  String[] arrayA = {"a"};

  @Test
  public void givenArrayABCDReturnArrayA(){
    assertArrayEquals(arrayA, calc.wordsFront(arrayABCD,1));
  }


}
