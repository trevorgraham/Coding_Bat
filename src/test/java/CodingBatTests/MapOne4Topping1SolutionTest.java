package CodingBatTests;

import mapOne4Topping1.MapOne4Topping1Solution;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by trevorgraham on 19/06/2017.
 * Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present,
 * set its value to "cherry". In all cases, set the key "bread" to have the value "butter".

 topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
 topping1({}) → {"bread": "butter"}
 topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}

 */
public class MapOne4Topping1SolutionTest {
    private MapOne4Topping1Solution testMap;

    @Before
    public void setup(){
        testMap = new MapOne4Topping1Solution();
    }

    @Test
    public void givenAnEmptyKeyreturnAMapBreadButter(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("","");

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("bread", "butter");

        assertEquals(expected, testMap.topping1(map));
    }

    @Test
    public void givenBreadCheesereturnAMapBreadButter(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("bread", "Cheese");

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("bread", "butter");

        assertEquals(expected, testMap.topping1(map));
    }

    @Test
    public void givenBreadCheesePairAndIceCreamVanillaPairReturnAMapBreadButterIceCreamCherry(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("bread", "cheese");
        map.put("ice cream", "vanilla");


        Map<String, String> expected = new HashMap<String, String>();
        expected.put("bread", "butter");
        expected.put("ice cream", "cherry");

        assertEquals(expected, testMap.topping1(map));
    }

    @Test
    public void givenBreadCheesePairHamPeasePuddingPairAndIceCreamVanillaPairReturnAMapBreadButterHamPeasePuddingIceCreamCherryMap(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("bread", "cheese");
        map.put("ham", "pease pudding");
        map.put("ice cream", "vanilla");


        Map<String, String> expected = new HashMap<String, String>();
        expected.put("bread", "butter");
        expected.put("ham", "pease pudding");
        expected.put("ice cream", "cherry");

        assertEquals(expected, testMap.topping1(map));
    }


}
