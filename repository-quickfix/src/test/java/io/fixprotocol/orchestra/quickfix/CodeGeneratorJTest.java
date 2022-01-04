package io.fixprotocol.orchestra.quickfix;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        new File("target/spec/generated-sources"));
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
}

