package CodingBatTests;

/*
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
 Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't
 be done.


makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2

 */

import logicTwo9MakeChocolate.LogicTwo9MakeChocolateSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogicTwo9MakeChocolateSolutionTest {

    LogicTwo9MakeChocolateSolution calc = new LogicTwo9MakeChocolateSolution();

    @Test
    public void givenInt4Int1Int9Return4(){
        assertEquals(4, calc.makeChocolate(4,1,9));
    }

    @Test
    public void givenInt4Int1Int3Return3(){
        assertEquals(3, calc.makeChocolate(4,1,3));
    }

    @Test
    public void givenInt4Int1Int10returnMinusOne(){
        assertEquals(-1, calc.makeChocolate(4,1,10));
    }

    @Test
    public void givenInt1Int2Int7ReturnMinus1(){
       assertEquals( -1, calc.makeChocolate(1,2,7));
    }

    @Test
    public void givenInt6Int1Int10ReturnMinus5(){
        assertEquals( 5, calc.makeChocolate(6,1,10));
    }


    @Test
    public void givenInt4Int1Int7Return2(){
        assertEquals(-1, calc.makeChocolate(1,4,7));
    }
}
