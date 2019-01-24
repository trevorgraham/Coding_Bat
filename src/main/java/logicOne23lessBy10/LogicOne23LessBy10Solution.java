package logicOne23lessBy10;

/**
 * Created by trevorgraham on 12/09/2017.
 * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

 lessBy10(1, 7, 11) → true
 lessBy10(1, 7, 10) → false
 lessBy10(11, 1, 7) → true
 */
public class LogicOne23LessBy10Solution {
    public boolean lessBy10(int a, int b, int c){
        int diff1 = Math.abs(a-b);
        int diff2 = Math.abs(a-c);
        int diff3 = Math.abs(b-c);

        if (diff1 >=10 || diff2 >=10 || diff3 >=10) return true;
        return false;
    }

}
