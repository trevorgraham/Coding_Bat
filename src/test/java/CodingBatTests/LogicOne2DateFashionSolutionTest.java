package CodingBatTests;

import logicOne2DateFashion.LogicOne2DateFashionSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 24/05/2017.
 * Created by trevorgraham on 24/05/2017.
 * You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes,
 * in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as
 * an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes).
 * With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result
 * is 1 (maybe).

 dateFashion(5, 10) → 2
 dateFashion(5, 2) → 0
 dateFashion(5, 5) → 1
 */

public class LogicOne2DateFashionSolutionTest {

    LogicOne2DateFashionSolution calc = new LogicOne2DateFashionSolution();

    @Test
    public void givenYou5AndDate10Return2(){
        assertEquals(2,calc.dateFashion(5,10));
    }

    @Test
    public void givenYou5AndDate2Return0(){
        assertEquals(0,calc.dateFashion(5,2));
    }

    @Test
    public void givenYou5AndDate5Return1(){
        assertEquals(1,calc.dateFashion(5,5));
    }

    @Test
    public void givenYou10AndDate5Return2(){
        assertEquals(2,calc.dateFashion(10,5));
    }

}
