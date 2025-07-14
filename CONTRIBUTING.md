# Contributing to QuickFIX/J

Thank you for your interest in contributing to QuickFIX/J! This document provides guidelines and instructions for contributing to the project.

## Table of Contents

- [Project Overview](#project-overview)
- [Development Environment Setup](#development-environment-setup)
- [Coding Standards and Conventions](#coding-standards-and-conventions)
- [Build and Test Procedures](#build-and-test-procedures)
- [Pull Request Process](#pull-request-process)
- [Issue Reporting Guidelines](#issue-reporting-guidelines)
- [Security Vulnerability Reporting](#security-vulnerability-reporting)
- [Documentation Standards](#documentation-standards)
- [Release Process](#release-process)

## Project Overview

QuickFIX/J is a full-featured messaging engine for the FIX protocol (FIX versions 4.0 - 5.0SP2/FIXT1.1 and FIXLatest). It is a 100% Java open source implementation of the popular C++ QuickFIX engine.

The Financial Information eXchange (FIX) protocol is a messaging standard developed specifically for the real-time electronic exchange of securities transactions. FIX is a public-domain specification owned and maintained by FIX Protocol, Ltd (FPL).

The project is organized into several modules:
- **quickfixj-codegenerator**: Generates Java code from FIX specifications
- **quickfixj-dictgenerator**: Generates FIX dictionaries
- **quickfixj-class-pruner-maven-plugin**: Maven plugin for pruning generated classes
- **quickfixj-orchestration**: Tools for working with FIX Orchestra
- **quickfixj-base**: Base classes and utilities
- **quickfixj-messages**: Generated message classes for different FIX versions
- **quickfixj-core**: Core functionality
- **quickfixj-examples**: Example applications
- **quickfixj-all**: Aggregator module
- **quickfixj-distribution**: Distribution packaging
- **quickfixj-perf-test**: Performance testing

## Development Environment Setup

### Prerequisites

- Java JDK 8 or later (the project is tested with JDK 8, 11, and 21)
- Maven 3.9.x or later

### Setting Up the Development Environment

1. Fork the repository on GitHub
2. Clone your fork locally:
   ```
   git clone https://github.com/YOUR-USERNAME/quickfixj.git
   ```
3. Add the upstream repository:
   ```
   git remote add upstream https://github.com/quickfix-j/quickfixj.git
   ```
4. Build the project:
   ```
   ./mvnw clean package -Dmaven.javadoc.skip=true -DskipTests -PskipBundlePlugin,minimal-fix-latest
   ```

### Importing into an IDE

When the project is first created, it will not have the generated message classes and compile errors will occur! Best is to compile once on the command line before importing the project into the IDE.

If the IDE reports some errors after the compilation with `mvnw clean package`, try to use `mvnw clean install`, like:
```
./mvnw clean install -Dmaven.javadoc.skip=true -DskipTests -PskipBundlePlugin,minimal-fix-latest
```

## Coding Standards and Conventions

### Java Code Style

- Use 4 spaces for indentation (not tabs)
- Follow standard Java naming conventions:
  - CamelCase for class names
  - camelCase for method and variable names
  - UPPER_SNAKE_CASE for constants
- Keep methods focused and concise
- Add appropriate Javadoc comments for public APIs

### Testing Standards

- Write unit tests for all new code
- Follow the existing test naming convention: `test[FeatureBeingTested]`
- Use JUnit assertions for validations
- Test both normal cases and edge cases
- Include tests for exception conditions where appropriate

## Build and Test Procedures

### Building the Project

The project uses Maven for building. There are several build options:

1. Fastest build (skips tests and Javadoc):
   ```
   ./mvnw clean package -Dmaven.javadoc.skip=true -DskipTests -PskipBundlePlugin,minimal-fix-latest
   ```

2. Build with unit tests but skip acceptance tests:
   ```
   ./mvnw clean package -Dmaven.javadoc.skip=true -DskipAT=true -PskipBundlePlugin,minimal-fix-latest
   ```

3. Full build with all tests:
   ```
   ./mvnw clean package -Dmaven.javadoc.skip=true -PskipBundlePlugin,minimal-fix-latest
   ```

Note: If you want to use the resulting JARs in an OSGi environment, omit the `-PskipBundlePlugin` option.

### Running Tests

The project uses JUnit for testing. You can run tests using Maven:

```
./mvnw test
```

To run a specific test:

```
./mvnw test -Dtest=ClassName
```

## Pull Request Process

1. Ensure your code follows the coding standards
2. Add tests for your changes
3. Update documentation as necessary
4. Make sure all tests pass
5. Submit a pull request to the `master` branch
6. Include a clear description of the changes and their motivation

Pull requests are always welcome! Best is if you added a unit test to show that a certain bug has been fixed or a new feature works as expected.

## Issue Reporting Guidelines

### Bug Reports

When reporting a bug, please use the bug report template and include:

1. A clear and concise description of the bug
2. Steps to reproduce the behavior (or better, a unit test or reproducer)
3. Expected behavior
4. System information:
   - OS
   - Java version
   - QuickFIX/J version

### Feature Requests

When requesting a feature, please use the feature request template and include:

1. A clear description of the problem the feature would solve
2. A description of the solution you'd like
3. Alternative solutions you've considered
4. Any additional context

## Security Vulnerability Reporting

QuickFIX/J welcomes and appreciates responsible disclosure. Contributors are given appropriate credit in release notes and Git logs.

For security issues in QuickFIX/J itself, contact the project maintainer: christoph.john-at-macd.com

For security issues in libraries used by QuickFIX/J, contact the relevant project team (e.g., for Apache MINA: https://www.apache.org/security/). If you feel they are particularly exploitable via QuickFIX/J, also follow up with the project maintainer so that we upgrade to the new version in a timely fashion.

Once a security issue is fixed in QuickFIX/J, it will be communicated via the user mailing list and other appropriate channels.

## Documentation Standards

### Code Documentation

- Add Javadoc comments for all public classes, methods, and fields
- Keep comments up-to-date with code changes
- Use clear and concise language

### Project Documentation

- Update README.md when adding significant features
- Document customization options in customising-quickfixj.md
- Keep documentation in sync with code changes

## Release Process

The release process is managed by the project maintainers. The general process is:

1. Prepare the release (update version numbers, documentation, etc.)
2. Build and test the release artifacts
3. Sign the artifacts with GPG
4. Deploy to Maven Central via Sonatype OSSRH
5. Create a GitHub release with release notes
6. Announce the release on the mailing list

## Questions and Communication

For asking questions, please either use:
- The mailing list: https://lists.sourceforge.net/lists/listinfo/quickfixj-users
- Stack Overflow: https://stackoverflow.com/questions/ask?tags=quickfixj

## License

By contributing to QuickFIX/J, you agree that your contributions will be licensed under the project's license (The QuickFIX Software License, Version 1.0).