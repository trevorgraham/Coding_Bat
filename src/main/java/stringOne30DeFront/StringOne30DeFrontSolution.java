package stringOne30DeFront;

/**
 * Created by trevorgraham on 22/10/2017.
 * Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
 * and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


 deFront("Hello") → "llo"
 deFront("java") → "va"
 deFront("away") → "aay"
 */
public class StringOne30DeFrontSolution {
    public String DeFront(String str){
        String result = "";
        if(str.length()>=2){
            if(str.charAt(0)=='a' && str.charAt(1)=='b'){
                result = str;
            }else if(str.charAt(0)=='a'){
                result = "a" +str.substring(2);
            }else if(str.charAt(1)=='b'){
                result = str.substring(1);
            }else{
                result = str.substring(2);
            }
        }
        if(str.length()<2 && str.charAt(0)=='a') result ="a";

        return result;
    }
}
