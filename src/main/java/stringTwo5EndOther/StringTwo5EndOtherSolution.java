package stringTwo5EndOther;

/**
 * Created by trevorgraham on 18/07/2017.
 * Given two strings, return true if either of the strings appears at the very end of the other string,
 * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
 * Note: str.toLowerCase() returns the lowercase version of a string.

 endOther("Hiabc", "abc") → true
 endOther("AbC", "HiaBc") → true
 endOther("abc", "abXabc") → true
 */
public class StringTwo5EndOtherSolution {
    public boolean endOther(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();


        if(aLower.endsWith(bLower)) return true;
        if(bLower.endsWith(aLower)) return true;
        return false;
    }
}
