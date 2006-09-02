set CP="%CLASSPATH%"
set CP=%CP%;"%QFJ_HOME%/output/ant/jars/quickfixj.jar"
rem For Eclipse build
set CP=%CP%;"%QFJ_HOME%/output/eclipse/classes"
rem For binary release
set CP=%CP%;"%QFJ_HOME%/quickfixj.jar"

set CP=%CP%;"%QFJ_HOME%/lib/mina-core-0.9.3.jar"
set CP=%CP%;"%QFJ_HOME%/lib/backport-util-concurrent-2.1.jar"
set CP=%CP%;"%QFJ_HOME%/lib/slf4j-jdk14-1.0.1.jar"
