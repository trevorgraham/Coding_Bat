package arrayOne5Sum3;

/**
 * Created by trevorgraham on 11/07/2017.
 * Given an array of ints length 3, return the sum of all the elements.

 sum3([1, 2, 3]) → 6
 sum3([5, 11, 2]) → 18
 sum3([7, 0, 0]) → 7
 */
public class ArrayOne5Sum3Solution {

    public int sum3(int[] nums) {
        int a =0;

        for(int i= 0; i<nums.length; i++){
            a = nums[i]+a;
        }
        return a;
    }

}
