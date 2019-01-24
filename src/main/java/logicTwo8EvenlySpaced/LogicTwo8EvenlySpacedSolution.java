package logicTwo8EvenlySpaced;

/**
 * Created by trevorgraham on 24/10/2017.
 * Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three
 * values are evenly spaced, so the difference between small and medium is the same as the difference between
 * medium and large.


 evenlySpaced(2, 4, 6) → true
 evenlySpaced(4, 6, 2) → true
 evenlySpaced(4, 6, 3) → false
 */
public class LogicTwo8EvenlySpacedSolution {
    public boolean evenlySpaced(int a, int b, int c) {
        //if(c-b == b-a ||c-a == a-b || b-c ==c-a ||b-a ==a-c || a-c == a-b || a-b == b-c) return true;
        int result1 = Math.abs(c - b);
        int result2 = Math.abs(c - a);
        int result3 = Math.abs(a - b);
        if (result1 == result2 ||result1 == result3 || result2 == result3) return true;
        return false;
    }
}
