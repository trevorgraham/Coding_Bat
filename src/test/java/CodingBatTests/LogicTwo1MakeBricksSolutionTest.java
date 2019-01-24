package CodingBatTests;

import logicTwo1MakeBricks.LogicTwo1MakeBricksSolution;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by trevorgraham on 11/07/2017.
 * We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big
 * bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
 * This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks

 makeBricks(3, 1, 8) → true
 makeBricks(3, 1, 9) → false
 makeBricks(3, 2, 10) → true
 */
public class LogicTwo1MakeBricksSolutionTest {

    LogicTwo1MakeBricksSolution calc = new LogicTwo1MakeBricksSolution();

    @Test
    public void given3SmallAndOneLargeBrickReturnTrue(){
        assertTrue(calc.makeBricks(3,1,8));
    }

    @Test
    public void given3SmallAndOneLargeBrickGoal9ReturnFalse(){
        assertFalse(calc.makeBricks(3,1,9));
    }


}
