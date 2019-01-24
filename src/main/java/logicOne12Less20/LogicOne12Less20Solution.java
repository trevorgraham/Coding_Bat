package logicOne12Less20;

/**
 * Created by trevorgraham on 23/07/2017.
 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return
 * true, but 40 returns false. See also: Introduction to Mod

 less20(18) → true
 less20(19) → true
 less20(20) → false
 */
public class LogicOne12Less20Solution {
    public boolean less20(int n) {

        if(n%20 >=18 ) return true;
        return false;
    }
}
