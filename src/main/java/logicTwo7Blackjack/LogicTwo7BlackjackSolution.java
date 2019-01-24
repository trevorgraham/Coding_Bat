package logicTwo7Blackjack;

/**
 * Created by trevorgraham on 14/10/2017.
 * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they
 * both go over.


 blackjack(19, 21) → 21
 blackjack(21, 19) → 21
 blackjack(19, 22) → 19
 */
public class LogicTwo7BlackjackSolution {
    public int blackjack(int a, int b){
        int result = 0;
        if(a>21 && b>21){
            result = 0;
        }else if(a<=21 && b <=21) {
            if(a>b) {
                result = a;
            }else {
                result =b;
            }
        }
        else if(a<=21 && b>21){
            result = a;
        }else{
            result = b;
        }

        return result;
    }
}
