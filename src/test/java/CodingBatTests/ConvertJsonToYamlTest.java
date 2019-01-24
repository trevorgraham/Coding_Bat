package CodingBatTests;

import static org.junit.Assert.assertEquals;

import convertJsonToYaml.ConvertJsonToYamlLibrary;
import java.io.File;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class ConvertJsonToYamlTest {
  ConvertJsonToYamlLibrary convert = new ConvertJsonToYamlLibrary();

  @Rule
  public TemporaryFolder folder = new TemporaryFolder();





  @Test
  public void givenJsonFileReturnValidYamlFile() throws IOException {
    //File file1 = folder.newFile("someTestJson.json");
    File file2 = folder.newFile("SomeTestYaml.yaml");

    assertEquals(file2, convert.asYaml(file1))
  }
}
