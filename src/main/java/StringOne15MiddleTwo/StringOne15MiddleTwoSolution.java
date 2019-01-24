package StringOne15MiddleTwo;

/**
 * Created by trevorgraham on 14/07/2017.
 * Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
 * The string length will be at least 2.

 middleTwo("string") → "ri"
 middleTwo("code") → "od"
 middleTwo("Practice") → "ct"
 */
public class StringOne15MiddleTwoSolution {
    public String middleTwo(String str) {
        int halfLength = str.length()/2;
        return str.substring(halfLength -1, halfLength +1);

    }
}
