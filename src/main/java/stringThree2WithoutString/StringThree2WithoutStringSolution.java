package stringThree2WithoutString;

/*
Given two strings, base and remove, return a version of the base string where all instances of the
remove string have been removed (not case sensitive). You may assume that the remove string is
length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".


withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
 */

public class StringThree2WithoutStringSolution {
  public String withoutString(String base, String remove){

    for(int count=0; count<base.length()-(remove.length()); count++){
      String basePart =base.substring(count, count+remove.length());
      if(basePart.equalsIgnoreCase(remove)){
        base = base.replace(basePart,"");
      }
    }
    return base;
  }

}
