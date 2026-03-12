# Building QuickFIX/J with Custom Messages

## Overview

QuickFIX/J allows you to customize FIX Protocol implementations to suit your organization's specific "Rules of Engagement". This guide explains how to generate a custom build with customized Messages, Components, and Fields without needing to maintain a fork of the entire QuickFIX/J project.

## Table of Contents

- [Understanding QuickFIX/J Message Architecture](#understanding-quickfixj-message-architecture)
- [When to Create a Custom Build](#when-to-create-a-custom-build)
- [Tools for Custom Builds](#tools-for-custom-builds)
- [Customization Techniques](#customization-techniques)
- [Step-by-Step: Creating a Custom Build](#step-by-step-creating-a-custom-build)
- [Best Practices](#best-practices)
- [Troubleshooting](#troubleshooting)

---

## Understanding QuickFIX/J Message Architecture

### Core Concepts

- **QuickFIX/J Core** (`quickfixj-core`) is agnostic to FIX Protocol versions
- Messages and Components are compositions of `quickfix.Field` objects
- The `quickfix.Field` package is common to all FIX protocol versions
- Fields, Components, and Messages are generated from:
  - **QuickFIX Dictionaries** (for FIX 4.0 to FIX 5.0SP2)
  - **FIX Orchestra Repositories** (for FIX Latest and FIXT1.1)

### Module Structure

```
quickfixj-base          → Provides base classes and some standard fields
quickfixj-core          → FIX engine (version-agnostic)
quickfixj-messages      → Generated messages (test dependency only)
  ├── quickfixj-messages-fixt11
  ├── quickfixj-messages-fix50sp2
  ├── quickfixj-messages-fix50sp1
  ├── quickfixj-messages-fix50
  ├── quickfixj-messages-fix44
  ├── quickfixj-messages-fix43
  ├── quickfixj-messages-fix42
  ├── quickfixj-messages-fix41
  └── quickfixj-messages-fix40
```

> **Important**: Message artefacts are **test** dependencies of `quickfixj-core`, not compile or runtime dependencies. This design makes customization easier.

---

## When to Create a Custom Build

Consider creating a custom build when you need to:

1. **Customize Messages, Components, or Fields** for your specific Rules of Engagement
2. **Add User-Defined Fields** not in the standard FIX specification
3. **Modify field requirements** (required vs optional)
4. **Omit unused FIX versions** to reduce distribution size
5. **Use `BigDecimal`** instead of `Double` for decimal types
6. **Resolve incompatibilities** between FIX versions
7. **Maintain legacy constant names** when migrating from QuickFIX/J 2.x

---

## Tools for Custom Builds

The QuickFIX/J project provides several tools for generating custom builds:

### 1. Legacy Code Generator (FIX 4.0 - 5.0SP2)

**Maven Plugin**: `quickfixj-codegenerator`

Generates Field, Component, and Message sources from QuickFIX Dictionary XML files.

```xml
<plugin>
    <groupId>org.quickfixj</groupId>
    <artifactId>quickfixj-codegenerator</artifactId>
    <version>${quickfixj.version}</version>
    <executions>
        <execution>
            <id>generate-messages</id>
            <phase>generate-sources</phase>
            <goals>
                <goal>generate</goal>
            </goals>
            <configuration>
                <dictFile>src/main/resources/FIX44.xml</dictFile>
                <packaging>quickfix.fix44</packaging>
                <fieldPackage>quickfix.field</fieldPackage>
                <outputBaseDirectory>target/generated-sources</outputBaseDirectory>
                <decimal>${generator.decimal}</decimal>
            </configuration>
        </execution>
    </executions>
</plugin>
```

### 2. FIX Orchestra Code Generator (FIX Latest)

**Maven Plugin**: `quickfixj-from-fix-orchestra-code-generator-maven-plugin`

Generates sources directly from FIX Orchestra repositories.

```xml
<plugin>
    <groupId>org.quickfixj</groupId>
    <artifactId>quickfixj-from-fix-orchestra-code-generator-maven-plugin</artifactId>
    <version>${quickfixj-orchestra.version}</version>
    <executions>
        <execution>
            <id>generate-from-orchestra</id>
            <phase>generate-sources</phase>
            <goals>
                <goal>generate</goal>
            </goals>
            <configuration>
                <orchestrationFilePath>path/to/orchestra.xml</orchestrationFilePath>
                <outputBaseDirectory>target/generated-sources</outputBaseDirectory>
                <generateBigDecimal>false</generateBigDecimal>
            </configuration>
        </execution>
    </executions>
</plugin>
```

### 3. Dictionary Generator from Orchestra

**Maven Plugin**: `quickfixj-from-fix-orchestra-dictionary-generator-maven-plugin`

Converts FIX Orchestra repositories to QuickFIX-compatible dictionaries.

### 4. Class Pruner

**Maven Plugin**: `class-pruner-maven-plugin`

Deletes generated sources and classes not present in a QuickFIX Dictionary (specialized use).

---

## Customization Techniques

### 1. Edit QuickFIX Dictionaries (FIX 4.0 - 5.0SP2)

Modify the XML dictionary file (e.g., `FIX44.xml`) to:
- Add custom fields
- Define new messages
- Change field requirements (required="Y" or required="N")
- Modify field data types

**Example**: Adding a custom field

```xml
<fields>
    <field number="5000" name="MyCustomField" type="STRING"/>
</fields>

<message name="NewOrderSingle" msgtype="D" msgcat="app">
    <field name="MyCustomField" required="N"/>
</message>
```

### 2. Edit FIX Orchestra Repositories (FIX Latest)

Modify the Orchestra XML file to customize:
- Messages
- Components
- Fields
- Data types
- Workflow rules

**Recommendation**: Start with the orchestration published by the `quickfixj-orchestration` module.

### 3. Control Code Generation Order

The order of code generation matters when multiple FIX versions define the same field differently.

**Default behavior**: Later versions overwrite earlier versions.

**To prefer earlier versions**: Generate FIX Latest first, then overwrite with an earlier version.

### 4. Use Orchestra Plugin Features

```xml
<configuration>
    <!-- Generate only session layer messages -->
    <generateOnlySession>false</generateOnlySession>
    
    <!-- Exclude session layer messages -->
    <excludeSession>false</excludeSession>
    
    <!-- Generate FIXT1.1 in separate package -->
    <generateFixt11Package>true</generateFixt11Package>
</configuration>
```

### 5. Choose Decimal Type

```xml
<!-- For quickfixj-codegenerator -->
<configuration>
    <decimal>true</decimal>  <!-- Use BigDecimal instead of Double -->
</configuration>

<!-- For orchestra code generator -->
<configuration>
    <generateBigDecimal>true</generateBigDecimal>
</configuration>
```

---

## Step-by-Step: Creating a Custom Build

### Option 1: Independent Project (Recommended)

This approach keeps your custom build separate from the QuickFIX/J project.

#### Step 1: Create a New Maven Project

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    
    <groupId>com.yourcompany</groupId>
    <artifactId>yourapp-fixmessages</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>
    
    <properties>
        <quickfixj.version>3.0.0</quickfixj.version>
        <generator.decimal>false</generator.decimal>
    </properties>
    
    <dependencies>
        <dependency>
            <groupId>org.quickfixj</groupId>
            <artifactId>quickfixj-base</artifactId>
            <version>${quickfixj.version}</version>
        </dependency>
    </dependencies>
</project>
```

#### Step 2: Add Your Custom Dictionary

Create `src/main/resources/FIX44_Custom.xml` with your customizations:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<fix major="4" minor="4" servicepack="0">
    <header>
        <!-- Header fields -->
    </header>
    <trailer>
        <!-- Trailer fields -->
    </trailer>
    <messages>
        <!-- Your custom messages -->
    </messages>
    <fields>
        <!-- Your custom fields -->
        <field number="5000" name="MyCustomField" type="STRING"/>
    </fields>
    <components>
        <!-- Your custom components -->
    </components>
</fix>
```

#### Step 3: Configure Code Generation

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.quickfixj</groupId>
            <artifactId>quickfixj-codegenerator</artifactId>
            <version>${quickfixj.version}</version>
            <executions>
                <execution>
                    <id>generate-fix44-custom</id>
                    <phase>generate-sources</phase>
                    <goals>
                        <goal>generate</goal>
                    </goals>
                    <configuration>
                        <dictFile>src/main/resources/FIX44_Custom.xml</dictFile>
                        <packaging>quickfix.fix44</packaging>
                        <fieldPackage>quickfix.field</fieldPackage>
                        <outputBaseDirectory>target/generated-sources</outputBaseDirectory>
                        <decimal>${generator.decimal}</decimal>
                    </configuration>
                </execution>
            </executions>
        </plugin>
        <plugin>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>build-helper-maven-plugin</artifactId>
            <version>3.3.0</version>
            <executions>
                <execution>
                    <id>add-source</id>
                    <phase>generate-sources</phase>
                    <goals>
                        <goal>add-source</goal>
                    </goals>
                    <configuration>
                        <sources>
                            <source>target/generated-sources</source>
                        </sources>
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

#### Step 4: Build Your Custom Messages

```bash
mvn clean install
```

This generates and compiles your custom messages into a JAR.

#### Step 5: Use in Your Application

```xml
<dependencies>
    <dependency>
        <groupId>org.quickfixj</groupId>
        <artifactId>quickfixj-core</artifactId>
        <version>3.0.0</version>
    </dependency>
    <dependency>
        <groupId>com.yourcompany</groupId>
        <artifactId>yourapp-fixmessages</artifactId>
        <version>1.0.0</version>
    </dependency>
</dependencies>
```

### Option 2: Fork and Modify (Alternative)

Fork the QuickFIX/J repository and modify dictionaries directly. This is simpler for experimentation but harder to maintain long-term.

1. Fork `https://github.com/quickfix-j/quickfixj`
2. Edit dictionaries in `quickfixj-messages/quickfixj-messages-fix44/src/main/resources/FIX44.xml`
3. Build: `mvn clean package`

---

## Best Practices

### 1. Avoid Field Conflicts with `quickfixj-base`

**Critical**: Custom builds must exclude Fields provided by `quickfixj-base` to avoid class loader conflicts.

Fields to exclude from code generation:
- Standard header/trailer fields (BeginString, MsgType, etc.)
- Fields already in `quickfixj-base`

### 2. Use Consistent Tool Versions

Always use code generators from the same QuickFIX/J version as your runtime dependency.

```xml
<properties>
    <quickfixj.version>3.0.0</quickfixj.version>
</properties>

<dependency>
    <groupId>org.quickfixj</groupId>
    <artifactId>quickfixj-core</artifactId>
    <version>${quickfixj.version}</version>
</dependency>

<plugin>
    <groupId>org.quickfixj</groupId>
    <artifactId>quickfixj-codegenerator</artifactId>
    <version>${quickfixj.version}</version>
</plugin>
```

### 3. Change GroupIds for Custom Distributions

```xml
<groupId>com.yourcompany</groupId>  <!-- NOT org.quickfixj -->
<artifactId>yourapp-fixmessages</artifactId>
<version>1.0.0</version>
```

### 4. Include Licenses

Include the QuickFIX Software License and/or Apache 2 license in your distribution.

### 5. Reuse FIXT1.1 from QuickFIX/J

For FIX 5.0+, consider depending on the standard `quickfixj-messages-fixt11` instead of generating it yourself.

```xml
<dependency>
    <groupId>org.quickfixj</groupId>
    <artifactId>quickfixj-messages-fixt11</artifactId>
    <version>${quickfixj.version}</version>
</dependency>
```

### 6. Omit Unused FIX Versions

Only build and include the FIX versions your application uses to reduce distribution size and build time.

### 7. Test Reject Messages

When customizing, test that your application correctly handles:
- Reject messages for unknown fields
- Business Message Reject messages

---

## Troubleshooting

### Problem: Class Verification Exceptions

**Cause**: Multiple versions of the same `quickfix.Field` class in classpath.

**Solution**:
- Ensure only one JAR contains fields from the `quickfix.field` package
- Exclude fields provided by `quickfixj-base` from your generation

### Problem: Incompatible Data Types Between FIX Versions

**Example**: OrderQty is `int` in FIX 4.0 but `Qty` (Double/BigDecimal) in FIX 4.2+

**Solutions**:
1. Edit the dictionary to coerce the data type
2. Change code generation order (overwrite with preferred version)
3. Build versions separately and don't use them in the same runtime
4. Use only compatible versions

### Problem: Legacy Constant Names Changed in QuickFIX/J 3.x

**Example**: `SettlType.REGULAR_FX_SPOT_SETTLEMENT` → `SettlType.REGULAR`

**Solution**:
- Generate FIX Latest first
- Then overwrite Field classes by generating from an earlier version
- Or omit FIX Latest code generation entirely

### Problem: Large Distribution Size for FIX Latest

**Solution**: Customize the FIX Orchestra repository to include only the elements you need.

---

## Example: Complete Custom Build for FIX 4.4

Here's a complete example project structure:

```
yourapp-fixmessages/
├── pom.xml
└── src/
    └── main/
        └── resources/
            └── FIX44_Custom.xml
```

**pom.xml**:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    
    <groupId>com.yourcompany</groupId>
    <artifactId>yourapp-fixmessages-fix44</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>
    
    <name>Your Application - FIX 4.4 Custom Messages</name>
    
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
        <quickfixj.version>3.0.0</quickfixj.version>
        <generator.decimal>false</generator.decimal>
    </properties>
    
    <dependencies>
        <dependency>
            <groupId>org.quickfixj</groupId>
            <artifactId>quickfixj-base</artifactId>
            <version>${quickfixj.version}</version>
        </dependency>
    </dependencies>
    
    <build>
        <plugins>
            <plugin>
                <groupId>org.quickfixj</groupId>
                <artifactId>quickfixj-codegenerator</artifactId>
                <version>${quickfixj.version}</version>
                <executions>
                    <execution>
                        <id>generate-fix44-messages</id>
                        <phase>generate-sources</phase>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                            <dictFile>src/main/resources/FIX44_Custom.xml</dictFile>
                            <packaging>quickfix.fix44</packaging>
                            <fieldPackage>quickfix.field</fieldPackage>
                            <outputBaseDirectory>target/generated-sources</outputBaseDirectory>
                            <decimal>${generator.decimal}</decimal>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>build-helper-maven-plugin</artifactId>
                <version>3.3.0</version>
                <executions>
                    <execution>
                        <id>add-generated-sources</id>
                        <phase>generate-sources</phase>
                        <goals>
                            <goal>add-source</goal>
                        </goals>
                        <configuration>
                            <sources>
                                <source>target/generated-sources</source>
                            </sources>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.11.0</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

**Build command**:

```bash
mvn clean install
```

---

## Example: Complete Custom Build for FIX Latest

Here's a complete example using FIX Orchestra for FIX Latest:

### Project Structure

```
yourapp-fixmessages-latest/
├── pom.xml
└── src/
    └── main/
        └── resources/
            └── FIXLatest_Custom.xml
```

### pom.xml for FIX Latest

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    
    <groupId>com.yourcompany</groupId>
    <artifactId>yourapp-fixmessages-latest</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>
    
    <name>Your Application - FIX Latest Custom Messages</name>
    
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
        <quickfixj.version>3.0.0</quickfixj.version>
        <quickfixj-orchestra.version>3.0.0</quickfixj-orchestra.version>
        <generator.decimal>false</generator.decimal>
    </properties>
    
    <dependencies>
        <dependency>
            <groupId>org.quickfixj</groupId>
            <artifactId>quickfixj-base</artifactId>
            <version>${quickfixj.version}</version>
        </dependency>
        
        <!-- Optional: Include standard FIXT1.1 messages -->
        <dependency>
            <groupId>org.quickfixj</groupId>
            <artifactId>quickfixj-messages-fixt11</artifactId>
            <version>${quickfixj.version}</version>
        </dependency>
        
        <!-- Required for Orchestra code generation -->
        <dependency>
            <groupId>org.quickfixj</groupId>
            <artifactId>quickfixj-orchestration</artifactId>
            <version>${quickfixj-orchestra.version}</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>
    
    <build>
        <plugins>
            <plugin>
                <groupId>org.quickfixj</groupId>
                <artifactId>quickfixj-from-fix-orchestra-code-generator-maven-plugin</artifactId>
                <version>${quickfixj-orchestra.version}</version>
                <executions>
                    <execution>
                        <id>generate-fixlatest-messages</id>
                        <phase>generate-sources</phase>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                            <!-- Path to your custom Orchestra file -->
                            <orchestrationFilePath>src/main/resources/FIXLatest_Custom.xml</orchestrationFilePath>
                            
                            <!-- Output directory for generated sources -->
                            <outputBaseDirectory>target/generated-sources</outputBaseDirectory>
                            
                            <!-- Use BigDecimal for decimal types (optional) -->
                            <generateBigDecimal>${generator.decimal}</generateBigDecimal>
                            
                            <!-- Generate only application layer messages (exclude session) -->
                            <generateOnlySession>false</generateOnlySession>
                            
                            <!-- Set to true to exclude session layer messages -->
                            <excludeSession>false</excludeSession>
                            
                            <!-- Generate FIXT1.1 in separate package -->
                            <generateFixt11Package>true</generateFixt11Package>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            
            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>build-helper-maven-plugin</artifactId>
                <version>3.3.0</version>
                <executions>
                    <execution>
                        <id>add-generated-sources</id>
                        <phase>generate-sources</phase>
                        <goals>
                            <goal>add-source</goal>
                        </goals>
                        <configuration>
                            <sources>
                                <source>target/generated-sources</source>
                            </sources>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.11.0</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

### Custom FIX Orchestra File

Create `src/main/resources/FIXLatest_Custom.xml`. You can start with the standard FIX Orchestra repository from the `quickfixj-orchestration` module and customize it:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<fixr:repository xmlns:fixr="http://fixprotocol.io/2020/orchestra/repository"
                 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                 xsi:schemaLocation="http://fixprotocol.io/2020/orchestra/repository 
                                     https://www.fixtrading.org/FIXimate/FIXimate3.0/Base/Orchestra_repository_2020.xsd"
                 name="FIXLatest_Custom"
                 version="FIXLatest"
                 specUrl="http://www.fixtradingcommunity.org/pg/structure/tech-specs/fix-version/fix-latest">
    
    <!-- Define custom datatypes -->
    <fixr:datatypes>
        <!-- Include standard datatypes and add custom ones -->
    </fixr:datatypes>
    
    <!-- Define custom fields -->
    <fixr:fields>
        <!-- Example custom field -->
        <fixr:field id="10000" name="MyCustomField" type="String">
            <fixr:annotation>
                <fixr:documentation>Custom field for specific use case</fixr:documentation>
            </fixr:annotation>
        </fixr:field>
    </fixr:fields>
    
    <!-- Define custom components -->
    <fixr:components>
        <!-- Add custom components here -->
    </fixr:components>
    
    <!-- Define custom messages -->
    <fixr:messages>
        <!-- Extend or customize messages -->
        <fixr:message name="NewOrderSingle" id="68" msgType="D" category="SingleGeneralOrderHandling">
            <fixr:structure>
                <!-- Add your custom field to the message -->
                <fixr:fieldRef id="10000" presence="optional"/>
            </fixr:structure>
        </fixr:message>
    </fixr:messages>
    
</fixr:repository>
```

**Note**: For a complete starting point, extract the Orchestra file from the `quickfixj-orchestration` artifact:

```bash
# Download and extract the standard FIX Orchestra file
mvn dependency:get -Dartifact=org.quickfixj:quickfixj-orchestration:3.0.0
# Extract from your local Maven repository: ~/.m2/repository/org/quickfixj/quickfixj-orchestration/3.0.0/
```

### Build Command

```bash
mvn clean install
```

This will:
1. Generate FIX Latest message classes from your custom Orchestra file
2. Compile them into a JAR
3. Install the JAR to your local Maven repository

### Use in Your Application

```xml
<dependencies>
    <dependency>
        <groupId>org.quickfixj</groupId>
        <artifactId>quickfixj-core</artifactId>
        <version>3.0.0</version>
    </dependency>
    <dependency>
        <groupId>com.yourcompany</groupId>
        <artifactId>yourapp-fixmessages-latest</artifactId>
        <version>1.0.0</version>
    </dependency>
</dependencies>
```

### Key Differences from FIX 4.4 Example

1. **Uses FIX Orchestra format** instead of QuickFIX Dictionary XML
2. **Different Maven plugin**: `quickfixj-from-fix-orchestra-code-generator-maven-plugin`
3. **More configuration options** for session vs application layer messages
4. **FIXT1.1 integration** - can generate or depend on standard FIXT1.1
5. **Richer metadata** - Orchestra includes workflow rules and annotations

### Configuration Options Explained

- **orchestrationFilePath**: Path to your custom FIX Orchestra XML file
- **generateBigDecimal**: Use `BigDecimal` instead of `Double` for decimal types
- **generateOnlySession**: Set to `true` to generate only session layer messages
- **excludeSession**: Set to `true` to exclude session layer messages (generate only application layer)
- **generateFixt11Package**: Generate FIXT1.1 messages in a separate package
---


## Additional Resources

- [QuickFIX/J Messages README](https://github.com/quickfix-j/quickfixj/blob/main/quickfixj-messages/readme.md)
- [Customising QuickFIX/J](https://github.com/quickfix-j/quickfixj/blob/main/customising-quickfixj.md)
- [QuickFIX/J Orchestra](https://github.com/quickfix-j/quickfixj-orchestra)
- [FIX Trading Community](https://www.fixtrading.org/)
- [FIX Orchestra Standard](https://www.fixtrading.org/standards/fix-orchestra/)

---

## Summary

Creating a custom build with custom messages in QuickFIX/J involves:

1. **Create an independent project** (or fork the repository)
2. **Customize QuickFIX Dictionaries** (FIX 4.0-5.0SP2) or **FIX Orchestra repositories** (FIX Latest)
3. **Configure code generation** using Maven plugins
4. **Build and package** your custom messages
5. **Use your custom JAR** alongside `quickfixj-core` in your application

This approach allows you to maintain custom Rules of Engagement independently from the main QuickFIX/J project while staying compatible with the core runtime.
