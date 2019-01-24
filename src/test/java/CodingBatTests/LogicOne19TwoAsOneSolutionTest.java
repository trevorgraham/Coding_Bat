package CodingBatTests;

import logicOne19TwoAsOne.LogicOne19TwoAsOneSolution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 15/08/2017.
 Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

 twoAsOne(1, 2, 3) → true
 twoAsOne(3, 1, 2) → true
 twoAsOne(3, 2, 2) → false */

public class LogicOne19TwoAsOneSolutionTest {

    LogicOne19TwoAsOneSolution calc = new LogicOne19TwoAsOneSolution();

    @Test
    public void givenInt1Int2Int3ReturnTrue(){
        assertTrue(calc.twoAsOne(1,2,3));
    }

    @Test
    public void givenInt3Int2Int1ReturnTrue(){
        assertTrue(calc.twoAsOne(3,2,1));
    }

    @Test
    public void givenInt3Int2Int2ReturnFalse(){
        assertFalse(calc.twoAsOne(3,2,2));
    }
}
