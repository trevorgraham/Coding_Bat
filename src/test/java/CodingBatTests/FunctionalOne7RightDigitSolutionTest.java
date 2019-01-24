package CodingBatTests;

import funcationalOne7RightDigit.FunctionalOne7RightDigitSolution;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 27/07/2017.
 * Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

 rightDigit([1, 22, 93]) → [1, 2, 3]
 rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
 rightDigit([10, 0]) → [0, 0]
 */
public class FunctionalOne7RightDigitSolutionTest {

    FunctionalOne7RightDigitSolution calc = new FunctionalOne7RightDigitSolution();

    @Test
    public void givenList12293ReturnList123(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(22);
        list.add(93);

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        assertEquals(expected, calc.rightDigit(list));
    }

    @Test
    public void givenList16888681ReturnList68681(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(16);
        list.add(8);
        list.add(886);
        list.add(8);
        list.add(1);

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(6);
        expected.add(8);
        expected.add(6);
        expected.add(8);
        expected.add(1);

        assertEquals(expected, calc.rightDigit(list));
    }
}
