package mapTwo3Pairs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by trevorgraham on 17/07/2017.
 * Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string
 * add its first character as a key with its last character as the value.

 pairs(["code", "bug"]) → {"b": "g", "c": "e"}
 pairs(["man", "moon", "main"]) → {"m": "n"}
 pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

 */
public class MapTwo3PairsSolution {
    public Map<String, String> pairs(String[] strings) {
        Map map = new HashMap();

        for(int i = 0; i<strings.length; i++){
            map.put(strings[i].substring(0,1),strings[i].substring(strings[i].length()-1));
        }
        return map;

    }
}
