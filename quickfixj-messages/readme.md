# QuickFIX/J Messages

## How the build is organised

This module builds artefacts for the standard published FIX specification versions from FIX 4.0 to FIX Latest. 

* ```quickfixj-messages-fix40```
* ```quickfixj-messages-fix41```
* ```quickfixj-messages-fix42```
* ```quickfixj-messages-fix43```
* ```quickfixj-messages-fix44```
* ```quickfixj-messages-fix50```
* ```quickfixj-messages-fix50sp1```
* ```quickfixj-messages-fix50sp2```
* ```quickfixj-messages-fixlatest```
* ```quickfixj-messages-fixt11```
* ```quickfixj-messages-all``` - includes all of the above

QuickFIX/J core is agnostic to FIX Protocol specification versions. It is designed to support multiple concurrent versions at run time. 

Messages and components are effecively containers for ```Maps``` of ```quickfix.Fields```.
The messages and components are in distinct packages for the FIX protocol versions. A result of this design is that the ```quickfix.Fields``` package is common to all the FIX protocol version packages. By and large the more recent versions are super-sets of prior versions. 

The Fields, Components and Messages depend on packages provided by ```quickfixj-base```. Some Standard Header and Trailer ```quickfix.Fields``` are provided by the ```quickfixj-base``` artefacts. These fields are removed from the generated code to avoid conflicts with those provided by ```quickfixj-base```.

Implementations for FIX versions **FIX4.0 to FIX5.0sp2 and for FIXT1.1** are generated from the QuickFIX dictionaries for the specific version. The dictionaries are located in the ```src/main/resources``` directory of the respective modules of the ```quickfixj-messages``` module.

Implementations for **FIX Latest** are generated from a [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/) repository file. An implementation based on the FIX Orchestra standard is known as an "orchestration". The official standard FIX Orchestra repository requires some modification to work well with QuickFIX/J. This is done by the ```quickfixj-orchestration``` module. The code generation for FIX Latest depends on the orchestration published by the ```quickfixj-orchestration``` module.

A result of this is that almost all the Field classes are those generated for FIX Latest from the FIX Latest Orchestration. Before compilation java sources for generated Fields that are already packaged in ```quickfixj-base``` are deleted to avoid potential conflicts.

The code generation for the FIX Protocol specification versions proceeds in order from oldest to latest, with the class generated from most recent specification of a Field over-writing any prior classes. This behaviour can be controlled using the ```overwrite``` parameter on the ```quickfixj-codegenerator``` maven plugin and by changing the order of processing.

This scheme works well though in a few cases; the data type of the Field, with the same designated java class name, has changed between legacy versions. In these cases a choice needs to be made which data type to use. The QuickFIX/J project prefers the most recent specification of the field. In the unlikely event that a legacy version of a Field is required a custom build can be implemented. Please note that a legacy implementation of a Field cannot be used in the same Java runtime as an incompatible class of the same name.

[FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/) and ***FIX Latest*** are intended for customisation. See "Recommendation on how to implement a custom build".

```quickfixj-messages-all``` generated the sources for all FIX Protocol versions and packages all the versions together. 

The other modules package the FIX Protocol specification versions independently. This is done in reverse order so that fields not present in older protocol versions can be pruned prior to packaging. This results in smaller packages and javadoc can be run without requiring excessively large heap size and build time.

It is not neccessary for an application to depend on ```quickfixj-messages-all```. An application can depend only the artefacts for the FIX Protocol versions that it requires. Please note that application using FIX Protocol versions **5.0 and later** will also depend on ```quickfixj-messages-fixt11```. This provides the implementation for the FIXT1.1 Transport messages.

## Recommendation on how to implement a custom build

The artefacts created by this module are <u>**test**</u> dependendencies of ```quickfixj-core```. They are not specified as _runtime_ dependencies, this makes it easier to customise QuickFIX/J deployments. Artefacts containing Field, Component and message packages will need to be included as **compile** dependencies for the application that depends on ```quickfixj-core```.

Artefacts for unused FIX specification versions can be omitted from your runtime and it is not neccessary to build artefacts that are not used. Please note that application using FIX Protocol verisions 5.0 and later will also depend on ```quickfixj-messages-fixt11```. This provides the implementation for the FIXT1.1 transport messages.

A custom build can provide custom artefacts for the required Fields, Component and Message. The QuickFIX/J project can supply  ```quickfixj-core``` and tools.

**Custom builds must provide all the Fields, Components and Messages and exclude those few Fields provided by ```quickfixj-base```.**  This avoids ambiguity, conflicts (*package name space collisions*) and jvm class verification exceptions. At run time the Components and Messages must use the Fields against which they have been compiled. Message artefacts from the QuickFIX/J project cannot be mixed with custom distributions but ```quickfixj-core```, ```quickfixj-base``` and tools can be used by dependent applications and builds.

One way to implement a custom build this is to copy this maven module with its directory structure into an independent build. If doing so:
* The Maven ```groupId```s should be changed (it's not neccessary nor desirable to use ```org.quickfixj``` for custom distributions). The ```version```s and ```artefactId```s may likewise be changed. Artefacts can be published to public maven repositories as long as the QuickFIX/J ```groupId``` is not used. 
* Ensure the QuickFIX Software Licence is included in the distribution. It can be found in the root of this project.
* Modules and directories for FIX Protcol versions that are not required can be removed. The ```quickfixj-messages-all``` contains the code generation. If removing unused FIX protocol versions then this module will need to be edited to omit these versions.
* FIX versions **FIX4.0 to FIX5.0sp2 and for FIXT1.1**
  * Edit the QuickFIX dictionary for the FIX protocol version that you are customising. The dictionary is found in ```/src/main/resources``` directory of the module corresponding to the FIX protocol version.
* FIX Latest:
  * The [```quickfixj-orchestration```](../quickfixj-orchestration/readme.md) module publishes a FIX Latest orchestration that is QuickFIX/J compatible. This can be a starting point for customisation. Please note that this is a complete representation of the FIX Latest specification and results in a very large distribution.The purpose of [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/) is to provide a machine-readable Rules of Engagement so sustomisation is expected. See [```quickfixj-orchestration```](../quickfixj-orchestration/readme.md) for references to [FIX Trading Community](https://www.fixtrading.org/) tools.
  * The custom orchestation should replace the ```org.quickfixj:quickfixj-orchestration``` dependency for this module
  * The ```quickfixj-messages-all``` includes a ```codeql``` profile. The purpose of this is to minimise the FIX Latest packages in this profile. The minimal packages will include only those Fields, Componenents and Messages on which tests in the ```quickfixj-core``` module depend. This is done to reduce memory requirements so codeql can be run without OOM exceptions. This profile provides an example of customising an orchestration using xslt but is not required in a custom build and can be removed. A custom orchestration should be much smaller than the full FIX Latest orchestration.
* The modules can be refactored to meet your requirements. For example if only one FIX version is required the current structure can be simplified.
