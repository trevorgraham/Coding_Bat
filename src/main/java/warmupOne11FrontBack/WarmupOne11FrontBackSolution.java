package warmupOne11FrontBack;

/**
 * Created by trevorgraham on 21/07/2017.
 * Given a string, return a new string where the first and last chars have been exchanged.

 frontBack("code") → "eodc"
 frontBack("a") → "a"
 frontBack("ab") → "ba"
 */
public class WarmupOne11FrontBackSolution {
    public String frontBack(String str) {
        if(str.length() >1) {
            String front = str.substring(0, 1);
            String end = str.substring(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);
            return end + middle + front;
        }
        return str;
    }
}
