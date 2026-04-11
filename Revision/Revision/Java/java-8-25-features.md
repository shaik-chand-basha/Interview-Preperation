# Java Features

[](#java-8-march-2014-lts)Java 8 (March 2014) - LTS
---------------------------------------------------

Java 8 was revolutionary, introducing functional programming concepts that changed how developers write Java code.

### [](#lambda-expressions)Lambda Expressions

The most significant addition, enabling functional-style programming:  

    // Before Java 8
    List<String> names = Arrays.asList("John", "Jane", "Bob");
    Collections.sort(names, new Comparator<String>() {
        public int compare(String a, String b) {
            return a.compareTo(b);
        }
    });
    
    // Java 8 with Lambda
    Collections.sort(names, (a, b) -> a.compareTo(b));
    



### [](#stream-api)Stream API

Process collections declaratively with powerful operations:  

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    int sum = numbers.stream()
        .filter(n -> n % 2 == 0)
        .mapToInt(Integer::intValue)
        .sum();
    



### [](#functional-interfaces)Functional Interfaces

Single abstract method interfaces that enable lambdas:

*   `Function<T,R>` - transforms input to output
*   `Predicate<T>` - tests conditions
*   `Consumer<T>` - performs operations without return
*   `Supplier<T>` - supplies values

### [](#method-references)Method References

Simplified lambda syntax for existing methods:  

    // Lambda
    names.forEach(name -> System.out.println(name));
    
    // Method reference
    names.forEach(System.out::println);
    



### [](#default-methods-in-interfaces)Default Methods in Interfaces

Add methods to interfaces without breaking implementations:  

    interface Vehicle {
        default void start() {
            System.out.println("Starting vehicle...");
        }
    }
    



### [](#optional-class)Optional Class

Eliminate null pointer exceptions:  

    Optional<String> optional = Optional.ofNullable(getValue());
    String result = optional.orElse("default");
    



### [](#new-date-and-time-api-javatime)New Date and Time API (java.time)

Based on Joda-Time, providing immutable date/time classes:  

    LocalDate date = LocalDate.now();
    LocalDateTime dateTime = LocalDateTime.of(2024, 3, 15, 10, 30);
    ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("America/New_York"));
    



### [](#nashorn-javascript-engine)Nashorn JavaScript Engine

Run JavaScript code from Java (deprecated in Java 11).

* * *

