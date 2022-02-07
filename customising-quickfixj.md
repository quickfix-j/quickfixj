
# Customising QuickFIX/J

The core QuickFIX/J module is agnostic to FIX Protocol Versions. At runtime a QuickFIX/J dictionary with supporting implementation packages is required to use type-safe classes.

The specification for a FIX integration is called a "Rules of Engagement". The Rules of Engagement can be customised with the mutual agreement of the repective counter-parties.

The message, component and field implementations can be provided by a specialised build, along with the corresponding QuickFIX/J dictionary for the custom Rules of Engagement. 

The standard distribution of ```quickfixj-core``` can be used with custom artefacts. You need only build artefacts for versions of the Protocol that you use. These can be maintained independently from the QuickFIX/J project, while depending on the QuickFIX/J for the core functionality and tools.

To build custom artefacts it's helpful to understand how QuickFIX/J builds the Field, Component and Message classes from the QuickFIX/J dictionaries and from [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/).

Implementations for FIX versions FIX4.0 to FIX5.0sp2 and for FIXT1.1 are generated from the QuickFIX dictionaries for the specific version. The dictionaries are located in the ```src/main/resources``` directory of the respective modules of the ```quickfixj-messages``` module.

QuickFIX/J implementations for FIX Latest are generated from a [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/) repository file. An implementation based on the standard FIX Orchestra repository is known as an "orchestration". The standard FIX Orchestra repository requires some modification to work well with QuickFIX/J. This is done by the ```quickfixj-orchestration``` module. The ```quickfixj-orchestration``` module publishes the resulting artefact which can be the basis of a custom FIX Latest build.

The complete FIX Latest specification results in a very large distribution. To use FIX Latest, customisation is advisable, please see [QuickFIX/J Orchestration](./quickfixj-orchestration/readme.md).

See [QuickFIX/J Messages](./quickfixj-messages/readme.md) for details of the build and recommendations of how to implement custom builds.