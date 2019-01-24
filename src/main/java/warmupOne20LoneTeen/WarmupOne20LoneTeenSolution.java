package warmupOne20LoneTeen;

/**
 * Created by trevorgraham on 16/08/2017.
 We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if
 one or the other is teen, but not both.

 loneTeen(13, 99) → true
 loneTeen(21, 19) → true
 loneTeen(13, 13) → false
 */
public class WarmupOne20LoneTeenSolution {
    public boolean loneTeen(int a, int b){
        if((a >=13 && a<=19) && (b >=13 && b<=19) ) return false;
        if((a <13 || a>19) && (b <13 || b>19) ) return false;
        return true;
    }
}
