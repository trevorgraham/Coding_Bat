package warmupTwo5StringBits;

/**
 * Created by trevorgraham on 15/07/2017.
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

 stringBits("Hello") → "Hlo"
 stringBits("Hi") → "H"
 stringBits("Heeololeo") → "Hello"
 */
public class WarmupTwo5StringBitsSolution {
    public String stringBits(String str) {
        String outcome ="";

        for(int i =0; i<str.length(); i++){
            if(i%2 ==0){

                outcome = outcome + str.substring(i,i+1);
            }
        }
        return outcome;

    }
}
