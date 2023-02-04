QuickFIX/J support for FIX Orchestra

![](./FIXorchestraLogo.png)

The module publishes a QUICKFIX/J compatible FIX dictionary and a QUICKFIX/J FIX "orchestration".

An "orchestration" is an implementation of a FIX Orchestra standard repository. 
This module depends on the FIX Latest standard "orchestration" published by the FIX Trading Community.

Before generating the dictionary this module runs XSL transformation to remove elements from the standard repository that cause issues in the QFJ build. If and when the published standard is corrected then this transform can be edited or removed.
This transformation contains additional workarounds such as updating some CodeSet element names help generation of appropriate static field names.

This module publishes the resulting artefact which is subsequently used to generate a QuickFIX/J implementation for FIX Latest. 

The published artefact can also be the basis of a custom implementation of FIX Latest.

The complete FIX Latest specification results in a very large distribution. This project builds the entire specification to prove compatibility. 

Customisation is advisable to use FIX Latest for an integration. This will allow a more clear representation  the Rules of Engagement, and aids maintainability as well as speeding build time and reducing memory requirements for the build.

See [QuickFIX/J Messages](./quickfixj-messages/readme.md) for details of the build and recommendations of how to implement custom builds.

A number of utilities and tools for working with FIX Orchestrations can be found at the [FIX Trading Community github organization](https://github.com/FIXTradingCommunity). This includes [tablature](https://github.com/FIXTradingCommunity/tablature) which can be used for authoring and documenting FIX orchestrations. Members of the [FIX Trading Community](https://www.fixtrading.org/) have access to additional tools.

The approach taken in this project is to use ```xslt``` to transform the original FIX Orchestra repository.
