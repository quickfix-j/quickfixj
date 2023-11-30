# FIX 4.4

This module packages the artifacts built by the `quickfixj-messages` build step as per the `FIX 4.4` specification. 

FIX classes that are not present in this version of the specification are pruned (deleted) prior to packaging.
This is done _in situ_ of the `quickfixj-messages` build directory, so this build step can affect subsequent build steps.
If this has undesirable side effects consider refactoring this build step to 
copy the classes and sources to this module's build directory for the build and packaging. 