# Pattern Strategy

## Category: Behavioral

### Description

The Strategy pattern is a behavioral design pattern that enables defining a family of algorithms, encapsulating each one, and making them interchangeable. It allows algorithms to vary independently of the clients that use them, focusing on dynamic interactions between classes and objects.

### Instance Scope (Object)

- Focuses on relationships between objects.
- Reuse through composition.

### Objective

- Define a family of algorithms for a given task.
- Encapsulate each algorithm in a separate class.
- Make algorithms interchangeable, allowing the client to dynamically choose which one to use.
- Enable each algorithm to vary independently of the clients that use them.

### Reason for Use

When you have multiple possible algorithms or strategies to solve a problem but want to make them interchangeable and avoid integrating them directly into client code. Useful when you want to allow the client to dynamically choose the algorithm to use.

### Advantages

- Encapsulation of algorithms and strategies, avoiding code duplication and facilitating maintenance.
- Allows the client to dynamically choose the algorithm to use, offering increased flexibility and extensibility.
- Fosters composition over inheritance, enabling flexible combination of different strategies.

### Disadvantages

- May introduce complexity overhead if many algorithms need to be managed.
- Requires good design of the interface and strategy classes to ensure effective and intuitive use.
- Can be overkill for simple problems with only one possible algorithm.
