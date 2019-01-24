package CodingBatTests;

import functionalOne2Square.FunctionalOne2SquareSolution;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 27/05/2017.
 * Given a list of integers, return a list where each integer is multiplied with itself.

 square([1, 2, 3]) → [1, 4, 9]
 square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
 square([]) → []
 */
public class FunctionalOne2SquareSolutionTest {

    FunctionalOne2SquareSolution calc = new FunctionalOne2SquareSolution();

    @Test
    public void givenList123ReturnList149(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(4);
        expected.add(9);


        assertEquals(expected, calc.square(nums));
    }

    @Test
    public void givenList68681ReturnList366436641(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(8);
        nums.add(-6);
        nums.add(-8);
        nums.add(1);

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(36);
        expected.add(64);
        expected.add(36);
        expected.add(64);
        expected.add(1);


        assertEquals(expected, calc.square(nums));
    }
}
