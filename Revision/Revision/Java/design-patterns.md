# 10 Essential Java Design Patterns Every Developer Should Master 
### **1. Singleton Pattern**[#](#1-singleton-pattern)

The **Singleton Pattern** ensures that a class has **only one instance** throughout the entire application and provides a **global point of access** to that instance. Think of a scenario where you have a single database connection or a configuration manager, you don't want to create multiple objects for these, as they can be heavy and may lead to inconsistencies. That’s where Singleton comes into play.

In Java, you implement a Singleton by making the constructor `private`, so no other class can create its object directly. You then create a static method (usually called `getInstance()`) which will return the same instance every time it's called.


`public class DatabaseConnection {     private static DatabaseConnection instance;     // private constructor prevents instantiation     private DatabaseConnection() {         System.out.println("Connecting to database...");     }     public static DatabaseConnection getInstance() {         if (instance == null) {             instance = new DatabaseConnection();         }         return instance;     } }`

Now whenever you need a connection:


`public class Main {     public static void main(String[] args) {         DatabaseConnection db1 = DatabaseConnection.getInstance();         DatabaseConnection db2 = DatabaseConnection.getInstance();         System.out.println(db1 == db2); // true     } }`

Here, `db1` and `db2` are both pointing to the **same object**, showing how Singleton avoids multiple object creation. This pattern is useful in logging, configuration classes, and connection pools.

### When to use the **Singleton Pattern**[#](#when-to-use-the-singleton-pattern)

*   When only **one instance** of a class should exist across the application.
*   When you need **centralized configuration**, logging, or caching.
*   For shared **resources like database connections** or file systems.

### **2. Factory Pattern**[#](#2-factory-pattern)

The **Factory Pattern** helps in creating objects **without exposing the object creation logic** to the client. Instead of using `new` keyword in different places, you use a factory class to decide which class object should be created, based on input. This becomes extremely useful when you have **multiple subclasses of a parent/interface**, and you want to manage object creation centrally.

Imagine a graphic design app where users can draw different shapes like circles, squares, or triangles. Rather than creating each shape manually, a factory can handle it.



`interface Shape {     void draw(); } class Circle implements Shape {     public void draw() {         System.out.println("Drawing Circle");     } } class Square implements Shape {     public void draw() {         System.out.println("Drawing Square");     } } class ShapeFactory {     public static Shape getShape(String type) {         if ("circle".equalsIgnoreCase(type)) {             return new Circle();         } else if ("square".equalsIgnoreCase(type)) {             return new Square();         }         return null;     } }`

Client usage becomes easy and clean:



`public class Main {     public static void main(String[] args) {         Shape shape1 = ShapeFactory.getShape("circle");         shape1.draw(); // Drawing Circle         Shape shape2 = ShapeFactory.getShape("square");         shape2.draw(); // Drawing Square     } }`

This pattern is great when the logic to create an object is complex or involves decision-making. It also keeps your code **open for extension but closed for modification**, which is one of the SOLID principles.

### When to use the **Factory Pattern**[#](#when-to-use-the-factory-pattern)

*   When object creation logic is **complex** or involves **decision-making**.
*   When you want to create objects **without exposing the actual class**.
*   When you need **loose coupling** between client code and actual implementations.

### **3. Builder Pattern**[#](#3-builder-pattern)

The **Builder Pattern** is perfect when you need to construct **complex objects step-by-step**, especially if some fields are optional. It helps you avoid the problem of **constructor overloading**, where you end up writing multiple constructors with different parameter combinations.

Let’s say you’re building a `User` object where some properties like `name` and `email` are required, but others like `age`, `phone`, or `address` are optional. The builder pattern makes this process more readable and less error-prone.



`public class User {     private String name;     private String email;     private int age;     private User(UserBuilder builder) {         this.name = builder.name;         this.email = builder.email;         this.age = builder.age;     }     public static class UserBuilder {         private String name;         private String email;         private int age;         public UserBuilder setName(String name) {             this.name = name;             return this;         }         public UserBuilder setEmail(String email) {             this.email = email;             return this;         }         public UserBuilder setAge(int age) {             this.age = age;             return this;         }         public User build() {             return new User(this);         }     }     public String toString() {         return name + " | " + email + " | " + age;     } }`

You can now build an object like this:



`public class Main {     public static void main(String[] args) {         User user = new User.UserBuilder()                 .setName("Munaf")                 .setEmail("munaf@example.com")                 .setAge(18)                 .build();         System.out.println(user);     } }`

The Builder pattern makes your code **cleaner, more readable, and flexible**, especially for creating DTOs or response models in large applications.

### When to use the Builder **Pattern**[#](#when-to-use-the-builder-pattern)

*   When you need to **build complex objects** with many optional parameters.
*   When object creation requires a **step-by-step process**.
*   To avoid constructor overload with many parameters.

### **4. Prototype Pattern**[#](#4-prototype-pattern)

The **Prototype Pattern** is used when you want to **create a copy of an existing object** instead of building a new one from scratch. It’s very useful when object creation is **expensive or time-consuming**, like when loading from a database or performing deep configuration.

In Java, this pattern uses the `clone()` method (from `Cloneable` interface) to make a duplicate of an object.



`class Vehicle implements Cloneable {     private String type;     public Vehicle(String type) {         this.type = type;     }     public Vehicle clone() {         try {             return (Vehicle) super.clone();         } catch (CloneNotSupportedException e) {             return null;         }     }     public void setType(String type) {         this.type = type;     }     public String toString() {         return "Vehicle: " + type;     } }`

Here’s how it works:



`public class Main {     public static void main(String[] args) {         Vehicle car = new Vehicle("Car");         Vehicle carCopy = car.clone();         carCopy.setType("Bike");         System.out.println(car);      // Vehicle: Car         System.out.println(carCopy);  // Vehicle: Bike     } }`

Notice how cloning saves time by copying an existing object. The Prototype pattern is used in real-world apps where object configuration is heavy, and you want to quickly make a copy and just tweak a few things.

Perfect! Let’s continue our blog with the remaining **4 Java design patterns** in the same beginner-friendly, paragraph style — keeping it simple, practical, and code-backed.

### When to use the Prototype **Pattern**[#](#when-to-use-the-prototype-pattern)

*   When object creation is **expensive** or **time-consuming**.
*   When you need to create **many copies of similar objects**.
*   To **clone existing objects** instead of building new ones from scratch.

### **5. Adapter Pattern**[#](#5-adapter-pattern)

The **Adapter Pattern** is used when you want to **make two incompatible interfaces work together**. It acts like a bridge or a connector between two classes that otherwise cannot communicate. Imagine you bought a charger from the US, but you’re in India — an adapter allows it to fit the socket here. This design pattern does the same with classes.

In Java, this is commonly used when integrating third-party APIs or legacy code with your new system.

Let’s say you have an `AdvancedMediaPlayer` which supports only `.vlc` and `.mp4` files, but your application uses a generic `MediaPlayer` interface.



`interface MediaPlayer {     void play(String audioType, String fileName); } class VlcPlayer {     public void playVlc(String fileName) {         System.out.println("Playing VLC file: " + fileName);     } } class VlcAdapter implements MediaPlayer {     private VlcPlayer vlcPlayer;     public VlcAdapter() {         vlcPlayer = new VlcPlayer();     }     public void play(String audioType, String fileName) {         if ("vlc".equalsIgnoreCase(audioType)) {             vlcPlayer.playVlc(fileName);         }     } }`

Now we plug this adapter into our application:



`class AudioPlayer implements MediaPlayer {     public void play(String audioType, String fileName) {         if ("mp3".equalsIgnoreCase(audioType)) {             System.out.println("Playing MP3 file: " + fileName);         } else if ("vlc".equalsIgnoreCase(audioType)) {             MediaPlayer adapter = new VlcAdapter();             adapter.play(audioType, fileName);         } else {             System.out.println("Format not supported");         }     } }`

Usage:



`public class Main {     public static void main(String[] args) {         AudioPlayer player = new AudioPlayer();         player.play("mp3", "song.mp3");         player.play("vlc", "video.vlc");     } }`

This pattern is perfect when you're dealing with legacy code or third-party tools that don’t directly match your interface needs.

### When to use the Adapter **Pattern**[#](#when-to-use-the-adapter-pattern)

*   When two classes **don’t match interfaces** but need to work together.
*   When integrating with **legacy code** or **third-party libraries**.
*   To make existing classes **compatible with new code**.

### **6. Observer Pattern**[#](#6-observer-pattern)

The **Observer Pattern** defines a one-to-many relationship between objects. When **one object changes**, all its dependent objects (observers) are **automatically notified and updated**. You’ve definitely seen this in real life — for example, subscribing to a YouTube channel. Once the channel posts a video, all subscribers get notified.

