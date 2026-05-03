# Golden Files for Code Generator Regression Tests

This directory contains the reference ("golden") output of `MessageCodeGenerator`
for **FIX42** and **FIX44**.  They are used by `GoldenFileTest` to catch
unintended changes to generated code.

## Directory layout

```
golden/
  fix42/   – output generated from quickfixj-messages-fix42/src/main/resources/FIX42.xml
  fix44/   – output generated from quickfixj-messages-fix44/src/main/resources/FIX44.xml
```

## What the test does

`GoldenFileTest` runs `MessageCodeGenerator` against both dictionaries into a
temporary folder, then walks every `.java` file and asserts line-by-line equality
with the corresponding file here.  Missing or extra files also fail the test.

## When the generator output changes intentionally

1. Make your generator changes.
2. Rebuild the module to pick up the new code:
   ```bash
   mvn package -pl quickfixj-codegenerator -DskipTests
   ```
3. Regenerate the golden files by running the generator against both dictionaries
   from the `quickfixj-codegenerator` directory:
   ```bash
   # FIX42
   java -cp "target/quickfixj-codegenerator-*-SNAPSHOT.jar:$(mvn -q dependency:build-classpath -DincludeScope=compile -Dmdep.outputFile=/dev/stdout)" \
        org.quickfixj.codegenerator.MessageCodeGenerator \
        --spec ../quickfixj-messages/quickfixj-messages-fix42/src/main/resources/FIX42.xml \
        --transform src/main/resources/org/quickfixj/codegenerator \
        --out src/test/resources/golden/fix42 \
        --messagePackage quickfix.fix42 --fieldPackage quickfix.field \
        --orderedFields --decimal
   ```
   The easiest way is to use the existing `GoldenFileTest` parameters as a guide
   and write a small standalone `main` — or simply copy the generated output from
   the temporary folder that `GoldenFileTest` creates (set a breakpoint, or change
   `tempFolder` to a fixed path temporarily).

   Alternatively, run the following Maven snippet from the repo root, which uses
   the same settings as the test:
   ```bash
   mvn test -pl quickfixj-codegenerator -Dtest=GenerateGoldenFilesManual
   ```
   *(Create a one-off test class that calls the generator and copies output to
   `src/test/resources/golden/` if you prefer a scripted approach.)*

4. Verify only the expected files changed:
   ```bash
   git diff --stat quickfixj-codegenerator/src/test/resources/golden/
   ```
5. Run the full test suite to confirm the updated golden files now match:
   ```bash
   mvn test -pl quickfixj-codegenerator
   ```
6. Commit the updated golden files **together with your generator changes** in the
   same commit (or PR) so reviewers can see the diff side-by-side.

## Why FIX42 and FIX44?

| Coverage area          | FIX42 | FIX44 |
|------------------------|-------|-------|
| Fields                 | ✓     | ✓     |
| Messages               | ✓     | ✓     |
| Components             |       | ✓     |
| Repeating groups       | ✓ (38)| ✓ (233, incl. nested) |
| Message cracker/factory| ✓     | ✓     |

FIX42 is small enough to keep test times short while still exercising the
group-generation path.  FIX44's 233 groups (including nested groups relevant to
issue #1084) provide thorough coverage without needing all FIX versions.
