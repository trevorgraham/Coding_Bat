package stringTwo9MixString;

/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of
b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of
the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */

public class StringTwo9MixStringSolution {
  public String mixString(String a, String b){
    String result ="";
    String lead="";
    String end="";

    if(a.length()<b.length()){
      lead=a;
      end=b.substring(a.length());
    }else{
      lead=b;
      end=a.substring(b.length());
    }

    for(int count =0; count<lead.length(); count++){
      result = result + a.charAt(count) + b.charAt(count);
    }

    result = result+ end;
    return result;
  }
}
