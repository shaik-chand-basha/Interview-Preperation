Spring Security Interview Q &A
==============================

1. What is Spring Security?
----------------------------

**Answer:** Spring Security is a powerful and customizable framework for securing Java applications. It helps protect applications by providing **authentication (verifying who you are)** and **authorization (checking what you are allowed to do).**

2. What are the main components of Spring Security?
----------------------------------------------------

**Answer:** The main components are:

*   **Authentication:** Verifies the identity of a user.
*   **Authorization:** Determines what a user can do.
*   **Filters:** Intercepts requests to apply security checks.
*   **Security Context:** Stores information about the current user.

3. How do you configure security in a Spring Boot application?
---------------------------------------------------------------

**Answer:** In Spring Boot, you can configure security using a class with the `**@Configuration**` annotation and defining a `**SecurityFilterChain**` bean. This replaces the older way of extending `**WebSecurityConfigurerAdapter**`.
```java

import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.security.config.annotation.web.builders.HttpSecurity;  
import org.springframework.security.web.SecurityFilterChain;  
  
@Configuration  
public class SecurityConfig {  
  
    @Bean  
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {  
        http  
            .authorizeHttpRequests(authorizeRequests ->  
                authorizeRequests  
                    .requestMatchers("/public/**").permitAll()  
                    .anyRequest().authenticated()  
            )  
            .formLogin(formLogin ->  
                formLogin  
                    .loginPage("/login")  
                    .permitAll()  
            )  
            .logout(logout ->  
                logout  
                    .permitAll()  
            );  
        return http.build();  
    }  
}
```
4. What is a `UserDetailsService`?
-----------------------------------

**Answer:** `**UserDetailsService**` is an interface used to retrieve user-related data. It has a single method, `**loadUserByUsername(String username)**`, which is used to find user details by their username.

5. How do you create an in-memory user for testing?
----------------------------------------------------

Answer: You can create an in-memory user by defining a `**UserDetailsService**` bean:
```java

import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.security.core.userdetails.User;  
import org.springframework.security.core.userdetails.UserDetailsService;  
import org.springframework.security.provisioning.InMemoryUserDetailsManager;  
  
@Configuration  
public class UserConfig {  
  
    @Bean  
    public UserDetailsService userDetailsService() {  
        var user = User.withUsername("user")  
            .password("{noop}password") // {noop} means no password encoder  
            .roles("USER")  
            .build();  
        return new InMemoryUserDetailsManager(user);  
    }  
}
```
6. What is a `PasswordEncoder` and why is it important?
--------------------------------------------------------

**Answer:** `**PasswordEncoder**` is an interface for encoding passwords. It is important because it ensures that passwords are stored securely in an encoded (hashed) form, rather than as plain text.
```java

import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;  
import org.springframework.security.crypto.password.PasswordEncoder;  
  
@Configuration  
public class PasswordConfig {  
  
    @Bean  
    public PasswordEncoder passwordEncoder() {  
        return new BCryptPasswordEncoder();  
    }  
}
```
7. How do you secure specific URLs in Spring Security?
-------------------------------------------------------

**Answer:** You can secure specific URLs by using the `**authorizeHttpRequests**` method in your `**SecurityFilterChain**` configuration:
```java

http  
    .authorizeHttpRequests(authorizeRequests ->  
        authorizeRequests  
            .requestMatchers("/admin/**").hasRole("ADMIN")  
            .requestMatchers("/user/**").hasRole("USER")  
            .anyRequest().authenticated()  
    );
```
8. What is CSRF protection and why is it important?
----------------------------------------------------

**Answer: CSRF (Cross-Site Request Forgery)** protection prevents malicious websites from making requests on behalf of authenticated users. It’s important because it protects against unauthorized actions performed by attackers.

Spring Security enables CSRF protection by default. To customize or disable it, you can use:

http.csrf().disable(); // This disables CSRF protection, which is not recommended for most cases.

9. How do you handle logout in Spring Security?
------------------------------------------------

**Answer:** You can configure logout in your `**SecurityFilterChain**` configuration:
```java

http  
    .logout(logout ->  
        logout  
            .logoutUrl("/logout")  
            .logoutSuccessUrl("/login?logout")  
            .permitAll()  
    );
```
0. What is the `SecurityContextHolder`?
----------------------------------------

