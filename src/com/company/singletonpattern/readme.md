
Singleton
---------

1. What does Singleton try to achieve?
    1. It ensures that a class has only one instance and provides a global point of access to that instance.
   2. This ensures consistency, efficient resource management, and centralized control.
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
2. It is thread safe, as JVM ensures that the class initialization process is thread-safe. That is, it guarantees that the class is initialized once and only once, even if multiple threads are trying to load the class at the same time.
2. [Example](https://github.com/raghunathreddymustur/DesignPatterns/blob/53876325c40be12628795bbd35a3f25ea8249439/src/com/company/singletonpattern/template/EagerSingleton.java)

Lazy Initialization
-------------------
1. Instance is created when it is needed for the first time. This is more flexible but not thread-safe.
2. [Example](https://github.com/raghunathreddymustur/DesignPatterns/blob/4f2ae9e1f2aa81e74dfaee0e749e453d97d1ec3f/src/com/company/singletonpattern/template/LazySingleton.java)

ThreadSafe Singleton 
--------------------
1. Ensures that the instance is created in a thread-safe manner using synchronized. However, it may reduce performance due to the overhead of synchronization.
2. [Example](https://github.com/raghunathreddymustur/DesignPatterns/blob/4f2ae9e1f2aa81e74dfaee0e749e453d97d1ec3f/src/com/company/singletonpattern/template/ThreadSafeSingleton.java)

Bill Pugh Singleton Design
-------------------------
1.  Combines the best aspects of lazy initialization and thread safety without the overhead of synchronization. The instance is created only when the getInstance method is called, and the JVM ensures thread safety.
2. JVM Ensures Thread Safety
   1. JVM guarantees that the class is initialized once and only once, even if multiple threads are trying to load the class at the same time.
   2. The static inner class (SingletonHelper in this case) is not loaded into memory until the outer class's getInstance method is called, ensuring lazy initialization.
3. Code
   ```java
   public class BillPughSingleton {
   
       // Private constructor prevents instantiation from other classes
       private BillPughSingleton() {
       }
   
       // Static inner class - inner classes are not loaded until they are referenced
       private static class SingletonHelper {
           // Singleton instance is created when the SingletonHelper class is loaded
           private static final BillPughSingleton INSTANCE = new BillPughSingleton();
       }
   
       // Public method to provide access to the instance
       public static BillPughSingleton getInstance() {
           // When this method is called, the SingletonHelper class is loaded and initialized
           return SingletonHelper.INSTANCE;
       }
   }
    ```

Realtime examples of Singleton
-------------------
1. Configuration Settings
   1. Problem: Configuration settings often need to be shared across the application.
   2. Solution: A Singleton configuration manager can provide a single point of access to configuration data, ensuring consistency.
2. Logging
   1. A logging framework typically needs a single instance to control the logging process. This ensures that all parts of the application write logs to the same place in a consistent format.
   2. Problem: Logging should be consistent and centralized across the entire application.
   3. Solution: A Singleton logger ensures that all components log messages in a consistent format and to the same output destination.
3. Database Connections
   1. Problem: Managing database connections can be complex and resource-intensive.
   2. Solution: A Singleton database connection manager can control access to the database, ensuring that resources are used efficiently.
4. Caching
   5. Problem: Applications often need to cache data to improve performance.
   6. Solution: A Singleton cache manager ensures that all parts of the application access the same cache, reducing duplication and ensuring consistency.

Issues Related to Singleton
------------------
1. A Singleton introduces a global state in the application, which can lead to various problems
   1. Tight Coupling and Dependency Management
      1. Problem: Classes that use the Singleton instance become tightly coupled to it. This makes it difficult to change the Singleton’s implementation without affecting all dependent classes.
      2. Example: Suppose UserService and OrderService both rely on a Singleton Logger. If the Logger needs to be replaced or updated, changes must be verified across all services that use it.
2. Difficulty in Isolating Tests
   1. Problem: Since Singletons maintain state across tests, they can cause tests to interfere with each other.
   2. Example: If a test modifies the state of a Singleton DatabaseConnection, subsequent tests might be affected by this state change, leading to flaky tests.
   3. code
   ```java
   public class LoggerTest {
   @Test
   public void testLogger() {
   Logger logger = Logger.getInstance();
   logger.setLogLevel("INFO");
   
           // Logger instance state is modified here
       }
   
       @Test
       public void testLoggerWithDifferentLevel() {
           Logger logger = Logger.getInstance();
           
           // This test will be affected by the previous test's change to log level
           logger.log("DEBUG", "This message might not be logged correctly");
       }
   }
   ```
   
Problem of not using Singleton - Logging
----------------------------------------
1. Multiple Logger Instances with Configuration Changes
   1. When using multiple instances of a logger, any configuration change (such as log level, log format, or log file location) must be applied to each instance separately. This increases the risk of inconsistent configurations across different parts of the application.
      1. Logger Class Without Singleton
         1. Here’s a basic Logger class without the Singleton pattern, allowing multiple instances to be created, each with its own configuration:
          2. Code
         ```java
         import java.io.BufferedWriter;
         import java.io.FileWriter;
         import java.io.IOException;
         import java.time.LocalDateTime;
         import java.time.format.DateTimeFormatter;
   
         public class Logger {
         private String logFile;
         private String logLevel;
   
             public Logger(String logFile, String logLevel) {
                 this.logFile = logFile;
                 this.logLevel = logLevel;
             }
   
             public void log(String level, String message) {
                 if (shouldLog(level)) {
                     String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                     String logMessage = timestamp + " [" + level + "] " + message;
                     System.out.println(logMessage); // Logging to console
   
                     try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
                         writer.write(logMessage);
                         writer.newLine();
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                 }
             }
   
             private boolean shouldLog(String level) {
                 // Simplified log level comparison for this example
                 return "ERROR".equals(level) || "INFO".equals(logLevel) && "INFO".equals(level);
             }
         }

         ```
         3. Application Classes
            1. Different parts of the application use different logger instances
            2. Code
            ```java
            public class UserService {
            private Logger logger = new Logger("user.log", "INFO");
      
                public void createUser(String username) {
                    logger.log("INFO", "User created: " + username);
                }
            }
      
            public class OrderService {
            private Logger logger = new Logger("order.log", "ERROR");
      
                public void createOrder(String orderId) {
                    logger.log("ERROR", "Order created: " + orderId);
                }
            }

            ```
            
         4. Main Application
         ```java
            public class Application {
            public static void main(String[] args) {
            UserService userService = new UserService();
            OrderService orderService = new OrderService();
            
                    userService.createUser("JohnDoe");
                    orderService.createOrder("12345");
                }
            }

          ```
      2. Problem: Inconsistent Configurations
         1. Different Log Levels
            1. UserService uses a logger with log level INFO, so it logs both INFO and ERROR messages.
            2. OrderService uses a logger with log level ERROR, so it logs only ERROR messages.
         2. Different Log Files
            1. UserService writes logs to user.log.
            2. OrderService writes logs to order.log.
      3. If there is a requirement to change the log level to DEBUG across the entire application, or to log all messages to a single file, each logger instance needs to be updated individually.

Keywords and Phrases to Identify Singleton
------------------------------------------
# Identifying Singleton Pattern Use Cases

When designing software, certain keywords and phrases in the requirements or problem statements can indicate that the Singleton pattern is appropriate. The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance. This document highlights the keywords and phrases to look out for.

## Keywords and Phrases

### Single Instance
- "There should only be one instance..."
- "Only one object is needed..."
- "Ensure a single instance across the application..."

### Global Access
- "Global access point..."
- "Accessible from anywhere in the application..."
- "Provide a global access method..."

### Shared Resource
- "Shared resource management..."
- "Single point of access to a shared resource..."
- "Centralized control of a resource..."

### Consistency
- "Maintain consistency..."
- "Consistent configuration..."
- "Uniform state management..."

### Centralized Management
- "Centralized management of..."
- "Central control of..."
- "Single control point..."

### Resource Management
- "Resource optimization..."
- "Efficient resource management..."
- "Control resource allocation..."

### Unique Access
- "Unique access point..."
- "Singleton access..."
- "Ensure unique instance..."

## Examples in Requirements

### Configuration Management
- **Requirement:** "The application must have a single configuration manager to ensure that all settings are consistent across different modules."
- **Keywords:** single instance, centralized management, consistency

### Logging
- **Requirement:** "All parts of the application should log messages through a single logging service to maintain a uniform log format."
- **Keywords:** single instance, global access, consistency

### Database Connection Management
- **Requirement:** "A single database connection manager should handle all database connections to avoid resource contention and manage connections efficiently."
- **Keywords:** single instance, resource management, shared resource

### Cache Management
- **Requirement:** "A centralized cache manager should be used to store and retrieve cached data to ensure consistency and avoid duplication."
- **Keywords:** centralized management, consistency, shared resource

### Thread Pool Management
- **Requirement:** "The application should use a single thread pool to manage concurrent tasks and optimize resource usage."
- **Keywords:** single instance, resource optimization, centralized control

### Application State Management
- **Requirement:** "The application state should be managed by a single state manager to ensure that all modules see the same state information."
- **Keywords:** single instance, consistency, centralized management

## Conclusion

When reviewing requirements or problem statements, look for these keywords and phrases to identify when the Singleton pattern might be appropriate. The Singleton pattern is suitable when you need a single, consistent instance of a class that is accessed globally and controls shared resources efficiently.


