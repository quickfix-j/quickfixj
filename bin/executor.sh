#!/bin/sh

CLASSPATH=quickfixj.jar
CLASSPATH=$CLASSPATH:output/ant/jars/quickfixj.jar
CLASSPATH=$CLASSPATH:output/eclipse/classes
CLASSPATH=$CLASSPATH:lib/tl-netty2-1.8.0.jar
CLASSPATH=$CLASSPATH:lib/backport-util-concurrent-2.0.jar
CLASSPATH=$CLASSPATH:lib/commons-logging-1.0.4.jar

cd ..
java quickfix.examples.executor.Executor
