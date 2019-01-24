package StringOne25SeeColor;

/**
 * Created by trevorgraham on 04/09/2017.
 * Given a string, if the string begins with "red" or "blue" return that color string,
 * otherwise return the empty string.

 seeColor("redxx") → "red"
 seeColor("xxred") → ""
 seeColor("blueTimes") → "blue"

 */
public class StringOne25SeeColorSolution {

    public String seeColor(String str){
        if(str.length() >=3 && str.substring(0,3).equals("red")){
            return "red";
        }else if (str.length() >=4 && str.substring(0,4).equals("blue")){
            return "blue";
        }else{
            return "";
        }
    }
}
