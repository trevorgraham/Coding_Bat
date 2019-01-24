package warmupOne12Front3;

/**
 * Created by trevorgraham on 21/07/2017.
 * Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3,
 * the front is whatever is there. Return a new string which is 3 copies of the front.

 front3("Java") → "JavJavJav"
 front3("Chocolate") → "ChoChoCho"
 front3("abc") → "abcabcabc"
 */
public class WarmupOne12Front3Solution {
    public String front3(String str) {
        String strFront ="";

        if(str.length()<3) {
            strFront = str;
        }else{
            strFront = str.substring(0,3);
        }
        return strFront +strFront + strFront;
    }
}
