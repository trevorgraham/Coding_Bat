package stringTwo12RepeatSeperator;

/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the
word, separated by the separator string.


repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */

public class StringTwo12RepeatSeperatorSolution {
  public String repeatSeperator(String word, String sep, int count){
    String result ="";

    for(int counter =0; counter<count; counter++){
      if(counter ==count-1){
        result= result+word;
      }else {
        result = result + word + sep;
      }
    }
    return result;
  }

}
