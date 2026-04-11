
1.  **What are the advantages of microservices?**  
    Microservices are easily communicated with different databases, programming languages, technologies, and other frameworks.  
    It reduces the deployment time and based on their services, they can be individually deployed in any application.  
    If any issue with any microservice it does not shut down entire system and still continues the function.  
    Microservices communicate different languages and technologies can be used to build different services of the same application.
    
2.  **What is Spring cloud?**  
    Spring Cloud provides tools for developers to quickly build some of the common patterns in distributed systems or Microservices projects(eg: configuration management, intelligent routing)  
      
    Spring Cloud is a system in Microservices that integrates external systems, It allows microservices framework to build applications which perform restricted amounts of data processing.
    
3.  **What are the features of microservices?**  
    Microservices are treated as independent components that can be easily replaced and upgraded  
      
    Services within a system are largely decoupled. So the application as a whole can be easily built, altered, and scaled  
      
    Developers and teams can work independently of each other, thus increasing speed  
    Allows frequent releases of software, through systematic automation of software creation, testing, and approval  
      
    Microservices are very simple and focus on a single capability  
      
    The focus is on using the right tool for the right job. That means there is no standardized pattern or any technology pattern. Developers have the freedom to choose the best useful tools to solve their problems  
      
    Microservices do not focus on applications as projects. Instead, they treat applications as products for which they are responsible  
      
    Microservices support agile development. Any new feature can be quickly developed and discarded again  
      
    It offers decentralized data management, DevOps implementation, technical independence, service distribution based on business capabilities, hidden component complexity, and multiple, individually deployable components.
    
4.  **What are the advantages of using Spring Boot for microservices?**  
    It automatically configures various components based on classpath dependencies, reducing the need for manual configuration.
    
    *   Spring Boot provides a range of features and defaults, reducing the amount of code and configuration required to develop microservices. 
        
    *   Spring Boot integrates well with cloud platforms and provides support for building cloud-native microservices. 
        
    *   Spring Boot includes embedded servers like Tomcat, Jetty, or Undertow, making it easy to deploy microservices as standalone JAR files.
        
5.  **How does microservice architecture works?**  
    Mainly microservice architecture works client, Api gateway, services and database process.  
    The following various steps used for microservices
    
    *   Clients – Different users from various devices send requests.
        
    *   Identity Providers – Authenticates user or clients identities and issues security tokens.
        
    *   API Gateway – Handles client requests.
        
    *   Static Content – Houses all the content of the system.
        
    *   Management –  Balances services on nodes and identifies failures.
        
    *   Service Discovery – A guide to find the route of communication between microservices.
        
    *   Content Delivery Networks – Distributed network of proxy servers and their data centers.
        
    *   Remote Service – Enables the remote access information that resides on a network of IT devices. 
        
