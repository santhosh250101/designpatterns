# Design Patterns in Java

Design patterns are typical solutions to commonly occurring problems in software design. They are best practices that the software industry has evolved over time. Design patterns can be categorized into three main types: creational, structural, and behavioral. Here’s a list of design patterns in Java under each category:

## Creational Design Patterns

1. **Singleton**: Ensures that a class has only one instance and provides a global point of access to it. [ ]
2. **Factory Method**: Defines an interface for creating an object but lets subclasses alter the type of objects that will be created. [✅]
3. **Abstract Factory**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes. [✅]
4. **Builder**: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations. [✅]
5. **Prototype**: Specifies the kinds of objects to create using a prototypical instance, and creates new objects by copying this prototype. [✅]

## Structural Design Patterns

1. **Adapter**: Allows incompatible interfaces to work together by converting the interface of a class into another interface that a client expects. [ ]
2. **Bridge**: Separates an object’s abstraction from its implementation, allowing the two to vary independently. [ ]
3. **Composite**: Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions uniformly. [ ]
4. **Decorator**: Attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality. [ ]
5. **Facade**: Provides a unified interface to a set of interfaces in a subsystem, making the subsystem easier to use. [ ]
6. **Flyweight**: Reduces the cost of creating and manipulating a large number of similar objects by sharing as much data as possible. [ ]
7. **Proxy**: Provides a surrogate or placeholder for another object to control access to it. [ ✅]

## Behavioral Design Patterns

1. **Chain of Responsibility**: Passes a request along a chain of handlers, allowing each handler to either process the request or pass it to the next handler in the chain. [ ]
2. **Command**: Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations. [✅]
3. **Interpreter**: Defines a representation for a grammar and an interpreter that uses the representation to interpret sentences in the language. [ ]
4. **Iterator**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. [ ]
5. **Mediator**: Defines an object that encapsulates how a set of objects interact, promoting loose coupling by preventing objects from referring to each other explicitly. [ ]
6. **Memento**: Captures and externalizes an object’s internal state without violating encapsulation, allowing the object to be restored to this state later. [ ]
7. **Observer**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. [ ]
8. **State**: Allows an object to alter its behavior when its internal state changes, appearing to change its class. [ ]
9. **Strategy**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the algorithm to vary independently from clients that use it. [ ]
10. **Template Method**: Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. [ ]
11. **Visitor**: Represents an operation to be performed on elements of an object structure, allowing you to define a new operation without changing the classes of the elements on which it operates. [ ]

These design patterns help in building robust and maintainable software by providing tested, proven development paradigms. They help developers understand the problem and its solution in a standardized way, making communication between developers easier and more efficient.
