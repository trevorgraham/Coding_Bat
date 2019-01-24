package CodingBatTests;

/*
A sandwich is two pieces of bread with something in between. Return the string that is between the
first and last appearance of "bread" in the given string, or return the empty string "" if there
are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""

 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import stringTwo15GetSandwich.StringTwo15GetSandwichSolution;

public class StringTwo15GetSandwichSolutionTest {

  StringTwo15GetSandwichSolution calc = new StringTwo15GetSandwichSolution();

  @Test
  public void givenStringBreadJamBreadReturnJam(){
    assertEquals("jam", calc.getSandwich("breadjambread"));
  }

  @Test
  public void givenStringXxBreadJamBreadyyReturnJam(){
    assertEquals("jam", calc.getSandwich("xxbreadjambreadyy"));
  }

  @Test
  public void givenStringXxBreadyyReturnAnEmptyString(){
    assertEquals("", calc.getSandwich("xxbreadyy"));
  }

  @Test
  public void givenAnEmptyStringReturnAnEmptyString(){
    assertEquals("", calc.getSandwich(""));
  }

}
