package logicTwo6CloseFar;

/**
 * Created by trevorgraham on 12/09/2017.
 * Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while
 * the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the
 * absolute value of a number.

 closeFar(1, 2, 10) → true
 closeFar(1, 2, 3) → false
 closeFar(4, 1, 3) → true
 */
public class LogicTwo6CloseFarSolution {
    public boolean closeFar(int a, int b, int c){
        int diff1 = Math.abs(a - b);
        int diff2 = Math.abs(a - c);
        int diff3 = Math.abs(b - c);

        if((diff1 <=1 && diff2 >=2) || (diff2 <=1 && diff1 >=2)) return true;

        return false;
    }
}
