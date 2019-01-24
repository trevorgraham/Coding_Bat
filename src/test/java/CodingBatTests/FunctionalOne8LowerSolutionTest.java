package CodingBatTests;

import functionalOne8Lower.FunctionalOne8LowerSolution;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 27/07/2017.
 * Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).

 lower(["Hello", "Hi"]) → ["hello", "hi"]
 lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
 lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
 */
public class FunctionalOne8LowerSolutionTest {

    FunctionalOne8LowerSolution calc = new FunctionalOne8LowerSolution();

    @Test
    public void givenListHelloHiReturnHelloHiInLowerCase(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Hi");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("hello");
        expected.add("hi");
        assertEquals(expected, calc.lower(list));
    }

    @Test
    public void givenListAAABBBCCCCCCReturnAAABBBCCCCCCInLowerCase(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCCCCC");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("aaa");
        expected.add("bbb");
        expected.add("cccccc");
        assertEquals(expected, calc.lower(list));
    }
}
