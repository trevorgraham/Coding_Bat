package logicOne24WithoutDoubles;

/**
 * Created by trevorgraham on 08/10/2017.
 * Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two
 * dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.


 withoutDoubles(2, 3, true) → 5
 withoutDoubles(3, 3, true) → 7
 withoutDoubles(3, 3, false) → 6
 */
public class LogicOne24WithoutDoublesSolution {
    public int withoutDoubles(int die1, int die2, boolean noDoubles){
        if(die1 + die2 ==12 && noDoubles){
            return 7;
        }
        if(die1 ==die2 && noDoubles){
            return die1 + die2 +1;
        }
        return die1 + die2;
    }
}
