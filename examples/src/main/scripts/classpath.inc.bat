set CP="%CLASSPATH%"
set CP=%CP%;"%QFJ_HOME%/core/target/quickfixj.jar"
rem For Eclipse build
set CP=%CP%;"%QFJ_HOME%/classes"
rem For binary release
set CP=%CP%;"%QFJ_HOME%/quickfixj.jar"

rem For build environment
set CP=%CP%;"%QFJ_HOME%/core/src/main/lib/mina-core-1.0.1.jar"
set CP=%CP%;"%QFJ_HOME%/core/src/main/lib/backport-util-concurrent-2.1.jar"
set CP=%CP%;"%QFJ_HOME%/core/src/main/lib/slf4j-api-1.2.jar"
set CP=%CP%;"%QFJ_HOME%/core/src/main/lib/slf4j-jdk14-1.2.jar"

rem For binary release
set CP=%CP%;"%QFJ_HOME%/lib/mina-core-1.0.1.jar"
set CP=%CP%;"%QFJ_HOME%/lib/backport-util-concurrent-2.1.jar"
set CP=%CP%;"%QFJ_HOME%/lib/slf4j-api-1.2.jar"
set CP=%CP%;"%QFJ_HOME%/lib/slf4j-jdk14-1.2.jar"
