package warmupTwo7Last2;

/**
 * Created by trevorgraham on 16/07/2017.
 * Given a string, return the count of the number of times that a substring length 2 appears in the string
 * and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

 last2("hixxhi") → 1
 last2("xaxxaxaxx") → 1
 last2("axxxaaxx") → 2
 */
public class WarmupTwo7Last2Solution {
    public int last2(String str) {
        if (str.length() <2) return 0;

        int result = 0;
        String backend = str.substring(str.length() -2);
        String front ="";
        for(int i = 0; i<str.length()-2;i++){
            front=str.substring(i,i+2);
            if(backend.equals(front)){
                result = result+1;
            }
        }

        return result;
    }
}
