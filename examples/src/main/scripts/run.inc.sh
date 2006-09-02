#!/bin/sh

# For ANT build
CP=$CP:core/target/quickfixj.jar
# For Eclipse build
CP=$CP:classes
# For binary release
CP=$CP:quickfixj.jar

# Supporting libraries
CP=$CP:core/src/main/lib/mina-core-0.9.3.jar
CP=$CP:core/src/main/lib/backport-util-concurrent-2.1.jar
CP=$CP:core/src/main/lib/slf4j-jdk14-1.0.1.jar

java -classpath "$CP" $*
