package mapOne6Topping3;

import java.util.Map;

/**
 * Created by trevorgraham on 03/07/2017.
 * Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value,
 * set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".

 topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
 topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
 topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries":
 "ketchup"}

 */
public class MapOne6Topping3Solution {
    public Map<String, String> topping3(Map<String, String> map) {
        if(map.containsKey("potato")){
            map.put("fries", map.get("potato"));
        }
        if(map.containsKey("salad")){
            map.put("spinach", map.get("salad"));
        }
    return map;
    }
}