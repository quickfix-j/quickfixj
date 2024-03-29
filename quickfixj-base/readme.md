# quickfixj-base

The ```quickfixj-base``` module consists of Java classes on which generated QuickFIX/J Fields, Components and Messages depend.

There is a mutual dependency for a small number of generated Fields used in the ```Standard Header``` and ```Standard Trailer```. These Fields are therefore generated by this module, compiled by it and provided in the jar artefact.

To assure Java runtime compatibility these Fields should not be included in other QuickFIX/J or custom artefacts. The list of fields can be found in the [xslt transform](./src/main/xsl/extractRequiredFields.xsl) used by the build in ```./src/main/xsl/```.

The Fields in question are those defined in the (perhaps counter-intuitive) template match expression.

 Example: 

```
<xsl:template match="fixr:fields/fixr:field[not( @id='1156' or ....)] />
```

The build extracts the specifications for the required fields <u>only</u> from a FIX Latest orchestration and uses the ```quickfixj-from-fix-orchestra-code-generator-maven-plugin``` to generate the Field sources.

See [```quickfixj-orchestration```](../quickfixj-orchestration/readme.md) for more information about [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/).