package arrayOne17Start1;

/**
 * Created by trevorgraham on 19/08/2017.
 * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first
 * element.

 start1([1, 2, 3], [1, 3]) → 2
 start1([7, 2, 3], [1]) → 1
 start1([1, 2], []) → 1
 */
public class ArrayOne17Start1Solution {

    public int Start1(int[] a, int[] b){
        int resultA = 0;
        int resultB = 0;
            if (a.length>0 && a[0] == 1) {
                resultA =1;
            }

            if  (b.length>0 && b[0] == 1){
                resultB =1;
            }


        return resultA + resultB;
    }


}
