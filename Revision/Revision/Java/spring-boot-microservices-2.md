![100 spring boot interview questions](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/100_spring_boot_interview_questions_a9fb2b5ca7.png)

100 spring boot interview questions

### **1. Explain the concept of "convention over configuration" in Spring Boot.**[#](#1-explain-the-concept-of-convention-over-configuration-in-spring-boot)

Spring Boot uses the idea of "convention over configuration" to make development easier. Instead of asking you to write long configuration files, it provides default settings based on common use cases. This means if you follow standard project structure and naming, Spring Boot will automatically configure many things for you. You can still customize if needed, but in most cases, the default settings just work.

_Example:_

If you place your controller classes inside a specific package, Spring Boot will automatically scan and register them, no need to manually define each one.

### **2. What is the difference between Spring and Spring Boot?**[#](#2-what-is-the-difference-between-spring-and-spring-boot)

*   **Spring Framework** is a powerful tool to build Java applications, but it needs a lot of setup — like XML or Java-based configuration, server setup, dependency management, etc.
*   **Spring Boot** is built on top of Spring and removes that extra setup work. It uses auto-configuration, built-in servers (like Tomcat), and ready-to-use starter dependencies to help you create applications faster.

**In short:** Spring gives you tools, Spring Boot gives you a complete toolkit with default setup to start quickly.

### **3. How does Spring Boot simplify the development of Java applications?**[#](#3-how-does-spring-boot-simplify-the-development-of-java-applications)

Spring Boot helps developers by handling most of the setup automatically. Here's how:

*   **Auto-configuration**: It configures beans automatically based on the libraries you include.
*   **Starter dependencies**: Just add one starter (like `spring-boot-starter-web`) and it brings everything you need to build web apps.
*   **Embedded servers**: No need to install Tomcat or Jetty separately — they come built-in.
*   **Production-ready features**: With tools like **Spring Boot Actuator**, you get health checks, metrics, and more.
*   **Developer tools**: Features like hot-reloading (DevTools) make development faster and smoother.

### **4. What are the various ways to create a Spring Boot application?**[#](#4-what-are-the-various-ways-to-create-a-spring-boot-application)

