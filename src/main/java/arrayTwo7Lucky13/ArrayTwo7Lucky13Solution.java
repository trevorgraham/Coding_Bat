package arrayTwo7Lucky13;

/*
Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */

public class ArrayTwo7Lucky13Solution {

  public boolean lucky13(int[]nums){
    boolean one = true;
    boolean three= true;

    for(int counter = 0; counter< nums.length; counter++){
      if(nums[counter]==1){
        one =false;
      }
      if(nums[counter]==3){
        three= false;
      }
    }

    if(one == true && three == true) return true;
    return false;
  }

}
