package CodingBatTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import recursionOne1Factorial.RecursionOne1FactorialSolution;

public class RecursionOne1FactorialSolutionTest {

  RecursionOne1FactorialSolution calc = new RecursionOne1FactorialSolution();

  @Test
  public void givenInt1Return1(){
    assertEquals(1, calc.factorial(1));
  }
}
