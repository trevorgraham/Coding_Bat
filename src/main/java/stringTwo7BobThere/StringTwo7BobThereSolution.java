package stringTwo7BobThere;

/*Return true if the given string contains a "bob" string, but where the middle 'o' char
can be any char.


bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false

 */

public class StringTwo7BobThereSolution {
  public boolean bobThere(String str){
    boolean result=false;

    //create a for loop to test the string
    for(int counter =0; counter<str.length()-2; counter++){
      if(str.charAt(counter)=='b' && str.charAt(counter +2)=='b'){
        return true;
      }
    }
    return result;
  }

}
