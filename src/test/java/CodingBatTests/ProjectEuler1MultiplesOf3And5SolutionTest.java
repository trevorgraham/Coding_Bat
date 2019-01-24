package CodingBatTests;

import org.junit.Test;
import projectEuler1MultiplesOf3And5.ProjectEuler1MultiplesOf3and5Solution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 22/07/2017.
 */
public class ProjectEuler1MultiplesOf3And5SolutionTest {
    ProjectEuler1MultiplesOf3and5Solution calc = new ProjectEuler1MultiplesOf3and5Solution();

    @Test
    public void given1000return266333(){
        assertEquals(266333, calc.threeAndFiveUnderOneThousand(1000));
    }

    @Test
    public void given10return23(){
        assertEquals(23, calc.threeAndFiveUnderOneThousand(10));
    }
}
