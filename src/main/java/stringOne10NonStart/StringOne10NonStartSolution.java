package stringOne10NonStart;

/**
 * Created by trevorgraham on 13/07/2017.
 * Given 2 strings, return their concatenation, except omit the first char of each.
 * The strings will be at least length 1.

 nonStart("Hello", "There") → "ellohere"
 nonStart("java", "code") → "avaode"
 nonStart("shotl", "java") → "hotlava"
 */
public class StringOne10NonStartSolution {
    public String nonStart(String a, String b) {
        String endA = a.substring(1);
        String endB = b.substring(1);
        return endA + endB;

    }
}
