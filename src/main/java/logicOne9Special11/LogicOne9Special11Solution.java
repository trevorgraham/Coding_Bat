package logicOne9Special11;

/**
 * Created by trevorgraham on 10/07/2017.
 * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
 * Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod

 specialEleven(22) → true
 specialEleven(23) → true
 specialEleven(24) → false
 */
public class LogicOne9Special11Solution {
    public boolean specialEleven(int n) {
        if(n%11 <=1){
            return true;
        }
        return false;
    }
}
