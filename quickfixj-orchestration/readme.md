QuickFIX/J support for FIX Orchestra

![](../repository-quickfix/FIXorchestraLogo.png)

The module generates a QUICKFIX/J compatible FIX dictionary and FIX "orchestration".
This module depends on the FIX Latest standard "orchestration" published by the FIX Trading Community.

Before generating the dictionary this module runs XSL transformation to remove elements from the standard repository that cause issues in the QFJ build. If and when the published standard is corrected then this transform can be edited or removed.
This transformation contains additional work-arounds such as updating some CodeSet element names help generation of appropriate static field names.
