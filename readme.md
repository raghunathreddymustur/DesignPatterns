
Design Patterns
---------------

## Sample Questions

1. [Sample Questions](src/com/company/problems/readme.md)


Design Priciples
-----------------
1. Solid
   1. SRP : Single reason to changes and always engineer to requirements(do not assume future changes unless it is specified).
   2. Open Closed Principle : Open for extensions and close for moditification



Creational Design Patterns
------------------------
1. [Builder Pattern](src/com/company/builder/readme.md)
2. [Singleton](src/com/company/singletonpattern/readme.md)
3. Factory
   1. [Factory Method](src/com/company/Factory/FactoryMethod/readme.md)
   2. [Abstract Factory](src/com/company/Factory/AbstractFactory/readme.md)
4. [Prototype](src/com/company/prototype/readme.md)

Structural design pattern
-------------------------
1. [Bridge](src/com/company/Bridge/readme.md)
2. [Composite](src/com/company/composite/readme.md)
3. [Proxy](src/com/company/proxy/readme.md)
4. [Adapter](src/com/company/adapter/readme.md)
5. [Facade](src/com/company/facade/readme.md)
6. [Decorator](src/com/company/decorator/readme.md)
7. [Flyweight Pattern](src/com/company/flyweight/readme.md)

Behavioral design pattern
---------------
1. [Observer](src/com/company/observer/readme.md)
2. [Strategy](src/com/company/strategy/readme.md)
3. [TemplateMethod](src/com/company/templateMethod/readme.md)
4. [State](src/com/company/state/readme.md)
5. [Command](src/com/company/command/readme.md)
6. [Mediator](src/com/company/mediator/readme.md)
7. [Visitor](src/com/company/visitor/readme.md)
8. [Iterator](src/com/company/iterator/readme.md)
9. [Chain Of Responsibility](src/com/company/chainOfResponsibility/readme.md)
10. [Interpreter](src/com/company/interpreter/readme.md)
11. [Memento](src/com/company/memento/readme.md)

### Good Design Attributes
1. [Intro](/src/com/company/attributes/intro.md)
2. Attributes
   1. [Modularity](/src/com/company/attributes/modularity/readme.md)
   2. [Cohesion](src/com/company/attributes/cohesion/readme.md)
   3. [Loose Coupling](src/com/company/attributes/looseCoupling/readme.md)
   4. [Extendability](src/com/company/attributes/extendability/readme.md)
   5. [Testability](src/com/company/attributes/testability/readme.md)


### Identification
1. [Index](src/com/company/approach/Identification/index.md)

### Different Types of Domains for Software Development



1. **eCommerce**
2. **Healthcare**
3. **Banking**
4. **Payment Systems**
5. **Booking and Reservation Systems**
6. **Insurance**
7. **Retail**
8. **Travel and Hospitality**
9. **Telecommunications**
10. **Education**
11. **Real Estate**
12. **Manufacturing**
13. **Logistics and Transportation**
14. **Entertainment and Media**
15. **Government and Public Sector**
16. **Energy and Utilities**
17. **Construction**
18. **Legal**
19. **Human Resources**
20. **Marketing and Advertising**


## 🧩 Design Patterns for Jigsaw Puzzle

While a jigsaw puzzle design might not heavily rely on complex design patterns, some principles can still apply:

*   **Composite:** The puzzle board can be seen as a composite of individual pieces, where each piece is a leaf node, and the board is the composite.
*   **Strategy:** Different strategies can be implemented to solve the puzzle (e.g., edge-first, color-grouping).

### Why Bottom-Up?

The bottom-up approach is ideal for a jigsaw puzzle because it allows us to:

*   **Focus on Details:** Define the characteristics of a single puzzle piece first.
*   **Build Complexity Incrementally:** Gradually add complexity by assembling smaller parts into larger ones.

## JigSaw Puzzle whiteBoard

### Class Diagrams
- Board : hasShape(rectangle) and doesTwoPiecesMatch\n- picture : noOfPieces\n- Shape\n- Piece : typesOfPieces and unique\n
