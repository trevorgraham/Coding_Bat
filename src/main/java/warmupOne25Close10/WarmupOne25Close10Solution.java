package warmupOne25Close10;

/**
 * Created by trevorgraham on 18/08/2017.
 * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
 * Note that Math.abs(n) returns the absolute value of a number.

 close10(8, 13) → 8
 close10(13, 8) → 8
 close10(13, 7) → 0
 */
public class WarmupOne25Close10Solution {

    public int close10(int a, int b) {
        int diffA = 10 - a;
        int diffB = 10 - b;
        if (Math.abs(diffA) < Math.abs(diffB)) return a;
        if (Math.abs(diffB) < Math.abs(diffA)) return b;

        return 0;
    }
}