**Answer:** `**SecurityContextHolder**` is a class that holds the `**SecurityContext**` containing the security information of the current user. It provides methods to get and set the authentication details.

11. What are the default login and logout URLs in Spring Security?
-------------------------------------------------------------------

**Answer:** The default login URL is `**/login**` and the default logout URL is `**/logout**`.

12. How do you enable HTTPS (SSL/TLS) in a Spring Boot application?
--------------------------------------------------------------------

**Answer:** To enable HTTPS, you need to configure SSL in your `**application.properties**` or `**application.yml**` file and provide a keystore with your SSL certificate:
```properties
server.port=8443  
server.ssl.key-store=classpath:keystore.p12  
server.ssl.key-store-password=yourpassword  
server.ssl.key-store-type=PKCS12  
server.ssl.key-alias=selfsigned
```
13. What is method-level security and how do you enable it?
------------------------------------------------------------

**Answer:** Method-level security allows you to secure individual methods in your service layer. You can enable it with the `**@EnableMethodSecurity**` annotation and use annotations like `**@PreAuthorize**` on methods.
```java

import org.springframework.security.access.prepost.PreAuthorize;  
  
@Service  
public class MyService {  
  
    @PreAuthorize("hasRole('ADMIN')")  
    public void secureMethod() {  
        // Method implementation  
    }  
}
```
14. What is OAuth2 and how does it work with Spring Security?
--------------------------------------------------------------

**Answer:** OAuth2 is an authorization framework that allows third-party services to exchange limited access tokens on behalf of users. Spring Security provides support for OAuth2 to help you integrate with OAuth2 providers like Google, Facebook, etc.

15. How do you configure OAuth2 login in Spring Security?
----------------------------------------------------------

**Answer:** You can configure OAuth2 login using the `**oauth2Login**` method in your `**SecurityFilterChain**` configuration:
```java

http  
    .oauth2Login(oauth2Login ->  
        oauth2Login  
            .loginPage("/oauth2/authorization/login-client")  
    );
```
16. What is a Security Filter Chain?
-------------------------------------

**Answer:** A Security Filter Chain is a series of filters that apply security to incoming requests in a specific order. In Spring Security, filters are used to manage authentication, authorization, CSRF protection, session management, and more. The `S**ecurityFilterChain**` bean in Spring Boot replaces the `**WebSecurityConfigurerAdapter**` for defining these security rules.

17. How do you secure a REST API in Spring Boot?
-------------------------------------------------

**Answer:** Securing a REST API involves configuring authentication and authorization for API endpoints. Here’s a basic example:
```java

import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.security.config.annotation.web.builders.HttpSecurity;  
import org.springframework.security.web.SecurityFilterChain;  
  
@Configuration  
public class ApiSecurityConfig {  
  
    @Bean  
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {  
        http  
            .csrf().disable()  
            .authorizeHttpRequests(authorizeRequests ->  
                authorizeRequests  
                    .requestMatchers("/api/public/**").permitAll()  
                    .requestMatchers("/api/admin/**").hasRole("ADMIN")  
                    .anyRequest().authenticated()  
            )  
            .httpBasic();  
        return http.build();  
    }  
}
```
18. How do you customize the login page in Spring Security?
------------------------------------------------------------

**Answer:** You can customize the login page by specifying a custom login page URL in your security configuration:

http  
    .formLogin(formLogin ->  
        formLogin  
            .loginPage("/custom-login")  
            .permitAll()  
    );

You also need to create a controller and a view for your custom login page.

19. What is a `UserDetails` and how is it used?
------------------------------------------------

**Answer:** `**UserDetails**` is an interface that provides core user information. Implementations are used by Spring Security to store authentication and authorization details:

import org.springframework.security.core.GrantedAuthority;  
import org.springframework.security.core.userdetails.UserDetails;  
  
import java.util.Collection;  
  
public class CustomUserDetails implements UserDetails {  
  
    private String username;  
    private String password;  
    private boolean enabled;  
    private Collection<? extends GrantedAuthority> authorities;  
  
    // Constructor, getters and setters  
  
    @Override  
    public Collection<? extends GrantedAuthority> getAuthorities() {  
        return authorities;  
    }  
  
    @Override  
    public String getPassword() {  
        return password;  
    }  
  
