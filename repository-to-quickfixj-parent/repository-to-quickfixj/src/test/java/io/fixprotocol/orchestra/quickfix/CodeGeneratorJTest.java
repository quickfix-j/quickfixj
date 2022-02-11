package io.fixprotocol.orchestra.quickfix;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import picocli.CommandLine;
import picocli.CommandLine.MissingParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CodeGeneratorJTest {

  private CodeGeneratorJ generator;

  @BeforeEach
  public void setUp() throws Exception {
    generator = new CodeGeneratorJ();
  }

  @Test
  public void testGenerate() throws IOException {
    generator.generate(
        Thread.currentThread().getContextClassLoader().getResource("trade.xml").openStream(),
        new File("target/spec/generated-sources/fix50sp2"));
    generator.generate(
            Thread.currentThread().getContextClassLoader().getResource("trade-latest.xml").openStream(),
            new File("target/spec/generated-sources/latest"));
  }
  
  @Test void testTransformStaticFieldNameCarriedNonCustomerSideCrossMargined() {
      final String testInput = "CarriedNonCustomerSideCrossMargined";
      final String expectedResult = "CARRIED_NON_CUSTOMER_SIDE_CROSS_MARGINED";
      assertEquals(expectedResult, CodeGeneratorTransformUtil.precedeCapsWithUnderscore(testInput) );
  }
  
  @Test void testTransformStaticFieldNameFIX50SP2() {
      final String testInput = "FIX50SP2";
      final String expectedResult = "FIX50SP2";
      assertEquals(expectedResult, CodeGeneratorTransformUtil.precedeCapsWithUnderscore(testInput) );
  }
  
  @Test void testTransformStaticFieldNameFIX44() {
      final String testInput = "FIX44";
      final String expectedResult = "FIX44";
      assertEquals(expectedResult, CodeGeneratorTransformUtil.precedeCapsWithUnderscore(testInput) );
  }
  
  @Test 
  void testOptions() {
	  /*
		@Option(names = { "-o", "--output-dir" }, defaultValue = "target/generated-sources", 
				paramLabel = "OUTPUT_DIRECTORY", description = "The output directory, Default : ${DEFAULT-VALUE}")
		String outputDir = "target/generated-sources";

		@Option(names = { "-i", "--orchestra-file" }, required = true, 
				paramLabel = "ORCHESTRA_FILE", description = "The path/name of the FIX OrchestraFile")
		String orchestraFileName;

		@Option(names = { "--disableBigDecimal" }, defaultValue = "false", fallbackValue = "true", 
				paramLabel = "DISABLE_BIG_DECIMAL", description = "Disable the use of Big Decimal for Decimal Fields, Default : ${DEFAULT-VALUE}")
		boolean isDisableBigDecimal = true;
		*/
	  String outputDir = "somewhere/generated-sources";
	  String input = "target/input";
	  String[] args = { "--orchestra-file", input, "--output-dir", outputDir, "--disableBigDecimal"};
	  CodeGeneratorJ.Options options = new CodeGeneratorJ.Options();
	  new CommandLine(options).parseArgs(args);
	  assertEquals(input, options.orchestraFileName);
	  assertEquals(outputDir, options.outputDir);
	  assertTrue(options.isDisableBigDecimal);
  }

  @Test 
  void testOptionDefaults() {
	  String outputDir = "target/generated-sources";
	  String input = "target/input";
	  String[] args = { "--orchestra-file", input};
	  CodeGeneratorJ.Options options = new CodeGeneratorJ.Options();
	  new CommandLine(options).parseArgs(args);
	  assertEquals(input, options.orchestraFileName);
	  assertEquals(outputDir, options.outputDir);
	  assertFalse(options.isDisableBigDecimal);
  }
  
  @Test 
  void testOptionShortForm() {
	  String outputDir = "target/generated-sources";
	  String input = "target/input";
	  String[] args = { "-i", input, "-o", outputDir};
	  CodeGeneratorJ.Options options = new CodeGeneratorJ.Options();
	  new CommandLine(options).parseArgs(args);
	  assertEquals(input, options.orchestraFileName);
	  assertEquals(outputDir, options.outputDir);
	  assertFalse(options.isDisableBigDecimal);
  }
  
  @Test
  void testOptionNotProvided() {
	  String outputDir = "target/generated-sources";
	  String[] args = {"--output-dir", outputDir,};
	  CodeGeneratorJ.Options options = new CodeGeneratorJ.Options();
	  assertThrows(MissingParameterException.class, () -> new CommandLine(options).parseArgs(args) );
  }

  @Test 
  void testExecute() {
	  String outputDir = "target/generated-sources";
	  String input = "target/input";
	  String[] args = { "--orchestra-file", input};
	  CodeGeneratorJ.Options options = new CodeGeneratorJ.Options();
	  new CommandLine(options).parseArgs(args);
	  assertEquals(input, options.orchestraFileName);
	  assertEquals(outputDir, options.outputDir);
	  assertFalse(options.isDisableBigDecimal);
  }
  
  
  @Test
  void testExecuteOptionNotProvided() {
	  String outputDir = "target/generated-sources";
	  String[] args = {"--output-dir", outputDir,};
	  CodeGeneratorJ.Options options = new CodeGeneratorJ.Options();
	  new CommandLine(options).execute(args);
  }
}

