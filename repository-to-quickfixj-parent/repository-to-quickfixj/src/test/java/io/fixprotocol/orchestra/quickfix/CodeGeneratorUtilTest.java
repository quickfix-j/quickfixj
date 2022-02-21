package io.fixprotocol.orchestra.quickfix;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import io.fixprotocol._2020.orchestra.repository.FieldType;

class CodeGeneratorUtilTest {

	private String lineSeparator = System.lineSeparator();
	private String expectedCtor = new StringBuffer()
			.append(lineSeparator)
			.append(CodeGeneratorUtil.indent(1))
			.append("public Logon (quickfix.field.EncryptMethod encryptMethod, quickfix.field.HeartBtInt heartBtInt, quickfix.field.DefaultApplVerID defaultApplVerID) {")
			.append(lineSeparator)
			.append(CodeGeneratorUtil.indent(2)).append("this();").append(lineSeparator)
			.append(CodeGeneratorUtil.indent(2)).append("setField(encryptMethod);").append(lineSeparator)					
			.append(CodeGeneratorUtil.indent(2)).append("setField(heartBtInt);").append(lineSeparator)
			.append(CodeGeneratorUtil.indent(2)).append("setField(defaultApplVerID);").append(lineSeparator)
			.append(CodeGeneratorUtil.indent(1)).append("}")
			.append(lineSeparator).toString();
	
	/*     
		public Logon (quickfix.field.EncryptMethod encryptMethod, quickfix.field.HeartBtInt heartBtInt, quickfix.field.DefaultApplVerID defaultApplVerID) {
			this();
		    setField(encryptMethod);
		    setField(heartBtInt);
		    setField(defaultApplVerID);
		}
	 */
	
	@Test
	void testCtorWithArguments() {
		List<FieldType> mandatoryFields = new ArrayList<FieldType>();
		List<String> FieldNameList = Arrays.asList("EncryptMethod", "HeartBtInt", "DefaultApplVerID");
		FieldNameList.stream().forEach(f -> {
				FieldType fieldType = new FieldType();
				fieldType.setName(f);
				mandatoryFields.add(fieldType);
			} );
		String clazzName = "Logon";
		String constructorWithArguments = new String(CodeGeneratorUtil.formatConstructorWithArguments(clazzName, mandatoryFields));
		System.out.print(constructorWithArguments);
		assertEquals(expectedCtor, constructorWithArguments);
	}

}
