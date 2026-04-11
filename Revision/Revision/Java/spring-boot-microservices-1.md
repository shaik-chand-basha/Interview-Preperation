1. What is the Spring Framework?
---------------------------------

Spring Framework is an open-source application framework for the Java platform that provides comprehensive infrastructure support for developing Java applications. Its core features include Inversion of Control (IoC), Aspect-Oriented Programming (AOP), and support for enterprise services such as transactions and messaging.

2. Who is the creator of the Spring Framework?
-----------------------------------------------

Rod Johnson created the Spring Framework in 2003.

3. Explain the key features of the Spring Framework.
-----------------------------------------------------

*   **Inversion of Control (IoC):** Manages the lifecycle and configuration of application objects.
*   **Aspect-Oriented Programming (AOP):** Separates cross-cutting concerns (e.g., logging, security).
*   **Transaction Management:** Declarative and programmatic transaction management.
*   **Spring MVC:** A full-featured web framework for building web applications.

4. What is Inversion of Control (IoC)?
---------------------------------------

IoC is a principle where the control of object creation, configuration, and lifecycle is transferred from the application code to the Spring container. This promotes loose coupling and easier testing.

5. What is Dependency Injection (DI)?
--------------------------------------

DI is a design pattern used to implement IoC, allowing dependencies to be injected into an object rather than the object creating the dependencies itself. This can be achieved through constructor injection, setter injection, or field injection.

6. What are the types of Dependency Injection in Spring?
---------------------------------------------------------

*   **Constructor Injection:** Dependencies are provided through a class constructor.
*   **Setter Injection:** Dependencies are provided through setter methods.
*   **Field Injection:** Dependencies are injected directly into the fields (not recommended due to issues with immutability and testability).

7. What is a Spring Bean?
--------------------------

A Spring Bean is an object that is instantiated, assembled, and managed by the Spring IoC container. Beans are defined in the Spring configuration file or using annotations.

8. How do you define a Spring Bean?
------------------------------------

*   **XML Configuration:** `<bean id="beanId" class="com.example.BeanClass"/>`
*   **Annotations:** Using `@Component`, `@Service`, `@Repository`, `@Controller`
*   **Java Configuration:** Using `@Bean` in a `@Configuration` class.

9. What is the purpose of the `@Component` annotation?
-------------------------------------------------------

`@Component` is a generic stereotype annotation indicating that a class is a Spring-managed component. It can be used as a base for more specific annotations like `@Service`, `@Repository`, and `@Controller`.

10. How do you enable component scanning in Spring?
----------------------------------------------------

Component scanning can be enabled using the `@ComponentScan` annotation in a configuration class:
```java
@Configuration  
@ComponentScan(basePackages = "com.medium")  
public class AppConfig {  
}
```
11. What is a Spring Configuration file?
-----------------------------------------

A Spring Configuration file defines beans, their dependencies, and other configurations such as transactions and AOP settings. It can be an XML file, Java-based configuration class, or annotation-based.

12. What is the difference between `@Component`, `@Service`, `@Repository`, and `@Controller`?
-----------------------------------------------------------------------------------------------

*   `@Component`: General-purpose stereotype annotation.
*   `@Service`: Indicates a service layer component.
*   `@Repository`: Indicates a data access layer component and provides exception translation.
*   `@Controller`: Indicates a controller in the Spring MVC framework, handling web requests.

13. What is a Spring Application Context?
------------------------------------------

The Spring Application Context is an extension of the BeanFactory that provides additional functionalities such as event propagation, declarative mechanisms to create a bean, and support for internationalization (i18n).

14. What is the difference between `ApplicationContext` and `BeanFactory`?
---------------------------------------------------------------------------

`BeanFactory` provides the basic IoC container functionality, whereas `ApplicationContext` is a more advanced container that includes enterprise-specific functionalities such as event propagation, declarative mechanisms to create a bean, and different ways to look up a bean.

15. What is Spring Boot?
-------------------------

Spring Boot is an extension of the Spring Framework that simplifies the development of new Spring applications. It provides pre-configured templates, a convention-over-configuration approach, and an embedded server to reduce boilerplate code.

16. What is the purpose of `application.properties` or `application.yml` in Spring Boot?
-----------------------------------------------------------------------------------------

