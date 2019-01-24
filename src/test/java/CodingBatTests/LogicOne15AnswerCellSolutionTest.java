package CodingBatTests;

import logicOne15AnswerCell.LogicOne15AnswerCellSolution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 08/08/2017.
 * Your cell phone rings. Return true if you should answer it. Normally you answer,
 * except in the morning you only answer if it is your mom calling. In all cases,
 * if you are asleep, you do not answer.

 answerCell(false, false, false) → true
 answerCell(false, false, true) → false
 answerCell(true, false, false) → false
 */
public class LogicOne15AnswerCellSolutionTest {

    LogicOne15AnswerCellSolution calc = new LogicOne15AnswerCellSolution();

    @Test
    public void givenFalseFalseFalseReturnTrue(){
        assertTrue(calc.answerCell(false,false,false));
    }

    @Test
    public void givenFalseFalseTrueReturnFalse(){
        assertFalse(calc.answerCell(false,false,true));
    }

    @Test
    public void givenTrueFalseFalseReturnFalse(){
        assertFalse(calc.answerCell(true,false,false));
    }
}
