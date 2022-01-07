# repository-quickfix

![](FIXorchestraLogo.png)

This module is derived from the FIX Trading Community [fix-orchestra-quickfix](https://github.com/FIXTradingCommunity/fix-orchestra-quickfix).
Accordingly the Apache 2.0 license is applicable.

This module provides code generation for QuickFIX/J messages classes from a FIX Orchestration.
It also generates the QuickFIX/J message dictionary.

This method of code generation is faster than the xslt transformations used to build from QuickFIX/J dictionary specifications.
It was not possible to meet build time constraints using the xslt approach when building from the FIX standard orchestration.

The code was copied into this repository for the following reasons :
* to eliminate a mutual (cyclic) dependency between the build for the original repository and the QuickFIX/J build
* the code generation is coupled to the QuickFIX/J implementation therefore its "reason to change" is when the QuickFIX/J implementation changes
* the FIX orchestration produced by the QuickFIX/J project can be customised and this artefact used to generate a customised FIX Latest message package for a specific Rules of Engagement