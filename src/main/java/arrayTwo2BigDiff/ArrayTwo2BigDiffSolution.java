package arrayTwo2BigDiff;

/**
 * Created by trevorgraham on 18/07/2017.
 * Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
 * Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

 bigDiff([10, 3, 5, 6]) → 7
 bigDiff([7, 2, 10, 9]) → 8
 bigDiff([2, 10, 7, 2]) → 8
 */
public class ArrayTwo2BigDiffSolution {
    public int bigDiff(int[] nums) {
        int result;
        int max = 0;
        int min = nums[0];

        for(int i = 0; i<nums.length; i++){

            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        result = max - min;
        return result;
    }
}
