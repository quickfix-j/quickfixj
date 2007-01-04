#!/bin/sh

# For ANT build
CP=$CP:../output/ant/jars/quickfixj.jar
# For Eclipse build
CP=$CP:../output/eclipse/classes
# For binary release
CP=$CP:../quickfixj.jar

# Supporting libraries
CP=$CP:../lib/mina-core-0.9.3.jar
CP=$CP:../lib/backport-util-concurrent-2.1.jar
CP=$CP:../lib/slf4j-jdk14-1.0.1.jar

java -classpath "$CP" $*
