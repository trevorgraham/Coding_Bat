package ArrayOne7Reverse3;

import com.sun.tools.javac.util.ArrayUtils;
import com.sun.tools.javac.util.List;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by trevorgraham on 18/07/2017.
 * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3}
 * becomes {3, 2, 1}.

 reverse3([1, 2, 3]) → [3, 2, 1]
 reverse3([5, 11, 9]) → [9, 11, 5]
 reverse3([7, 0, 0]) → [0, 0, 7]
 */
public class ArrayOne7Reverse3Solution {
    public int[] reverse3(int[] nums) {
        int [] numsReversed = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            numsReversed[i] = nums[nums.length -i -1];
        }
        return numsReversed;
    }
}
