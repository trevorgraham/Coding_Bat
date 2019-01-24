package logicOne22LastDigit;

/**
 * Created by trevorgraham on 12/09/2017.
 * Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.
 * Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

 lastDigit(23, 19, 13) → true
 lastDigit(23, 19, 12) → false
 lastDigit(23, 19, 3) → true
 */
public class LogicOne22LastDigitSolution {
    public boolean lastDigit(int a, int b , int c){
        int aDigit = a%10;
        int bDigit = b%10;
        int cDigit = c%10;
        if(aDigit ==bDigit || aDigit==cDigit || bDigit==cDigit) return true;
        return false;
    }
}
