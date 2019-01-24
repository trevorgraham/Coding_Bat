package warmupTwo10Array123;

/**
 * Created by trevorgraham on 17/07/2017.
 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

 array123([1, 1, 2, 3, 1]) → true
 array123([1, 1, 2, 4, 1]) → false
 array123([1, 1, 2, 1, 2, 3]) → true

 */
public class WarmupTwo10Array123Solution {
    public boolean array123(int[] nums) {
        if(nums.length <3) return false;

        for(int i =0; i<nums.length-2; i++){
            if (nums[i]==1 && nums[i +1]== 2 && nums[i+2] == 3){
                return true;
            }
        }
        return false;
    }

}
