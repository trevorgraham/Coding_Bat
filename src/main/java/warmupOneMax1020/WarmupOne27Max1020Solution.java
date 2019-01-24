package warmupOneMax1020;

/**
 * Created by trevorgraham on 19/08/2017.
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
 * or return 0 if neither is in that range.

 max1020(11, 19) → 19
 max1020(19, 11) → 19
 max1020(11, 9) → 11
 */
public class WarmupOne27Max1020Solution {

    public int max1020(int a, int b ){
        if(a <10 || a>20){
            a = 0;
        }

        if(b <10 || b>20){
            b = 0;
        }

        if(a > b ){
            return a;
        }else if(b > a){
            return b;
        }else{
            return 0;
        }
    }
}
