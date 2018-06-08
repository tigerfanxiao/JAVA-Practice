# Strategy Pattern
Oreilly. Head First Design Pattern, Chapter 1

# Description 

When Duck is super class for all the duck class: MallardDuck, RedheadDuck, RubberDuck, DecoyDuck

When we want to a fly and quack function to real duck, we found not all the subclass duck can fly or quack

For example: 
1. MallarDuck, RedheadDuck can fly normally, but RubberDuck and DecoyDuck cannot fly
2. MallarDuck, RedheadDuck can quack normally, but RubberDuck squeak and DecoyDuck mute

# How to add function to all those subclass duck and make the program easily maintenance and extensible
Bad solutions:

1. Add normal fly and quack function to the superclass Duck, and override the specific fly and quack method to
RubberDuck and DeocyDuck.
pros: the code in superclass could be reused. 
cons: define same specific method both in RubberDuck and DecoyDuck, code repetitive

2. Create fly and quack interface, all the subclass implement the interface by its own way. 
pros: seems good
cons: in each subclass we need to implement the fly and quack interface. With editing, more problems could be introduced.

# Strategy Pattern
Strategy Pattern separate the implementation from not only superclass Duck but also all the subclass.
For the same behavior create its own interface: 
For fly behavior, create interface FlyBehavior. Three specific fly methods implement this interface by their own way.
In superclass constructor, use the polymorphic to define fly behavior, and create the perfomrmFly method to call the specific fly way
Create setFlyBehavior to dynamically set flyBehavior on runtime.

Pros: if we want to add more way of fly, we just need to create a new class implementing FlyBehavior interface.
Using setFlyBehavior method of the superclass to change the old fly way to new one without changing any code in superclass code and 
subclass code as well.


