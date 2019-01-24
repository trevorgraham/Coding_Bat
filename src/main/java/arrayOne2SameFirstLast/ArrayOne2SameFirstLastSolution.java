package arrayOne2SameFirstLast;

/**
 * Created by trevorgraham on 24/05/2017.
 * Given an array of ints, return true if the array is length 1 or more,
 * and the first element and the last element are equal.

 sameFirstLast([1, 2, 3]) → false
 sameFirstLast([1, 2, 3, 1]) → true
 sameFirstLast([1, 2, 1]) → true
 */
public class ArrayOne2SameFirstLastSolution {
    public boolean sameFirstLast(int[] nums) {
        int a = nums.length;
        if (a>=1 && nums[0] == nums[a-1]){
            return true;
        }
        return false;
    }

}
