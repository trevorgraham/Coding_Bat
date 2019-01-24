package stringOne21AtFirst;

/**
 * Created by trevorgraham on 07/08/2017.
 * Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2,
 * use '@' for the missing chars.

 atFirst("hello") → "he"
 atFirst("hi") → "hi"
 atFirst("h") → "h@"
 */
public class StringOne21AtFirstSolution {
    public String atFirst(String str){
        if (str.length() ==0) return "@@";
        if(str.length() <2) return str+"@";
        return str.substring(0,2);
    }
}
