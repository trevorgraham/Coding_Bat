package arrayOne24FrontPiece;

/**
 * Created by trevorgraham on 17/10/2017.
 * Given an int array of any length, return a new array of its first 2 elements.
 * If the array is smaller than length 2, use whatever elements are present.


 frontPiece([1, 2, 3]) → [1, 2]
 frontPiece([1, 2]) → [1, 2]
 frontPiece([1]) → [1]
 */
public class ArrayOne24FrontPieceSolution {
    public int[] frontPiece(int[]nums){
        int[] result;

        if(nums.length<2){
            if(nums.length ==1) {
                result = new int[]{nums[0]};
            }else{
                result =new int []{};
            }
        }else{
            result = new int[]{nums[0], nums[1]};
            }
        return result;
    }
}
