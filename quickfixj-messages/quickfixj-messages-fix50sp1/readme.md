# FIX 5.0 Service Pack 1

This module packages the artifacts built by the `quickfixj-messages` build step as per the `FIX 5.0sp1` specification. 

FIX Versions from FIX 5.0 distinguish the Messages, Components and Fields for Application Message from the FIX Session layer.
The QuickFIX/J reference implementation packages the FIX Session layer classes in a distinct jar to be a shared dependency 
of the artefacts for FIX 5.0 and later.

Accordingly, to avoid duplication and conflict, the FIX Session layer classes are pruned (deleted) prior to packaging. To avoid interfering with the subsequent
builds for FIX Versions prior to FIX 5.0, the classes and sources are copied to this modules build directory for the build and packaging.
