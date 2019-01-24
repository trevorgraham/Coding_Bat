package warmupTwo9arrayFront9;

/**
 * Created by trevorgraham on 17/07/2017.
 * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array
 * length may be less than 4.

 arrayFront9([1, 2, 9, 3, 4]) → true
 arrayFront9([1, 2, 3, 4, 9]) → false
 arrayFront9([1, 2, 3, 4, 5]) → false
 */
public class WarmupTwo9ArrayFront9Solution {
    public boolean arrayFront9(int[] nums) {


        for (int i = 0; i < nums.length; i++ ){
            if(nums[i]==9) return true;
            if(i ==3) return false;
        }
        return false;
    }
}