    @Override  
    public String getUsername() {  
        return username;  
    }  
  
    @Override  
    public boolean isAccountNonExpired() {  
        return true;  
    }  
  
    @Override  
    public boolean isAccountNonLocked() {  
        return true;  
    }  
  
    @Override  
    public boolean isCredentialsNonExpired() {  
        return true;  
    }  
  
    @Override  
    public boolean isEnabled() {  
        return enabled;  
    }  
}

20. How do you integrate Spring Security with JWT?
---------------------------------------------------

**Answer:** To integrate JWT (JSON Web Token) with Spring Security, you generally follow these steps:

1.  **Add Dependencies:** Add necessary dependencies in `pom.xml` or `build.gradle`.
2.  **JWT Utility Class:** Create a utility class for generating and validating JWT tokens.
3.  **Filter for JWT:** Implement a filter to intercept requests and extract/validate JWT tokens.
4.  **Security Configuration:** Update the security configuration to include the JWT filter.

Here is a simplified example:

### JWT Utility Class:
```java
import io.jsonwebtoken.Claims;  
import io.jsonwebtoken.Jwts;  
import io.jsonwebtoken.SignatureAlgorithm;  
  
import java.util.Date;  
  
public class JwtUtil {  
  
    private String secret = "your_secret_key";  
  
    public String generateToken(String username) {  
        return Jwts.builder()  
            .setSubject(username)  
            .setIssuedAt(new Date(System.currentTimeMillis()))  
            .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // 10 hours  
            .signWith(SignatureAlgorithm.HS512, secret)  
            .compact();  
    }  
  
    public Claims extractClaims(String token) {  
        return Jwts.parser()  
            .setSigningKey(secret)  
            .parseClaimsJws(token)  
            .getBody();  
    }  
  
    public boolean validateToken(String token, String username) {  
        final String extractedUsername = extractClaims(token).getSubject();  
        return (extractedUsername.equals(username) && !isTokenExpired(token));  
    }  
  
    private boolean isTokenExpired(String token) {  
        return extractClaims(token).getExpiration().before(new Date());  
    }  
}

### JWT Filter:

import javax.servlet.FilterChain;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.security.core.context.SecurityContextHolder;  
import org.springframework.security.core.userdetails.UserDetailsService;  
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;  
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;  
import org.springframework.security.core.userdetails.UserDetails;  
  
import java.io.IOException;  
  
public class JwtFilter extends UsernamePasswordAuthenticationFilter {  
  
    @Autowired  
    private JwtUtil jwtUtil;  
  
    @Autowired  
    private UserDetailsService userDetailsService;  
  
    @Override  
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)  
            throws ServletException, IOException {  
        String authorizationHeader = request.getHeader("Authorization");  
  
        String token = null;  
        String username = null;  
  
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {  
            token = authorizationHeader.substring(7);  
            username = jwtUtil.extractClaims(token).getSubject();  
        }  
  
        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {  
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);  
  
            if (jwtUtil.validateToken(token, userDetails.getUsername())) {  
                UsernamePasswordAuthenticationToken authToken =  
                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());  
                SecurityContextHolder.getContext().setAuthentication(authToken);  
            }  
        }  
        chain.doFilter(request, response);  
    }  
}

### Security Configuration:

import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.security.config.annotation.web.builders.HttpSecurity;  
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;  
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;  
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;  
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;  
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;  
import org.springframework.security.crypto.password.PasswordEncoder;  
import org.springframework.security.web.SecurityFilterChain;  
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;  
  
@Configuration  
@EnableWebSecurity  
public class SecurityConfig {  
  
    @Bean  
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {  
        http  
            .csrf().disable()  
            .authorizeHttpRequests(authorizeRequests ->  
                authorizeRequests  
                    .requestMatchers("/public/**").permitAll()  
                    .anyRequest().authenticated()  
            )  
            .addFilterBefore(jwtFilter(), UsernamePasswordAuthenticationFilter.class);  
  
        return http.build();  
    }  
  
    @Bean  
    public JwtFilter jwtFilter() {  
        return new JwtFilter();  
    }  
  
    @Bean  
    public PasswordEncoder passwordEncoder() {  
        return new BCryptPasswordEncoder();  
    }  
}
```
21. What is CORS and how do you configure it in Spring Security?
-----------------------------------------------------------------

