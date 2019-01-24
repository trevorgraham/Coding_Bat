package CodingBatTests;

import logicOne17FizzString.LogicOne17FizzStringSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 08/08/2017.
 * Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
 * If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
 * (See also: FizzBuzz Code)

 fizzString("fig") → "Fizz"
 fizzString("dib") → "Buzz"
 fizzString("fib") → "FizzBuzz"
 */
public class LogicOne17FizzStringSolutionTest {

    LogicOne17FizzStringSolution calc = new LogicOne17FizzStringSolution();

    @Test
    public void givenStringFigReturnStringFizz(){
        assertEquals("Fizz", calc.fizzString("fig"));
    }

    @Test
    public void givenStringDibReturnStringBuzz(){
        assertEquals("Buzz", calc.fizzString("dib"));
    }

    @Test
    public void givenStringFibReturnStringFizzBuzz(){
        assertEquals("FizzBuzz", calc.fizzString("fib"));
    }

}
