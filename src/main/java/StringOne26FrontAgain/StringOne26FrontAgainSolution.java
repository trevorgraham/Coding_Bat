package StringOne26FrontAgain;

/**
 * Created by trevorgraham on 04/09/2017.
 * Given a string, return true if the first 2 chars in the string also appear at the
 * end of the string, such as with "edited".

 frontAgain("edited") → true
 frontAgain("edit") → false
 frontAgain("ed") → true
 */
public class StringOne26FrontAgainSolution {
    public boolean frontAgain(String str){

        if(str.length()>=2){
            String front = str.substring(0,2);
            String end = str.substring(str.length()-2);
            if(front.equals(end)) return true;
        }
        return false;

    }

}