1.  **Spring Initializr (**[**https://start.spring.io**](https://start.spring.io)**)**
    *   A web-based tool where you choose project type, dependencies, and download a ready-to-run project.
2.  **Spring Boot CLI**
    *   A command-line tool to quickly run Groovy-based Spring Boot apps.
3.  **Manual Setup**
    *   You can create a Maven or Gradle project and add Spring Boot dependencies manually.

Most developers prefer Spring Initializr because it’s simple and fast.

### **5. What is the role of the @SpringBootApplication annotation?**[#](#5-what-is-the-role-of-the-springbootapplication-annotation)

`@SpringBootApplication` is a shortcut annotation that combines three key annotations:

*   `@Configuration` – marks the class as a source of bean definitions.
*   `@EnableAutoConfiguration` – enables Spring Boot’s auto-configuration feature.
*   `@ComponentScan` – tells Spring to scan the current package and its sub-packages for components like controllers, services, etc.

So when you use `@SpringBootApplication`, you don’t need to write all three separately. It bootstraps the app and sets up everything you need to start.

### **6. Explain the concept of auto-configuration in Spring Boot.**[#](#6-explain-the-concept-of-auto-configuration-in-spring-boot)

Auto-configuration is one of the most useful features in Spring Boot. It tries to automatically configure your application based on the libraries you have on your classpath.

For example, if Spring Boot finds the `spring-boot-starter-data-jpa` dependency and a database like H2 or MySQL in your project, it will automatically configure a `DataSource`, JPA-related beans, and more — without you writing any configuration.

It works behind the scenes using `@Conditional` annotations and checks what classes or beans are present before applying default settings.

![Autoconfigurations](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/autoconfigurations_da72ecfc03.png)

Autoconfigurations

### **7. How does Spring Boot handle dependency management?**[#](#7-how-does-spring-boot-handle-dependency-management)

Spring Boot simplifies dependency management using **starter dependencies**. These are pre-defined sets of libraries bundled together for common tasks.

For example:

*   `spring-boot-starter-web` includes everything needed to build a REST API (Spring MVC, Jackson, embedded Tomcat, etc.).
*   `spring-boot-starter-data-jpa` brings in Hibernate, JPA API, and a database driver (like H2 for development).

Also, Spring Boot uses a **parent POM** (in Maven) to manage compatible versions of libraries, so you don’t have to worry about version conflicts.

### **8. What is the purpose of the application.properties or application.yml file?**[#](#8-what-is-the-purpose-of-the-applicationproperties-or-applicationyml-file)

Used for **externalized configuration** of:

*   DB connection
*   Logging
*   Server port
*   Custom application settings

### **9. How can you override the default properties in Spring Boot?**[#](#9-how-can-you-override-the-default-properties-in-spring-boot)

You can override default settings in multiple ways:

1.  `application.properties` or `application.yml`
2.  Environment variables
3.  Command-line arguments (like `-server.port=8081`)
4.  Programmatically using `SpringApplication.setDefaultProperties()`

Spring Boot follows a priority order. The general rule is:

**Command-line > Environment variables > application.properties/yml > Default values**

### **10. What is the purpose of the @Autowired annotation in Spring Boot?**[#](#10-what-is-the-purpose-of-the-autowired-annotation-in-spring-boot)

`@Autowired` is used for **dependency injection**, which means Spring will automatically create and inject required objects (beans) for you.

You can use `@Autowired` in:

*   **Fields**
*   **Constructors** (recommended)
*   **Setters**

For example, if you have a `UserService` bean and another class needs it, you just add `@Autowired` and Spring will handle the wiring — no need to `new` the object manually.

### **11. Explain the concept of profiles in Spring Boot.**[#](#11-explain-the-concept-of-profiles-in-spring-boot)

Spring Boot **profiles** help you manage different configurations for different environments — like development, testing, or production.

Each profile can have its own set of settings and beans. This way, you don’t have to change your main code when switching environments.

**Example:**

*   `application-dev.properties` for development
*   `application-prod.properties` for production

When you activate a profile, Spring Boot will load the related properties file and beans automatically.

### **12. How can you enable a specific profile in Spring Boot?**[#](#12-how-can-you-enable-a-specific-profile-in-spring-boot)

You can activate a profile in several ways:

1.  In `application.properties` or `application.yml`:



`spring.profiles.active=dev`

1.  As a command-line argument when starting the app:



`java -jar app.jar --spring.profiles.active=prod`

1.  As an environment variable:



`SPRING_PROFILES_ACTIVE=test`

Once a profile is active, Spring Boot loads the matching config and beans for that profile.

### **13. How does Spring Boot support the creation of RESTful web services?**[#](#13-how-does-spring-boot-support-the-creation-of-restful-web-services)

Spring Boot makes it easy to create REST APIs using Spring MVC. Here's how:

*   Use `@RestController` to create REST controllers (which return JSON/XML by default).
*   Use annotations like:
    *   `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` for endpoints
    *   `@PathVariable` to extract values from URLs
    *   `@RequestParam` to read query parameters
*   Supports **content negotiation** (returns data in requested format)
*   Integrates easily with tools like **Swagger/OpenAPI** for API documentation
*   Supports custom **exception handling** using `@ControllerAdvice`

### **14. What is Spring Data JPA, and how does it integrate with Spring Boot?**[#](#14-what-is-spring-data-jpa-and-how-does-it-integrate-with-spring-boot)

**Spring Data JPA** is a part of the Spring ecosystem that helps simplify database access using JPA (Java Persistence API).

Instead of writing SQL queries or boilerplate code, you just:

*   Create **Entity** classes (for database tables)
*   Create **Repository interfaces** (like `JpaRepository` or `CrudRepository`)
*   Spring Boot auto-configures everything based on your setup

Spring Boot automatically:

*   Sets up JPA configurations
*   Connects to your database
*   Implements basic CRUD methods (like `save()`, `findById()`)

This saves time and reduces repetitive code.

### **15. Explain the role of Spring Security in Spring Boot applications.**[#](#15-explain-the-role-of-spring-security-in-spring-boot-applications)

Spring Security provides a complete security solution for your application. It handles:

*   **Authentication** – verifying who the user is
*   **Authorization** – checking what the user is allowed to do

With Spring Boot, it’s easy to integrate Spring Security. It secures your REST endpoints or web pages by default and can support:

*   **Form login**
*   **Basic Auth**
*   **JWT tokens**
*   **OAuth2 login (Google, GitHub, etc.)**

It uses security filters and integrates smoothly with Spring MVC, allowing you to secure routes using annotations like `@PreAuthorize`.

### **16. How can you enable logging in a Spring Boot application?**[#](#16-how-can-you-enable-logging-in-a-spring-boot-application)

Spring Boot uses **Logback** as the default logging framework. Logging is enabled automatically — you don’t need to add any extra setup to start using it.

To log messages in your code, you can use **SLF4J** (which works with Logback):


```java
@Slf4j 
public class MyService {    
    public void doSomething() {        
            log.info("Processing...");        log.error("Something went wrong");    
            
        } 
    }`
```
You can configure log settings (like log level or log file path) in `application.properties`:



`logging.level.org.springframework=DEBUG logging.file.name=app.log`

You can also use a custom `logback.xml` file for advanced configurations.

### **17. What is the purpose of the @RestController annotation?**[#](#17-what-is-the-purpose-of-the-restcontroller-annotation)

`@RestController` is a shortcut for two annotations:

*   `@Controller` – tells Spring this class handles web requests
*   `@ResponseBody` – tells Spring to return the response as JSON or XML (instead of rendering a view)

So when you use `@RestController`, all your methods return data (usually JSON) directly to the client — perfect for building REST APIs.

**Example:**


```java
@RestController 
public class UserController {     
    @GetMapping("/users")     
    public List<User> getUsers() {         
        return userService.getAllUsers();     
    } 
}
```
### **18. How can you handle exceptions in a Spring Boot application?**[#](#18-how-can-you-handle-exceptions-in-a-spring-boot-application)

Spring Boot allows you to handle exceptions in a clean and flexible way:

1.  **Method-level handling** using `@ExceptionHandler`:



```java
@ExceptionHandler(ResourceNotFoundException.class) 
public ResponseEntity<String> handleNotFound(ResourceNotFoundException ex) {     
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage()); 
}
```

**Global handling** using `@ControllerAdvice`:

This lets you manage exceptions for all controllers in one place.



```java
@ControllerAdvice public class GlobalExceptionHandler {     @ExceptionHandler(Exception.class)    
public ResponseEntity<String> handleAll(Exception ex) {         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + ex.getMessage());     
} }
```

### **19. Explain the difference between @Component, @Service, and @Repository annotations.**[#](#19-explain-the-difference-between-component-service-and-repository-annotations)

All are Spring stereotypes:

*   `@Component` is generic
*   `@Service` is used for business logic
*   `@Repository` is for database access and enables exception translation

### **20. What is the purpose of the @Transactional annotation in Spring Boot?**[#](#20-what-is-the-purpose-of-the-transactional-annotation-in-spring-boot)

`@Transactional` is used to manage **database transactions** automatically. It ensures that:

*   If everything in the method runs fine, the changes are **committed** to the database.
*   If an exception happens, Spring will **roll back** the transaction to keep your data safe.

You can use it at the method or class level:



```java
@Transactional 
public void transferMoney(Account from, Account to, BigDecimal amount) {     
    debit(from, amount);    
    credit(to, amount); 
}
```

It helps maintain **ACID** properties (Atomicity, Consistency, Isolation, Durability) in your database operations.

### **21. How does Spring Boot support database migrations?**[#](#21-how-does-spring-boot-support-database-migrations)

Spring Boot supports automatic database schema management using tools like **Flyway** and **Liquibase**.

These tools allow you to write **versioned SQL scripts** (like `V1__create_table.sql`, `V2__add_column.sql`), and Spring Boot will run them in order when the application starts.

This helps:

*   Keep your database schema up to date
*   Avoid manual changes in each environment
*   Track version history of schema changes

To use Flyway:



`<!-- In pom.xml --> <dependency>     <groupId>org.flywaydb</groupId>     <artifactId>flyway-core</artifactId> </dependency`

### **22. What is the role of Spring Boot Actuator?**[#](#22-what-is-the-role-of-spring-boot-actuator)

Actuator provides **production-ready monitoring** features through endpoints like:

*   `/health` – app health
*   `/info` – app metadata
*   `/metrics` – performance metrics
*   `/env`, `/loggers`, etc.

You can also define custom indicators and endpoints.

### **23. How can you configure caching in a Spring Boot application?**[#](#23-how-can-you-configure-caching-in-a-spring-boot-application)

Steps:

1.  Add a caching library



`<dependency>    <groupId>org.springframework.boot</groupId>    <artifactId>spring-boot-starter-cache</artifactId> </dependency>`

1.  Use `@EnableCaching`



`@EnableCaching @SpringBootApplication public class MyApp {}`

1.  **Use caching annotations** on methods:

*   `@Cacheable` – caches method result
*   `@CachePut` – updates cache with new value
*   `@CacheEvict` – removes cache entry

1.  Configure properties in `application.properties` or `application.yml`



`spring.cache.type=ehcache`

### **24. Explain the concept of Bean scopes in Spring Boot.**[#](#24-explain-the-concept-of-bean-scopes-in-spring-boot)

Bean scopes define **lifecycle and visibility**:

*   `singleton` (default): one instance for app
*   `prototype`: new instance per request
*   `request`: one per HTTP request
*   `session`: one per session
*   `application`: shared in servlet context
*   `websocket`: one per WebSocket session

### **25. What is the purpose of the** `**@Value**` **annotation in Spring Boot?**[#](#25-what-is-the-purpose-of-the-value-annotation-in-spring-boot)

`@Value` injects values from:

*   Properties file
*   Environment variables
*   Command-line args

Example:



`@Value("${server.port}") private int port;`

### **26. How can you enable Cross-Origin Resource Sharing (CORS) in a Spring Boot application?**[#](#26-how-can-you-enable-cross-origin-resource-sharing-cors-in-a-spring-boot-application)

CORS (Cross-Origin Resource Sharing) allows your frontend (like React or Angular) to call your backend API even if they are on different domains or ports.

You can enable CORS in two ways:

**Two ways:**

**1. Using** `**@CrossOrigin**` **annotation:**



`@CrossOrigin(origins = "<http://localhost:3000>") @RestController public class MyController {     @GetMapping("/api/data")     public String getData() {         return "Hello from backend!";     } }`

**2. Globally using** `**WebMvcConfigurer**`**:**


```java
@Configuration 
public class WebConfig implements WebMvcConfigurer {
         @Override     
         public void addCorsMappings(CorsRegistry registry) {         
            registry.addMapping("/**")                 .allowedOrigins("<http://localhost:3000>")                 .allowedMethods("GET", "POST", "PUT", "DELETE");     
        } 
}
```
### **27. Explain the concept of a starter dependency in Spring Boot.**[#](#27-explain-the-concept-of-a-starter-dependency-in-spring-boot)

A **starter dependency** is a convenient way to include a group of related libraries in your project.

For example:


```xml
<dependency>   
<groupId>org.springframework.boot</groupId>   <artifactId>spring-boot-starter-web</artifactId> 
</dependency>
```

This single dependency brings in:

*   Spring MVC
*   Jackson (for JSON)
*   Embedded Tomcat
*   Logging

### **28. What is the purpose of the** `**@Async**` **annotation in Spring Boot?**[#](#28-what-is-the-purpose-of-the-async-annotation-in-spring-boot)

The `@Async` annotation makes a method run **in a separate thread**, so it doesn’t block the main thread.

This is helpful when doing tasks like sending emails, processing files, or calling external APIs — things that can take time.

You must:

*   Enable async support with `@EnableAsync`
*   Configure a `TaskExecutor` if needed

### **29. How does Spring Boot support the creation of WebSocket applications?**[#](#29-how-does-spring-boot-support-the-creation-of-websocket-applications)

You can:

*   Use Spring’s WebSocket API
*   Define handler classes using `WebSocketHandler`
*   Annotate config class with `@EnableWebSocket`
*   Integrate with SockJS for fallback support

### **30. Explain the concept of conditional bean registration in Spring Boot.**[#](#30-explain-the-concept-of-conditional-bean-registration-in-spring-boot)

Spring Boot allows you to create beans **only when certain conditions are met** using conditional annotations.

Some common conditional annotations:

*   `@ConditionalOnClass`: Bean is created only if a specific class is on the classpath.
*   `@ConditionalOnMissingBean`: Creates a bean only if the same type is not already defined.
*   `@ConditionalOnProperty`: Creates a bean only if a specific property exists or has a certain value.

### **31. How can you schedule tasks in a Spring Boot application?**[#](#31-how-can-you-schedule-tasks-in-a-spring-boot-application)

Spring Boot makes it easy to run tasks at regular intervals using the **scheduling feature**.

**Steps:**

1.  **Enable scheduling** in your main or config class:


```java
@EnableScheduling 
@SpringBootApplication 
public class MyApp {}
```

1.  **Use** `**@Scheduled**` **on any method**:



`@Scheduled(fixedRate = 5000) // runs every 5 seconds public void runTask() {     System.out.println("Running scheduled task..."); }`

