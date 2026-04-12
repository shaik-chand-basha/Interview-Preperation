**Java Interview Questions for Freshers**
-----------------------------------------

Some of the beginner-level Java developer interview questions you might get asked in an interview are given below -

### **Q1. What are the data types in Java?**

There are two types of [data types in Java](https://www.naukri.com/code360/library/introduction-to-data-type), namely, primitive and non-primitive data types.

*   **Primitive data types:** This includes data types like char, boolean, byte, short, int, long, double,e and float.
*   **Non-primitive data types:** This type of data type includes classes, interfaces, and arrays.

### **Q2. What are wrapper classes?**

[Wrapper classes in Java](https://www.naukri.com/code360/library/wrapper-class-in-java) are classes of primitive data types. They are used to create objects of primitive data types and convert them back into primitive data types. They are needed when an object needs to be made if there is a need to change the arguments passed into a method.

### **Q3. Are there dynamic arrays in Java?**

No, arrays in Java are not dynamic. In Java, you can declare the size of the array at the time of memory allocation. After the memory has been allocated, the array size can neither be decreased nor increased.

### **Q4. What is JVM?**

JVM or [Java Virtual Machine](https://www.naukri.com/code360/library/jvm-and-its-architecture) is a virtual machine that creates a runtime environment for the Java application. The JVM is a part of the Java Runtime Environment (JRE). The JVM is responsible for converting bytecode into machine code for a specific machine.

### **Q5. Why is the Java platform independent?**

Java is platform-independent because the Java Runtime Environment uses a JVM to create an executable file. The Java code, when compiled, is first converted into a bytecode. The bytecode is platform-independent, and the JVM can convert the bytecode into the machine code of a specific machine. This makes Java platform independent.

### **Q6. What are local variables and global variables?**

The key difference between [local variables and global variables](https://www.naukri.com/code360/library/difference-between-local-variable-and-global-variable) is:

**Local variables** are variables which are declared within a function. This type of variable has its access scope limited to the function in which they are defined.

**Global variables** are declared outside of any function. The global variables are declared in the body of a class. They can be accessed in any function and have the highest scope for a variable in a class.

### **Q7. What is data encapsulation?**

Data encapsulation means wrapping the attributes of an object and all its related functionalities into a single unit. Data encapsulation helps in hiding data from being accessed from any part of the application. Data encapsulation helps in abstraction by only showing the necessary functionalities and data.

### **Q8. What is function overloading?**

In Java, it is possible to have multiple functions with the same name. This is possible by having different function signatures. The number of attributes of a function and the attributes' data type define the function's signature. Function overloading helps create functions that serve the same purpose but vary in some minor areas.

*   Java

### Java

    public class Figure 
    {
    	public int area(int a, int b)
    	{ 
      	int rectangleArea = a*b;
      	return rectangleArea;
    	}
    	public  int area(int a)
    	{
      	int squareArea = a;
      	return squareArea;
    	}
    
    public static void main(String[] args )
    	{
      	Figure f = new Figure();
      	System.out.println("Area of square " + f.area(5));
      	System.out.println("Area of Rectangle " + f.area(5,3));
    	}
    }

![](https://files.codingninjas.in/fluent_code-24-filled-29586.svg)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

Output:

![Output](https://files.codingninjas.in/article_images/custom-upload-1677437637.webp)

### **Q9. What is function overriding?**

[Function overriding](https://www.naukri.com/code360/library/method-overriding-in-java) means re-implementing a function already defined in a parent class. Function overriding serves an essential purpose in places where a function performs a general operation. With the help of function overriding, the broad implementation of the function can be specialised for the sub-classes where the function is inherited.

### **Q10. Why is the main method static in Java?**

The main method is static because the "static: keyword makes it a class method. By making the main method a class method, it is no more necessary to create an object of the class to call the main method.

### **Q11. What is the difference between the throw and throws keywords in Java?**

**Throw**

**Throws**

The throw keyword explicitly throws an exception inside a block of code.

The throws keyword is written in the signature of a function to show that the function may throw an exception of a particular type.

The throw keyword can only throw a single exception.

The throws keyword can be used to declare multiple exceptions. The exceptions are declared with the help of the throws keyword in the function syntax using commas.

### **Q12. What do you mean by a singleton class?**

A [singleton class in Java](https://www.naukri.com/code360/library/singleton-class-in-java) is a class that only allows the creation of a single object. A singleton class can be created by simply creating a static variable. A static variable is a variable which is shared by all objects of a class. By having a static variable, it can be known whether the object of the class has been created or not.

### **Q13. Does every try block need a catch block?**

No, every try block does not need a catch block. The try block can be succeeded by either a catch block, a finally block, or even both. A catch block is needed for catching the exceptions raised in try block. The absence of a catch block after a try block, though syntactically correct, is not much of use practically. The finally block might be needed after try block if some critical operations like closing a file needs to be done.

### **Q14. What is the usage of the super keyword in Java?**

[Java super keyword](https://www.naukri.com/code360/library/super-keyword-in-java) refers to an object of the parent class. The super keyword creates an object of the parent class. The super keyword can also be used to call all the functions of the parent class and all the global variables, which can be either public or protected.

### **Q15. What do you mean by final keyword?**

The [final keyword in Java](https://www.naukri.com/code360/library/final-keyword-in-java) is used to create a constant. A constant also called a literal, is a variable whose value, once assigned during initialisation, cannot be changed. The final keyword can be added before the data type of any variable to make the variable a constant.

### **Q16. How is an exception handled in Java?**

An exception in Java can be handled using a try-catch block. The error-prone code is written in a try block. The catch block can be configured to handle different types of errors which might occur. The try block can also be followed by a finally block which is always run after the execution of the try block.

### **Q17. How can objects in a Java class be prevented from serialisation?**

Serialisation is the conversion of an object to an array. The converted array can be stored in a file and then deserialised when the object is needed. We can prevent serialisation in Java class with the help of NotSerialiazeableException. We can implement the functions needed for serialisation and add the exception in those classes. Serialisation prevention can be required when the super-class is serialisable, but we do not want the child class's object to get serialised.

### **Q18. What is the difference between a constructor and a method in Java?**

**Constructor**

**Method**

It has no return type.

It always has a return type. It has a return type void when not returning anything.

It always has the same name as the class name.

It can have any name of its choice.

### **Q19. Why is reflection used in Java?**

Reflection is used in Java as it allows an executing Java program to examine the functions and variables in it and manipulate the program's internal working. Reflection is used in JavaBeans. JavaBean uses reflection to obtain the properties of Java components while they are being loaded.

### **Q20. What are the types of ClassLoader in Java?**

There are three types of [ClassLoaders in Java](https://www.naukri.com/code360/library/classloader-in-java), namely.

*   **Bootstrap ClassLoader:** It loads the first pure Java ClassLoader. This loader loads the JDK class files and other core classes from rt.jar. It is not a Java class. This loader is also called the Primordial ClassLoader. It loads class files from jre, lib, and rt.jar.  
    
*   **Extensions ClassLoader:** This loader uses the parent to process the class loading request. If the loading of a class fails, it loads classes from the jre or lib or ext directory. It is implemented in the sun.misc.Launcher$ExtClassLoader in Java Virtual Machine.  
    
*   **System ClassLoader:** This loader loads the Application type classes stored in the environment variable CLASSPATH, -cp or -classpath command line option. The System ClassLoader is a child class of Extension ClassLoader.

### **Q21. What is a copy constructor in Java?**

A copy constructor is a constructor in which an object is created using another object. In a copy constructor, a single object whose copy we want to make is set as the argument. The copy constructor then creates a new object by simply passing the properties of the object in the argument into the original constructor of the class.

### **Q22. What is object cloning in Java?**

Cloning is also a way to create a copy of an object in Java. By using object cloning, we make a shallow copy, whereas copy constructor can create a deep copy. The difference between a shallow copy and a deep copy is that in the case of memory-heavy data structures like arrays, the shallow copy shares the same array with the original object. The whole array is reconstructed in deep copy by coping each value individually.

### **Q23. Is Java a purely object-oriented language?**

No, Java is not a pure object-oriented language. In Java, we have primitive data types like int, char, boolean, short, float, long, and double. For Java to be a purely object-oriented language, there should not be any non-object data type.

### **Q24. What is a package in Java?**

In Java, a collection of classes is called a package. Packages can be thought of as a folder containing many related Java classes. Packages can be inbuilt or user-defined. Inbuilt packages are Java.lang and Java.util, which are part of the Java programming language. User-defined packages are those which the programmer creates.

### **Q25. What is coercion in Java?**

Coercion in Java is converting a value of one type into another. Coercion can be implicit or explicit. Implicit type conversions occur when a data type of higher precedence is converted to one of lower precedence. Implicit casting occurs automatically. Explicit type conversions are done when converting a data type of lower precedence to one of higher precedence.

### **Q26. Is it possible to override a private method?**

If a function or variable in a parent class is private, it would be inaccessible to the child. So the child class would not be visible to the child class for it to be overridden.

### **Q27. What is the life cycle of a thread created in Java?**

A thread undergoes multiple phases in its life cycle. The phases in the life cycle of a thread in Java are

*   **New**: In this phase, a thread has been created and is ready to be executed.  
    
*   **Active**: In the active phase, the CPU executes the thread. In this phase, the actual execution of the program occurs.  
    
*   **Blocked**: In this phase, the thread is temporarily inactive. The thread in this phase is blocked or in a waiting state.  
    
*   **Timed waiting**: In this phase, the thread waits for a set amount. This occurs when a method calls sleep(). The thread is sent back to its active state once the time-out occurs or is set to active explicitly.  
    
*   **Terminated**: After the thread runs, completes its job or is closed early due to some error, the thread is sent to the terminated state.

### **Q28. What are marker interfaces in Java?**

A marker interface is empty. It does not have any functions or variables in it. A marker interface provides information about the object during runtime. It is also called a tagging interface. These days annotations are preferred over marker interfaces.

### **Q29. What is a memory leak in Java?**

A memory leak in Java occurs when the garbage collector does not remove previously created objects. The unused object remains in the memory, causing a memory leak. Memory leak uses up space and slows down the application over time. A memory leak occurs in objects referenced in the application, preventing them from being removed. Not closing objects, as objects for input and output operations, can also cause memory leaks.

### **Q30. What is the difference between new and newInstance operators in Java?**

The new operator creates an object of a particular known class by allocating memory. It is a static process and speedy, as it is known which class's object has to be created.

The newInstance operator is used where it needs to be known which class's object we have to create. It is used to create an object of a class dynamically. It is much slower as the JVM must find the class and check for access permissions before making the object for it.

### **Q31.****What is the difference between JDK, JRE, and JVM?**

*   **JDK (Java Development Kit):** Includes tools for developing Java programs (compiler, debugger) and the JRE to run Java applications.
*   **JRE (Java Runtime Environment):** Contains the JVM and class libraries required to run Java applications.
*   **JVM (Java Virtual Machine):** Executes the Java bytecode and enables Java applications to be platform-independent.

### **Q32.****What is the difference between abstraction and encapsulation?**

Abstraction focuses on hiding the complexity and showing only the essential features of an object. Encapsulation is about wrapping the data and code together as a single unit and hiding the internal details of a class from outside access.

### **Q33.****What is inheritance in Java?**

Inheritance is an OOP concept in Java where one class (child class) inherits the properties and behaviors (methods) of another class (parent class). It promotes code reusability and establishes a relationship between classes.

### **Q34.****What are functional interfaces in Java 8?**

Functional interfaces are interfaces that contain exactly one abstract method. They can have any number of default or static methods. Some examples include Runnable, Callable, and Comparator. They are often used with lambda expressions.

### **Q35.****What is polymorphism in Java?**

Polymorphism means "many forms." In Java, it allows methods to perform different tasks based on the object that calls them. There are two types of polymorphism:

*   **Compile-time (Method Overloading):** Same method name with different parameters.
*   **Run-time (Method Overriding):** A child class provides a specific implementation of a method already defined in its parent class.

### **Q36.****What is the purpose of the 'default' keyword in interfaces (Java 8+)?**

The 'default' keyword in interfaces allows the addition of new methods to interfaces without breaking the existing implementation of these interfaces. Classes implementing the interface are not required to implement the default methods.

### **Q37.****What is an interface?**

An interface in Java is a blueprint of a class that contains abstract methods (methods without a body). Classes that implement an interface must provide implementations for the abstract methods. Java allows multiple interfaces to be implemented by a class, supporting multiple inheritance.

### **Q38.****Explain the difference between ArrayList and Vector.**

Both ArrayList and Vector are implementations of the List interface, but:

*   ArrayList is not synchronized, while Vector is synchronized.
*   ArrayList is faster as it's non-synchronized.
*   ArrayList increases its size by 50% when full, while Vector doubles its size.

### **Q39.****What is an abstract class?**

An abstract class is a class that cannot be instantiated on its own and may contain abstract methods (methods without implementation). It provides a base for other classes to extend and must be inherited by other classes that implement its abstract methods.

### **Q40.****What is the difference between HashMap and ConcurrentHashMap?**

*   HashMap is not thread-safe, while ConcurrentHashMap is thread-safe.
*   ConcurrentHashMap does not lock the entire map for operations like put and remove, instead, it locks only a portion of the map.
*   ConcurrentHashMap does not allow null keys or values, while HashMap allows one null key and multiple null values.

### **Q41.****What is the difference between abstract class and interface?**

*   **Abstract Class:** Can contain concrete methods (with implementation) and abstract methods. It is extended by a subclass.
*   **Interface:** Contains only abstract methods (until Java 8). A class implements an interface and must provide an implementation for all its methods.

### **Q42.****What is the Java Memory Model?**

The Java Memory Model specifies how the Java virtual machine works with the computer's memory. It defines how and when different threads can see values written to shared variables by other threads, and how to synchronize access to shared variables.

### **Q43.****What is the ‘this' keyword in Java?**

The this keyword refers to the current instance of the class. It is used to differentiate between class attributes and parameters when both have the same name.

### **Q44.****Explain the concept of Java Generics.**

Generics allow a type or method to operate on objects of various types while providing compile-time type safety. They add stability to your code by making more bugs detectable at compile time.

### **Q45.****What are access modifiers in Java?**

Access modifiers define the visibility of Java classes, methods, and variables. They are:

*   **Private:** Accessible only within the same class.
*   **Default (Package-private):** Accessible within the same package.
*   **Protected:** Accessible within the same package and subclasses.
*   **Public:** Accessible from any class.

### **Q46.****What is the purpose of the 'synchronized' keyword?**

The 'synchronized' keyword controls access to a method or block of code, ensuring that only one thread can execute the code at a time. It's used to prevent thread interference and memory consistency errors.

### **Q47.****What is a static method in Java?**

A static method belongs to the class rather than instances of the class. It can be called without creating an object of the class. Static methods cannot access non-static members of the class directly.

### **Q48.****Explain the concept of Java 8 Streams.**

Streams in Java 8 provide a declarative approach to processing collections of objects. They allow operations like filtering, mapping, reducing, and collecting to be performed on collections in a functional style, often making the code more readable and concise.

### **Q49.****What is garbage collection in Java?**

Garbage collection in Java is the process of automatically reclaiming memory by removing objects that are no longer referenced in the program. Java's garbage collector runs in the background to manage memory allocation.

### **Q50.****What is the difference between 'implements' and 'extends' keywords?**

*   'implements' is used when a class is implementing an interface. A class can implement multiple interfaces.
*   'extends' is used for extending a class. In Java, a class can extend only one class (single inheritance for classes).

**Intermediate Interview Questions forJava Developers**
--------------------------------------------------------

After you feel comfortable with the above questions, it is time to turn up the heat. Here are some of the intermediate level java interview questions.

### **Q51. What does the "assert" statement help?**

In programming, the "assert" statement assists in validating conditions or assumptions by checking if a provided expression is true. If not, it raises an exception, commonly utilized for debugging and testing to identify unforeseen situations or errors.

### **Q52. What is the difference between ArrayList and LinkedList?**

ArrayList is a dynamic array-based data structure with contiguous memory, offering fast random access but slower inserts/deletes. LinkedList is a node-based data structure where elements are linked, providing efficient inserts/deletes but slower random access. ArrayList suits scenarios with frequent access, while LinkedList is better for frequent modifications.

### **Q53. What is the purpose of the hashCode() method?**

In Java, the hashCode() method generates a numerical value (hash code) that portrays the content of an object. It is commonly used in data structures like hash tables to locate objects efficiently. HashCode () provides a fast way to index and retrieve objects from collections by converting the object's internal state into a numerical value. It allows efficient searching, sorting, and retrieval operations on large datasets.

### **Q54. What is the purpose of the toString() method?**

In object-oriented programming, the toString() method transforms an object's state or data into a string representation. It enables more accessible display, debugging, and logging of object information. The method is commonly utilized when printing objects or concatenating them with strings, providing a human-readable summary of an object's content and facilitating effective communication of its properties and values.

### **Q55. How is encapsulation achieved in Java?**

In Java, access modifiers (private, protected, public) are used to control the visibility of class members (variables and methods) and achieve encapsulation. Private members are accessible only within the class, while protected and public members are accessible to derived classes and the outside world.

### **Q56. Explain the concept of method references.**

Method references in programming, often used in languages like Java, Kotlin, and others, provide a concise way to refer to methods as values. They allow functions to be treated as first-class citizens and passed around without invoking them immediately. It simplifies code by replacing explicit lambda expressions with direct references to existing methods, enhancing code readability and maintainability.

### **Q57. What are annotations in Java?**

Annotations in Java are metadata elements that provide additional information about code elements such as classes, methods, variables, and more. They start with the "@" symbol and convey instructions or data to the compiler, runtime, or tools. Annotations aid in documentation, code organization, and behavior modification. It is used for configuration, validation, and code generation.

### **Q58. What is the BitSet class used for?**

The BitSet class represents a fixed-size sequence of bits (binary values: 0 or 1) as a collection of boolean values. It is often used for efficient storage and manipulation of sets of flags or indicators, where each bit corresponds to a specific state. This class provides methods to set, clear, toggle, and check the status of individual bits within the sequence.

### **Q59. What is a CyclicBarrier in Java?**

A CyclicBarrier in Java is a synchronization mechanism that allows a group of threads to wait for each other to reach a common barrier point before proceeding together. It synchronizes threads when they need to perform specific tasks in parallel, ensuring they all wait until all threads have reached the barrier before continuing their execution simultaneously.

### **Q60. What are the JDBC statements?**

JDBC (Java Database Connectivity) statements actively interact with databases in Java applications. They encompass 'Statements' for executing straightforward SQL queries, 'PreparedStatement' for handling precompiled queries with parameters, and 'CallableStatement' for actively invoking database stored procedures. These statements actively facilitate database operations and parameter binding while assuring security and optimizing performance.

### **Q61. What is Java String Pool?**

Java String Pool is a memory-saving technique where the JVM stores and reuses string literals to conserve memory. Identical string literals are referenced to a single memory location, reducing memory usage. It improves performance and ensures efficient memory management for frequently used strings.

### **Q62. What is the difference between Path and Classpath?**

The environment variable "Path" designates directories wherein the operating system seeks executable files.

In Java, the environment variable "Classpath" identifies directories and JAR files that the Java Virtual Machine (JVM) explores for loading class files while executing programs.

### **Q63. What is the difference between Heap and Stack memory?**

Heap memory stores objects and data that must persist throughout the program, managed by the JVM's garbage collector.

Stack memory holds method call frames and local variables, managing method invocations and ensuring automatic memory deallocation when methods exit.

### **Q64. Can we use String with a switch case?**

Yes, starting from Java 7, you can use strings in switch-case statements. This improvement lets you switch based on string values, making code more readable and concise. If you're using Java 7 or later, using strings in switch-case is a convenient feature enhancement.

### **Q65. What are the different types of classloaders?**

Java features three primary built-in Class Loaders:

1.  The Bootstrap ClassLoader loads JDK internal classes and typically handles the loading of core classes such as rt.jar.
2.  The Extensions Class Loader, responsible for loading classes from the JDK extensions directory, is commonly found at $JAVA\_HOME/lib/ext.
3.  The System Class Loader is intended to load classes from the present classpath, becoming active when a program is invoked, and can be tailored using the -cp or -classpath command-line options.

### **Q66. What is the difference between fail-safe and fail-fast iterators in Java?**

Fail-safe and fail-fast iterators are mechanisms in Java for iterating through collections. Fail-safe iterators create copies of the collection and work on them, preventing concurrent modification exceptions. Fail-fast iterators detect modifications made during the iteration and immediately throw exceptions, ensuring data integrity but potentially causing unexpected errors.

### **Q67.What is a compile-time constant in Java?**

In Java, a compile-time constant refers to a value determined and assigned during compilation, which remains unchanged throughout the program's execution. These constants are typically primitive or String literals and are directly substituted into the code during compilation, optimizing performance.

### **Q68. What is the difference between Map and Queue in Java?**

Map in Java stores key-value pairs, enabling rapid data retrieval based on keys. It doesn't allow duplicate keys. A Queue holds a collection of elements for processing in a specific order, such as FIFO (First-In-First-Out) or priority order. While a Map facilitates key-based data storage and retrieval, a Queue handles ordered element processing.

### **Q69. What is the difference between LinkedHashMap and PriorityQueue in Java?**

LinkedHashMap maintains insertion order and maps keys to values, allowing predictable iteration. PriorityQueue arranges elements based on their priority, determined by the object's comparable or custom comparator. While LinkedHashMap emphasizes order, PriorityQueue emphasizes priority-driven retrieval.

### **Q70. What is the memory-mapped buffer in Java?**

The memory-mapped buffer in Java is a mechanism that allows files to be mapped directly into memory. It enables more efficient data transfer between the file and memory and seamless interaction between Java programs and external data sources. It's beneficial for dealing with large files and can improve I/O performance through direct memory access.

### **Q71. What is the difference between notify() and notifyAll() methods?**

The distinction between notify() and notifyAll() lies in their impact on threads. notify() wakes up a single waiting thread, chosen arbitrarily, while notifyAll() awakens all waiting threads. The former is more efficient when multiple threads are in similar states, whereas the latter ensures all threads can proceed.

### **Q72. What are the various types of exceptions?**

Java encompasses two types of exceptions: checked exceptions and unchecked exceptions. Checked exceptions, like IOException, must be handled explicitly in the code. Unchecked exceptions, such as NullPointerException, don't necessitate immediate handling and can be caught during runtime. These exception types assist in identifying and addressing errors, enhancing the reliability of Java programs.

### **Q73. What is OutOfMemoryError?**

OutOfMemoryError is a runtime exception in Java that occurs when the Java Virtual Machine (JVM) cannot allocate more memory to create new objects or store data. It's thrown when the heap space is exhausted. This error indicates that the application has consumed all available memory, leading to performance degradation or application crash.

### **Q74. What is the difference between == and equals()?**

In Java, == compares object references to check if they refer to the same memory location. The equals() method compares the content or value of objects, and it's often overridden in classes to provide a meaningful comparison. While == checks for reference equality, equals() verifies for content equality.

### **Q75. How can you concatenate multiple strings in Java?**

In Java, you can concatenate multiple strings using the + operator. This operator combines string values and creates a new string containing the concatenated content. The StringBuilder class is recommended for more efficient concatenation within loops or complex scenarios due to its mutable nature, reducing unnecessary memory overhead compared to repeated use of the + operator.

Read more: [Wordpress Interview Questions](https://www.naukri.com/code360/library/wordpress-interview-questions)

### **Q76. What are the main differences between array and collection?**

Arrays are fixed-size data structures that store elements of the same type in contiguous memory. Collections are dynamic and can hold elements of different types, providing resizable structures like lists, sets, and maps. Collections offer more flexibility in adding, removing, and manipulating elements, whereas arrays have a fixed length and require manual resizing.

### **Q77. What do you understand by BlockingQueue?**

A BlockingQueue is a Java interface representing a thread-safe collection designed for inter-thread communication. It provides methods for adding, removing, and inspecting elements while managing synchronization between producer and consumer threads. BlockingQueue implementations handle blocking operations when the queue is complete (for adding) or empty (for removal), facilitating efficient data exchange between threads.

### **Q78. What is the difference between process and thread?**

A process is an independent executing unit with its own memory space, while a thread is a smaller unit within a process that shares the same memory space as other threads.

Processes are isolated from each other, while threads share resources like memory, making threads more lightweight and efficient in multitasking scenarios.

### **Q79. What are the advantages of multithreading?**

Multithreading offers enhanced resource utilization, enabling concurrent execution of tasks, thus maximizing CPU utilization. It enhances application responsiveness, particularly in GUI applications. Multithreading can boost efficiency in multi-core processors, allowing tasks to be divided and executed simultaneously. It also supports efficiently using I/O operations and facilitates complex task management, improving overall program performance.

### **Q80. What is context switching?**

Context switching refers to the process in multitasking operating systems where the CPU switches from executing the context of one thread or process to another. It involves saving a running thread's current state, loading the next thread's saved state, and changing the execution context. It efficiently allows multiple tasks to share a single CPU core, giving the illusion of parallel execution.

### **Q81.****What is the difference between Array and ArrayList in Java?**

*   **Array:** Fixed-size data structure that can hold elements of a single type.
*   **ArrayList:** Dynamic-size data structure from Java's java.util package that can grow or shrink during runtime. It allows only objects to be stored, not primitive types.

### **Q82.****What is the purpose of the 'volatile' keyword?**

The 'volatile' keyword is used to mark a Java variable as "being stored in main memory". It ensures that changes to the variable are always visible to other threads. Reading a volatile variable always returns the most recent write by any thread.

### **Q83.****Explain the concept of Java NIO.**

Java NIO (New I/O) is an alternative I/O API for Java, providing features for intensive I/O operations. It includes:

*   Channels and Buffers: Data is always read from a channel into a buffer, or written from a buffer to a channel.
*   Non-blocking I/O: Threads can ask a channel to read data into a buffer only when data is available.
*   Selectors: Allow a single thread to manage multiple channels.

### **Q84.****What is the difference between String, StringBuilder, and StringBuffer?**

*   **String:** Immutable, meaning once created, its value cannot be changed.
*   **StringBuilder:** Mutable, used for creating mutable strings in a single-threaded environment. Faster than StringBuffer.
*   **StringBuffer:** Mutable, thread-safe (synchronized) string manipulation class. Used when thread safety is needed.

### **Q85.****What is the difference between 'Runnable' and 'Callable' interfaces?**

Both are used for defining tasks that can be executed by threads, but:

*   Runnable's run() method doesn't return a value and cannot throw checked exceptions.
*   Callable's call() method can return a value and can throw checked exceptions.

### **Q86.****What is a checked exception in Java?**

Checked exceptions are exceptions that are checked at compile-time. If not handled, the compiler will throw an error. Example: IOException, SQLException.

### **Q87.****What is the difference between 'static' and 'final' keywords?**

*   'static' is used to create class-level members (methods or variables) that can be accessed without creating an instance of the class.
*   'final' is used to create constants (when applied to variables), prevent method overriding (when applied to methods), or prevent inheritance (when applied to classes).

### **Q88.****What is an unchecked exception in Java?**

Unchecked exceptions occur at runtime and are not checked at compile-time. They are a subclass of RuntimeException. Example: NullPointerException, ArrayIndexOutOfBoundsException.

### **Q89.****Explain the concept of Java lambda expressions.**

Lambda expressions in Java provide a clear and concise way to implement single-method interfaces (functional interfaces) by treating functionality as a method argument. They enable you to write more readable and maintainable code, and are particularly useful when working with collections and streams.

### **Q90.****What is the purpose of the ‘try-catch' block?**

A try block contains the code that might throw an exception, and the catch block handles the exception that occurs. If an exception is thrown in the try block, it is caught and handled in the catch block.

### **Q91.****What is the difference between Collection and Collections in Java?**

Collection is an interface that represents a group of objects known as elements. Collections is a utility class in java.util package that provides static methods to operate on collections, such as sorting and searching.

### **Q92.****What is the use of the finalize() method in Java?**

The finalize() method is called by the garbage collector on an object when garbage collection determines that there are no more references to the object. It is used to perform cleanup activities before the object is destroyed. However, it is rarely used, and its use is generally discouraged in favor of try-with-resources or manual cleanup.

### **Q93.****Explain the concept of Java 8 Optional.**

Optional is a container object used to represent the presence or absence of a value. It's designed as a better alternative to returning null and helps prevent null pointer exceptions. It provides methods like isPresent(), get(), orElse(), etc., to safely handle potentially null values.

### **Q94.****What is the Java Collection Framework?**

The **Java Collection Framework** is a set of classes and interfaces that provides various data structures like **List**, **Set**, **Queue**, and **Map**, along with algorithms to perform operations like sorting and searching. Examples include ArrayList, HashSet, and HashMap.

### **Q95.****Explain the concept of Java 8 CompletableFuture.**

CompletableFuture is a class introduced in Java 8 to handle asynchronous computations. It implements the Future interface and provides a rich set of methods for composing, combining, and handling errors in asynchronous operations.

### **Q96.****What is multithreading in Java?**

Multithreading in Java allows multiple threads (lightweight processes) to run concurrently, enabling the efficient utilization of the CPU. Each thread runs independently, and Java provides the Thread class and Runnable interface to create threads.

### **Q97.****What is the purpose of the strictfp keyword in Java?**

The strictfp keyword ensures that floating-point calculations give exactly the same results on all platforms. It can be applied to classes, interfaces, or methods.

### **Q98.****What is the difference between the sleep() and wait() methods in Java?**

*   **sleep():** A method in the Thread class that pauses the current thread for a specified period of time without releasing the object's lock.
*   **wait():** A method in the Object class that causes the current thread to release the lock and wait until another thread calls notify() or notifyAll() on the same object.

### **Q99.****What is the difference between LinkedHashSet and TreeSet?**

*   LinkedHashSet maintains insertion order of elements and allows null elements.
*   TreeSet sorts elements based on their natural order or a custom Comparator and doesn't allow null elements.

### **Q100.****What is synchronization in Java?**

**Synchronization** in Java is a mechanism that allows control over access to shared resources by multiple threads. It prevents thread interference and ensures consistency. In Java, the synchronized keyword can be used to lock methods or code blocks so that only one thread can access them at a time.

**Java Interview Questions for Experienced**
--------------------------------------------

Finally, let's discuss some of the advanced-level java interview questions that you might encounter in an interview.

### **Q101. How does the JVM handle method overloading and overriding internally?**

Method overloading is resolved at compile-time, and the method signature is changed to include argument types. Method overriding is resolved at runtime, and dynamic method dispatch is used to decide which method to invoke.

### **Q102. Explain Java's Non-blocking Algorithms and how they differ from traditional blocking algorithms.**

Non-blocking algorithms allow multiple threads to operate on shared data without using locks. This contrasts with traditional blocking algorithms, where locks are used to synchronize access.

### **Q103. How can you create an immutable class in Java?**

To create an immutable class, make the class final, all its fields final and private, and don't provide setters. Also, ensure deep copies of objects for mutable fields.

### **Q104. Describe the Contract of HashCode and Equals methods.**

The contract specifies that if two objects are equal according to the **equals()** method, they must have the same **hashCode()** value. However, two objects with the same **hashCode()** are not necessarily equal.

### **Q105. What is Type Inference in Generics?**

Type inference is the compiler's ability to determine the type of generic classes by evaluating the constructor and methods invoked.

### **Q106. Explain the inner workings of the ConcurrentHashMap.**

**ConcurrentHashMap** uses segment locking or bucket locking to allow concurrent read and updates without blocking the entire collection.

### **Q107. Describe the Java Memory Fence and its importance.**

Memory fences are barriers that prevent the reordering of instructions, ensuring that memory operations occur in the expected order, which is crucial in multi-threaded environments.

### **Q108. Explain the concept of False Sharing in Java.**

False sharing occurs when threads accidentally impact each other's performance due to the layout of their data in the CPU cache, even though they are not explicitly sharing any resources.

### **Q109. How do you handle OutOfMemoryError in Java?**

Handling **OutOfMemoryError** can be complex and may involve freeing up memory resources, triggering garbage collection, or gracefully shutting down the application to prevent data corruption.

### **Q110. Describe Escape Analysis in the context of Java optimizations.**

Escape analysis is a compiler optimization technique that analyzes the scope of new objects and determines if they can be allocated on the stack instead of the heap, thus improving performance.

### **Q111. Explain the concept of Thread Starvation and how to prevent it.**

Thread starvation occurs when a thread cannot access the CPU for an extended period. It can be prevented by using fair locking mechanisms and thread priorities.

### **Q112. How does Class Data Sharing work in JVM?**

Class Data Sharing allows pre-loaded classes to be shared between JVM instances, reducing startup time and memory footprint.

### **Q113. Explain Java's TLAB (Thread-Local Allocation Buffers).**

TLABs are segments of Eden space that are exclusively used by individual threads, reducing contention during object allocation in a multi-threaded environment.

### **Q114. How does the Fork/Join Framework work?**

The Fork/Join framework is designed for parallel execution. It works by recursively breaking down a task into smaller tasks and combining their results.

### **Q115. What is the difference between Pessimistic Locking and Optimistic Locking in the context of Java's Concurrency API?**

Pessimistic Locking locks resources for a transaction's entire duration, while Optimistic Locking allows concurrent access but checks for conflict before commit.

### **Q116. Explain the inner workings of the Java Agent.**

Java Agents are tools for instrumentation, which can modify bytecode at load time or runtime, enabling advanced profiling or monitoring functionalities.

### **Q117. Describe the uses of Java Compiler API.**

The Java Compiler API allows programs to be dynamically compiled and loaded during runtime, offering possibilities for developing IDEs, hot-reloading functionalities, and more.

### **Q118. What is the Principle of Locality and how does it apply to Java?**

The Principle of Locality refers to the tendency of a processor to access the same set of memory locations repetitively. Understanding this can help in optimizing Java programs for better cache utilization.

### **Q119. How does the G1 Garbage Collector work?**

G1 Garbage Collector works by dividing the heap into regions and prioritizing the collection of regions with more garbage, aiming for high throughput and low latency.

### **Q120. Explain the concept of Polymorphic Inline Caching.**

Polymorphic Inline Caching is an optimization technique to improve dynamic method dispatch by remembering the last method called for a particular call site.

### **Q121. What is the difference between a StampedLock and a ReentrantLock?**

**StampedLock** provides better performance through optimistic locking, while **ReentrantLock** is a more traditional, pessimistic locking mechanism.

### **Q122. Explain the term "Busy Spin" in multi-threading.**

Busy Spin is a technique where a thread repeatedly checks a condition rather than waiting to be notified, usually to achieve lower latency at the cost of higher CPU usage.

### **Q123. How can you implement a custom ClassLoader?**

A custom **ClassLoader** can be implemented by subclassing **ClassLoader** and overriding methods like **findClass**, **loadClass**, and **defineClass**.

### **Q124. Describe the Java JIT Compiler optimizations like Loop Unrolling and Vectorization.**

Loop Unrolling reduces the overhead of loop control code by increasing the number of operations in the loop body. Vectorization allows operations to be performed on multiple data points simultaneously.

### **Q125. Explain the use of the jstack tool.**

**jstack** is a Java utility for displaying stack traces of Java threads, useful for debugging and performance analysis.

### **Q126. Describe Java's Project Loom and its impact on concurrency.**

Project Loom aims to simplify concurrency in Java by introducing lightweight, user-mode threads known as fibers, making it easier to handle high levels of concurrency.

### **Q127. What is a Java Decompiler, and how can it be used securely?**

A Java Decompiler converts bytecode back into source code. It's crucial to use decompilers responsibly and in accordance with software licenses.

### **Q128. What are the challenges in implementing Distributed Garbage Collection?**

Distributed Garbage Collection deals with the complexities of identifying and collecting garbage objects across multiple JVMs, making it a challenge in terms of performance and resource management.

### **Q129. Describe the impact of the JVM flags on performance tuning.**

JVM flags like **\-Xms**, **\-Xmx**, **\-XX:+UseG1GC**, etc., allow tuning the JVM behavior, impacting aspects like heap size, garbage collection strategy, and performance.

### **Q130. What are Java Modules, and how do they enhance security and maintainability?**

Java Modules, introduced in Java 9, allow the packaging of Java classes and resources into modular JAR files, enhancing security by providing strong encapsulation and improving maintainability by resolving dependencies explicitly.

### **Q131.****Explain the concept of Java 8 parallelStream().**

parallelStream() is a method in Java 8 that creates a parallel stream, allowing operations on the stream to be executed concurrently. It can significantly improve performance for large data sets, but it's important to ensure that the operations are thread-safe.

### **Q132.****What is a deadlock in Java?**

A **deadlock** occurs when two or more threads are blocked forever, each waiting for the other to release a resource. For example, Thread A holds lock 1 and waits for lock 2, while Thread B holds lock 2 and waits for lock 1.

### **Q133.****What is the difference between Executor and ExecutorService interfaces?**

*   Executor is a simple interface for executing tasks asynchronously. It has a single method execute(Runnable).
*   ExecutorService extends Executor and provides additional methods for managing and monitoring the execution of asynchronous tasks, including shutting down the executor and submitting tasks that return results.

### **Q134.****What is the difference between HashMap and Hashtable?**

*   **HashMap:**
    *   Not synchronized (not thread-safe).
    *   Allows one null key and multiple null values.
    *   Faster than Hashtable.
*   **Hashtable:**
    *   Synchronized (thread-safe).
    *   Does not allow null keys or values.
    *   Slower compared to HashMap.

### **Q135.****Explain the concept of Java 8 default methods in interfaces.**

Default methods in interfaces allow the addition of new methods to interfaces without breaking existing implementations of these interfaces. They provide a way to extend interfaces in a backward-compatible way. Classes implementing the interface can choose to override the default implementation if needed.

### **Q136.****What is the difference between wait() and notify()?**

*   **wait()**: Causes the current thread to wait until another thread invokes notify() or notifyAll() on the same object.
*   **notify()**: Wakes up one thread that is waiting on this object's monitor. If multiple threads are waiting, one of them is arbitrarily chosen.

### **Q137.****What is the difference between Comparator and Comparable?**

*   **Comparable:** An interface that provides a single method, compareTo(), to define a natural order for objects. It is implemented by the class that needs to be sorted.
*   **Comparator:** An interface that provides a compare() method, allowing sorting of objects in a custom order that can be different from their natural order. It is typically used when you want to define multiple sorting sequences.

### **Q138.****What is the transient keyword in Java?**

The **transient** keyword is used in Java to indicate that a field should not be serialized. When an object is serialized, fields marked as transient are ignored and are not included in the serialization process.

### **Q139.****What is the purpose of the instanceof operator in Java?**

The instanceof operator is used to check if an object is an instance of a specific class or implements a specific interface. It returns true if the object belongs to the specified type, otherwise false. For example:

    if (object instanceof MyClass) {
        // Do something
    }

### **Q140.****Explain the concept of lock-free programming in Java.**

Lock-free programming aims to achieve thread-safe operations without using locks, typically using atomic operations and compare-and-swap (CAS) instructions. Benefits include:

*   Avoiding deadlocks and livelocks
*   Better scalability under high contention
*   Resilience to thread failures Java provides support through classes like AtomicInteger, AtomicReference, and the java.util.concurrent.atomic package.

### **Q141.****What is the use of java.lang.reflect.Proxy?**

The Proxy class is used to create dynamic proxy classes at runtime. It provides a mechanism to implement interfaces on the fly and delegate method calls to a specified handler object. Dynamic proxies are commonly used in AOP (Aspect-Oriented Programming) and frameworks like Spring.

### **Q142.****What are some advanced features of CompletableFuture in Java?**

Advanced features include:

*   Chaining multiple asynchronous operations
*   Combining results from multiple CompletableFutures
*   Handling exceptions asynchronously
*   Timeouts and default values
*   Controlling the executor for async operations These features allow for complex asynchronous workflows to be expressed concisely.

### **Q143.****What is the ForkJoinPool and how is it different from a regular thread pool?**

**ForkJoinPool** is a specialized implementation of ExecutorService that is designed for work-stealing algorithms. It efficiently executes large tasks by recursively breaking them down into smaller tasks (forking) and combining their results (joining). It is ideal for divide-and-conquer algorithms. A regular thread pool executes independent tasks without recursive splitting.

### **Q144.****How does the Unsafe class work and what are its use cases?**

The sun.misc.Unsafe class provides low-level, unsafe operations like:

*   Direct memory access
*   Creating objects without constructor invocation
*   Volatile field access
*   CAS operations It's used internally by the JDK and by some high-performance libraries, but its use in application code is discouraged due to its potential to cause JVM crashes.

### **Q145.****What is PhantomReference in Java?**

A **PhantomReference** is a type of reference in Java that is enqueued after the object is finalized but before the memory is reclaimed. It is used to perform cleanup operations before the garbage collector reclaims an object's memory, typically in scenarios requiring more control over the cleanup process than finalize() provides.

### **Q146.****Explain the concept of Method Handles in Java.**

Method Handles provide a way to lookup, customize, and invoke methods, constructors, and fields. They offer:

*   More flexibility than reflection
*   Better performance in some cases
*   Type safety They're used in implementing invokedynamic instructions and in the implementation of lambda expressions.

### **Q147.****What is the role of java.lang.instrument package?**

The **java.lang.instrument** package allows for runtime modification of bytecode in Java. It provides APIs for adding, modifying, or removing classes loaded by the JVM. It is used for creating Java agents that can monitor or modify the behavior of applications at runtime, commonly in profiling and monitoring tools.

### **Q148.****How does the Java Memory Model handle out-of-order execution and memory visibility?**

The Java Memory Model:

*   Defines happens-before relationships to ensure proper ordering of memory operations
*   Uses volatile variables and synchronization to create memory barriers
*   Prevents certain compiler and CPU optimizations that could violate intended semantics
*   Defines rules for when changes made by one thread become visible to other threads

### **Q149.****What is the difference between ReentrantLock and synchronized?**

*   **ReentrantLock:** Provides explicit locking with more control, such as trying to acquire the lock or waiting for it with a timeout. It also supports fairness policies, interruptible lock waits, and multiple conditions.
*   **synchronized:** Implicit locking mechanism that is simpler but provides less flexibility compared to ReentrantLock. It is limited to intrinsic locking.

### **Q150.****What is the difference between WeakReference and SoftReference?**

*   **WeakReference:** It allows the object to be garbage collected when there are no strong references to it. This is used when memory is more important than keeping the object alive.
*   **SoftReference:** It is more lenient, and the object is only garbage collected when the JVM is running low on memory. This is used for caching purposes where the data can be reclaimed if needed.

**Java Coding Interview Questions for Experienced Developers**
--------------------------------------------------------------

### **Q151.****Write a Java program to check if a number is prime.**

*   Java

### Java

    public class PrimeCheck {
        public static void main(String[] args) {
            int num = 29;
            boolean isPrime = true;
    
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
    
            if (isPrime)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }

![](https://files.codingninjas.in/fluent_code-24-filled-29586.svg)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    29 is a prime number.
    

### **Q152.****Write a Java program to sort an array using the bubble sort algorithm.**

*   Java

### Java

    import java.util.Arrays;
    
    public class BubbleSort {
        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90};
            bubbleSort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }
    
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

![](https://files.codingninjas.in/fluent_code-24-filled-29586.svg)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Sorted array: [11, 12, 22, 25, 34, 64, 90]

### **Q153.****Write a Java program to reverse a string.**

*   Java

### Java

    public class ReverseString {
        public static void main(String[] args) {
            String str = "Java";
            String reversed = new StringBuilder(str).reverse().toString();
            System.out.println("Reversed string: " + reversed);
        }
    }

![](https://files.codingninjas.in/fluent_code-24-filled-29586.svg)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Reversed string: avaJ
    

### **Q154.****Write a Java program to check if a string is a rotation of another string.**

*   Java

### Java

    public class StringRotation {
        public static void main(String[] args) {
            String str1 = "abcd";
            String str2 = "cdab";
            boolean isRotation = areRotations(str1, str2);
            System.out.println(str1 + " and " + str2 + " are rotations: " + isRotation);
        }
    
        public static boolean areRotations(String str1, String str2) {
            if (str1.length() != str2.length()) return false;
            String temp = str1 + str1;
            return temp.contains(str2);
        }
    }

![](https://files.codingninjas.in/fluent_code-24-filled-29586.svg)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    abcd and cdab are rotations: true

### **Q155.****Write a Java program to check for balanced parentheses in an expression.**

*   Java

### Java

    import java.util.Stack;
    
    public class BalancedParentheses {
        public static void main(String[] args) {
            String expression = "{[()]}";
            boolean isBalanced = checkBalanced(expression);
            System.out.println("Is the expression balanced? " + isBalanced);
        }
    
        public static boolean checkBalanced(String expr) {
            Stack<Character> stack = new Stack<>();
            for (char ch : expr.toCharArray()) {
                if (ch == '{' || ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == '}' || ch == ')' || ch == ']') {
                    if (stack.isEmpty()) return false;
                    char top = stack.pop();
                    if (!isMatchingPair(top, ch)) return false;
                }
            }
            return stack.isEmpty();
        }
    
        public static boolean isMatchingPair(char open, char close) {
            return (open == '{' && close == '}') ||
                   (open == '(' && close == ')') ||
                   (open == '[' && close == ']');
        }
    }

![](https://files.codingninjas.in/fluent_code-24-filled-29586.svg)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Is the expression balanced? true

### **Q156.****Write a Java program to find the largest number in an array.**

*   Java

### Java

    public class LargestNumber {
        public static void main(String[] args) {
            int[] arr = {10, 20, 5, 40, 25};
            int max = arr[0];
    
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
    
            System.out.println("The largest number is: " + max);
        }
    }

![](https://files.codingninjas.in/fluent_code-24-filled-29586.svg)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    The largest number is: 40
    

### **Q157.****Write a Java program to print Fibonacci series up to n terms.**

*   Java

### Java

    public class Fibonacci {
        public static void main(String[] args) {
            int n = 10, a = 0, b = 1;
            System.out.print("Fibonacci Series: " + a + " " + b);
    
            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;
            }
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
    

### **Q158.****Write a Java program to find the sum of digits of a number.**

*   Java

### Java

    public class SumOfDigits {
        public static void main(String[] args) {
            int num = 1234, sum = 0;
    
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
    
            System.out.println("Sum of digits: " + sum);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Sum of digits: 10
    

### **Q159.****Write a Java program to print all prime numbers up to n.**

*   Java

### Java

    public class PrimeNumbersUpToN {
        public static void main(String[] args) {
            int n = 20;
            System.out.print("Prime numbers up to " + n + ": ");
    
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    
        public static boolean isPrime(int num) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Prime numbers up to 20: 2 3 5 7 11 13 17 19
    

### **Q160.****Write a Java program to find the length of the longest substring without repeating characters.**

*   Java

### Java

    import java.util.HashSet;
    
    public class LongestSubstring {
        public static void main(String[] args) {
            String str = "abcabcbb";
            int length = lengthOfLongestSubstring(str);
            System.out.println("Length of longest substring: " + length);
        }
    
        public static int lengthOfLongestSubstring(String s) {
            HashSet<Character> set = new HashSet<>();
            int maxLength = 0, left = 0;
            for (int right = 0; right < s.length(); right++) {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left++));
                }
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            }
            return maxLength;
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Length of longest substring: 3

### **Q161.****Write a Java program to count the number of vowels in a string.**

*   Java

### Java

    public class CountVowels {
        public static void main(String[] args) {
            String str = "Hello World";
            int count = countVowels(str);
            System.out.println("Number of vowels: " + count);
        }
    
        public static int countVowels(String str) {
            int count = 0;
            for (char c : str.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            return count;
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Number of vowels: 3

### **Q162.****Write a Java program to implement a simple banking system (deposit and withdrawal).**

*   Java

### Java

    import java.util.Scanner;
    
    public class SimpleBanking {
        private double balance;
    
        public SimpleBanking() {
            this.balance = 0.0;
        }
    
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        }
    
        public double getBalance() {
            return balance;
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            SimpleBanking account = new SimpleBanking();
    
            while (true) {
                System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Current balance: " + account.getBalance());
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    1. Deposit
    2. Withdraw
    3. Check Balance
    4. Exit
    Choose an option: 1
    Enter amount to deposit: 100
    Deposited: 100.0

### **Q163.****Write a Java program to implement bubble sort.**

*   Java

### Java

    import java.util.Arrays;
    
    public class BubbleSort {
        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90};
            bubbleSort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }
    
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Sorted array: [11, 12, 22, 25, 34, 64, 90]

### **Q164.****Write a Java program to count the occurrences of each character in a string.**

*   Java

### Java

    import java.util.HashMap;
    
    public class CharCount {
        public static void main(String[] args) {
            String str = "java";
            HashMap<Character, Integer> charCount = new HashMap<>();
    
            for (char c : str.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
    
            System.out.println("Character count: " + charCount);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Character count: {a=2, v=1, j=1}

### **Q165.****Write a Java program to find the length of the longest palindrome in a string.**

*   Java

### Java

    public class LongestPalindrome {
        public static void main(String[] args) {
            String str = "babad";
            System.out.println("Longest palindrome: " + longestPalindrome(str));
        }
    
        public static String longestPalindrome(String s) {
            int maxLength = 1, start = 0, len = s.length();
    
            for (int i = 0; i < len; i++) {
                for (int j = i; j < len; j++) {
                    int flag = 1;
    
                    for (int k = 0; k < (j - i + 1) / 2; k++)
                        if (s.charAt(i + k) != s.charAt(j - k))
                            flag = 0;
    
                    if (flag != 0 && (j - i + 1) > maxLength) {
                        start = i;
                        maxLength = j - i + 1;
                    }
                }
            }
    
            return s.substring(start, start + maxLength);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Longest palindrome: bab

### **Q166.****Write a Java program to find the maximum element in an array.**

*   Java

### Java

    public class MaxElement {
        public static void main(String[] args) {
            int[] arr = {10, 20, 4, 45, 99};
            int max = findMax(arr);
            System.out.println("Maximum element: " + max);
        }
    
        public static int findMax(int[] arr) {
            int max = arr[0];
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Maximum element: 99

### **Q167.****Write a Java program to calculate the sum of all elements in a 2D array.**

*   Java

### Java

    public class Sum2DArray {
        public static void main(String[] args) {
            int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int sum = 0;
    
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[i][j];
                }
            }
    
            System.out.println("Sum of all elements: " + sum);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Sum of all elements: 45

### **Q168.****Write a Java program to find the transpose of a matrix.**

*   Java

### Java

    public class TransposeMatrix {
        public static void main(String[] args) {
            int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int[][] transpose = new int[matrix[0].length][matrix.length];
    
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }
    
            System.out.println("Transpose of the matrix:");
            for (int i = 0; i < transpose.length; i++) {
                for (int j = 0; j < transpose[0].length; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Transpose of the matrix:
    1 4 7 
    2 5 8 
    3 6 9

### **Q169.****Write a Java program to convert a binary number to decimal.**

*   Java

### Java

    public class BinaryToDecimal {
        public static void main(String[] args) {
            String binary = "1010";
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Decimal of " + binary + " is: " + decimal);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Decimal of 1010 is: 10

### **Q170.****Write a Java program to find the power of a number using recursion.**

*   Java

### Java

    public class PowerRecursion {
        public static void main(String[] args) {
            int base = 2, exp = 5;
            System.out.println(base + "^" + exp + " = " + power(base, exp));
        }
    
        public static int power(int base, int exp) {
            if (exp == 0)
                return 1;
            return base * power(base, exp - 1);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    2^5 = 32

### **Q171.****Write a Java program to implement a simple calculator (addition, subtraction, multiplication, division).**

*   Java

### Java

    import java.util.Scanner;
    
    public class SimpleCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            System.out.print("Choose operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);
    
            double result;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operation");
                    return;
            }
            System.out.println("Result: " + result);
            scanner.close();
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Enter first number: 10
    Enter second number: 5
    Choose operation (+, -, *, /): +
    Result: 15.0

### **Q172.What is the output of the following code?**

*   Java

### Java

    public class Main {
       public static void main(String[] args) {
           String str1 = "Hello";
           String str2 = "Hello";
           String str3 = new String("Hello");
           
           System.out.println(str1 == str2);
           System.out.println(str1 == str3);
           System.out.println(str1.equals(str3));
       }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    true
    false
    true

### **Q173.****Write a Java program to find the intersection of two arrays.**

*   Java

### Java

    import java.util.HashSet;
    
    public class IntersectionArrays {
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {4, 5, 6, 7, 8};
    
            HashSet<Integer> set = new HashSet<>();
            for (int i : arr1) {
                set.add(i);
            }
    
            System.out.print("Intersection: ");
            for (int i : arr2) {
                if (set.contains(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Intersection: 4 5

### **Q174.****Write a Java program to find the maximum and minimum number in an array.**

*   Java

### Java

    public class MaxMinInArray {
        public static void main(String[] args) {
            int[] arr = {10, 20, 5, 25, 15};
            int max = arr[0], min = arr[0];
    
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
    
            System.out.println("Maximum number is: " + max);
            System.out.println("Minimum number is: " + min);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Maximum number is: 25
    Minimum number is: 5

### **Q175.****Write a Java program to find the sum of the first n natural numbers.**

*   Java

### Java

    public class SumNaturalNumbers {
        public static void main(String[] args) {
            int n = 10;
            int sum = n * (n + 1) / 2;
            System.out.println("Sum of first " + n + " natural numbers: " + sum);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Sum of first 10 natural numbers: 55

### **Q176.****Write a Java program to find the common elements between two arrays.**

*   Java

### Java

    import java.util.HashSet;
    
    public class CommonElements {
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {3, 4, 5, 6, 7};
    
            HashSet<Integer> set = new HashSet<>();
            for (int i : arr1) {
                set.add(i);
            }
    
            System.out.print("Common elements: ");
            for (int i : arr2) {
                if (set.contains(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Common elements: 3 4 5

### **Q177.****Write a Java program to find the largest element in each row of a 2D array.**

*   Java

### Java

    public class LargestInRow {
        public static void main(String[] args) {
            int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    
            for (int i = 0; i < arr.length; i++) {
                int max = arr[i][0];
                for (int j = 1; j < arr[i].length; j++) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }
                }
                System.out.println("Largest element in row " + (i + 1) + ": " + max);
            }
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Largest element in row 1: 3
    Largest element in row 2: 6
    Largest element in row 

### **Q178.****Write a Java program to reverse a linked list.**

*   Java

### Java

    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public class ReverseLinkedList {
        public static Node reverse(Node head) {
            Node prev = null;
            Node current = head;
            Node next = null;
    
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }
    
        public static void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    
        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
    
            System.out.println("Original Linked List:");
            printList(head);
    
            head = reverse(head);
    
            System.out.println("\nReversed Linked List:");
            printList(head);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Original Linked List:
    1 2 3 4 
    Reversed Linked List:
    4 3 2 1

### **Q179.****Write a Java program to remove duplicates from an array.**

*   Java

### Java

    import java.util.Arrays;
    import java.util.LinkedHashSet;
    
    public class RemoveDuplicates {
        public static void main(String[] args) {
            Integer[] arr = {1, 2, 2, 3, 4, 4, 5};
            LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
    
            Integer[] newArr = set.toArray(new Integer[0]);
            System.out.println("Array after removing duplicates: " + Arrays.toString(newArr));
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Array after removing duplicates: [1, 2, 3, 4, 5]

### **Q180.****Write a Java program to convert a decimal number to binary.**

*   Java

### Java

    public class DecimalToBinary {
        public static void main(String[] args) {
            int decimal = 10;
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary of " + decimal + " is: " + binary);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Binary of 10 is: 1010

### **Q181.****Write a Java program to implement linear search.**

*   Java

### Java

    public class LinearSearch {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50};
            int target = 30;
            int index = linearSearch(arr, target);
    
            if (index == -1) {
                System.out.println("Element not found.");
            } else {
                System.out.println("Element found at index: " + index);
            }
        }
    
        public static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Element found at index: 2

### **Q182.****Write a Java program to check if a number is a power of two.**

*   Java

### Java

    public class PowerOfTwo {
        public static void main(String[] args) {
            int num = 16;
            boolean result = isPowerOfTwo(num);
            if (result) {
                System.out.println(num + " is a power of two.");
            } else {
                System.out.println(num + " is not a power of two.");
            }
        }
    
        public static boolean isPowerOfTwo(int num) {
            if (num <= 0) {
                return false;
            }
            return (num & (num - 1)) == 0;
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    16 is a power of two.

### **Q183.****Write a Java program to implement binary search.**

*   Java

### Java

    import java.util.Arrays;
    
    public class BinarySearch {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50};
            int target = 30;
            Arrays.sort(arr);  // Binary search requires sorted array
            int index = binarySearch(arr, target, 0, arr.length - 1);
    
            if (index == -1) {
                System.out.println("Element not found.");
            } else {
                System.out.println("Element found at index: " + index);
            }
        }
    
        public static int binarySearch(int[] arr, int target, int low, int high) {
            if (low > high) {
                return -1;
            }
    
            int mid = (low + high) / 2;
    
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return binarySearch(arr, target, low, mid - 1);
            } else {
                return binarySearch(arr, target, mid + 1, high);
            }
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Element found at index: 2

### **Q184.****Write a Java program to swap two numbers without using a temporary variable.**

*   Java

### Java

    public class SwapNumbers {
        public static void main(String[] args) {
            int a = 10, b = 20;
    
            System.out.println("Before swapping: a = " + a + ", b = " + b);
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("After swapping: a = " + a + ", b = " + b);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Before swapping: a = 10, b = 20
    After swapping: a = 20, b = 10

### **Q185.****Write a Java program to find the second largest number in an array.**

*   Java

### Java

    public class SecondLargest {
        public static void main(String[] args) {
            int[] arr = {10, 20, 4, 45, 99};
            int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
    
            for (int num : arr) {
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num != first) {
                    second = num;
                }
            }
    
            if (second == Integer.MIN_VALUE) {
                System.out.println("No second largest element.");
            } else {
                System.out.println("Second largest number: " + second);
            }
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Second largest number: 45

### **Q186.****Write a Java program to find the factorial of a number using recursion.**

*   Java

### Java

    public class FactorialRecursion {
        public static void main(String[] args) {
            int num = 5;
            System.out.println("Factorial of " + num + " is: " + factorial(num));
        }
    
        public static int factorial(int num) {
            if (num == 0) {
                return 1;
            }
            return num * factorial(num - 1);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Factorial of 5 is: 120

### **Q187.****Write a Java program to check if a number is a perfect square.**

*   Java

### Java

    public class PerfectSquare {
        public static void main(String[] args) {
            int num = 16;
            if (isPerfectSquare(num)) {
                System.out.println(num + " is a perfect square.");
            } else {
                System.out.println(num + " is not a perfect square.");
            }
        }
    
        public static boolean isPerfectSquare(int num) {
            int sqrt = (int) Math.sqrt(num);
            return sqrt * sqrt == num;
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    16 is a perfect square.

### **Q188.****Write a Java program to implement selection sort.**

*   Java

### Java

    import java.util.Arrays;
    
    public class SelectionSort {
        public static void main(String[] args) {
            int[] arr = {29, 10, 14, 37, 13};
            selectionSort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }
    
        public static void selectionSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIdx]) {
                        minIdx = j;
                    }
                }
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Sorted array: [10, 13, 14, 29, 37]

### **Q189.****Write a Java program to check if two strings are anagrams.**

*   Java

### Java

    import java.util.Arrays;
    
    public class AnagramCheck {
        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";
    
            if (areAnagrams(str1, str2)) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        }
    
        public static boolean areAnagrams(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    listen and silent are anagrams.

### **Q190.****Write a Java program to find the missing number in an array of consecutive numbers.**

*   Java

### Java

    public class MissingNumber {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 5, 6};
            int n = arr.length + 1;
            int totalSum = n * (n + 1) / 2;
            int arrSum = 0;
    
            for (int num : arr) {
                arrSum += num;
            }
    
            int missingNumber = totalSum - arrSum;
            System.out.println("The missing number is: " + missingNumber);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    The missing number is: 4

### **Q191.****Write a Java program to check if a string is a palindrome.**

*   Java

### Java

    public class PalindromeCheck {
        public static void main(String[] args) {
            String str = "madam";
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }
    
        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;
    
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    madam is a palindrome.

### **Q192.****Write a Java program to find the longest substring without repeating characters.**

*   Java

### Java

    import java.util.HashSet;
    
    public class LongestSubstring {
        public static void main(String[] args) {
            String str = "abcabcbb";
            System.out.println("Longest substring without repeating characters: " + longestUniqueSubstring(str));
        }
    
        public static int longestUniqueSubstring(String str) {
            HashSet<Character> set = new HashSet<>();
            int maxLength = 0, i = 0, j = 0;
    
            while (i < str.length() && j < str.length()) {
                if (!set.contains(str.charAt(j))) {
                    set.add(str.charAt(j++));
                    maxLength = Math.max(maxLength, j - i);
                } else {
                    set.remove(str.charAt(i++));
                }
            }
            return maxLength;
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Longest substring without repeating characters: 3

### **Q193.****Write a Java program to merge two sorted arrays.**

*   Java

### Java

    import java.util.Arrays;
    
    public class MergeSortedArrays {
        public static void main(String[] args) {
            int[] arr1 = {1, 3, 5, 7};
            int[] arr2 = {2, 4, 6, 8};
            int[] mergedArr = mergeArrays(arr1, arr2);
            System.out.println("Merged array: " + Arrays.toString(mergedArr));
        }
    
        public static int[] mergeArrays(int[] arr1, int[] arr2) {
            int[] mergedArr = new int[arr1.length + arr2.length];
            int i = 0, j = 0, k = 0;
    
            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    mergedArr[k++] = arr1[i++];
                } else {
                    mergedArr[k++] = arr2[j++];
                }
            }
    
            while (i < arr1.length) {
                mergedArr[k++] = arr1[i++];
            }
    
            while (j < arr2.length) {
                mergedArr[k++] = arr2[j++];
            }
    
            return mergedArr;
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Merged array: [1, 2, 3, 4, 5, 6, 7, 8]

### **Q194.****Write a Java program to find the GCD (Greatest Common Divisor) of two numbers.**

*   Java

### Java

    public class GCD {
        public static void main(String[] args) {
            int num1 = 56;
            int num2 = 98;
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2));
        }
    
        public static int findGCD(int num1, int num2) {
            if (num2 == 0) {
                return num1;
            }
            return findGCD(num2, num1 % num2);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    GCD of 56 and 98 is: 14

### **Q195.****Write a Java program to find the LCM (Least Common Multiple) of two numbers.**

*   Java

### Java

    public class LCM {
        public static void main(String[] args) {
            int num1 = 12;
            int num2 = 18;
            System.out.println("LCM of " + num1 + " and " + num2 + " is: " + findLCM(num1, num2));
        }
    
        public static int findLCM(int num1, int num2) {
            return (num1 * num2) / findGCD(num1, num2);
        }
    
        public static int findGCD(int num1, int num2) {
            if (num2 == 0) {
                return num1;
            }
            return findGCD(num2, num1 % num2);
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    LCM of 12 and 18 is: 36

### **Q196.****Write a Java program to find the first non-repeating character in a string.**

*   Java

### Java

    import java.util.LinkedHashMap;
    import java.util.Map;
    
    public class FirstNonRepeatingCharacter {
        public static void main(String[] args) {
            String str = "swiss";
            System.out.println("First non-repeating character: " + findFirstNonRepeating(str));
        }
    
        public static Character findFirstNonRepeating(String str) {
            Map<Character, Integer> charCountMap = new LinkedHashMap<>();
    
            for (char c : str.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
    
            for (char c : str.toCharArray()) {
                if (charCountMap.get(c) == 1) {
                    return c;
                }
            }
    
            return null;
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    First non-repeating character: w

### **Q197.****Write a Java program to implement the Sieve of Eratosthenes algorithm to find all prime numbers up to a given number.**

*   Java

### Java

    import java.util.Arrays;
    
    public class SieveOfEratosthenes {
        public static void main(String[] args) {
            int n = 30;
            boolean[] primes = sieveOfEratosthenes(n);
            System.out.println("Prime numbers up to " + n + ": ");
            for (int i = 2; i <= n; i++) {
                if (primes[i]) {
                    System.out.print(i + " ");
                }
            }
        }
    
        public static boolean[] sieveOfEratosthenes(int n) {
            boolean[] primes = new boolean[n + 1];
            Arrays.fill(primes, true);
            primes[0] = primes[1] = false;
    
            for (int i = 2; i * i <= n; i++) {
                if (primes[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        primes[j] = false;
                    }
                }
            }
            return primes;
        }
    }

![](https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Prime numbers up to 30: 
    2 3 5 7 11 13 17 19 23 29 

### **Q198.****Write a Java program to rotate an array to the right by a given number of steps.**

*   Java

### Java

    import java.util.Arrays;
    
    public class RotateArray {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int k = 2;
            rotate(arr, k);
            System.out.println("Array after rotation: " + Arrays.toString(arr));
        }
    
        public static void rotate(int[] arr, int k) {
            k = k % arr.length;
            reverse(arr, 0, arr.length - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, arr.length - 1);
        }
    
        public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

![](https://files.codingninjas.in/fluent_code-24-filled-29586.svg)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Array after rotation: [4, 5, 1, 2, 3]

### **Q199.****Write a Java program to reverse the words in a sentence.**

*   Java

### Java

    public class ReverseWords {
        public static void main(String[] args) {
            String sentence = "Hello World from Java";
            String reversed = reverseWords(sentence);
            System.out.println("Reversed sentence: " + reversed);
        }
    
        public static String reverseWords(String sentence) {
            String[] words = sentence.split(" ");
            StringBuilder reversed = new StringBuilder();
            
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]).append(" ");
            }
            
            return reversed.toString().trim();
        }
    }

![](https://files.codingninjas.in/fluent_code-24-filled-29586.svg)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    Reversed sentence: Java from World Hello

### **Q200.****Write a Java program to find the nth Fibonacci number using recursion.**

*   Java

### Java

    public class Fibonacci {
        public static void main(String[] args) {
            int n = 10;
            System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
        }
    
        public static int fib(int n) {
            if (n <= 1) {
                return n;
            }
            return fib(n - 1) + fib(n - 2);
        }
    }

![](https://files.codingninjas.in/fluent_code-24-filled-29586.svg)

You can also try this code with Online Java Compiler

[Run Code](/code360/online-compiler/online-java-compiler)

**Output:**

    The 10th Fibonacci number is: 55

**Java Difference Interview Questions**
---------------------------------------

### **Q201. Differentiate between Failsafe and Failfast**

Parameters

**Failsafe**

**Failfast**

**Behavior**

Iterates over a copy of the collection to avoid errors

Fails immediately upon detecting structural changes

**Concurrent Modification**

Does not throw ConcurrentModificationException

Throws ConcurrentModificationException

**Implementation**

Uses a separate copy or snapshot during iteration

Directly iterates over the actual collection

**Performance**

Higher memory usage due to a copy

More efficient as it does not create a copy

**Examples**

CopyOnWriteArrayList, ConcurrentHashMap

ArrayList, HashMap, HashSet

### **Q202. Differentiate between List and Set**

**Parameters**

**List**

**Set**

**Duplicates**

Allows duplicate elements

Does not allow duplicate elements

**Order**

Maintains insertion order

Does not maintain insertion order (except LinkedHashSet)

**Null Values**

Allows multiple null values (e.g., ArrayList)

Allows at most one null value (in most implementations)

**Performance**

Generally faster for indexed access

Optimized for searching and uniqueness

**Examples**

ArrayList, LinkedList

HashSet, TreeSet, LinkedHashSet

### **Q203. Differentiate between HashMap and TreeMap**

**Parameters**

**HashMap**

**TreeMap**

**Ordering**

No specific order

Maintains natural or custom (via Comparator) order

**Performance**

Faster for most operations (O(1) for get/put)

Slower (O(log n) for get/put) due to tree structure

**Null Keys/Values**

Allows one null key and multiple null values

Does not allow null keys, but allows null values

**Underlying Structure**

Uses a hash table

Uses a Red-Black tree

**Examples**

HashMap, LinkedHashMap

TreeMap

### **Q204. Differentiate between Stack and Queue**

**Parameters**

**Stack**

**Queue**

**Order**

Follows **LIFO** (Last In, First Out)

Follows **FIFO** (First In, First Out)

**Operations**

push, pop, peek

add, remove, peek

**Use Cases**

Backtracking, parsing

Task scheduling, buffering

**Examples**

Stack (Legacy class)

LinkedList, PriorityQueue

### **Q205. Differentiate between PriorityQueue and TreeSet**

**Parameters**

**PriorityQueue**

**TreeSet**

**Ordering**

Natural order or custom Comparator; duplicates allowed

Sorted order, no duplicates

**Null Values**

Does not allow null elements

Does not allow null elements

**Performance**

O(log n) for insertion/removal

O(log n) for insertion/removal

**Use Cases**

Priority-based tasks, heaps

Unique elements in sorted order

### **Q206. Differentiate between Iterable and Iterator**

**Parameters**

**Iterable**

**Iterator**

**Definition**

Represents a collection that can be iterated

Used to traverse through elements in a collection

**Methods**

iterator()

hasNext(), next(), remove()

**Usage**

Enables for-each loop

Enables manual iteration

**Examples**

ArrayList, HashSet

Returned by iterator() on collections

### **Q207. Differentiate between HashMap and TreeMap**

**Parameters**

**HashMap**

**TreeMap**

**Ordering**

No specific order

Maintains natural or custom (via Comparator) order

**Performance**

Faster for most operations (O(1) for get/put)

Slower (O(log n) for get/put) due to tree structure

**Null Keys/Values**

Allows one null key and multiple null values

Does not allow null keys, but allows null values

**Underlying Structure**

Uses a hash table

Uses a Red-Black tree

**Examples**

HashMap, LinkedHashMap

TreeMap

### **Q208. Differentiate between List and Map**

**Parameters**

**List**

**Map**

**Data Structure**

Ordered collection of elements

Key-value pairs

**Duplicates**

Allows duplicates

Keys must be unique, values can be duplicates

**Null Values**

Allows multiple null values

Allows one null key and multiple null values

**Examples**

ArrayList, LinkedList

HashMap, TreeMap

### **Q209. Differentiate between HashSet and TreeSet**

**Parameters**

**HashSet**

**TreeSet**

**Ordering**

No specific order

Maintains sorted order

**Performance**

Faster (O(1) for most operations)

Slower (O(log n) for operations)

**Null Values**

Allows one null element

Does not allow null elements

**Examples**

HashSet, LinkedHashSet

TreeSet

### **Q210. Differentiate between Singly Linked List and Doubly Linked List**

**Parameters**

**Singly Linked List**

**Doubly Linked List**

**Links**

Each node points to the next

Each node points to both next and previous nodes

**Memory Usage**

Requires less memory

Requires more memory due to additional pointer

**Traversal**

Can be traversed in one direction

Can be traversed in both directions

**Performance**

Simpler and faster

Slightly slower due to additional operations

### **Q211. Differentiate between Queue and Deque**

**Parameters**

**Queue**

**Deque**

**Order**

Follows FIFO

Supports FIFO and LIFO

**Operations**

add, remove, peek

addFirst, addLast, removeFirst, removeLast

**Examples**

LinkedList, PriorityQueue

ArrayDeque, LinkedList

**Top Java MCQs**
-----------------

### 1. Which of the following is not a Java feature?

a) Object-oriented  
b) Use of pointers  
c) Portable  
d) Dynamic and Extensible  
**Answer:** b) Use of pointers

### 2. What is the default value of a local variable?

a) null  
b) 0  
c) Undefined  
d) Garbage value  
**Answer:** c) Undefined

### 3. Which of these is a valid keyword in Java?

a) interface  
b) string  
c) float  
d) unsigned  
**Answer:** a) interface

### 4. What will be the output of the following code?

    int x = 10;
    int y = 20;
    System.out.println(x + y + " is the result");
    

a) 30 is the result  
b) 1020 is the result  
c) Compilation error  
d) Runtime error  
**Answer:** a) 30 is the result

### 5. In Java, javac is used for:

a) Interpreting Java bytecode  
b) Compiling Java source code  
c) Debugging Java applications  
d) Executing Java programs  
**Answer:** b) Compiling Java source code

### 6. What is the size of an int data type in Java?

a) 16 bits  
b) 8 bits  
c) 32 bits  
d) 64 bits  
**Answer:** c) 32 bits

### 7. Which method is called first in a Java application?

a) start()  
b) init()  
c) main()  
d) run()  
**Answer:** c) main()

### 8. What is the output of the following code?

    String str = "Hello";
    str.concat("World");
    System.out.println(str);
    

a) Hello  
b) HelloWorld  
c) World  
d) Compilation error  
**Answer:** a) Hello

### 9. Which of the following is not a control statement in Java?

a) if  
b) for  
c) break  
d) print  
**Answer:** d) print

### 10. What is the return type of the hashCode() method in Java?

a) Object  
b) int  
c) double  
d) void  
**Answer:** b) int

**Frequently Asked Questions**
------------------------------

### **How to prepare Java interview questions?**

Study fundamental concepts like OOP, data structures, and multithreading to prepare for Java interview questions. Practice coding, review common questions, and understand real-world applications.

### **What are the most important topics of Java?**

Java's crucial topics include OOP concepts, data types, control structures, exception handling, classes and objects, inheritance, polymorphism, collections, and multithreading.

### **What is a Java Developer's Salary in India?**

The average annual salary for a Java developer in India ranges from ₹3.5 lakh to ₹10 lakh, depending on experience, location, and expertise. Senior professionals can earn up to ₹20 lakh or more in top IT hubs like Bangalore and Pune.

### **What are the Essential Skills Required for a Java Developer?**

Key skills for Java developers include proficiency in core Java, object-oriented programming, frameworks like Spring and Hibernate, database management, version control (e.g., Git), and familiarity with tools for testing and debugging.

**Conclusion**
--------------

In this article, we have discussed Java interview questions. Preparing for Java interview questions is essential for anyone aspiring to excel in the field of software development. The breadth and depth of questions range from fundamental concepts to advanced programming techniques, reflecting the diverse skill set required in today's tech industry. By mastering these questions and practicing coding problems, candidates can build confidence and enhance their problem-solving abilities.

Some of the articles you might find useful:

*   [**Data structures and algorithms using Java**](https://www.codingninjas.com/programs/java-dsa-course)  
    
*   [**Why is Java Platform Independent**](https://www.naukri.com/code360/library/how-is-java-platform-independent)  
    
*   [**Java Tokens**](https://www.naukri.com/code360/library/java-tokens)