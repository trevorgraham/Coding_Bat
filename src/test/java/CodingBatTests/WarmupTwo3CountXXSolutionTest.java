package CodingBatTests;

import org.junit.Before;
import org.junit.Test;
import warmupTwo3CountXX.WarmupTwo3CountXXSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 13/06/2017.
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

 countXX("abcxx") → 1
 countXX("xxx") → 2
 countXX("xxxx") → 3
 */
public class WarmupTwo3CountXXSolutionTest {
    private WarmupTwo3CountXXSolution count;

    @Before
    public void setup(){
        count = new WarmupTwo3CountXXSolution();
    }

    @Test
    public void givenAStringABCXreturn0(){
        assertEquals(0, count.countXX("abcx"));
    }

    @Test
    public void givenAStringABCXXreturn1(){
        assertEquals(1, count.countXX("abcxx"));
    }

    @Test
    public void givenAStringAXXBCXXreturn2(){
        assertEquals(2, count.countXX("axxbcxx"));
    }
}