You can schedule tasks using:

*   `fixedRate` – time between method calls
*   `fixedDelay` – time after method finishes
*   `cron` – for custom scheduling like `@Scheduled(cron = "0 0 * * * *")` (every hour)

Useful for tasks like backups, report generation, or sending emails.

### **32. What is the purpose of the** `**@RequestMapping**` **annotation?**[#](#32-what-is-the-purpose-of-the-requestmapping-annotation)

`@RequestMapping` is used to map **HTTP requests** to specific controller methods.

It can define:

*   The **URL path** (`value`)
*   The **HTTP method** (`GET`, `POST`, etc.)
*   Optional **parameters**, **headers**, or **consumes/produces** types

**Example:**


```java
@RequestMapping(value = "/users", method = RequestMethod.GET)
public List<User> getAllUsers() {     
    return userService.findAll(); 
}
```

Although `@RequestMapping` works for all HTTP methods, you can use shortcuts like `@GetMapping`, `@PostMapping`, etc., for better readability.

### **33. How can you enable HTTPS in a Spring Boot application?**[#](#33-how-can-you-enable-https-in-a-spring-boot-application)

Steps:

1.  Generate SSL certificate and and a `.p12` keystore.
2.  Add these properties in `application.properties`:



`server.port=8443 server.ssl.key-store=classpath:keystore.p12 server.ssl.key-store-password=yourpass server.ssl.key-store-type=PKCS12`

1.  Place the `keystore.p12` file inside your `resources` folder.

Once done, your app will be available at `https://localhost:8443` with SSL enabled. This is important for securing sensitive data in transit.

### **34. Explain the concept of externalized configuration in Spring Boot.**[#](#34-explain-the-concept-of-externalized-configuration-in-spring-boot)

Configuration values (like DB URL, ports, etc.) can be moved to external sources:

*   `application.properties`
*   Environment variables
*   Command-line args
*   Config servers (in microservices)

This enables easy environment-specific setups.

### **35. What is the purpose of the** `**@RestControllerAdvice**` **annotation?**[#](#35-what-is-the-purpose-of-the-restcontrolleradvice-annotation)

`@RestControllerAdvice` is a **specialized annotation** used to handle exceptions and shared logic for all REST controllers.

It combines:

*   `@ControllerAdvice` – to apply common behavior across multiple controllers
*   `@ResponseBody` – so the response is returned as JSON/XML, not a view

**Use cases:**

*   Global exception handling
*   Adding common model attributes
*   Modifying response bodies

**Example:**

```java
@RestControllerAdvice 
public class GlobalExceptionHandler {     
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleNotFound(ResourceNotFoundException ex) {         
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());     
    } 
}
```

This keeps your controller code clean and separates error-handling logic.

### **36. How does Spring Boot support testing of applications?**[#](#36-how-does-spring-boot-support-testing-of-applications)

Spring Boot provides great support for **unit testing** and **integration testing** with built-in tools and annotations.

