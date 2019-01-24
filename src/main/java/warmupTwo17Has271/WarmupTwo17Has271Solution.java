package warmupTwo17Has271;

/**
 * Created by trevorgraham on 11/09/2017.
 * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5,
 * followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the
 * correct value.

 has271([1, 2, 7, 1]) → true
 has271([1, 2, 8, 1]) → false
 has271([2, 7, 1]) → true
 */
public class WarmupTwo17Has271Solution {
    public boolean has271(int [] nums){
        if(nums.length <3) return false;
        for(int i =0; i<nums.length-2; i++){
            int initial = nums[i];
            if(nums[i+1] ==initial+5 && (nums[i+2]>=initial -3 && nums[i+2]<=initial+1)) return true;
        }
        return false;

    }
}
