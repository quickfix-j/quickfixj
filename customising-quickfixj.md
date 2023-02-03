
# Customising QuickFIX/J

The core QuickFIX/J module is agnostic to FIX Protocol Versions. At runtime a QuickFIX/J dictionary with supporting implementation packages is required to use type-safe classes.

The specification for a FIX integration is called a "Rules of Engagement". The Rules of Engagement can be customised with the mutual agreement of the repective counter-parties.

The message, component and field implementations can be provided by a specialised build, along with the corresponding QuickFIX/J dictionary for the custom Rules of Engagement. 

The standard distribution of ```quickfixj-core``` can be used with custom artefacts. You need only build artefacts for versions of the Protocol that you use. These can be maintained independently from the QuickFIX/J project, while depending on the QuickFIX/J for the core functionality and tools.

To build custom artefacts it's helpful to understand how QuickFIX/J builds the Field, Component and Message classes from the QuickFIX/J dictionaries and from [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/).

Implementations for FIX versions FIX4.0 to FIX5.0sp2 and for FIXT1.1 are generated from the QuickFIX dictionaries for the specific version. The dictionaries are located in the ```src/main/resources``` directory of the respective modules of the ```quickfixj-messages``` module.

Implementations for FIX Latest are generated from a [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/) repository file. An implementation based on the standard FIX Orchestra repository is known as an "orchestration". The standard FIX Orchestra repository requires some modification to work well with QuickFIX/J. This is done by the ```quickfixj-orchestration``` module. The ```quickfixj-orchestration``` module publishes a modified Orchestra artefact which can then be the basis of a custom FIX Latest build.

The complete FIX Latest specification results in a very large distribution. To use FIX Latest, customisation of the [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/) repository is advisable, please see [QuickFIX/J Orchestration](./quickfixj-orchestration/readme.md) for details.

## Customisation Scenarios

### **Enable the use of ```BigDecimal``` for FIX Decimal Data Types**

This behaviour is controlled by the ```${generator.decimal}``` build property. It is "false" by default to avoid surprising side effects of Incompatible Data Types.

To enable the use of  ```BigDecimal``` in code generation, set the  ```${generator.decimal}``` property to "true" in [quickfix-messages](./quickfixj-messages/readme.md) and build the message artefacts.

```
	<properties>
		<generator.decimal>true</generator.decimal>
	</properties>
```
See [QuickFIX/J Messages](./quickfixj-messages/readme.md) for details of the build and recommendation for  **how to implement custom builds.**

### **Incompatible Data Types**

Some incompatable changes have occurred in the evolution of the FIX protocol. For example see below changes to the type of **OrderQty (38)** :

|FIX Version|Field Name|FIX Datatype|Base Type|QuickFIX/J Datatype|
|---|---|---|---|---|
|4.0|OrderQty|int|int|```int```|
|4.2|OrderQty|Qty|float|```Double``` or ```BigDecimal```|

Only one ```quickfix.Field``` class with the same name may be loaded by the Java classloader so only one version of this Field should be in the classpath. QuickFix/J also verifies the data type using the supplied QuickFIX "Dictionary". 

Code generation using ```BigDecimal``` is incompatible at runtime with ```int``` for **OrderQty**. In this case, ```double``` is compatible with ```int``` at run time due to [widening primitive conversion](http://titanium.cs.berkeley.edu/doc/java-langspec-1.0/5.doc.html). 

Runtime incompatabilities can be resolved by:
* Amending the QuickFIX Dictionary to coerce the code generation and/or validation
* Changing the ordering of code generation and/or overwrite behaviour of code generation
* Building independent artefacts for conflicting versions and not using them in the same runtime

See [QuickFIX/J Messages](./quickfixj-messages/readme.md) for details of the build and recommendation for  **how to implement custom builds.**

### **Managing incompatibility with Prior Versions of QuickFIX/J**

From QuickFIX/J 3.0.0 the code generation for ```quickfix.Field``` prefers the FIX Orchestra Standard. This results in incompatible changes to the names of constants. 

For example : ```SettlType.REGULAR_FX_SPOT_SETTLEMENT``` becomes ```SettlType.REGULAR```. 

The required code changes may be trvial in most cases but they are elective. To use ```quickfix-core``` from QuickFIX/J  3.0.0 or later without needing to implement code changes:
* build the required Message artefacts without the FIX Latest code generation. The Fields will then be generated only from legacy FIX Protocol Versions as they were prior to QuickFIX/J 3.0.0 - **or**
* if you want to use Messages, Components and/or Fields from FIX Latest while preferring legacy constants, manipulate the order of code generation and/or the over-write behaviour to prefer earlier versions of FIX. For example, prevent FIX Latest code generation from over-writing existing generated sources (Fields).

See [QuickFIX/J Messages](./quickfixj-messages/readme.md) for details of the build and recommendation for  **how to implement custom builds.**

### **Customising the FIX Protocol for specialised Rules of Engagement**

A Rules of Engagement can include customisation Messages, Components and Fields, including User Defined elements.

This can be accomplished by editing the QuickFIX Dictionary or FIX Orchestra Repository (Orchestration) for the specific Rules of Engagement.

Omission of unused elements accelerates comprehension and faciliates the generation of documents and other artefacts.

[FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/) is intended for customisation to produce machine-readable Rules of Engagement.

See [QuickFIX/J Messages](./quickfixj-messages/readme.md) for details of the build and recommendation for  **how to implement custom builds.**
