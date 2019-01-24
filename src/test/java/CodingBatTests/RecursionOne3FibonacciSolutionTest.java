package CodingBatTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import recursionOne3Fibonacci.RecursionOne3FibonacciSolution;

/*
The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive
definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each
subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5,
8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number,
with n=0 representing the start of the sequence.


fibonacci(0) → 0
fibonacci(1) → 1
fibonacci(2) → 1
 */
public class RecursionOne3FibonacciSolutionTest {

  RecursionOne3FibonacciSolution calc = new RecursionOne3FibonacciSolution();

  @Test
  public void givenInt0ReturnO(){
    assertEquals(0, calc.fibonacci(0));
  }

  @Test
  public void givenInt1Return1(){
    assertEquals(1, calc.fibonacci(1));
  }

  @Test
  public void givenInt2Return2(){
    assertEquals(2, calc.fibonacci(2));
  }

  @Test
  public void givenInt3ReturnO(){
    assertEquals(2, calc.fibonacci(3));
  }

  @Test
  public void givenInt4Return3(){
    assertEquals(3, calc.fibonacci(4));
  }

  @Test
  public void givenInt5Return5(){
    assertEquals(5, calc.fibonacci(5));
  }

  @Test
  public void givenInt6Return8(){
    assertEquals(8, calc.fibonacci(6));
  }

}
