@echo off
set CP=%CLASSPATH%;output/eclipse/classes
set CP=%CP%;output/ant/jars/quickfixj.jar
set CP=%CP%;lib/mina-core-0.9.3.jar
set CP=%CP%;lib/backport-util-concurrent-2.1.jar
set CP=%CP%;lib/slf4j-jdk14-1.0.1.jar

cd ..
java -classpath "%CP%" quickfix.examples.banzai.Banzai
