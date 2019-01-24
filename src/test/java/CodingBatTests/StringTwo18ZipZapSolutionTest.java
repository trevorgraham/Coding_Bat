package CodingBatTests;

/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending
with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap"
yields "zpXzp".


zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"

 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import stringTwo18ZipZap.StringTwo18ZipZapSolution;

public class StringTwo18ZipZapSolutionTest {

  StringTwo18ZipZapSolution calc = new StringTwo18ZipZapSolution();

  @Test
  public void givenStringZipXZapReturnZpXzp(){
    assertEquals("zpXzp", calc.zipZap("zipXzap"));
  }

  @Test
  public void givenStringZopZopReturnZpzp(){
    assertEquals("zpzp", calc.zipZap("zopzop"));
  }

  @Test
  public void givenStringZzzopzopReturnZzzpzp(){
    assertEquals("zzzopzop", calc.zipZap("zzzpzp"));
  }

}
