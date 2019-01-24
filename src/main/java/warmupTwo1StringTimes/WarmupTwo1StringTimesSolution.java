package warmupTwo1StringTimes;

/**
 * Created by trevorgraham on 13/06/2017.
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.

 stringTimes("Hi", 2) → "HiHi"
 stringTimes("Hi", 3) → "HiHiHi"
 stringTimes("Hi", 1) → "Hi"
 */
public class WarmupTwo1StringTimesSolution {
    public String stringTimes(String str, int n) {
        String result = "";
            for(int i=0; i<n; i++){
                result+=str;
            }
        return result;
    }
}
