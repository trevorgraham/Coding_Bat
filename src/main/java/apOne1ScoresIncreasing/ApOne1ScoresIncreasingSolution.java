package apOne1ScoresIncreasing;

/*
Given an array of scores, return true if each score is equal or greater than the one before.
The array will be length 2 or more.


scoresIncreasing([1, 3, 4]) → true
scoresIncreasing([1, 3, 2]) → false
scoresIncreasing([1, 1, 4]) → true

 */

public class ApOne1ScoresIncreasingSolution {



  public boolean scoresIncreasing(int[] scores){
    boolean result = true;
    for(int counter = 1; counter<scores.length; counter++){
      if(scores[counter]<scores[counter -1]){
        result =false;
      }
    }
    return result;
  }

}
