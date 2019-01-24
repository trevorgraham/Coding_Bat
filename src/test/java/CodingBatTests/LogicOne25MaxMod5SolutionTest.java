package CodingBatTests;

/*
Given two int values, return whichever value is larger. However if the two values have the same remainder when divided
by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. Note: the %
"mod" operator computes the remainder, e.g. 7 % 5 is 2.


maxMod5(2, 3) → 3
maxMod5(6, 2) → 6
maxMod5(3, 2) → 3
 */

import logicOne25MaxMod5.LogicOne25MaxMod5Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogicOne25MaxMod5SolutionTest {

    LogicOne25MaxMod5Solution calc = new LogicOne25MaxMod5Solution();

    @Test
    public void givenInt2AndInt3Return3(){
        assertEquals(3,calc.maxMod5(2,3));
    }

    @Test
    public void givenInt6AndInt2Return6(){
        assertEquals(6, calc.maxMod5(6,2));
    }

    @Test
    public void givenInt9andInt14Return9(){
        assertEquals(9,calc.maxMod5(9,14));
    }

    @Test
    public void givenInt7andInt7Return0(){
        assertEquals(0,calc.maxMod5(7,7));
    }


}
