package CodingBatTests;

import functionalOne3AddStar.FunctionalOne3AddStarSolution;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 27/05/2017.
 * Given a list of strings, return a list where each string has "*" added at its end.

 addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
 addStar(["hello", "there"]) → ["hello*", "there*"]
 addStar(["*"]) → ["**"]
 */
public class FunctionalOne3AddStarSolutionTest {

    FunctionalOne3AddStarSolution calc = new FunctionalOne3AddStarSolution();

    @Test
    public void givenListABBCCreturnABBCCStarred(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("bb");
        list.add("ccc");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("a*");
        expected.add("bb*");
        expected.add("ccc*");

        assertEquals(expected, calc.addStar(list));
    }
}
