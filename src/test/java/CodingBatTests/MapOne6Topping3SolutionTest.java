package CodingBatTests;

import mapOne6Topping3.MapOne6Topping3Solution;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 03/07/2017.
 * Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value,
 * set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the
 * key "spinach".

 topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
 topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
 topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup",
 "fries": "ketchup"}

 */

public class MapOne6Topping3SolutionTest {
    private MapOne6Topping3Solution mapTest;

    @Before
    public void setup(){
        mapTest=new MapOne6Topping3Solution();
    }

    @Test
    public void givenMapPotatoKetchupReturnPotatoKetchupFriesKetchup(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("potato", "ketchup");

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("potato", "ketchup");
        expected.put("fries", "ketchup");
        assertEquals(expected, mapTest.topping3(map));
    }

    @Test
    public void givenMapSaladOilPotatoKetchupReturnSaladOilSpinachOilPotatoKetchupFriesKetchup(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("salad", "oil");
        map.put("potato", "ketchup");

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("salad","oil");
        expected.put("spinach", "oil");
        expected.put("potato", "ketchup");
        expected.put("fries", "ketchup");
        assertEquals(expected, mapTest.topping3(map));
    }
}
