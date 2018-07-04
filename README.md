QuickFIX/J
==========

[![Build Status](https://travis-ci.org/quickfix-j/quickfixj.svg?branch=master)](https://travis-ci.org/quickfix-j/quickfixj)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.quickfixj/quickfixj-core/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.quickfixj/quickfixj-core)

This is the official QuickFIX/J project repository.

## intro
QuickFIX/J is a full featured messaging engine for the FIX protocol.
It is a 100% Java open source implementation of the popular C++ QuickFIX engine.

The Financial Information eXchange (FIX) protocol is a messaging standard developed
specifically for the real-time electronic exchange of securities transactions.
FIX is a public-domain specification owned and maintained by FIX Protocol, Ltd (FPL).

For more information see the project website at http://www.quickfixj.org.

## questions
For asking questions please use the mailing list: https://lists.sourceforge.net/lists/listinfo/quickfixj-users

## issues
Please report issues at http://www.quickfixj.org/jira.

## contributions

Pull requests are always welcome! Best is if you added a unit test to show that a certain bug has been fixed or a new feature works as expected.

## build instructions

Fastest: clone the repo and issue the following command.
```
$ mvn clean package -Dmaven.javadoc.skip=true -DskipTests
```

Slower: if you only want to skip the acceptance test suite:
```
$ mvn clean package -Dmaven.javadoc.skip=true -DskipAT=true
```

Slow: if you want to run all tests:
```
$ mvn clean package -Dmaven.javadoc.skip=true
```
