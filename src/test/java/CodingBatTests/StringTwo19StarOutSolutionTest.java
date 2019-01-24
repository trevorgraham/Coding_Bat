package CodingBatTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import stringTwo19StarOut.StringTwo19StarOutSolution;

public class StringTwo19StarOutSolutionTest {

  StringTwo19StarOutSolution calc = new StringTwo19StarOutSolution();

  @Test
  public void givenAStringABstarCDReturnStringAD(){
    assertEquals("ad", calc.starOut("ab*cd"));
  }

  @Test
  public void givenAStringABstarstarCDReturnStringAD(){
    assertEquals("ad", calc.starOut("ab**cd"));
  }

  @Test
  public void givenAStringSMstarEILLYReturnStringSILLY(){
    assertEquals("silly", calc.starOut("sm*eilly"));
  }

}
