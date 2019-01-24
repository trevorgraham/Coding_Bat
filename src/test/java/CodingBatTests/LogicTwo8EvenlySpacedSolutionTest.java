package CodingBatTests;

import logicTwo8EvenlySpaced.LogicTwo8EvenlySpacedSolution;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by trevorgraham on 24/10/2017.
 * Given three ints, a b c, one of them is small, one is medium and one is large.
 * Return true if the three values are evenly spaced, so the difference between small
 * and medium is the same as the difference between medium and large.


 evenlySpaced(2, 4, 6) → true
 evenlySpaced(4, 6, 2) → true
 evenlySpaced(4, 6, 3) → false
 */
public class LogicTwo8EvenlySpacedSolutionTest {
    LogicTwo8EvenlySpacedSolution calc = new LogicTwo8EvenlySpacedSolution();

 @Test
 public void givenInt2Int4Int6returnTrue(){
     assertTrue(calc.evenlySpaced(2,4,6));
 }


}
