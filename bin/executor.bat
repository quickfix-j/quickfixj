@echo off
set CLASSPATH=%CLASSPATH%;output/ant/jars/quickfixj.jar
set CLASSPATH=%CLASSPATH%;lib/mina-0.8.2.jar
set CLASSPATH=%CLASSPATH%;lib/backport-util-concurrent-2.1.jar
set CLASSPATH=%CLASSPATH%;lib/slf4j-jdk14-1.0-rc5.jar

cd ..
java quickfix.examples.executor.Executor
