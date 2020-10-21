# FIX50sp2 Latest

This module packages the artifacts built by the "core" build step. Unlike the other message modules there is no static FIX dictionary in this module. The dictionary is generated at build time by the orchestra2quickfixj module.

Your custom repository can be used in place of the FIX Latest repository published by the FTX by updating the "fix-standard" dependency in the orchestra2quickfixj module.