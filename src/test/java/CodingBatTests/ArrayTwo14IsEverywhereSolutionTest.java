package CodingBatTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import arrayTwo14IsEverywhere.ArrayTwo14IsEverywhereSolution;
import org.junit.Test;

public class ArrayTwo14IsEverywhereSolutionTest {

  ArrayTwo14IsEverywhereSolution calc = new ArrayTwo14IsEverywhereSolution();

  int[] array1213 = {1,2,1,3};
  int[] array5414843 = {5,4,1,4,8,4,3};
  int[] array1234 ={1,2,3,4};

  @Test
  public void givenArray1213AndInt1ReturnTrue(){
    assertTrue(calc.isEverywhere(array1213, 1));

  }

  @Test
  public void givenArray5414843andInt4ReturnTrue(){
    assertTrue(calc.isEverywhere(array5414843, 4));
  }

  @Test
  public void givenArray12345andInt4ReturnFalse(){
    assertFalse(calc.isEverywhere(array1234,4));
  }



}
