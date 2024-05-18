https://refactoring.guru/design-patterns
https://refactoring.guru/refactoring/techniques
https://refactoring.guru/refactoring/smells

//Design Patterns Principles
1. Composition over Inheritance
2. Code for interface not implementation

//Factors to consider while using design patterns -
Single responsibility
Tight coupling
Open/Close principle

******************************************************************************************************************
//Difference between Abstract and Interface classes
Abstract classes and interfaces are both used to achieve abstraction in Java, but they have some key differences in their implementation and usage.
Abstract Class:
An abstract class is a class that cannot be instantiated on its own and may contain both abstract and concrete methods.
It can have fields (variables) that are not final and can have constructors.
Abstract classes can have method implementations (concrete methods).
A Java class can extend only one abstract class because Java doesn't support multiple inheritance of classes.
Used to define common behavior among related classes.
Abstract classes provide a template for concrete subclasses to implement.
Abstract methods must be overridden by subclasses unless those subclasses are also abstract.

Interface:
An interface in Java is a reference type similar to a class that can contain only constants, method signatures, default methods, static methods, and nested types.
It cannot have fields (variables) except for static final fields, and it cannot have constructors.
All methods in an interface are implicitly public and abstract, so there's no need to explicitly declare them as such.
A Java class can implement multiple interfaces, providing a way to achieve multiple inheritance of types.
Used to specify a set of methods that a class must implement.
Interfaces are more flexible in terms of allowing unrelated classes to implement them, promoting loose coupling.
Interfaces are used to define contracts for classes. Any class that implements an interface must provide concrete implementations for all methods declared in the interface.
In summary, abstract classes provide a way to share code among related classes, whereas interfaces define a contract that unrelated classes can adhere to. Abstract classes can have constructors and fields, while interfaces cannot. A class can extend only one abstract class, but it can implement multiple interfaces. Choosing between an abstract class and an interface depends on the design requirements and the level of abstraction needed.


******************************************************************************************************************
//Difference between Factory and Abstract Factory
Both Factory and Abstract Factory patterns are creational design patterns used in object-oriented software engineering. They are used to create objects, but they serve different purposes and have different structures.

Factory Pattern:
The Factory Pattern is a creational pattern that provides an interface for creating objects without specifying the exact class of object that will be created.
It defines a method (or methods) that create and return instances of a class based on the provided parameters.
The creation logic is encapsulated within the factory method, allowing clients to create objects without knowing their specific implementation.
It typically involves a single factory class with one or more factory methods.
Example: java.util.Calendar.getInstance() method returns an instance of a Calendar based on the current locale and time zone.

Abstract Factory Pattern:
The Abstract Factory Pattern is also a creational pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.
It is an extension of the Factory Pattern where instead of creating individual objects, it creates families of related objects.
It defines a set of factory methods, each responsible for creating a different type of related object.
It often involves multiple factory classes or factory methods organized into a hierarchy.
It allows clients to create objects without knowing their concrete implementations, promoting flexibility and decoupling.
Example: In a GUI toolkit, an abstract factory can create different types of UI components like buttons, text boxes, and panels, each customized for a specific operating system or look-and-feel.
In summary, the Factory Pattern creates individual objects of a specific type, while the Abstract Factory Pattern creates families of related objects.
The Factory Pattern typically involves a single factory class with factory methods, while the Abstract Factory Pattern involves a hierarchy of factory classes or methods. The choice between them depends on the complexity of the object creation process and the level of abstraction needed in the design.

******************************************************************************************************************