This is very common in event-driven systems, UI frameworks, and messaging systems.

Let’s see how this works in Java:



`import java.util.*; interface Observer {     void update(String message); } class Subscriber implements Observer {     private String name;     public Subscriber(String name) {         this.name = name;     }     public void update(String message) {         System.out.println(name + " received: " + message);     } }`

Now we need a `Subject` that notifies subscribers:



`class Channel {     private List<Observer> subscribers = new ArrayList<>();     public void subscribe(Observer observer) {         subscribers.add(observer);     }     public void notifyAllSubscribers(String message) {         for (Observer obs : subscribers) {             obs.update(message);         }     } }`

Usage:



`public class Main {     public static void main(String[] args) {         Channel codingShuttle = new Channel();         Subscriber s1 = new Subscriber("Munaf");         Subscriber s2 = new Subscriber("Ravi");         codingShuttle.subscribe(s1);         codingShuttle.subscribe(s2);         codingShuttle.notifyAllSubscribers("New Spring Boot video is live!");     } }`

This pattern keeps your code **loosely coupled**, and is useful in applications where data change needs to be broadcasted — like stock prices, chat apps, and notification systems.

### When to use the Observer **Pattern**[#](#when-to-use-the-observer-pattern)

*   When **multiple objects** need to be notified when **one object changes**.
*   In **event-driven systems** like GUIs, chat apps, or notification systems.
*   When implementing **publish-subscribe** behavior.

### **7. Strategy Pattern**[#](#7-strategy-pattern)

The **Strategy Pattern** is all about **choosing a behavior at runtime**. Instead of writing complex `if-else` or `switch` statements, you define multiple strategies (algorithms), and select one dynamically.

Let’s say you’re building a payment system that supports different methods: Credit Card, UPI, or PayPal. Using strategy pattern, you can switch between these strategies easily without changing core logic.



`interface PaymentStrategy {     void pay(double amount); } class CreditCardPayment implements PaymentStrategy {     public void pay(double amount) {         System.out.println("Paid ₹" + amount + " using Credit Card");     } } class UPIPayment implements PaymentStrategy {     public void pay(double amount) {         System.out.println("Paid ₹" + amount + " using UPI");     } }`

Now we plug this into a `PaymentService` class:



`class PaymentService {     private PaymentStrategy strategy;     public PaymentService(PaymentStrategy strategy) {         this.strategy = strategy;     }     public void makePayment(double amount) {         strategy.pay(amount);     } }`

Usage:



`public class Main {     public static void main(String[] args) {         PaymentService service1 = new PaymentService(new CreditCardPayment());         service1.makePayment(2500);         PaymentService service2 = new PaymentService(new UPIPayment());         service2.makePayment(1200);     } }`

This pattern helps in **separating different behaviors**, making the code **easier to extend and test**. You can add a new payment method without touching any existing code.

### When to use the Strategy **Pattern**[#](#when-to-use-the-strategy-pattern)

*   When you need to **choose behavior/algorithm at runtime**.
*   To eliminate long **if-else** or **switch** statements.
*   When you want to make a class **open to extension but closed to modification**.

### **8. Decorator Pattern**[#](#8-decorator-pattern)

The **Decorator Pattern** is used to **dynamically add new functionality** to an object without modifying its original code. It’s like adding toppings on a pizza — the base remains the same, but you can add cheese, mushrooms, or paneer to customize it.

Let’s build a simple coffee ordering system where you can add milk, sugar, etc., on top of base coffee.



`interface Coffee {     String getDescription();     double getCost(); } class SimpleCoffee implements Coffee {     public String getDescription() {         return "Simple Coffee";     }     public double getCost() {         return 50;     } }`

Now let’s add decorators:



`class MilkDecorator implements Coffee {     private Coffee coffee;     public MilkDecorator(Coffee coffee) {         this.coffee = coffee;     }     public String getDescription() {         return coffee.getDescription() + ", Milk";     }     public double getCost() {         return coffee.getCost() + 10;     } } class SugarDecorator implements Coffee {     private Coffee coffee;     public SugarDecorator(Coffee coffee) {         this.coffee = coffee;     }     public String getDescription() {         return coffee.getDescription() + ", Sugar";     }     public double getCost() {         return coffee.getCost() + 5;     } }`

Usage:



`public class Main {     public static void main(String[] args) {         Coffee coffee = new SimpleCoffee();         coffee = new MilkDecorator(coffee);         coffee = new SugarDecorator(coffee);         System.out.println("Order: " + coffee.getDescription());         System.out.println("Cost: ₹" + coffee.getCost());     } }`

Output:



`Order: Simple Coffee, Milk, Sugar Cost: ₹65.0`

The Decorator pattern is very powerful when you want to add features **without altering the existing code**, and is commonly used in logging, security, and user interface designs.

### When to use the Decorator **Pattern**[#](#when-to-use-the-decorator-pattern)

*   When you want to **add responsibilities/features dynamically** to an object.
*   To **extend functionality** without modifying the original class.
*   For **flexible and reusable wrappers** (e.g., UI components, logging).

### **9. Proxy Pattern**[#](#9-proxy-pattern)

The **Proxy Pattern** provides a **placeholder or substitute** for another object to control access to it. Think of it like a receptionist at a company. You don’t directly talk to the boss — the receptionist acts as a **middle layer** to either pass the message or deny access.

This pattern is especially useful in cases like **lazy initialization**, **access control**, **caching**, or **logging**. You wrap the original object with another class (the proxy) and intercept calls to it.

Let’s take an example of an `Internet` interface where access to certain websites is restricted.



`interface Internet {     void connectTo(String serverHost) throws Exception; }`

Now the actual internet class:



`class RealInternet implements Internet {     public void connectTo(String serverHost) {         System.out.println("Connecting to " + serverHost);     } }`

Let’s create a proxy that adds restrictions:



`import java.util.*; class ProxyInternet implements Internet {     private Internet internet = new RealInternet();     private static List<String> bannedSites;     static {         bannedSites = new ArrayList<>();         bannedSites.add("facebook.com");         bannedSites.add("instagram.com");     }     public void connectTo(String serverHost) throws Exception {         if (bannedSites.contains(serverHost.toLowerCase())) {             throw new Exception("Access Denied to " + serverHost);         }         internet.connectTo(serverHost);     } }`

Usage:



`public class Main {     public static void main(String[] args) {         Internet net = new ProxyInternet();         try {             net.connectTo("google.com");        // Allowed             net.connectTo("facebook.com");      // Blocked         } catch (Exception e) {             System.out.println(e.getMessage());         }     } }`

This pattern is commonly used in frameworks like Spring AOP, where proxy classes wrap services to add logging, security, or transactional behavior.

### When to use the Proxy **Pattern**[#](#when-to-use-the-proxy-pattern)

*   When you want to **control access** to another object.
*   For **lazy loading**, **caching**, **logging**, or **security checks**.
*   When adding a **middle layer** between client and real object.

### **10. Command Pattern**[#](#10-command-pattern)

The **Command Pattern** is used to **encapsulate a request as an object**, allowing us to parameterize clients with different requests, queue them, or log them. Think of it like placing an order at a restaurant — the waiter (command object) takes the order and passes it to the kitchen (receiver) without the customer needing to know how it’s cooked.

This is very useful in **UI buttons, undo/redo operations, task scheduling**, and even **remote controls**.

Let’s see an example of a remote control turning devices ON/OFF.



`interface Command {     void execute(); } class Light {     public void turnOn() {         System.out.println("Light turned ON");     }     public void turnOff() {         System.out.println("Light turned OFF");     } }`

Now we create command objects:



`class LightOnCommand implements Command {     private Light light;     public LightOnCommand(Light light) {         this.light = light;     }     public void execute() {         light.turnOn();     } } class LightOffCommand implements Command {     private Light light;     public LightOffCommand(Light light) {         this.light = light;     }     public void execute() {         light.turnOff();     } }`

And finally, a simple remote control to trigger these:



`class RemoteControl {     private Command command;     public void setCommand(Command command) {         this.command = command;     }     public void pressButton() {         command.execute();     } }`

Usage:



`public class Main {     public static void main(String[] args) {         Light livingRoomLight = new Light();         Command on = new LightOnCommand(livingRoomLight);         Command off = new LightOffCommand(livingRoomLight);         RemoteControl remote = new RemoteControl();         remote.setCommand(on);         remote.pressButton();  // Light turned ON         remote.setCommand(off);         remote.pressButton();  // Light turned OFF     } }`

This pattern is helpful when you need to **separate the object that invokes a command from the one that knows how to perform it**, making your code more flexible and modular.

### When to use the Command **Pattern**[#](#when-to-use-the-command-pattern)

