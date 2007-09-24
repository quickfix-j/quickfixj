#!/bin/sh

# @COMMENT@

scriptdir=`dirname $0`
qfjhome=$scriptdir/@QFJ_RELDIR@

CP=@CLASSPATH@

java -classpath "$CP"  quickfix.examples.executor.Executor $*