Some commonly used features:

*   **Annotations**:
    *   `@SpringBootTest` – loads the full application context for integration testing
    *   `@WebMvcTest` – tests only the web layer (like controllers)
    *   `@DataJpaTest` – tests the JPA (database) layer
*   **Mocking support**:
    *   `@MockBean` – create and inject mock beans
    *   Combine with **Mockito** to simulate behaviors
*   **Test utilities**:
    *   `TestRestTemplate` – to call real endpoints in integration tests
    *   `MockMvc` – to test controller layer without starting the full server
*   Spring Boot also runs tests using **embedded servers**, so you don’t need to deploy your app externally to run full end-to-end tests.

### **37. Explain the purpose of the** `**@PathVariable**` **annotation in Spring Boot.**[#](#37-explain-the-purpose-of-the-pathvariable-annotation-in-spring-boot)

`@PathVariable` is used to extract values from the **URL path** and pass them into your controller method as parameters.

Example:



`@GetMapping("/user/{id}") public User getUser(@PathVariable Long id) { ... }`

### **38. What is the difference between** `**@ControllerAdvice**` **and** `**@RestControllerAdvice**`**?**[#](#38-what-is-the-difference-between-controlleradvice-and-restcontrolleradvice)

Both are used to apply common behavior (like exception handling) across multiple controllers.

*   `**@ControllerAdvice**` – Used for **MVC controllers** that return views (like JSP, Thymeleaf).
*   `**@RestControllerAdvice**` – Used for **REST APIs**, and it automatically includes `@ResponseBody`, so it returns **JSON/XML** responses.

Use `@RestControllerAdvice` when building APIs, and `@ControllerAdvice` when working with web pages.

### **39. How can you enable Swagger documentation in a Spring Boot application?**[#](#39-how-can-you-enable-swagger-documentation-in-a-spring-boot-application)

Steps:

1.  Add Swagger dependencies.
2.  Configure metadata (title, version, etc.)
3.  Use annotations like `@Api`, `@ApiOperation`
4.  Access Swagger UI at `/swagger-ui.html`

### **40. What is the purpose of the** `**@RequestBody**` **annotation in Spring Boot?**[#](#40-what-is-the-purpose-of-the-requestbody-annotation-in-spring-boot)

`@RequestBody` is used to **bind the HTTP request body** (usually JSON or XML) to a Java object.

Example:



`@PostMapping("/user") public void createUser(@RequestBody User user) { ... }`

### **41. How does Spring Boot support message queuing?**[#](#41-how-does-spring-boot-support-message-queuing)

Spring Boot supports **message queues** like **RabbitMQ** and **Apache Kafka** for building **asynchronous** and **event-driven** systems.

Key features:

*   Add dependencies like:
    *   `spring-boot-starter-amqp` (for RabbitMQ)
    *   `spring-kafka` (for Kafka)
*   Use listeners to consume messages:


```java
@RabbitListener(queues = "order-queue") 
public void receiveMessage(String message) {     
    System.out.println("Received: " + message); 
}

@KafkaListener(topics = "user-topic") 
public void listen(String data) {     
    System.out.println("Kafka: " + data); 
}
```
*   Spring Boot auto-configures connections based on what’s in the classpath and `application.properties`.

Also, you can use Spring’s messaging abstractions like `Message`, `MessageChannel`, and `MessageConverter` to work with different formats.

### **42. What is the purpose of the** `**@Scheduled**` **annotation in Spring Boot?**[#](#42-what-is-the-purpose-of-the-scheduled-annotation-in-spring-boot)

`@Scheduled` is used to **run methods on a schedule** — like running a task every few seconds, minutes, or at specific times.

Example:



`@Scheduled(fixedDelay = 5000) public void runTask() { ... }`

Supports `fixedRate`, `fixedDelay`, and `cron`.

### **43. Explain the concept of Actuator endpoints in Spring Boot.**[#](#43-explain-the-concept-of-actuator-endpoints-in-spring-boot)

Spring Boot Actuator exposes **endpoints** that give useful information about the application’s health and internals.

Some commonly used endpoints:

*   `/actuator/health` – shows app health status
*   `/actuator/info` – displays app info (like version, description)
*   `/actuator/metrics` – CPU, memory, HTTP request metrics
*   `/actuator/env` – view environment properties
*   `/actuator/beans` – see all registered Spring beans
*   `/actuator/loggers` – manage logging levels at runtime

**To use Actuator:**


```xml
`<dependency>   
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-actuator</artifactId> 
</dependency>
```
You can also customize or secure these endpoints using your `application.properties`.

### **44. How can you configure connection pooling in a Spring Boot application?**[#](#44-how-can-you-configure-connection-pooling-in-a-spring-boot-application)

Spring Boot uses **HikariCP** as the default **connection pool** for managing database connections efficiently.

You can configure pooling options in `application.properties`:



`spring.datasource.hikari.maximum-pool-size=10 spring.datasource.hikari.connection-timeout=30000`

You can also use Tomcat JDBC or DBCP2.

### **45. What is the purpose of the** `**@CrossOrigin**` **annotation in Spring Boot?**[#](#45-what-is-the-purpose-of-the-crossorigin-annotation-in-spring-boot)

`@CrossOrigin` is used to enable **Cross-Origin Resource Sharing (CORS)**, which allows your frontend (on a different domain or port) to make API calls to your backend.

Without CORS enabled, browsers block requests from different origins for security reasons.

Example:



`@CrossOrigin(origins = "<http://example.com>") @RestController public class MyController { ... }`

### **46. How does Spring Boot support internationalization and localization?**[#](#46-how-does-spring-boot-support-internationalization-and-localization)

Spring Boot makes it easy to build apps that support **multiple languages** using **internationalization (i18n)**.

*   Message bundles (`messages_en.properties`, `messages_fr.properties`)
*   `MessageSource` bean configuration
*   Resolves locale using `Accept-Language` header

Enables dynamic text based on user’s locale.

### **47. Explain the concept of a health indicator in Spring Boot Actuator.**[#](#47-explain-the-concept-of-a-health-indicator-in-spring-boot-actuator)

A **health indicator** shows the status of a specific part of your app, like the database, disk space, or custom services.

These health indicators are part of the `/actuator/health` endpoint.

Spring Boot includes **built-in health checks**:

*   Database connection (`DataSourceHealthIndicator`)
*   Disk space (`DiskSpaceHealthIndicator`)
*   RabbitMQ, Redis, etc.

You can also create your own:


```java
@Component 
public class MyServiceHealthIndicator implements HealthIndicator {     
    @Override     
    public Health health() {         
        boolean isHealthy = checkSomething();         
        return isHealthy ? Health.up().build() : Health.down()         .withDetail("error", "Service is down").build();     
    } 
}
```

### **48. What is the purpose of the** `**@RequestBody**` **annotation in Spring Boot?**[#](#48-what-is-the-purpose-of-the-requestbody-annotation-in-spring-boot)

`@RequestBody` is used to **bind the HTTP request body (usually JSON)** to a Java object.

It automatically converts JSON into a Java object using Jackson (or any configured converter).

Example:



`@PostMapping("/user") public void createUser(@RequestBody User user) { ... }`

### **49. How can you enable request logging in a Spring Boot application?**[#](#49-how-can-you-enable-request-logging-in-a-spring-boot-application)

To see **incoming HTTP requests** and debug better, you can enable request logging.

**Simple way:**

Add this to `application.properties`:



`logging.level.org.springframework.web=DEBUG`

**Advanced way (using Logback):**

Create a `logback-spring.xml` and configure logging pattern and levels.

**Third-party option:**

Use Spring Boot filters like `CommonsRequestLoggingFilter` for detailed logs:


```java
    @Bean 
    public CommonsRequestLoggingFilter logFilter() {      CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();     
        filter.setIncludeQueryString(true);     
        filter.setIncludePayload(true);     
        filter.setMaxPayloadLength(10000 );    
        return filter; 
    }
