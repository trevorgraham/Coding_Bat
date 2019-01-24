package CodingBatTests;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

import arrayTwo11Only14.ArrayTwo11Only14Solution;
import org.junit.Test;

public class ArrayTwo11Only14SolutionTest {

  ArrayTwo11Only14Solution calc = new ArrayTwo11Only14Solution();

  int [] array1414 = {1,4,1,4};
  int [] array1 = {1};
  int [] emptyArray ={};
  int [] array1314 ={1,3,1,4};
  int [] longArray ={1,4,1,4,1,1,1,1,4,4,4,4,1,1,4,1,4,1,4,1,4,1,1,1,5,1,1,1,4};

  @Test
  public void givenArrayContainingOnlyInts1And4ReturnTrue(){
    assertTrue(calc.only14(array1414));
    assertTrue(calc.only14(array1));
    assertTrue(calc.only14(emptyArray));
  }

  @Test
  public void givenArraycontainingIntsOtherThan1And4ReturnFalse(){
    assertFalse(calc.only14(array1314));
    assertFalse(calc.only14(longArray));
  }
}
