@echo off
set CLASSPATH=quickfixj.jar
set CLASSPATH=%CLASSPATH%;output/ant/jars/quickfixj.jar
set CLASSPATH=%CLASSPATH%;output/eclipse/classes
set CLASSPATH=%CLASSPATH%;lib/tl-netty2-1.8.0.jar
set CLASSPATH=%CLASSPATH%;lib/backport-util-concurrent-2.0.jar
set CLASSPATH=%CLASSPATH%;lib/commons-logging-1.0.4.jar

cd ..
java quickfix.examples.banzai.Banzai
