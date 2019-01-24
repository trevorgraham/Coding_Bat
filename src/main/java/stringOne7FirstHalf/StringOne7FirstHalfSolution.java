package stringOne7FirstHalf;

import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 * Created by trevorgraham on 28/06/2017.
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

 firstHalf("WooHoo") → "Woo"
 firstHalf("HelloThere") → "Hello"
 firstHalf("abcdef") → "abc"
 */
public class StringOne7FirstHalfSolution {
    public String firstHalf(String str) {
        String fHalf= str.substring(0,(str.length() / 2));
        return fHalf;


    }
}
