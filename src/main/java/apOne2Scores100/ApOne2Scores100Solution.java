package apOne2Scores100;

public class ApOne2Scores100Solution {
  /*
  Given an array of scores, return true if there are scores of 100 next to each other in the array.
  The array length will be at least 2.


scores100([1, 100, 100]) → true
scores100([1, 100, 99, 100]) → false
scores100([100, 1, 100, 100]) → true
   */

  public boolean scores100(int[] scores){
    boolean result = false;
    for(int counter = 0; counter<scores.length -1; counter++){
      if(scores[counter]==100 && scores[counter +1]==100){
        result =true;
      }
    }
    return result;
  }

}