```
### **50. Explain the purpose of the** `**@ExceptionHandler**` **annotation in Spring Boot.**[#](#50-explain-the-purpose-of-the-exceptionhandler-annotation-in-spring-boot)

`@ExceptionHandler` is used to **catch and handle specific exceptions** in your controller methods.

**Why?** So your app doesn’t crash and you can send a proper response (like a 404 or custom error message).

Example:


```java
@ExceptionHandler(MyException.class) 
public ResponseEntity<String> handle(MyException ex) {     return ResponseEntity.status(500).body("Error occurred"); 
}

```
### **51. How does Spring Boot support asynchronous processing?**[#](#51-how-does-spring-boot-support-asynchronous-processing)

Spring Boot allows methods to run **asynchronously** in a separate thread using the `@Async` annotation. This helps improve performance by not blocking the main thread during long-running tasks (like sending emails or processing files).

*   `@Async` on methods
*   `@EnableAsync` in config
*   Optional `TaskExecutor` bean for thread management

Supports returning `CompletableFuture`, `Future`, `void`.

### **52. What is the purpose of the** `**@EnableAutoConfiguration**` **annotation in Spring Boot?**[#](#52-what-is-the-purpose-of-the-enableautoconfiguration-annotation-in-spring-boot)

`@EnableAutoConfiguration` tells Spring Boot to **automatically configure beans and settings** based on the libraries present in the classpath.

For example:

*   If Spring MVC is on the classpath, it sets up a web app.
*   If Spring Data JPA is present, it configures a datasource and JPA repositories.

This saves a lot of manual configuration and helps you get started quickly.

### **53. How can you configure a connection pool in Spring Boot?**[#](#53-how-can-you-configure-a-connection-pool-in-spring-boot)

Spring Boot uses **HikariCP** as the default connection pool for databases.

You can configure it in `application.properties`:



`spring.datasource.hikari.maximum-pool-size=10 spring.datasource.hikari.minimum-idle=5 spring.datasource.hikari.jdbc-url=jdbc:mysql://localhost:3306/mydb spring.datasource.username=root spring.datasource.password=pass`

If you prefer other pools like **Tomcat JDBC** or **DBCP2**, just exclude Hikari and add the respective dependency.

Connection pooling is important to reduce the cost of repeatedly opening and closing DB connections.

### **54. Explain the concept of transaction management in Spring Boot.**[#](#54-explain-the-concept-of-transaction-management-in-spring-boot)

Spring Boot supports **transaction management** using the `@Transactional` annotation.

It helps you in:

*   ACID compliance
*   Automatic rollback on exceptions
*   Clean resource handling

### **55. What is the purpose of the** `**@Async**` **annotation in Spring Boot?**[#](#55-what-is-the-purpose-of-the-async-annotation-in-spring-boot)

`@Async` marks a method to **run in the background**, freeing the caller thread to continue execution without waiting.

It’s useful for:

*   Sending emails
*   Generating reports
*   Calling external APIs
*   Processing background jobs
*   **Remember:** To use `@Async`, you must also enable it with `@EnableAsync` in your configuration.

### **56. How does Spring Boot handle security vulnerabilities like XSS and CSRF?**[#](#56-how-does-spring-boot-handle-security-vulnerabilities-like-xss-and-csrf)

Spring Boot (with Spring Security) provides basic protections against common web vulnerabilities like:

*   **XSS (Cross-Site Scripting):**
    *   By default, template engines like **Thymeleaf** escape user inputs.
    *   You can also add security headers (e.g., **Content-Security-Policy**) to prevent script execution from untrusted sources.
*   **CSRF (Cross-Site Request Forgery):**
    *   Spring Security automatically generates a **CSRF token** for every form and checks it on form submissions.
    *   This prevents unauthorized commands from being executed on behalf of the user.

**Best practices for developers:**

*   Always validate and sanitize user input.
*   Use HTTPS in production.
*   Don’t disable CSRF protection unless you know exactly why.

### **57. What is the purpose of the** `**@Cacheable**` **annotation in Spring Boot?**[#](#57-what-is-the-purpose-of-the-cacheable-annotation-in-spring-boot)

`@Cacheable` is used to **store the result of a method** so that future calls with the same input don't need to run the method again — it just returns the cached value.

Example:



`@Cacheable("users") public User getUserById(Long id) { ... }`

Improves performance by avoiding repetitive computation or DB calls.

### **58. How can you handle file uploads in a Spring Boot application?**[#](#58-how-can-you-handle-file-uploads-in-a-spring-boot-application)

Spring Boot makes file upload easy using `MultipartFile`.

**Steps:**

1.  **Controller method:**

```java
@PostMapping("/upload") 
public String uploadFile(@RequestParam("file") MultipartFile file) {     // save or process the file     return "Uploaded successfully!"; 
}
```

1.  **Set size limits in** `**application.properties**`**:**



`spring.servlet.multipart.max-file-size=5MB spring.servlet.multipart.max-request-size=10MB`

Spring Boot handles the rest — parsing multipart requests and converting uploaded files into `MultipartFile`.

You can also write files to disk or store them in a database/cloud storage.

### **59. Explain the concept of circuit breakers in Spring Boot.**[#](#59-explain-the-concept-of-circuit-breakers-in-spring-boot)

A **circuit breaker** helps prevent your app from **failing repeatedly** when a downstream service (like an API or database) is not responding.

It works like this:

*   If a service fails multiple times, the circuit **opens**, and further calls are **blocked** to avoid stress.
*   After some time, it enters a **half-open** state to test if the service is back.
*   If successful, it **closes** the circuit and resumes normal flow.

