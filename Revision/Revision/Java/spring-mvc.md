Top Spring MVC Interview Questions and Answers
==============================================

![](https://miro.medium.com/v2/resize:fit:593/1*deUV5PES1N-lISGpQCpu7g.jpeg)

Spring MVC (Model-View-Controller) is a key component of the Spring Framework and is widely used in developing robust, scalable web applications. Interviewers often focus on Spring MVC during technical interviews to gauge a candidate’s understanding of web application architecture, their proficiency with the framework, and their ability to solve real-world problems using Spring MVC. In this article, we will explore some of the most frequently asked interview questions on Spring MVC and provide comprehensive answers to help you prepare.

Table of Contents
-----------------

1. What is Spring MVC?  
2. Explain the MVC architecture.  
3. What is DispatcherServlet?  
4. What are the advantages of using Spring MVC?  
5. What is the role of \`[@Controller](http://twitter.com/Controller)\` in Spring MVC?  
6. Explain the use of \`[@RequestMapping](http://twitter.com/RequestMapping)\`.  
7. How does Spring MVC handle exceptions?  
8. What are Model, ModelMap, and ModelAndView?  
9. Explain the role of \`[@PathVariable](http://twitter.com/PathVariable)\` and \`[@RequestParam](http://twitter.com/RequestParam)\`.  
10. How do you validate form data in Spring MVC?  
11. How do you handle file uploads in Spring MVC?  
12. What is the use of \`[@ResponseBody](http://twitter.com/ResponseBody)\` and \`[@RequestBody](http://twitter.com/RequestBody)\`?  
13. How do you implement session management in Spring MVC?  
14. How does Spring MVC integrate with other Spring modules?  
15. Explain the lifecycle of a Spring MVC request.

### 1. What is Spring MVC?

Answer:  
Spring MVC is a framework within the Spring Framework that is used for building web applications. It follows the Model-View-Controller (MVC) design pattern, which separates the application into three interconnected components: Model (data), View (presentation), and Controller (business logic).

### 2. Explain the MVC architecture.

![](https://miro.medium.com/v2/resize:fit:551/1*pQp6y-t9Wz4d7zH_Be78eQ.png)

*   **Model** — A model contains the data of the application. A data can be a single object or a collection of objects.
*   **Controller** — A controller contains the business logic of an application. Here, the @Controller annotation is used to mark the class as the controller.
*   **View** — A view represents the provided information in a particular format. Generally, JSP+JSTL is used to create a view page. Although spring also supports other view technologies such as Apache Velocity, Thymeleaf and FreeMarker.
*   **Front Controller** — In Spring Web MVC, the DispatcherServlet class works as the front controller. It is responsible to manage the flow of the Spring MVC application.

So ,  
\- **Model:** Represents the application data and business logic. It is responsible for managing the state of the application.  
\- **View:** Represents the presentation layer. It is responsible for rendering the user interface and displaying data to the user.  
**\- Controller:** Handles user input and interactions. It processes incoming requests, interacts with the model to retrieve or update data, and selects the appropriate view for rendering.

### 3. What is DispatcherServlet?

Answer:  
\`DispatcherServlet\` is the central component in Spring MVC that acts as the front controller. It is responsible for receiving all incoming HTTP requests, dispatching them to the appropriate handlers (controllers), and managing the overall request-processing workflow.

### 4. What are the advantages of using Spring MVC?

Answer:  
\- Separation of Concerns: Clear separation between business logic, presentation, and request handling.  
\- Flexible Configuration: Supports both XML and annotation-based configuration.  
\- Integrated with Spring: Seamlessly integrates with other Spring modules like Spring Security, Spring Data, and Spring Boot.  
\- Testability: Easy to test with support for mock objects and dependency injection.  
\- Robust Ecosystem: A large community and extensive documentation.

### 5. What is the role of \`[@Controller](http://twitter.com/Controller)\` in Spring MVC?

Answer:  
\`[@Controller](http://twitter.com/Controller)\` is an annotation used to define a controller class in Spring MVC. It indicates that the class will handle HTTP requests and return appropriate responses, often selecting a view for rendering.

### 6. Explain the use of \`[@RequestMapping](http://twitter.com/RequestMapping)\`.

Answer:  
\`[@RequestMapping](http://twitter.com/RequestMapping)\` is used to map HTTP requests to handler methods in a controller. It can be applied at the class level to define a base path and at the method level to specify the request URL, HTTP method, and other parameters.

Example:

@Controller  
@RequestMapping("/users")  
public class UserController {  
 @RequestMapping(value = "/list", method = RequestMethod.GET)  
 public String listUsers(Model model) {  
 // logic to retrieve users  
 return "userList";  
 }  
}

### 7. How does Spring MVC handle exceptions?

Answer:  
Spring MVC provides several ways to handle exceptions:  
\- @ExceptionHandler: Define exception handling methods in the controller.  
\- @ControllerAdvice: Global exception handling across multiple controllers.  
\- HandlerExceptionResolver: Implement custom logic for handling exceptions.

### 1. Using \`[@ExceptionHandler](http://twitter.com/ExceptionHandler)\`

The \`[@ExceptionHandler](http://twitter.com/ExceptionHandler)\` annotation is used to define exception handling methods within a specific controller. This allows for handling exceptions that occur in the same controller class.

Example:

@Controller  
public class UserController {  
  
     @RequestMapping("/user/{id}")  
     public String getUser(@PathVariable("id") Long id, Model model) {  
     if (id == null) {  
     throw new UserNotFoundException("User not found");  
     }  
  
     // logic to retrieve user  
     return "userView";  
 }  
  
  
@ExceptionHandler(UserNotFoundException.class)  
 public String handleUserNotFoundException(UserNotFoundException ex, Model model) {  
 model.addAttribute("errorMessage", ex.getMessage());  
 return "errorPage";  
 }  
}

In this example, if a \`UserNotFoundException\` is thrown in the \`getUser\` method, the \`handleUserNotFoundException\` method will handle it and return an error view.

### 2. Using \`[@ControllerAdvice](http://twitter.com/ControllerAdvice)\`

\`[@ControllerAdvice](http://twitter.com/ControllerAdvice)\` is used to define global exception handling across multiple controllers. This approach centralizes exception handling, making the code cleaner and easier to maintain.

Example:

@ControllerAdvice  
public class GlobalExceptionHandler {  
  
 @ExceptionHandler(UserNotFoundException.class)  
 @ResponseStatus(HttpStatus.NOT\_FOUND)  
 public ModelAndView handleUserNotFoundException(UserNotFoundException ex) {  
 ModelAndView mav \= new ModelAndView("errorPage");  
 mav.addObject("errorMessage", ex.getMessage());  
 return mav;  
 }  
  
 @ExceptionHandler(Exception.class)  
 @ResponseStatus(HttpStatus.INTERNAL\_SERVER\_ERROR)  
 public ModelAndView handleGenericException(Exception ex) {  
 ModelAndView mav \= new ModelAndView("errorPage");  
 mav.addObject("errorMessage", "An unexpected error occurred");  
 return mav;  
 }  
}

In this example, any \`UserNotFoundException\` thrown by any controller will be handled by the \`handleUserNotFoundException\` method in the \`GlobalExceptionHandler\` class. Similarly, any other exceptions will be handled by the \`handleGenericException\` method.

### 3. Using \`HandlerExceptionResolver\`

The \`HandlerExceptionResolver\` interface allows for more fine-grained control over exception handling by implementing custom logic.

Example:

public class CustomExceptionResolver implements HandlerExceptionResolver {  
 @Override  
 public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {  
 ModelAndView mav = new ModelAndView("errorPage");  
if (ex instanceof UserNotFoundException) {  
 mav.addObject("errorMessage", ex.getMessage());  
 response.setStatus(HttpStatus.NOT\_FOUND.value());  
 } else {  
 mav.addObject("errorMessage", "An unexpected error occurred");  
 response.setStatus(HttpStatus.INTERNAL\_SERVER\_ERROR.value());  
 }  
return mav;  
 }  
}

To register the \`CustomExceptionResolver\`, you need to add it to the Spring configuration.

Configuration:

@Configuration  
public class WebConfig implements WebMvcConfigurer {  
@Override  
 public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {  
 resolvers.add(new CustomExceptionResolver());  
 }  
}

Thus handling exceptions in Spring MVC can be achieved in several ways, each with its own advantages. Using \`[@ExceptionHandler](http://twitter.com/ExceptionHandler)\` within a controller provides localized handling, \`[@ControllerAdvice](http://twitter.com/ControllerAdvice)\` allows for global exception management, and implementing \`HandlerExceptionResolver\` offers custom logic and fine-grained control. By using these methods, you can ensure your application handles errors gracefully and provides a better user experience.

### 8. What are Model, ModelMap, and ModelAndView?

Answer:  
\- **Model:** An interface that defines a holder for model attributes. It is used to pass data from the controller to the view.  
\- **ModelMap**: A class that implements the Map interface and provides additional convenience methods for working with model attributes.  
\- **ModelAndView**: A holder for both the model and the view. It allows returning both the model data and the view name from a controller method.

[](/plans?source=promotion_paragraph---post_body_banner_dot_calm_field--ec6d603a1ef8---------------------------------------)

Example:

@RequestMapping("/hello")  
public ModelAndView hello() {  
 ModelAndView mav \= new ModelAndView("hello");  
 mav.addObject("message", "Hello, World!");  
 return mav;  
}

### 9. Explain the role of \`[@PathVariable](http://twitter.com/PathVariable)\` and \`[@RequestParam](http://twitter.com/RequestParam)\`.

Answer:  
\- @PathVariable: Binds a method parameter to a URI template variable. It is used to extract values from the URL.

@RequestMapping("/users/{id}")  
public String getUserById(@PathVariable("id") Long userId, Model model) {  
 // logic to retrieve user by id  
 return "userDetail";  
}

\- @RequestParam: Binds a method parameter to a query parameter in the request.

@RequestMapping("/search")  
public String search(@RequestParam("query") String query, Model model) {  
 // logic to perform search  
 return "searchResults";  
}

### 10. How do you validate form data in Spring MVC?

Answer:  
Spring MVC provides support for form validation using JSR-303/JSR-380 annotations and the \`[@Valid](http://twitter.com/Valid)\` annotation.

Example:

1. Create a Model with Validation Annotations:

public class User {  
 @NotEmpty  
 private String name;  
 @Email  
 private String email;  
// getters and setters  
}

2. Controller Method with \`[@Valid](http://twitter.com/Valid)\`:

@PostMapping("/register")  
public String register(@Valid @ModelAttribute("user") User user, BindingResult result) {  
 if (result.hasErrors()) {  
 return "registrationForm";  
 }  
 // logic to save user  
 return "registrationSuccess";  
}

### 11. How do you handle file uploads in Spring MVC?

Answer:  
Spring MVC supports file uploads using the \`MultipartFile\` interface.

Example:

1. Add Multipart Configuration:

@Bean  
public MultipartResolver multipartResolver() {  
 return new StandardServletMultipartResolver();  
}

2. Controller Method for File Upload:

@PostMapping("/upload")  
public String uploadFile(@RequestParam("file") MultipartFile file, Model model) {  
 if (!file.isEmpty()) {  
 // logic to handle file  
 }  
 return "uploadSuccess";  
}

3. File Upload Form:

### 12. What is the use of \`[@ResponseBody](http://twitter.com/ResponseBody)\` and \`[@RequestBody](http://twitter.com/RequestBody)\`?

Answer:  
\- @ResponseBody: Indicates that the return value of a method should be used as the response body, rather than rendering a view.

@GetMapping("/user")  
@ResponseBody  
public User getUser() {  
 // logic to retrieve user  
 return user;  
}

\- @RequestBody: Binds the HTTP request body to a method parameter.

@PostMapping("/user")  
public String createUser(@RequestBody User user) {  
 // logic to create user  
 return "userCreated";  
}

### 13. How do you implement session management in Spring MVC?

Answer:  
Spring MVC provides support for session management using the \`[@SessionAttributes](http://twitter.com/SessionAttributes)\` and \`[@SessionAttribute](http://twitter.com/SessionAttribute)\` annotations.

Example:

1. Using \`[@SessionAttributes](http://twitter.com/SessionAttributes)\`:

@Controller  
@SessionAttributes("user")  
public class UserController {  
@ModelAttribute("user")  
 public User user() {  
 return new User();  
 }  
@GetMapping("/profile")  
 public String userProfile() {  
 return "profile";  
 }  
}

2. Using \`[@SessionAttribute](http://twitter.com/SessionAttribute)\`:

@GetMapping("/profile")  
public String userProfile(@SessionAttribute("user") User user) {  
 // logic to handle user session data  
 return "profile";  
}

### 14. How does Spring MVC integrate with other Spring modules?

Answer:  
Spring MVC integrates seamlessly with other Spring modules such as:  
\- Spring Security: For authentication and authorization.  
\- Spring Data JPA: For data access and ORM.  
\- Spring Boot: For simplifying configuration and setup.  
\- Spring AOP: For aspect-oriented programming.

Example: Integrating Spring Data JPA

1. Add Spring Data JPA Dependency:

<dependency\>  
 <groupId\>org.springframework.boot</groupId\>  
 <artifactId\>spring-boot-starter-data-jpa</artifactId\>  
</dependency\>

2. Create a JPA Entity:

@Entity  
public class User {  
 @Id  
 @GeneratedValue(strategy = GenerationType.IDENTITY)  
 private Long id;  
 private String name;  
private String email;  
// getters and setters  
}

3. Create a Repository Interface:

public interface UserRepository extends JpaRepository<User, Long\> {  
}

### 15. Explain the lifecycle of a Spring MVC request.

![](https://miro.medium.com/v2/resize:fit:875/1*CBaCJsk9fnJjq_ic15j9FQ.png)

Answer:  
1. Client Request: The client sends an HTTP request to the server.  
2. DispatcherServlet: The request is received by \`DispatcherServlet\`.  
3. Handler Mapping: \`DispatcherServlet\` consults the handler mappings to find the appropriate controller.  
4. Controller: The controller processes the request and interacts with the model.  
5. View Resolver: The controller returns a \`ModelAndView\` object, which is used by \`DispatcherServlet\` to resolve the view.  
6. View Rendering: The view is rendered and the response is sent back to the client.

Conclusion

Spring MVC is a comprehensive framework for building web applications in Java. Understanding its core concepts and being able to answer interview questions related to it is crucial for any developer aiming for a role in web development. This guide covers the most commonly asked Spring MVC interview questions, providing detailed answers and examples to help you prepare thoroughly. Good luck with your interview preparation!