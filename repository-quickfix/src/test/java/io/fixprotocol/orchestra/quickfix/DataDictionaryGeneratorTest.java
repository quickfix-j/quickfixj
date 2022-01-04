package io.fixprotocol.orchestra.quickfix;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DataDictionaryGeneratorTest {

  private DataDictionaryGenerator generator;

  @BeforeEach
  public void setUp() throws Exception {
    generator = new DataDictionaryGenerator();
  }

  @Test
  public void testGenerate() throws Exception {
    File outputDir = new File("target/spec");
    generator.generate(
        Thread.currentThread().getContextClassLoader().getResource("trade.xml").openStream(),
        outputDir);
    try (BufferedReader brTest = new BufferedReader(
        new FileReader(outputDir.getAbsolutePath().concat(File.separator + "FIX50SP2.xml")))) {
      String firstLine = brTest.readLine();
      assertEquals("<fix major=\"5\" minor=\"0\" servicepack=\"2\" extensionpack=\"257\">",
          firstLine);
    }
  }

  @Test
  public void testExtract() throws Exception {
    assertEquals("0", generator.extractServicePack("FIX.5.0"));
    assertEquals("2", generator.extractServicePack("FIX.5.0SP2"));
    assertEquals("2", generator.extractServicePack("FIX.5.0SP2_EP257"));
    assertEquals("257", generator.extractExtensionPack("FIX.5.0SP2_EP257"));
    assertEquals("0", generator.extractExtensionPack("FIX.5.0"));
    assertEquals("0", generator.extractExtensionPack("FIX.5.0SP2"));
    assertEquals("123", generator.extractExtensionPack("FIX.5.0_EP123"));
    assertEquals("FIX.5.0", generator.splitOffVersion("FIX.5.0"));
    assertEquals("FIX.5.0", generator.splitOffVersion("FIX.5.0_EP123"));
    assertEquals("FIX.5.0SP2", generator.splitOffVersion("FIX.5.0SP2"));
    assertEquals("FIX.5.0SP2", generator.splitOffVersion("FIX.5.0SP2_EP257"));
  }

}
