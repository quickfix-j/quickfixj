# quickfixj-core

This module builds the QuickFIX/J FIX "engine" including supporting capabilities.

The core engine depends on ```quickfixj-base``` and does not have compile time dependency on the Field, Component and Messages classes derived from base classes in ```quickfixj-base```. A small number of derived Fields are provided by ```quickfixj-base``.

This module does have <u>**test**</u> dependency on generated message classes. The distinction of <u>*test*</u> dependency is significant as it allows easier [customisation](../customising-quickfixj.md) of QuickFIX/J deployments.

## Developing quickfixj-core

To develop this module build ```quickfixj-base``` and ```quickfixj-messages``` first, or build the whole project. 

Full ```quickfixj-messages``` build times can be long. See [the ```quickfixj-messages``` readme](../quickfixj-messages/readme.md) for how to do a minimal development build of the messages. Once these dependencies are built then ```quickfixj-core``` can be built and tested independently for higher productivity.

If and when you import the project into an IDE it can be better to exclude or close the ```quickfixj-messages``` module(s) to reduce the memory and computation overheads of importing these large packages.
