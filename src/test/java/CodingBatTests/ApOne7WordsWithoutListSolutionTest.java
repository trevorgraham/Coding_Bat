package CodingBatTests;

/*
Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given
length are omitted. See wordsWithout() below which is more difficult because it uses arrays.


    wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
    wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
    wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
*/


import static org.junit.Assert.assertEquals;

import apOne7WordsWithoutList.ApOne7WordsWithoutListSolution;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ApOne7WordsWithoutListSolutionTest {

  ApOne7WordsWithoutListSolution calc = new ApOne7WordsWithoutListSolution();

  String[] arrayA = {"a","bb","b","ccc"};
  List<String> expected = Arrays.asList("bb", "ccc");
  List<String> actual = calc.wordsWithoutList(arrayA,1);



  @Test
  public void givenArrayAReturn1(){
    assertEquals(actual, expected);

  }

}
