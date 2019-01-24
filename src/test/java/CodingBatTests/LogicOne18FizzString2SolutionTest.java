package CodingBatTests;

import logicOne18FizzString2.LogicOne18FizzString2Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 08/08/2017.
 * Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the
 * number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz",
 * and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after
 * division, so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another?
 * (See also: FizzBuzz Code and Introduction to Mod)

 fizzString2(1) → "1!"
 fizzString2(2) → "2!"
 fizzString2(3) → "Fizz!"
 */
public class LogicOne18FizzString2SolutionTest {

    LogicOne18FizzString2Solution calc = new LogicOne18FizzString2Solution();

    @Test
    public void givenInt1ReturnString1Exclamation(){
        assertEquals("1!", calc.fizzString2(1));

    }

    @Test
    public void givenInt2ReturnString2Exclamation(){
        assertEquals("2!", calc.fizzString2(2));

    }

    @Test
    public void givenInt3ReturnStringFizz(){
        assertEquals("Fizz!", calc.fizzString2(3));

    }

    @Test
    public void givenInt5ReturnStringBuzz(){
        assertEquals("Buzz!", calc.fizzString2(5));

    }

    @Test
    public void givenInt10ReturnBuzz(){
        assertEquals("Buzz!", calc.fizzString2(10));

    }

    @Test
    public void givenInt15ReturnStrigFizzBuzz(){
        assertEquals("FizzBuzz!", calc.fizzString2(15));

    }
}