**Answer:** CORS (**Cross-Origin Resource Sharing**) is a security feature that allows or restricts resources on a web server to be requested from another domain outside the server’s domain.

     [](https://medium.com/plans?source=promotion_paragraph---post_body_banner_dot_calm_field--ffa3a329e9f5---------------------------------------)

**To configure CORS in Spring Security:**
```java

import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.web.cors.CorsConfiguration;  
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;  
import org.springframework.web.filter.CorsFilter;  
  
@Configuration  
public class CorsConfig {  
  
    @Bean  
    public CorsFilter corsFilter() {  
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
        CorsConfiguration config = new CorsConfiguration();  
        config.setAllowCredentials(true);  
        config.addAllowedOrigin("http://example.com");  
        config.addAllowedHeader("*");  
        config.addAllowedMethod("*");  
        source.registerCorsConfiguration("/**", config);  
        return new CorsFilter(source);  
    }  
}
```
22. What is role-based access control (RBAC) in Spring Security?
-----------------------------------------------------------------

**Answer:** RBAC is a method of regulating access to resources based on the roles assigned to users. In Spring Security, roles can be defined and checked in the security configuration:
```java

http  
    .authorizeHttpRequests(authorizeRequests ->  
        authorizeRequests  
            .requestMatchers("/admin/**").hasRole("ADMIN")  
            .requestMatchers("/user/**").hasRole("USER")  
            .anyRequest().authenticated()  
    );
```
23. How can you use method security annotations?
-------------------------------------------------

**Answer:** Spring Security allows the use of method security annotations to secure individual methods. First, enable method security by using `**@EnableMethodSecurity**` and then use annotations like `**@PreAuthorize**`**,** `**@PostAuthorize**`**,** `**@Secured**`**,** or `**@RolesAllowed**`:
```java

import org.springframework.security.access.prepost.PreAuthorize;  
import org.springframework.security.access.annotation.Secured;  
import org.springframework.stereotype.Service;  
  
@Service  
public class MyService {  
  
    @PreAuthorize("hasRole('ADMIN')")  
    public void adminOnlyMethod() {  
        // Method implementation  
    }  
  
    @Secured("ROLE_USER")  
    public void userOnlyMethod() {  
        // Method implementation  
    }  
}
```
24. How do you configure session management in Spring Security?
----------------------------------------------------------------

**Answer:** You can configure session management to control session creation and handling:
```java

http  
    .sessionManagement(sessionManagement ->  
        sessionManagement  
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)  
    );
```
`**SessionCreationPolicy**` options include:

*   `**ALWAYS**`**:** Always create a session.
*   `**IF_REQUIRED**`**:** Create a session only if required (default).
*   `**NEVER**`**:** Spring Security will never create a session but will use one if it exists.
*   `**STATELESS**`**:** Spring Security will never create or use a session.

28. How do you enable basic authentication in Spring Security?
---------------------------------------------------------------

**Answer:** Basic authentication can be enabled using the `**httpBasic**` method in the security configuration:
```java

http  
    .authorizeHttpRequests(authorizeRequests ->  
        authorizeRequests  
            .anyRequest().authenticated()  
    )  
    .httpBasic();
```
29. How do you handle CSRF protection in Spring Security?
----------------------------------------------------------

**Answer:** CSRF protection is enabled by default in Spring Security. You can customize it or disable it (not recommended) in your security configuration:
```java

http  
    .csrf(csrf -> csrf  
        .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())  
    );

To disable CSRF (not recommended for production):

http  
    .csrf().disable();
```
30. What is an `AuthenticationManager` and how do you configure it?
--------------------------------------------------------------------

**Answer:** `**AuthenticationManager**` is responsible for processing authentication requests. It uses `**AuthenticationProvider**` to perform the actual authentication. You can configure it in your security configuration:
```java

import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.security.authentication.AuthenticationManager;  
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;  
  
@Configuration  
public class AuthManagerConfig {  
  
    @Bean  
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {  
        return authenticationConfiguration.getAuthenticationManager();  
    }  
}
```
39. What are the common annotations used in Spring Security?
-------------------------------------------------------------

**Answer:**

*   `**@EnableWebSecurity**`**:** Enables web security in a Spring application.
*   `**@EnableMethodSecurity**`: Enables method-level security.
*   `**@PreAuthorize**`: Applies method-level security using SpEL expressions.
*   `**@PostAuthorize**`: Evaluates security after the method execution.
*   `**@Secured**`: Secures methods with specific roles.
*   `**@RolesAllowed**`**:** Specifies roles allowed to access methods.

Change in spring boot 3 in spring security

In **Spring Security 5.7.0-M2**, the `**WebSecurityConfigurerAdapter**` class was deprecated to encourage a more modular and component-based approach to security configuration.

This new method involves creating a `**SecurityFilterChai**n` bean to configure `**HttpSecurity**`. This approach provides more flexibility and leverages the power of Spring's dependency injection to manage security configurations.

Here’s an explanation and code example for migrating from `**WebSecurityConfigurerAdapter**` to the new `**SecurityFilterChain**` approach:

Old Approach with WebSecurityConfigurerAdapter
----------------------------------------------
```java

import org.springframework.security.config.annotation.web.builders.HttpSecurity;  
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;  
  
public class SecurityConfig extends WebSecurityConfigurerAdapter {  
  
    @Override  
    protected void configure(HttpSecurity http) throws Exception {  
        http  
            .authorizeRequests()  
                .antMatchers("/public/**").permitAll()  
                .anyRequest().authenticated()  
            .and()  
            .formLogin()  
                .loginPage("/login")  
                .permitAll()  
            .and()  
            .logout()  
                .permitAll();  
    }  
}
```
New Approach with SecurityFilterChain
-------------------------------------
```java
import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.security.config.annotation.web.builders.HttpSecurity;  
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;  
import org.springframework.security.core.userdetails.User;  
import org.springframework.security.core.userdetails.UserDetails;  
import org.springframework.security.core.userdetails.UserDetailsService;  
import org.springframework.security.provisioning.InMemoryUserDetailsManager;  
import org.springframework.security.web.SecurityFilterChain;  
  
@Configuration  
@EnableWebSecurity  
public class SecurityConfig {  
  
    @Bean  
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {  
        http  
            .authorizeHttpRequests(authorize -> authorize  
                .requestMatchers("/public/**").permitAll()  
                .anyRequest().authenticated()  
            )  
            .formLogin(formLogin -> formLogin  
                .loginPage("/login")  
                .permitAll()  
            )  
            .logout(logout -> logout  
                .permitAll()  
            );  
        return http.build();  
    }  
  
    @Bean  
    public UserDetailsService userDetailsService() {  
        UserDetails user = User.withDefaultPasswordEncoder()  
            .username("user")  
            .password("password")  
            .roles("USER")  
            .build();  
        return new InMemoryUserDetailsManager(user);  
    }  
}
```
Explanation of the New Approach
-------------------------------

1.  SecurityFilterChain Bean: The `**SecurityFilterChain**` bean configures `**HttpSecurity**` to set up authorization rules, form login, and logout settings.
2.  HttpSecurity Configuration: Inside the `**SecurityFilterChain**` bean, `**HttpSecurity**` is customized similarly to the old approach.

*   `**authorizeHttpRequests**` replaces `**authorizeRequests**`.
*   `**requestMatchers**` replaces `**antMatchers**`.
*   The `**formLogin**` and `**logout**` configurations remain similar, with lambda syntax providing better readability.

3. **UserDetailsService Bean**: This bean defines an in-memory user store for demonstration purposes. `**UserDetailsService**` can be customized to fetch users from a database or other sources in real applications.

Benefits of the New Approach
----------------------------

*   **Component-Based Configuration**: Breaking down security configuration into separate beans makes the codebase more modular and easier to manage.
*   **Better Integration with Spring**: Using beans leverages Spring’s dependency injection, making it easier to test and configure.
*   **Flexibility**: This approach allows you to have multiple security configurations by defining multiple `**SecurityFilterChain**` beans with different order values.

Migration Steps
---------------

1.  **Remove WebSecurityConfigurerAdapter:** Remove any classes extending `**WebSecurityConfigurerAdapter**`.
2.  **Create SecurityFilterChain Beans**: Define one or more `**SecurityFilterChain**` beans to handle security configurations.
3.  **Define UserDetailsService Bean:** Configure a `**UserDetailsService**` bean to manage user details.