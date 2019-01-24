package stringOne31StartWord;

/**
 * Created by trevorgraham on 22/10/2017.
 * Given a string and a second "word" string, we'll say that the word matches the string if it appears at the
 * front of the string, except its first char does not need to match exactly. On a match, return the front of the
 * string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and
 * "xip" returns "hip". The word will be at least length 1.


 startWord("hippo", "hi") → "hi"
 startWord("hippo", "xip") → "hip"
 startWord("hippo", "i") → "h"
 */
public class StringOne31StartOneSolution {
    public String startWord(String str, String word){
        int required =word.length();
        String result ="";
        if(str.length()<word.length()) return result;

        if(str.substring(0,required).equals(word) || str.substring(1,required).equals(word.substring(1))){
            result= str.substring(0,required);
        }
        return result;




    }



}
