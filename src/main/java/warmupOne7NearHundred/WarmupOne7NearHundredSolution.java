package warmupOne7NearHundred;

/**
 * Created by trevorgraham on 14/07/2017.
 * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num)
 * computes the absolute value of a number.

 nearHundred(93) → true
 nearHundred(90) → true
 nearHundred(89) → false
 */
public class WarmupOne7NearHundredSolution {

    public boolean nearHundred(int n) {
        if((n>=90 && n<= 110) ||(n>=190 && n<= 210)) return true;
        return false;
    }
}
