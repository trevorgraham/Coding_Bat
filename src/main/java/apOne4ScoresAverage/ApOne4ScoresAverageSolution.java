package apOne4ScoresAverage;
/*
Given an array of scores, compute the int average of the first half and the second half,
and return whichever is larger. We'll say that the second half begins at index length/2. The array
length will be at least 2. To practice decomposition, write a separate helper method
int average(int[] scores, int start, int end) { which computes the average of the elements between
indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper
method after your scoresAverage() method in the JavaBat text area. Normally you would compute
averages with doubles, but here we use ints so the expected results are exact.


scoresAverage([2, 2, 4, 4]) → 4
scoresAverage([4, 4, 4, 2, 2, 2]) → 4
scoresAverage([3, 4, 5, 1, 2, 3]) → 4
 */

public class ApOne4ScoresAverageSolution {
  public int scoresAverage(int[] scores){
    int result = 0;
    int frontSum =0;
    int backSum =0;
    int halfway = scores.length/2;
    for(int count =0; count<scores.length/2; count++){
      frontSum = frontSum+scores[count];
    }
    for(int count=halfway; count<scores.length; count++ ){
      backSum = backSum + scores[count];
    }
    int frontAve = frontSum/halfway;
    int backAve = backSum/halfway;
    if(frontAve >backAve) result = frontAve;
    else result =backAve;

    return result;
  }

}
