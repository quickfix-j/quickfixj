# Nadex (CDNA) Readme

## Introduction

This is a branch of a fork of the upstream QuickFIX/J. [quickfixj/quickfixj](https://github.com/quickfix-j/quickfixj)

The branch is based on the 2.3.2 tag of QuickFIX/J which is the latest stable QuickFIX/J at time of writing.  

The version of the artefacts represent the Fully

The intention is to provide a customised build of QuickFIX/J that builds reliably.
The customised artefacts can help by provided type safe generated code for the messages.

The maven co-ordinates of the artefacts are changed in comparison with the upstream repository. 
This is so the mvn artefact co-ordinates do not collide with the original QuickFIX/J mvn co-ordinates. 
The namespace of the Java packages is not changed, they are still `org.quickfixj`. 

The artefacts are intended to be used in place of the original QuickFIX/J. 
It should be practicable to use only the generated message package of interest with the original QuickFIX/J core packages. 

Some modules that are not required are also commented out in the build.

## Custom Rules of Engagement

The package of interest is :

`<groupId>com.cdna.fce</groupId>` 

`<artifactId>quickfixj-messages-fix50sp2</artifactId>`

The customisation of the FIX FIX 5.0SP2 Standard Specification is represented in the QuickFIX/J _Dictionary_ file:

`/quickfixj-messages/quickfixj-messages-fix50sp2/src/main/resources/FIX50SP2.modified.xml`

N.B. The "_modified_" suffix of the file is present in the upstream QuickFIX/J project. 
It is modified in comparison to the original QuickFIX C++ project. 
In this project we have further customised the file. 

## How to Build

For convenience a `build.sh` script is included in the base directory of the project.

