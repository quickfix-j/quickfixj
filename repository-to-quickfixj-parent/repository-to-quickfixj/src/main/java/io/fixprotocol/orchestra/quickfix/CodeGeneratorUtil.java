package io.fixprotocol.orchestra.quickfix;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import io.fixprotocol._2020.orchestra.repository.FieldType;

public class CodeGeneratorUtil {

    public static String precedeCapsWithUnderscore(String stringToTransform) {
        return stringToTransform.replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase();
    }

	public static char[] formatConstructorWithArguments(String clazzName, List<FieldType> mandatoryFields) {
		String lineSeparator = System.lineSeparator();

		List<String> fieldParameters = new ArrayList<String>();
		mandatoryFields.stream().forEach(f ->
			{
				String fieldName = f.getName();
				fieldParameters.add( new StringBuffer().append("quickfix.field.").append(fieldName).append(" ")
						.append(Character.toLowerCase(fieldName.charAt(0)) + fieldName.substring(1)).toString());
			} );
		
		StringBuffer ctor = new StringBuffer(lineSeparator).append(indent(1)).
				append("public ").append(clazzName).append(" (");
		// append ctor parameters
		ctor.append(fieldParameters.stream().collect(Collectors.joining(", ")));
		ctor.append(") {").append(lineSeparator);
		ctor.append(indent(2)).append("this();").append(lineSeparator);
		
		mandatoryFields.stream().forEach(f ->
		{
			String fieldName = f.getName();
			ctor.append(indent(2)).append("setField(")
				.append(Character.toLowerCase(fieldName.charAt(0)) + fieldName.substring(1))
				.append(");").append(lineSeparator);
		} );
		ctor.append(indent(1)).append("}").append(lineSeparator);
		return ctor.toString().toCharArray();
	}

	public static String indent(int level) {
		final char[] chars = new char[level * CodeGeneratorJ.SPACES_PER_LEVEL];
		Arrays.fill(chars, ' ');
		return new String(chars);
	}

}
