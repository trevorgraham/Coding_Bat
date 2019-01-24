package mapTwo5FirstChar;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by trevorgraham on 19/07/2017.
 * Given an array of non-empty strings, return a Map<String, String> with a key for every different first character
 * seen, with the value of all the strings starting with that character appended together in the order they appear
 * in the array.

 firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
 firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
 firstChar([]) → {}
 */
public class MapTwo5FirstCharSolution {
    public Map<String, String> firstChar(String[] strings) {
        Map map = new HashMap();

        for(int i = 0; i<strings.length;i++){
                String first = String.valueOf(strings[i].charAt(0));

                if (map.containsKey(first)){
                    String val = map.get(first) + strings[i];
                    map.put(first, val);
                }else{
                    map.put(first, strings[i]);
                }
        }
        return map;
    }
}
