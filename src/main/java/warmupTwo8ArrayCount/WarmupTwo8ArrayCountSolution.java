package warmupTwo8ArrayCount;

/**
 * Created by trevorgraham on 17/07/2017.
 * Given an array of ints, return the number of 9's in the array.

 arrayCount9([1, 2, 9]) → 1
 arrayCount9([1, 9, 9]) → 2
 arrayCount9([1, 9, 9, 3, 9]) → 3
 */
public class WarmupTwo8ArrayCountSolution {
    public int arrayCount9(int[] nums) {
        int result =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==9){
                result = result+1;
            }
        }


        return result;

    }

}