*   When you need to **encapsulate actions/operations as objects**.
*   For **undo/redo**, **task queues**, or **remote execution**.
*   When you want to **decouple the sender and receiver** of a request.

### Conclusion[#](#conclusion)

Finally, we have covered 10 of the most popular design patterns that are widely used in real-world projects and often asked in interviews. I hope you now have a clear picture in your mind of how each design pattern works. I also suggest practicing each design pattern on your own to understand it better and apply it effectively in your code.

#### Want to Master Spring Boot and Land Your Dream Job?

Struggling with coding interviews? Learn Data Structures & Algorithms (DSA) with our expert-led course. Build strong problem-solving skills, write optimized code, and crack top tech interviews with ease

[Learn more](/courses/java-spring-boot-0-to-100/)

Java

Java Design Patterns

Singleton Pattern

Factory Pattern

Builder Pattern

Understanding Structural Design Patterns in Java
================================================

[

![Pallavi Devraye](https://miro.medium.com/v2/resize:fill:40:40/1*-M4oeRsz4xBq4aNjaGQV1w.jpeg)





](/@psdevraye?source=post_page---byline--ebd2772d351f---------------------------------------)

[Pallavi Devraye](/@psdevraye?source=post_page---byline--ebd2772d351f---------------------------------------)

Follow

15 min read

·

May 8, 2024

549

2

[

Listen









](/plans?dimension=post_audio_button&postId=ebd2772d351f&source=upgrade_membership---post_audio_button-----------------------------------------)

Share

More

Press enter or click to view image in full size

![](https://miro.medium.com/v2/resize:fit:875/1*Vyd3ASj8w6CzzppwwA22SA.jpeg)

Structural design patterns in Java play a crucial role in software development by focusing on class and object composition. They help in forming larger structures from individual parts, making the system more flexible and efficient. In this article, we’ll explore the key structural design patterns in Java, along with code examples for each.

1. Adapter design pattern
--------------------------

The Adapter Design Pattern **allows objects with incompatible interfaces to collaborate.** It acts as a bridge between two incompatible interfaces by converting the interface of one class into another interface that clients expect. This pattern is particularly useful when integrating new features or components into existing systems without modifying their source code.

### Example

Let’s consider a scenario where we have a MediaPlayer interface for playing audio files, but we want to extend its capabilities to play MP4 files as well. However, the MediaPlayer interface only supports playing MP3 files. We can use the Adapter pattern to bridge this gap.

### Implementation Steps

Before diving into the implementation, let’s outline the steps involved in creating an adapter:

1.  **Identify Incompatibilities:** Determine the interfaces of the target and adaptee classes and identify the incompatibilities between them.
2.  **Design the Adapter Interface:** Design an interface that the client expects. This interface should provide a common ground for the client and the adaptee.
3.  **Create the Adapter Class:** Implement the adapter class, which acts as a bridge between the client and the adaptee. The adapter class should implement the client’s interface and hold a reference to the adaptee.
4.  **Implement the Adapter Logic:** Implement the necessary logic inside the adapter class to convert calls from the client’s interface to the adaptee’s interface.

### Example Implementation

Let’s implement the AdapterPattern using the media player example:

Step 1: Identify Incompatibilities

*   Target Interface: MediaPlayer (supports playing MP3 files)
*   Adaptee Interface: AdvancedMediaPlayer (supports playing MP4 files)

Step 2: Design the Adapter Interface

public interface MediaPlayer {  
    void play(String fileName);  
}

Step 3: Create the Adapter Class

public class MediaAdapter implements MediaPlayer {  
    private AdvancedMediaPlayer advancedMediaPlayer;  
  
    public MediaAdapter(String audioType) {  
        if (audioType.equalsIgnoreCase("mp4")) {  
            advancedMediaPlayer = new Mp4Player();  
        }  
    }  
  
    public void play(String fileName) {  
        if (fileName.endsWith(".mp4")) {  
            advancedMediaPlayer.playMp4(fileName);  
        }  
    }  
}

Step 4: Implement the Adapter Logic

public interface AdvancedMediaPlayer {  
    void playMp4(String fileName);  
}  
  
public class Mp4Player implements AdvancedMediaPlayer {  
    public void playMp4(String fileName) {  
        System.out.println("Playing MP4 file: " + fileName);  
    }  
}

### Usage

Now, let’s see how we can use the adapter in our client code:

public class Client {  
    public static void main(String\[\] args) {  
        MediaPlayer mediaPlayer = new Mp3Player();  
        mediaPlayer.play("song.mp3"); // Plays MP3 file  
  
        mediaPlayer = new MediaAdapter("mp4");  
        mediaPlayer.play("movie.mp4"); // Plays MP4 file (via adapter)  
    }  
}

The Adapter Design Pattern allows us to integrate incompatible interfaces by providing a bridge between them. By following the pre-implementation steps and designing the adapter class accordingly, we can seamlessly extend the functionality of existing systems without modifying their source code. This pattern promotes code reusability and flexibility in software design.

2. Bridge Design Pattern
-------------------------

The Bridge Pattern **decouples an abstraction from its implementation, allowing both to vary independently.** It provides a way to separate abstraction and implementation hierarchies, making the system more flexible and easier to maintain. In this article, we’ll explore the Bridge Pattern in Java with real-life examples and step-by-step implementation.

### **Example:**

Remote Control and Devices Imagine you have a remote control that can operate various devices such as TVs, DVD players, and stereos. Each device has its own set of functionalities (e.g., power on/off, volume control, channel selection). The remote control acts as an abstraction, while the devices represent different implementations. By decoupling the abstraction (remote control) from the implementation (devices), we can easily add new devices or change existing ones without modifying the remote control code.

### Implementation Steps

Now, let’s walk through the steps involved in implementing the Bridge Pattern:

1.  **Identify Abstraction and Implementation:** Identify the abstraction and implementation hierarchies in your system. Abstraction represents the high-level functionality, while implementation represents the low-level details.
2.  **Define Abstraction and Implementation Interfaces:** Define separate interfaces for abstraction and implementation. Abstraction should delegate the implementation to the implementation interface.
3.  **Implement Abstraction and Implementations:** Implement the abstraction and implementation interfaces. Abstraction should maintain a reference to the implementation interface and delegate the calls to it.
4.  **Create Concrete Implementations:** Create concrete implementations of the implementation interface. These implementations represent different variations or types of the implementation.

### Example Implementation

Let’s implement the Bridge Pattern using the remote control and devices example:

Step 1: Identify Abstraction and Implementation

*   Abstraction: RemoteControl
*   Implementation: Device

Step 2: Define Abstraction and Implementation Interfaces

// Abstraction interface  
public interface RemoteControl {  
    void powerOn();  
    void powerOff();  
    void setChannel(int channel);  
    void volumeUp();  
    void volumeDown();  
}  
  
// Implementation interface  
public interface Device {  
    void powerOn();  
    void powerOff();  
    void setChannel(int channel);  
    void volumeUp();  
    void volumeDown();  
}

Step 3: Implement Abstraction and Implementations

// Abstraction  
public abstract class AbstractRemoteControl implements RemoteControl {  
    protected Device device;  
  
    public AbstractRemoteControl(Device device) {  
        this.device = device;  
    }  
  
    public void powerOn() {  
        device.powerOn();  
    }  
  
    public void powerOff() {  
        device.powerOff();  
    }  
  
    public void setChannel(int channel) {  
        device.setChannel(channel);  
    }  
  
    public void volumeUp() {  
        device.volumeUp();  
    }  
  
    public void volumeDown() {  
        device.volumeDown();  
    }  
}  
  
// Implementation  
public class TV implements Device {  
    // Implementations for TV  
}  
  
public class DVDPlayer implements Device {  
    // Implementations for DVD player  
}

Step 4: Create Concrete Implementations

public class SonyTV extends TV {  
    // Implementations specific to Sony TV  
}  
  
public class SamsungTV extends TV {  
    // Implementations specific to Samsung TV  
}  
  
public class PhilipsDVDPlayer extends DVDPlayer {  
    // Implementations specific to Philips DVD player  
}

### Usage

Now, let’s see how we can use the Bridge Pattern in our client code:

public class Client {  
    public static void main(String\[\] args) {  
        Device sonyTV \= new SonyTV();  
        RemoteControl remoteControl \= new ConcreteRemoteControl(sonyTV);  
  
        remoteControl.powerOn();  
        remoteControl.setChannel(5);  
        remoteControl.volumeUp();  
  
        Device philipsDVDPlayer \= new PhilipsDVDPlayer();  
        RemoteControl remoteControl2 \= new ConcreteRemoteControl(philipsDVDPlayer);  
  
        remoteControl2.powerOn();  
        remoteControl2.setChannel(3);  
        remoteControl2.volumeUp();  
    }  
}

The Bridge Pattern provides a way to separate abstraction from implementation, allowing both to vary independently. By following the implementation steps and designing abstraction and implementation hierarchies appropriately, we can achieve more flexible and maintainable software systems. In real-life scenarios, the Bridge Pattern is useful for managing complex hierarchies and handling variations in behavior or functionality.

3. Composite Design Pattern
----------------------------

The Composite Design Pattern **allows you to compose objects into tree structures to represent part-whole hierarchies.** It lets clients treat individual objects and compositions of objects uniformly. This pattern is useful when dealing with hierarchical structures where individual objects and compositions of objects need to be treated in the same way.

### **Example**:

Organization Structure Consider an organization with a hierarchical structure consisting of departments, teams, and individual employees. Each department contains sub-departments, teams, and individual employees. The Composite Pattern can be used to represent this organizational structure, where each component (department, team, employee) behaves uniformly, allowing operations to be applied recursively.

### Implementation Steps

Now, let’s walk through the steps involved in implementing the Composite Pattern:

1.  **Identify Component and Composite Classes:** Identify the component interface and composite class(es) that will represent the hierarchy.
2.  **Define Component Interface:** Define an interface for the component classes, declaring common operations that can be performed on both individual objects and compositions.
3.  **Implement Leaf and Composite Classes:** Implement leaf classes for individual objects and composite classes for compositions of objects. Both leaf and composite classes should implement the component interface.
4.  **Implement Operations Recursively:** Implement operations in the composite classes recursively, allowing them to be applied to both individual objects and compositions of objects.

### Example Implementation

Let’s implement the Composite Pattern using the organization structure example:

Step 1: Identify Component and Composite Classes

*   Component: Employee (interface)
*   Composite: Department (composite class)

Step 2: Define Component Interface

// Component interface  
public interface Employee {  
    void showDetails();  
}

Step 3: Implement Leaf and Composite Classes

// Leaf class  
public class Developer implements Employee {  
    private String name;  
  
    public Developer(String name) {  
        this.name = name;  
    }  
  
    public void showDetails() {  
        System.out.println("Developer: " + name);  
    }  
}  
  
// Composite class  
import java.util.ArrayList;  
import java.util.List;  
  
public class Department implements Employee {  
    private String name;  
    private List<Employee\> employees = new ArrayList<>();  
  
    public Department(String name) {  
        this.name = name;  
    }  
  
    public void addEmployee(Employee employee) {  
        employees.add(employee);  
    }  
  
    public void showDetails() {  
        System.out.println("Department: " + name);  
        for (Employee employee : employees) {  
            employee.showDetails();  
        }  
    }  
}

Step 4: Implement Operations Recursively

public class CompositePatternExample {  
    public static void main(String\[\] args) {  
        Employee dev1 \= new Developer("John");  
        Employee dev2 \= new Developer("Alice");  
  
        Department engineering \= new Department("Engineering");  
        engineering.addEmployee(dev1);  
        engineering.addEmployee(dev2);  
  
        Employee manager \= new Manager("Bob", engineering);  
  
        manager.showDetails();  
    }  
}

### Usage

Now, let’s see how we can use the Composite Pattern in our client code:

public class Client {  
    public static void main(String\[\] args) {  
        Employee dev1 \= new Developer("John");  
        Employee dev2 \= new Developer("Alice");  
  
        Department engineering \= new Department("Engineering");  
        engineering.addEmployee(dev1);  
        engineering.addEmployee(dev2);  
  
        Employee manager \= new Manager("Bob", engineering);  
  
        manager.showDetails();  
    }  
}

The Composite Design Pattern allows you to represent part-whole hierarchies in a unified way, treating individual objects and compositions of objects uniformly. By following the implementation steps and designing leaf and composite classes appropriately, we can create flexible and maintainable software systems. In real-life scenarios, the Composite Pattern is useful for representing hierarchical structures such as organization charts, file systems, and GUI components.

4. Decorator Design Pattern
----------------------------

The Decorator Design Pattern is a structural pattern that allows behavior to be added to individual objects dynamically, without affecting the behavior of other objects from the same class. It is used to extend the functionality of objects in a flexible and reusable way by wrapping them with additional functionality at runtime. In this article, we’ll explore the Decorator Pattern in Java with a real-world example and step-by-step implementation.

### **Example**:

Coffee Ordering System Imagine you have a coffee ordering system where customers can order various types of coffee. Each coffee can have additional condiments such as milk, sugar, or whipped cream. The Decorator Pattern can be used to add these condiments dynamically to a base coffee object without modifying its class.

### Implementation Steps

Now, let’s walk through the steps involved in implementing the Decorator Pattern:

1.  **Identify Component and Decorator Classes:** Identify the component interface and decorator classes that will extend its functionality.
2.  **Define Component Interface:** Define an interface for the component class, declaring the base operation(s) that all concrete components must implement.
3.  **Implement Concrete Component:** Implement a concrete component class that represents the base object to which additional functionality will be added.
4.  **Implement Decorator Classes:** Implement decorator classes that extend the functionality of the concrete component by adding additional behavior.
5.  **Use Decorators Dynamically:** Use decorators to wrap concrete components dynamically at runtime, adding or removing functionality as needed.

### Example Implementation

Let’s implement the Decorator Pattern using the coffee ordering system example:

[](/download-app?source=promotion_paragraph---post_body_banner_surround_scribble--ebd2772d351f---------------------------------------)

Step 1: Identify Component and Decorator Classes

*   Component: Coffee (interface)
*   Decorators: MilkDecorator, SugarDecorator, WhippedCreamDecorator

Step 2: Define Component Interface

// Component interface  
public interface Coffee {  
    double cost();  
    String getDescription();  
}

Step 3: Implement Concrete Component

// Concrete component  
public class SimpleCoffee implements Coffee {  
    public double cost() {  
        return 2.0; // Base cost of simple coffee  
    }  
  
    public String getDescription() {  
        return "Simple coffee";  
    }  
}

Step 4: Implement Decorator Classes

// Decorator classes  
public class MilkDecorator implements Coffee {  
    private Coffee coffee;  
  
    public MilkDecorator(Coffee coffee) {  
        this.coffee = coffee;  
    }  
  
    public double cost() {  
        return coffee.cost() + 0.5; // Additional cost for milk  
    }  
  
    public String getDescription() {  
        return coffee.getDescription() + ", Milk";  
    }  
}  
  
public class SugarDecorator implements Coffee {  
    private Coffee coffee;  
  
    public SugarDecorator(Coffee coffee) {  
        this.coffee = coffee;  
    }  
  
    public double cost() {  
        return coffee.cost() + 0.2; // Additional cost for sugar  
    }  
  
    public String getDescription() {  
        return coffee.getDescription() + ", Sugar";  
    }  
}  
  
public class WhippedCreamDecorator implements Coffee {  
    private Coffee coffee;  
  
    public WhippedCreamDecorator(Coffee coffee) {  
        this.coffee = coffee;  
    }  
  
    public double cost() {  
        return coffee.cost() + 0.7; // Additional cost for whipped cream  
    }  
  
    public String getDescription() {  
        return coffee.getDescription() + ", Whipped Cream";  
    }  
}

### Usage

Now, let’s see how we can use the Decorator Pattern in our client code:

public class Client {  
    public static void main(String\[\] args) {  
        Coffee simpleCoffee = new SimpleCoffee();  
        System.out.println("Cost: $" + simpleCoffee.cost() + ", Description: " + simpleCoffee.getDescription());  
  
        Coffee coffeeWithMilkAndSugar = new MilkDecorator(new SugarDecorator(new SimpleCoffee()));  
        System.out.println("Cost: $" + coffeeWithMilkAndSugar.cost() + ", Description: " + coffeeWithMilkAndSugar.getDescription());  
  
        Coffee coffeeWithWhippedCream = new WhippedCreamDecorator(new SimpleCoffee());  
        System.out.println("Cost: $" + coffeeWithWhippedCream.cost() + ", Description: " + coffeeWithWhippedCream.getDescription());  
    }  
}

The Decorator Design Pattern allows you to add behavior to objects dynamically, without modifying their class. By following the implementation steps and designing decorator classes appropriately, we can extend the functionality of objects in a flexible and reusable way. In real-world scenarios, the Decorator Pattern is useful for adding optional features or enhancements to objects, such as adding condiments to food items, customizing GUI components, or adding filters to streams.

5. Facade Design Pattern
-------------------------

The Facade Design Pattern **provides a simplified interface to a set of interfaces in a subsystem.** It hides the complexity of the subsystem and provides a unified interface to interact with it. This pattern promotes loose coupling between clients and the subsystem, making the system easier to use and maintain. In this article, we’ll explore the Facade Pattern in Java with real-world examples and step-by-step implementation.

### **Example**:

Home Theater System Imagine you have a complex home theater system consisting of multiple devices such as a DVD player, a television, a sound system, and more. Controlling each device individually can be cumbersome. The Facade Pattern can be used to create a simplified interface, such as a remote control, that hides the complexity of interacting with each device separately.

### Pre-Implementation Steps

Before diving into the implementation, let’s outline the steps involved in creating a facade:

1.  **Identify Complex Subsystem:** Identify the complex subsystem that needs to be simplified for clients.
2.  **Design Facade Interface:** Design an interface that provides a simplified view of the subsystem, hiding its complexity.
3.  **Implement Facade Class:** Implement a facade class that encapsulates the interactions with the subsystem, providing methods to perform common tasks.
4.  **Use Facade in Client Code:** Use the facade interface in client code to interact with the subsystem, hiding its complexity.

### Example Implementation

Let’s implement the Facade Pattern using the home theater system example:

Step 1: Identify Complex Subsystem

*   Subsystem: HomeTheater (consisting of DVDPlayer, Television, SoundSystem, etc.)

Step 2: Design Facade Interface

// Facade interface  
public interface HomeTheaterFacade {  
    void watchMovie(String movie);  
    void endMovie();  
    void listenToMusic();  
    void stopMusic();  
}

Step 3: Implement Facade Class

// Facade class  
public class HomeTheaterFacadeImpl implements HomeTheaterFacade {  
    private DVDPlayer dvdPlayer;  
    private Television television;  
    private SoundSystem soundSystem;  
  
    public HomeTheaterFacadeImpl(DVDPlayer dvdPlayer, Television television, SoundSystem soundSystem) {  
        this.dvdPlayer = dvdPlayer;  
        this.television = television;  
        this.soundSystem = soundSystem;  
    }  
  
    public void watchMovie(String movie) {  
        dvdPlayer.turnOn();  
        dvdPlayer.play(movie);  
        television.turnOn();  
        television.setInput("DVD");  
        soundSystem.turnOn();  
        soundSystem.setVolume(10);  
    }  
  
    public void endMovie() {  
        dvdPlayer.stop();  
        dvdPlayer.turnOff();  
        television.turnOff();  
        soundSystem.turnOff();  
    }  
  
    public void listenToMusic() {  
        soundSystem.turnOn();  
        soundSystem.setVolume(20);  
    }  
  
    public void stopMusic() {  
        soundSystem.turnOff();  
    }  
}

### Usage

Now, let’s see how we can use the Facade Pattern in our client code:

public class Client {  
    public static void main(String\[\] args) {  
        DVDPlayer dvdPlayer \= new DVDPlayer();  
        Television television \= new Television();  
        SoundSystem soundSystem \= new SoundSystem();  
  
        HomeTheaterFacade facade \= new HomeTheaterFacadeImpl(dvdPlayer, television, soundSystem);  
  
        facade.watchMovie("Inception");  
        // Watching movie...  
  
        facade.endMovie();  
        // Movie ended...  
  
        facade.listenToMusic();  
        // Listening to music...  
  
        facade.stopMusic();  
        // Music stopped...  
    }  
}

The Facade Design Pattern provides a simplified interface to a complex subsystem, making it easier to use and maintain. By encapsulating the interactions with the subsystem behind a facade, clients can interact with it without being exposed to its complexity. In real-world scenarios, the Facade Pattern is useful for simplifying interactions with complex systems such as APIs, frameworks, or libraries.

**6. Flyweight Design Pattern**
--------------------------------

The Flyweight Design Pattern **aims to minimize memory usage and improve performance by sharing object instances across multiple contexts.** It achieves this by splitting the object state into intrinsic (shared) and extrinsic (context-dependent) parts. This pattern is particularly useful when dealing with a large number of similar objects that can share common state. In this article, we’ll delve into the Flyweight Pattern in Java with examples and step-by-step implementation.

**Example**: Text Editor Imagine you are developing a text editor application where users can create and edit documents. Each document may contain a large number of characters, and managing memory usage efficiently is crucial for performance. The Flyweight Pattern can be used to represent characters in the document, with shared instances for common characters such as letters, digits, and punctuation marks.

### Implementation Steps

Now, let’s walk through the steps involved in implementing the Flyweight Pattern:

1.  **Identify Common and Context-Dependent State:** Identify the object state that can be shared (intrinsic state) and the state that varies across different contexts (extrinsic state).
2.  **Design Flyweight Interface:** Design an interface that declares methods to set and get the extrinsic state of the flyweight objects.
3.  **Implement Flyweight Class:** Implement a flyweight class that represents the shared (intrinsic) state and provides methods to manipulate the extrinsic state.
4.  **Create Factory for Flyweight Objects:** Implement a factory class to create and manage flyweight objects, ensuring that shared instances are reused when possible.

### Example Implementation

Let’s implement the Flyweight Pattern using the text editor example:

Step 1: Identify Common and Context-Dependent State

*   Common State: Character (e.g., ‘A’, ‘B’, ‘C’)
*   Context-Dependent State: Position (x, y) in the document

Step 2: Design Flyweight Interface

// Flyweight interface  
public interface Character {  
    void display(int positionX, int positionY);  
}

Step 3: Implement Flyweight Class

// Concrete flyweight class  
public class ConcreteCharacter implements Character {  
    private char character;  
  
    public ConcreteCharacter(char character) {  
        this.character = character;  
    }  
  
    public void display(int positionX, int positionY) {  
        System.out.println("Character " + character + " displayed at position (" + positionX + ", " + positionY + ")");  
    }  
}

Step 4: Create Factory for Flyweight Objects

// Flyweight factory  
import java.util.HashMap;  
import java.util.Map;  
  
public class CharacterFactory {  
    private Map<Character, Character> characterMap = new HashMap<>();  
  
    public Character getCharacter(char key) {  
        if (!characterMap.containsKey(key)) {  
            characterMap.put(key, new ConcreteCharacter(key));  
        }  
        return characterMap.get(key);  
    }  
}

### Usage

Now, let’s see how we can use the Flyweight Pattern in our client code:

public class Client {  
    public static void main(String\[\] args) {  
        CharacterFactory characterFactory \= new CharacterFactory();  
  
        Character characterA \= characterFactory.getCharacter('A');  
        characterA.display(10, 20);  
  
        Character characterB \= characterFactory.getCharacter('B');  
        characterB.display(30, 40);  
  
        Character characterA2 \= characterFactory.getCharacter('A');  
        characterA2.display(50, 60);  
  
        // Output:  
        // Character A displayed at position (10, 20)  
        // Character B displayed at position (30, 40)  
        // Character A displayed at position (50, 60)  
    }  
}

The Flyweight Design Pattern allows for efficient memory usage and improved performance by sharing common state across multiple objects. By separating intrinsic and extrinsic state and reusing shared instances, this pattern reduces memory footprint and enhances scalability. In real-world scenarios, the Flyweight Pattern is useful for optimizing applications that deal with a large number of similar objects, such as text processing, graphical user interfaces, and gaming environments.

7. Proxy Design Pattern
------------------------

The Proxy Design Pattern **provides a surrogate or placeholder for another object to control access to it**. It allows you to create a representative object that can act as a substitute for the real object. This pattern is useful for implementing lazy initialization, access control, logging, monitoring, and more. In this article, we’ll delve into the Proxy Pattern in Java with examples and step-by-step implementation.

**Example**: Internet Access Control Imagine you are working in an organization where internet access needs to be controlled based on user privileges. A Proxy Pattern can be used to create a proxy object that checks the user’s privileges before granting access to certain websites. This proxy object acts as a surrogate for the real internet connection object and controls access to it.

### Implementation Steps

Now, let’s walk through the steps involved in implementing the Proxy Pattern:

1.  **Identify Real Subject and Proxy Classes:** Identify the real subject (object) and the proxy class that will act as a surrogate for the real subject.
2.  **Design Proxy Interface:** Design an interface that declares methods to perform operations on the real subject.
3.  **Implement Real Subject Class:** Implement the real subject class that contains the actual business logic or functionality.
4.  **Implement Proxy Class:** Implement the proxy class that wraps the real subject and controls access to it by intercepting requests.

### Example Implementation

Let’s implement the Proxy Pattern using the internet access control example:

Step 1: Identify Real Subject and Proxy Classes

*   Real Subject: InternetConnection (interface)
*   Proxy: InternetProxy (class)

Step 2: Design Proxy Interface

// Proxy interface  
public interface InternetConnection {  
    void connect(String website);  
}

Step 3: Implement Real Subject Class

// Real subject class  
public class RealInternetConnection implements InternetConnection {  
    public void connect(String website) {  
        System.out.println("Connecting to website: " + website);  
    }  
}

Step 4: Implement Proxy Class

// Proxy class  
public class InternetProxy implements InternetConnection {  
    private RealInternetConnection realInternetConnection;  
    private Set<String> allowedWebsites;  
  
    public InternetProxy() {  
        realInternetConnection = new RealInternetConnection();  
        allowedWebsites = new HashSet<>();  
        allowedWebsites.add("example.com");  
        allowedWebsites.add("google.com");  
    }  
  
    public void connect(String website) {  
        if (allowedWebsites.contains(website)) {  
            realInternetConnection.connect(website);  
        } else {  
            System.out.println("Access to website " + website + " is not allowed.");  
        }  
    }  
}

### Usage

Now, let’s see how we can use the Proxy Pattern in our client code:

public class Client {  
    public static void main(String\[\] args) {  
        InternetConnection internetConnection = new InternetProxy();  
  
        internetConnection.connect("example.com"); // Allowed  
        internetConnection.connect("google.com"); // Allowed  
        internetConnection.connect("facebook.com"); // Not allowed  
    }  
}

The Proxy Design Pattern provides a surrogate or placeholder for another object to control access to it. By separating the proxy from the real subject, this pattern enables additional functionality such as access control, logging, and monitoring. In real-world scenarios, the Proxy Pattern is useful for implementing lazy initialization, remote access, caching, and more.

**Conclusion:**
---------------

structural design patterns in Java are powerful tools that enable developers to create flexible, maintainable, and scalable software architectures. These patterns focus on organizing classes and objects in a way that promotes reusability, enhances flexibility, and simplifies complex systems. By encapsulating common design structures and principles, structural patterns provide clear guidelines and best practices for designing robust software solutions.

Throughout this exploration of structural design patterns, we’ve seen how patterns like the Adapter, Bridge, Composite, Decorator, Facade, and Proxy can address various design challenges and improve the overall quality of software systems. Whether it’s integrating disparate interfaces, managing hierarchical structures, extending object functionality, simplifying complex subsystems, controlling access to objects, or optimizing performance, structural patterns offer practical solutions that can be applied to a wide range of real-world scenarios.

As developers, understanding and applying structural design patterns empowers us to design more elegant, efficient, and maintainable Java applications. By leveraging these patterns effectively, we can create software architectures that are not only resilient to change but also adaptable to evolving requirements and scalable for future growth.

In essence, structural design patterns serve as a blueprint for building software systems that are not only functional but also well-organized, extensible, and easy to maintain. They represent best practices distilled from years of collective experience in software engineering, offering valuable insights into how to design software systems that stand the test of time. With a solid understanding of structural design patterns and their applications, developers can elevate the quality and craftsmanship of their Java projects, ultimately delivering better outcomes for users and stakeholders alike.

Understanding Behavioral Design Patterns in Java
================================================

[

![Pallavi Devraye](https://miro.medium.com/v2/resize:fill:40:40/1*-M4oeRsz4xBq4aNjaGQV1w.jpeg)





](/@psdevraye?source=post_page---byline--7551731091fd---------------------------------------)

[Pallavi Devraye](/@psdevraye?source=post_page---byline--7551731091fd---------------------------------------)

Follow

12 min read

·

May 6, 2024

607

3

[

Listen









](/plans?dimension=post_audio_button&postId=7551731091fd&source=upgrade_membership---post_audio_button-----------------------------------------)

Share

More

Press enter or click to view image in full size

![](https://miro.medium.com/v2/resize:fit:875/0*zk07YOmfe6Dn9ntt)

Photo by [Fotis Fotopoulos](https://unsplash.com/@ffstop?utm_source=medium&utm_medium=referral) on [Unsplash](https://unsplash.com/?utm_source=medium&utm_medium=referral)

Behavioral design patterns in Java are a category of design patterns that address **how objects communicate and interact with each other**. They focus on defining algorithms and assignment of responsibilities between objects in a system. These patterns emphasize the delegation of behaviors between objects and aim to improve the flexibility and maintainability of the codebase. In this article, we’ll learn type of behavioral design patterns in Java, along with examples for each type.

1. Observer Pattern
--------------------

The Observer pattern defines **a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.** This pattern is widely used in event handling systems. This allows for a loosely coupled design where subjects (observed objects) and observers (dependent objects) can interact without having explicit knowledge of each other.

Let’s consider a real-time example of a stock market monitoring system to understand the Observer pattern in action. In this scenario:

*   **Subject (Observable):** The stock market is the subject. It maintains a list of observers (investors) interested in receiving updates about stock prices.
*   **Observer (Subscriber):** Investors who want to receive updates about specific stocks are the observers. They subscribe to receive notifications about price changes.

Implementation Steps
--------------------

Now, let’s walk through the steps to implement the Observer pattern for the stock market monitoring system in Java:

### Step 1: Define the Subject Interface

import java.util.List;  
  
interface Subject {  
    void registerObserver(Observer observer);  
    void removeObserver(Observer observer);  
    void notifyObservers();  
}

### Step 2: Implement the Subject

import java.util.ArrayList;  
import java.util.List;  
  
class StockMarket implements Subject {  
    private List<Observer> observers = new ArrayList<>();  
    private String stockName;  
    private double price;  
  
    public void setStockData(String stockName, double price) {  
        this.stockName = stockName;  
        this.price = price;  
        notifyObservers();  
    }  
  
    @Override  
    public void registerObserver(Observer observer) {  
        observers.add(observer);  
    }  
  
    @Override  
    public void removeObserver(Observer observer) {  
        observers.remove(observer);  
    }  
  
    @Override  
    public void notifyObservers() {  
        for (Observer observer : observers) {  
            observer.update(stockName, price);  
        }  
    }  
}

### Step 3: Define the Observer Interface

interface Observer {  
    void update(String stockName, double price);  
}

### Step 4: Implement the Observer

class Investor implements Observer {  
    private String name;  
  
    public Investor(String name) {  
        this.name = name;  
    }  
  
    @Override  
    public void update(String stockName, double price) {  
        System.out.println(name + " received update: " + stockName + " price is now $" + price);  
    }  
}

### Step 5: Test the Implementation

public class Main {  
    public static void main(String\[\] args) {  
        StockMarket stockMarket \= new StockMarket();  
  
        // Create observers (investors)  
        Investor investor1 \= new Investor("John");  
        Investor investor2 \= new Investor("Alice");  
  
        // Register observers  
        stockMarket.registerObserver(investor1);  
        stockMarket.registerObserver(investor2);  
  
        // Set stock data (trigger notification)  
        stockMarket.setStockData("ABC", 100.0);  
    }  
}

By implementing the Observer pattern, we achieved a loosely coupled design where the stock market (subject) notifies its investors (observers) about changes in stock prices. This pattern promotes flexibility and extensibility by allowing new observers to be added without modifying existing code, making it a valuable tool for building reactive and scalable systems.

2. Strategy Design Pattern
---------------------------

The Strategy design pattern **allows an algorithm’s behavior to be selected at runtime.** It defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern enables the algorithm to vary independently of the clients that use it, promoting flexibility and ease of maintenance.

Let’s consider a real-time example of a payment processing system to understand the Strategy pattern in action. In this scenario:

*   **Context:** The payment processing system acts as the context. It interacts with different payment gateways to process payments.
*   **Strategy:** Each payment gateway (e.g., PayPal, Stripe, Square) represents a strategy. Each strategy encapsulates the algorithm for processing payments.

Implementation Steps
--------------------

Now, let’s walk through the steps to implement the Strategy pattern for the payment processing system in Java:

### Step 1: Define the PaymentStrategy Interface

interface PaymentStrategy {  
    void processPayment(double amount);  
}

### Step 2: Implement Concrete Payment Strategies

class PayPalStrategy implements PaymentStrategy {  
    private String email;  
    private String password;  
  
    public PayPalStrategy(String email, String password) {  
        this.email = email;  
        this.password = password;  
    }  
  
    @Override  
    public void processPayment(double amount) {  
        // Process payment using PayPal API  
        System.out.println("Payment processed via PayPal: $" + amount);  
    }  
}  
  
class StripeStrategy implements PaymentStrategy {  
    private String apiKey;  
  
    public StripeStrategy(String apiKey) {  
        this.apiKey = apiKey;  
    }  
  
    @Override  
    public void processPayment(double amount) {  
        // Process payment using Stripe API  
        System.out.println("Payment processed via Stripe: $" + amount);  
    }  
}

### Step 3: Define the PaymentContext

class PaymentContext {  
    private PaymentStrategy paymentStrategy;  
  
    public PaymentContext(PaymentStrategy paymentStrategy) {  
        this.paymentStrategy = paymentStrategy;  
    }  
  
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {  
        this.paymentStrategy = paymentStrategy;  
    }  
  
    public void processPayment(double amount) {  
        paymentStrategy.processPayment(amount);  
    }  
}

### Step 4: Test the Implementation

public class Main {  
    public static void main(String\[\] args) {  
        // Create payment context with PayPal strategy  
        PaymentStrategy paypalStrategy \= new PayPalStrategy("paypal@example.com", "password");  
        PaymentContext paymentContext \= new PaymentContext(paypalStrategy);  
  
        // Process payment using PayPal  
        paymentContext.processPayment(100.0);  
  
        // Switch to Stripe strategy  
        PaymentStrategy stripeStrategy \= new StripeStrategy("stripe-api-key");  
        paymentContext.setPaymentStrategy(stripeStrategy);  
  
        // Process payment using Stripe  
        paymentContext.processPayment(150.0);  
    }  
}

By implementing the Strategy pattern, we achieved a flexible and extensible solution where the payment processing algorithm can be dynamically selected at runtime. This pattern promotes code reuse, maintainability, and scalability by encapsulating algorithms into interchangeable components. Understanding and applying the Strategy pattern can greatly enhance the design and architecture of software systems, especially those with varying requirements for algorithmic behavior.

3. Chain of Responsibility Pattern
-----------------------------------

The Chain of Responsibility pattern **allows an object to pass a request along a chain of handlers.** Each handler in the chain decides either to process the request or to pass it to the next handler in the chain. This pattern decouples senders and receivers of requests, giving multiple objects the opportunity to handle the request.

Let’s consider a real-time example of an employee leave approval system to understand the Chain of Responsibility pattern in action. In this scenario:

*   **Request:** Employee leave requests are initiated by employees and need to be approved by different levels of management: team leads, managers, and department heads.
*   **Handlers:** Each level of management represents a handler in the chain. If a handler can’t approve the leave request, it passes the request to the next higher level in the management hierarchy.

Implementation Steps
--------------------

Now, let’s walk through the steps to implement the Chain of Responsibility pattern for the employee leave approval system in Java:

### Step 1: Define the Request Class

class LeaveRequest {  
    private String employeeName;  
    private int days;  
  
    public LeaveRequest(String employeeName, int days) {  
        this.employeeName = employeeName;  
        this.days = days;  
    }  
  
    public String getEmployeeName() {  
        return employeeName;  
    }  
  
    public int getDays() {  
        return days;  
    }  
}

### Step 2: Define the Handler Interface

interface LeaveApprover {  
    void approveLeave(LeaveRequest leaveRequest);  
}

### Step 3: Implement Concrete Handlers

class TeamLead implements LeaveApprover {  
    private static final int MAX\_LEAVES\_ALLOWED \= 2;  
  
    private LeaveApprover nextApprover;  
  
    public void setNextApprover(LeaveApprover nextApprover) {  
        this.nextApprover = nextApprover;  
    }  
  
    @Override  
    public void approveLeave(LeaveRequest leaveRequest) {  
        if (leaveRequest.getDays() <= MAX\_LEAVES\_ALLOWED) {  
            System.out.println("Leave approved by Team Lead for " + leaveRequest.getEmployeeName());  
        } else if (nextApprover != null) {  
            nextApprover.approveLeave(leaveRequest);  
        }  
    }  
}  
  
class Manager implements LeaveApprover {  
    private static final int MAX\_LEAVES\_ALLOWED \= 5;  
  
    private LeaveApprover nextApprover;  
  
    public void setNextApprover(LeaveApprover nextApprover) {  
        this.nextApprover = nextApprover;  
    }  
  
    @Override  
    public void approveLeave(LeaveRequest leaveRequest) {  
        if (leaveRequest.getDays() <= MAX\_LEAVES\_ALLOWED) {  
            System.out.println("Leave approved by Manager for " + leaveRequest.getEmployeeName());  
        } else if (nextApprover != null) {  
            nextApprover.approveLeave(leaveRequest);  
        }  
    }  
}  
  
class DepartmentHead implements LeaveApprover {  
    private static final int MAX\_LEAVES\_ALLOWED \= 10;  
  
    @Override  
    public void approveLeave(LeaveRequest leaveRequest) {  
        if (leaveRequest.getDays() <= MAX\_LEAVES\_ALLOWED) {  
            System.out.println("Leave approved by Department Head for " + leaveRequest.getEmployeeName());  
        } else {  
            System.out.println("Leave denied for " + leaveRequest.getEmployeeName());  
        }  
    }  
}

### Step 4: Construct the Chain

public class ChainOfResponsibilityExample {  
    public static void main(String\[\] args) {  
        // Construct the chain  
        TeamLead teamLead \= new TeamLead();  
        Manager manager \= new Manager();  
        DepartmentHead departmentHead \= new DepartmentHead();  
  
        teamLead.setNextApprover(manager);  
        manager.setNextApprover(departmentHead);  
  
        // Create and process leave requests  
        LeaveRequest request1 \= new LeaveRequest("John", 3);  
        LeaveRequest request2 \= new LeaveRequest("Alice", 7);  
        LeaveRequest request3 \= new LeaveRequest("Bob", 12);  
  
        teamLead.approveLeave(request1);  
        teamLead.approveLeave(request2);  
        teamLead.approveLeave(request3);  
    }  
}

By implementing the Chain of Responsibility pattern, we achieved a flexible and decoupled solution where multiple handlers can process a request in a sequential manner. This pattern promotes scalability and maintainability by allowing new handlers to be added or existing ones to be modified without affecting the client code. Understanding and applying the Chain of Responsibility pattern can greatly enhance the design and architecture of software systems, especially those with complex request handling workflows.

4. Command Pattern
-------------------

The Command pattern **encapsulates a request as an object, thereby allowing parameterization of clients with queues, requests, and operations.** It decouples the sender of a request from its receiver, enabling the requester to send a command without knowing anything about the operation that will be performed.

[](/download-app?source=promotion_paragraph---post_body_banner_better_screentime--7551731091fd---------------------------------------)

Let’s consider a real-time example of a remote control for electronic devices to understand the Command pattern in action. In this scenario:

*   **Command:** Each button on the remote control represents a command (e.g., turn on, turn off, increase volume, decrease volume).
*   **Receiver:** The electronic devices (e.g., TV, stereo system) are the receivers of the commands. They perform the requested operations.

Implementation Steps
--------------------

Now, let’s walk through the steps to implement the Command pattern for the remote control system in Java:

### Step 1: Define the Command Interface

interface Command {  
    void execute();  
}

### Step 2: Implement Concrete Commands

class TurnOnCommand implements Command {  
    private ElectronicDevice device;  
  
    public TurnOnCommand(ElectronicDevice device) {  
        this.device = device;  
    }  
  
    @Override  
    public void execute() {  
        device.turnOn();  
    }  
}  
  
class TurnOffCommand implements Command {  
    private ElectronicDevice device;  
  
    public TurnOffCommand(ElectronicDevice device) {  
        this.device = device;  
    }  
  
    @Override  
    public void execute() {  
        device.turnOff();  
    }  
}  
  
// Additional commands (e.g., IncreaseVolumeCommand, DecreaseVolumeCommand) can be implemented similarly.

### Step 3: Define the Receiver

class ElectronicDevice {  
    private String name;  
  
    public ElectronicDevice(String name) {  
        this.name = name;  
    }  
  
    public void turnOn() {  
        System.out.println(name + " is turned on.");  
    }  
  
    public void turnOff() {  
        System.out.println(name + " is turned off.");  
    }  
}

### Step 4: Create the Invoker (Remote Control)

class RemoteControl {  
    private Command command;  
  
    public void setCommand(Command command) {  
        this.command = command;  
    }  
  
    public void pressButton() {  
        command.execute();  
    }  
}

### Step 5: Test the Implementation

public class Main {  
    public static void main(String\[\] args) {  
        ElectronicDevice tv \= new ElectronicDevice("TV");  
        TurnOnCommand turnOnCommand \= new TurnOnCommand(tv);  
        TurnOffCommand turnOffCommand \= new TurnOffCommand(tv);  
  
        RemoteControl remoteControl \= new RemoteControl();  
  
        // Set and press the turn on button  
        remoteControl.setCommand(turnOnCommand);  
        remoteControl.pressButton();  
  
        // Set and press the turn off button  
        remoteControl.setCommand(turnOffCommand);  
        remoteControl.pressButton();  
    }  
}

By implementing the Command pattern, we achieved a flexible and decoupled solution where the requester (remote control) sends a command to the receiver (electronic device) without knowing the specific operation that will be performed. This pattern promotes extensibility and scalability by allowing new commands to be added easily without modifying existing client code. Understanding and applying the Command pattern can greatly enhance the design and architecture of software systems, especially those with complex command execution workflows.

5. Iterator Pattern
--------------------

The Iterator pattern **provides a way to access the elements of a collection sequentially without exposing its underlying representation.** It allows for traversal of elements in a collection without exposing the underlying data structure, thus promoting encapsulation and decoupling between the collection and the client code.

Let’s consider a real-time example of a music playlist management system to understand the Iterator pattern in action. In this scenario:

*   **Collection:** The music playlist represents a collection of songs.
*   **Iterator:** The iterator provides a way to traverse through the songs in the playlist without exposing the playlist’s internal structure.

Implementation Steps
--------------------

Now, let’s walk through the steps to implement the Iterator pattern for the music playlist management system in Java:

### Step 1: Define the Iterator Interface

interface Iterator {  
    boolean hasNext();  
    Object next();  
}

### Step 2: Implement Concrete Iterator

class SongIterator implements Iterator {  
    private String\[\] songs;  
    private int position = 0;  
  
    public SongIterator(String\[\] songs) {  
        this.songs = songs;  
    }  
  
    @Override  
    public boolean hasNext() {  
        return position < songs.length && songs\[position\] != null;  
    }  
  
    @Override  
    public Object next() {  
        String song = songs\[position\];  
        position++;  
        return song;  
    }  
}

### Step 3: Define the Aggregate Interface

interface Playlist {  
    Iterator createIterator();  
}

### Step 4: Implement Concrete Aggregate

class MusicPlaylist implements Playlist {  
    private String\[\] songs;  
  
    public MusicPlaylist(String\[\] songs) {  
        this.songs = songs;  
    }  
  
    @Override  
    public Iterator createIterator() {  
        return new SongIterator(songs);  
    }  
}

### Step 5: Test the Implementation

public class Main {  
    public static void main(String\[\] args) {  
        String\[\] songs = {"Song 1", "Song 2", "Song 3", "Song 4", "Song 5"};  
        Playlist playlist = new MusicPlaylist(songs);  
        Iterator iterator = playlist.createIterator();  
  
        System.out.println("Playlist Songs:");  
        while (iterator.hasNext()) {  
            System.out.println(iterator.next());  
        }  
    }  
}

By implementing the Iterator pattern, we achieved a flexible and decoupled solution where the client code can traverse through the collection of songs without knowing the internal representation of the playlist. This pattern promotes encapsulation and abstraction, allowing for seamless iteration over different types of collections. Understanding and applying the Iterator pattern can greatly enhance the design and usability of software systems dealing with collections and aggregates.

6. Memento Pattern
-------------------

The Memento pattern **allows the capture and externalization of an object’s internal state so that it can be restored later without violating encapsulation.** It is useful when implementing features like undo mechanisms or restoring objects to a previous state.

Let’s consider a real-time example of a text editor with an undo mechanism to understand the Memento pattern in action. In this scenario:

*   **Originator:** The text editor represents the originator. It has an internal state (text content) that can be modified.
*   **Memento:** The memento object captures the state of the text editor at a specific point in time.
*   **Caretaker:** The caretaker manages the mementos and is responsible for saving and restoring the state of the text editor.

Implementation Steps
--------------------

Now, let’s walk through the steps to implement the Memento pattern for the text editor undo mechanism in Java:

### Step 1: Define the Memento

class TextEditorMemento {  
    private String text;  
  
    public TextEditorMemento(String text) {  
        this.text = text;  
    }  
  
    public String getText() {  
        return text;  
    }  
}

### Step 2: Define the Originator

class TextEditor {  
    private String text;  
  
    public void setText(String text) {  
        this.text = text;  
    }  
  
    public TextEditorMemento save() {  
        return new TextEditorMemento(text);  
    }  
  
    public void restore(TextEditorMemento memento) {  
        this.text = memento.getText();  
    }  
  
    public void printText() {  
        System.out.println("Current Text: " + text);  
    }  
}

### Step 3: Define the Caretaker

import java.util.Stack;  
  
class TextEditorHistory {  
    private Stack<TextEditorMemento> history = new Stack<>();  
  
    public void save(TextEditorMemento memento) {  
        history.push(memento);  
    }  
  
    public TextEditorMemento undo() {  
        if (!history.isEmpty()) {  
            return history.pop();  
        }  
        return null;  
    }  
}

### Step 4: Test the Implementation

public class Main {  
    public static void main(String\[\] args) {  
        TextEditor textEditor \= new TextEditor();  
        TextEditorHistory history \= new TextEditorHistory();  
  
        // Set initial text  
        textEditor.setText("Hello World!");  
        textEditor.printText();  
  
        // Save state and modify text  
        history.save(textEditor.save());  
        textEditor.setText("Updated Text");  
        textEditor.printText();  
  
        // Undo and restore previous state  
        TextEditorMemento memento \= history.undo();  
        if (memento != null) {  
            textEditor.restore(memento);  
        }  
        textEditor.printText();  
    }  
}

By implementing the Memento pattern, we achieved a solution that allows capturing and restoring the state of the text editor without exposing its internal details. This pattern promotes encapsulation and provides a convenient way to implement features like undo functionalities. Understanding and applying the Memento pattern can greatly enhance the design and usability of software systems requiring state management and history tracking.

7. Template Method
-------------------

The Template Method pattern **defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.** It enables code reuse and promotes consistent behavior across subclasses while allowing for customization of certain steps.

Let’s consider a real-time example of a beverage brewing process to understand the Template Method pattern in action. In this scenario:

*   **Abstract Class:** The beverage class represents an abstract class defining the template method for brewing a beverage.
*   **Concrete Classes:** Subclasses like Coffee and Tea extend the abstract class and provide implementations for specific steps of the brewing process.

Implementation Steps
--------------------

Now, let’s walk through the steps to implement the Template Method pattern for the beverage brewing process in Java:

### Step 1: Define the Abstract Class

abstract class Beverage {  
    // Template method defining the brewing process  
    public final void brew() {  
        boilWater();  
        addIngredients();  
        pourInCup();  
        if (customerWantsCondiments()) {  
            addCondiments();  
        }  
    }  
  
    // Abstract methods to be implemented by subclasses  
    protected abstract void addIngredients();  
    protected abstract void addCondiments();  
  
    // Concrete methods  
    protected void boilWater() {  
        System.out.println("Boiling water");  
    }  
  
    protected void pourInCup() {  
        System.out.println("Pouring into cup");  
    }  
  
    // Hook method (optional override)  
    protected boolean customerWantsCondiments() {  
        return true;  
    }  
}

### Step 2: Implement Concrete Classes

class Coffee extends Beverage {  
    @Override  
    protected void addIngredients() {  
        System.out.println("Adding coffee grounds");  
    }  
  
    @Override  
    protected void addCondiments() {  
        System.out.println("Adding sugar and milk");  
    }  
  
    @Override  
    protected boolean customerWantsCondiments() {  
        // Override hook method to ask user for condiments preference  
        // Return true for coffee by default  
        return true;  
    }  
}  
  
class Tea extends Beverage {  
    @Override  
    protected void addIngredients() {  
        System.out.println("Adding tea leaves");  
    }  
  
    @Override  
    protected void addCondiments() {  
        System.out.println("Adding lemon");  
    }  
}

### Step 3: Test the Implementation

public class Main {  
    public static void main(String\[\] args) {  
        Beverage coffee = new Coffee();  
        Beverage tea = new Tea();  
  
        System.out.println("Making Coffee:");  
        coffee.brew();  
  
        System.out.println("\\nMaking Tea:");  
        tea.brew();  
    }  
}

By implementing the Template Method pattern, we achieved a solution where the overall algorithm for brewing a beverage is defined in the superclass, while specific steps can be customized by subclasses. This pattern promotes code reuse and consistency across subclasses while allowing for flexibility and customization where needed. Understanding and applying the Template Method pattern can greatly enhance the design and maintainability of software systems with common algorithmic structures.

Conclusion
----------

Behavioral design patterns provide powerful solutions for managing interactions and responsibilities between objects in a software system. By focusing on how objects communicate and collaborate, these patterns enable developers to achieve flexibility, maintainability, and scalability in their designs.

Patterns like the Observer pattern facilitate efficient communication between objects by establishing one-to-many dependencies, ensuring that changes in one object are automatically reflected in others. The Strategy pattern allows for the dynamic selection of algorithms, enabling objects to vary their behavior independently from clients that use them. The Command pattern encapsulates requests as objects, enabling parameterization and decoupling of clients and receivers. The Chain of Responsibility pattern allows a request to be passed along a chain of handlers, offering a flexible and scalable approach to request handling. The Iterator pattern provides a uniform way to traverse collections without exposing their internal structure, promoting encapsulation and decoupling.

Each behavioral pattern addresses specific challenges in software design, offering reusable and adaptable solutions to common problems. By understanding and applying these patterns effectively, developers can create robust, maintainable, and extensible software systems that meet the demands of complex and evolving requirements.