package stringOne5ExtraEnd;

/**
 * Created by trevorgraham on 13/06/2017.
 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length
 * will be at least 2.

 extraEnd("Hello") → "lololo"
 extraEnd("ab") → "ababab"
 extraEnd("Hi") → "HiHiHi"
 */
public class StringOne5ExtraEndSolution {
    public String extraEnd(String str) {
        String temp = str.substring(str.length()-2);
        return temp + temp + temp;

    }


}
