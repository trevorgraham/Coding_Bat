package logicOne19TwoAsOne;

/**
 * Created by trevorgraham on 15/08/2017.
 * Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

 twoAsOne(1, 2, 3) → true
 twoAsOne(3, 1, 2) → true
 twoAsOne(3, 2, 2) → false
 */
public class LogicOne19TwoAsOneSolution {
    public boolean twoAsOne(int a, int b, int c){
        if(a + b ==c) return true;
        if(a + c ==b) return true;
        if(b + c ==a) return true;
        return false;
    }
}
