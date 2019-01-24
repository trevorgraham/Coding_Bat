package mapTwo2WordLen;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by trevorgraham on 17/07/2017.
 * Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
 * and the value is that string's length.

 wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
 wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
 wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
 */
public class MapTwo2WordLenSolution {
    public Map<String, Integer> wordLen(String[] strings) {
        Map map = new HashMap();

        for(int i = 0; i<strings.length; i++){
            map.put(strings[i], strings[i].length());
        }
        return map;
    }
}
