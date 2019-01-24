package CodingBatTests;

import org.junit.Test;
import stringThree1CountYZ.StringThree1CountYZSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 14/08/2017.
 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
 * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not
 * an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic
 * letter.)

 countYZ("fez day") → 2
 countYZ("day fez") → 2
 countYZ("day fyyyz") → 2
 */
public class StringThree1CountYZSolutionTest {
    StringThree1CountYZSolution calc = new StringThree1CountYZSolution();

    @Test
    public void givenStringReturnTheNumberOfWordsEndingWithYorZ(){
        assertEquals(1,calc.countYZ("Fez"));
        assertEquals(2, calc.countYZ("day fez"));
        assertEquals(3, calc.countYZ("One day FEZ HOLIDAY"));
    }
}
