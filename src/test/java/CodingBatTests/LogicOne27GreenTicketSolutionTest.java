package CodingBatTests;

/*
You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,
the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same,
the result is 10.


greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
 */

import logicOne27GreenTicket.LogicOne27GreenTicketSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogicOne27GreenTicketSolutionTest {

    LogicOne27GreenTicketSolution calc = new LogicOne27GreenTicketSolution();

    @Test
    public void givenInt1Int2Int3Return0(){
        assertEquals(0, calc.greenTicket(1,2,3));
    }

    @Test
    public void givenInt2Int2Int2Return20(){
        assertEquals(20, calc.greenTicket(2,2,2));
    }

    @Test
    public void givenInt1Int1Int2Return10(){
        assertEquals(10, calc.greenTicket(1,1,2));
    }
}
