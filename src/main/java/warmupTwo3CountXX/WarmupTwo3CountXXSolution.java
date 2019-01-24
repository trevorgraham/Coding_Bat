package warmupTwo3CountXX;

/**
 * Created by trevorgraham on 13/06/2017.
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

 countXX("abcxx") → 1
 countXX("xxx") → 2
 countXX("xxxx") → 3
 */
public class WarmupTwo3CountXXSolution {
    public int countXX(String str) {
        int countUp = 0;
        for(int i = 0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("xx")) countUp ++;
            }
            return countUp;
        }

    }

