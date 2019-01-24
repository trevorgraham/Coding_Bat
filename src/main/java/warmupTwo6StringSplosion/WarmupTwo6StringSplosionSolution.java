package warmupTwo6StringSplosion;

/**
 * Created by trevorgraham on 16/07/2017.
 * Given a non-empty string like "Code" return a string like "CCoCodCode".

 stringSplosion("Code") → "CCoCodCode"
 stringSplosion("abc") → "aababc"
 stringSplosion("ab") → "aab"
 */
public class WarmupTwo6StringSplosionSolution {
    public String stringSplosion(String str) {
        String temp = "";

        for(int i =0; i <=str.length(); i++){

            temp = temp +str.substring(0,i);
        }
        return temp;
    }
}
