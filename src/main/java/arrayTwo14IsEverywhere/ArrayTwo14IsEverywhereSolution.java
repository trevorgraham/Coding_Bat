package arrayTwo14IsEverywhere;
/*
We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the
array, at least one of the pair is that value. Return true if the given value is everywhere in
the array.


isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
 */

public class ArrayTwo14IsEverywhereSolution {
  public boolean isEverywhere(int[] nums, int val){
    boolean result = true;

    for(int counter=0; counter<nums.length-1; counter++){
      if(nums[counter]!=val && nums[counter+1] !=val){
        result =false;
      }
    }
    return result;
  }

}
