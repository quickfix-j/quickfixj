# quickfixj-core

This module builds the QuickFIX/J FIX "engine" including supporting capabilities.

The core engine depends on ```quickfixj-base```. A small number of derived Fields are provided by ```quickfixj-base``.

 This module has <u>**test**</u> dependency on generated message classes. The distinction of <u>*test*</u> dependency is significant as it allows easier [customisation](../customising-quickfixj.md) of QuickFIX/J deployments.

## Developing quickfixj-core

To develop this module build ```quickfixj-base``` and ```quickfixj-messages``` first, or build the whole project. 

Full ```quickfixj-messages``` build times can be long. See [the ```quickfixj-messages``` readme](../quickfixj-messages/readme.md) for how to do a minimal development build of the messages. Once these dependencies are built then ```quickfixj-core``` can be built and tested independently for higher productivity.
