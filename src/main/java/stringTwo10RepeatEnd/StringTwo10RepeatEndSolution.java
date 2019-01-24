package stringTwo10RepeatEnd;

/*
Given a string and an int n, return a string made of n repetitions of the last n characters of the
string. You may assume that n is between 0 and the length of the string, inclusive.


repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"

 */

public class StringTwo10RepeatEndSolution {

  public String repeatEnd(String str, int n){
    String end = str.substring(str.length()-n);
    String result = "";

    for(int counter =0; counter<end.length();counter++){
      result = result + end;
    }
    return result;
  }

}
