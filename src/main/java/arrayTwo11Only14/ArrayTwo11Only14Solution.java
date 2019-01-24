package arrayTwo11Only14;

/*
Given an array of ints, return true if every element is a 1 or a 4.


only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
 */

public class ArrayTwo11Only14Solution {
  public boolean only14(int [] nums){
    boolean result = true;
    for(int counter = 0; counter<nums.length; counter++){
      if(nums[counter]!=1 && nums[counter]!=4){
        result =false;
      }
    }
    return result;
  }

}
