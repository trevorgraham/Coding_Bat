package warmupTwo4DoubleX;

/**
 * Created by trevorgraham on 15/07/2017.
 * Given a string, return true if the first instance of "x" in the string is immediately followed
 * by another "x".

 doubleX("axxbb") → true
 doubleX("axaxax") → false
 doubleX("xxxxx") → true
 */
public class WarmupTwo4DoubleXSolution {

    public boolean doubleX(String str) {
        int i = str.indexOf("x");
        if(i == -1) return false;

        if (str.length() >= i+2 && str.substring(i, i+2).equals("xx") ) return true;
        return false;

    }
}
