### 📚 **Cohesion in Low-Level Design**

Cohesion is a fundamental concept in software design that refers to how **focused and related** the responsibilities of a module or class are. High cohesion ensures that a class or module has a **single, well-defined purpose**, making it easier to maintain, test, and extend. Below is an explanation of cohesion in the context of low-level design, formatted for an editable `README.md` file.

---
# 📚 Cohesion in Low-Level Design

Cohesion is a key principle in software design that ensures **modules or classes are focused on a single responsibility**. It is essential for creating maintainable, scalable, and testable systems. Below, we explore the concept of cohesion and its importance in low-level design.

---

## 🌟 What is Cohesion?

Cohesion refers to how **closely related and focused** the responsibilities of a module or class are. A highly cohesive module performs a **single, well-defined task**, and all its methods and attributes work together to achieve that task.

### **Why is Cohesion Important?**
- **Improves Maintainability**: A cohesive module is easier to understand and modify because it focuses on a single responsibility.
- **Enhances Reusability**: Modules with high cohesion are more likely to be reusable in other parts of the system.
- **Simplifies Testing**: A cohesive module is easier to test because it has fewer dependencies and a clear purpose.
- **Supports the Single Responsibility Principle (SRP)**: High cohesion aligns with SRP, ensuring that a class or module has one reason to change.

---

## 🛠️ How to Achieve High Cohesion?

To achieve high cohesion in low-level design, follow these practices:

1. **Group Related Behaviors**:
   - Ensure that all methods and attributes in a class are directly related to its primary responsibility.
   - For example, in an **Online Food Delivery System**, a `PaymentProcessor` class should only handle payment-related tasks.

2. **Use Interfaces**:
   - Define interfaces to group related behaviors and enforce single responsibility.
   - For example, a `PaymentStrategy` interface can define methods like `processPayment()`, ensuring that all payment classes (e.g., `CreditCardPayment`, `PayPalPayment`) focus solely on payment processing.

3. **Avoid Overloading Responsibilities**:
   - Split large classes or modules into smaller, more focused ones.
   - For example, instead of having a single `UserManager` class that handles authentication, profile updates, and notifications, create separate classes for each responsibility.

4. **Follow the Single Responsibility Principle (SRP)**:
   - Ensure that each class or module has only one reason to change.
   - For example, a `MenuManager` class in a restaurant system should only manage menu-related operations, such as adding or retrieving menu items.

---

## 🚀 Example: Cohesion in an Online Food Delivery System

### **Low Cohesion Example**
```java
class UserManager {
    void registerUser() { ... }
    void loginUser() { ... }
    void processPayment() { ... }
    void sendNotification() { ... }
}

- **Problem**: The `UserManager` class handles multiple unrelated responsibilities, leading to low cohesion.
```

### **High Cohesion Example**
        
```java
interface UserAuthentication {
    void registerUser();
    void loginUser();
}

interface PaymentProcessor {
    void processPayment(double amount);
}

interface NotificationSender {
    void sendNotification(String message);
}

class UserAuthManager implements UserAuthentication {
    public void registerUser() { ... }
    public void loginUser() { ... }
}

class CreditCardPayment implements PaymentProcessor {
    public void processPayment(double amount) { ... }
}

class EmailNotificationSender implements NotificationSender {
    public void sendNotification(String message) { ... }
}
```

- **Solution**: Responsibilities are split into cohesive interfaces and classes, each focusing on a single task.

---

## 🔑 Key Takeaways

- **High cohesion** ensures that a module or class is focused, maintainable, and testable.
- Use **interfaces** to group related behaviors and enforce single responsibility.
- Avoid overloading responsibilities in a single class or module.
- Follow the **Single Responsibility Principle (SRP)** to achieve high cohesion in low-level design.

By designing cohesive modules, you can create systems that are easier to understand, extend, and maintain

---

