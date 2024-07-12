Singleton
---------

1. What does Singleton try to achieve?
    1. It ensures that a class has only one instance and provides a global point of access to that instance. 
2. Why and When we should go it
   1. When there is shared resource among the classes
   2. When Object has no state
   3. Creating an Object is costly
3. Template 
   1. Private Constructor: Prevents direct instantiation of the class from outside
   2. Private Static Instance: Holds the single instance of the class
   3. Public Static Method: Provides the global point of access to the instance
4. Ways to Implement
   1. Eager Initialization
   2. Lazy Initialization
   3. Thread-safe Singleton—Double Locking
   4. Bill Pugh Singleton Design

Eager Initialization
--------------------
1. Instance is created at the time of class loading. This is simple but not flexible because the instance is created even if it might not be used.
2. [Source Code](src/com/company/Singleton/EagerSingleton.java)

Lazy Initialization
-------------------


