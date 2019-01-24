package logicOne7Love6;

/**
 * Created by trevorgraham on 18/07/2017.
 */
public class LogicOne7Love6Solution {
    public boolean love6(int a, int b) {
        if((a ==6 || b ==6) || a + b ==6 || a - b == 6 || b - a == 6){
            return true;
        }
        return false;
    }
}
