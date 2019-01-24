package stringTwo19StarOut;

public class StringTwo19StarOutSolution {

  public String starOut(String str) {
    String result = "";

    for (int count = 0; count < str.length(); count++) {
      String end = "";
      if (str.charAt(count) == '*') {
        String start = str.substring(0, count - 1);
        for (int innerCount = count; innerCount < str.length(); innerCount++) {
          if (str.charAt(innerCount) != '*') {
            end = str.substring(innerCount);
          }
        }
        str = start + end;
      }

    }
    return str;
  }
}