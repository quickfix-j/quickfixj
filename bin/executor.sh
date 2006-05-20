#!/bin/sh

CLASSPATH=$CLASSPATH:output/ant/jars/quickfixj.jar
CLASSPATH=$CLASSPATH:output/eclipse/classes
CLASSPATH=$CLASSPATH:lib/mina-core-0.93.jar
CLASSPATH=$CLASSPATH:lib/backport-util-concurrent-2.1.jar
CLASSPATH=$CLASSPATH:lib/slf4j-jdk14.jar
export CLASSPATH

cd ..
java quickfix.examples.executor.Executor
