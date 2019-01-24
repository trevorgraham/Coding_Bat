package CodingBatTests;

import mapOne5Topping2.MapOne5Topping2Solution;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 19/06/2017.
 * Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream"
 * has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value
 * to "nuts".

 topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
 topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
 topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
 */
public class MapOne5Topping2SolutionTest {
    private MapOne5Topping2Solution mapTest;

    @Before
    public void setup(){
        mapTest = new MapOne5Topping2Solution();
    }

    @Test
    public void givenIceCreamCherryReturnYoghurtCherry(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("ice cream", "cherry");

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("ice cream", "cherry");
        expected.put("yogurt", "cherry");

        assertEquals(expected, mapTest.topping2(map));

    }

    @Test
    public void givenSpinachDirtAndIceCreamCherryReturnSpinachNutsIceCreamCherryYogurtCherry(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("spinach","dirt");
        map.put("ice cream", "cherry");

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("spinach","nuts");
        expected.put("ice cream", "cherry");
        expected.put("yogurt", "cherry");


        assertEquals(expected, mapTest.topping2(map));

    }

    @Test
    public void givenYogurtSaltReturnYoghurtSalt(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("spinach","salt");

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("spinach","salt");

        assertEquals(expected, mapTest.topping2(map));

    }
}
