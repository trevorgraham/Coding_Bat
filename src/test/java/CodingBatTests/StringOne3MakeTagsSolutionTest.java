package CodingBatTests;

import org.junit.Test;
import stringOne3MakeTags.StringOne3MakeTagsSolution;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 24/05/2017.
 */
public class StringOne3MakeTagsSolutionTest {

    StringOne3MakeTagsSolution calc = new StringOne3MakeTagsSolution();

    @Test
    public void givenIAndYayReturnIYayI(){
        assertEquals("<i>Yay</i>", calc.makeTags("i", "Yay"));

    }

    @Test
    public void givenCiteAndBoooReturnICiteBoooCite(){
        assertEquals("<cite>Booo</cite>", calc.makeTags("cite", "Booo"));

    }
}
