package stringTwo8XyBalance;

/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y'
char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance
multiple 'x's. Return true if the given string is xy-balanced.


xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */

public class StringTwo8XyBalanceSolution {
  public boolean xyBalance(String str){
    boolean result = false;
    int xPosition =0;
    int yPosition =0;


    if(str.contains("x")==false && str.contains("y")==false ) result = true;

    //for loop to test each char in the string
    for(int counter =0; counter<str.length(); counter++){
      if(str.charAt(counter)=='x'){
        xPosition =counter;
      }
      if(str.charAt(counter)=='y'){
        yPosition=counter;
      }
    }

    if (xPosition <yPosition){
      result =true;
    }

    if(str.length()==1 && str.equals("y")) result =true;

    return result;

  }

}
