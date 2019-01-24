package arrayOne22MidThree;

/**
 * Created by trevorgraham on 17/10/2017.
 * Given an array of ints of odd length, return a new array length 3 containing the elements from the
 * middle of the array. The array length will be at least 3.


 midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
 midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
 midThree([1, 2, 3]) → [1, 2, 3]
 */
public class ArrayOne22MidThreeSolution {
    public int[] midThree(int[]nums){

        int a = nums.length/2;
        int[] midnums={nums[a-1], nums[a],nums[a+1]};
        return midnums;
    }
}
