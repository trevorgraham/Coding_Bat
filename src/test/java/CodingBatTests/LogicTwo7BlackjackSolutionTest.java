package CodingBatTests;

import logicTwo7Blackjack.LogicTwo7BlackjackSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 14/10/2017.
 * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they
 * both go over.


 blackjack(19, 21) → 21
 blackjack(21, 19) → 21
 blackjack(19, 22) → 19
 */
public class LogicTwo7BlackjackSolutionTest {

    LogicTwo7BlackjackSolution calc = new LogicTwo7BlackjackSolution();

    @Test
    public void givenInt19AndInr21ReturnInt21(){
        assertEquals(21, calc.blackjack(19, 21));
    }

    @Test
    public void givenInt21AndInt19ReturnInt21(){
        assertEquals(21, calc.blackjack(21, 19));
    }
}
