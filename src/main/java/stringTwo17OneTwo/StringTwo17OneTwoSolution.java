package stringTwo17OneTwo;

/*
Given a string, compute a new string by moving the first char to come after the next two chars,
so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields
"bcaefd". Ignore any group of fewer than 3 chars at the end.


oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 */

public class StringTwo17OneTwoSolution {
  public String oneTwo(String str){
    String result="";
    String first="";
    String followingTwo="";

    for (int count = 0;count<str.length()-2; count=count+3 ){
      first = str.substring(count, count+1);
      followingTwo = str.substring(count+1, count+3);
      result = result + followingTwo + first;
    }

    return result;
  }


}
