@echo off
set CLASSPATH=quickfixj.jar
set CLASSPATH=%CLASSPATH%;output/ant/jars/quickfixj.jar
set CLASSPATH=%CLASSPATH%;output/eclipse/classes
set CLASSPATH=%CLASSPATH%;lib/tl-netty2-1.8.0.jar
set CLASSPATH=%CLASSPATH%;lib/backport-util-concurrent.jar
set CLASSPATH=%CLASSPATH%;lib/commons-logging.jar

cd ..
java quickfix.examples.executor.Executor
