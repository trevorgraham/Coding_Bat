package mapOne1MapBully;

import java.util.Map;

/**
 * Created by trevorgraham on 12/06/2017.
 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
 * and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the
 * empty string.

 mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
 mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
 mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */
public class MapOne1MapBullySolution {
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")){
            String tmp = map.get("a");
            map.put("a", "");
            map.put("b", tmp);
        }
        return map;
    }
}
