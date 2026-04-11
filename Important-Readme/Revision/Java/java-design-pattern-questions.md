
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
How classes and objects are composed to form larger structures. They use inheritance or composition to make independent parts of a system work together smoothly.

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

# 2. Structural Design Patterns**
about how classes and objects compose to form larger, more efficient structures.

Navigating structural design patterns can feel like trying to organize a messy closet—they’re all about how classes and objects compose to form larger, more efficient structures.

Here is a breakdown of each pattern, tailored for clear communication during an interview.

---

## 1. Adapter Pattern
**Interview Definition:** It allows two incompatible interfaces to work together by acting as a "translator" or "bridge" between them.

**Description:** Use this when you have an existing class (like a legacy library) that doesn't match the interface your code expects. Instead of changing the original code, you wrap it in an Adapter.

![image](https://github.com/user-attachments/assets/654fad07-0770-426c-94a1-a8a8e71908ba)

**Java Example:**
```java
// Target interface
interface MicroUsbPhone { void recharge(); }

// Adaptee (the class needing translation)
class Iphone { void lightningCharge() { System.out.println("Charging..."); } }

// Adapter
class LightningToMicroUsbAdapter implements MicroUsbPhone {
    private Iphone iphone;
    public LightningToMicroUsbAdapter(Iphone iphone) { this.iphone = iphone; }
    public void recharge() { iphone.lightningCharge(); }
}
```

---

## 2. Composite Pattern
**Interview Definition:** It allows you to treat individual objects and groups of objects (compositions) uniformly.

**Description:** This creates a "tree" structure. A common example is a file system where a "Folder" contains "Files" and other "Folders," but you can call `getSize()` on any of them regardless.



**Java Example:**
```java
interface Component { void showDetails(); }

class Leaf implements Component { 
    public void showDetails() { System.out.println("Leaf Node"); } 
}

class Composite implements Component {
    private List<Component> children = new ArrayList<>();
    public void add(Component c) { children.add(c); }
    public void showDetails() { children.forEach(Component::showDetails); }
}
```

---

## 3. Proxy Pattern
**Interview Definition:** A placeholder or "stand-in" for another object to control access to it.

**Description:** Think of it like a credit card (the proxy) for your bank account (the real subject). You use it to perform checks (security, logging, or lazy loading) before the actual operation happens.

**Java Example:**
```java
interface Image { void display(); }

class RealImage implements Image {
    public void display() { System.out.println("Displaying high-res image..."); }
}

class ProxyImage implements Image {
    private RealImage realImage;
    public void display() {
        if (realImage == null) realImage = new RealImage(); // Lazy loading
        realImage.display();
    }
}
```

---

## 4. Flyweight Pattern
**Interview Definition:** Reduces memory usage by sharing as much data as possible with similar objects.

**Description:** Instead of creating 10,000 "Tree" objects with the same texture, you store the texture once (intrinsic state) and only store the unique coordinates (extrinsic state) for each tree.

**Java Example:**
```java
class TreeType { // The shared Flyweight
    private String color; 
    public TreeType(String color) { this.color = color; }
}

class TreeFactory {
    private static Map<String, TreeType> types = new HashMap<>();
    public static TreeType getTreeType(String color) {
        return types.computeIfAbsent(color, TreeType::new);
    }
}
```

---

## 5. Facade Pattern
**Interview Definition:** Provides a simplified, high-level interface to a complex subsystem of classes.

**Description:** It’s like a "Start" button on a washing machine. You press one button (the Facade), and it handles the water valves, the motor, and the heater behind the scenes.

**Java Example:**
```java
class HomeTheaterFacade {
    private Amplifier amp;
    private Projector proj;

    public void watchMovie() {
        amp.on();
        proj.on();
        proj.wideScreenMode();
    }
}
```

---

## 6. Bridge Pattern
**Interview Definition:** Decouples an abstraction from its implementation so that the two can vary independently.

**Description:** Use this to avoid a "Cartesian product" of classes. If you have "Shapes" and "Colors," instead of creating `RedCircle`, `BlueCircle`, `RedSquare`, etc., you "bridge" Shape to Color.



**Java Example:**
```java
interface Color { void apply(); }

abstract class Shape {
    protected Color color; // The Bridge
    protected Shape(Color c) { this.color = c; }
    abstract void draw();
}

class Circle extends Shape {
    public Circle(Color c) { super(c); }
    void draw() { color.apply(); }
}
```

---

## 7. Decorator Pattern
**Interview Definition:** Dynamically adds new behavior to an object without altering its structure or using inheritance.

**Description:** It’s like ordering coffee. You start with a "Plain Coffee" and "decorate" it with Milk, then Sugar, then Whipped Cream. Each wrapper adds functionality.

**Java Example:**
```java
interface Coffee { double getCost(); }

class SimpleCoffee implements Coffee { public double getCost() { return 5.0; } }

abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee c) { this.decoratedCoffee = c; }
    public double getCost() { return decoratedCoffee.getCost(); }
}

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee c) { super(c); }
    public double getCost() { return super.getCost() + 2.0; }
}
```
