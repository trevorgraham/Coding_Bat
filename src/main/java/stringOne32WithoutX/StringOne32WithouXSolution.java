package stringOne32WithoutX;

/**
 * Created by trevorgraham on 22/10/2017.
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and
 * otherwise return the string unchanged.


 withoutX("xHix") → "Hi"
 withoutX("xHi") → "Hi"
 withoutX("Hxix") → "Hxi"
 */
public class StringOne32WithouXSolution {
    public String withoutX (String str){
        String result = "";
        if(str.length()>=2){
            if(str.charAt(0)==('x')&& str.charAt(str.length())==('x')){
                result= str.substring(1,str.length()-1);
            }else if(str.charAt(0)==('x')&& str.charAt(str.length())!=('x')){
                result = str.substring(1);
            }else if(str.charAt(0)!=('x')&& str.charAt(str.length())==('x')){
                result = str.substring(0,str.length()-1);
            }else{
                return str;
            }
        }
        return result;
    }
}
