# Golden Files for Orchestra Code Generator Regression Tests

This directory contains the reference ("golden") output of `CodeGeneratorJ` (the
orchestra-based code generator) for **FIXLatest**.  They are used by
`OrchestraGoldenFileTest` to catch unintended changes to generated code.

## Directory layout

```
golden/
  fixlatest/   – output generated from OrchestraFIXLatest.min.xml
```

The test fixture `OrchestraFIXLatest.min.xml` (in `src/test/resources/`) is the
minimised orchestra file produced by applying
`quickfixj-messages-all/src/main/xsl/minimiseOrchestra.xsl` to the
`OrchestraFIXLatest.xml` from the `io.fixprotocol.orchestrations:fix-standard`
artifact at the version declared in the parent POM.

## What the test does

`OrchestraGoldenFileTest` runs `CodeGeneratorJ` against the minimised fixture into
a temporary folder, then walks every `.java` file and asserts line-by-line equality
with the corresponding file here.  Missing or extra files also fail the test.

## When the generator output changes intentionally

1. Make your generator or XSL changes.
2. Rebuild `quickfixj-messages-all` to regenerate the minimised XML fixture (if
   the XSL or orchestra version changed) and to pick up any updated generator:
   ```bash
   mvn package -pl quickfixj-orchestration,quickfixj-messages/quickfixj-messages-all -DskipTests
   ```
3. Regenerate the golden files.  The simplest approach is to temporarily point the
   test's temporary folder to a fixed path so you can inspect or copy the output.
   Alternatively, run the `CodeGeneratorJ` directly:
   ```bash
   # From the repo root – adjust the JAR path to match the current snapshot version
   java -cp "quickfixj-orchestration/target/quickfixj-orchestration-*-SNAPSHOT.jar:\
   $(mvn -q dependency:build-classpath \
         -pl quickfixj-messages/quickfixj-messages-fixlatest \
         -DincludeScope=test \
         -Dmdep.outputFile=/dev/stdout)" \
        org.quickfixj.orchestra.CodeGeneratorJ \
        --orchestration quickfixj-messages/quickfixj-messages-all/target/generated-resources/min/OrchestraFIXLatest.min.xml \
        --output quickfixj-messages/quickfixj-messages-fixlatest/src/test/resources/golden/fixlatest \
        --noFixt11 --excludeSession
   ```
   Or copy the output from the temporary folder that `OrchestraGoldenFileTest`
   creates (set a breakpoint or change `tempFolder` to a fixed path temporarily).

4. If the minimised fixture itself changed (e.g. due to an orchestra version bump or
   XSL change), also update the committed `OrchestraFIXLatest.min.xml`:
   ```bash
   cp quickfixj-messages/quickfixj-messages-all/target/generated-resources/min/OrchestraFIXLatest.min.xml \
      quickfixj-messages/quickfixj-messages-fixlatest/src/test/resources/
   ```

5. Verify only the expected files changed:
   ```bash
   git diff --stat quickfixj-messages/quickfixj-messages-fixlatest/src/test/resources/
   ```
6. Run the test suite to confirm the updated golden files now match:
   ```bash
   mvn test -pl quickfixj-messages/quickfixj-messages-fixlatest
   ```
7. Commit the updated golden files (and updated fixture if applicable) **together
   with your generator/XSL changes** in the same commit (or PR) so reviewers can
   see the diff side-by-side.