These files are used for externalizing configuration properties, allowing you to define settings such as server ports, database connections, and application-specific properties.

17. How do you run a Spring Boot application?
----------------------------------------------

A Spring Boot application can be run using the `SpringApplication.run()` method in the main application class, or by executing the JAR file:
```java
@SpringBootApplication  
public class MyApplication {  
    public static void main(String[] args) {  
        SpringApplication.run(MyApplication.class, args);  
    }  
}
```
18. What is Spring MVC?
------------------------

Spring MVC is a module of the Spring Framework that provides a model-view-controller architecture for developing web applications. It separates the application logic, user interface, and input control.

19. What is a Controller in Spring MVC?
----------------------------------------

A Controller in Spring MVC handles incoming HTTP requests, processes them, and returns appropriate responses. It is typically annotated with `@Controller`.

20. What is the use of `@RequestMapping` annotation?
-----------------------------------------------------

`@RequestMapping` is used to map web requests to specific handler methods in a controller:
```java
@Controller  
public class MyController {  
    @RequestMapping("/home")  
    public String home() {  
        return "home";  
    }  
}
```
21. What is the difference between `@GetMapping` and `@PostMapping`?
---------------------------------------------------------------------

*   `@GetMapping`: Maps HTTP GET requests to handler methods.
*   `@PostMapping`: Maps HTTP POST requests to handler methods.

22. What is Spring AOP?
------------------------

Spring AOP (Aspect-Oriented Programming) is a programming paradigm that provides mechanisms to define cross-cutting concerns (e.g., logging, security) separately from the main business logic. It uses aspects, advice, and pointcuts to modularize these concerns.

23. What is a Pointcut in Spring AOP?
--------------------------------------

A Pointcut is an expression that matches join points, allowing advice to be applied at matched locations. For example, a pointcut can be defined to match all methods in a particular package.

24. What is an Advice in Spring AOP?
-------------------------------------

An Advice is an action taken by an aspect at a particular join point. Types of advice include:

*   `@Before`: Executed before the join point.
*   `@After`: Executed after the join point.
*   `@Around`: Surrounds the join point, allowing pre- and post-processing.
*   `@AfterReturning`: Executed after a method returns successfully.
*   `@AfterThrowing`: Executed if a method throws an exception.

25. What is a Join Point in Spring AOP?
----------------------------------------

A Join Point is a point during the execution of a program, such as the execution of a method or handling an exception, where an aspect can be applied.

26. What is Spring Data JPA?
-----------------------------

Spring Data JPA is a part of the larger Spring Data family that makes it easier to implement JPA-based repositories. It reduces boilerplate code and provides advanced features like pagination and auditing.

1.  What is the purpose of `@Entity` annotation?
-------------------------------------------------

The `@Entity` annotation specifies that a class is an entity and is mapped to a database table. It is used in JPA and Hibernate.

28. How do you define a primary key in JPA?
--------------------------------------------

A primary key is defined using the `@Id` annotation:
```java
@Entity  
public class User {  
    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;  
    // other fields, getters, and setters  
}
```
29. What is Spring Transaction Management?
-------------------------------------------

Spring Transaction Management provides a consistent approach to transaction management that works in various environments. It supports both declarative and programmatic transaction management.

30. What is the use of `@Transactional` annotation?
----------------------------------------------------

The `@Transactional` annotation is used to demarcate transaction boundaries on methods or classes. It ensures that a method or all methods in a class are executed within a transactional context.

31. What is a Spring RestController?
-------------------------------------

A `RestController` in Spring is a controller that handles RESTful web services requests and responses. It is annotated with `@RestController`, which combines `@Controller` and `@ResponseBody`.

32. How do you handle exceptions in Spring MVC?
------------------------------------------------

Exceptions in Spring MVC can be handled using:

*   `@ExceptionHandler`: Handles exceptions at the controller level.
*   `@ControllerAdvice`: Handles exceptions globally across all controllers.
*   `HandlerExceptionResolver`: Configures custom exception handlers in XML or Java configuration.

33. What is Spring Security?
-----------------------------

Spring Security is a framework that provides comprehensive security services for Java applications. It offers authentication, authorization, and protection against common vulnerabilities such as CSRF and session fixation.

34. What is OAuth2?
--------------------

