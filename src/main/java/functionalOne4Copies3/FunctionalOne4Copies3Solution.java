package functionalOne4Copies3;

import java.util.List;

/**
 * Created by trevorgraham on 26/07/2017.
 * Given a list of strings, return a list where each string is replaced by 3 copies of the string
 * concatenated together.

 copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
 copies3(["24", "a", ""]) → ["242424", "aaa", ""]
 copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]

 */
public class FunctionalOne4Copies3Solution {
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(n ->n + n + n);
        return strings;

    }
}
