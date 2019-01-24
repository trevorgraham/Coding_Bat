package stringTwo1DoubleChar;

/**
 * Created by trevorgraham on 27/05/2017.
 * Given a string, return a string where for every char in the original, there are two chars.

 doubleChar("The") → "TThhee"
 doubleChar("AAbb") → "AAAAbbbb"
 doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class StringTwo1DoubleCharSolution {

    public String doubleChar(String str) {
        String result="";
        for(int i = 0; i <str.length(); i++){
        result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

}
