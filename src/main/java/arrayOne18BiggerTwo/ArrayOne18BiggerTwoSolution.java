package arrayOne18BiggerTwo;

/**
 * Created by trevorgraham on 19/08/2017.
 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
 * Return the array which has the largest sum. In event of a tie, return a.

 biggerTwo([1, 2], [3, 4]) → [3, 4]
 biggerTwo([3, 4], [1, 2]) → [3, 4]
 biggerTwo([1, 1], [1, 2]) → [1, 2]
 */
public class ArrayOne18BiggerTwoSolution {

    public int[] biggerTwo(int[] a, int[] b) {
        int resultA = 0;
        int resultB = 0;

        for(int i =0; i<2; i++){
            resultA = resultA+a[i];
        }

        for(int i =0; i<2; i++){
            resultB = resultB+b[i];
        }


        if (resultB > resultA){
            return b;
        }else{
            return a;
        }
    }
}
