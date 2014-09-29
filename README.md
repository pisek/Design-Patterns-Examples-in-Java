# Design Patterns Examples #

## Visitor ##

Problem:
Iterating over tree generic collection to change some particular parameter. We do not want to use _instanceof_.

Solution:
We create interfaces _Visitor_ and _Visitable_ as in example.

## Template Method ##

Problem:
Components have similarities but there is no common code, hence when change is done it has to be copied to all components.

Solution:
Template Method which allows to reuse common code.

## Strategy ##

Problem:
One of the dominant strategies of object-oriented design is the "open-closed principle". (Open for extension, closed for modification)
We would like to hide the implementation from outside.

Solution:
Create an base interface _Strategy_ and implement it in many different ways as you wish.

## State ##

Problem:
A monolithic object's behavior is a function of its state, and it must change its behavior at run-time depending on that state. Or, an application is characterixed by large and numerous case statements that vector flow of control based on the state of the application.

Solution:
It usually is a field which shows some kind of state and executes a different part of code depending on this state.

## Observer ##

Problem:
A large monolithic design does not scale well as new graphing or monitoring requirements are levied.

Solution:
_Observer_ pattern provides an easy way to create and add some additional part of code which should be executed on some event. All kind of _Listeners_ are an example of _Observer_.

## Null Object ##

Problem:
Sometimes a class that requires a collaborator does not need the collaborator to do anything. However, the class wishes to treat a collaborator that does nothing the same way it treats one that actually provides behavior.

Solution:
When we have an object of _Application_ which uses anoher object which implements eg. _PrintStream_, we can create a "mock" Null Object implementing this _PrintStream_ and just "DO NOTHING".

## Memento ##

Problem:
Need to restore an object back to its previous state (e.g. "undo" or "rollback" operations).

Solution:
We need a _Memento_ object which saves states. Additionally, we need a _MementoHolder_ which will hold all versions of the object.