OAuth2 is an authorization framework that enables applications to obtain limited access to user accounts on an HTTP service. It works by delegating user authentication to the service that hosts the user account and authorizing third-party applications to access the user account.

35. What is Spring Cloud?
--------------------------

Spring Cloud is a suite of tools and frameworks that provides solutions to common patterns in distributed systems, such as configuration management, service discovery, circuit breakers, and distributed messaging.

36. What is a Microservice?
----------------------------

A Microservice is an architectural style that structures an application as a collection of loosely coupled services. Each service is independently deployable and responsible for a specific piece of functionality.

37. What is the use of `@EnableEurekaServer` annotation?
---------------------------------------------------------

The `@EnableEurekaServer` annotation is used to make your Spring Boot application a Eureka Server, which acts as a service registry for service discovery in a microservices architecture.

38. What is a Circuit Breaker?
-------------------------------

A Circuit Breaker is a design pattern used to detect failures and encapsulate the logic of preventing a failure from constantly recurring during maintenance, temporary external system failure, or unexpected system difficulties.

39. What is the use of `@HystrixCommand` annotation?
-----------------------------------------------------

The `@HystrixCommand` annotation is used to define a fallback method for a service method that might fail. It provides a way to handle service degradation gracefully:
```java
@HystrixCommand(fallbackMethod = "fallback")  
public String reliable() {  
    // method logic  
}

public String fallback() {  
    return "Fallback response";  
}
```
40. What is Spring Batch?
--------------------------

Spring Batch is a lightweight, comprehensive batch framework designed to enable the development of robust batch applications. It provides reusable functions for processing large volumes of records, including logging/tracing, transaction management, and job restart.

41. What is Chunk-Oriented Processing in Spring Batch?
-------------------------------------------------------

Chunk-Oriented Processing involves reading data, processing it, and writing it in chunks, thereby ensuring efficient resource utilization and allowing for checkpointing and restartability.

42. What is the use of `@EnableBatchProcessing` annotation?
------------------------------------------------------------

The `@EnableBatchProcessing` annotation is used to enable Spring Batch features and provide a base configuration for setting up batch jobs.

43. What is Spring AMQP?
-------------------------

Spring AMQP is a project that applies core Spring concepts to the development of AMQP-based messaging solutions. It provides templates for sending and receiving messages and support for message-driven POJOs.

44. What is the difference between `Queue` and `Topic` in messaging?
---------------------------------------------------------------------

*   **Queue:** A point-to-point communication model where messages are sent to a single consumer.
*   **Topic:** A publish-subscribe communication model where messages are broadcasted to multiple subscribers.

45. What is Spring WebFlux?
----------------------------

Spring WebFlux is a reactive web framework in Spring that provides support for building reactive web applications with a non-blocking, event-driven architecture.

46. What is the difference between Spring MVC and Spring WebFlux?
------------------------------------------------------------------

*   **Spring MVC:** Synchronous, blocking framework for building web applications.
*   **Spring WebFlux:** Asynchronous, non-blocking framework for building reactive web applications.

47. What is a Reactive Stream?
-------------------------------

Reactive Streams is a standard for asynchronous stream processing with non-blocking backpressure. It enables processing of potentially unlimited data streams in a resilient manner.

48. What is `@FunctionalInterface` in Java?
--------------------------------------------

`@FunctionalInterface` is an interface with exactly one abstract method, used primarily in lambda expressions and method references. It ensures that the interface remains functional:
```java
@FunctionalInterface  
public interface MyFunctionalInterface {  
    void execute();  
}
```
49. What is the use of `WebClient` in Spring WebFlux?
------------------------------------------------------

`WebClient` is a non-blocking, reactive client for making HTTP requests. It replaces the older `RestTemplate` in reactive applications:
```java
WebClient client = WebClient.create();  
Mono<String> response = client.get()  
    .uri("https://example.com")  
    .retrieve()  
    .bodyToMono(String.class);
```
50. What are some advantages of using Spring Framework?
--------------------------------------------------------

*   **Comprehensive Infrastructure Support:** Provides a wide range of tools and services.
*   **Loose Coupling:** Promotes better design through DI and IoC.
*   **Modularization:** Allows separation of cross-cutting concerns via AOP.
*   **Transaction Management:** Simplifies managing transactions.
*   **Strong Community:** Extensive documentation and active community support.
