package stringTwo18ZipZap;

/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending
with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap"
yields "zpXzp".


zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"

 */

public class StringTwo18ZipZapSolution {
  public String zipZap(String str) {
    String finalResult = "";



    for (int counter = 0; counter < str.length(); counter++) {
      if (str.charAt(counter) == 'z' && str.charAt(counter+2)=='p') {
        String temp = str.substring(counter, counter +2);
        String zp = "zp";
        String front = str.substring(0,counter);
        String back = str.substring(counter);
        if(counter >0){
          str = front + zp + back;
        }
      }
    }

    return finalResult;
  }

}
