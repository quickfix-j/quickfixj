# FIXT1.1

This module packages the artifacts built by the `quickfixj-messages` build step as per the `FIX T1.1` specification. 

FIX Versions from FIX 5.0 distinguish the Messages, Components and Fields for Application Message from the FIX Session layer.
The QuickFIX/J reference implementation packages the FIX Session layer classes in this distinct jar to be a shared dependency 
of the artefacts for FIX 5.0 and later.

To avoid duplication and conflict, following code generation, this module omits a number of Field classes that are 
of necessity included in the `quickfixj-base` jar. 
