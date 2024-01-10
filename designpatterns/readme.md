## Design Patterns

* Creational Design pattern 

    - Singleton
    - Factory
    - Builder

* Behavioural Design pattern

    - [Chain of Responsibility](#Chain-of-Responsibility)
    - [Command](#Command)
    - [State](#State)

* Structural Design pattern

    - [Adapter](#adapter)
    - Composite

-------------

#### Chain of Responsibility
1. Decouples the sender of a request to its receiver object 
2. Helps to handle more than one receiver to process the request 

Request ----> handler1 ---> handler2 ---> handler3 ---> BusinessLogic

-----------------

#### Command 
1. Decouples the invoker of the request from the business logic
2. store multiple commands in a class to use them over and over

------------------

#### State
1. An object should change its behavior when its internal state changes.
2. State-specific behavior should be defined independently. That is, adding new states should not affect the behavior of existing states

-----------

#### Adapter

    adapter pattern used when client class requires the functionality from a class(target) but the target class does not have the interface to support the client. 
    
    client class calls the adapter method, adapter method translates the request and send it to adaptee. 
    client receives the result and unaware of the adapter class. 

    example. adapter in jdk library - InputStreamReader

#### Composite

    composite design pattern is used to build tree structure. Tree structures to represent whole-part hierarchies. 

    In application, procesing primitive object in one way and processing composite objects different way is undesirable.

    Components, Leaf, Composite, Client

    example. java.awt.Container#add, Practically all over the swing




