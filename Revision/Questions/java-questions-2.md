Spring Boot In-depth Interview FAQs
===================================

**Questions on Spring Boot part- 1**

1.  Why will you choose Spring Boot over Spring Framework ?
2.  What all spring boot starter you have used or what all module you have worked on ?
3.  How will you run your Spring Boot application ?
4.  What is the purpose of the [@SpringBootApplicatio](http://twitter.com/SpringBootApplicatio)n annotation in a Spring Boot application ?
5.  can I directly use [@EnableAutoConfigurat](http://twitter.com/EnableAutoConfigurat)ion ,[@ComponentScan](http://twitter.com/ComponentScan) & [@Configuration](http://twitter.com/Configuration) annotation in my main class , instead of using  
    [@SpringBootApplicatio](http://twitter.com/SpringBootApplicatio)n annotation , if yes will my application work as expected ?
6.  What is Auto configuration in spring boot ?
7.  How can you disable a specific auto-configuration class in Spring Boot ?
8.  How can you customize the default configuration in Spring Boot ?
9.  How Spring boot run() method works internally ?
10.  What is Command line runner in spring boot ?

**Questions on Spring Boot part- 2**

1.  Can you explain the purpose of Stereotype annotations in the Spring Framework ?
2.  How can you define bean in spring framework ?
3.  What is dependency injection ?
4.  How many ways we can perform dependency injection in spring or spring boot ?
5.  where you would choose to use setter injection over constructor injection, and vice versa ?
6.  Can you provide an example of a real-world use case where @PostConstruct is particularly useful?
7.  How can we dynamically load values in a Spring Boot application?
8.  Can you explain the key differences between YML and properties files, and in what scenarios you might prefer one format over the other?
9.  What is the difference between yml & YAML ?
10.  If I will configure same values in both properties then which value will be load in spring boot OR Who will load first properties or yml file ?
11.  How to load External Properties in Spring Boot ?
12.  How to map or bind config properties to java Object ?

**Questions on Spring Boot part- 3**

1.  How will you resolve bean dependency ambiguity ?
2.  Can we avoid this dependency ambiguity without using @Qualifier ?
3.  What is bean scope & Can you explain different type of bean scope ?
4.  How to define custom bean scope ?
5.  Can you provide a few real-time use cases for when to choose Singleton scope and Prototype scope ?
6.  can we inject prototype bean in singleton bean ? if yes what will happen if we inject prototype bean in singleton bean ?
7.  What is the difference between spring singleton and plain singleton ?
8.  What is the purpose of the BeanPostProcessor interface in Spring, and how can you use it to customize bean initialization and destruction?

**Questions on Spring Boot part- 4**

1.  Have you worked on Restful webservices ? If yes What all HTTP methods have you used in your project ?
2.  How can you specify the HTTP method type for your REST endpoint?
3.  Scenario : Can you design a rest endpoint , Assume that you have a Product database, and your task is to create an API to filter a list of products by productType ?
4.  Scenario : Design endpoints in a way that takes “productType” as input. If the user provides this input, the endpoint should filter products based on the specified condition. If “productType” is not provided, the endpoint should return all the products. ?
5.  What is the difference between @PathVariable & @RequestParam ?
6.  Why did you use @RestController why not @Controller ?
7.  How can we deserialize a JSON request payload into an object within a Spring MVC controller ?
8.  Can we perform update operation in POST http method if yes then why do we need Put Mapping or put http method?
9.  Can we pass Request Body in GET HTTP Method ?
10.  How can we perform content negotiation (XML/JSON) in Rest endpoint ?
11.  What all status code you have observed in your application ?
12.  How can you customize the status code for your endpoint ?
13.  How can you enable cross origin ?
14.  How can you upload a file in spring ?
15.  How do you maintain versioning for your REST API?
16.  How will you document your rest API ?
17.  How can you hide certain REST endpoints to prevent them from being exposed externally?
18.  How will you consume restful API ?

**Questions on Spring Boot part- 5**

1.  How will you handle exceptions in your project ?
2.  How can you avoid defining handlers for multiple exceptions, or what is the best practice for handling exceptions ?
3.  How will you validate or sanitise your input payload ?
4.  How can you populate validation error message to the end users ?
5.  How can you define custom bean validation ?
6.  use case : let’s say you find a bug in production environment and now you want to debug that scenario ,How can you do that from your local ?
7.  How can you enable a specific environment without using profiles? OR what is the alternative to profiles to achieving same use case ?
8.  What is the difference between @Profile & @ConditioOnXXX ?
9.  What is AOP ?
10.  What is pointcut & join Points in AOP ?
11.  What are different type of advice ?
12.  use case — can I use AOP to evaluate performance of a method or is this possible to design a logging framework to capture request and response body of a method ?

**Questions on Spring Boot part- 6**

1.  How does your application interact with the database and which frameworks are you using?
2.  Why is it important to configure a physical naming strategy?
3.  What are the key benefits of using Spring Data JPA ?
4.  What are the differences between Hibernate, JPA, and Spring Data JPA?
5.  How can you connect multiple databases or data sources in a single application?
6.  What are the different ways to define custom queries in Spring Data JPA ?
7.  Can you provide example to find results based on some range
    - Ex 1 : Find list of employees whose age in between 30 lakh to 35 lakh  
    - Ex 2 : find avg salary of employees in an organization
  
8. How will you define entity relationships or association mapping in Spring Data JPA?

    (Use Case: Consider an e-commerce application where each customer can have multiple orders. Here, a Customer entity can be associated with multiple Order entities.)

9. Is this possible to execute Join query in Spring Data JPA ? If yes, how can you add some insights ?

10. How will you implement pagination & Sorting in Spring Data JPA ?

**Questions on Spring Boot part- 7**

1.  How will you handle auditing in your application ?
2.  Explain Different annotation used for auditing
3.  How can auditing be applied in a NoSQL database like MongoDB in Spring Boot?
4.  How can we customize auditing in Spring Boot ?
5.  How do you track entity modifications across different users in a microservices architecture, and how can a centralized audit service help with cross-service auditing?
6.  What is transaction management and how it works ?
7.  How will you handle transaction in your application ?
8.  What are different type of Isolation and Propagation ?
9.  Can we use transaction in private methods ?
10.  How will you handle transaction in distributed microservice ?
11.  Can we use transaction in multiple microservices why or why not ?

