package CodingBatTests;

/*
Given a number n, create and return a new string array of length n, containing the strings "0",
"1" "2" .. through n-1. N may be 0, in which case just return a length 0 array. Note:
String.valueOf(xxx) will make the String form of most types. The syntax to make a new string
array is: new String[desired_length]  (See also: FizzBuzz Code)


fizzArray2(4) → ["0", "1", "2", "3"]
fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
fizzArray2(2) → ["0", "1"]
 */

import static org.junit.Assert.assertArrayEquals;

import arrayTwo12FizzArray2.ArrayTwo12FizzArray2Solution;
import org.junit.Test;

public class ArrayTwo12FizzArray2SolutionTest {

  ArrayTwo12FizzArray2Solution calc = new ArrayTwo12FizzArray2Solution();
  String [] array4 = {"0", "1", "2", "3"};
  String [] array1 = {"0"};

  @Test
  public void givenIntReturnStringArrayOfIntLengthCountingFromZero(){
    assertArrayEquals(array4, calc.fizzArray(4));
    assertArrayEquals(array1, calc.fizzArray(1));
  }


}
