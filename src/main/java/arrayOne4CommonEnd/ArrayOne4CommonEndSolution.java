package arrayOne4CommonEnd;

/**
 * Created by trevorgraham on 28/05/2017.
 * Given 2 arrays of ints, a and b, return true if they have the same first element
 * or they have the same last element. Both arrays will be length 1 or more.

 commonEnd([1, 2, 3], [7, 3]) → true
 commonEnd([1, 2, 3], [7, 3, 2]) → false
 commonEnd([1, 2, 3], [1, 3]) → true
 */

public class ArrayOne4CommonEndSolution {
    public boolean commonEnd(int[] a, int[] b) {
        int startA = a[0];
        int endA;
        int startB = b[0];
        int endB;


        if(a.length ==1){
            endA = a[0];
        }else{
            endA = a[a.length -1];
        }

        if(b.length ==1){
            endB = b[0];
        }else{
            endB = b[b.length -1];
        }

        if(startA == startB || endA == endB) {
            return true;
        }

        return false;
    }
}
