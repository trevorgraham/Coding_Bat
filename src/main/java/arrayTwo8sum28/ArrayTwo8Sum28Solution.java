package arrayTwo8sum28;

/*
Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.


sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
 */

public class ArrayTwo8Sum28Solution {
  public boolean sum28(int[] nums){
    int twoTotal =0;
    boolean result = false;

    for(int counter = 0; counter<nums.length; counter++){
      if(nums[counter]==2){
        twoTotal = twoTotal+2;
      }
    }

    if(twoTotal ==8) result =true;
    return result;
  }

}
