package apOne3ScoresClump;

/*
Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent
scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.


scoresClump([3, 4, 5]) → true
scoresClump([3, 4, 6]) → false
scoresClump([1, 3, 5, 5]) → true
 */

public class ApOne3ScoresClumpSolution {

  public boolean scoresClump(int[] scores) {
    boolean result = false;
    for (int count = 0; count < scores.length - 2; count++) {
      int first = scores[count];
      int last =scores[count+2];
      if((last - first <=2)){
        result =true;
      }
    }
    return result;
  }
}
