package stringThree1CountYZ;

/**
 * Created by trevorgraham on 14/08/2017.
 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez"
 * count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there
 * is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an
 * alphabetic letter.)

 countYZ("fez day") → 2
 countYZ("day fez") → 2
 countYZ("day fyyyz") → 2
 */
public class StringThree1CountYZSolution {
    public int countYZ(String str){
        int result = 0;
        String lowerStr =str.toLowerCase();

        if(lowerStr.endsWith("y")||lowerStr.endsWith("z")) result++;

        for(int i = 0; i<str.length()-1; i++){
            if((lowerStr.charAt(i)=='y' && !Character.isLetter(lowerStr.charAt(i+1)))||(lowerStr.charAt(i)=='z' &&
                !Character.isLetter(lowerStr.charAt(i+1)))){
                result++;
            }
        }

        return result;
    }
}
