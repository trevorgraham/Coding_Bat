package CodingBatTests;
/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import arrayTwo13No14.ArrayTwo13No14Solution;
import org.junit.Test;

public class ArrayTwo13No14SolutionTest {

  ArrayTwo13No14Solution calc = new ArrayTwo13No14Solution();

  int [] array23 = {2,3};
  int [] array235235235 = {2,3,5,2,3,5,2,3,5};
  int [] array02356789 ={0,2,3,5,6,7,8,9};
  int [] array1 ={1};
  int [] array4 ={4};
  int [] array3331 ={3,3,3,1};
  int [] array4323 ={4,3,2,3};
  int [] emptyArray ={};
  int [] array123 ={1,2,3};
  int [] array1234 ={1,2,3,4};
  int [] array41 ={4,1};

  @Test
  public void givenArrayContainingNoInts1or4returnTrue(){
    assertTrue(calc.no14(array23));
    assertTrue(calc.no14(array235235235));
    assertTrue(calc.no14(array02356789));
    assertTrue(calc.no14(emptyArray));
    assertTrue(calc.no14(array123));
    assertTrue(calc.no14(array1));
    assertTrue(calc.no14(array4));
    assertTrue(calc.no14(array3331));
    assertTrue(calc.no14(array4323));
  }

  @Test
  public void givenArrayContainingInts1Or4ReturnFalse(){
    assertFalse(calc.no14(array1234));
    assertFalse(calc.no14(array41));
  }
}
