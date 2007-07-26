#!/bin/sh

# For ANT build
pwd
CP=$CP:core/target/quickfixj-core.jar:core/target/quickfixj-msg-fix40.jar:core/target/quickfixj-msg-fix41.jar:core/target/quickfixj-msg-fix42.jar:core/target/quickfixj-msg-fix43.jar:core/target/quickfixj-msg-fix44.jar
CP=$CP:examples/target/quickfixj-examples.jar
# For Eclipse build
CP=$CP:classes
# For binary release
CP=$CP:quickfixj-core.jar
CP=$CP:quickfixj-msg-fix40.jar
CP=$CP:quickfixj-msg-fix41.jar
CP=$CP:quickfixj-msg-fix42.jar
CP=$CP:quickfixj-msg-fix43.jar
CP=$CP:quickfixj-msg-fix44.jar



# Supporting libraries
#CP=$CP:core/src/main/lib/mina-core-1.1.0.jar
CP=$CP:core/src/main/lib/mina-core-1.0.3.jar
CP=$CP:core/src/main/lib/backport-util-concurrent-2.1.jar
CP=$CP:core/src/main/lib/slf4j-api-1.3.0.jar
CP=$CP:core/src/main/lib/slf4j-jdk14-1.3.0.jar

java -classpath "$CP" $*
