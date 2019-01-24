package functionalOne3AddStar;

import java.util.List;

/**
 * Created by trevorgraham on 27/05/2017.
 * Given a list of strings, return a list where each string has "*" added at its end.

 addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
 addStar(["hello", "there"]) → ["hello*", "there*"]
 addStar(["*"]) → ["**"]

 */

public class FunctionalOne3AddStarSolution {
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n ->n +"*");
            return strings;
    }

}
