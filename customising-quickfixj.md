
# Customising QuickFIX/J

The core QuickFIX/J module is agnostic to FIX Protocol Versions. At runtime a QuickFIX/J dictionary with supporting implementation packages is required to use type-safe classes.

The specification for a FIX integration is called a "Rules of Engagement". The Rules of Engagement can be customised with the mutual agreement of the respective counter-parties.

The message, component and field implementations can be provided by a specialised build, along with the corresponding QuickFIX/J dictionary for the custom Rules of Engagement. 

The standard distribution of ```quickfixj-core``` can be used with custom artefacts. You need only build artefacts for versions of the Protocol that you use. These can be maintained independently from the QuickFIX/J project, while depending on the QuickFIX/J for the core functionality and tools.

To build custom artefacts it's helpful to understand how QuickFIX/J builds the Field, Component and Message classes from the QuickFIX/J dictionaries and from [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/).

The QuickFIX/J reference implementations for FIX versions FIX4.0 to FIX5.0sp2 and for FIXT1.1 are generated from the QuickFIX dictionaries for the specific version. The dictionaries are located in the ```src/main/resources``` directory of the respective modules of the ```quickfixj-messages``` module. 
Maintaining the FIX4.0 to FIX5.0sp2 builds intentionally provides consistency with the prior QuickFIX/J 2 release in order to ease migration to QuickFIX/J 3.  

The most recent standard is defined as [FIX Latest](https://www.fixtrading.org/online-specification/). The QuickFIX/J reference implementation for FIX Latest is generated from a [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/) repository file. 
An implementation or customisation of the FIX Standars derived from the FIX Orchestra repository is known as an "_orchestration_". 
The standard FIX Orchestra repository requires some modification to work well with QuickFIX/J. 
This is done by the ```quickfixj-orchestration``` module. 
The ```quickfixj-orchestration``` module publishes a modified Orchestra artefact which can then be the basis of a custom FIX Latest build using QuickFIX/J .

The complete reference FIX Latest specification results in a very large distribution. 
To use FIX Latest, customisation of the [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/) repository is advisable.
Please see [QuickFIX/J Orchestration](./quickfixj-orchestration/readme.md) for details.

## Customisation Scenarios

### **Enable the use of ```BigDecimal``` for FIX Decimal Data Types**

This behaviour is controlled by the ```${generator.decimal}``` build property. It is "false" by default to avoid surprising side effects of incompatible data types.

To enable the use of  ```BigDecimal``` in code generation, set the  ```${generator.decimal}``` property to "true" in [quickfixj-messages](./quickfixj-messages/readme.md) and build the message artefacts.

```
	<properties>
		<generator.decimal>true</generator.decimal>
	</properties>
```
See [QuickFIX/J Messages](./quickfixj-messages/readme.md) for details of the build and recommendation for  **how to implement custom builds.**

### **Incompatible Data Types**

Some incompatible changes have occurred in the evolution of the FIX protocol. For example see below changes to the type of **OrderQty (38)** :

|FIX Version|Field Name|FIX Datatype|Base Type|QuickFIX/J Datatype|
|---|---|---|---|---|
|4.0|OrderQty|int|int|```int```|
|4.2|OrderQty|Qty|float|```Double``` or ```BigDecimal```|

Only one ```quickfix.Field``` class with the same name may be loaded by the Java classloader so only one version of this Field should be in the classpath. QuickFix/J also verifies the data type using the supplied QuickFIX "Dictionary". 

Code generation using ```BigDecimal``` is incompatible at runtime with ```int``` for **OrderQty**. In this case, ```double``` is compatible with ```int``` at run time due to [widening primitive conversion](http://titanium.cs.berkeley.edu/doc/java-langspec-1.0/5.doc.html). 

Runtime incompatibilities can be resolved by:
* Amending the QuickFIX Dictionary to coerce the code generation and/or validation
* Changing the ordering of code generation and/or overwrite behaviour of code generation
* Omitting incompatible versions from your customised build
* Building artefacts independently for the conflicting versions and ensuring they are not used them in the same runtime

See [QuickFIX/J Messages](./quickfixj-messages/readme.md) for details of the build and recommendation for  **how to implement custom builds.**

### **Customising the FIX Protocol for specialised Rules of Engagement**

A Rules of Engagement can include customisation Messages, Components and Fields, including User Defined elements.

It is not necessary to maintain a fork of the entire QuickFIX/J project to provide customised QuickFIX Dictionaries and to 
generate type-safe libraries that are interoperable with QuickFIX/J. 

[FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/) is intended for customisation to produce machine-readable Rules of Engagement.

Consider creating a new project (or projects) to build the Messages, Components and Fields as needed for your specific Rules of Engagement. 

Edit the QuickFIX Dictionary or FIX Orchestra Repository (Orchestration) as required and 
build the Messages, Components and Fields packages using the tools provided by the QuickFIX/J projects. 

QuickFIX/J Dictionaries, FIX Orchestra Orchestrations and/or documents can also be generated. 

See [QuickFIX/J Messages](./quickfixj-messages/readme.md) for details of the build and recommendation for  **how to implement custom builds.**

### **Managing incompatibility with Prior Versions of QuickFIX/J**

From QuickFIX/J 3.0.0 the code generation for ```quickfix.Field``` prefers the FIX Orchestra Standard. This results in incompatible changes to the names of constants. 

For example : ```SettlType.REGULAR_FX_SPOT_SETTLEMENT``` becomes ```SettlType.REGULAR```. 

The required code changes may be trivial in most cases, but changes are elective. 
The following describes how to use ```quickfixj-core``` from QuickFIX/J  3 without needing to implement code changes:
* build the required Message artefacts without the FIX Latest code generation. The Fields will then be generated only from legacy FIX Protocol Versions as they were prior to QuickFIX/J 3.0.0 - **or**
* if you want to use Messages, Components and/or Fields from FIX Latest while preferring legacy constants, 
manipulate the order of code generation and/or the over-write behaviour of code behaviour to prefer earlier versions of FIX. 
For example, generate FIX Latest first and overwrite the generated Field classes by subsequently running code generation for an earlier version.

See [QuickFIX/J Messages](./quickfixj-messages/readme.md) for details of the build and recommendation for  **how to implement custom builds.**