6.  **Explain monolithic architecture?**  
    All software components of an application are inside a single instance/package/unit is known as monolithic architecture in other words Monolithic architecture is a traditional way of making software, in which all of an application’s parts and functions are tightly tied together and packaged as a single unit.  
      
    [![](https://s3.ap-south-1.amazonaws.com/nareshit.images/Blog-15.jpg)](https://tally.so/r/mKo9OV)
    
7.  **What are the characteristics of monolithic architecture?**
    
    *   Single Codebase: The entire application is developed and maintained within a single code repository.
        
    *   Tight Coupling : Components and modules within the application are tightly interconnected, making it difficult to modify or replace individual parts without impacting the entire system.
        
    *   Scalability Challenges : Scaling a monolithic application can be challenging as all components need to be scaled together, even if only a specific part requires more resources.
        
    *   Monolithic Deployment : The application is deployed as a whole, which can lead to longer deployment cycles and increased downtime during updates.
        
    *   Technology Stack : Monolithic applications often use a uniform technology stack for the entire system.
        
    *   Development and Testing : The development and testing of monolithic applications can become complex and time-consuming as the codebase grows.
        
    *   Failure Impact : A failure in one component can potentially bring down the entire application.
        
8.  **What is load balancing in Spring Cloud?**  
    It improves workload distribution across multiple computing resources. It aims to maximize throughput, optimize resource use, avoid overloading a single resource and minimize response time.
    
9.  **What are the main components of microservices?**
    
    *   Core Services
        
    *   Components- Clients
        
    *   Identity Providers
        
    *   Containers and Clustering 
        
    *   IAC(Infrastrucre as code conception)
        
    *   Service registry
        
    *   API Gateway
        
    *   Security delivery
        
    *   Message bus
        
    *   Monitoring and logging
        
    *   Service discovery and load balancing
        
    *   Continuous integration and continuous deployment (CI/CD)
        
10.  **What are the problems solved by Spring Cloud?**
    
    *   The complexity associated with distributed systems
        
    *   Solved redundancy issues
        
    *   Ability to handle Service Discovery 
        
    *   Reduces performance issues
        
    *   Load balancing
        
11.  **What is the purpose of an API gateway in microservices?**  
    The general purpose of API gateway is handles the client requests.  
      
    It is a combine multiple backend microservices responses into a single response to fulfill client request.  
      
    API gateway translate client request from one protocol to another protocol used by underlying microservices.  
      
    According to load balance the gateway distributes incoming request across multiple instances of the same microservice to ensure optimal resource utilization and high availability  
      
    It improves the performance for cache responses and reduces redundant requests   
    API gateway handle authentication and authorization for security.  
      
    An API gateway is a single entry point for all incoming requests to the microservices. It acts as a reverse proxy, routing requests to the appropriate service and handling tasks such as authentication and rate limiting.
    
12.  **What is End to End Microservices Testing?**  
    End-to-end testing validates every process in the workflow is functioning properly. This ensures that the system works together as a whole and satisfies all requirements.
    
13.  **What is ‘dumb pipe’ in microservices?**  
    Dumb pipes is no further actions can be taken place in this communication. It just carries the data across a channel, and it is replaceable. The infrastructure of dumb is it can only act as a message router, and it has no other functions.
    
14.  **What are the difference between SOA(Service oriented architecture) and Microservices architecture?**  
    SOA is monolithic architecture, whereas Microservices is full-stack.  
      
    SOA involves sharing data storage between services, while in Microservices, each service can have independent data storage.  
      
    SOA is a less scalable architecture, while Microservices is a highly scalable architecture.  
      
    SOA focuses on application service reusability, while Microservices focus more on decoupling.
    
15.  What are the advantages of microservices?  
    We have various types of microservices tools in market but the following tools are mostly used:  
    Spring boot, Docker, Kubernetes, postman, Prometheus, and AWS cloudwatch etc.
    
16.  **What are the characteristics of microservices?**  
    There are six main characteristics of microservices architecture 
    
    *   multiple components 
        
    *   business approach 
        
    *   simple routing 
        
    *   decentralized
        
    *   failure resistant
        
    *   evolutionary.
        
        *   Some more characteristics of microservices.
            
            *   Organized on business capabilities
                
            *   Essential messaging frameworks
                
            *   Decentralized Governance
                
            *   Infrastructure Automation
                
            *   Decentralized data management 
                
17.  **What is the difference between microservcies and monolithic architecture?**  
    Monolithic Architecture is similar to a big container where all the software components of an application are assembled together and tightly coupled where as Microservice Architecture that structures an application as a collection of small autonomous services, modeled around a business domain and it is loosely coupled.  
      
    In microservices when changes done in single model it does not affect other microservices but any changes in the data model affect the entire database in monolithic.  
      
    Microservices service starts fast compare to monolithic  
      
    Microservices mainly focused on products but not projects, In Monolithic put emphasize over the whole project.
    
18.  **What is cohesion?**  
    Cohesion means connection between two or more elements of module that have same function. A module with strong cohesion it effectively execute a given function without require any connection with other modules. This enhances high cohesiveness functionality.
    
19.  **Write securing communication between microservices?**  
    The following some securing communication between microservcies
    
    *   UPI gateways
        
    *   Service mesh
        
    *   API security
        
    *   Transport layer security
        
    *   Secure service to service communication
        
20.  **What are client certificates?**  
    A type of digital certificate that is used by client systems to make authenticated requests to a remote server.It plays a vital role in many mutual authentication designs, providing strong assurances of a requester’s identity.
    
21.  **How microservices handle security and authentication?**  
    Through various mechanisms of microservices is protection of sensitive data and unauthorized access  
    In real time microservices handle security and authentication in API gateway, secure mesh, TLS and Role based access control.
    
22.  **What are the benefits of using kubernates for microservices?**  
    Kubernetes simplifies the deployment and management of containers. It handles scaling, load balancing, and self-healing.  
      
    Kubernetes supports multiple replicas of services, ensuring high availability and fault tolerance.  
      
    Kubernetes can automatically scale services based on CPU utilization or custom metrics to optimize resource usage.  
      
    Kubernetes provides built-in service discovery and DNS resolution for communication between services.
    
23.  **What is coupling?**  
    The measure of the strength of the dependencies between components is said to be coupling. A good design is always said to have High Cohesion and Low Coupling.  
    Coupling is a relationship between software modules as well as how dependent or interdependent one module is on other.  
    We have three coupling groups
    
    *   Very connected module or high reliant
        
    *   Uncoupled module
        
    *   Weekly coupled module
        
24.  **What are different types of Tests for Microservices?**  
    According to microservices architecture tests are divided into three categories  
    The first test is the bottom level test that performs general test like unit and performance tests.  
      
    At the middle level, experimental tests like usability and stress tests are there.  
    Moreover, at the top level, acceptance testing takes place. Tests at all levels are automated.
    
25.  **What are service registration and discovery in microservices spring cloud?**  
    If any Manuel deploy service are increased for adding or configuration modify are more complex and it create issues after service goes down. So these types of issues are handled by eureka service register and discover.  
      
    Service registration and discovery is a mechanism that allows microservices to register themselves with a service registry and discover other services. Service registries maintain a registry of available services, including their network locations and metadata. Service discovery clients can query the registry to obtain the necessary information to communicate with other services.  
      
    Service registration: When a microservice starts up, it registers itself with a service registry (e.g., Consul, Eureka) by providing essential information like its network location, API endpoints, and health status.  
      
    Service discovery: When a microservice needs to communicate with another microservice, it queries the service registry to discover the network location and endpoint details of the target service.  
      
    This dynamic discovery allows microservices to locate and interact with each other without hardcoding their locations or relying on static configurations. As new instances of services are deployed or removed, the service registry is updated accordingly. This ensures seamless communication within the containerized environment.  
      
    [![](https://s3.ap-south-1.amazonaws.com/nareshit.images/java_developer.jpeg)](https://tally.so/r/mKo9OV)
    
26.  **What is circuit breaking in microservices and how is it implemented in Spring Boot?**  
    Circuit breaking implements circuit-breaking patterns to prevent cascading failures and avoid overloading unhealthy services in other words it is a design pattern used to handle and prevent cascading failures in microservice architectures. It involves monitoring the calls to external services and, if a certain threshold of failures is reached, tripping a circuit breaker to stop further requests and return a fallback response.  
      
    In Spring Boot, circuit breaking can be implemented using libraries like Netflix Hystrix or Resilience4j, which provide annotations and configuration options to define circuit breakers and fallback behaviors.
    
27.  **What is spring webFlux?**  
    Spring WebFlux is a reactive, non-blocking web framework for building modern, scalable web applications in Java.
    
28.  **What is Spring Cloud OpenFeign?**  
    Feign is a declarative web service client. It makes writing web service clients easier.  
      
    To use Feign create an interface and annotate it. It has pluggable annotation support including Feign annotations and JAX-RS annotations.  
      
    Feign also supports pluggable encoders and decoders. Spring Cloud adds support for Spring MVC annotations and for using the same HttpMessageConverters used by default in Spring Web.  
      
    Spring Cloud integrates Eureka, as well as Spring Cloud LoadBalancer to provide a load-balanced HTTP client when using Feign.
    
29.  **How to Enable Feign Client using @EnableFeignClients?**  
    First, we need to enable feign client inside the application by using '@EnableFeignClients' annotation in the main class.  
    **Example:**  
```java
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.cloud.openfeign.EnableFeignClients;  

@SpringBootApplication  
@EnableFeignClients  
public class NITApplication {  
    public static void main(String [] args) {  
        SpringApplication.run(NITApplication.class, args);  
    }  
}
```