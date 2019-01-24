package apOne6WordsFront;
/*
Given an array of strings, return a new array containing the first N strings. N will be in the
range 1..length.


wordsFront(["a", "b", "c", "d"], 1) → ["a"]
wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]

 */

import java.util.Arrays;

public class ApOne6WordsFrontSolution {
  public String [] wordsFront(String[] words, int n){
    String[] newWords = Arrays.copyOfRange(words, 0,n);
    return newWords;
  }

}
