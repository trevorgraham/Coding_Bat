package arrayTwo13No14;

/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */

public class ArrayTwo13No14Solution {
  public boolean no14(int [] nums){
    boolean result = true;
    boolean one =false;
    boolean four =false;

    for(int counter = 0; counter<nums.length; counter++){
      if(nums[counter]==1) one =true;
      if(nums[counter]==4) four=true;
    }
    if(one && four) result =false;
    return result;
  }

}
