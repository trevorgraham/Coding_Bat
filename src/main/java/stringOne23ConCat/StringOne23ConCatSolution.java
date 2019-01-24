package stringOne23ConCat;

/**
 * Created by trevorgraham on 17/08/2017.
 * Given two strings, append them together (known as "concatenation") and return the result. However,
 * if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

 conCat("abc", "cat") → "abcat"
 conCat("dog", "cat") → "dogcat"
 conCat("abc", "") → "abc"

 */
public class StringOne23ConCatSolution {
    public String conCat(String a , String b){


        if((a.length() !=0 && b.length() !=0) && (a.substring(a.length()-1, a.length()).equals(b.substring(0,1)))){
            String bEnd=b.substring(1);
            return a + bEnd;
        }else{
            return a+b;
        }
    }
}
