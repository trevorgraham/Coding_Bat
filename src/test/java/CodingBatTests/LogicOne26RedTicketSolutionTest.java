package CodingBatTests;

/*
You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2,
the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different
from a, the result is 1. Otherwise the result is 0.


redTicket(2, 2, 2) → 10
redTicket(2, 2, 1) → 0
redTicket(0, 0, 0) → 5
 */

import logicOne26RedTicket.LogicOne26RedTicketSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogicOne26RedTicketSolutionTest {

    LogicOne26RedTicketSolution calc = new LogicOne26RedTicketSolution();

    @Test
    public void givenInt2Int2AndInt2Return10(){
        assertEquals(10, calc.redTicket(2,2,2));
    }

    @Test
    public void givenInt2Int2Int1Return0(){
        assertEquals(0, calc.redTicket(2,2,1));
    }

    @Test
    public void givenInt0Int0Int0Return5(){
        assertEquals(5, calc.redTicket(0,0,0));
    }

    @Test
    public void givenInt0Int2Int3Return1(){
        assertEquals(1, calc.redTicket(0,2,3));
    }
}
