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
