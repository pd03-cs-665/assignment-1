
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
