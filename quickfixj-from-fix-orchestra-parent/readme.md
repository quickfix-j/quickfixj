# Repository To Quickfix Tools

![](FIXorchestraLogo.png)

This artifacts in this module relate to the FIX Trading Community FIX Orchestra project. 

The code is based on prior work by the FTC, see [fix-orchestra-quickfix](https://github.com/FIXTradingCommunity/fix-orchestra-quickfix).

This module provides code generation and QuickFIX/J message dictionary generation for QuickFIX/J from a FIX Orchestration.

The code was copied into this repository for the following reasons :
* to eliminate a mutual (cyclic) dependency between the build for the original repository and the QuickFIX/J build
* the code generation is coupled to the QuickFIX/J implementation therefore its "reason to change" is when the QuickFIX/J implementation changes
* to provide tools for easier customisation of QuickFIX/J for specific Rules of Engagement