[](#java-9-september-2017)Java 9 (September 2017)
-------------------------------------------------

### [](#module-system-project-jigsaw)Module System (Project Jigsaw)

Revolutionized application structure with modules:  

    // module-info.java
    module com.example.myapp {
        requires java.sql;
        exports com.example.myapp.api;
    }
    



### [](#jshell-repl)JShell (REPL)

Interactive Java shell for experimentation:  

    jshell> int x = 10
    x ==> 10
    jshell> x * 2
    $2 ==> 20
    



### [](#factory-methods-for-collections)Factory Methods for Collections

Create immutable collections easily:  

    List<String> list = List.of("a", "b", "c");
    Set<Integer> set = Set.of(1, 2, 3);
    Map<String, Integer> map = Map.of("key1", 1, "key2", 2);
    



### [](#private-methods-in-interfaces)Private Methods in Interfaces

Share code between default methods:  

    interface MyInterface {
        default void method1() {
            commonLogic();
        }
    
        private void commonLogic() {
            // Shared implementation
        }
    }
    



### [](#trywithresources-enhancement)Try-With-Resources Enhancement

Use effectively final variables:  

    BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
    try (reader) {
        // Use reader
    }
    



### [](#stream-api-improvements)Stream API Improvements

*   `takeWhile()` and `dropWhile()`
*   `ofNullable()`
*   `iterate()` with predicate

### [](#process-api-updates)Process API Updates

Better control over OS processes.

### [](#reactive-streams-flow-api)Reactive Streams (Flow API)

Foundation for reactive programming.

* * *

[](#java-10-march-2018)Java 10 (March 2018)
-------------------------------------------

### [](#local-variable-type-inference-var)Local Variable Type Inference (var)

Reduce verbosity without sacrificing type safety:  

    // Before
    Map<String, List<Integer>> map = new HashMap<>();
    
    // Java 10
    var map = new HashMap<String, List<Integer>>();
    var list = List.of(1, 2, 3);
    var stream = list.stream();
    



### [](#unmodifiable-collections)Unmodifiable Collections

`copyOf()` methods create immutable copies:  

    List<String> original = new ArrayList<>();
    List<String> copy = List.copyOf(original); // Immutable
    



### [](#optionalorelsethrow)Optional.orElseThrow()

Cleaner way to throw exceptions:  

    String value = optional.orElseThrow();
    



### [](#application-classdata-sharing-appcds)Application Class-Data Sharing (AppCDS)

Improved startup time and memory footprint.

* * *

[](#java-11-september-2018-lts)Java 11 (September 2018) - LTS
-------------------------------------------------------------

### [](#new-string-methods)New String Methods

Powerful string manipulation:  

    " ".isBlank();                    // true
    " Hello ".strip();                // "Hello"
    "Line1\nLine2".lines()            // Stream of lines
    "Java".repeat(3);                 // "JavaJavaJava"
    



### [](#local-variable-syntax-for-lambda-parameters)Local Variable Syntax for Lambda Parameters

Use `var` in lambda expressions:  

    (var x, var y) -> x + y
    



### [](#http-client-api-standard)HTTP Client API (Standard)

Modern, asynchronous HTTP client:  

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://api.example.com"))
        .build();
    
    HttpResponse<String> response = client.send(request, 
        HttpResponse.BodyHandlers.ofString());
    



### [](#files-methods)Files Methods

Read/write files as strings:  

    String content = Files.readString(Path.of("file.txt"));
    Files.writeString(Path.of("file.txt"), "content");
    



### [](#collectiontoarray-enhancement)Collection.toArray() Enhancement

Convert to specific array type:  

    String[] array = list.toArray(String[]::new);
    



### [](#nestbased-access-control)Nest-Based Access Control

Better nested class handling.

### [](#epsilon-gc)Epsilon GC

No-op garbage collector for testing.

### [](#removal-of-java-ee-and-corba-modules)Removal of Java EE and CORBA Modules

Deprecated modules removed.

* * *

[](#java-12-march-2019)Java 12 (March 2019)
-------------------------------------------

### [](#switch-expressions-preview)Switch Expressions (Preview)

Treat switch as an expression:  

    int numLetters = switch (day) {
        case MONDAY, FRIDAY, SUNDAY -> 6;
        case TUESDAY -> 7;
        case THURSDAY, SATURDAY -> 8;
        case WEDNESDAY -> 9;
    };
    



### [](#string-methods)String Methods

*   `indent()` - adjust indentation
*   `transform()` - apply function to string

    String result = "hello".transform(String::toUpperCase);
    



### [](#filesmismatch)Files.mismatch()

Compare two files and find first difference.

### [](#collectorsteeing)Collectors.teeing()

Combine two collectors:  

    var result = stream.collect(Collectors.teeing(
        Collectors.summingInt(i -> i),
        Collectors.counting(),
        (sum, count) -> sum / count
    ));
    



### [](#compact-number-formatting)Compact Number Formatting

Format numbers in compact form:  

    NumberFormat fmt = NumberFormat.getCompactNumberInstance();
    fmt.format(1000); // "1K"
    



* * *

[](#java-13-september-2019)Java 13 (September 2019)
---------------------------------------------------

### [](#text-blocks-preview)Text Blocks (Preview)

Multi-line strings without escape sequences:  

    String json = """
        {
            "name": "John",
            "age": 30
        }
        """;
    



### [](#switch-expressions-second-preview)Switch Expressions (Second Preview)

Introduced `yield` keyword:  

    int result = switch (value) {
        case 1, 2 -> 2;
        case 3 -> {
            int temp = value * 2;
            yield temp;
        }
        default -> 0;
    };
    



### [](#dynamic-cds-archives)Dynamic CDS Archives

Improve application startup.

### [](#reimplement-legacy-socket-api)Reimplement Legacy Socket API

Modern implementation using NIO.

* * *

[](#java-14-march-2020)Java 14 (March 2020)
-------------------------------------------

### [](#switch-expressions-standard)Switch Expressions (Standard)

Switch expressions became standard feature.

### [](#pattern-matching-for-instanceof-preview)Pattern Matching for instanceof (Preview)

Eliminate casting:  

    // Before
    if (obj instanceof String) {
        String str = (String) obj;
        System.out.println(str.length());
    }
    
    // Java 14
    if (obj instanceof String str) {
        System.out.println(str.length());
    }
    



### [](#records-preview)Records (Preview)

Concise syntax for data carrier classes:  

    record Point(int x, int y) { }
    
    // Automatically generates:
    // - Constructor
    // - equals(), hashCode(), toString()
    // - Getter methods
    



### [](#text-blocks-second-preview)Text Blocks (Second Preview)

Improvements to text blocks.

### [](#helpful-nullpointerexceptions)Helpful NullPointerExceptions

Detailed messages showing which variable was null:  

    Exception in thread "main" java.lang.NullPointerException: 
        Cannot invoke "String.length()" because "str" is null
    



### [](#packaging-tool-incubator)Packaging Tool (Incubator)

Create native installers for Java applications.

* * *

[](#java-15-september-2020)Java 15 (September 2020)
---------------------------------------------------

### [](#text-blocks-standard)Text Blocks (Standard)

Text blocks became a standard feature.

### [](#sealed-classes-preview)Sealed Classes (Preview)

Control which classes can extend/implement:  

    public sealed class Shape 
        permits Circle, Rectangle, Square { }
    
    final class Circle extends Shape { }
    final class Rectangle extends Shape { }
    final class Square extends Shape { }
    



### [](#pattern-matching-for-instanceof-second-preview)Pattern Matching for instanceof (Second Preview)

Further refinements.

### [](#records-second-preview)Records (Second Preview)

Additional improvements.

### [](#hidden-classes)Hidden Classes

Support frameworks that generate classes at runtime.

### [](#edwardscurve-digital-signature-algorithm-eddsa)Edwards-Curve Digital Signature Algorithm (EdDSA)

Cryptographic signature implementation.

### [](#removed-nashorn-javascript-engine)Removed Nashorn JavaScript Engine

Deprecated JavaScript engine removed.

* * *

[](#java-16-march-2021)Java 16 (March 2021)
-------------------------------------------

### [](#records-standard)Records (Standard)

Records became standard:  

    record Person(String name, int age) {
        // Compact constructor
        public Person {
            if (age < 0) throw new IllegalArgumentException();
        }
    
        // Additional methods
        public boolean isAdult() {
            return age >= 18;
        }
    }
    



### [](#pattern-matching-for-instanceof-standard)Pattern Matching for instanceof (Standard)

Now a standard feature.

### [](#sealed-classes-second-preview)Sealed Classes (Second Preview)

Refinements to sealed classes.

### [](#unixdomain-socket-channels)Unix-Domain Socket Channels

Support for Unix domain sockets in socket and server-socket channels.

### [](#foreign-linker-api-incubator)Foreign Linker API (Incubator)

Call native code without JNI.

### [](#foreignmemory-access-api-third-incubator)Foreign-Memory Access API (Third Incubator)

Safe and efficient access to memory outside Java heap.

### [](#vector-api-incubator)Vector API (Incubator)

Express vector computations for better CPU performance.

### [](#enable-c14-language-features)Enable C++14 Language Features

JDK C++ source code can now use C++14 features.

### [](#warnings-for-valuebased-classes)Warnings for Value-Based Classes

Prepare for future primitive classes.

* * *

[](#java-17-september-2021-lts)Java 17 (September 2021) - LTS
-------------------------------------------------------------

### [](#sealed-classes-standard)Sealed Classes (Standard)

Sealed classes finalized:  

    public sealed interface Vehicle 
        permits Car, Truck, Motorcycle { }
    
    final class Car implements Vehicle { }
    final class Truck implements Vehicle { }
    non-sealed class Motorcycle implements Vehicle { }
    



### [](#pattern-matching-for-switch-preview)Pattern Matching for switch (Preview)

Match patterns in switch:  

    static String formatter(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> obj.toString();
        };
    }
    



### [](#restore-alwaysstrict-floatingpoint-semantics)Restore Always-Strict Floating-Point Semantics

Make floating-point operations consistently strict.

### [](#enhanced-pseudorandom-number-generators)Enhanced Pseudo-Random Number Generators

New interfaces and implementations:  

    RandomGenerator generator = RandomGenerator.of("L64X128MixRandom");
    



### [](#remove-rmi-activation)Remove RMI Activation

Obsolete RMI activation mechanism removed.

### [](#contextspecific-deserialization-filters)Context-Specific Deserialization Filters

Improve security by allowing filters for different contexts.

### [](#deprecate-the-applet-api)Deprecate the Applet API

Applets marked for removal.

### [](#strong-encapsulation-of-jdk-internals)Strong Encapsulation of JDK Internals

JDK internals strongly encapsulated by default.

### [](#foreign-function-amp-memory-api-incubator)Foreign Function & Memory API (Incubator)

Combine Foreign Linker and Memory Access APIs.

### [](#vector-api-second-incubator)Vector API (Second Incubator)

Improvements to vector operations.

* * *

[](#java-18-march-2022)Java 18 (March 2022)
-------------------------------------------

### [](#utf8-by-default)UTF-8 by Default

UTF-8 is now the default charset:  

    // No need to specify charset
    Files.readString(Path.of("file.txt"));
    



### [](#simple-web-server)Simple Web Server

Built-in HTTP server for prototyping:  

    jwebserver
    



### [](#code-snippets-in-java-api-documentation)Code Snippets in Java API Documentation

Enhanced Javadoc with `@snippet`:  

    /**
     * {@snippet :
     *   List<String> list = List.of("a", "b", "c");
     *   list.forEach(System.out::println);
     * }
     */
    



### [](#pattern-matching-for-switch-second-preview)Pattern Matching for switch (Second Preview)

Guarded patterns and refinements:  

    static String test(Object obj) {
        return switch (obj) {
            case String s && s.length() > 5 -> "Long string";
            case String s -> "Short string";
            case Integer i -> "Integer";
            default -> "Other";
        };
    }
    



### [](#foreign-function-amp-memory-api-second-incubator)Foreign Function & Memory API (Second Incubator)

Continued refinements.

### [](#vector-api-third-incubator)Vector API (Third Incubator)

Further improvements.

### [](#deprecate-finalization)Deprecate Finalization

Finalization marked for removal.

* * *

[](#java-19-september-2022)Java 19 (September 2022)
---------------------------------------------------

### [](#virtual-threads-preview)Virtual Threads (Preview)

Lightweight threads for massive concurrency:  

    // Traditional thread
    Thread thread = new Thread(() -> {
        System.out.println("Hello from thread");
    });
    
    // Virtual thread
    Thread virtualThread = Thread.startVirtualThread(() -> {
        System.out.println("Hello from virtual thread");
    });
    
    // Executor for virtual threads
    try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
        for (int i = 0; i < 1_000_000; i++) {
            executor.submit(() -> {
                // Handle task
            });
        }
    }
    



### [](#pattern-matching-for-switch-third-preview)Pattern Matching for switch (Third Preview)

Record patterns introduced:  

    record Point(int x, int y) {}
    
    static void printPoint(Object obj) {
        switch (obj) {
            case Point(int x, int y) -> 
                System.out.println("Point: " + x + ", " + y);
            default -> System.out.println("Not a point");
        }
    }
    



### [](#structured-concurrency-incubator)Structured Concurrency (Incubator)

Simplify multithreaded programming:  

    try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
        Future<String> user = scope.fork(() -> findUser());
        Future<Integer> order = scope.fork(() -> fetchOrder());
    
        scope.join();
        scope.throwIfFailed();
    
        // Both operations succeeded
        processData(user.resultNow(), order.resultNow());
    }
    



### [](#foreign-function-amp-memory-api-preview)Foreign Function & Memory API (Preview)

Graduated from incubator.

### [](#vector-api-fourth-incubator)Vector API (Fourth Incubator)

Continued improvements.

### [](#record-patterns-preview)Record Patterns (Preview)

Destructure record values.

### [](#linuxriscv-port)Linux/RISC-V Port

Support for RISC-V architecture.

* * *

[](#java-20-march-2023)Java 20 (March 2023)
-------------------------------------------

### [](#scoped-values-incubator)Scoped Values (Incubator)

Share immutable data within threads:  

    final static ScopedValue<User> CURRENT_USER = ScopedValue.newInstance();
    
    ScopedValue.where(CURRENT_USER, user)
        .run(() -> processRequest());
    



### [](#record-patterns-second-preview)Record Patterns (Second Preview)

Refinements and nested patterns:  

    record Point(int x, int y) {}
    record Rectangle(Point topLeft, Point bottomRight) {}
    
    static void printRectangle(Object obj) {
        if (obj instanceof Rectangle(Point(var x1, var y1), 
                                      Point(var x2, var y2))) {
            System.out.println("Rectangle from " + x1 + "," + y1);
        }
    }
    



### [](#pattern-matching-for-switch-fourth-preview)Pattern Matching for switch (Fourth Preview)

Continued refinements with when clauses:  

    String result = switch (obj) {
        case String s when s.length() > 5 -> "Long";
        case String s -> "Short";
        default -> "Other";
    };
    



### [](#foreign-function-amp-memory-api-second-preview)Foreign Function & Memory API (Second Preview)

Further improvements.

### [](#virtual-threads-second-preview)Virtual Threads (Second Preview)

Refinements based on feedback.

### [](#structured-concurrency-second-incubator)Structured Concurrency (Second Incubator)

Enhanced APIs.

### [](#vector-api-fifth-incubator)Vector API (Fifth Incubator)

Continued evolution.

* * *

[](#java-21-september-2023-lts)Java 21 (September 2023) - LTS
-------------------------------------------------------------

### [](#virtual-threads-standard)Virtual Threads (Standard)

Production-ready virtual threads:  

    // Create millions of virtual threads easily
    try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
        IntStream.range(0, 10_000).forEach(i -> {
            executor.submit(() -> {
                Thread.sleep(Duration.ofSeconds(1));
                return i;
            });
        });
    }
    



### [](#sequenced-collections)Sequenced Collections

New interfaces for collections with defined encounter order:  

    interface SequencedCollection<E> extends Collection<E> {
        SequencedCollection<E> reversed();
        void addFirst(E);
        void addLast(E);
        E getFirst();
        E getLast();
        E removeFirst();
        E removeLast();
    }
    
    List<String> list = new ArrayList<>();
    list.addFirst("first");
    list.addLast("last");
    String first = list.getFirst();
    List<String> reversed = list.reversed();
    



### [](#pattern-matching-for-switch-standard)Pattern Matching for switch (Standard)

Full pattern matching in switch:  

    static String formatValue(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            case null -> "null";
            default -> obj.toString();
        };
    }
    



### [](#record-patterns-standard)Record Patterns (Standard)

Destructure records in pattern matching:  

    record Point(int x, int y) {}
    
    static void printSum(Object obj) {
        if (obj instanceof Point(int x, int y)) {
            System.out.println(x + y);
        }
    }
    
    // In switch
    static int sumCoordinates(Object obj) {
        return switch (obj) {
            case Point(int x, int y) -> x + y;
            default -> 0;
        };
    }
    



### [](#string-templates-preview)String Templates (Preview)

Safe and convenient string interpolation:  

    String name = "John";
    int age = 30;
    
    // String template
    String message = STR."Hello \{name}, you are \{age} years old";
    
    // With expressions
    String result = STR."2 + 2 = \{2 + 2}";
    
    // FMT for formatting
    String formatted = FMT."Value: %.2f\{value}";
    



### [](#unnamed-patterns-and-variables)Unnamed Patterns and Variables

Use `_` for unused variables:  

    // Unused variables in patterns
    if (obj instanceof Point(int x, int _)) {
        // Only use x, ignore y
    }
    
    // In switch
    switch (obj) {
        case Point(int x, int _) -> System.out.println(x);
    }
    
    // In lambda
    list.forEach(_ -> System.out.println("Item"));
    



### [](#unnamed-classes-and-instance-main-methods-preview)Unnamed Classes and Instance Main Methods (Preview)

Simplify learning and prototyping:  

    // Traditional main method
    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello World");
        }
    }
    
    // Java 21 simplified
    void main() {
        System.out.println("Hello World");
    }
    



### [](#scoped-values-preview)Scoped Values (Preview)

Share immutable data efficiently:  

    final static ScopedValue<User> CURRENT_USER = ScopedValue.newInstance();
    
    void serve(Request request) {
        User user = authenticate(request);
        ScopedValue.where(CURRENT_USER, user)
                   .run(() -> processRequest(request));
    }
    



### [](#structured-concurrency-preview)Structured Concurrency (Preview)

Treat multiple tasks as single unit:  

    try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
        Subtask<String> user  = scope.fork(() -> findUser());
        Subtask<Integer> order = scope.fork(() -> fetchOrder());
    
        scope.join();
        scope.throwIfFailed();
    
        return new Response(user.get(), order.get());
    }
    



### [](#foreign-function-amp-memory-api-third-preview)Foreign Function & Memory API (Third Preview)

Call native code safely.

### [](#vector-api-sixth-incubator)Vector API (Sixth Incubator)

Express vector computations.

### [](#key-encapsulation-mechanism-api)Key Encapsulation Mechanism API

Support for Key Encapsulation Mechanism (KEM).

### [](#deprecate-windows-32bit-x86-port)Deprecate Windows 32-bit x86 Port

Prepare for removal.

### [](#prepare-to-disallow-dynamic-loading-of-agents)Prepare to Disallow Dynamic Loading of Agents

Improve integrity by default.

* * *

[](#java-22-march-2024)Java 22 (March 2024)
-------------------------------------------

### [](#unnamed-variables-amp-patterns-standard)Unnamed Variables & Patterns (Standard)

Using `_` is now standard:  

    // Multiple unused variables
    int sum = switch (point) {
        case Point(int x, int _) -> x;
    };
    
    // Try-catch with unused exception
    try {
        riskyOperation();
    } catch (Exception _) {
        handleError();
    }
    



### [](#statements-before-super-preview)Statements before super() (Preview)

Initialize fields before calling superclass constructor:  

    public class SubClass extends SuperClass {
        private final int value;
    
        public SubClass(int input) {
            // Process before super()
            value = validateAndTransform(input);
            super(value);
        }
    }
    



### [](#string-templates-second-preview)String Templates (Second Preview)

Refinements to string templates.

### [](#implicitly-declared-classes-and-instance-main-second-preview)Implicitly Declared Classes and Instance Main (Second Preview)

Simplified entry point:  

    // Entire program
    void main() {
        println("Hello, World!");
    }
    



### [](#scoped-values-second-preview)Scoped Values (Second Preview)

Performance improvements.

### [](#structured-concurrency-second-preview)Structured Concurrency (Second Preview)

API refinements.

### [](#foreign-function-amp-memory-api-standard)Foreign Function & Memory API (Standard)

Production-ready FFM API:  

    // Call native function
    Linker linker = Linker.nativeLinker();
    SymbolLookup stdlib = linker.defaultLookup();
    
    MethodHandle strlen = linker.downcallHandle(
        stdlib.find("strlen").orElseThrow(),
        FunctionDescriptor.of(JAVA_LONG, ADDRESS)
    );
    



### [](#vector-api-seventh-incubator)Vector API (Seventh Incubator)

Continued improvements.

### [](#stream-gatherers-preview)Stream Gatherers (Preview)

Custom intermediate operations:  

    // Custom gathering operation
    Stream<Integer> result = Stream.of(1, 2, 3, 4, 5)
        .gather(windowFixed(2))  // Sliding window
        .map(window -> window.stream().mapToInt(i -> i).sum());
    



### [](#classfile-api-preview)Class-File API (Preview)

Parse, generate, transform class files:  

    ClassFile cf = ClassFile.of();
    byte[] bytes = cf.build(ClassDesc.of("MyClass"), cb -> {
        cb.withMethod("myMethod", 
            MethodTypeDesc.of(CD_void), 
            ACC_PUBLIC, mb -> {
                // Build method
            });
    });
    



### [](#launch-multifile-sourcecode-programs)Launch Multi-File Source-Code Programs

Run programs with multiple source files:  

    java MainClass.java  # Compiles and runs all dependencies
    



* * *

[](#java-23-september-2024)Java 23 (September 2024)
---------------------------------------------------

### [](#primitive-types-in-patterns-preview)Primitive Types in Patterns (Preview)

Pattern matching for primitive types:  

    // Match on primitive types
    int result = switch (value) {
        case byte b -> b;
        case short s -> s;
        case int i -> i;
        case long l -> (int) l;
    };
    
    // In instanceof
    if (obj instanceof int i) {
        System.out.println("Integer: " + i);
    }
    



### [](#module-import-declarations-preview)Module Import Declarations (Preview)

Import entire modules:  

    import module java.base;
    
    // All public APIs from java.base are available
    



### [](#markdown-documentation-comments-preview)Markdown Documentation Comments (Preview)

Use Markdown in Javadoc:  

    /// # This is a heading
    /// 
    /// This method does something **important**.
    /// 
    /// ## Parameters
    /// - `value` - the input value
    /// 
    /// ## Returns
    /// The processed result
    public String process(String value) {
        return value.toUpperCase();
    }
    



### [](#flexible-constructor-bodies-second-preview)Flexible Constructor Bodies (Second Preview)

More flexibility before super():  

    public SubClass(String data) {
        // Validate and prepare
        if (data == null) throw new IllegalArgumentException();
        String processed = data.trim().toLowerCase();
    
        super(processed);
    
        // Post-super initialization
        this.timestamp = System.currentTimeMillis();
    }
    



### [](#implicitly-declared-classes-and-instance-main-third-preview)Implicitly Declared Classes and Instance Main (Third Preview)

Further refinements.

### [](#stream-gatherers-second-preview)Stream Gatherers (Second Preview)

Enhanced gathering operations:  

    // Sliding window with custom logic
    List<List<Integer>> windows = Stream.of(1, 2, 3, 4, 5)
        .gather(slidingWindow(3))
        .toList();
    



### [](#structured-concurrency-third-preview)Structured Concurrency (Third Preview)

Improved structured task handling.

### [](#scoped-values-third-preview)Scoped Values (Third Preview)

Additional optimizations.

### [](#classfile-api-second-preview)Class-File API (Second Preview)

Improvements to class file manipulation.

### [](#vector-api-eighth-incubator)Vector API (Eighth Incubator)

Performance enhancements.

### [](#zgc-generational-mode-by-default)ZGC: Generational Mode by Default

Z Garbage Collector uses generational mode.

### [](#deprecate-memoryaccess-methods-in-sunmiscunsafe)Deprecate Memory-Access Methods in sun.misc.Unsafe

Prepare for removal in favor of FFM API.

* * *

[](#java-24-march-2025)Java 24 (March 2025)
-------------------------------------------

### [](#primitive-types-in-patterns-second-preview)Primitive Types in Patterns (Second Preview)

Refinements to primitive pattern matching.

### [](#module-import-declarations-second-preview)Module Import Declarations (Second Preview)

Enhanced module imports.

### [](#statements-before-super-standard)Statements before super() (Standard)

Constructor flexibility is now standard:  

    public class User extends Entity {
        private final String normalizedName;
    
        public User(String name) {
            // Logic before super()
            normalizedName = name.trim().toLowerCase();
            super(normalizedName);
        }
    }
    



### [](#flexible-constructor-bodies-third-preview)Flexible Constructor Bodies (Third Preview)

Continued enhancements.

### [](#markdown-documentation-comments-second-preview)Markdown Documentation Comments (Second Preview)

Improved Markdown support in docs.

### [](#late-barrier-expansion-for-g1-experimental)Late Barrier Expansion for G1 (Experimental)

Optimize G1 garbage collector performance.

### [](#new-classfile-api-methods)New Class-File API Methods

Additional utilities for class file processing.

* * *

[](#java-25-september-2025)Java 25 (September 2025)
---------------------------------------------------

**Note:** Java 25 is scheduled for release in September 2025. The features listed here are based on current JEPs and proposals, but may change before the final release.

### [](#string-templates-final)String Templates (Final)

String templates expected to be finalized:  

    String name = "Alice";
    int score = 95;
    String message = STR."Student \{name} scored \{score}%";
    



### [](#simplified-main-methods-final)Simplified Main Methods (Final)

Simplified Java learning:  

    // Simple program
    void main() {
        println("Getting started with Java!");
    }
    



### [](#value-objects-preview-expected)Value Objects (Preview Expected)

Memory-efficient, immutable objects:  

    value class Point {
        int x;
        int y;
    }
    



### [](#enhanced-pattern-matching)Enhanced Pattern Matching

More sophisticated pattern matching capabilities.

### [](#project-leyden-previews)Project Leyden Previews

Ahead-of-time compilation features for improved startup and performance.

### [](#additional-vector-api-enhancements)Additional Vector API Enhancements

Further performance improvements for vector operations.

### [](#expanded-foreign-function-support)Expanded Foreign Function Support

More capabilities for native interoperability.

* * *

[](#migration-guide-key-considerations)Migration Guide: Key Considerations
--------------------------------------------------------------------------

### [](#moving-from-java-8-to-java-11)Moving from Java 8 to Java 11

1.  **Module system** - Reorganize dependencies
2.  **Deprecated API removal** - Update Java EE references
3.  **HTTP Client** - Migrate from old APIs
4.  **String methods** - Leverage new utilities

### [](#moving-from-java-11-to-java-17)Moving from Java 11 to Java 17

1.  **Sealed classes** - Control inheritance hierarchy
2.  **Pattern matching** - Simplify type checks
3.  **Records** - Replace verbose POJOs
4.  **Text blocks** - Improve string readability

### [](#moving-from-java-17-to-java-21)Moving from Java 17 to Java 21

1.  **Virtual threads** - Scale concurrent applications
2.  **Sequenced collections** - Use ordered collection APIs
3.  **Pattern matching for switch** - Modernize control flow
4.  **String templates** - Safer string composition

### [](#moving-to-java-22)Moving to Java 22+

1.  **FFM API** - Replace JNI with modern native calls
2.  **Unnamed patterns** - Simplify code with `_`
3.  **Class-File API** - Dynamic class generation
4.  **Stream gatherers** - Custom stream operations

* * *

[](#performance-evolution)Performance Evolution
-----------------------------------------------

### [](#garbage-collection-improvements)Garbage Collection Improvements

*   **G1GC** (Java 9+): Default GC with better throughput
*   **ZGC** (Java 15+): Sub-millisecond pause times
*   **Shenandoah** (Java 15+): Low-pause-time GC
*   **Generational ZGC** (Java 21+): Improved memory management

### [](#startup-and-footprint)Startup and Footprint

*   **CDS/AppCDS**: Class data sharing
*   **JLink**: Custom runtime images
*   **Project Leyden**: Ahead-of-time compilation (upcoming)

### [](#concurrency)Concurrency

*   **Virtual threads**: Million-thread scalability
*   **Structured concurrency**: Safer multithreading
*   **Scoped values**: Efficient thread-local alternatives

* * *

[](#best-practices-by-version)Best Practices by Version
-------------------------------------------------------

### [](#java-811-foundation)Java 8-11: Foundation

*   Use lambda expressions and streams
*   Embrace Optional for null handling
*   Adopt new Date/Time API
*   Leverage HTTP Client

### [](#java-1217-modernization)Java 12-17: Modernization

*   Create records for data classes
*   Use text blocks for multi-line strings
*   Implement sealed classes for closed hierarchies
*   Apply pattern matching to reduce casting

### [](#java-1821-advanced-features)Java 18-21: Advanced Features

*   Adopt virtual threads for high concurrency
*   Use sequenced collections for ordered data
*   Leverage pattern matching in switch
*   Implement structured concurrency patterns

### [](#java-22-cutting-edge)Java 22+: Cutting Edge

*   Integrate FFM API for native code
*   Use unnamed patterns for cleaner code
*   Apply stream gatherers for custom operations
*   Utilize class-file API for metaprogramming

* * *

[](#conclusion)Conclusion
-------------------------

Java's evolution from version 8 to 25 represents a remarkable transformation. The language has become more expressive, performant, and developer-friendly while maintaining backward compatibility. Key themes include:

1.  **Functional Programming**: Lambdas, streams, and functional interfaces
2.  **Modern Syntax**: Records, text blocks, pattern matching, and string templates
3.  **Concurrency**: Virtual threads and structured concurrency
4.  **Performance**: Advanced GC, AOT compilation, and optimizations
5.  **Interoperability**: Foreign Function & Memory API
6.  **Developer Experience**: Simplified syntax, better error messages, REPL

Each version builds on previous innovations, making Java a powerful choice for modern application development. Whether you're maintaining legacy systems or building new applications, understanding these features helps you write better, more maintainable code.

The journey from Java 8's revolutionary lambdas to Java 25's value objects and ahead-of-time compilation shows a language that continuously evolves while respecting its commitment to backward compatibility and enterprise reliability.
