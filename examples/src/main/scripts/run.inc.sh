#!/bin/sh

# For ANT build
pwd
CP=$CP:core/target/quickfixj.jar
CP=$CP:examples/target/quickfixj-examples.jar
# For Eclipse build
CP=$CP:classes
# For binary release
CP=$CP:quickfixj.jar

# Supporting libraries
CP=$CP:core/src/main/lib/mina-core-0.9.3.jar
CP=$CP:core/src/main/lib/backport-util-concurrent-2.1.jar
CP=$CP:core/src/main/lib/slf4j-jdk14-1.0.1.jar

java -classpath "$CP" $*
