@echo off
set CLASSPATH=%CLASSPATH%;output/eclipse/classes
set CLASSPATH=%CLASSPATH%;output/ant/jars/quickfixj.jar
set CLASSPATH=%CLASSPATH%;lib/mina-core-0.9.3.jar
set CLASSPATH=%CLASSPATH%;lib/backport-util-concurrent-2.1.jar
set CLASSPATH=%CLASSPATH%;lib/slf4j-jdk14.jar

cd ..
java quickfix.examples.executor.Executor
