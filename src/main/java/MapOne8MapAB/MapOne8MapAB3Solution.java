package MapOne8MapAB;

import java.util.Map;

/**
 * Created by trevorgraham on 04/07/2017.
 * Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map
 * (but not both), set the other to have that same value in the map.

 mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
 mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
 mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
 */
public class MapOne8MapAB3Solution {
    public Map<String, String> mapAB3(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            return map;
        }
        if(map.containsKey("a")){
            map.put("b", map.get("a"));
            return map;
        }
        if(map.containsKey("b")){
            map.put("a", map.get("b"));
            return map;
        }

        return map;
    }

}
