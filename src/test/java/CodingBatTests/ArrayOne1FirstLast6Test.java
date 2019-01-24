package CodingBatTests;

import arrayOne1FirstLast6.ArrayOne1FirstLast6Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 13/06/2017.
 */
public class ArrayOne1FirstLast6Test {
    ArrayOne1FirstLast6Solution calc = new ArrayOne1FirstLast6Solution();
    int[] array621={6,2,1};
    int[] array162={1,6,2};
    int[] array126={1,2,6};
    int[] array1261={1,2,6,1};
    int[] array12616={1,2,6,1,6};

    @Test
    public void givenAnArray621ReturnTrue(){
        assertEquals(true, calc.firstLast6(array621));
    }

    @Test
    public void givenAnArray162ReturnFalse(){
        assertEquals(false, calc.firstLast6(array162));
    }

    @Test
    public void givenAnArray126ReturnTrue(){
        assertEquals(true, calc.firstLast6(array126));
    }

    @Test
    public void givenAnArray1261ReturnFalse(){
        assertEquals(false, calc.firstLast6(array1261));
    }

    @Test
    public void givenAnArray12616ReturnTrue(){
        assertEquals(true, calc.firstLast6(array12616));
    }

}