**In Spring Boot**, use **Resilience4j** (or Hystrix) for circuit breakers:

```java

@CircuitBreaker(name = "inventoryService", fallbackMethod = "fallback") 
public Product getInventory(Long id) {     // call to external service 
}
```
This improves fault tolerance in **microservice architectures**.

### **60. What is the purpose of the** `**@ControllerAdvice**` **annotation in Spring Boot?**[#](#60-what-is-the-purpose-of-the-controlleradvice-annotation-in-spring-boot)

`@ControllerAdvice` is used to **handle common logic** across all controllers.

You can define:

*   **Global exception handlers** using `@ExceptionHandler`
*   **Custom model attributes** shared across multiple controllers using `@ModelAttribute`
*   **Custom data binders** with `@InitBinder`

### **61. How does Spring Boot handle database connections and pooling?**[#](#61-how-does-spring-boot-handle-database-connections-and-pooling)

Spring Boot automatically sets up a **connection pool** to manage database connections efficiently.

*   **HikariCP** is the default and fastest connection pool in Spring Boot.
*   Other supported pools: **Tomcat JDBC**, **DBCP2** (you can switch by changing dependencies).



`spring.datasource.url=jdbc:mysql://localhost:3306/mydb spring.datasource.username=root spring.datasource.password=pass spring.datasource.hikari.maximum-pool-size=10`

Connection pooling:

*   Reduces overhead of opening/closing DB connections.
*   Reuses connections to improve performance.
*   Works well with Spring's **transaction management** to ensure rollback and ACID compliance.

### **62. What is the purpose of the** `**@RestControllerAdvice**` **annotation in Spring Boot?**[#](#62-what-is-the-purpose-of-the-restcontrolleradvice-annotation-in-spring-boot)

`@RestControllerAdvice` is used to **handle exceptions globally** in REST APIs and automatically return responses in **JSON/XML** format.

It combines:

*   `@ControllerAdvice` – for applying global logic to controllers
*   `@ResponseBody` – so responses are automatically serialized

**Example:**


```java
@RestControllerAdvice 
public class GlobalRestHandler {     
    @ExceptionHandler(UserNotFoundException.class)     
    public ResponseEntity<String> handleNotFound(UserNotFoundException ex) {         
        return ResponseEntity.status(404).body(ex.getMessage());     
    }
}
```

Use this to avoid repeating exception handling code in every controller.

### **63. Explain the concept of lazy initialization in Spring Boot.**[#](#63-explain-the-concept-of-lazy-initialization-in-spring-boot)

**Lazy initialization** means Spring creates a bean **only when it’s first needed**, instead of at application startup.

*   Beans are created **on first use**, not at startup
*   Saves memory and improves **startup time**
*   You can force eager init using `@Lazy(false)`

### **64. How can you configure a custom data source in Spring Boot?**[#](#64-how-can-you-configure-a-custom-data-source-in-spring-boot)

If the default `spring.datasource.*` properties aren't enough, you can define a custom `DataSource` bean.

Steps:

1.  Add driver dependency
2.  Create a config class with `@Bean` returning a `DataSource` (e.g., HikariDataSource)
3.  Set properties like URL, username, password

Example:


```java
@Bean 
public DataSource dataSource() {     
    HikariConfig config = new HikariConfig();     
    config.setJdbcUrl(...);    
    return new HikariDataSource(config);
}
```

### **65. What is the purpose of the** `**@Profile**` **annotation in Spring Boot?**[#](#65-what-is-the-purpose-of-the-profile-annotation-in-spring-boot)

`@Profile` is used to load **beans or configuration only for specific environments**, such as:

*   `dev` – for development
*   `test` – for testing
*   `prod` – for production

Example:



`@Profile("dev") @Component public class DevBean { ... }`

To activate a profile:



`profiles.active=dev`

This helps you run the same app with different settings in different environments — without changing code.

### **66. How does Spring Boot handle authentication and authorization?**[#](#66-how-does-spring-boot-handle-authentication-and-authorization)

