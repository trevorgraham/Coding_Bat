package functionalOne5MoreY;

import java.util.List;

/**
 * Created by trevorgraham on 26/07/2017.
 * Given a list of strings, return a list where each string has "y" added at its start and end.

 moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
 moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
 moreY(["yay"]) → ["yyayy"]
 */
public class FunctionalOne5MoreYSolution {
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n ->"y" + n + "y");
        return strings;
    }
}
