package arrayTwo9More14;

/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */

public class ArrayTwo9More14Solution {
  public boolean more14(int [] nums){
    boolean result = false;
    int oneTotal = 0;
    int fourTotal =0;

    for(int counter =0; counter<nums.length; counter++){
      if (nums[counter]==1) oneTotal = oneTotal +1;
      if (nums[counter]==4) fourTotal = fourTotal +1;
    }
    if (oneTotal > fourTotal) result = true;
    return result;
  }

}
