
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Laya Dang                  |
| Date         | 10/06/2026                 |
| Course       | Fall 2026                  |
| Assignment # | 1                          |

# Assignment Overview

This assignment is an implementation of an automatic "beverage vending machine" that utilizes basic concepts of inheritance to represent types of drinks. Each drink can have milk and sugar level adjusted from levels 0 to 3, with prices reflected accordingly for different levels.

# GitHub Repository Link

[https://github.com/pd03-cs-665/cs-665-assignment-1](https://github.com/pd03-cs-665/cs-665-assignment-1)

# Implementation Description 

> Explain the level of flexibility in your implementation, including how new object types can be easily added or removed in the future.

This implementation of a beverage vending machine is flexible, as it utilizes benefits of inheritance and implementation. If a new beverage type needs to be added, there is already a base `Tea.java` or `Coffee.java` that can be inherited from. Both those bases extends from a generic `Beverage.java` that contains the data contract for generic traits of a beverage.

For example, if we want to add a matcha drink `Matcha.java`, we will extend `Tea.java`. The requirements that this child must override `getDescription()` method with the appropriate string representation. Further, because each drink will have a different base cost, the child can call `setCost()` on initialization. All other calculations, like milk and sugar level, is already implemented once in `Beverage.java` and therefore already exists on this new matcha class.

Besides this implementation making it easy to add new object types, existing object types can also easily. If we want another customization option, like honey, for instance, we will only have to make this update once in the abstract parent class `Beverage.java`, and similarly if we wish to remove an option.

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

Makes it clear that coffee and tea are children of beverages, while the specific implementations live respectively in `coffee/` or `tea/`. These nested directories will give future maintainers an idea of how the classes interact with each other before reading the details of the code.

The base class `Beverage.java` also uses getters and setters method to access private variables, following the naming conventions `getVar()` and `setVar()` to make it clear what each function is doing without having to read the details.

> Describe how you have avoided duplicated code and why it is important.

Because all drink implementations inherit from `Beverage.java`, the drinks share all instance variables and functions. This design makes sense for this assignment, as all drinks share the same behvaior besides for its name (description) and base cost. Therefore, instead of duplicating logic for adding milk, sugar, and cost calculation, it is written once in the base class.

Not only would this help with readability (where if you read implementation details once, you will know how it works for all child classes), it will also help with debugging as most of the logic is centralized in one class.

Additionally, this lack of rewritten code is important if we wish to make a change across all beverages without having to adjust each drink. For example, if the price of milk goes up, we can update this once in `Beverage.java`'s `MILK_COST` variable. 

> If applicable, mention any design patterns you have used and explain why they were chosen.

No design patterns are used for this first assignment.

## UML Diagram

![uml](/uml/uml.svg)

# Getting Started

To start the beverage vending machine, run

```bash
make start
```

This will start a simple command-line interface that will prompt for drink choices and customization! Enjoy!

# Maven Commands

We'll use Apache Maven to compile and run this project.

## Compile

```bash
mvn clean compile
```

## JUnit Tests

```bash
mvn clean test
```

## Spotbugs 

```bash
mvn spotbugs:gui 
```

## Checkstyle 

```bash
mvn checkstyle:checkstyle
```
