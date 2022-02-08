# Class Pruner Maven Plugin

This plugin has a very specialised purpose. 

The purpose is to minimse the number of Java classes and generated sources for packaging artefacts of specific FIX versions. This is needed because the introduction of FIX Latest standard results in a very large number of Fields that in turn requires excessive memory and build time for the creation of Javadoc artefacts.

This is a result of the design of QuickFIX/J in that the Fields package is shared in common for multiple versions of the FIX Protocol. Accordingly the Component and Messages packages are compiled against the common package of Fields. The Messages, Components and Fields can be assembled together as in ```quickfixj-messages-all``` or separately as in ```quickfixj-messages-fix40``` to ```quickfixj-messages-fixlatest``` and ```quickfixj-messages-fixt11```. In each of these assemblies the requisite Fields are included. These packages can be used together at runtime without conflict if the Field classes are identical.

Broadly speaking the later versions of FIX are super-sets of the prior versions. There are cases of Fields being deprecated but in QuickFIX/J distributions these Fields are included in subsequent distributions.

As mentioned the FIX Latest distribution is very large and it is built in its entirety by QuickFIX/J to verify compatibility. The complete set of Fields is not required for older versions of the standard which are still in common use.

This plugin can be used before packaging a version of the standard to prune the Java sources and classes that are not included in the FIX specfication for that version. This allows Javadoc to be created and produces a more compact and concise distribution.

The plugin parses the specified QuickFIX dictionaries to identify the required Fields and deletes redundant Java sources and classes from the specifed generated sources and classes directories.

It can be used as follows. 

```
...
    <plugin>
        <!-- prune classes that are not in the FIX Dictionaries specified below -->
        <!-- this step is redundant if quickfixj-messages-all-excluding-latest module is run  -->
        <groupId>org.quickfixj</groupId>
        <artifactId>class-pruner-maven-plugin</artifactId>
        <version>${project.version}</version>
        <executions>
            <execution>
                <id>prune</id>
                <goals>
                    <goal>prune</goal>
                </goals>
                <configuration>
                    <classesDirectory>${project.basedir}/../quickfixj-messages-all/target/classes/quickfix/field</classesDirectory>
                    <generatedSourcesDirectory>${project.basedir}/../quickfixj-messages-all/target/generated-sources/quickfix/field</generatedSourcesDirectory>
                    <fileset>
                        <directory>${project.basedir}/../quickfixj-messages-all/target/classes/</directory>
                        <includes>
                            <include>**/*.xml</include>
                        </includes>
                        <excludes>
                            <exclude>**/FIXLatest.xml</exclude>	<!-- Exclude FIX latest -->
                            <exclude>OrchestraFIXLatest.xml</exclude>
                            <exclude>FIX50SP2.xml</exclude>	<!-- QFJ code generation uses a modified version of this dictionary -->
                            <exclude>FIX50SP1.xml</exclude>	<!-- QFJ code generation uses a modified version of this dictionary -->
                            <exclude>FIX44.xml</exclude>	<!-- QFJ code generation uses a modified version of this dictionary -->
                        </excludes>
                        <followSymlinks>false</followSymlinks>
                    </fileset>
                </configuration>
            </execution>
        </executions>
    </plugin>
...
```
Note:
* only <u>*later*</u> versions of the FIX specification than the one being packaged are excluded from parsing
* FIX dictionaries not used in the code generation are excluded (redundant Dictionary files are present in the project)
* the use of this plugin depends on correct ordering of the modules with the most recent versions of the FIX protocol being packaged before packaging the older versions of the protocol.
