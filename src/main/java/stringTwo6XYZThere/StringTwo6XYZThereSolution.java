package stringTwo6XYZThere;

/**
 * Created by trevorgraham on 27/11/2017.
 * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a
 * period (.). So "xxyz" counts but "x.xyz" does not.


 xyzThere("abcxyz") → true
 xyzThere("abc.xyz") → false
 xyzThere("xyz.abc") → true
 */
public class StringTwo6XYZThereSolution {

    public boolean xyzThere(String string){
        String one = "xyz";
        String two = ".xyz";

        for(int count = 0; count<string.length()-4; count++){
            if(string.substring(count, count+4).equals(two)){
                if(string.substring(count,count-3).equals(one)){
                    return true;
                }
                return false;
            }
        }
        return false;
    }

}
