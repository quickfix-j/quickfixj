# QuickFIX/J Performance test

This is a [JMH](https://github.com/openjdk/jmh) benchmark module for QuickFIX/J FIX protocol implementation. 

## How to run

### Using your favorite IDE

Performance regression classes can be individually run using your favorite IDE.

### Creating executable jar for the performance testing

Build executable jar using following maven command

```
$ mvn clean package    
```

Use following command to run complete set of performance regression test cases

```
$ java -jar target/quickfixj-perf-test.jar
```

You can list available performance benchmarks using `-l` option
```
$ java -jar target/quickfixj-perf-test.jar -l
```

You can run individual benchmarks by providing the class name or benchmark method name
```
$ java -jar target/quickfixj-perf-test.jar MessageCrackerPerfTest.crack

$ java -jar target/quickfixj-perf-test.jar MessageCrackerPerfTest
```

You can change the time unit used in the benchmark test using `-tu` option
Following command is an example of using micro second for describing benchmark test results.
```
$ java -jar target/quickfixj-perf-test.jar MessageCrackerPerfTest -tu us
```

For more available options use `-h` option

```
$ java -jar target/quickfixj-perf-test.jar -h
```

#### Guideline for future performance enhancements

1. Check if there is already benchmark available for the code you are planning to optimize.
2. If there is no benchmark code, first create a benchmark (Example `a-missing-perf-regression` branch) and make pull request to `master` branch.
3. Make your performance improvement in a new branch (Example `a-perf-improvement` branch).
4. When you make pull request provide comparison between current benchmark (`master`) and new benchmark values (`a-perf-improvement`)
5. This means providing output of the benchmark execution in two branches in a PR comment