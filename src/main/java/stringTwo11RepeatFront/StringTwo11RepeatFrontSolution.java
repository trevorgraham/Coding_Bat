package stringTwo11RepeatFront;

/*
Given a string and an int n, return a string made of the first n characters of the string, followed
by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the
length of the string, inclusive (i.e. n >= 0 and n <= str.length()).


repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
 */

public class StringTwo11RepeatFrontSolution {

  public String repeatFront(String str, int n){
    String result ="";
    String start = str.substring(0,n);

    for(int counter = 0; counter<start.length(); counter++){
      result = result + start.substring(0,start.length()-counter);
    }
    return result;
  }

}
