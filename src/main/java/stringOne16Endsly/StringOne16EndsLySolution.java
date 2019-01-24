package stringOne16Endsly;

/**
 * Created by trevorgraham on 14/07/2017.
 * Given a string, return true if it ends in "ly".

 endsLy("oddly") → true
 endsLy("y") → false
 endsLy("oddy") → false
 */
public class StringOne16EndsLySolution {
    public boolean endsLy(String str) {
        if (str.length() <2) return false;

        String ending =str.substring(str.length() -2);
        if(ending.equals("ly")) return true;
        return false;
    }
}
