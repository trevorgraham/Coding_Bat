package warmupOne3SumDouble;

/**
 * Created by trevorgraham on 24/05/2017.
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.

 sumDouble(1, 2) → 3
 sumDouble(3, 2) → 5
 sumDouble(2, 2) → 8
 */

public class WarmupOne3SumDoubleSolution {
    public int SumDouble(int a, int b){
        if (a == b) return (a + b)*2;
        return a + b;
    }
}
