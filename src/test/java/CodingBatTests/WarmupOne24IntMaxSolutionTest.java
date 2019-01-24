package CodingBatTests;

import org.junit.Test;
import warmupOne24IntMax.WarmupOne24IntMaxSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 18/08/2017.
 * Given three int values, a b c, return the largest.

 intMax(1, 2, 3) → 3
 intMax(1, 3, 2) → 3
 intMax(3, 2, 1) → 3

 */
public class WarmupOne24IntMaxSolutionTest {

    WarmupOne24IntMaxSolution calc = new WarmupOne24IntMaxSolution();

        @Test
        public void givenInt1Int2Int3Return3(){
            assertEquals(3, calc.intMax(1,2,3));
        }

    @Test
    public void givenInt1Int3Int2Return3(){
        assertEquals(3, calc.intMax(1,3,2));
    }

    @Test
    public void givenInt1IntInt3Return3(){
        assertEquals(3, calc.intMax(3,2,1));
    }

}
