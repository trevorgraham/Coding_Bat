package warmupOne4Diff21;

/**
 * Created by trevorgraham on 24/05/2017.
 * Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.

 diff21(19) → 2
 diff21(10) → 11
 diff21(21) → 0
 */
public class WarmupOne4Diff21Solution {
    public int diff21(int n) {
    if(n<=21) return 21- n;
        return (n-21)*2;
    }
}
