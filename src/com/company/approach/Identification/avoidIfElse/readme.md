<!-- TOC -->
  * [1️⃣ Lookup Tables or Maps Example to Reduce Conditional Delegations in Low-Level Design](#1-lookup-tables-or-maps-example-to-reduce-conditional-delegations-in-low-level-design)
    * [❌With out lookups](#with-out-lookups)
    * [🔧 **Step 1: Define a Common Interface**](#-step-1-define-a-common-interface)
    * [🖌️ **Step 2: Create Concrete Shape Classes**](#-step-2-create-concrete-shape-classes)
    * [🏗️ **Step 3: Create the Shape Factory with Runtime Registration**](#-step-3-create-the-shape-factory-with-runtime-registration)
    * [🚀 **Step 4: Demonstrate Runtime Registration**](#-step-4-demonstrate-runtime-registration)
    * [📋 **Output**](#-output)
    * [🛠️ **How This Approach Works**](#-how-this-approach-works)
    * [✅ **Advantages of This Approach**](#-advantages-of-this-approach)
    * [🎯 **Conclusion**](#-conclusion)
  * [2️⃣ Polymorphism Example to Reduce Conditional Delegations in Low-Level Design](#2-polymorphism-example-to-reduce-conditional-delegations-in-low-level-design)
    * [🔧 **Scenario: Payment Processing**](#-scenario-payment-processing)
    * [❌ **Without Polymorphism (Using Conditional Delegations)**](#-without-polymorphism-using-conditional-delegations)
      * [**Issues with the Above Code:**](#issues-with-the-above-code)
    * [✅ **With Polymorphism**](#-with-polymorphism)
      * [Step 1: Define a Common Interface](#step-1-define-a-common-interface)
      * [Step 2: Create Concrete Payment Classes](#step-2-create-concrete-payment-classes)
      * [Step 3: Use Polymorphism in the Client Code](#step-3-use-polymorphism-in-the-client-code)
    * [📋 **Output**](#-output-1)
    * [🛠️ **How Polymorphism Reduces Conditional Delegations**](#-how-polymorphism-reduces-conditional-delegations)
    * [❌ **What If You Don't Use Polymorphism?**](#-what-if-you-dont-use-polymorphism)
    * [🎯 **Conclusion**](#-conclusion-1)
  * [3️⃣Strategy Pattern Example to Reduce Conditional Delegations in Low-Level Design](#3strategy-pattern-example-to-reduce-conditional-delegations-in-low-level-design)
    * [🔧 **Scenario: Payment Processing with Different Discount Strategies**](#-scenario-payment-processing-with-different-discount-strategies)
    * [❌ **Without Strategy Pattern (Using Conditional Delegations)**](#-without-strategy-pattern-using-conditional-delegations)
      * [**Issues with the Above Code:**](#issues-with-the-above-code-1)
    * [✅ **With Strategy Pattern**](#-with-strategy-pattern)
      * [Step 1: Define a Common Strategy Interface](#step-1-define-a-common-strategy-interface)
      * [Step 2: Create Concrete Strategy Classes](#step-2-create-concrete-strategy-classes)
      * [Step 3: Create a Context Class](#step-3-create-a-context-class)
      * [Step 4: Demonstrate the Strategy Pattern](#step-4-demonstrate-the-strategy-pattern)
    * [📋 **Output**](#-output-2)
    * [🛠️ **How the Strategy Pattern Reduces Conditional Delegations**](#-how-the-strategy-pattern-reduces-conditional-delegations)
    * [❌ **What If You Don't Use the Strategy Pattern?**](#-what-if-you-dont-use-the-strategy-pattern)
    * [🎯 **Conclusion**](#-conclusion-2)
  * [4️⃣ State Pattern Example to Reduce Conditional Delegations in Low-Level Design](#4-state-pattern-example-to-reduce-conditional-delegations-in-low-level-design)
    * [🔧 **Scenario: Traffic Light System**](#-scenario-traffic-light-system)
    * [❌ **Without State Pattern (Using Conditional Delegations)**](#-without-state-pattern-using-conditional-delegations)
      * [**Issues with the Above Code:**](#issues-with-the-above-code-2)
    * [✅ **With State Pattern**](#-with-state-pattern)
      * [Step 1: Define a Common State Interface](#step-1-define-a-common-state-interface)
      * [Step 2: Create Concrete State Classes](#step-2-create-concrete-state-classes)
      * [Step 3: Create a Context Class](#step-3-create-a-context-class-1)
      * [Step 4: Demonstrate the State Pattern](#step-4-demonstrate-the-state-pattern)
    * [📋 **Output**](#-output-3)
    * [🛠️ **How the State Pattern Reduces Conditional Delegations**](#-how-the-state-pattern-reduces-conditional-delegations)
    * [❌ **What If You Don't Use the State Pattern?**](#-what-if-you-dont-use-the-state-pattern)
    * [🎯 **Conclusion**](#-conclusion-3)
  * [5️⃣Command Pattern Example to Reduce Conditional Delegations in Low-Level Design](#5command-pattern-example-to-reduce-conditional-delegations-in-low-level-design)
    * [🔧 **Scenario: Remote Control for Electronic Devices**](#-scenario-remote-control-for-electronic-devices)
    * [❌ **Without Command Pattern (Using Conditional Delegations)**](#-without-command-pattern-using-conditional-delegations)
      * [**Issues with the Above Code:**](#issues-with-the-above-code-3)
    * [✅ **With Command Pattern**](#-with-command-pattern)
      * [Step 1: Define a Command Interface](#step-1-define-a-command-interface)
      * [Step 2: Create Concrete Command Classes](#step-2-create-concrete-command-classes)
      * [Step 3: Create an Invoker Class](#step-3-create-an-invoker-class)
      * [Step 4: Demonstrate the Command Pattern](#step-4-demonstrate-the-command-pattern)
    * [📋 **Output**](#-output-4)
    * [🛠️ **How the Command Pattern Reduces Conditional Delegations**](#-how-the-command-pattern-reduces-conditional-delegations)
    * [❌ **What If You Don't Use the Command Pattern?**](#-what-if-you-dont-use-the-command-pattern)
    * [🎯 **Conclusion**](#-conclusion-4)
  * [6️⃣Chain of Responsibility Pattern Example to Reduce Conditional Delegations in Low-Level Design](#6chain-of-responsibility-pattern-example-to-reduce-conditional-delegations-in-low-level-design)
    * [🔧 **Scenario: Logging System**](#-scenario-logging-system)
    * [❌ **Without Chain of Responsibility Pattern (Using Conditional Delegations)**](#-without-chain-of-responsibility-pattern-using-conditional-delegations)
      * [**Issues with the Above Code:**](#issues-with-the-above-code-4)
    * [✅ **With Chain of Responsibility Pattern**](#-with-chain-of-responsibility-pattern)
      * [Step 1: Define a Handler Interface](#step-1-define-a-handler-interface)
      * [Step 2: Create Concrete Handlers](#step-2-create-concrete-handlers)
      * [Step 3: Create the Chain of Handlers](#step-3-create-the-chain-of-handlers)
      * [Step 4: Demonstrate the Chain of Responsibility Pattern](#step-4-demonstrate-the-chain-of-responsibility-pattern)
    * [📋 **Output**](#-output-5)
    * [🛠️ **How the Chain of Responsibility Pattern Reduces Conditional Delegations**](#-how-the-chain-of-responsibility-pattern-reduces-conditional-delegations)
    * [❌ **What If You Don't Use the Chain of Responsibility Pattern?**](#-what-if-you-dont-use-the-chain-of-responsibility-pattern)
    * [🎯 **Conclusion**](#-conclusion-5)
  * [7️⃣Template Method Pattern Example to Reduce Conditional Delegations in Low-Level Design](#7template-method-pattern-example-to-reduce-conditional-delegations-in-low-level-design)
    * [🔧 **Scenario: Data Processing Framework**](#-scenario-data-processing-framework)
    * [❌ **Without Template Method Pattern (Using Conditional Delegations)**](#-without-template-method-pattern-using-conditional-delegations)
      * [**Issues with the Above Code:**](#issues-with-the-above-code-5)
    * [✅ **With Template Method Pattern**](#-with-template-method-pattern)
      * [Step 1: Define an Abstract Class with the Template Method](#step-1-define-an-abstract-class-with-the-template-method)
      * [Step 2: Create Concrete Subclasses](#step-2-create-concrete-subclasses)
      * [Step 3: Use the Template Method in the Client Code](#step-3-use-the-template-method-in-the-client-code)
    * [📋 **Output**](#-output-6)
    * [🛠️ **How the Template Method Pattern Reduces Conditional Delegations**](#-how-the-template-method-pattern-reduces-conditional-delegations)
    * [❌ **What If You Don't Use the Template Method Pattern?**](#-what-if-you-dont-use-the-template-method-pattern)
    * [🎯 **Conclusion**](#-conclusion-6)
<!-- TOC -->
## 1️⃣ Lookup Tables or Maps Example to Reduce Conditional Delegations in Low-Level Design

This example demonstrates how to use **Lookup Tables or Maps** to reduce conditional delegations in low-level design. By replacing `if-else` or `switch-case` statements with a `Map`, we can make the code more modular, extensible, and maintainable.

---

### ❌With out lookups
```java
class ShapeWithoutLookup {
    public void draw(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            System.out.println("Drawing a Circle.");
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            System.out.println("Drawing a Square.");
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            System.out.println("Drawing a Rectangle.");
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }
}

// Main class
public class WithoutLookupDemo {
    public static void main(String[] args) {
        ShapeWithoutLookup shapeDrawer = new ShapeWithoutLookup();
        shapeDrawer.draw("CIRCLE");
        shapeDrawer.draw("SQUARE");
        shapeDrawer.draw("RECTANGLE");
        shapeDrawer.draw("TRIANGLE"); // Unknown shape
    }
}
```

### 🔧 **Step 1: Define a Common Interface**

We define a common interface `Shape` that all concrete shape classes will implement.

```java
interface Shape {
    void draw();
}
```

---

### 🖌️ **Step 2: Create Concrete Shape Classes**

Each shape has its own concrete class that implements the `Shape` interface. This encapsulates the behavior of each shape.

```java
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}
```

---

### 🏗️ **Step 3: Create the Shape Factory with Runtime Registration**

The `ShapeFactory` uses a `Map` to store mappings between shape types and their corresponding **class constructors**. This allows new shapes to be registered dynamically at runtime.

```java
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

class ShapeFactory {
    // Map to store shape type and corresponding constructor (Supplier)
    private final Map<String, Supplier<Shape>> shapeMap = new HashMap<>();

    public ShapeFactory() {
        // Register default shapes
        registerShape("CIRCLE", Circle::new);
        registerShape("SQUARE", Square::new);
        registerShape("RECTANGLE", Rectangle::new);
    }

    // Method to register a new shape at runtime
    public void registerShape(String shapeType, Supplier<Shape> shapeSupplier) {
        shapeMap.put(shapeType.toUpperCase(), shapeSupplier);
    }

    // Method to create a shape
    public Shape createShape(String shapeType) {
        Supplier<Shape> shapeSupplier = shapeMap.get(shapeType.toUpperCase());
        if (shapeSupplier == null) {
            throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
        return shapeSupplier.get();
    }
}
```

---

### 🚀 **Step 4: Demonstrate Runtime Registration**

The client code interacts with the `ShapeFactory` to retrieve and use the appropriate shape object. New shapes can be registered dynamically at runtime.

```java
public class RuntimeRegistrationDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create and draw default shapes
        Shape shape1 = shapeFactory.createShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.createShape("SQUARE");
        shape2.draw();

        Shape shape3 = shapeFactory.createShape("RECTANGLE");
        shape3.draw();

        // Register a new shape at runtime
        shapeFactory.registerShape("TRIANGLE", () -> new Shape() {
            @Override
            public void draw() {
                System.out.println("Drawing a Triangle.");
            }
        });

        // Create and draw the newly registered shape
        Shape shape4 = shapeFactory.createShape("TRIANGLE");
        shape4.draw();

        // Attempting to create an unknown shape
        try {
            Shape shape5 = shapeFactory.createShape("HEXAGON");
            shape5.draw();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

---

### 📋 **Output**

```
Drawing a Circle.
Drawing a Square.
Drawing a Rectangle.
Drawing a Triangle.
Unknown shape type: HEXAGON
```

---

### 🛠️ **How This Approach Works**

1. **Dynamic Registration**:
    - The `registerShape` method allows new shapes to be added at runtime by providing a `Supplier<Shape>` (a constructor reference or lambda that creates the shape).

2. **Encapsulation of Behavior**:
    - Each shape's behavior is encapsulated in its own concrete class, adhering to the **Single Responsibility Principle**.

3. **Open/Closed Principle**:
    - The factory does not need to be modified to add new shapes. New shapes can be registered dynamically without changing the existing code.

4. **Improved Scalability**:
    - The `Map` provides a clean and scalable way to manage shape registrations and lookups.

---

### ✅ **Advantages of This Approach**

- **Runtime Flexibility**: New shapes can be added dynamically at runtime without modifying the factory or client code.
- **Decoupling**: The factory is decoupled from the specific implementations of shapes. It only interacts with the `Shape` interface.
- **Adherence to Design Principles**: The code adheres to the **Open/Closed Principle** and **Single Responsibility Principle**.
- **Ease of Testing**: Each shape can be tested independently, and the factory can be tested for its ability to register and create shapes dynamically.

---

### 🎯 **Conclusion**

This implementation of the **Lookup Table (Map)** with runtime registration demonstrates how to reduce conditional delegations in low-level design while allowing dynamic extensibility. By using a `Map` to store shape constructors and providing a `registerShape` method, the factory becomes highly flexible and adheres to clean code principles.


## 2️⃣ Polymorphism Example to Reduce Conditional Delegations in Low-Level Design

Polymorphism is a fundamental concept in object-oriented programming that allows objects to exhibit different behaviors based on their class type. It helps reduce conditional checks (`if-else` or `switch-case`) by delegating behavior to specific subclasses or implementations.

---

### 🔧 **Scenario: Payment Processing**

We need to process payments using different methods (e.g., Credit Card, PayPal, Bank Transfer). Without polymorphism, this would involve conditional checks to determine the payment type and execute the corresponding logic. Using polymorphism, we can eliminate these conditionals by delegating the behavior to specific subclasses.

---

### ❌ **Without Polymorphism (Using Conditional Delegations)**

```java
class PaymentProcessor {
    public void processPayment(String paymentType) {
        if (paymentType.equalsIgnoreCase("CREDIT_CARD")) {
            System.out.println("Processing payment with Credit Card.");
        } else if (paymentType.equalsIgnoreCase("PAYPAL")) {
            System.out.println("Processing payment with PayPal.");
        } else if (paymentType.equalsIgnoreCase("BANK_TRANSFER")) {
            System.out.println("Processing payment with Bank Transfer.");
        } else {
            throw new IllegalArgumentException("Unknown payment type: " + paymentType);
        }
    }
}

// Main class
public class WithoutPolymorphismDemo {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("CREDIT_CARD");
        processor.processPayment("PAYPAL");
        processor.processPayment("BANK_TRANSFER");
    }
}
```

#### **Issues with the Above Code:**
- **Tight Coupling**: The `PaymentProcessor` class is tightly coupled to all payment types.
- **Violation of Open/Closed Principle**: Adding a new payment type requires modifying the `processPayment` method.
- **Scalability Issues**: As the number of payment types grows, the `if-else` block becomes harder to manage.
- **Difficult to Test**: Each branch of the conditional logic must be tested separately.

---

### ✅ **With Polymorphism**

#### Step 1: Define a Common Interface
We define a `Payment` interface that all payment methods will implement.

```java
interface Payment {
    void process();
}
```

#### Step 2: Create Concrete Payment Classes
Each payment method has its own concrete class that implements the `Payment` interface.

```java
class CreditCardPayment implements Payment {
    @Override
    public void process() {
        System.out.println("Processing payment with Credit Card.");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void process() {
        System.out.println("Processing payment with PayPal.");
    }
}

class BankTransferPayment implements Payment {
    @Override
    public void process() {
        System.out.println("Processing payment with Bank Transfer.");
    }
}
```

#### Step 3: Use Polymorphism in the Client Code
The client code interacts with the `Payment` interface, allowing dynamic behavior based on the actual implementation.

```java
public class WithPolymorphismDemo {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();
        Payment bankTransferPayment = new BankTransferPayment();

        // Process payments
        creditCardPayment.process();
        payPalPayment.process();
        bankTransferPayment.process();
    }
}
```

---

### 📋 **Output**

```
Processing payment with Credit Card.
Processing payment with PayPal.
Processing payment with Bank Transfer.
```

---

### 🛠️ **How Polymorphism Reduces Conditional Delegations**

1. **Encapsulation of Behavior**:
    - Each payment method encapsulates its own behavior in a separate class, adhering to the **Single Responsibility Principle**.

2. **Open/Closed Principle**:
    - Adding a new payment method (e.g., `CryptoPayment`) only requires creating a new class that implements the `Payment` interface. The existing code remains unchanged.

3. **Dynamic Behavior**:
    - The client code interacts with the `Payment` interface, allowing dynamic behavior based on the actual implementation.

4. **Improved Readability**:
    - The code is easier to read and maintain because the conditional logic is replaced with polymorphic behavior.

---

### ❌ **What If You Don't Use Polymorphism?**

If you don't use polymorphism, you will likely end up with code that:
1. **Violates the Open/Closed Principle**:
    - Adding new payment methods requires modifying the existing `if-else` or `switch-case` logic, increasing the risk of introducing bugs.

2. **Becomes Harder to Maintain**:
    - As the number of payment methods grows, the conditional logic becomes more complex and harder to manage.

3. **Is Less Testable**:
    - Testing each branch of the conditional logic separately is more error-prone and time-consuming compared to testing individual classes.

4. **Lacks Scalability**:
    - The code becomes less scalable as new payment methods are added, leading to bloated and tightly coupled logic.

---

### 🎯 **Conclusion**

Using **polymorphism** to replace conditional delegations results in cleaner, more maintainable, and scalable code. By encapsulating behavior in separate classes and adhering to the **Open/Closed Principle**, polymorphism eliminates the need for `if-else` or `switch-case` statements, making the code easier to extend and test.


## 3️⃣Strategy Pattern Example to Reduce Conditional Delegations in Low-Level Design

The **Strategy Pattern** is a behavioral design pattern that allows you to encapsulate interchangeable algorithms or behaviors into separate classes, enabling dynamic behavior changes at runtime. This pattern eliminates the need for conditional checks by delegating the behavior to specific strategy classes.

---

### 🔧 **Scenario: Payment Processing with Different Discount Strategies**

Imagine a system where we need to calculate discounts for different types of customers (e.g., Regular, Premium, VIP). Without the Strategy Pattern, this would involve conditional checks to determine the discount logic. Using the Strategy Pattern, we can encapsulate each discount algorithm into its own class and dynamically apply the appropriate strategy.

---

### ❌ **Without Strategy Pattern (Using Conditional Delegations)**

```java
class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equalsIgnoreCase("REGULAR")) {
            return amount * 0.05; // 5% discount
        } else if (customerType.equalsIgnoreCase("PREMIUM")) {
            return amount * 0.10; // 10% discount
        } else if (customerType.equalsIgnoreCase("VIP")) {
            return amount * 0.20; // 20% discount
        } else {
            throw new IllegalArgumentException("Unknown customer type: " + customerType);
        }
    }
}

// Main class
public class WithoutStrategyDemo {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Regular Discount: " + calculator.calculateDiscount("REGULAR", 1000));
        System.out.println("Premium Discount: " + calculator.calculateDiscount("PREMIUM", 1000));
        System.out.println("VIP Discount: " + calculator.calculateDiscount("VIP", 1000));
    }
}
```

#### **Issues with the Above Code:**
- **Tight Coupling**: The `DiscountCalculator` class is tightly coupled to all discount types.
- **Violation of Open/Closed Principle**: Adding a new discount type requires modifying the `calculateDiscount` method.
- **Scalability Issues**: As the number of discount types grows, the `if-else` block becomes harder to manage.
- **Difficult to Test**: Each branch of the conditional logic must be tested separately.

---

### ✅ **With Strategy Pattern**

#### Step 1: Define a Common Strategy Interface
We define a `DiscountStrategy` interface that all discount strategies will implement.

```java
interface DiscountStrategy {
    double calculateDiscount(double amount);
}
```

#### Step 2: Create Concrete Strategy Classes
Each discount type has its own concrete class that implements the `DiscountStrategy` interface.

```java
class RegularDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.05; // 5% discount
    }
}

class PremiumDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10; // 10% discount
    }
}

class VIPDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.20; // 20% discount
    }
}
```

#### Step 3: Create a Context Class
The `DiscountContext` class uses a `DiscountStrategy` to calculate the discount. This allows the strategy to be dynamically set at runtime.

```java
class DiscountContext {
    private DiscountStrategy strategy;

    // Set the strategy dynamically
    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    // Use the strategy to calculate the discount
    public double calculateDiscount(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Discount strategy is not set.");
        }
        return strategy.calculateDiscount(amount);
    }
}
```

#### Step 4: Demonstrate the Strategy Pattern
The client code interacts with the `DiscountContext` and dynamically sets the appropriate strategy.

```java
public class WithStrategyDemo {
    public static void main(String[] args) {
        DiscountContext context = new DiscountContext();

        // Set and use Regular Discount Strategy
        context.setStrategy(new RegularDiscount());
        System.out.println("Regular Discount: " + context.calculateDiscount(1000));

        // Set and use Premium Discount Strategy
        context.setStrategy(new PremiumDiscount());
        System.out.println("Premium Discount: " + context.calculateDiscount(1000));

        // Set and use VIP Discount Strategy
        context.setStrategy(new VIPDiscount());
        System.out.println("VIP Discount: " + context.calculateDiscount(1000));
    }
}
```

---

### 📋 **Output**

```
Regular Discount: 50.0
Premium Discount: 100.0
VIP Discount: 200.0
```

---

### 🛠️ **How the Strategy Pattern Reduces Conditional Delegations**

1. **Encapsulation of Behavior**:
    - Each discount algorithm is encapsulated in its own class, adhering to the **Single Responsibility Principle**.

2. **Open/Closed Principle**:
    - Adding a new discount type (e.g., `StudentDiscount`) only requires creating a new class that implements the `DiscountStrategy` interface. The existing code remains unchanged.

3. **Dynamic Behavior**:
    - The `DiscountContext` dynamically selects and applies the appropriate strategy at runtime.

4. **Improved Readability**:
    - The code is easier to read and maintain because the conditional logic is replaced with polymorphic behavior.

---

### ❌ **What If You Don't Use the Strategy Pattern?**

If you don't use the Strategy Pattern, you will likely end up with code that:
1. **Violates the Open/Closed Principle**:
    - Adding new discount types requires modifying the existing `if-else` or `switch-case` logic, increasing the risk of introducing bugs.

2. **Becomes Harder to Maintain**:
    - As the number of discount types grows, the conditional logic becomes more complex and harder to manage.

3. **Is Less Testable**:
    - Testing each branch of the conditional logic separately is more error-prone and time-consuming compared to testing individual strategy classes.

4. **Lacks Scalability**:
    - The code becomes less scalable as new discount types are added, leading to bloated and tightly coupled logic.

---

### 🎯 **Conclusion**

The **Strategy Pattern** provides a clean and flexible way to reduce conditional delegations in low-level design. By encapsulating algorithms into separate strategy classes and dynamically applying them at runtime, the Strategy Pattern adheres to the **Open/Closed Principle** and improves code maintainability, scalability, and testability.


## 4️⃣ State Pattern Example to Reduce Conditional Delegations in Low-Level Design

The **State Pattern** is a behavioral design pattern that allows an object to change its behavior dynamically based on its internal state. It encapsulates state-specific behaviors into separate classes and enables seamless transitions between states. This pattern is particularly useful for reducing conditional checks (`if-else` or `switch-case`) by delegating behavior to state-specific classes.

---

### 🔧 **Scenario: Traffic Light System**

Imagine a traffic light system where the light changes between `Red`, `Yellow`, and `Green`. Without the State Pattern, this would involve conditional checks to determine the current state and execute the corresponding behavior. Using the State Pattern, we can encapsulate each state into its own class and dynamically transition between them.

---

### ❌ **Without State Pattern (Using Conditional Delegations)**

```java
class TrafficLight {
    private String state;

    public TrafficLight(String initialState) {
        this.state = initialState;
    }

    public void changeState() {
        if (state.equalsIgnoreCase("RED")) {
            System.out.println("Red Light - Stop!");
            state = "GREEN";
        } else if (state.equalsIgnoreCase("GREEN")) {
            System.out.println("Green Light - Go!");
            state = "YELLOW";
        } else if (state.equalsIgnoreCase("YELLOW")) {
            System.out.println("Yellow Light - Slow Down!");
            state = "RED";
        } else {
            throw new IllegalStateException("Unknown state: " + state);
        }
    }
}

// Main class
public class WithoutStatePatternDemo {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("RED");

        trafficLight.changeState(); // Red -> Green
        trafficLight.changeState(); // Green -> Yellow
        trafficLight.changeState(); // Yellow -> Red
    }
}
```

#### **Issues with the Above Code:**
- **Tight Coupling**: The `TrafficLight` class is tightly coupled to all states.
- **Violation of Open/Closed Principle**: Adding a new state requires modifying the `changeState` method.
- **Scalability Issues**: As the number of states grows, the `if-else` block becomes harder to manage.
- **Difficult to Test**: Each branch of the conditional logic must be tested separately.

---

### ✅ **With State Pattern**

#### Step 1: Define a Common State Interface
We define a `TrafficLightState` interface that all state classes will implement.

```java
interface TrafficLightState {
    void changeState(TrafficLightContext context);
}
```

#### Step 2: Create Concrete State Classes
Each state has its own concrete class that implements the `TrafficLightState` interface.

```java
class RedLightState implements TrafficLightState {
    @Override
    public void changeState(TrafficLightContext context) {
        System.out.println("Red Light - Stop!");
        context.setState(new GreenLightState());
    }
}

class GreenLightState implements TrafficLightState {
    @Override
    public void changeState(TrafficLightContext context) {
        System.out.println("Green Light - Go!");
        context.setState(new YellowLightState());
    }
}

class YellowLightState implements TrafficLightState {
    @Override
    public void changeState(TrafficLightContext context) {
        System.out.println("Yellow Light - Slow Down!");
        context.setState(new RedLightState());
    }
}
```

#### Step 3: Create a Context Class
The `TrafficLightContext` class maintains the current state and delegates state-specific behavior to the current state object.

```java
class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext(TrafficLightState initialState) {
        this.state = initialState;
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void changeState() {
        state.changeState(this);
    }
}
```

#### Step 4: Demonstrate the State Pattern
The client code interacts with the `TrafficLightContext` and dynamically transitions between states.

```java
public class WithStatePatternDemo {
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext(new RedLightState());

        trafficLight.changeState(); // Red -> Green
        trafficLight.changeState(); // Green -> Yellow
        trafficLight.changeState(); // Yellow -> Red
    }
}
```

---

### 📋 **Output**

```
Red Light - Stop!
Green Light - Go!
Yellow Light - Slow Down!
```

---

### 🛠️ **How the State Pattern Reduces Conditional Delegations**

1. **Encapsulation of Behavior**:
    - Each state-specific behavior is encapsulated in its own class, adhering to the **Single Responsibility Principle**.

2. **Open/Closed Principle**:
    - Adding a new state (e.g., `FlashingLightState`) only requires creating a new class that implements the `TrafficLightState` interface. The existing code remains unchanged.

3. **Dynamic Transitions**:
    - The `TrafficLightContext` dynamically transitions between states by delegating behavior to the current state object.

4. **Improved Readability**:
    - The code is easier to read and maintain because the conditional logic is replaced with polymorphic behavior.

---

### ❌ **What If You Don't Use the State Pattern?**

If you don't use the State Pattern, you will likely end up with code that:
1. **Violates the Open/Closed Principle**:
    - Adding new states requires modifying the existing `if-else` or `switch-case` logic, increasing the risk of introducing bugs.

2. **Becomes Harder to Maintain**:
    - As the number of states grows, the conditional logic becomes more complex and harder to manage.

3. **Is Less Testable**:
    - Testing each branch of the conditional logic separately is more error-prone and time-consuming compared to testing individual state classes.

4. **Lacks Scalability**:
    - The code becomes less scalable as new states are added, leading to bloated and tightly coupled logic.

---

### 🎯 **Conclusion**

The **State Pattern** provides a clean and flexible way to reduce conditional delegations in low-level design. By encapsulating state-specific behaviors into separate classes and dynamically transitioning between states, the State Pattern adheres to the **Open/Closed Principle** and improves code maintainability, scalability, and testability.


## 5️⃣Command Pattern Example to Reduce Conditional Delegations in Low-Level Design

The **Command Pattern** is a behavioral design pattern that encapsulates a request as an object, thereby decoupling the sender (Invoker) from the receiver. It allows you to parameterize objects with operations, delay execution, queue requests, and support undoable operations. This pattern is particularly useful for reducing conditional checks by delegating behavior to command objects.

---

### 🔧 **Scenario: Remote Control for Electronic Devices**

Imagine a remote control system where we need to execute commands like turning on/off a light or a fan. Without the Command Pattern, this would involve conditional checks to determine the device and execute the corresponding action. Using the Command Pattern, we can encapsulate each command into its own class and dynamically execute them.

---

### ❌ **Without Command Pattern (Using Conditional Delegations)**

```java
class RemoteControl {
    public void pressButton(String device, String action) {
        if (device.equalsIgnoreCase("LIGHT") && action.equalsIgnoreCase("ON")) {
            System.out.println("Turning on the light.");
        } else if (device.equalsIgnoreCase("LIGHT") && action.equalsIgnoreCase("OFF")) {
            System.out.println("Turning off the light.");
        } else if (device.equalsIgnoreCase("FAN") && action.equalsIgnoreCase("ON")) {
            System.out.println("Turning on the fan.");
        } else if (device.equalsIgnoreCase("FAN") && action.equalsIgnoreCase("OFF")) {
            System.out.println("Turning off the fan.");
        } else {
            throw new IllegalArgumentException("Unknown device or action: " + device + " " + action);
        }
    }
}

// Main class
public class WithoutCommandPatternDemo {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        remote.pressButton("LIGHT", "ON");
        remote.pressButton("FAN", "OFF");
    }
}
```

#### **Issues with the Above Code:**
- **Tight Coupling**: The `RemoteControl` class is tightly coupled to all devices and actions.
- **Violation of Open/Closed Principle**: Adding a new device or action requires modifying the `pressButton` method.
- **Scalability Issues**: As the number of devices and actions grows, the `if-else` block becomes harder to manage.
- **Difficult to Test**: Each branch of the conditional logic must be tested separately.

---

### ✅ **With Command Pattern**

#### Step 1: Define a Command Interface
We define a `Command` interface that all command classes will implement.

```java
interface Command {
    void execute();
}
```

#### Step 2: Create Concrete Command Classes
Each command has its own concrete class that implements the `Command` interface.

```java
class LightOnCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Turning on the light.");
    }
}

class LightOffCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Turning off the light.");
    }
}

class FanOnCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Turning on the fan.");
    }
}

class FanOffCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Turning off the fan.");
    }
}
```

#### Step 3: Create an Invoker Class
The `RemoteControl` class acts as the invoker, storing and executing commands.

```java
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command set.");
        }
    }
}
```

#### Step 4: Demonstrate the Command Pattern
The client code interacts with the `RemoteControl` and dynamically sets the appropriate command.

```java
public class WithCommandPatternDemo {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        // Set and execute Light On Command
        remote.setCommand(new LightOnCommand());
        remote.pressButton();

        // Set and execute Fan Off Command
        remote.setCommand(new FanOffCommand());
        remote.pressButton();
    }
}
```

---

### 📋 **Output**

```
Turning on the light.
Turning off the fan.
```

---

### 🛠️ **How the Command Pattern Reduces Conditional Delegations**

1. **Encapsulation of Behavior**:
    - Each command encapsulates its own behavior in a separate class, adhering to the **Single Responsibility Principle**.

2. **Open/Closed Principle**:
    - Adding a new command (e.g., `FanSpeedCommand`) only requires creating a new class that implements the `Command` interface. The existing code remains unchanged.

3. **Dynamic Behavior**:
    - The `RemoteControl` dynamically executes commands by delegating behavior to the command objects.

4. **Improved Readability**:
    - The code is easier to read and maintain because the conditional logic is replaced with polymorphic behavior.

5. **Undo/Redo Support**:
    - The Command Pattern can be extended to support undo/redo functionality by maintaining a history of executed commands.

---

### ❌ **What If You Don't Use the Command Pattern?**

If you don't use the Command Pattern, you will likely end up with code that:
1. **Violates the Open/Closed Principle**:
    - Adding new devices or actions requires modifying the existing `if-else` or `switch-case` logic, increasing the risk of introducing bugs.

2. **Becomes Harder to Maintain**:
    - As the number of devices and actions grows, the conditional logic becomes more complex and harder to manage.

3. **Is Less Testable**:
    - Testing each branch of the conditional logic separately is more error-prone and time-consuming compared to testing individual command classes.

4. **Lacks Scalability**:
    - The code becomes less scalable as new devices or actions are added, leading to bloated and tightly coupled logic.

---

### 🎯 **Conclusion**

The **Command Pattern** provides a clean and flexible way to reduce conditional delegations in low-level design. By encapsulating requests into command objects and dynamically executing them, the Command Pattern adheres to the **Open/Closed Principle** and improves code maintainability, scalability, and testability.


## 6️⃣Chain of Responsibility Pattern Example to Reduce Conditional Delegations in Low-Level Design

The **Chain of Responsibility Pattern** is a behavioral design pattern that allows a request to be passed along a chain of handlers. Each handler in the chain decides whether to process the request or pass it to the next handler. This pattern is particularly useful for reducing conditional checks (`if-else` or `switch-case`) by delegating responsibility to individual handlers in the chain.

---

### 🔧 **Scenario: Logging System**

Imagine a logging system where we need to log messages at different levels (e.g., INFO, DEBUG, ERROR). Without the Chain of Responsibility Pattern, this would involve conditional checks to determine the log level and execute the corresponding logic. Using the Chain of Responsibility Pattern, we can encapsulate each log level into its own handler and dynamically pass the request along the chain.

---

### ❌ **Without Chain of Responsibility Pattern (Using Conditional Delegations)**

```java
class Logger {
    public void logMessage(String level, String message) {
        if (level.equalsIgnoreCase("INFO")) {
            System.out.println("INFO: " + message);
        } else if (level.equalsIgnoreCase("DEBUG")) {
            System.out.println("DEBUG: " + message);
        } else if (level.equalsIgnoreCase("ERROR")) {
            System.out.println("ERROR: " + message);
        } else {
            throw new IllegalArgumentException("Unknown log level: " + level);
        }
    }
}

// Main class
public class WithoutChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logMessage("INFO", "This is an info message.");
        logger.logMessage("DEBUG", "This is a debug message.");
        logger.logMessage("ERROR", "This is an error message.");
    }
}
```

#### **Issues with the Above Code:**
- **Tight Coupling**: The `Logger` class is tightly coupled to all log levels.
- **Violation of Open/Closed Principle**: Adding a new log level requires modifying the `logMessage` method.
- **Scalability Issues**: As the number of log levels grows, the `if-else` block becomes harder to manage.
- **Difficult to Test**: Each branch of the conditional logic must be tested separately.

---

### ✅ **With Chain of Responsibility Pattern**

#### Step 1: Define a Handler Interface
We define a `Logger` interface that all log handlers will implement.

```java
abstract class Logger {
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(String level, String message) {
        if (canHandle(level)) {
            write(message);
        } else if (nextLogger != null) {
            nextLogger.log(level, message);
        }
    }

    protected abstract boolean canHandle(String level);

    protected abstract void write(String message);
}
```

#### Step 2: Create Concrete Handlers
Each log level has its own concrete handler that implements the `Logger` interface.

```java
class InfoLogger extends Logger {
    @Override
    protected boolean canHandle(String level) {
        return level.equalsIgnoreCase("INFO");
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}

class DebugLogger extends Logger {
    @Override
    protected boolean canHandle(String level) {
        return level.equalsIgnoreCase("DEBUG");
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}

class ErrorLogger extends Logger {
    @Override
    protected boolean canHandle(String level) {
        return level.equalsIgnoreCase("ERROR");
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
```

#### Step 3: Create the Chain of Handlers
The chain is created by linking the handlers together.

```java
class LoggerChain {
    public static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger();
        Logger debugLogger = new DebugLogger();
        Logger infoLogger = new InfoLogger();

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        return errorLogger;
    }
}
```

#### Step 4: Demonstrate the Chain of Responsibility Pattern
The client code interacts with the chain of handlers and sends requests to the first handler.

```java
public class WithChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Logger loggerChain = LoggerChain.getChainOfLoggers();

        loggerChain.log("INFO", "This is an info message.");
        loggerChain.log("DEBUG", "This is a debug message.");
        loggerChain.log("ERROR", "This is an error message.");
    }
}
```

---

### 📋 **Output**

```
INFO: This is an info message.
DEBUG: This is a debug message.
ERROR: This is an error message.
```

---

### 🛠️ **How the Chain of Responsibility Pattern Reduces Conditional Delegations**

1. **Encapsulation of Responsibility**:
    - Each log level is encapsulated in its own handler, adhering to the **Single Responsibility Principle**.

2. **Open/Closed Principle**:
    - Adding a new log level (e.g., `WARN`) only requires creating a new handler class. The existing code remains unchanged.

3. **Dynamic Behavior**:
    - The chain dynamically passes the request along the handlers until one of them processes it.

4. **Improved Readability**:
    - The code is easier to read and maintain because the conditional logic is replaced with a chain of handlers.

5. **Decoupling**:
    - The client code is decoupled from the specific handlers. It only interacts with the first handler in the chain.

---

### ❌ **What If You Don't Use the Chain of Responsibility Pattern?**

If you don't use the Chain of Responsibility Pattern, you will likely end up with code that:
1. **Violates the Open/Closed Principle**:
    - Adding new log levels requires modifying the existing `if-else` or `switch-case` logic, increasing the risk of introducing bugs.

2. **Becomes Harder to Maintain**:
    - As the number of log levels grows, the conditional logic becomes more complex and harder to manage.

3. **Is Less Testable**:
    - Testing each branch of the conditional logic separately is more error-prone and time-consuming compared to testing individual handlers.

4. **Lacks Scalability**:
    - The code becomes less scalable as new log levels are added, leading to bloated and tightly coupled logic.

---

### 🎯 **Conclusion**

The **Chain of Responsibility Pattern** provides a clean and flexible way to reduce conditional delegations in low-level design. By passing requests along a chain of handlers and delegating responsibility to individual handlers, the Chain of Responsibility Pattern adheres to the **Open/Closed Principle** and improves code maintainability, scalability, and testability.


## 7️⃣Template Method Pattern Example to Reduce Conditional Delegations in Low-Level Design

The **Template Method Pattern** is a behavioral design pattern that defines the skeleton of an algorithm in a superclass while allowing subclasses to override specific steps of the algorithm without changing its structure. This pattern is particularly useful for creating reusable frameworks where the overall structure of an operation remains the same, but certain steps can be customized by subclasses [[1]] [[2]].

---

### 🔧 **Scenario: Data Processing Framework**

Imagine a data processing framework where we need to process data from different sources (e.g., CSV, XML). The steps for processing data are the same (e.g., read, process, and save), but the implementation of each step varies depending on the data source. Without the Template Method Pattern, this would involve conditional checks to handle different data sources. Using the Template Method Pattern, we can define the skeleton of the algorithm in a base class and let subclasses implement the specific steps.

---

### ❌ **Without Template Method Pattern (Using Conditional Delegations)**

```java
class DataProcessor {
    public void processData(String dataSourceType) {
        if (dataSourceType.equalsIgnoreCase("CSV")) {
            System.out.println("Reading data from CSV file...");
            System.out.println("Processing CSV data...");
            System.out.println("Saving processed CSV data...");
        } else if (dataSourceType.equalsIgnoreCase("XML")) {
            System.out.println("Reading data from XML file...");
            System.out.println("Processing XML data...");
            System.out.println("Saving processed XML data...");
        } else {
            throw new IllegalArgumentException("Unknown data source type: " + dataSourceType);
        }
    }
}

// Main class
public class WithoutTemplateMethodDemo {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        processor.processData("CSV");
        processor.processData("XML");
    }
}
```

#### **Issues with the Above Code:**
- **Tight Coupling**: The `DataProcessor` class is tightly coupled to all data source types.
- **Violation of Open/Closed Principle**: Adding a new data source requires modifying the `processData` method.
- **Scalability Issues**: As the number of data sources grows, the `if-else` block becomes harder to manage.
- **Difficult to Test**: Each branch of the conditional logic must be tested separately.

---

### ✅ **With Template Method Pattern**

#### Step 1: Define an Abstract Class with the Template Method
We define an abstract class `DataProcessor` that contains the template method `processData`. This method defines the skeleton of the algorithm and delegates specific steps to abstract methods.

```java
abstract class DataProcessor {
    // Template method
    public final void processData() {
        readData();
        processData();
        saveData();
    }

    protected abstract void readData();
    protected abstract void processData();
    protected abstract void saveData();
}
```

#### Step 2: Create Concrete Subclasses
Each data source type has its own concrete class that implements the specific steps of the algorithm.

```java
class CSVDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("Reading data from CSV file...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing CSV data...");
    }

    @Override
    protected void saveData() {
        System.out.println("Saving processed CSV data...");
    }
}

class XMLDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("Reading data from XML file...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing XML data...");
    }

    @Override
    protected void saveData() {
        System.out.println("Saving processed XML data...");
    }
}
```

#### Step 3: Use the Template Method in the Client Code
The client code interacts with the `DataProcessor` class and uses the template method `processData`.

```java
public class WithTemplateMethodDemo {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.processData();

        DataProcessor xmlProcessor = new XMLDataProcessor();
        xmlProcessor.processData();
    }
}
```

---

### 📋 **Output**

```
Reading data from CSV file...
Processing CSV data...
Saving processed CSV data...
Reading data from XML file...
Processing XML data...
Saving processed XML data...
```

---

### 🛠️ **How the Template Method Pattern Reduces Conditional Delegations**

1. **Encapsulation of Algorithm Structure**:
    - The overall structure of the algorithm is encapsulated in the `DataProcessor` class, adhering to the **Single Responsibility Principle**.

2. **Open/Closed Principle**:
    - Adding a new data source (e.g., JSON) only requires creating a new subclass that implements the specific steps. The existing code remains unchanged.

3. **Reusability**:
    - The template method `processData` is reusable across all subclasses, reducing code duplication.

4. **Improved Readability**:
    - The code is easier to read and maintain because the conditional logic is replaced with polymorphic behavior.

5. **Scalability**:
    - The system scales easily as new data sources can be added without modifying the base class or existing subclasses.

---

### ❌ **What If You Don't Use the Template Method Pattern?**

If you don't use the Template Method Pattern, you will likely end up with code that:
1. **Violates the Open/Closed Principle**:
    - Adding new data sources requires modifying the existing `if-else` or `switch-case` logic, increasing the risk of introducing bugs.

2. **Becomes Harder to Maintain**:
    - As the number of data sources grows, the conditional logic becomes more complex and harder to manage.

3. **Is Less Testable**:
    - Testing each branch of the conditional logic separately is more error-prone and time-consuming compared to testing individual subclasses.

4. **Lacks Scalability**:
    - The code becomes less scalable as new data sources are added, leading to bloated and tightly coupled logic.

---

### 🎯 **Conclusion**

The **Template Method Pattern** provides a clean and flexible way to reduce conditional delegations in low-level design. By defining the skeleton of an algorithm in a base class and delegating specific steps to subclasses, the Template Method Pattern adheres to the **Open/Closed Principle** and improves code maintainability, scalability, and testability. It is particularly useful for creating reusable frameworks where the overall structure of an operation remains the same, but certain steps can be customized [[1]] [[2]] [[3]].
