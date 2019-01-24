package stringOne4MakeOutWord;

/**
 * Created by trevorgraham on 13/06/2017.
 * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is
 * in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String
 * starting at index i and going up to but not including index j.

 makeOutWord("<<>>", "Yay") → "<<Yay>>"
 makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
 makeOutWord("[[]]", "word") → "[[word]]"
 */
public class StringOne4MakeOutWordSolution {
    public String makeOutWord(String out, String word) {
        String outFront = out.substring(0,2);
        String outBack = out.substring(2);

    return outFront+word+outBack;
    }
}
