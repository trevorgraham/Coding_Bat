package stringOne14WithoutEnd;

/**
 * Created by trevorgraham on 14/07/2017.
 * Given a string, return a version without both the first and last char of the string. The string may be any length,
 * including 0.

 withouEnd2("Hello") → "ell"
 withouEnd2("abc") → "b"
 withouEnd2("ab") → ""
 */
public class StringOne14WithoutEndSolution {
    public String withouEnd2(String str) {
        if(str.length() <=2) return "";
        return str.substring(1,str.length()-1);
    }

}
