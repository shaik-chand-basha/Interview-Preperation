# Java Design Pattern Questions and Answers


## Q. What are the design patterns available in Java?

Java Design Patterns are divided into three categories – creational, structural, and behavioral design patterns.

**1. Creational Design Patterns** 

Best way to create the objects

* Singleton Pattern
* Factory Pattern
* Abstract Factory Pattern
* Builder Pattern
* Prototype Pattern

**2. Structural Design Patterns**

* Adapter Pattern
* Composite Pattern
* Proxy Pattern
* Flyweight Pattern
* Facade Pattern
* Bridge Pattern
* Decorator Pattern

**3. Behavioral Design Patterns**

* Template Method Pattern
* Mediator Pattern
* Chain of Responsibility Pattern
* Observer Pattern
* Strategy Pattern
* Command Pattern
* State Pattern
* Visitor Pattern
* Interpreter Pattern
* Iterator Pattern
* Memento Pattern

**4. Miscellaneous Design Patterns**

* DAO Design Pattern
* Dependency Injection Pattern
* MVC Pattern

<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>

## Creational Design Patterns
## 1. Singleton Pattern
**Interview Definition:** Ensures a class has only **one instance** and provides a global point of access to it. Use it when you need to coordinate actions across the system, like a Database Connection or a Logger.

### Java Example
```java
public class DatabaseConfig {
    private static DatabaseConfig instance;

    // Private constructor prevents instantiation from other classes
    private DatabaseConfig() {}

    public static DatabaseConfig getInstance() {
        if (instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }
}
```

---

## 2. Factory Method Pattern
**Interview Definition:** Defines an interface for creating an object but lets subclasses decide which class to instantiate. It **defers instantiation** to subclasses. Use it when the exact type of the object isn't known until runtime.

### Java Example
```java
interface Notification { void notifyUser(); }

class EmailNotification implements Notification {
    public void notifyUser() { System.out.println("Sending Email..."); }
}

class NotificationFactory {
    public Notification createNotification(String type) {
        if (type.equals("EMAIL")) return new EmailNotification();
        // logic for other types...
        return null;
    }
}
```

---

## 3. Abstract Factory Pattern
**Interview Definition:** Often called a **"Factory of Factories."** It provides an interface for creating families of related or dependent objects without specifying their concrete classes. 

### Java Example
Imagine creating UI components for different Operating Systems.

```java
interface Button { void render(); }
interface Checkbox { void render(); }

interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class WindowsFactory implements UIFactory {
    public Button createButton() { return new WindowsButton(); }
    public Checkbox createCheckbox() { return new WindowsCheckbox(); }
}
```

---

## 4. Builder Pattern
**Interview Definition:** Separates the construction of a complex object from its representation. It allows you to produce different types and representations of an object using the same construction code. It's great for objects with **many optional parameters**.

### Java Example

```java
public class User {
    private final String name; // required
    private final int age;    // optional

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class UserBuilder {
        private String name;
        private int age;
        public UserBuilder(String name) { this.name = name; }
        public UserBuilder age(int age) { this.age = age; return this; }
        public User build() { return new User(this); }
    }
}

// Usage: User u = new User.UserBuilder("John").age(25).build();
```

---

## 5. Prototype Pattern
**Interview Definition:** Used to create a new object by **copying (cloning) an existing object**. Use this when the cost of creating a brand-new object from scratch is expensive (e.g., requires a heavy database query) and you already have a similar object in memory.

### Java Example
```java
interface Prototype { Prototype clone(); }

class GameNpc implements Prototype {
    private String type;

    public GameNpc(String type) { this.type = type; }

    @Override
    public Prototype clone() {
        return new GameNpc(this.type); // Returns a copy
    }
}
```

---

### Comparison for the Interviewer:
* **Singleton:** One instance only.
* **Factory:** Creates *one* product.
* **Abstract Factory:** Creates *families* of products.
* **Builder:** Creates a *complex* object step-by-step.
* **Prototype:** Creates a copy of an *existing* object.


# Structural Design Pattern
ow classes and objects are composed to form larger structures. They use inheritance or composition to make independent parts of a system work together smoothly.