Spring Boot uses **Spring Security** to provide both **authentication** (who you are) and **authorization** (what you're allowed to do).

*   Authentication: Form login, JWT, OAuth2, DB, LDAP
*   Authorization: Role/permission-based access control
*   Declarative rules via annotations like `@PreAuthorize`, `@Secured`

### **67. What is the purpose of the** `**@Bean**` **annotation in Spring Boot?**[#](#67-what-is-the-purpose-of-the-bean-annotation-in-spring-boot)

`@Bean` is used to tell Spring, “Hey, create and manage this object as a bean.”

It’s commonly used inside a `@Configuration` class when you want to define **custom logic** for creating an object

Example:



`@Bean public MyService myService() {     return new MyServiceImpl(); }`

### **68. How can you enable server-side validation in a Spring Boot application?**[#](#68-how-can-you-enable-server-side-validation-in-a-spring-boot-application)

Server-side validation checks incoming data before it’s processed or saved. Spring Boot uses **Hibernate Validator (JSR-380)** under the hood.

Steps:

1.  Add `spring-boot-starter-validation`
2.  Use annotations like `@NotNull`, `@Size`
3.  Add `@Valid` or `@Validated` in controllers

Example:

```java
@PostMapping 
public ResponseEntity<?> save(@Valid @RequestBody User user) { ... }
```

### **69. Explain the concept of the Spring Boot Starter Parent.**[#](#69-explain-the-concept-of-the-spring-boot-starter-parent)

The **Spring Boot Starter Parent** is a special **Maven parent POM** that provides:

*   Default versions for dependencies
*   Plugin configs
*   Java version, encoding

It reduces need for manual configuration.

### **70. What is the purpose of the** `**@ConfigurationProperties**` **annotation?**[#](#70-what-is-the-purpose-of-the-configurationproperties-annotation)

`@ConfigurationProperties` is used to **map values from** `**application.properties**` **or** `**application.yml**` to a Java class.

This is helpful when you want to group related settings.

Example:


```java
@ConfigurationProperties(prefix="app") 
public class AppConfig {     
    private String name; 
}
```

Requires `@EnableConfigurationProperties` or be annotated with `@Component`.

### **71. How can you customize error handling in a Spring Boot application?**[#](#71-how-can-you-customize-error-handling-in-a-spring-boot-application)

Spring Boot provides multiple ways to handle and customize errors so your users don’t see raw stack traces.

Options:

*   `@ControllerAdvice` with `@ExceptionHandler`
*   Create a `CustomErrorController` for `/error`
*   Customize `ErrorAttributes` or use `ErrorViewResolver`

### **72. What is the purpose of the** `**@ConditionalOnProperty**` **annotation?**[#](#72-what-is-the-purpose-of-the-conditionalonproperty-annotation)

`@ConditionalOnProperty` tells Spring to **only create a bean** if a specific property exists and has a certain value.

Useful for **feature toggles** or enabling/disabling configs based on environment.

Example:



`@ConditionalOnProperty(name = "feature.enabled", havingValue = "true") @Bean public FeatureBean featureBean() { ... }`

### **73. How does Spring Boot support hot reloading during development?**[#](#73-how-does-spring-boot-support-hot-reloading-during-development)

Spring Boot supports **hot reloading** using the **DevTools** module.

Via **Spring Boot DevTools**:

*   Auto restarts app on classpath changes
*   Enables live reload (e.g., with browser plugin)

Add this in `pom.xml`:

```xml
<dependency>   
    <groupId>org.springframework.boot</groupId>  <artifactId>spring-boot-devtools</artifactId>   
    <optional>true</optional> 
</dependency>`
```
### **74. What is the purpose of the** `**@EnableScheduling**` **annotation in Spring Boot?**[#](#74-what-is-the-purpose-of-the-enablescheduling-annotation-in-spring-boot)

`@EnableScheduling` turns on **Spring’s scheduling support**.

Once enabled, you can run methods automatically using `@Scheduled`.



`@EnableScheduling @SpringBootApplication public class App { ... }`

Without `@EnableScheduling`, scheduled methods will be ignored.

### **75. How can you externalize configuration in a Spring Boot application?**[#](#75-how-can-you-externalize-configuration-in-a-spring-boot-application)

Spring Boot lets you keep configuration **outside your code**, making it easier to change values per environment (like dev, test, prod).

**Common ways:**

*   `application.properties` / `application.yml`
*   Command-line args
*   Environment variables
*   Config servers (Spring Cloud Config)

### **76. Explain the concept of YAML configuration in Spring Boot.**[#](#76-explain-the-concept-of-yaml-configuration-in-spring-boot)

YAML (`application.yml`) is an alternative to `application.properties`. It’s **cleaner and more readable**, especially for nested settings.

Example:



`server:   port: 8081 spring:   datasource:     url: jdbc:mysql://localhost:3306/db`

Indentation is important in YAML, use spaces, not tabs. Spring Boot supports both `.yml` and `.properties`, so you can use what you prefer.

### **77. What is the purpose of the** `**@ComponentScan**` **annotation?**[#](#77-what-is-the-purpose-of-the-componentscan-annotation)

`@ComponentScan` tells Spring where to **look for your beans** (`@Component`, `@Service`, `@Repository`, etc.).

By default, it scans the package of your main class. But you can customize it.

Example:



`@ComponentScan(basePackages = "com.example")`

### **78. How does Spring Boot support microservices development?**[#](#78-how-does-spring-boot-support-microservices-development)

Spring Boot is a great choice for building microservices because it’s:

*   **Lightweight** and fast to start
*   Comes with **embedded servers** (no need for external Tomcat)
*   Has excellent support for REST APIs and Spring Data

With **Spring Cloud**, it becomes even more powerful:

*   **Eureka** – service discovery
*   **Spring Cloud Gateway** – routing and load balancing
*   **Config Server** – centralized configuration
*   **Circuit breakers** – with Resilience4j

It also works well with **Docker** and **Kubernetes**, making it ideal for cloud-native apps.

### **79. What is the purpose of the** `**@EnableAutoConfiguration**` **annotation?**[#](#79-what-is-the-purpose-of-the-enableautoconfiguration-annotation)

`@EnableAutoConfiguration` tells Spring Boot to **automatically configure** your application based on the libraries available in the classpath.

Example:

*   If you have `spring-boot-starter-web`, it sets up Spring MVC.
*   If you have Spring Data JPA, it sets up Hibernate and a datasource.

You usually don’t use it directly because it’s part of: `@SpringBootApplication`

### **80. How can you integrate a third-party library with Spring Boot?**[#](#80-how-can-you-integrate-a-third-party-library-with-spring-boot)

You can easily use external libraries (like Apache POI, Stripe, Twilio, etc.) with Spring Boot.

1.  Add the library dependency (e.g., in `pom.xml`)
2.  Configure via `@Configuration` and `@Bean`
3.  Inject and use the library as a Spring-managed bean

### **81. What is the purpose of the** `**@Import**` **annotation in Spring Boot?**[#](#81-what-is-the-purpose-of-the-import-annotation-in-spring-boot)

`@Import` is used when you want to **include another** `**@Configuration**` **class** into your current configuration.

Instead of using `@ComponentScan` to pick it up automatically, `@Import` lets you add it **manually**.

Example:



`@Import(AppConfig.class) public class MainConfig { }`

### **82. How can you run a block of code at Spring Boot startup?**[#](#82-how-can-you-run-a-block-of-code-at-spring-boot-startup)

To run code when the application starts, implement one of these interfaces:

*   `CommandLineRunner` – gets raw `String[] args`
*   `ApplicationRunner` – gets parsed `ApplicationArguments`

Example:



`@Bean public CommandLineRunner run() {     return args -> {         System.out.println("App started!");     }; }`

### **83. What is the purpose of the** `**@ConditionalOnClass**` **annotation?**[#](#83-what-is-the-purpose-of-the-conditionalonclass-annotation)

`@ConditionalOnClass` makes sure a **bean or configuration is only loaded** if a specific class is available in the classpath.

**Use case:** You want to conditionally enable a feature **only if a certain dependency is present**.

Example:



`@ConditionalOnClass(DataSource.class) public class DataSourceConfig { ... }`

### **84. How can you create a custom banner in Spring Boot?**[#](#84-how-can-you-create-a-custom-banner-in-spring-boot)

Spring Boot shows a banner in the console when the app starts. You can easily customize it.

**Steps:**

1.  Create a file named `banner.txt`
2.  Place it in `src/main/resources`
3.  Add ASCII art, app info, or any message

Want a banner image instead? Use:



`banner.image.location=classpath:banner.gif`

To **disable** the banner:



`spring.main.banner-mode=off`

Try websites like [patorjk.com/software/taag](http://patorjk.com/software/taag) to generate cool ASCII art banners.

### **85. Explain the concept of Spring Boot auto-configuration report.**[#](#85-explain-the-concept-of-spring-boot-auto-configuration-report)

When things **don’t auto-configure** as expected, the **auto-configuration report** helps you debug.

Enable it by adding this to `application.properties`:



`debug=true`

You get a **report of included and excluded auto-configurations** in the console, useful for debugging config issues.

### **86. How does Spring Boot support configuration metadata generation?**[#](#86-how-does-spring-boot-support-configuration-metadata-generation)

Spring Boot can **generate metadata files** that help IDEs like IntelliJ or VS Code offer **autocomplete and validation** for your custom properties.

This happens when you:

*   Use `@ConfigurationProperties` on your config classes.
*   Add the `spring-boot-configuration-processor` dependency:

### **87. What is the purpose of the** `**@ImportResource**` **annotation?**[#](#87-what-is-the-purpose-of-the-importresource-annotation)

`@ImportResource` lets you **include XML-based Spring configurations** in a Java-based Spring Boot app.

Example:



`@ImportResource("classpath:beans.xml") public class AppConfig { }`

### **88. How can you customize the Spring Boot application context?**[#](#88-how-can-you-customize-the-spring-boot-application-context)

You can customize the application context (before it's fully initialized) using:

*   Creating a subclass of `SpringApplication`
*   Using `SpringApplicationBuilder`
*   Adding `ApplicationContextInitializer` or listeners

### **89. How can you enable or disable specific Spring Boot Actuator endpoints?**[#](#89-how-can-you-enable-or-disable-specific-spring-boot-actuator-endpoints)

You can manage Actuator endpoints via `application.properties`:



`management.endpoints.web.exposure.include=health,info management.endpoint.health.enabled=true management.endpoint.beans.enabled=false`

### **90. How does Spring Boot handle logging?**[#](#90-how-does-spring-boot-handle-logging)

Spring Boot uses **Logback** as the default logging framework, but you can also switch to Log4j2, Java Util Logging, etc.

**Basic logging configuration in** `**application.properties**`**:**



`logging.level.root=INFO logging.level.org.springframework=DEBUG logging.file.name=app.log`

### **91. What is the purpose of the** `**@EnableConfigurationProperties**` **annotation?**[#](#91-what-is-the-purpose-of-the-enableconfigurationproperties-annotation)

This annotation tells Spring Boot to **bind configuration properties** to a plain class — even if it’s not a component (`@Component` or `@Service`).

It’s mostly used when you want to keep configuration classes clean and separate.

Example:



`@EnableConfigurationProperties(MyAppProperties.class) public class MyAppConfig { }`

Now Spring Boot will bind values from `application.properties` or `application.yml` to `MyAppProperties`.

If your `@ConfigurationProperties` class is already annotated with `@Component`, you don’t need this.

### **92. How can you access command-line arguments in Spring Boot?**[#](#92-how-can-you-access-command-line-arguments-in-spring-boot)

Spring Boot apps can read arguments passed from the terminal using:

*   `ApplicationArguments` (recommended)
*   `CommandLineRunner` or `ApplicationRunner`

**Example with** `**ApplicationArguments**`**:**


```java
@Autowired private ApplicationArguments args; 
public void printArgs() {     
    System.out.println("Source Args: " + args.getSourceArgs());     
    System.out.println("Option Names: " + args.getOptionNames()); 
}
```

You can run the app with:



`java -jar app.jar --mode=prod --port=8080`

### **93. What is the difference between** `**@Controller**` **and** `**@RestController**`**?**[#](#93-what-is-the-difference-between-controller-and-restcontroller)

### `@Controller`:[#](#controller)

*   Used in **web applications** that return **views** like HTML or JSP pages.
*   It is part of the **Spring MVC** pattern.
*   If you return a string, Spring assumes it is the **name of a view** (like an HTML file).
*   To send JSON from here, you must also add `@ResponseBody` to the method.

### `@RestController`:[#](#restcontroller)

*   Used in **REST APIs** where you want to return **JSON or XML** directly.
*   It's the same as using `@Controller` **+** `@ResponseBody` on every method.
*   Spring automatically converts Java objects to JSON (using Jackson) and sends them in the response.

### **94. How can you enable method-level security in Spring Boot?**[#](#94-how-can-you-enable-method-level-security-in-spring-boot)

Spring Boot allows you to **secure individual methods** using annotations.

**Steps:**

1.  Enable method-level security:



`@EnableGlobalMethodSecurity(prePostEnabled = true)`

1.  Use any of these:

*   `@PreAuthorize("hasRole('ADMIN')")`
*   `@Secured("ROLE_USER")`
*   `@RolesAllowed("ADMIN")` (requires additional config)

**Example:**


```java
@PreAuthorize("hasRole('ADMIN')") 
public void deleteUser(Long id) {     // secured method 
}
```

### **95. What is the purpose of the** `**@SessionAttributes**` **annotation?**[#](#95-what-is-the-purpose-of-the-sessionattributes-annotation)

`@SessionAttributes` is used in Spring MVC to **store model data in the HTTP session** so it can survive across multiple requests.

Example:


```java
@Controller @SessionAttributes("user") 
public class UserController {    
     @ModelAttribute("user")     
     public User user() {         
        return new User();     
    } 
}
```

### **96. How can you configure a Spring Boot app to run on a different port?**[#](#96-how-can-you-configure-a-spring-boot-app-to-run-on-a-different-port)

By default, Spring Boot apps run on port **8080**. To change it, just update the `application.properties` or `application.yml` file.

**Example (**`**application.properties**`**):**



`server.port=8081`

### **97. What is the difference between** `**@ModelAttribute**` **and** `**@RequestParam**`**?**[#](#97-what-is-the-difference-between-modelattribute-and-requestparam)

1.  `**@ModelAttribute**`

*   Used when you want to bind **multiple form fields** to a **Java object**.
*   Spring automatically fills the fields of the object using the form data.
*   Very useful when handling HTML forms (like registration or login).

1.  `**@RequestParam**`

*   Used when you want to get **a single value** from the request, like a query parameter or a form field.
*   You manually bind each value to a method parameter.

### **98. How does Spring Boot support REST API versioning?**[#](#98-how-does-spring-boot-support-rest-api-versioning)

Spring Boot doesn’t have built-in versioning, but you can **easily implement it in your controller layer**.

Via:

*   URL versioning: `/api/v1/users`
*   Header versioning: `X-API-VERSION: 1`
*   Media type versioning: `Accept: application/vnd.api.v1+json`

### **99. What is the purpose of the** `**@InitBinder**` **annotation in Spring Boot?**[#](#99-what-is-the-purpose-of-the-initbinder-annotation-in-spring-boot)

`@InitBinder` is used to **customize how Spring binds HTTP request data to Java objects**.

**Example use cases:**

*   Date formatting
*   String trimming
*   Custom type converters



```java
@InitBinder 
public void initBinder(WebDataBinder binder) {     binder.registerCustomEditor(Date.class, new CustomDateEditor(         new SimpleDateFormat("yyyy-MM-dd"), false)); 
} 
```
### **100. can configure multiple data sources in Spring Boot?**[#](#100-can-configure-multiple-data-sources-in-spring-boot)

If your app needs to connect to more than one database (e.g., MySQL + PostgreSQL), you can configure **multiple data sources**.

Steps:

1.  Define two `DataSource` beans
2.  Create two `EntityManagerFactory` beans
3.  Configure separate `TransactionManager`s
4.  Use `@Primary` and `@Qualifier` to differentiate

Best practice: Keep configs in separate `@Configuration` classes (e.g., `PrimaryDBConfig`, `SecondaryDBConfig`).