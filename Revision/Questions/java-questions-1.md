

# Java Spring Interview Questions

## Core Java


1. **String Handling**
   - What are different ways to create a String object?
   - Why is String immutable or final in Java?
   - What is the String Pool?
   - How do you compare two strings in Java?
   - Explain `StringBuilder` and `StringBuffer`. When should each be used?
   

2. **Object-Oriented Programming**
   - Why doesn’t Java support multiple inheritance?
   - What is the difference between overloading and overriding (Dynamic and compile time polymorphism) ?
   - What is the purpose of the `final`, `static`, `finally`, `finalize`, `this`, `super` keywords?
   - What is an abstract class, and how does it differ from an interface?
   - Can we create an object for an interface?

3. **Memory Management**
   - What is the difference between heap and stack memory?
   - Explain garbage collection in Java. How does it work?
   - What are memory leaks, and how can they be prevented in Java?
   - What are the different parts of Heap ( old and the new generation etc)
   - What algorithm JVM used to clean up memory (mark & sweep)

4. **Collections Framework**
   - How does HashMap work in Java?
   - What is the importance of `hashCode()` and `equals()` methods?
   - What are the differences between HashMap, TreeMap, Hashtable, and LinkedHashMap?
   - What is the difference between ArrayList and LinkedList?
   - How can we create a synchronized collection from a given collection?
   - Explain the difference between Set and List in Java.
   - How does ConcurrentHashMap work in Java?
   - What is the difference between fail-fast and fail-safe iterators?
   - How to use custome key in Map ( equals and hashcode implimentation)
   - what is hash collision in java?
   - What are the performance characteristics of ArrayList and LinkedList for operations like insertion, deletion, and retrieval?

5. **Exception Handling**
   - What is the difference between checked and unchecked exceptions?
   - Create a Custom Exception
   - Try , Catch & finally
   - When Finally block is not executed ( System.exit(), Infinite loop or system crush)
   - How does the try-with-resources statement work?
   - Explain the purpose of the `throw` and `throws` keywords.

6. **Threads and Concurrency**
   - Different ways to create a thread.
   - Explain Java Thread Safety and Synchronization.
   - What is the difference between `notify()` and `notifyAll()`?
   - What are the different states of a thread lifecycle?
   - What is the difference between `Runnable` and `Callable` in Java?
   - Volatile vs Atomatic variable with example
   - Type of Locks ( ReadWrite vs ReentrantLock)
   - What are daemon threads?
   - Difference between ReentrantLock and synchronized block.
   - Executor service vs Thread
   - ConcurrentHashMap vs Collections.synchronizedMap()
   - CountDownLatch vs cyclicbarrier
   - Sleep vs wait

7. **Design Patterns**
   - Explain different design patterns you have worked with, such as Singleton, Factory, Prototype, Proxy, and Builder.
   - Singleton - How can we break Singleton design pattern ( static class approach must)
   - Publisher/Subscriber (Pub/Sub) and Observer

8. **Miscellaneous**
   - What is an immutable class? How to create an immutable class?
   - How to avoid deadlock in Java?
   - What is the Just-In-Time (JIT) compiler?
   - Explain the concept of Serialization and Deserialization in Java.
   - What is Externalization
   - What is a Java ClassLoader, and what are its types?
   - How does the var keyword work in Java 10?
   - Switch Expressions
   - Records classes
   - Seailed classes
   - Text Blocks 
   - Pattern Matching for instanceof
   
9. **Java 8**
   - What are lambda expressions, and how are they used in Java 8?
   - What is the Streams API in Java 8, and what are its benefits?
   - Explain the difference between map and flatMap in Streams.
   - What are the different phases of a Stream ( stream -> Intermediator operation -> ternary Operation)
   - What is the difference between a sequential stream and a parallel stream?
   - Name some of the functional interfaces provided by Java 8.
   - What is a functional interface in Java 8?
   - What are default methods in interfaces, and why were they introduced in Java 8?
   - How can you implement a default method in an interface?
   - What is a static method in an interface, and how is it different from a default method?
   - How can you use Optional to avoid null checks in your code?
   - What are method references in Java 8?
   - Question about groupBy and Comparator chaining.
   - What is the CompletableFuture class in Java 8, and how does it improve asynchronous programming?
   - Future vs CompletableFuture
   - Stream Vs Collection?
   - What is Spliterator?
   - How to create a Functional Interface
   


## 1. **Core Java – OOP, Threads, Collections, Language Features**

- Explain OOPS
- Are Overloading and Overriding possible for static methods?
- Rules to follow when method overriding
- What is Effective final?
- Shallow Copy vs Deep Copy
- == vs equals()
- Singleton Class - explanation and code implementation
- What is Java String Pool?
- What is intern()?
- Explain Functional Interface.
- What are lambda functions?
- Types of Operations in Java 8 Streams
- Access modifiers and their visibility
- Functions of Java 8, 11, 17, 21
- Comparable vs Comparator
- What is volatile keyword?
- What is transient keyword?
- Does volatile provide atomicity?
- What is immutable class? and implementation
- What is synchronized?
- Synchronized vs Reentrant lock
- What are classloaders and types of classloaders
- Default vs Static Methods in Interfaces
- Can Another Interface extend a Functional Interface and add new methods?
- Types of variables present in interface
- What are Parallel Streams
- Iterable vs Iterator
- Exception vs Error
- What is Throwable?
- final vs finalize vs finally
- throw vs throws
- @NotNull vs @NotEmpty vs @NotBlank
- Serialization and Marshalling
- What is Reflection API?
- What are try-with resources?
- What is ThreadLocal variable?
- What is marker interface? and types
- Inbuilt functional interfaces present in java
- Collections vs Collection
- If a class is implementing two interfaces, having the same method in both the interfaces. How to call the specific method of second interface?

