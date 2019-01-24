package CodingBatTests;

import functionalOne4Copies3.FunctionalOne4Copies3Solution;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 26/07/2017.
 * Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated
 * together.

 copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
 copies3(["24", "a", ""]) → ["242424", "aaa", ""]
 copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]

 */
public class FunctionalOne4Copies3SolutionTest {

    FunctionalOne4Copies3Solution calc = new FunctionalOne4Copies3Solution();

    @Test
    public void givenListABBCCReturnListAAABBBBBBCCCCCCCCC(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("bb");
        list.add("ccc");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("aaa");
        expected.add("bbbbbb");
        expected.add("ccccccccc");

        assertEquals(expected, calc.copies3(list));
    }

    @Test
    public void givenList24AEmptyReturnList242424AAAEmpty(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("24");
        list.add("a");
        list.add("");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("242424");
        expected.add("aaa");
        expected.add("");

        assertEquals(expected, calc.copies3(list));
    }
}
