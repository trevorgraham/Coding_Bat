package stringTwo16SameStarChar;

/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and
after the star, they are the same.


sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
 */

public class StringTwo16SameStarCharSolution {
  public boolean sameStarChar(String str){
    int count=0;

    for(count =1; count<str.length()-1; count++){
      if(str.charAt(count)=='*'){
        if (str.charAt(count -1)!=str.charAt(count +1)){
          return false;
        }
      }
    }
    return true;
  }


}