## 2. **Java Threads & Concurrency**

- What are threads?
- Differentiate Thread.start() and Thread.run()
- Thread Lifecycle
- How to create Threads?
- Types of Threads
- Types of locks
- What is Reentrant Lock?
- What are Atomic Variables?
- Threadsafe variant datastructures
- What are Thread Pools? - types, uses and advantages
- What is Executor Framework?
- How to create threadpools using executor framework?
- Callable vs Runnable
- How to start Thread3 after executing Thread1?
- How to achieve asynchronous communication using Spring Boot?
- What is CompletableFuture? and its uses
- Explain Thread.interrupt() and use cases
- What is Blocking Queue?
- Explain ForkJoin

## 3. **Spring Boot**

- Explain Spring Boot features
- Differentiate Spring and Spring Boot
- Starter dependencies in Spring Boot
- Explain @SpringBootApplication
- Explain SpringBoot architecture and flow
- @Primary vs @Qualifier and how to use them
- @RestController vs @Controller
- @RestControllerAdvice vs @ControllerAdvice
- Exception Handling and mechanisms used in Spring Boot
- How to customize port in Spring Boot?
- How to exclude a class from running in a Spring Boot application?
- Purpose of Profiles in Spring Boot
- What is Spring Boot Actuator?
- What are Spring Dev Tools?
- Lazy loading in Spring Boot
- Logging levels and their purpose
- What is Spring MVC?
- Bean Lifecycle
- Bean scope
- Types of IOC container
- What are Filters and Interceptors?
- What is Dispatcher Servlet?
- What are Caching works internally in Spring Boot?
- What is @PointCut?
- Explain Spring Batch and its internal working
- How to create Custom Annotation?
- How to create Custom Exception?
- How to start a SpringBoot application? - explain different scenarios
- Explain the internal process of deploying an API into cloud
- Steps to optimize Spring Boot application

## 4. **JPA / Hibernate / Database**

- JPA vs JDBC - their internal implementations
- What is entityManager? and its internal working
- What is Cascading?
- How Hibernate works along with JPA?
- Fetch in Hibernate (Eager vs Lazy loading)
- JPA Lifecycle
- Spring Boot JPA Relationships - OneToOne, OneToMany, ManyToOne, ManyToMany
- Purpose of @JoinColumn and mappedBy
- What is Composite Key?
- What is Cluster Index?
- Primary Key vs Unique key
- Association, Aggregation and Composition
- What are DAO and DTO
- Learn to write JPQL queries

## 5. **Microservices & Distributed Systems**

- What are microservices?
- How do microservices communicate?
- Monolithic vs Microservices
- Advantages of Monolithic over microservices
- What is service discovery?
- What is API Gateway?
- Explain Circuit Breaker Pattern
- Explain Saga Pattern
- Design Patterns in Microservices

## 6. **Cloud, Containerization & Deployment**

- What is containerization?
- What is the use of Docker?
- What is the use of Kubernetes?
- How to run a .jar file present in a pendrive?
- Explain the internal process of deploying an API into cloud

## 7. **REST APIs & HTTP**

- Explain POST, PUT and PATCH
- Explain HTTPs requests flow
- What are Idempotent HTTP methods?
- REST Principles
- 401 vs 403
- Stateless vs Stateful
- Types of States in REST
- Calling external api using Rest Template, Webclient etc
- How to retry API calls?
- Finally block is not executed when? - explain scenarios
- REST vs SOAP

## 8. **Spring Security & Authentication**

- Spring Security - internal working and complete flow
- Authentication vs Authorization
- Implementing JWT and its working
- Implementing OAuth2 and its working

## 9. **Design Principles & Patterns**

- What is Dependency Inversion?
- Explain Inversion of Control.
- What is AOP?
- SOLID principles
- ACID principles
- Design patterns and how are they used in your project

## 11. **Exception Handling**

- Exception Hierarchy
- Scenarios when ClassNotFound exception occurs and how to resolve them

## 12. **Kafka & Messaging**

- Kafka - Implementation, architecture, Topics, Partitions, Offsets, configurations, properties

## 13. **Servlets & Web**

- Servlet Lifecycle
- Listener vs API
- What is a webservice
- JSON vs JSONNode

## 14. **Memory Management & JVM**

- Garbage Collection - internal working and implementation
- Types of Memory in Java
- What is Metaspace?
- Internal implementation of HashMap
- What is Collision Handling?

## 15. **Testing**

- Junit 4 vs Junit 5
- How to Generate Swagger from API?



*Reference : 

[String Handling](https://medium.com/nerd-for-tech/concept-of-string-pool-and-string-object-creation-in-java-27ed2b3089f5)

[Collections Framework](https://medium.com/@harendrakumarrajpoot5/top-50-java-collections-interview-questions-you-need-to-know-e55fcdc8dbfb)

[Core Java](https://www.digitalocean.com/community/tutorials/core-java-interview-questions-and-answers)
