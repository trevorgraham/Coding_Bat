package arrayOne19MakeMiddle;

/**
 * Created by trevorgraham on 06/09/2017.
 * Given an array of ints of even length, return a new array length 2 containing the middle two elements from the
 * original array. The original array will be length 2 or more.

 makeMiddle([1, 2, 3, 4]) → [2, 3]
 makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
 makeMiddle([1, 2]) → [1, 2]
 */
public class ArrayOne19MakeMiddleSolution {

    public int[] makeMiddle(int[] nums){
            int[] result = { nums[nums.length / 2 - 1], nums[nums.length / 2] };
            return result;
        }

}
