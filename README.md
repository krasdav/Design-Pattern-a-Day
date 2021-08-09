# Design pattern per day
### Study design patterns every day for 30 days and implement short examples 
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


#### <ins>Day 12 - Iterator</ins>
`package org.learn.david.behavioral.iterator;`

Iterator is a behavioral design pattern that lets you traverse elements of a collection without<br>
exposing its underlying representation (list, stack, tree, etc.).