A class is a blueprint, plan, architectural layout for an object instance.

NOTE:
not setting an access modifier; by default the access modifier becomes protected. 

Getters and Setters - will allow you to get and set existing private attributes.

Method overloading - Creating another method with the same name but different parameters.

Method overriding – re-creating an entire method in a different subclass. 

Notable Keywords:
ENCAPSULATION: Encapsulates classes/methods/attributes to prevent unintentional access.
•    this. = refers to the object global variable. 
•    Access modifiers:
•    public = can be accessed anywhere outside the class and package.
•    private = can only be accessed inside the class. ENCAPSULATION.
•    protected = can be accessed anywhere inside the package.
 
INHERITANCE self-explanatory, lets a class inherit from another.
•    extends = lets a subclass inherit from a superclass
•    super() = lets a subclass inherit the constructor attributes.
  
POLYMORPHISM utilizes inheritance which will allow us to create many forms of a class.
An example; the class Animal can create various subclasses as Dogs, Cats, Birds
 
ABSTRACTION: An abstract describes unspecified objects, e.g. (Shape, Animal, Person, Place, Phone)
Abstraction is used to implement hidden or default attributes and methods.
  
•    abstract = a modifier used to create an abstract class. An abstract class is useless by itself
...an abstract class cannot be instantiated; it can only be inherited.

Method overriding in abstraction.
...an abstract method,is used to force sub-classes to override the method
