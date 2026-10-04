
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Laya Dang                  |
| Date         | 10/06/2026                 |
| Course       | Fall 2026                  |
| Assignment # | 1                          |

# Assignment Overview

This assignment is an implementation of an automatic "beverage vending machine" that utilizes basic concepts of inheritance to represent types of drinks. Each drink can have milk and sugar level adjusted from levels 0 to 3, with prices reflected accordingly.

# GitHub Repository Link

[https://github.com/pd03-cs-665/cs-665-assignment-1](https://github.com/pd03-cs-665/cs-665-assignment-1)

# Implementation Description 

> Explain the level of flexibility in your implementation, including how new object types can be easily added or removed in the future.

This implementation of a beverage vending machine is flexible, as it utilizes benefits of inheritance and implementation. If a new beverage type should be added, there is already a base `Tea.java` or `Coffee.java` that the addition can inherit from. Both those bases extends from a generic `Beverage.java` that contains the data contract for generic traits of a beverage.

For example, if we want to add a matcha drink `Matcha.java`, we will extend `Tea.java`. The requirements that this child must declare is the base cost `setCost()` and override `getDescription()` method with the appropriate string representation. All other calculations, like milk and sugar level, is already implemented once in `Beverage.java` and therefore already exists on this new matcha class.

> Discuss the simplicity and understandability of your implementation, ensuring that it is easy for others to read and maintain.

The code is organized in a way that makes it clear where inheritance is happening. The folder structure:

```
beverage/
├─ coffee/
│  ├─ Coffee.java
│  ├─ # coffee implementations here
├─ tea/
│  ├─ Tea.java
│  ├─ # tea implementations here
├─ Beverage.java
```

Makes it clear that coffee and tea are children of beverages. These nested directories will give future maintainers an idea of how the classes interact with each other before reading the details of the code.

The base class `Beverage.java` also uses basic getters and setters method for private variables, following the naming conventions `getVar()` and `setVar()` to make it clear what each function is doing without having to read the details.

> Describe how you have avoided duplicated code and why it is important.

Because all drink implementations inherit from `Beverage.java`, the drinks share lots of instance variables and functions. This design makes sense for this assignment, as all drinks share the same functionality besides for its name (description) and base price. Therefore, instead of duplicating logic for adding milk, sugar, and cost calculation, it is written once in the base class.

Not only would this help with readability (where if you read implementation details once, you will know how it works for all child classes), it will also help with debugging as all logic is centralized in one class.

Additionally, this lack of rewritten code is important if we wish to make a change across all beverages without having to adjust each drink. For example, if the price of milk goes up, we can change this variable once in `Beverage.java` `MILK_COST`. 

> If applicable, mention any design patterns you have used and explain why they were chosen.

No design patterns are used for this first assignment.

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile

Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests

JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`
