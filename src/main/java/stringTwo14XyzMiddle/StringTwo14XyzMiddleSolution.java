package stringTwo14XyzMiddle;

/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that
the number of chars to the left and right of the "xyz" must differ by at most one. This problem
is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */

public class StringTwo14XyzMiddleSolution {
  public boolean xyzMiddle(String str){
    boolean result = false;
    String middle;

    if(str.length()<3) return result;

    if(str.length()%2==0) {
      middle = str.substring(str.length() / 2 - 2, str.length() / 2 + 2);
      System.out.println(middle);
    }else{
      middle = str.substring(str.length()/2 -1, str.length()/2 +2);
      System.out.println(middle);
    }

    if(middle.contains("xyz")){
      result = true;
    }

    return result;
  }

}
