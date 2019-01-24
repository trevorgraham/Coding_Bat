package CodingBatTests;

/*
You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac.
Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum
is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.


blueTicket(9, 1, 0) → 10
blueTicket(9, 2, 0) → 0
blueTicket(6, 1, 4) → 10
 */


import logicOne28BlueTicket.LogicOne28BlueTicketSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogicOne28BlueTicketSolutionTest {

    LogicOne28BlueTicketSolution calc = new LogicOne28BlueTicketSolution();

    @Test
    public void givenint9Int1Int0Return10(){
        assertEquals(10, calc.blueTicket(9,1,0));
    }

    @Test
    public void givenInt9Int2Int0Return0(){
        assertEquals(0, calc.blueTicket(9,2,0));
    }

    @Test
    public void givenInt6Int1Int4Return10(){
        assertEquals(10, calc.blueTicket(6,1,4));
    }

    @Test
    public void givenInt10Int2Int0Return5(){
        assertEquals(5, calc.blueTicket(10,2,0));
    }
}
