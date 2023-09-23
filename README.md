# LLD

Design Patterns?

1. Proven Solutions:
  Design patterns are established and tested solutions to recurring software design problems.
2. Reusable Templates:
  They provide reusable templates and guidelines for structuring code and systems, saving time and effort.
4. Enhance Quality:
  Design patterns promote better software quality by encouraging best practices in design, making code more maintainable and extensible.

Types?
    1. Creational Patterns
    2. Structural Patterns
    3. Behavioral Patterns

Creational patterns?

  * Creational design patterns are a set of software design patterns that focus on how objects are created and instantiated in a software system. They address the challenges of object creation, ensuring that it is done in a way that is flexible, maintainable, and efficient.
  
  * These patterns encapsulate the object creation process, hide its complexities, and provide well-defined interfaces for creating objects. By doing so, they promote code reusability, enhance the ability to change the way objects are created without affecting the rest of the code, and offer control over object initialization.
  
  * In practical terms, creational design patterns help answer questions like:
  
  1.How can we ensure that there is only one instance of a class in the entire system (Singleton Pattern)?
  2.How can we create objects without specifying their concrete classes (Factory Method and Abstract Factory Patterns)?
  3.How can we construct complex objects step by step, allowing for variations in their representation (Builder Pattern)?
  4.How can we efficiently create new objects by copying existing ones (Prototype Pattern)?
  
  Overall, creational design patterns play a crucial role in structuring the object creation process to make software systems more maintainable, extensible, and easier to manage.

     +---------------------------------------------------+
   |         Creational Design Patterns Flowchart     |
   |    -----------------------------------------    |
   |    |                                       |    |
   |    |  Singleton                           |    |
   |    |  - Ensures a single instance         |    |
   |    |  - Provides global access            |    |
   |    |                                       |    |
   |    |  Factory Method                      |    |
   |    |  - Defines an interface             |    |
   |    |  - Subclasses alter objects         |    |
   |    |                                       |    |
   |    |  Abstract Factory                    |    |
   |    |  - Creates related object families  |    |
   |    |  - Hides concrete classes           |    |
   |    |                                       |    |
   |    |  Builder                             |    |
   |    |  - Separates construction from      |    |
   |    |    representation                   |    |
   |    |  - Step-by-step construction        |    |
   |    |                                       |    |
   |    |  Prototype                           |    |
   |    |  - Creates objects by copying       |    |
   |    |  - Efficient object creation        |    |
   |    |                                       |    |
   |    +---------------------------------------+    |
   +---------------------------------------------------+
