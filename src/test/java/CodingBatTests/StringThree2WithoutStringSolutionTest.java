package CodingBatTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import stringThree2WithoutString.StringThree2WithoutStringSolution;

public class StringThree2WithoutStringSolutionTest {

  StringThree2WithoutStringSolution calc = new StringThree2WithoutStringSolution();

  @Test
  public void givenBaseStringAndRemoveStringReturnBaseStringWithRemoveStringElementsRemoved(){
    assertEquals("b",calc.withoutString("ab", "a"));
    assertEquals("bc", calc.withoutString("abc","a"));
    assertEquals("trev", calc.withoutString("trAAAev", "AAA"));
    assertEquals("AAAa", calc.withoutString("aaaAAAAAAAAa", "AAAAAAAA"));
  }

}
