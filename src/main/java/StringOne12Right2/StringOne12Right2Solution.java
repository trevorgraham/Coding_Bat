package StringOne12Right2;

/**
 * Created by trevorgraham on 13/07/2017.
 * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
 * The string length will be at least 2.

 right2("Hello") → "loHel"
 right2("java") → "vaja"
 right2("Hi") → "Hi"
 */
public class StringOne12Right2Solution {

    public String right2(String str) {
        String strEnd = str.substring(str.length() -2);
        String strStart = str.substring(0, str.length() -2);
        return strEnd + strStart;
    }
}
