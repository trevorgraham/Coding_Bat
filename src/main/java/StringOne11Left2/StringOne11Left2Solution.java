package StringOne11Left2;

/**
 * Created by trevorgraham on 13/07/2017.
 * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

 left2("Hello") → "lloHe"
 left2("java") → "vaja"
 left2("Hi") → "Hi"
 */
public class StringOne11Left2Solution {
    public String left2(String str) {
        String first2 = str.substring(0,2);
        String ending = str.substring(2);
        return ending + first2;

    }
}
