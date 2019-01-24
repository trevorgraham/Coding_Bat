package StringOne24LastTwo;

/**
 * Created by trevorgraham on 04/09/2017.
 * Given a string of any length, return a new string where the last 2 chars, if present, are swapped,
 * so "coding" yields "codign".

 lastTwo("coding") → "codign"
 lastTwo("cat") → "cta"
 lastTwo("ab") → "ba"
 */
public class StringOne24LastTwoSolution {

    public String lastTwo(String str){


        if(str.length() >=2){
            String start = str.substring(0, str.length()-2);
            String last2 = str.substring(str.length()-2, str.length()-1);
            String last = str.substring(str.length()-1);

            return start + last + last2 ;


        }

        return str;


    }

}
