package logicOne10More20;

/**
 * Created by trevorgraham on 18/07/2017.
 */
public class LogicOne10More20Solution {
    public boolean more20(int n) {
        int remainder = n%20;
        if (remainder ==1 ||remainder ==2) return true;
        return false;
    }

}
