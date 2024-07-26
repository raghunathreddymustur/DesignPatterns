# Builder

What it does
----
1. The Builder design pattern is a creational design pattern that helps in constructing complex objects step by step. 
2. The pattern allows you to produce different types and representations of an object using the same construction code.

why we need it
-------------
1. Using constructors with many parameters can lead to code that is difficult to read and maintain.
2. Overloading constructors can lead to confusion and errors, making it hard to know which constructor to use.
3. When constructing an instance of this class, you must pass all parameters in the correct order, which can be error-prone and challenging to read.

Template
-------
1. Actual Class having final attributes. 
2. and a nested Builder which will help in constructing actual class step by step.

Code - Variations
----
1. Immutable - [Example](https://github.com/raghunathreddymustur/DesignPatterns/blob/2580de534d2ae3bcf3eb1bfa7242584c6d32901a/src/com/company/builder/Person.java)
2. Mutable without duplication — [Example ](https://github.com/raghunathreddymustur/DesignPatterns/blob/2580de534d2ae3bcf3eb1bfa7242584c6d32901a/src/com/company/builder/Mutable/Person.java)

## When to Use the Builder Pattern

Consider using the Builder pattern in the following scenarios:

1. **Complex Object Construction**: When an object requires multiple steps to be constructed, and the construction process is complex.
2. **Immutability**: If you need to create immutable objects.
3. **Multiple Representations**: When you need to create different representations of the same object.
4. **Avoiding Constructor Overload**: If a class has a large number of parameters.
5. **Optional Parameters**: When an object has many optional parameters.
6. **Single Responsibility Principle**: To isolate complex construction code from the business logic.

Keywords and Phrases Indicating the Use of the Builder Design Pattern
------------------

## Overview

The Builder design pattern is a creational pattern that helps in constructing complex objects step by step. It is particularly useful when an object requires multiple steps to be constructed, has optional parameters, or when the same construction process can create different representations. This document outlines keywords and phrases that indicate when to use the Builder pattern, along with example requirements for each keyword.

## Keywords and Phrases

### 1. Complex Object Construction
- **Keywords**: Complex initialization, Multiple steps, Step-by-step creation
- **Example Requirement**:
    - "The system should allow for **complex initialization** of user profiles with multiple attributes."
    - "Building a house involves **multiple steps** such as laying the foundation, constructing walls, and roofing."

### 2. Optional Parameters
- **Keywords**: Optional parameters, Flexible configuration, Default values
- **Example Requirement**:
    - "The user profile should support **optional parameters** such as address, phone number, and preferences."
    - "The report generation should allow for a **flexible configuration** to include optional sections like summary and details."

### 3. Multiple Representations
- **Keywords**: Different configurations, Various representations, Customizable
- **Example Requirement**:
    - "We need a way to create **different configurations** of the report object, depending on user input."
    - "The system should support **various representations** of the product, such as digital and physical formats."

### 4. Avoiding Constructor Overload
- **Keywords**: Too many constructor parameters, Constructor overload, Simplify object creation
- **Example Requirement**:
    - "The current constructor has **too many parameters**, making it difficult to use and maintain."
    - "We need to **simplify object creation** for the order object, which currently has a complex constructor."

### 5. Immutability
- **Keywords**: Immutable object, Final fields, Fully initialized
- **Example Requirement**:
    - "The user profile object should be **immutable** once created, ensuring data integrity."
    - "All fields in the configuration object should be **final** and set during object creation."

### 6. Single Responsibility Principle
- **Keywords**: Separation of concerns, Isolate construction code, Maintainable code
- **Example Requirement**:
    - "We need a **separation of concerns** to isolate the construction logic from the business logic."
    - "To ensure **maintainable code**, the object construction should be handled in a separate builder class."

## Conclusion

By identifying these keywords and phrases in requirements, you can determine when the Builder design pattern is an appropriate choice. This helps in creating maintainable, flexible, and scalable code, especially when dealing with complex object creation scenarios.

