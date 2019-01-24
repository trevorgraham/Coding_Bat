package arrayTwo4Sum13;

/**
 * Created by trevorgraham on 18/07/2017.
 * Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
 * so it does not count and numbers that come immediately after a 13 also do not count.

 sum13([1, 2, 2, 1]) → 6
 sum13([1, 1]) → 2
 sum13([1, 2, 2, 1, 13]) → 6
 */
public class ArrayTwo4Sum13Solution {
    public int sum13(int[] nums) {
        int result = 0;
        for(int i = 0; i<nums.length; i++){

            if(nums[i] == 13){
                result = result -13;
                if(i +1 <nums.length){
                    result = result - nums[i +1];
                }
            }



            result += nums[i];
        }
        return result;
    }
}
