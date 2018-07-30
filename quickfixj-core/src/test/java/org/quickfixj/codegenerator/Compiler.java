package org.quickfixj.codegenerator;

import org.joor.Reflect;

import javax.tools.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Compiler {
    private Compiler() {
    }

    static Map<String, Reflect> compile(final Map<String, String> classNameToSourceMap) {
        final MethodHandles.Lookup lookup = MethodHandles.lookup();
        final JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        final ClassFileManager fileManager = new ClassFileManager(compiler.getStandardFileManager(null, null, null));

        final List<CharSequenceJavaFileObject> files = new ArrayList<>();
        for (final Map.Entry<String, String> entry : classNameToSourceMap.entrySet()) {
            files.add(new CharSequenceJavaFileObject(entry.getKey(), entry.getValue()));
        }

        final StringWriter out = new StringWriter();
        compiler.getTask(out, fileManager, null, null, null, files).call();

        if (!fileManager.output.keySet().containsAll(classNameToSourceMap.keySet())) {
            throw new RuntimeException("Compilation error:\n" + out.toString());
        }

        final ClassLoader cl = lookup.lookupClass().getClassLoader();
        final Map<String, Reflect> instances = new LinkedHashMap<>();
        for (final Map.Entry<String, JavaFileObject> output : fileManager.output.entrySet()) {
            final String className = output.getKey();
            final byte[] b = output.getValue().getBytes();
            final Class<?> clazz = Reflect.on(cl).call("defineClass", className, b, 0, b.length).get();
            instances.put(className, Reflect.on(clazz));
        }
        return instances;
    }

    private static final class ClassFileManager extends ForwardingJavaFileManager<StandardJavaFileManager> {
        private final Map<String, JavaFileObject> output = new LinkedHashMap<>();

        ClassFileManager(final StandardJavaFileManager standardManager) {
            super(standardManager);
        }

        @Override
        public JavaFileObject getJavaFileForOutput(final JavaFileManager.Location location, final String className, final JavaFileObject.Kind kind, final FileObject sibling) {
            return output.computeIfAbsent(className, (cn) -> new JavaFileObject(cn, kind));
        }
    }

    private static final class JavaFileObject extends SimpleJavaFileObject {
        private final ByteArrayOutputStream os = new ByteArrayOutputStream();

        JavaFileObject(final String name, final JavaFileObject.Kind kind) {
            super(URI.create("string:///" + name.replace('.', '/') + kind.extension), kind);
        }

        byte[] getBytes() {
            return os.toByteArray();
        }

        @Override
        public OutputStream openOutputStream() {
            return os;
        }
    }

    private static final class CharSequenceJavaFileObject extends SimpleJavaFileObject {
        private final CharSequence content;

        CharSequenceJavaFileObject(final String className, final CharSequence content) {
            super(URI.create("string:///" + className.replace('.', '/') + JavaFileObject.Kind.SOURCE.extension), JavaFileObject.Kind.SOURCE);
            this.content = content;
        }

        @Override
        public CharSequence getCharContent(final boolean ignoreEncodingErrors) {
            return content;
        }
    }
}
