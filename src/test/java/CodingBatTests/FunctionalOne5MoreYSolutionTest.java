package CodingBatTests;

import functionalOne5MoreY.FunctionalOne5MoreYSolution;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 26/07/2017.
 * Given a list of strings, return a list where each string has "y" added at its start and end.

 moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
 moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
 moreY(["yay"]) → ["yyayy"]
 */
public class FunctionalOne5MoreYSolutionTest {

    FunctionalOne5MoreYSolution calc = new FunctionalOne5MoreYSolution();

    @Test
    public void givenListABCreturnListYayYbyYcy(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("yay");
        expected.add("yby");
        expected.add("ycy");

        assertEquals(expected, calc.moreY(list));
    }

    @Test
    public void givenListHelloTherereturnListYhelloyYTherey(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("there");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("yhelloy");
        expected.add("ytherey");

        assertEquals(expected, calc.moreY(list));
    }

}
