package CodingBatTests;

import functionalOne6Math1.FunctionalOne6Math1Solution;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 26/07/2017.
 * Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.

 math1([1, 2, 3]) → [20, 30, 40]
 math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
 math1([10]) → [110]
 */
public class FunctionalOne6Math1SolutionTest {

    FunctionalOne6Math1Solution calc = new FunctionalOne6Math1Solution();

    @Test
    public void givenList123ReturnList203040(){
        ArrayList<Integer> list  = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(20);
        expected.add(30);
        expected.add(40);

        assertEquals(expected, calc.math1(list));
    }

    @Test
    public void givenList68681ReturnList7090709020(){
        ArrayList<Integer> list  = new ArrayList<Integer>();
        list.add(6);
        list.add(8);
        list.add(6);
        list.add(8);
        list.add(1);

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(70);
        expected.add(90);
        expected.add(70);
        expected.add(90);
        expected.add(20);

        assertEquals(expected, calc.math1(list));
    }
}
