# QuickFIX/J Java Concurrency Stress Test

This is a [Java Concurrency Stress (jcstress)](https://github.com/openjdk/jcstress) concurrency stress testing module for QuickFIX/J FIX protocol implementation.

## How to Run

Concurrency stress testing classes can be individually run using your favorite IDE or command line.

### Building the Executable JAR

#### Build Full Project

To build the entire project including all modules:

```bash
$ mvn clean package
```

#### Build Only `quickfixj-stress-test` Module

Build the stress test module with required dependencies, skipping test execution:

```bash
$ mvn clean package -pl quickfixj-stress-test -am -Dmaven.javadoc.skip=true -DskipTests -DskipAT=true -PskipBundlePlugin,minimal-fix-latest
```

**Command Options Explained:**
- `-pl quickfixj-stress-test` - Build only the stress test module
- `-am` - Also build required dependent modules
- `-Dmaven.javadoc.skip` - Skip JavaDoc generation
- `-DskipTests` - Skip running unit test cases during build
- `-DskipAT=true` - Skip running acceptance tests
- `-PskipBundlePlugin,minimal-fix-latest` - Skip bundle plugin and use minimal FIX Orchestra code generation

### Running Tests

#### Run Complete Test Suite

Execute all concurrency regression test cases:

```bash
$ java -jar quickfixj-stress-test/target/quickfixj-stress-test.jar
```

#### Run a Single Test

Run a specific test class or test group (if test cases are nested):

```bash
$ java -jar quickfixj-stress-test/target/quickfixj-stress-test.jar -t JdbcStoreStressTest
```

#### View Available Options

Display all available command-line options:

```bash
$ java -jar quickfixj-stress-test/target/quickfixj-stress-test.jar -h
```

## Common Options

Some useful jcstress options include:

- `h` - Display help 
- `-t <test>` - Run specific test or test group
- `-v` - Verbose mode
- `-jvmArgs <args>` - Additional JVM arguments

## Additional Notes

- For CI/CD integration, use the full path to the JAR file
- Stress tests may take significant time to complete depending on your system resources
- Review jcstress documentation for advanced configuration options

## Troubleshooting

If you encounter issues:

- Verify the JAR file was built successfully in `quickfixj-stress-test/target/`
- Check that you have sufficient system resources (CPU, memory)
- Review the jcstress output for specific error messages