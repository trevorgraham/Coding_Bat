package stringOne8WithoutEnd;

/**
 * Created by trevorgraham on 28/06/2017.
 * Given a string, return a version without the first and last char, so "Hello" yields "ell".
 * The string length will be at least 2.

 withoutEnd("Hello") → "ell"
 withoutEnd("java") → "av"
 withoutEnd("coding") → "odin"

 */
public class StringOne8WithoutEndSolution {
    public String withoutEnd(String str) {
        String middle= str.substring(1,(str.length() -1));

        return middle;
    }
}
