package CodingBatTests;

import logicOne1CigarParty.LogicOne1CigarPartySolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 24/05/2017.
 */
public class LogicOne1CigarPartySolutionTest {

    LogicOne1CigarPartySolution calc = new LogicOne1CigarPartySolution();

    @Test
    public void given30AndFalseReturnFalse(){
        assertEquals(false, calc.cigarParty(30,false) );
    }


    @Test
    public void given50AndFalseReturnTrue(){
        assertEquals(true, calc.cigarParty(50,false) );
    }

    @Test
    public void given70AndTrueReturnTrue(){
        assertEquals(true, calc.cigarParty(70,true) );
    }


    @Test
    public void given30AndTrueReturnFalse(){
        assertEquals(false, calc.cigarParty(30,true) );
    }

    @Test
    public void given70AndFalseReturnFalse(){
        assertEquals(false, calc.cigarParty(70,false) );
    }

}
