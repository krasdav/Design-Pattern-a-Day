# Design pattern per day
### Study design patterns and implement short examples 
--------------------------------------------------------------------------------
## Creational Design Patterns
#### <ins>Day 1 - Factory Method</ins>
`package org.learn.david.creational.factorymethod;`

Factory Method is a creational design pattern that provides an interface <br>
for creating objects in a superclass, but allows subclasses to alter the <br>
type of objects that will be created.

#### <ins>Day 2 - Builder</ins>
`package org.learn.david.creational.builder;`
`package org.learn.david.creational.builder2;`

Builder is a creational design pattern that lets you construct complex <br> 
objects step by step. The pattern allows you to produce different types and <br>
representations of an object using the same construction code.

#### <ins>Day 3 - Abstract Factory</ins>
`package org.learn.david.creational.AbstractFactory;`

Abstract Factory is a creational design pattern that lets you produce families <br>
of related objects without specifying their concrete classes.

#### <ins>Day 4 - Singleton</ins>
`package org.learn.david.creational.Singleton;`

Singleton is a creational design pattern that lets you ensure that a class has <br>
only one instance, while providing a global access point to this instance.

## Structural Design Patterns

#### <ins>Day 5 - Adapter</ins>
`package org.learn.david.structural.adapter;`

Adapter is a org.learn.david.structural design pattern that allows objects with<br>
incompatible interfaces to collaborate.

#### <ins>Day 6 - Bridge</ins>
`package org.learn.david.structural.bridge.nobridge;`  - Without Bridge Pattern <br>
`package org.learn.david.structural.bridge.bridge;`    - Bridge Pattern used

Bridge is a structural design pattern that lets you split a large class or a set<br>
of closely related classes into two separate hierarchies—abstraction and <br>
implementation—which can be developed independently of each other.

#### <ins>Day 7 - Composite</ins>
`package org.learn.david.structural.composite;`

Composite is a structural design pattern that lets you compose objects into <br>
tree structures and then work with these structures as if they were individual objects.

#### <ins>Day 8 & 9 - Decorator & Facade</ins>
`package org.learn.david.structural.decorator;`

Decorator is a structural design pattern that lets you attach new behaviors <br>
to objects by placing these objects inside special wrapper objects that contain <br>
the behaviors.

`package org.learn.david.structural.facade;`
Facade is a structural design pattern that provides a simplified interface to a <br>
library, a framework, or any other complex set of classes.

#### <ins>Day 10 - Flyweight</ins>
`package org.learn.david.structural.flyweight;`

Flyweight is a structural design pattern that lets you fit more objects into the<br>
available amount of RAM by sharing common parts of state between multiple objects<br>
instead of keeping all of the data in each object.

#### <ins>Day 10 - Proxy</ins>
`package org.learn.david.structural.proxy;`

Proxy is a structural design pattern that lets you provide a substitute or placeholder<br>
for another object. A proxy controls access to the original object, allowing you to <br>
perform something either before or after the request gets through to the original object.

## Behavioral Design Patterns

#### <ins>Day 11 - Chain of Responsibility</ins>
`package org.learn.david.behavioral.chainofresponsibility;`

Chain of Responsibility is a behavioral design pattern that lets you pass requests along<br>
a chain of handlers. Upon receiving a request, each handler decides either to process the<br>
request or to pass it to the next handler in the chain.

#### <ins>Day 12 - Command</ins>
`package org.learn.david.behavioral.command;`

Command is a behavioral design pattern that turns a request into a stand-alone object that<br>
contains all information about the request. This transformation lets you pass requests as<br>
a method arguments, delay or queue a request’s execution, and support undoable operations.

#### <ins>Day 13 - Iterator</ins>
`package org.learn.david.behavioral.iterator;`

Iterator is a behavioral design pattern that lets you traverse elements of a collection without<br>
exposing its underlying representation (list, stack, tree, etc.).

#### <ins>Day 14 - Mediator</ins>
`package org.learn.david.behavioral.mediator;`

Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects.<br>
The pattern restricts direct communications between the objects and forces them to collaborate only<br>
via a mediator object.

#### <ins>Day 15 - Memento</ins>
`package org.learn.david.behavioral.memento;`

Memento is a behavioral design pattern that lets you save and restore the previous state of an object<br>
without revealing the details of its implementation.

#### <ins>Day 16 - Observer</ins>
`package org.learn.david.behavioral.observer;`

Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple<br>
objects about any events that happen to the object they’re observing.

#### <ins>Day 17 - State</ins>
`package org.learn.david.behavioral.state;`

State is a behavioral design pattern that lets an object alter its behavior when its internal state<br>
changes. It appears as if the object changed its class.

#### <ins>Day 17 - Strategy</ins>
`package org.learn.david.behavioral.strategy;`

Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them<br>
into a separate class, and make their objects interchangeable.

#### <ins>Day 18 - Template Method</ins>
`package org.learn.david.behavioral.templatemethod;`

Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the<br>
superclass but lets subclasses override specific steps of the algorithm without changing its structure.`

#### <ins>Day 19 - Visitor</ins>
`package org.learn.david.behavioral.visitor;`
Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.
