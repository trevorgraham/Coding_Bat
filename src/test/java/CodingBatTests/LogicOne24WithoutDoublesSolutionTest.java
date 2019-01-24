package CodingBatTests;

import logicOne24WithoutDoubles.LogicOne24WithoutDoublesSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 08/10/2017.
 * Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two
 * dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.


 withoutDoubles(2, 3, true) → 5
 withoutDoubles(3, 3, true) → 7
 withoutDoubles(3, 3, false) → 6
 */
public class LogicOne24WithoutDoublesSolutionTest {
    LogicOne24WithoutDoublesSolution calc = new LogicOne24WithoutDoublesSolution();

    @Test
    public void givenInt2Int3AndTrueReturn5(){
        assertEquals(5, calc.withoutDoubles(2,3, true));
    }

    @Test
    public void givenInt3Int3AndTrueReturn7(){
        assertEquals(7, calc.withoutDoubles(3,3, true));
    }

    @Test
    public void givenInt3Int3AndFalseReturn6(){
        assertEquals(6, calc.withoutDoubles(3,3, false));
    }

    @Test
    public void givenInt6Int6AndTrueReturn7(){
        assertEquals(7, calc.withoutDoubles(6,6, true));
    }


}
