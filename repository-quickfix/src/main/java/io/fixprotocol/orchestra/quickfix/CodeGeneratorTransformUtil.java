package io.fixprotocol.orchestra.quickfix;

public class CodeGeneratorTransformUtil {

    public static String precedeCapsWithUnderscore(String stringToTransform) {
        return stringToTransform.replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase();
    }

}
