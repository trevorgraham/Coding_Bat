package CodingBatTests;

import logicOne16TeaParty.LogicOne16TeaPartySolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 08/08/2017.
 * We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad,
 * 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is
 * at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy
 * is less than 5, the party is always bad (0).

 teaParty(6, 8) → 1
 teaParty(3, 8) → 0
 teaParty(20, 6) → 2
 */
public class LogicOne16TeaPartySolutionTest {

    LogicOne16TeaPartySolution calc = new LogicOne16TeaPartySolution();

    @Test
    public void givenInt6AndInt8Return1(){
        assertEquals(1,calc.teaParty(6,8));
    }

    @Test
    public void givenInt3AndInt8Return0(){
        assertEquals(0,calc.teaParty(3,8));
    }

    @Test
    public void givenInt20AndInt6Return2(){
        assertEquals(2,calc.teaParty(20,6));
    }
}
