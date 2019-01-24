package warmupOne18In1020;

/**
 * Created by trevorgraham on 16/08/2017.
 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.

 in1020(12, 99) → true
 in1020(21, 12) → true
 in1020(8, 99) → false
 */
public class WarmupOne18In1020Solution {
    public boolean in1020(int a, int b){
        if((a>=10 && a<=20) || (b>=10 && b<=20)) return true;
        return false;
    }
}
