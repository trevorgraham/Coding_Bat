package functionalOne9NoX;

import java.util.List;

import static com.sun.jmx.snmp.ThreadContext.contains;

/**
 * Created by trevorgraham on 31/07/2017.
 * Given a list of strings, return a list where each string has all its "x" removed.

 noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
 noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
 noX(["x"]) → [""]

 */
public class FunctionalOne9NoXSolution {
    public List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replace("x",""));
        return strings;
    }
}
