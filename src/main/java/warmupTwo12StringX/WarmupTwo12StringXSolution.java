package warmupTwo12StringX;

/**
 * Created by trevorgraham on 23/08/2017.
 * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end
 * should not be removed.

 stringX("xxHxix") → "xHix"
 stringX("abxxxcd") → "abcd"
 stringX("xabxxxcdx") → "xabcdx"
 */
public class WarmupTwo12StringXSolution {
    public String StringX(String str) {
        if (str.length() > 2) {
            String result = "";
            String start = str.substring(0, 1);
            String end = str.substring(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);


            for (int i = 0; i < middle.length(); i++) {
                if (middle.charAt(i) != 'x') {
                    result = result + middle.substring(i, i + 1);
                }
            }
            return start + result + end;
        } else {
            return str;

        }
    }
}
