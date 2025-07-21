# QuickFIX/J Project Guidelines

## Project Overview

QuickFIX/J is a full-featured messaging engine for the FIX protocol. It is a 100% Java open source implementation of the popular QuickFIX engine. This document provides guidelines for contributing to and working with the QuickFIX/J project.

## Development Environment

### Prerequisites

- Java JDK 8 or higher
- Maven 3.6.x or higher
- Git

### Setting Up Development Environment

1. Clone the repository:
   ```
   git clone https://github.com/quickfix-j/quickfixj.git
   cd quickfixj
   ```

2. Build the project:
   Junie, please make sure to only use JDK 8 for the build and use the following Java options:
   ```
   ./mvnw package -Dmaven.javadoc.skip=true -PskipBundlePlugin,minimal-fix-latest -Xms3g -Xmx6g -Djdk.xml.xpathExprGrpLimit=500 -Djdk.xml.xpathExprOpLimit=500
   ```

## Coding Standards

### Java Code Style

- Follow standard Java naming conventions
- Use 4 spaces for indentation (no tabs)
- Maximum line length of 120 characters
- Include JavaDoc for all public classes and methods
- Use meaningful variable and method names

### Commit Guidelines

- Write clear, concise commit messages
- Use present tense ("Add feature" not "Added feature")
- Reference issue numbers when applicable
- Keep commits focused on a single logical change

## Pull Request Process

1. Create a feature branch from the main branch
2. Make your changes following the coding standards
3. Add or update tests as necessary
4. Ensure all tests pass with `./mvnw test`
5. Submit a pull request with a clear description of the changes

## Testing Guidelines

- Write unit tests for all new code
- Ensure existing tests pass before submitting changes
- Integration tests should be included for significant features
- Test edge cases and error conditions

## Documentation

- Update documentation for any changed functionality
- Document public APIs with JavaDoc
- Keep README and other documentation up to date

## Issue Reporting

When reporting issues, please include:

- A clear description of the problem
- Steps to reproduce
- Expected vs. actual behavior
- Version information (QuickFIX/J version, Java version, OS)
- Any relevant logs or error messages

## Release Process

- Version numbers follow semantic versioning (MAJOR.MINOR.PATCH)
- Release notes should document all significant changes
- Releases are built and deployed using Maven

## Community Guidelines

- Be respectful and inclusive in all communications
- Help others when possible
- Follow the code of conduct
- Give credit where it's due

## License

QuickFIX/J is licensed under the QuickFIX Software License, Version 1.0. All contributions must be compatible with this license.
