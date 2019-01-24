package StringOne27MinCat;

/**
 * Created by trevorgraham on 04/09/2017.
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the strings are different lengths, omit chars from the longer string so it is the same
 * length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

 minCat("Hello", "Hi") → "loHi"
 minCat("Hello", "java") → "ellojava"
 minCat("java", "Hello") → "javaello"
 */
public class StringOne27MinCatSolution {

    public String minCat(String a, String b){
        int lenA = a.length();
        int lenB = b.length();

        String start = "";
        String end = "";

        if(lenA >lenB) {
            start = a.substring(lenA - lenB);
            end = b;
            return start + end;
        }

        if(lenB > lenA){
            end =b.substring(lenB, lenA);
            start= a;
            return start +end;
        }

        return a +b;
    }
}
