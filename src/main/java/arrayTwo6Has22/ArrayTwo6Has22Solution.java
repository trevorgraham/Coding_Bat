package arrayTwo6Has22;

/*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.


has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
 */

public class ArrayTwo6Has22Solution {
  public boolean has22(int[] nums){
    if (nums.length < 2) return false;

    for(int counter=0; counter<nums.length-1; counter++){
      if (nums[counter] ==nums[counter+1] && nums[counter]==2) {
        return true;
      }
    }
    return false;
  }

}
