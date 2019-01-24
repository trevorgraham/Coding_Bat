package stringOne18TwoChar;

/**
 * Created by trevorgraham on 26/07/2017.
 *
 * Given a string and an index, return a string length 2 starting at the given
 * index. If the index is too big or too small to define a string length 2,
 * use the first 2 chars. The string length will be at least 2.

 twoChar("java", 0) → "ja"
 twoChar("java", 2) → "va"
 twoChar("java", 3) → "ja"
 */
public class StringOne18TwoCharSolution {
    public String twoChar(String str, int index) {
        String result ="";
        if(str.length()< index+2 || index <0) {
            result=str.substring(0,2);
            return result;
        }
        result = str.substring(index, index+2);
        return result;
    }
}
