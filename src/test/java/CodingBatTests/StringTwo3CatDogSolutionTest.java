package CodingBatTests;

import org.junit.Test;
import stringTwo3CatDog.StringTwo3CatDogSolution;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by trevorgraham on 17/07/2017.
 * Return true if the string "cat" and "dog" appear the same number of times in the given string.

 catDog("catdog") → true
 catDog("catcat") → false
 catDog("1cat1cadodog") → true
 */
public class StringTwo3CatDogSolutionTest {
    StringTwo3CatDogSolution calc = new StringTwo3CatDogSolution();

    @Test
    public void givenaStringCatDogReturnTrue(){
        assertTrue(calc.catDog("catdog"));
    }

    @Test
    public void givenaStringCatCatReturnFalse(){
        assertFalse(calc.catDog("catcat"));
    }

    @Test
    public void givenaString1Cat1CaDoDogReturnTrue(){
        assertTrue(calc.catDog("1cat1cadodog"));
    }
}
