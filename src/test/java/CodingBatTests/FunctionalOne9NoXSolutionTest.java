package CodingBatTests;

import functionalOne9NoX.FunctionalOne9NoXSolution;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 31/07/2017.
 * Given a list of strings, return a list where each string has all its "x" removed.

 noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
 noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
 noX(["x"]) → [""]

 */
public class FunctionalOne9NoXSolutionTest {
    FunctionalOne9NoXSolution calc = new FunctionalOne9NoXSolution();

    @Test
    public void givenListAxBbCxReturnABbC(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("ax");
        list.add("bb");
        list.add("cx");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("bb");
        expected.add("c");

        assertEquals(expected, calc.noX(list));
    }

    @Test
    public void givenListXxaxXBxbxXxcxReturnABbC(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("xxax");
        list.add("xbxbx");
        list.add("xxcx");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("bb");
        expected.add("c");

        assertEquals(expected, calc.noX(list));
    }
}
