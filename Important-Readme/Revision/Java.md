<div _ngcontent-serverapp-c142="" codingninjaslazyload="" codingninjascodetabs="" class="article-body reading-club-article-body-common ng-star-inserted" id="reading-club-article-body-2"><div class="parent-heading"><h2 id="3."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Java Interview Questions for Freshers</strong></span></h2><div class="line" style="width:100%;margin-top:50px;"></div></div>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Some of the beginner-level Java developer interview questions you might get asked in an interview are given below -</span></p>
<h3 id="3.1."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q1. What are the data types in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">There are two types of </span><a href="https://www.naukri.com/code360/library/introduction-to-data-type" target="_blank"><span style="background-color:transparent;color:hsl(0,0%,0%);">data types in Java</span></a><span style="background-color:transparent;color:hsl(0,0%,0%);">, namely, primitive and non-primitive data types.&nbsp;</span></p>
<ul>
<li><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Primitive data types:</strong> This includes data types like char, boolean, byte, short, int, long, double,e and float.&nbsp;</span></li>
<li><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Non-primitive data types:</strong> This type of data type includes classes, interfaces, and arrays.</span></li>
</ul>
<h3 id="3.2."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q2. What are wrapper classes?</strong></span></h3>
<p><a href="https://www.naukri.com/code360/library/wrapper-class-in-java" target="_blank"><span style="background-color:transparent;color:hsl(0,0%,0%);">Wrapper classes in Java</span></a><span style="background-color:transparent;color:hsl(0,0%,0%);"> are classes of primitive data types. They are used to create objects of primitive data types and convert them back into primitive data types. They are needed when an object needs to be made if there is a need to change the arguments passed into a method.</span></p>
<h3 id="3.3."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q3. Are there dynamic arrays in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">No, arrays in Java are not dynamic. In Java, you can declare the size of the array at the time of memory allocation. After the memory has been allocated, the array size can neither be decreased nor increased.</span></p>
<h3 id="3.4."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q4. What is JVM?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">JVM or </span><a href="https://www.naukri.com/code360/library/jvm-and-its-architecture" target="_blank"><span style="background-color:transparent;color:hsl(0,0%,0%);">Java Virtual Machine</span></a><span style="background-color:transparent;color:hsl(0,0%,0%);"> is a virtual machine that creates a runtime environment for the Java application. The JVM is a part of the Java Runtime Environment (JRE). The JVM is responsible for converting bytecode into machine code for a specific machine.</span></p>
<h3 id="3.5."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q5. Why is the Java platform independent?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Java is platform-independent because the Java Runtime Environment uses a JVM to create an executable file. The Java code, when compiled, is first converted into a bytecode. The bytecode is platform-independent, and the JVM can convert the bytecode into the machine code of a specific machine. This makes Java platform independent.</span></p>
<h3 id="3.6."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q6. What are local variables and global variables?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">The key difference between </span><a href="https://www.naukri.com/code360/library/difference-between-local-variable-and-global-variable" target="_blank"><span style="background-color:transparent;color:hsl(0,0%,0%);">local variables and global variables</span></a><span style="background-color:transparent;color:hsl(0,0%,0%);"> is:</span></p>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Local variables</strong> are variables which are declared within a function. This type of variable has its access scope limited to the function in which they are defined.&nbsp;</span></p>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Global variables</strong> are declared outside of any function. The global variables are declared in the body of a class. They can be accessed in any function and have the highest scope for a variable in a class.</span></p>
<h3 id="3.7."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q7. What is data encapsulation?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Data encapsulation means wrapping the attributes of an object and all its related functionalities into a single unit. Data encapsulation helps in hiding data from being accessed from any part of the application. Data encapsulation helps in abstraction by only showing the necessary functionalities and data.</span></p>
<h3 id="3.8."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q8. What is function overloading?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">In Java, it is possible to have multiple functions with the same name. This is possible by having different function signatures. The number of attributes of a function and the attributes' data type define the function's signature. Function overloading helps create functions that serve the same purpose but vary in some minor areas.</span></p>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="3.9.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class Figure 
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
}</code></pre><div class="compiler-section-container" data-block-id="0" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);">Output:</span></p>
<figure class="image"><img src="https://files.codingninjas.in/article_images/custom-upload-1677437637.webp" alt="Output" data-src="https://files.codingninjas.in/article_images/custom-upload-1677437637.webp"></figure><h3 id="3.10."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q9. What is function overriding?</strong></span></h3>
<p><a href="https://www.naukri.com/code360/library/method-overriding-in-java" target="_blank"><span style="background-color:transparent;color:hsl(0,0%,0%);">Function overriding</span></a><span style="background-color:transparent;color:hsl(0,0%,0%);"><i> </i>means re-implementing a function already defined in a parent class. Function overriding serves an essential purpose in places where a function performs a general operation. With the help of function overriding, the broad implementation of the function can be specialised for the sub-classes where the function is inherited.</span></p>
<h3 id="3.11."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q10. Why is the main method static in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">The main method is static because the "static: keyword makes it a class method. By making the main method a class method, it is no more necessary to create an object of the class to call the main method.</span></p>
<h3 id="3.12."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q11. What is the difference between the throw and throws keywords in Java?</strong></span></h3>
<figure class="table" style="width:100%;"><table style="background-color: rgb(255, 255, 255); border-style: solid; width: 100%;">
<thead><tr>
<th style="background-color:hsl(0, 0%, 100%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Throw</strong></span></th>
<th style="background-color:hsl(0, 0%, 100%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Throws</strong></span></th>
</tr></thead>
<tbody>
<tr>
<td style="background-color:hsl(0, 0%, 90%);border-style:solid;"><span style="background-color:transparent;color:hsl(0,0%,0%);">The throw keyword explicitly throws an exception inside a block of code.</span></td>
<td style="background-color:hsl(0, 0%, 90%);border-style:solid;"><span style="background-color:transparent;color:hsl(0,0%,0%);">The throws keyword is written in the signature of a function to show that the function may throw an exception of a particular type.</span></td>
</tr>
<tr>
<td style="background-color:hsl(0, 0%, 90%);border-style:solid;"><span style="background-color:transparent;color:hsl(0,0%,0%);">The throw keyword can only throw a single exception.</span></td>
<td style="background-color:hsl(0, 0%, 90%);border-style:solid;"><span style="background-color:transparent;color:hsl(0,0%,0%);">The throws keyword can be used to declare multiple exceptions. The exceptions are declared with the help of the throws keyword in the function syntax using commas.</span></td>
</tr>
</tbody>
</table></figure><h3 id="3.13."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q12. What do you mean by a singleton class?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">A </span><a href="https://www.naukri.com/code360/library/singleton-class-in-java" target="_blank"><span style="background-color:transparent;color:hsl(0,0%,0%);">singleton class in Java</span></a><span style="background-color:transparent;color:hsl(0,0%,0%);"> is a class that only allows the creation of a single object. A singleton class can be created by simply creating a static variable. A static variable is a variable which is shared by all objects of a class. By having a static variable, it can be known whether the object of the class has been created or not.</span></p>
<h3 id="3.14."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q13. Does every try block need a catch block?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">No, every try block does not need a catch block. The try block can be succeeded by either a catch block, a finally block, or even both. A catch block is needed for catching the exceptions raised in try block. The absence of a catch block after a try block, though syntactically correct, is not much of use practically. The finally block might be needed after try block if some critical operations like closing a file needs to be done.</span></p>
<h3 id="3.15."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q14. What is the usage of the super keyword in Java?</strong></span></h3>
<p><a href="https://www.naukri.com/code360/library/super-keyword-in-java" target="_blank"><span style="background-color:transparent;color:hsl(0,0%,0%);">Java super keyword</span></a><span style="background-color:transparent;color:hsl(0,0%,0%);"> refers to an object of the parent class. The super keyword creates an object of the parent class. The super keyword can also be used to call all the functions of the parent class and all the global variables, which can be either public or protected.</span></p>
<h3 id="3.16."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q15. What do you mean by final keyword?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">The </span><a href="https://www.naukri.com/code360/library/final-keyword-in-java" target="_blank"><span style="background-color:transparent;color:hsl(0,0%,0%);">final keyword in Java</span></a><span style="background-color:transparent;color:hsl(0,0%,0%);"> is used to create a constant. A constant also called a literal, is a variable whose value, once assigned during initialisation, cannot be changed. The final keyword can be added before the data type of any variable to make the variable a constant.</span></p>
<h3 id="3.17."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q16. How is an exception handled in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">An exception in Java can be handled using a try-catch block. The error-prone code is written in a try block. The catch block can be configured to handle different types of errors which might occur. The try block can also be followed by a finally block which is always run after the execution of the try block.</span></p>
<h3 id="3.18."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q17. How can objects in a Java class be prevented from serialisation?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Serialisation is the conversion of an object to an array. The converted array can be stored in a file and then deserialised when the object is needed. We can prevent serialisation in Java class with the help of NotSerialiazeableException. We can implement the functions needed for serialisation and add the exception in those classes. Serialisation prevention can be required when the super-class is serialisable, but we do not want the child class's object to get serialised.</span></p>
<h3 id="3.19."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q18. What is the difference between a constructor and a method in Java?</strong></span></h3>
<figure class="table" style="float:right;width:100%;"><table style="background-color: rgb(255, 255, 255); border-color: rgb(153, 153, 153); border-style: solid; width: 100%;">
<thead><tr>
<th style="background-color:hsl(0, 0%, 100%);border-style:solid;"><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Constructor</strong></span></th>
<th style="background-color:hsl(0, 0%, 100%);border-style:solid;"><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Method</strong></span></th>
</tr></thead>
<tbody>
<tr>
<td style="background-color:hsl(0, 0%, 90%);border-style:solid;"><span style="background-color:transparent;color:hsl(0,0%,0%);">It has no return type.</span></td>
<td style="background-color:hsl(0, 0%, 90%);border-style:solid;"><span style="background-color:transparent;color:hsl(0,0%,0%);">It always has a return type. It has a return type void when not returning anything.</span></td>
</tr>
<tr>
<td style="background-color:hsl(0, 0%, 90%);border-style:solid;"><span style="background-color:transparent;color:hsl(0,0%,0%);">It always has the same name as the class name.</span></td>
<td style="background-color:hsl(0, 0%, 90%);border-style:solid;"><span style="background-color:transparent;color:hsl(0,0%,0%);">It can have any name of its choice.</span></td>
</tr>
</tbody>
</table></figure><p>&nbsp;</p>
<h3 id="3.20."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q19. Why is reflection used in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Reflection is used in Java as it allows an executing Java program to examine the functions and variables in it and manipulate the program's internal working. Reflection is used in JavaBeans. JavaBean uses reflection to obtain the properties of Java components while they are being loaded.</span></p>
<h3 id="3.21."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q20. What are the types of ClassLoader in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">There are three types of </span><a href="https://www.naukri.com/code360/library/classloader-in-java" target="_blank"><span style="background-color:transparent;color:hsl(0,0%,0%);">ClassLoaders in Java</span></a><span style="background-color:transparent;color:hsl(0,0%,0%);">, namely.</span></p>
<ul>
<li>
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Bootstrap ClassLoader:</strong> It loads the first pure Java ClassLoader. This loader loads the JDK class files and other core classes from rt.jar. It is not a Java class. This loader is also called the Primordial ClassLoader. It loads class files from jre, lib, and rt.jar.</span><br>&nbsp;</li>
<li>
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Extensions ClassLoader:</strong> This loader uses the parent to process the class loading request. If the loading of a class fails, it loads classes from the jre or lib or ext directory. It is implemented in the sun.misc.Launcher$ExtClassLoader in Java Virtual Machine.</span><br>&nbsp;</li>
<li><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>System ClassLoader:</strong> This loader loads the Application type classes stored in the environment variable CLASSPATH, -cp or -classpath command line option. The System ClassLoader is a child class of Extension ClassLoader.</span></li>
</ul>
<h3 id="3.22."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q21. What is a copy constructor in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">A copy constructor is a constructor in which an object is created using another object. In a copy constructor, a single object whose copy we want to make is set as the argument. The copy constructor then creates a new object by simply passing the properties of the object in the argument into the original constructor of the class.</span></p>
<h3 id="3.23."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q22. What is object cloning in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Cloning is also a way to create a copy of an object in Java. By using object cloning, we make a shallow copy, whereas copy constructor can create a deep copy. The difference between a shallow copy and a deep copy is that in the case of memory-heavy data structures like arrays, the shallow copy shares the same array with the original object. The whole array is reconstructed in deep copy by coping each value individually.</span></p>
<h3 id="3.24."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q23. Is Java a purely object-oriented language?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">No, Java is not a pure object-oriented language. In Java, we have primitive data types like int, char, boolean, short, float, long, and double. For Java to be a purely object-oriented language, there should not be any non-object data type.&nbsp;</span></p>
<h3 id="3.25."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q24. What is a package in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">In Java, a collection of classes is called a package. Packages can be thought of as a folder containing many related Java classes. Packages can be inbuilt or user-defined. Inbuilt packages are Java.lang and Java.util, which are part of the Java programming language. User-defined packages are those which the programmer creates.</span></p>
<h3 id="3.26."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q25. What is coercion in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Coercion in Java is converting a value of one type into another. Coercion can be implicit or explicit. Implicit type conversions occur when a data type of higher precedence is converted to one of lower precedence. Implicit casting occurs automatically. Explicit type conversions are done when converting a data type of lower precedence to one of higher precedence.</span></p>
<h3 id="3.27."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q26. Is it possible to override a private method?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">If a function or variable in a parent class is private, it would be inaccessible to the child. So the child class would not be visible to the child class for it to be overridden.</span></p>
<h3 id="3.28."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q27. What is the life cycle of a thread created in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">A thread undergoes multiple phases in its life cycle. The phases in the life cycle of a thread in Java are</span></p>
<ul>
<li>
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>New</strong>: In this phase, a thread has been created and is ready to be executed.</span><br>&nbsp;</li>
<li>
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Active</strong>: In the active phase, the CPU executes the thread. In this phase, the actual execution of the program occurs.</span><br>&nbsp;</li>
<li>
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Blocked</strong>: In this phase, the thread is temporarily inactive. The thread in this phase is blocked or in a waiting state.</span><br>&nbsp;</li>
<li>
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Timed waiting</strong>: In this phase, the thread waits for a set amount. This occurs when a method calls sleep(). The thread is sent back to its active state once the time-out occurs or is set to active explicitly.</span><br>&nbsp;</li>
<li><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Terminated</strong>: After the thread runs, completes its job or is closed early due to some error, the thread is sent to the terminated state.</span></li>
</ul>
<h3 id="3.29."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q28. What are marker interfaces in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">A marker interface is empty. It does not have any functions or variables in it. A marker interface provides information about the object during runtime. It is also called a tagging interface. These days annotations are preferred over marker interfaces.</span></p>
<h3 id="3.30."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q29. What is a memory leak in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">A memory leak in Java occurs when the garbage collector does not remove previously created objects. The unused object remains in the memory, causing a memory leak. Memory leak uses up space and slows down the application over time. A memory leak occurs in objects referenced in the application, preventing them from being removed. Not closing objects, as objects for input and output operations, can also cause memory leaks.</span></p>
<h3 id="3.31."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q30. What is the difference between new and newInstance operators in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">The new operator creates an object of a particular known class by allocating memory. It is a static process and speedy, as it is known which class's object has to be created.</span></p>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">The newInstance operator is used where it needs to be known which class's object we have to create. It is used to create an object of a class dynamically. It is much slower as the JVM must find the class and check for access permissions before making the object for it.</span></p>
<h3 id="3.32.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q31.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between JDK, JRE, and JVM?</strong></span>
</h3>
<ul>
<li><span style="color:hsl(0,0%,0%);"><strong>JDK (Java Development Kit):</strong> Includes tools for developing Java programs (compiler, debugger) and the JRE to run Java applications.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>JRE (Java Runtime Environment):</strong> Contains the JVM and class libraries required to run Java applications.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>JVM (Java Virtual Machine):</strong> Executes the Java bytecode and enables Java applications to be platform-independent.</span></li>
</ul>
<h3 id="3.33.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q32.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between abstraction and encapsulation?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Abstraction focuses on hiding the complexity and showing only the essential features of an object. Encapsulation is about wrapping the data and code together as a single unit and hiding the internal details of a class from outside access.</span></p>
<h3 id="3.34.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q33.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is inheritance in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Inheritance is an OOP concept in Java where one class (child class) inherits the properties and behaviors (methods) of another class (parent class). It promotes code reusability and establishes a relationship between classes.</span></p>
<h3 id="3.35.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q34.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What are functional interfaces in Java 8?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Functional interfaces are interfaces that contain exactly one abstract method. They can have any number of default or static methods. Some examples include Runnable, Callable, and Comparator. They are often used with lambda expressions.</span></p>
<h3 id="3.36.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q35.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is polymorphism in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Polymorphism means "many forms." In Java, it allows methods to perform different tasks based on the object that calls them. There are two types of polymorphism:</span></p>
<ul>
<li><span style="color:hsl(0,0%,0%);"><strong>Compile-time (Method Overloading):</strong> Same method name with different parameters.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>Run-time (Method Overriding):</strong> A child class provides a specific implementation of a method already defined in its parent class.</span></li>
</ul>
<h3 id="3.37.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q36.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the purpose of the 'default' keyword in interfaces (Java 8+)?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">The 'default' keyword in interfaces allows the addition of new methods to interfaces without breaking the existing implementation of these interfaces. Classes implementing the interface are not required to implement the default methods.</span></p>
<h3 id="3.38.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q37.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is an interface?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">An interface in Java is a blueprint of a class that contains abstract methods (methods without a body). Classes that implement an interface must provide implementations for the abstract methods. Java allows multiple interfaces to be implemented by a class, supporting multiple inheritance.</span></p>
<h3 id="3.39.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q38.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Explain the difference between ArrayList and Vector.</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Both ArrayList and Vector are implementations of the List interface, but:</span></p>
<ul>
<li><span style="color:hsl(0,0%,0%);">ArrayList is not synchronized, while Vector is synchronized.</span></li>
<li><span style="color:hsl(0,0%,0%);">ArrayList is faster as it's non-synchronized.</span></li>
<li><span style="color:hsl(0,0%,0%);">ArrayList increases its size by 50% when full, while Vector doubles its size.</span></li>
</ul>
<h3 id="3.40.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q39.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is an abstract class?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">An abstract class is a class that cannot be instantiated on its own and may contain abstract methods (methods without implementation). It provides a base for other classes to extend and must be inherited by other classes that implement its abstract methods.</span></p>
<h3 id="3.41.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q40.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between HashMap and ConcurrentHashMap?</strong></span>
</h3>
<ul>
<li><span style="color:hsl(0,0%,0%);">HashMap is not thread-safe, while ConcurrentHashMap is thread-safe.</span></li>
<li><span style="color:hsl(0,0%,0%);">ConcurrentHashMap does not lock the entire map for operations like put and remove, instead, it locks only a portion of the map.</span></li>
<li><span style="color:hsl(0,0%,0%);">ConcurrentHashMap does not allow null keys or values, while HashMap allows one null key and multiple null values.</span></li>
</ul>
<h3 id="3.42.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q41.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between abstract class and interface?</strong></span>
</h3>
<ul>
<li><span style="color:hsl(0,0%,0%);"><strong>Abstract Class:</strong> Can contain concrete methods (with implementation) and abstract methods. It is extended by a subclass.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>Interface:</strong> Contains only abstract methods (until Java 8). A class implements an interface and must provide an implementation for all its methods.</span></li>
</ul>
<h3 id="3.43.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q42.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the Java Memory Model?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">The Java Memory Model specifies how the Java virtual machine works with the computer's memory. It defines how and when different threads can see values written to shared variables by other threads, and how to synchronize access to shared variables.</span></p>
<h3 id="3.44.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q43.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the ‘this’ keyword in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">The this keyword refers to the current instance of the class. It is used to differentiate between class attributes and parameters when both have the same name.</span></p>
<h3 id="3.45.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q44.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Explain the concept of Java Generics.</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Generics allow a type or method to operate on objects of various types while providing compile-time type safety. They add stability to your code by making more bugs detectable at compile time.</span></p>
<h3 id="3.46.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q45.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What are access modifiers in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Access modifiers define the visibility of Java classes, methods, and variables. They are:</span></p>
<ul>
<li><span style="color:hsl(0,0%,0%);"><strong>Private:</strong> Accessible only within the same class.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>Default (Package-private):</strong> Accessible within the same package.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>Protected:</strong> Accessible within the same package and subclasses.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>Public:</strong> Accessible from any class.</span></li>
</ul>
<h3 id="3.47.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q46.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the purpose of the 'synchronized' keyword?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">The 'synchronized' keyword controls access to a method or block of code, ensuring that only one thread can execute the code at a time. It's used to prevent thread interference and memory consistency errors.</span></p>
<h3 id="3.48.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q47.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is a static method in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">A static method belongs to the class rather than instances of the class. It can be called without creating an object of the class. Static methods cannot access non-static members of the class directly.</span></p>
<h3 id="3.49.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q48.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Explain the concept of Java 8 Streams.</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Streams in Java 8 provide a declarative approach to processing collections of objects. They allow operations like filtering, mapping, reducing, and collecting to be performed on collections in a functional style, often making the code more readable and concise.</span></p>
<h3 id="3.50.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q49.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is garbage collection in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Garbage collection in Java is the process of automatically reclaiming memory by removing objects that are no longer referenced in the program. Java's garbage collector runs in the background to manage memory allocation.</span></p>
<h3 id="3.51.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q50.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between 'implements' and 'extends' keywords?</strong></span>
</h3>
<ul>
<li><span style="color:hsl(0,0%,0%);">'implements' is used when a class is implementing an interface. A class can implement multiple interfaces.</span></li>
<li><span style="color:hsl(0,0%,0%);">'extends' is used for extending a class. In Java, a class can extend only one class (single inheritance for classes).</span></li>
</ul>
<div class="parent-heading"><h2 id="4."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Intermediate Interview Questions for&nbsp;Java Developers</strong></span></h2><div class="line" style="width:100%;margin-top:81px;"></div></div>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">After you feel comfortable with the above questions, it is time to turn up the heat. Here are some of the intermediate level java interview questions.</span></p>
<h3 id="4.1."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q51. What does the "assert" statement help?&nbsp;</strong></span></h3>
<p><span style="color:hsl(0,0%,0%);">In programming, the "assert" statement assists in validating conditions or assumptions by checking if a provided expression is true. If not, it raises an exception, commonly utilized for debugging and testing to identify unforeseen situations or errors.</span></p>
<h3 id="4.2."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q52. What is the difference between ArrayList and LinkedList?</strong>&nbsp;</span></h3>
<p><span style="color:hsl(0,0%,0%);">ArrayList is a dynamic array-based data structure with contiguous memory, offering fast random access but slower inserts/deletes. LinkedList is a node-based data structure where elements are linked, providing efficient inserts/deletes but slower random access. ArrayList suits scenarios with frequent access, while LinkedList is better for frequent modifications.</span></p>
<h3 id="4.3."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q53. What is the purpose of the hashCode() method?</strong>&nbsp;</span></h3>
<p><span style="color:hsl(0,0%,0%);">In Java, the hashCode() method generates a numerical value (hash code) that portrays the content of an object. It is commonly used in data structures like hash tables to locate objects efficiently. HashCode () provides a fast way to index and retrieve objects from collections by converting the object's internal state into a numerical value. It allows efficient searching, sorting, and retrieval operations on large datasets.</span></p>
<h3 id="4.4."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q54. What is the purpose of the toString() method?</strong>&nbsp;</span></h3>
<p><span style="color:hsl(0,0%,0%);">In object-oriented programming, the toString() method transforms an object's state or data into a string representation. It enables more accessible display, debugging, and logging of object information. The method is commonly utilized when printing objects or concatenating them with strings, providing a human-readable summary of an object's content and facilitating effective communication of its properties and values.</span></p>
<h3 id="4.5."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q55. How is encapsulation achieved in Java?</strong>&nbsp;</span></h3>
<p><span style="color:hsl(0,0%,0%);">In Java, access modifiers (private, protected, public) are used to control the visibility of class members (variables and methods) and achieve encapsulation. Private members are accessible only within the class, while protected and public members are accessible to derived classes and the outside world.</span></p>
<h3 id="4.6."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q56. Explain the concept of method references.</strong></span></h3>
<p><span style="color:hsl(0,0%,0%);">Method references in programming, often used in languages like Java, Kotlin, and others, provide a concise way to refer to methods as values. They allow functions to be treated as first-class citizens and passed around without invoking them immediately. It simplifies code by replacing explicit lambda expressions with direct references to existing methods, enhancing code readability and maintainability.</span></p>
<h3 id="4.7."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q57. What are annotations in Java?</strong>&nbsp;</span></h3>
<p><span style="color:hsl(0,0%,0%);">Annotations in Java are metadata elements that provide additional information about code elements such as classes, methods, variables, and more. They start with the "@" symbol and convey instructions or data to the compiler, runtime, or tools. Annotations aid in documentation, code organization, and behavior modification. It is used for configuration, validation, and code generation.</span></p>
<h3 id="4.8."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q58. What is the BitSet class used for?</strong></span></h3>
<p><span style="color:hsl(0,0%,0%);">The BitSet class represents a fixed-size sequence of bits (binary values: 0 or 1) as a collection of boolean values. It is often used for efficient storage and manipulation of sets of flags or indicators, where each bit corresponds to a specific state. This class provides methods to set, clear, toggle, and check the status of individual bits within the sequence.</span></p>
<h3 id="4.9."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q59. What is a CyclicBarrier in Java?</strong></span></h3>
<p><span style="color:hsl(0,0%,0%);">A CyclicBarrier in Java is a synchronization mechanism that allows a group of threads to wait for each other to reach a common barrier point before proceeding together. It synchronizes threads when they need to perform specific tasks in parallel, ensuring they all wait until all threads have reached the barrier before continuing their execution simultaneously.</span></p>
<h3 id="4.10."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q60. What are the JDBC statements?</strong></span></h3>
<p><span style="color:hsl(0,0%,0%);">JDBC (Java Database Connectivity) statements actively interact with databases in Java applications. They encompass 'Statements' for executing straightforward SQL queries, 'PreparedStatement' for handling precompiled queries with parameters, and 'CallableStatement' for actively invoking database stored procedures. These statements actively facilitate database operations and parameter binding while assuring security and optimizing performance.</span></p>
<h3 id="4.11."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q61. What is Java String Pool?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Java String Pool is a memory-saving technique where the JVM stores and reuses string literals to conserve memory. Identical string literals are referenced to a single memory location, reducing memory usage. It improves performance and ensures efficient memory management for frequently used strings.</span></p>
<h3 id="4.12."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q62. What is the difference between Path and Classpath?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">The environment variable "Path" designates directories wherein the operating system seeks executable files.&nbsp;</span></p>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">In Java, the environment variable "Classpath" identifies directories and JAR files that the Java Virtual Machine (JVM) explores for loading class files while executing programs.</span></p>
<h3 id="4.13."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q63. What is the difference between Heap and Stack memory?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Heap memory stores objects and data that must persist throughout the program, managed by the JVM's garbage collector.</span></p>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Stack memory holds method call frames and local variables, managing method invocations and ensuring automatic memory deallocation when methods exit.</span></p>
<h3 id="4.14."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q64. Can we use String with a switch case?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Yes, starting from Java 7, you can use strings in switch-case statements. This improvement lets you switch based on string values, making code more readable and concise. If you're using Java 7 or later, using strings in switch-case is a convenient feature enhancement.</span></p>
<h3 id="4.15."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q65. What are the different types of classloaders?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Java features three primary built-in Class Loaders:</span></p>
<ol>
<li><span style="background-color:transparent;color:hsl(0,0%,0%);">The Bootstrap ClassLoader loads JDK internal classes and typically handles the loading of core classes such as rt.jar.</span></li>
<li><span style="background-color:transparent;color:hsl(0,0%,0%);">The Extensions Class Loader, responsible for loading classes from the JDK extensions directory, is commonly found at $JAVA_HOME/lib/ext.</span></li>
<li><span style="background-color:transparent;color:hsl(0,0%,0%);">The System Class Loader is intended to load classes from the present classpath, becoming active when a program is invoked, and can be tailored using the -cp or -classpath command-line options.</span></li>
</ol>
<h3 id="4.16."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q66. What is the difference between fail-safe and fail-fast iterators in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Fail-safe and fail-fast iterators are mechanisms in Java for iterating through collections. Fail-safe iterators create copies of the collection and work on them, preventing concurrent modification exceptions. Fail-fast iterators detect modifications made during the iteration and immediately throw exceptions, ensuring data integrity but potentially causing unexpected errors.</span></p>
<h3 id="4.17."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q67.What is a compile-time constant in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">In Java, a compile-time constant refers to a value determined and assigned during compilation, which remains unchanged throughout the program's execution. These constants are typically primitive or String literals and are directly substituted into the code during compilation, optimizing performance.</span></p>
<h3 id="4.18."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q68. What is the difference between Map and Queue in Java?&nbsp;</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Map in Java stores key-value pairs, enabling rapid data retrieval based on keys. It doesn't allow duplicate keys. A Queue holds a collection of elements for processing in a specific order, such as FIFO (First-In-First-Out) or priority order. While a Map facilitates key-based data storage and retrieval, a Queue handles ordered element processing.</span></p>
<h3 id="4.19."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q69. What is the difference between LinkedHashMap and PriorityQueue in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">LinkedHashMap maintains insertion order and maps keys to values, allowing predictable iteration. PriorityQueue arranges elements based on their priority, determined by the object's comparable or custom comparator. While LinkedHashMap emphasizes order, PriorityQueue emphasizes priority-driven retrieval.</span></p>
<h3 id="4.20."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q70. What is the memory-mapped buffer in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">The memory-mapped buffer in Java is a mechanism that allows files to be mapped directly into memory. It enables more efficient data transfer between the file and memory and seamless interaction between Java programs and external data sources. It's beneficial for dealing with large files and can improve I/O performance through direct memory access.</span></p>
<h3 id="4.21."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q71. What is the difference between notify() and notifyAll() methods?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">The distinction between notify() and notifyAll() lies in their impact on threads. notify() wakes up a single waiting thread, chosen arbitrarily, while notifyAll() awakens all waiting threads. The former is more efficient when multiple threads are in similar states, whereas the latter ensures all threads can proceed.</span></p>
<h3 id="4.22."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q72. What are the various types of exceptions?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Java encompasses two types of exceptions: checked exceptions and unchecked exceptions. Checked exceptions, like IOException, must be handled explicitly in the code. Unchecked exceptions, such as NullPointerException, don't necessitate immediate handling and can be caught during runtime. These exception types assist in identifying and addressing errors, enhancing the reliability of Java programs.</span></p>
<h3 id="4.23."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q73. What is OutOfMemoryError?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">OutOfMemoryError is a runtime exception in Java that occurs when the Java Virtual Machine (JVM) cannot allocate more memory to create new objects or store data. It's thrown when the heap space is exhausted. This error indicates that the application has consumed all available memory, leading to performance degradation or application crash.</span></p>
<h3 id="4.24."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q74. What is the difference between == and equals()?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">In Java, == compares object references to check if they refer to the same memory location. The equals() method compares the content or value of objects, and it's often overridden in classes to provide a meaningful comparison. While == checks for reference equality, equals() verifies for content equality.</span></p>
<h3 id="4.25."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q75. How can you concatenate multiple strings in Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">In Java, you can concatenate multiple strings using the + operator. This operator combines string values and creates a new string containing the concatenated content. The StringBuilder class is recommended for more efficient concatenation within loops or complex scenarios due to its mutable nature, reducing unnecessary memory overhead compared to repeated use of the + operator.</span></p>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Read more: &nbsp;</span><a href="https://www.naukri.com/code360/library/wordpress-interview-questions" target="_blank"><span style="background-color:transparent;color:hsl(0,0%,0%);"><u>Wordpress Interview Questions</u></span></a></p>
<h3 id="4.26."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q76. What are the main differences between array and collection?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Arrays are fixed-size data structures that store elements of the same type in contiguous memory. Collections are dynamic and can hold elements of different types, providing resizable structures like lists, sets, and maps. Collections offer more flexibility in adding, removing, and manipulating elements, whereas arrays have a fixed length and require manual resizing.</span></p>
<h3 id="4.27."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q77. What do you understand by BlockingQueue?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">A BlockingQueue is a Java interface representing a thread-safe collection designed for inter-thread communication. It provides methods for adding, removing, and inspecting elements while managing synchronization between producer and consumer threads. BlockingQueue implementations handle blocking operations when the queue is complete (for adding) or empty (for removal), facilitating efficient data exchange between threads.</span></p>
<h3 id="4.28."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q78. What is the difference between process and thread?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">A process is an independent executing unit with its own memory space, while a thread is a smaller unit within a process that shares the same memory space as other threads.</span></p>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Processes are isolated from each other, while threads share resources like memory, making threads more lightweight and efficient in multitasking scenarios.</span></p>
<h3 id="4.29."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q79. What are the advantages of multithreading?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Multithreading offers enhanced resource utilization, enabling concurrent execution of tasks, thus maximizing CPU utilization. It enhances application responsiveness, particularly in GUI applications. Multithreading can boost efficiency in multi-core processors, allowing tasks to be divided and executed simultaneously. It also supports efficiently using I/O operations and facilitates complex task management, improving overall program performance.</span></p>
<h3 id="4.30."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q80. What is context switching?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Context switching refers to the process in multitasking operating systems where the CPU switches from executing the context of one thread or process to another. It involves saving a running thread's current state, loading the next thread's saved state, and changing the execution context. It efficiently allows multiple tasks to share a single CPU core, giving the illusion of parallel execution.</span></p>
<h3 id="4.31.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q81.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between Array and ArrayList in Java?</strong></span>
</h3>
<ul>
<li><span style="color:hsl(0,0%,0%);"><strong>Array:</strong> Fixed-size data structure that can hold elements of a single type.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>ArrayList:</strong> Dynamic-size data structure from Java’s java.util package that can grow or shrink during runtime. It allows only objects to be stored, not primitive types.</span></li>
</ul>
<h3 id="4.32.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q82.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the purpose of the 'volatile' keyword?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">The 'volatile' keyword is used to mark a Java variable as "being stored in main memory". It ensures that changes to the variable are always visible to other threads. Reading a volatile variable always returns the most recent write by any thread.</span></p>
<h3 id="4.33.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q83.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Explain the concept of Java NIO.</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Java NIO (New I/O) is an alternative I/O API for Java, providing features for intensive I/O operations. It includes:</span></p>
<ul>
<li><span style="color:hsl(0,0%,0%);">Channels and Buffers: Data is always read from a channel into a buffer, or written from a buffer to a channel.</span></li>
<li><span style="color:hsl(0,0%,0%);">Non-blocking I/O: Threads can ask a channel to read data into a buffer only when data is available.</span></li>
<li><span style="color:hsl(0,0%,0%);">Selectors: Allow a single thread to manage multiple channels.</span></li>
</ul>
<h3 id="4.34.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q84.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between String, StringBuilder, and StringBuffer?</strong></span>
</h3>
<ul>
<li><span style="color:hsl(0,0%,0%);"><strong>String:</strong> Immutable, meaning once created, its value cannot be changed.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>StringBuilder:</strong> Mutable, used for creating mutable strings in a single-threaded environment. Faster than StringBuffer.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>StringBuffer:</strong> Mutable, thread-safe (synchronized) string manipulation class. Used when thread safety is needed.</span></li>
</ul>
<h3 id="4.35.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q85.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between 'Runnable' and 'Callable' interfaces?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Both are used for defining tasks that can be executed by threads, but:</span></p>
<ul>
<li><span style="color:hsl(0,0%,0%);">Runnable's run() method doesn't return a value and cannot throw checked exceptions.</span></li>
<li><span style="color:hsl(0,0%,0%);">Callable's call() method can return a value and can throw checked exceptions.</span></li>
</ul>
<h3 id="4.36.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q86.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is a checked exception in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Checked exceptions are exceptions that are checked at compile-time. If not handled, the compiler will throw an error. Example: IOException, SQLException.</span></p>
<h3 id="4.37.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q87.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between 'static' and 'final' keywords?</strong></span>
</h3>
<ul>
<li><span style="color:hsl(0,0%,0%);">'static' is used to create class-level members (methods or variables) that can be accessed without creating an instance of the class.</span></li>
<li><span style="color:hsl(0,0%,0%);">'final' is used to create constants (when applied to variables), prevent method overriding (when applied to methods), or prevent inheritance (when applied to classes).</span></li>
</ul>
<h3 id="4.38.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q88.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is an unchecked exception in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Unchecked exceptions occur at runtime and are not checked at compile-time. They are a subclass of RuntimeException. Example: NullPointerException, ArrayIndexOutOfBoundsException.</span></p>
<h3 id="4.39.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q89.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Explain the concept of Java lambda expressions.</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Lambda expressions in Java provide a clear and concise way to implement single-method interfaces (functional interfaces) by treating functionality as a method argument. They enable you to write more readable and maintainable code, and are particularly useful when working with collections and streams.</span></p>
<h3 id="4.40.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q90.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the purpose of the ‘try-catch’ block?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">A try block contains the code that might throw an exception, and the catch block handles the exception that occurs. If an exception is thrown in the try block, it is caught and handled in the catch block.</span></p>
<h3 id="4.41.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q91.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between Collection and Collections in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Collection is an interface that represents a group of objects known as elements. Collections is a utility class in java.util package that provides static methods to operate on collections, such as sorting and searching.</span></p>
<h3 id="4.42.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q92.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the use of the finalize() method in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">The finalize() method is called by the garbage collector on an object when garbage collection determines that there are no more references to the object. It is used to perform cleanup activities before the object is destroyed. However, it is rarely used, and its use is generally discouraged in favor of try-with-resources or manual cleanup.</span></p>
<h3 id="4.43.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q93.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Explain the concept of Java 8 Optional.</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Optional is a container object used to represent the presence or absence of a value. It's designed as a better alternative to returning null and helps prevent null pointer exceptions. It provides methods like isPresent(), get(), orElse(), etc., to safely handle potentially null values.</span></p>
<h3 id="4.44.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q94.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the Java Collection Framework?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">The <strong>Java Collection Framework</strong> is a set of classes and interfaces that provides various data structures like <strong>List</strong>, <strong>Set</strong>, <strong>Queue</strong>, and <strong>Map</strong>, along with algorithms to perform operations like sorting and searching. Examples include ArrayList, HashSet, and HashMap.</span></p>
<h3 id="4.45.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q95.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Explain the concept of Java 8 CompletableFuture.</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">CompletableFuture is a class introduced in Java 8 to handle asynchronous computations. It implements the Future interface and provides a rich set of methods for composing, combining, and handling errors in asynchronous operations.</span></p>
<h3 id="4.46.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q96.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is multithreading in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Multithreading in Java allows multiple threads (lightweight processes) to run concurrently, enabling the efficient utilization of the CPU. Each thread runs independently, and Java provides the Thread class and Runnable interface to create threads.</span></p>
<h3 id="4.47.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q97.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the purpose of the strictfp keyword in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">The strictfp keyword ensures that floating-point calculations give exactly the same results on all platforms. It can be applied to classes, interfaces, or methods.</span></p>
<h3 id="4.48.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q98.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between the sleep() and wait() methods in Java?</strong></span>
</h3>
<ul>
<li><span style="color:hsl(0,0%,0%);"><strong>sleep():</strong> A method in the Thread class that pauses the current thread for a specified period of time without releasing the object's lock.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>wait():</strong> A method in the Object class that causes the current thread to release the lock and wait until another thread calls notify() or notifyAll() on the same object.</span></li>
</ul>
<h3 id="4.49.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q99.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between LinkedHashSet and TreeSet?</strong></span>
</h3>
<ul>
<li><span style="color:hsl(0,0%,0%);">LinkedHashSet maintains insertion order of elements and allows null elements.</span></li>
<li><span style="color:hsl(0,0%,0%);">TreeSet sorts elements based on their natural order or a custom Comparator and doesn't allow null elements.</span></li>
</ul>
<h3 id="4.50.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q100.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is synchronization in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);"><strong>Synchronization</strong> in Java is a mechanism that allows control over access to shared resources by multiple threads. It prevents thread interference and ensures consistency. In Java, the synchronized keyword can be used to lock methods or code blocks so that only one thread can access them at a time.</span></p>
<div class="parent-heading"><h2 id="5."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Java Interview Questions for Experienced</strong></span></h2><div class="line" style="width:100%;margin-top:81px;"></div></div>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Finally, let's discuss some of the advanced-level java interview questions that you might encounter in an interview.</span></p>
<h3 style="margin-left:0px;" id="5.1."><span style="color:hsl(0,0%,0%);"><strong>Q101. How does the JVM handle method overloading and overriding internally?</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Method overloading is resolved at compile-time, and the method signature is changed to include argument types. Method overriding is resolved at runtime, and dynamic method dispatch is used to decide which method to invoke.</span></p>
<h3 style="margin-left:0px;" id="5.2."><span style="color:hsl(0,0%,0%);"><strong>Q102. Explain Java's Non-blocking Algorithms and how they differ from traditional blocking algorithms.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Non-blocking algorithms allow multiple threads to operate on shared data without using locks. This contrasts with traditional blocking algorithms, where locks are used to synchronize access.</span></p>
<h3 style="margin-left:0px;" id="5.3."><span style="color:hsl(0,0%,0%);"><strong>Q103. How can you create an immutable class in Java?</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">To create an immutable class, make the class final, all its fields final and private, and don't provide setters. Also, ensure deep copies of objects for mutable fields.</span></p>
<h3 style="margin-left:0px;" id="5.4."><span style="color:hsl(0,0%,0%);"><strong>Q104. Describe the Contract of HashCode and Equals methods.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">The contract specifies that if two objects are equal according to the <strong>equals()</strong> method, they must have the same <strong>hashCode()</strong> value. However, two objects with the same <strong>hashCode()</strong> are not necessarily equal.</span></p>
<h3 style="margin-left:0px;" id="5.5."><span style="color:hsl(0,0%,0%);"><strong>Q105. What is Type Inference in Generics?</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Type inference is the compiler's ability to determine the type of generic classes by evaluating the constructor and methods invoked.</span></p>
<h3 style="margin-left:0px;" id="5.6."><span style="color:hsl(0,0%,0%);"><strong>Q106. Explain the inner workings of the ConcurrentHashMap.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);"><strong>ConcurrentHashMap</strong> uses segment locking or bucket locking to allow concurrent read and updates without blocking the entire collection.</span></p>
<h3 style="margin-left:0px;" id="5.7."><span style="color:hsl(0,0%,0%);"><strong>Q107. Describe the Java Memory Fence and its importance.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Memory fences are barriers that prevent the reordering of instructions, ensuring that memory operations occur in the expected order, which is crucial in multi-threaded environments.</span></p>
<h3 style="margin-left:0px;" id="5.8."><span style="color:hsl(0,0%,0%);"><strong>Q108. Explain the concept of False Sharing in Java.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">False sharing occurs when threads accidentally impact each other’s performance due to the layout of their data in the CPU cache, even though they are not explicitly sharing any resources.</span></p>
<h3 style="margin-left:0px;" id="5.9."><span style="color:hsl(0,0%,0%);"><strong>Q109. How do you handle OutOfMemoryError in Java?</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Handling <strong>OutOfMemoryError</strong> can be complex and may involve freeing up memory resources, triggering garbage collection, or gracefully shutting down the application to prevent data corruption.</span></p>
<h3 style="margin-left:0px;" id="5.10."><span style="color:hsl(0,0%,0%);"><strong>Q110. Describe Escape Analysis in the context of Java optimizations.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Escape analysis is a compiler optimization technique that analyzes the scope of new objects and determines if they can be allocated on the stack instead of the heap, thus improving performance.</span></p>
<h3 style="margin-left:0px;" id="5.11."><span style="color:hsl(0,0%,0%);"><strong>Q111. Explain the concept of Thread Starvation and how to prevent it.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Thread starvation occurs when a thread cannot access the CPU for an extended period. It can be prevented by using fair locking mechanisms and thread priorities.</span></p>
<h3 style="margin-left:0px;" id="5.12."><span style="color:hsl(0,0%,0%);"><strong>Q112. How does Class Data Sharing work in JVM?</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Class Data Sharing allows pre-loaded classes to be shared between JVM instances, reducing startup time and memory footprint.</span></p>
<h3 style="margin-left:0px;" id="5.13."><span style="color:hsl(0,0%,0%);"><strong>Q113. Explain Java’s TLAB (Thread-Local Allocation Buffers).</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">TLABs are segments of Eden space that are exclusively used by individual threads, reducing contention during object allocation in a multi-threaded environment.</span></p>
<h3 style="margin-left:0px;" id="5.14."><span style="color:hsl(0,0%,0%);"><strong>Q114. How does the Fork/Join Framework work?</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">The Fork/Join framework is designed for parallel execution. It works by recursively breaking down a task into smaller tasks and combining their results.</span></p>
<h3 style="margin-left:0px;" id="5.15."><span style="color:hsl(0,0%,0%);"><strong>Q115. What is the difference between Pessimistic Locking and Optimistic Locking in the context of Java's Concurrency API?</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Pessimistic Locking locks resources for a transaction's entire duration, while Optimistic Locking allows concurrent access but checks for conflict before commit.</span></p>
<h3 style="margin-left:0px;" id="5.16."><span style="color:hsl(0,0%,0%);"><strong>Q116. Explain the inner workings of the Java Agent.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Java Agents are tools for instrumentation, which can modify bytecode at load time or runtime, enabling advanced profiling or monitoring functionalities.</span></p>
<h3 style="margin-left:0px;" id="5.17."><span style="color:hsl(0,0%,0%);"><strong>Q117. Describe the uses of Java Compiler API.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">The Java Compiler API allows programs to be dynamically compiled and loaded during runtime, offering possibilities for developing IDEs, hot-reloading functionalities, and more.</span></p>
<h3 style="margin-left:0px;" id="5.18."><span style="color:hsl(0,0%,0%);"><strong>Q118. What is the Principle of Locality and how does it apply to Java?</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">The Principle of Locality refers to the tendency of a processor to access the same set of memory locations repetitively. Understanding this can help in optimizing Java programs for better cache utilization.</span></p>
<h3 style="margin-left:0px;" id="5.19."><span style="color:hsl(0,0%,0%);"><strong>Q119. How does the G1 Garbage Collector work?</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">G1 Garbage Collector works by dividing the heap into regions and prioritizing the collection of regions with more garbage, aiming for high throughput and low latency.</span></p>
<h3 style="margin-left:0px;" id="5.20."><span style="color:hsl(0,0%,0%);"><strong>Q120. Explain the concept of Polymorphic Inline Caching.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Polymorphic Inline Caching is an optimization technique to improve dynamic method dispatch by remembering the last method called for a particular call site.</span></p>
<h3 style="margin-left:0px;" id="5.21."><span style="color:hsl(0,0%,0%);"><strong>Q121. What is the difference between a StampedLock and a ReentrantLock?</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);"><strong>StampedLock</strong> provides better performance through optimistic locking, while <strong>ReentrantLock</strong> is a more traditional, pessimistic locking mechanism.</span></p>
<h3 style="margin-left:0px;" id="5.22."><span style="color:hsl(0,0%,0%);"><strong>Q122. Explain the term "Busy Spin" in multi-threading.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Busy Spin is a technique where a thread repeatedly checks a condition rather than waiting to be notified, usually to achieve lower latency at the cost of higher CPU usage.</span></p>
<h3 style="margin-left:0px;" id="5.23."><span style="color:hsl(0,0%,0%);"><strong>Q123. How can you implement a custom ClassLoader?</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">A custom <strong>ClassLoader</strong> can be implemented by subclassing <strong>ClassLoader</strong> and overriding methods like <strong>findClass</strong>, <strong>loadClass</strong>, and <strong>defineClass</strong>.</span></p>
<h3 style="margin-left:0px;" id="5.24."><span style="color:hsl(0,0%,0%);"><strong>Q124. Describe the Java JIT Compiler optimizations like Loop Unrolling and Vectorization.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Loop Unrolling reduces the overhead of loop control code by increasing the number of operations in the loop body. Vectorization allows operations to be performed on multiple data points simultaneously.</span></p>
<h3 style="margin-left:0px;" id="5.25."><span style="color:hsl(0,0%,0%);"><strong>Q125. Explain the use of the jstack tool.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);"><strong>jstack</strong> is a Java utility for displaying stack traces of Java threads, useful for debugging and performance analysis.</span></p>
<h3 style="margin-left:0px;" id="5.26."><span style="color:hsl(0,0%,0%);"><strong>Q126. Describe Java's Project Loom and its impact on concurrency.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Project Loom aims to simplify concurrency in Java by introducing lightweight, user-mode threads known as fibers, making it easier to handle high levels of concurrency.</span></p>
<h3 style="margin-left:0px;" id="5.27."><span style="color:hsl(0,0%,0%);"><strong>Q127. What is a Java Decompiler, and how can it be used securely?</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">A Java Decompiler converts bytecode back into source code. It's crucial to use decompilers responsibly and in accordance with software licenses.</span></p>
<h3 style="margin-left:0px;" id="5.28."><span style="color:hsl(0,0%,0%);"><strong>Q128. What are the challenges in implementing Distributed Garbage Collection?</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Distributed Garbage Collection deals with the complexities of identifying and collecting garbage objects across multiple JVMs, making it a challenge in terms of performance and resource management.</span></p>
<h3 style="margin-left:0px;" id="5.29."><span style="color:hsl(0,0%,0%);"><strong>Q129. Describe the impact of the JVM flags on performance tuning.</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">JVM flags like <strong>-Xms</strong>, <strong>-Xmx</strong>, <strong>-XX:+UseG1GC</strong>, etc., allow tuning the JVM behavior, impacting aspects like heap size, garbage collection strategy, and performance.</span></p>
<h3 style="margin-left:0px;" id="5.30."><span style="color:hsl(0,0%,0%);"><strong>Q130. What are Java Modules, and how do they enhance security and maintainability?</strong></span></h3>
<p style="margin-left:0px;"><span style="color:hsl(0,0%,0%);">Java Modules, introduced in Java 9, allow the packaging of Java classes and resources into modular JAR files, enhancing security by providing strong encapsulation and improving maintainability by resolving dependencies explicitly.</span></p>
<h3 id="5.31.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q131.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Explain the concept of Java 8 parallelStream().</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">parallelStream() is a method in Java 8 that creates a parallel stream, allowing operations on the stream to be executed concurrently. It can significantly improve performance for large data sets, but it's important to ensure that the operations are thread-safe.</span></p>
<h3 id="5.32.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q132.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is a deadlock in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">A <strong>deadlock</strong> occurs when two or more threads are blocked forever, each waiting for the other to release a resource. For example, Thread A holds lock 1 and waits for lock 2, while Thread B holds lock 2 and waits for lock 1.</span></p>
<h3 id="5.33.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q133.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between Executor and ExecutorService interfaces?</strong></span>
</h3>
<ul>
<li><span style="color:hsl(0,0%,0%);">Executor is a simple interface for executing tasks asynchronously. It has a single method execute(Runnable).</span></li>
<li><span style="color:hsl(0,0%,0%);">ExecutorService extends Executor and provides additional methods for managing and monitoring the execution of asynchronous tasks, including shutting down the executor and submitting tasks that return results.</span></li>
</ul>
<h3 id="5.34.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q134.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between HashMap and Hashtable?</strong></span>
</h3>
<ul>
<li>
<span style="color:hsl(0,0%,0%);"><strong>HashMap:</strong></span><ul>
<li><span style="color:hsl(0,0%,0%);">Not synchronized (not thread-safe).</span></li>
<li><span style="color:hsl(0,0%,0%);">Allows one null key and multiple null values.</span></li>
<li><span style="color:hsl(0,0%,0%);">Faster than Hashtable.</span></li>
</ul>
</li>
<li>
<span style="color:hsl(0,0%,0%);"><strong>Hashtable:</strong></span><ul>
<li><span style="color:hsl(0,0%,0%);">Synchronized (thread-safe).</span></li>
<li><span style="color:hsl(0,0%,0%);">Does not allow null keys or values.</span></li>
<li><span style="color:hsl(0,0%,0%);">Slower compared to HashMap.</span></li>
</ul>
</li>
</ul>
<h3 id="5.35.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q135.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Explain the concept of Java 8 default methods in interfaces.</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Default methods in interfaces allow the addition of new methods to interfaces without breaking existing implementations of these interfaces. They provide a way to extend interfaces in a backward-compatible way. Classes implementing the interface can choose to override the default implementation if needed.</span></p>
<h3 id="5.36.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q136.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between wait() and notify()?</strong></span>
</h3>
<ul>
<li><span style="color:hsl(0,0%,0%);"><strong>wait()</strong>: Causes the current thread to wait until another thread invokes notify() or notifyAll() on the same object.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>notify()</strong>: Wakes up one thread that is waiting on this object's monitor. If multiple threads are waiting, one of them is arbitrarily chosen.</span></li>
</ul>
<h3 id="5.37.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q137.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between Comparator and Comparable?</strong></span>
</h3>
<ul>
<li><span style="color:hsl(0,0%,0%);"><strong>Comparable:</strong> An interface that provides a single method, compareTo(), to define a natural order for objects. It is implemented by the class that needs to be sorted.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>Comparator:</strong> An interface that provides a compare() method, allowing sorting of objects in a custom order that can be different from their natural order. It is typically used when you want to define multiple sorting sequences.</span></li>
</ul>
<h3 id="5.38.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q138.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the transient keyword in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">The <strong>transient</strong> keyword is used in Java to indicate that a field should not be serialized. When an object is serialized, fields marked as transient are ignored and are not included in the serialization process.</span></p>
<h3 id="5.39.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q139.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the purpose of the instanceof operator in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">The instanceof operator is used to check if an object is an instance of a specific class or implements a specific interface. It returns true if the object belongs to the specified type, otherwise false. For example:</span></p>
<pre><code class="language-plaintext">if (object instanceof MyClass) {
    // Do something
}</code></pre>
<h3 id="5.40.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q140.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Explain the concept of lock-free programming in Java.</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Lock-free programming aims to achieve thread-safe operations without using locks, typically using atomic operations and compare-and-swap (CAS) instructions. Benefits include:</span></p>
<ul>
<li><span style="color:hsl(0,0%,0%);">Avoiding deadlocks and livelocks</span></li>
<li><span style="color:hsl(0,0%,0%);">Better scalability under high contention</span></li>
<li><span style="color:hsl(0,0%,0%);">Resilience to thread failures Java provides support through classes like AtomicInteger, AtomicReference, and the java.util.concurrent.atomic package.</span></li>
</ul>
<h3 id="5.41.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q141.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the use of java.lang.reflect.Proxy?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">The Proxy class is used to create dynamic proxy classes at runtime. It provides a mechanism to implement interfaces on the fly and delegate method calls to a specified handler object. Dynamic proxies are commonly used in AOP (Aspect-Oriented Programming) and frameworks like Spring.</span></p>
<h3 id="5.42.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q142.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What are some advanced features of CompletableFuture in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Advanced features include:</span></p>
<ul>
<li><span style="color:hsl(0,0%,0%);">Chaining multiple asynchronous operations</span></li>
<li><span style="color:hsl(0,0%,0%);">Combining results from multiple CompletableFutures</span></li>
<li><span style="color:hsl(0,0%,0%);">Handling exceptions asynchronously</span></li>
<li><span style="color:hsl(0,0%,0%);">Timeouts and default values</span></li>
<li><span style="color:hsl(0,0%,0%);">Controlling the executor for async operations These features allow for complex asynchronous workflows to be expressed concisely.</span></li>
</ul>
<h3 id="5.43.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q143.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the ForkJoinPool and how is it different from a regular thread pool?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);"><strong>ForkJoinPool</strong> is a specialized implementation of ExecutorService that is designed for work-stealing algorithms. It efficiently executes large tasks by recursively breaking them down into smaller tasks (forking) and combining their results (joining). It is ideal for divide-and-conquer algorithms. A regular thread pool executes independent tasks without recursive splitting.</span></p>
<h3 id="5.44.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q144.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>How does the Unsafe class work and what are its use cases?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">The sun.misc.Unsafe class provides low-level, unsafe operations like:</span></p>
<ul>
<li><span style="color:hsl(0,0%,0%);">Direct memory access</span></li>
<li><span style="color:hsl(0,0%,0%);">Creating objects without constructor invocation</span></li>
<li><span style="color:hsl(0,0%,0%);">Volatile field access</span></li>
<li><span style="color:hsl(0,0%,0%);">CAS operations It's used internally by the JDK and by some high-performance libraries, but its use in application code is discouraged due to its potential to cause JVM crashes.</span></li>
</ul>
<h3 id="5.45.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q145.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is PhantomReference in Java?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">A <strong>PhantomReference</strong> is a type of reference in Java that is enqueued after the object is finalized but before the memory is reclaimed. It is used to perform cleanup operations before the garbage collector reclaims an object’s memory, typically in scenarios requiring more control over the cleanup process than finalize() provides.</span></p>
<h3 id="5.46.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q146.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Explain the concept of Method Handles in Java.</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">Method Handles provide a way to lookup, customize, and invoke methods, constructors, and fields. They offer:</span></p>
<ul>
<li><span style="color:hsl(0,0%,0%);">More flexibility than reflection</span></li>
<li><span style="color:hsl(0,0%,0%);">Better performance in some cases</span></li>
<li><span style="color:hsl(0,0%,0%);">Type safety They're used in implementing invokedynamic instructions and in the implementation of lambda expressions.</span></li>
</ul>
<h3 id="5.47.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q147.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the role of java.lang.instrument package?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">The <strong>java.lang.instrument</strong> package allows for runtime modification of bytecode in Java. It provides APIs for adding, modifying, or removing classes loaded by the JVM. It is used for creating Java agents that can monitor or modify the behavior of applications at runtime, commonly in profiling and monitoring tools.</span></p>
<h3 id="5.48.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q148.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>How does the Java Memory Model handle out-of-order execution and memory visibility?</strong></span>
</h3>
<p><span style="color:hsl(0,0%,0%);">The Java Memory Model:</span></p>
<ul>
<li><span style="color:hsl(0,0%,0%);">Defines happens-before relationships to ensure proper ordering of memory operations</span></li>
<li><span style="color:hsl(0,0%,0%);">Uses volatile variables and synchronization to create memory barriers</span></li>
<li><span style="color:hsl(0,0%,0%);">Prevents certain compiler and CPU optimizations that could violate intended semantics</span></li>
<li><span style="color:hsl(0,0%,0%);">Defines rules for when changes made by one thread become visible to other threads</span></li>
</ul>
<h3 id="5.49.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q149.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between ReentrantLock and synchronized?</strong></span>
</h3>
<ul>
<li><span style="color:hsl(0,0%,0%);"><strong>ReentrantLock:</strong> Provides explicit locking with more control, such as trying to acquire the lock or waiting for it with a timeout. It also supports fairness policies, interruptible lock waits, and multiple conditions.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>synchronized:</strong> Implicit locking mechanism that is simpler but provides less flexibility compared to ReentrantLock. It is limited to intrinsic locking.</span></li>
</ul>
<h3 id="5.50.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q150.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>What is the difference between WeakReference and SoftReference?</strong></span>
</h3>
<ul>
<li><span style="color:hsl(0,0%,0%);"><strong>WeakReference:</strong> It allows the object to be garbage collected when there are no strong references to it. This is used when memory is more important than keeping the object alive.</span></li>
<li><span style="color:hsl(0,0%,0%);"><strong>SoftReference:</strong> It is more lenient, and the object is only garbage collected when the JVM is running low on memory. This is used for caching purposes where the data can be reclaimed if needed.</span></li>
</ul>
<div class="parent-heading"><h2 id="6."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Java Coding Interview Questions for Experienced Developers</strong></span></h2><div class="line" style="width:100%;margin-top:81px;"></div></div>
<h3 id="6.1.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q151.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to check if a number is prime.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.2.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        for (int i = 2; i &lt;= num / 2; i++) {
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
}</code></pre><div class="compiler-section-container" data-block-id="1" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">29 is a prime number.
</code></pre>
<h3 id="6.3.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q152.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to sort an array using the bubble sort algorithm.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.4.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i &lt; n - 1; i++) {
            for (int j = 0; j &lt; n - i - 1; j++) {
                if (arr[j] &gt; arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}</code></pre><div class="compiler-section-container" data-block-id="2" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Sorted array: [11, 12, 22, 25, 34, 64, 90]</code></pre>
<h3 id="6.5.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q153.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to reverse a string.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.6.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class ReverseString {
    public static void main(String[] args) {
        String str = "Java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}</code></pre><div class="compiler-section-container" data-block-id="3" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Reversed string: avaJ
</code></pre>
<h3 id="6.7.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q154.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to check if a string is a rotation of another string.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.8.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class StringRotation {
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
}</code></pre><div class="compiler-section-container" data-block-id="4" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">abcd and cdab are rotations: true</code></pre>
<h3 id="6.9.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q155.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to check for balanced parentheses in an expression.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.10.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String expression = "{[()]}";
        boolean isBalanced = checkBalanced(expression);
        System.out.println("Is the expression balanced? " + isBalanced);
    }

    public static boolean checkBalanced(String expr) {
        Stack&lt;Character&gt; stack = new Stack&lt;&gt;();
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
        return (open == '{' &amp;&amp; close == '}') ||
               (open == '(' &amp;&amp; close == ')') ||
               (open == '[' &amp;&amp; close == ']');
    }
}</code></pre><div class="compiler-section-container" data-block-id="5" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Is the expression balanced? true</code></pre>
<h3 id="6.11.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q156.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the largest number in an array.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.12.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 40, 25};
        int max = arr[0];

        for (int num : arr) {
            if (num &gt; max) {
                max = num;
            }
        }

        System.out.println("The largest number is: " + max);
    }
}</code></pre><div class="compiler-section-container" data-block-id="6" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">The largest number is: 40
</code></pre>
<h3 id="6.13.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q157.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to print Fibonacci series up to n terms.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.14.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);

        for (int i = 2; i &lt; n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}</code></pre><div class="compiler-section-container" data-block-id="7" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
</code></pre>
<h3 id="6.15.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q158.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the sum of digits of a number.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.16.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1234, sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}</code></pre><div class="compiler-section-container" data-block-id="8" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Sum of digits: 10
</code></pre>
<h3 id="6.17.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q159.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to print all prime numbers up to n.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.18.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class PrimeNumbersUpToN {
    public static void main(String[] args) {
        int n = 20;
        System.out.print("Prime numbers up to " + n + ": ");

        for (int i = 2; i &lt;= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i &lt;= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}</code></pre><div class="compiler-section-container" data-block-id="9" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Prime numbers up to 20: 2 3 5 7 11 13 17 19
</code></pre>
<h3 id="6.19.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q160.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the length of the longest substring without repeating characters.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.20.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int length = lengthOfLongestSubstring(str);
        System.out.println("Length of longest substring: " + length);
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet&lt;Character&gt; set = new HashSet&lt;&gt;();
        int maxLength = 0, left = 0;
        for (int right = 0; right &lt; s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}</code></pre><div class="compiler-section-container" data-block-id="10" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Length of longest substring: 3</code></pre>
<h3 id="6.21.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q161.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to count the number of vowels in a string.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.22.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class CountVowels {
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
}</code></pre><div class="compiler-section-container" data-block-id="11" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Number of vowels: 3</code></pre>
<h3 id="6.23.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q162.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to implement a simple banking system (deposit and withdrawal).</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.24.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.Scanner;

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
        if (amount &lt;= balance) {
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
}</code></pre><div class="compiler-section-container" data-block-id="12" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Choose an option: 1
Enter amount to deposit: 100
Deposited: 100.0</code></pre>
<h3 id="6.25.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q163.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to implement bubble sort.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.26.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i &lt; n - 1; i++) {
            for (int j = 0; j &lt; n - i - 1; j++) {
                if (arr[j] &gt; arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}</code></pre><div class="compiler-section-container" data-block-id="13" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Sorted array: [11, 12, 22, 25, 34, 64, 90]</code></pre>
<h3 id="6.27.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q164.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to count the occurrences of each character in a string.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.28.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.HashMap;

public class CharCount {
    public static void main(String[] args) {
        String str = "java";
        HashMap&lt;Character, Integer&gt; charCount = new HashMap&lt;&gt;();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character count: " + charCount);
    }
}</code></pre><div class="compiler-section-container" data-block-id="14" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Character count: {a=2, v=1, j=1}</code></pre>
<h3 id="6.29.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q165.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the length of the longest palindrome in a string.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.30.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "babad";
        System.out.println("Longest palindrome: " + longestPalindrome(str));
    }

    public static String longestPalindrome(String s) {
        int maxLength = 1, start = 0, len = s.length();

        for (int i = 0; i &lt; len; i++) {
            for (int j = i; j &lt; len; j++) {
                int flag = 1;

                for (int k = 0; k &lt; (j - i + 1) / 2; k++)
                    if (s.charAt(i + k) != s.charAt(j - k))
                        flag = 0;

                if (flag != 0 &amp;&amp; (j - i + 1) &gt; maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }
}</code></pre><div class="compiler-section-container" data-block-id="15" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Longest palindrome: bab</code></pre>
<h3 id="6.31.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q166.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the maximum element in an array.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.32.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        int max = findMax(arr);
        System.out.println("Maximum element: " + max);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num &gt; max) {
                max = num;
            }
        }
        return max;
    }
}</code></pre><div class="compiler-section-container" data-block-id="16" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Maximum element: 99</code></pre>
<h3 id="6.33.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q167.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to calculate the sum of all elements in a 2D array.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.34.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class Sum2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for (int i = 0; i &lt; arr.length; i++) {
            for (int j = 0; j &lt; arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }
}</code></pre><div class="compiler-section-container" data-block-id="17" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Sum of all elements: 45</code></pre>
<h3 id="6.35.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q168.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the transpose of a matrix.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.36.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i &lt; matrix.length; i++) {
            for (int j = 0; j &lt; matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i &lt; transpose.length; i++) {
            for (int j = 0; j &lt; transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}</code></pre><div class="compiler-section-container" data-block-id="18" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Transpose of the matrix:
1 4 7 
2 5 8 
3 6 9</code></pre>
<h3 id="6.37.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q169.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to convert a binary number to decimal.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.38.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1010";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal of " + binary + " is: " + decimal);
    }
}</code></pre><div class="compiler-section-container" data-block-id="19" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Decimal of 1010 is: 10</code></pre>
<h3 id="6.39.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q170.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the power of a number using recursion.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.40.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class PowerRecursion {
    public static void main(String[] args) {
        int base = 2, exp = 5;
        System.out.println(base + "^" + exp + " = " + power(base, exp));
    }

    public static int power(int base, int exp) {
        if (exp == 0)
            return 1;
        return base * power(base, exp - 1);
    }
}</code></pre><div class="compiler-section-container" data-block-id="20" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">2^5 = 32</code></pre>
<h3 id="6.41.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q171.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to implement a simple calculator (addition, subtraction, multiplication, division).</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.42.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.Scanner;

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
}</code></pre><div class="compiler-section-container" data-block-id="21" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Enter first number: 10
Enter second number: 5
Choose operation (+, -, *, /): +
Result: 15.0</code></pre>
<h3 id="6.43."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q172.&nbsp;What is the output of the following code?</strong></span></h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.44.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class Main {
   public static void main(String[] args) {
       String str1 = "Hello";
       String str2 = "Hello";
       String str3 = new String("Hello");
       
       System.out.println(str1 == str2);
       System.out.println(str1 == str3);
       System.out.println(str1.equals(str3));
   }
}</code></pre><div class="compiler-section-container" data-block-id="22" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">true
false
true</code></pre>
<h3 id="6.45.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q173.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the intersection of two arrays.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.46.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.HashSet;

public class IntersectionArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        HashSet&lt;Integer&gt; set = new HashSet&lt;&gt;();
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
}</code></pre><div class="compiler-section-container" data-block-id="23" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Intersection: 4 5</code></pre>
<h3 id="6.47.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q174.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the maximum and minimum number in an array.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.48.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class MaxMinInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 25, 15};
        int max = arr[0], min = arr[0];

        for (int num : arr) {
            if (num &gt; max) {
                max = num;
            }
            if (num &lt; min) {
                min = num;
            }
        }

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}</code></pre><div class="compiler-section-container" data-block-id="24" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Maximum number is: 25
Minimum number is: 5</code></pre>
<h3 id="6.49.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q175.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the sum of the first n natural numbers.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.50.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class SumNaturalNumbers {
    public static void main(String[] args) {
        int n = 10;
        int sum = n * (n + 1) / 2;
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}</code></pre><div class="compiler-section-container" data-block-id="25" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Sum of first 10 natural numbers: 55</code></pre>
<h3 id="6.51.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q176.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the common elements between two arrays.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.52.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        HashSet&lt;Integer&gt; set = new HashSet&lt;&gt;();
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
}</code></pre><div class="compiler-section-container" data-block-id="26" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Common elements: 3 4 5</code></pre>
<h3 id="6.53.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q177.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the largest element in each row of a 2D array.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.54.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class LargestInRow {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i &lt; arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j &lt; arr[i].length; j++) {
                if (arr[i][j] &gt; max) {
                    max = arr[i][j];
                }
            }
            System.out.println("Largest element in row " + (i + 1) + ": " + max);
        }
    }
}</code></pre><div class="compiler-section-container" data-block-id="27" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Largest element in row 1: 3
Largest element in row 2: 6
Largest element in row </code></pre>
<h3 id="6.55.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q178.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to reverse a linked list.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.56.">Java</h3>
    <div class="tab-pane active">
      <pre><code>class Node {
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
}</code></pre><div class="compiler-section-container" data-block-id="28" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Original Linked List:
1 2 3 4 
Reversed Linked List:
4 3 2 1</code></pre>
<h3 id="6.57.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q179.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to remove duplicates from an array.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.58.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3, 4, 4, 5};
        LinkedHashSet&lt;Integer&gt; set = new LinkedHashSet&lt;&gt;(Arrays.asList(arr));

        Integer[] newArr = set.toArray(new Integer[0]);
        System.out.println("Array after removing duplicates: " + Arrays.toString(newArr));
    }
}</code></pre><div class="compiler-section-container" data-block-id="29" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Array after removing duplicates: [1, 2, 3, 4, 5]</code></pre>
<h3 id="6.59.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q180.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to convert a decimal number to binary.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.60.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 10;
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary of " + decimal + " is: " + binary);
    }
}</code></pre><div class="compiler-section-container" data-block-id="30" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Binary of 10 is: 1010</code></pre>
<h3 id="6.61.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q181.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to implement linear search.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.62.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class LinearSearch {
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
        for (int i = 0; i &lt; arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}</code></pre><div class="compiler-section-container" data-block-id="31" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Element found at index: 2</code></pre>
<h3 id="6.63.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q182.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to check if a number is a power of two.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.64.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class PowerOfTwo {
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
        if (num &lt;= 0) {
            return false;
        }
        return (num &amp; (num - 1)) == 0;
    }
}</code></pre><div class="compiler-section-container" data-block-id="32" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">16 is a power of two.</code></pre>
<h3 id="6.65.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q183.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to implement binary search.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.66.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.Arrays;

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
        if (low &gt; high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] &gt; target) {
            return binarySearch(arr, target, low, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, high);
        }
    }
}</code></pre><div class="compiler-section-container" data-block-id="33" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Element found at index: 2</code></pre>
<h3 id="6.67.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q184.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to swap two numbers without using a temporary variable.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.68.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}</code></pre><div class="compiler-section-container" data-block-id="34" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Before swapping: a = 10, b = 20
After swapping: a = 20, b = 10</code></pre>
<h3 id="6.69.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q185.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the second largest number in an array.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.70.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num &gt; first) {
                second = first;
                first = num;
            } else if (num &gt; second &amp;&amp; num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("Second largest number: " + second);
        }
    }
}</code></pre><div class="compiler-section-container" data-block-id="35" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Second largest number: 45</code></pre>
<h3 id="6.71.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q186.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the factorial of a number using recursion.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.72.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class FactorialRecursion {
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
}</code></pre><div class="compiler-section-container" data-block-id="36" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Factorial of 5 is: 120</code></pre>
<h3 id="6.73.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q187.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to check if a number is a perfect square.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.74.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class PerfectSquare {
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
}</code></pre><div class="compiler-section-container" data-block-id="37" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">16 is a perfect square.</code></pre>
<h3 id="6.75.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q188.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to implement selection sort.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.76.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i &lt; arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j &lt; arr.length; j++) {
                if (arr[j] &lt; arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}</code></pre><div class="compiler-section-container" data-block-id="38" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Sorted array: [10, 13, 14, 29, 37]</code></pre>
<h3 id="6.77.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q189.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to check if two strings are anagrams.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.78.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.Arrays;

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
}</code></pre><div class="compiler-section-container" data-block-id="39" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">listen and silent are anagrams.</code></pre>
<h3 id="6.79.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q190.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the missing number in an array of consecutive numbers.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.80.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class MissingNumber {
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
}</code></pre><div class="compiler-section-container" data-block-id="40" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">The missing number is: 4</code></pre>
<h3 id="6.81.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q191.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to check if a string is a palindrome.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.82.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class PalindromeCheck {
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

        while (left &lt; right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}</code></pre><div class="compiler-section-container" data-block-id="41" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">madam is a palindrome.</code></pre>
<h3 id="6.83.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q192.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the longest substring without repeating characters.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.84.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Longest substring without repeating characters: " + longestUniqueSubstring(str));
    }

    public static int longestUniqueSubstring(String str) {
        HashSet&lt;Character&gt; set = new HashSet&lt;&gt;();
        int maxLength = 0, i = 0, j = 0;

        while (i &lt; str.length() &amp;&amp; j &lt; str.length()) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(str.charAt(i++));
            }
        }
        return maxLength;
    }
}</code></pre><div class="compiler-section-container" data-block-id="42" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Longest substring without repeating characters: 3</code></pre>
<h3 id="6.85.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q193.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to merge two sorted arrays.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.86.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.Arrays;

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

        while (i &lt; arr1.length &amp;&amp; j &lt; arr2.length) {
            if (arr1[i] &lt; arr2[j]) {
                mergedArr[k++] = arr1[i++];
            } else {
                mergedArr[k++] = arr2[j++];
            }
        }

        while (i &lt; arr1.length) {
            mergedArr[k++] = arr1[i++];
        }

        while (j &lt; arr2.length) {
            mergedArr[k++] = arr2[j++];
        }

        return mergedArr;
    }
}</code></pre><div class="compiler-section-container" data-block-id="43" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Merged array: [1, 2, 3, 4, 5, 6, 7, 8]</code></pre>
<h3 id="6.87.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q194.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the GCD (Greatest Common Divisor) of two numbers.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.88.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class GCD {
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
}</code></pre><div class="compiler-section-container" data-block-id="44" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">GCD of 56 and 98 is: 14</code></pre>
<h3 id="6.89.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q195.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the LCM (Least Common Multiple) of two numbers.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.90.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class LCM {
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
}</code></pre><div class="compiler-section-container" data-block-id="45" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">LCM of 12 and 18 is: 36</code></pre>
<h3 id="6.91.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q196.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the first non-repeating character in a string.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.92.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        System.out.println("First non-repeating character: " + findFirstNonRepeating(str));
    }

    public static Character findFirstNonRepeating(String str) {
        Map&lt;Character, Integer&gt; charCountMap = new LinkedHashMap&lt;&gt;();

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
}</code></pre><div class="compiler-section-container" data-block-id="46" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">First non-repeating character: w</code></pre>
<h3 id="6.93.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q197.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to implement the Sieve of Eratosthenes algorithm to find all prime numbers up to a given number.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.94.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 30;
        boolean[] primes = sieveOfEratosthenes(n);
        System.out.println("Prime numbers up to " + n + ": ");
        for (int i = 2; i &lt;= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;

        for (int i = 2; i * i &lt;= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j &lt;= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }
}</code></pre><div class="compiler-section-container" data-block-id="47" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/72e3f188-79a1-465f-90ca-27262d769841-8505-24922.webp" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Prime numbers up to 30: 
2 3 5 7 11 13 17 19 23 29 </code></pre>
<h3 id="6.95.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q198.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to rotate an array to the right by a given number of steps.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.96.">Java</h3>
    <div class="tab-pane active">
      <pre><code>import java.util.Arrays;

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
        while (start &lt; end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}</code></pre><div class="compiler-section-container" data-block-id="48" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Array after rotation: [4, 5, 1, 2, 3]</code></pre>
<h3 id="6.97.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q199.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to reverse the words in a sentence.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.98.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Hello World from Java";
        String reversed = reverseWords(sentence);
        System.out.println("Reversed sentence: " + reversed);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();
        
        for (int i = words.length - 1; i &gt;= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        
        return reversed.toString().trim();
    }
}</code></pre><div class="compiler-section-container" data-block-id="49" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">Reversed sentence: Java from World Hello</code></pre>
<h3 id="6.99.">
<span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Q200.&nbsp;</strong></span><span style="color:hsl(0,0%,0%);"><strong>Write a Java program to find the nth Fibonacci number using recursion.</strong></span>
</h3>
<div class="raw-html-embed">
<div class="code-tabs-section">
  <ul class="code-tabs-nav-section">
    <li class="tab-heading active">Java</li>
  </ul>

    <h3 class="tab-pane-heading active" tabindex="0" id="6.100.">Java</h3>
    <div class="tab-pane active">
      <pre><code>public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }

    public static int fib(int n) {
        if (n &lt;= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}</code></pre><div class="compiler-section-container" data-block-id="50" data-block-language="Java"><div class="compiler-label-container"><img class="compiler-label-icon" src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg" data-src="https://files.codingninjas.in/fluent_code-24-filled-29586.svg"><div>
      <span class="compiler-label-text">You can also try this code with </span>
      <span>Online Java Compiler</span>
    </div></div><a class="compiler-button" href="/code360/online-compiler/online-java-compiler" target="_blank">Run Code</a></div>
    </div>

</div>
</div>
<p><span style="color:hsl(0,0%,0%);"><strong>Output:</strong></span></p>
<pre><code class="language-plaintext">The 10th Fibonacci number is: 55</code></pre>
<div class="parent-heading"><h2 id="7."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Java Difference Interview Questions</strong></span></h2><div class="line" style="width:100%;margin-top:50px;"></div></div>
<h3 id="7.1."><span style="color:hsl(0,0%,0%);"><strong>Q201. Differentiate between Failsafe and Failfast</strong></span></h3>
<figure class="table" style="width:100%;"><table style="border-color: rgb(0, 0, 0); border-style: solid; width: 100%;">
<thead><tr>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Parameters</span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Failsafe</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Failfast</strong></span></th>
</tr></thead>
<tbody>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Behavior</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Iterates over a copy of the collection to avoid errors</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Fails immediately upon detecting structural changes</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Concurrent Modification</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Does not throw ConcurrentModificationException</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Throws ConcurrentModificationException</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Implementation</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Uses a separate copy or snapshot during iteration</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Directly iterates over the actual collection</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Performance</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Higher memory usage due to a copy</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">More efficient as it does not create a copy</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Examples</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">CopyOnWriteArrayList, ConcurrentHashMap</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">ArrayList, HashMap, HashSet</span></td>
</tr>
</tbody>
</table></figure><h3 id="7.2."><span style="color:hsl(0,0%,0%);"><strong>Q202. Differentiate between List and Set</strong></span></h3>
<figure class="table" style="width:100%;"><table style="border-color: rgb(0, 0, 0); border-style: solid; width: 100%;">
<thead><tr>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Parameters</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>List</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Set</strong></span></th>
</tr></thead>
<tbody>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Duplicates</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Allows duplicate elements</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Does not allow duplicate elements</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Order</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Maintains insertion order</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Does not maintain insertion order (except LinkedHashSet)</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Null Values</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Allows multiple null values (e.g., ArrayList)</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Allows at most one null value (in most implementations)</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Performance</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Generally faster for indexed access</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Optimized for searching and uniqueness</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Examples</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">ArrayList, LinkedList</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">HashSet, TreeSet, LinkedHashSet</span></td>
</tr>
</tbody>
</table></figure><h3 id="7.3."><span style="color:hsl(0,0%,0%);"><strong>Q203. Differentiate between HashMap and TreeMap</strong></span></h3>
<figure class="table" style="width:100%;"><table style="border-color: rgb(0, 0, 0); border-style: solid; width: 100%;">
<thead><tr>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Parameters</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>HashMap</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>TreeMap</strong></span></th>
</tr></thead>
<tbody>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Ordering</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">No specific order</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Maintains natural or custom (via Comparator) order</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Performance</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Faster for most operations (O(1) for get/put)</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Slower (O(log n) for get/put) due to tree structure</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Null Keys/Values</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Allows one null key and multiple null values</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Does not allow null keys, but allows null values</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Underlying Structure</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Uses a hash table</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Uses a Red-Black tree</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Examples</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">HashMap, LinkedHashMap</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">TreeMap</span></td>
</tr>
</tbody>
</table></figure><h3 id="7.4."><span style="color:hsl(0,0%,0%);"><strong>Q204. Differentiate between Stack and Queue</strong></span></h3>
<figure class="table" style="width:100%;"><table style="border-color: rgb(0, 0, 0); border-style: solid; width: 100%;">
<thead><tr>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Parameters</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Stack</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Queue</strong></span></th>
</tr></thead>
<tbody>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Order</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Follows <strong>LIFO</strong> (Last In, First Out)</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Follows <strong>FIFO</strong> (First In, First Out)</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Operations</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">push, pop, peek</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">add, remove, peek</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Use Cases</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Backtracking, parsing</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Task scheduling, buffering</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Examples</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Stack (Legacy class)</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">LinkedList, PriorityQueue</span></td>
</tr>
</tbody>
</table></figure><h3 id="7.5."><span style="color:hsl(0,0%,0%);"><strong>Q205. Differentiate between PriorityQueue and TreeSet</strong></span></h3>
<figure class="table" style="width:100%;"><table style="border-color: rgb(0, 0, 0); border-style: solid; width: 100%;">
<thead><tr>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Parameters</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>PriorityQueue</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>TreeSet</strong></span></th>
</tr></thead>
<tbody>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Ordering</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Natural order or custom Comparator; duplicates allowed</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Sorted order, no duplicates</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Null Values</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Does not allow null elements</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Does not allow null elements</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Performance</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">O(log n) for insertion/removal</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">O(log n) for insertion/removal</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Use Cases</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Priority-based tasks, heaps</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Unique elements in sorted order</span></td>
</tr>
</tbody>
</table></figure><h3 id="7.6."><span style="color:hsl(0,0%,0%);"><strong>Q206. Differentiate between Iterable and Iterator</strong></span></h3>
<figure class="table" style="width:100%;"><table style="border-color: rgb(0, 0, 0); border-style: solid; width: 100%;">
<thead><tr>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Parameters</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Iterable</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Iterator</strong></span></th>
</tr></thead>
<tbody>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Definition</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Represents a collection that can be iterated</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Used to traverse through elements in a collection</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Methods</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">iterator()</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">hasNext(), next(), remove()</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Usage</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Enables for-each loop</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Enables manual iteration</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Examples</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">ArrayList, HashSet</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Returned by iterator() on collections</span></td>
</tr>
</tbody>
</table></figure><h3 id="7.7."><span style="color:hsl(0,0%,0%);"><strong>Q207. Differentiate between HashMap and TreeMap</strong></span></h3>
<figure class="table" style="width:100%;"><table style="border-color: rgb(0, 0, 0); border-style: solid; width: 100%;">
<thead><tr>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Parameters</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>HashMap</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>TreeMap</strong></span></th>
</tr></thead>
<tbody>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Ordering</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">No specific order</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Maintains natural or custom (via Comparator) order</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Performance</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Faster for most operations (O(1) for get/put)</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Slower (O(log n) for get/put) due to tree structure</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Null Keys/Values</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Allows one null key and multiple null values</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Does not allow null keys, but allows null values</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Underlying Structure</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Uses a hash table</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Uses a Red-Black tree</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Examples</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">HashMap, LinkedHashMap</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">TreeMap</span></td>
</tr>
</tbody>
</table></figure><h3 id="7.8."><span style="color:hsl(0,0%,0%);"><strong>Q208. Differentiate between List and Map</strong></span></h3>
<figure class="table" style="width:100%;"><table style="border-color: rgb(0, 0, 0); border-style: solid; width: 100%;">
<thead><tr>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Parameters</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>List</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Map</strong></span></th>
</tr></thead>
<tbody>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Data Structure</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Ordered collection of elements</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Key-value pairs</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Duplicates</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Allows duplicates</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Keys must be unique, values can be duplicates</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Null Values</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Allows multiple null values</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Allows one null key and multiple null values</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Examples</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">ArrayList, LinkedList</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">HashMap, TreeMap</span></td>
</tr>
</tbody>
</table></figure><h3 id="7.9."><span style="color:hsl(0,0%,0%);"><strong>Q209. Differentiate between HashSet and TreeSet</strong></span></h3>
<figure class="table" style="width:100%;"><table style="border-color: rgb(0, 0, 0); border-style: solid; width: 100%;">
<thead><tr>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Parameters</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>HashSet</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>TreeSet</strong></span></th>
</tr></thead>
<tbody>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Ordering</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">No specific order</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Maintains sorted order</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Performance</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Faster (O(1) for most operations)</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Slower (O(log n) for operations)</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Null Values</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Allows one null element</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Does not allow null elements</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Examples</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">HashSet, LinkedHashSet</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">TreeSet</span></td>
</tr>
</tbody>
</table></figure><h3 id="7.10."><span style="color:hsl(0,0%,0%);"><strong>Q210. Differentiate between Singly Linked List and Doubly Linked List</strong></span></h3>
<figure class="table" style="width:100%;"><table style="border-color: rgb(0, 0, 0); border-style: solid; width: 100%;">
<thead><tr>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Parameters</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Singly Linked List</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Doubly Linked List</strong></span></th>
</tr></thead>
<tbody>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Links</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Each node points to the next</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Each node points to both next and previous nodes</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Memory Usage</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Requires less memory</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Requires more memory due to additional pointer</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Traversal</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Can be traversed in one direction</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Can be traversed in both directions</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Performance</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Simpler and faster</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Slightly slower due to additional operations</span></td>
</tr>
</tbody>
</table></figure><h3 id="7.11."><span style="color:hsl(0,0%,0%);"><strong>Q211. Differentiate between Queue and Deque</strong></span></h3>
<figure class="table" style="width:100%;"><table style="border-color: rgb(0, 0, 0); border-style: solid; width: 100%;">
<thead><tr>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Parameters</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Queue</strong></span></th>
<th style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Deque</strong></span></th>
</tr></thead>
<tbody>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Order</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Follows FIFO</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">Supports FIFO and LIFO</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Operations</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">add, remove, peek</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">addFirst, addLast, removeFirst, removeLast</span></td>
</tr>
<tr>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);"><strong>Examples</strong></span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">LinkedList, PriorityQueue</span></td>
<td style="border-color:hsl(0, 0%, 0%);border-style:solid;"><span style="color:hsl(0,0%,0%);">ArrayDeque, LinkedList</span></td>
</tr>
</tbody>
</table></figure><div class="parent-heading"><h2 id="8."><span style="color:hsl(0,0%,0%);"><strong>Top Java MCQs</strong></span></h2><div class="line" style="width:100%;margin-top:50px;"></div></div>
<h3 id="8.1."><span style="color:hsl(0,0%,0%);">1. Which of the following is not a Java feature?</span></h3>
<p><span style="color:hsl(0,0%,0%);">a) Object-oriented</span><br><span style="color:hsl(0,0%,0%);">b) Use of pointers</span><br><span style="color:hsl(0,0%,0%);">c) Portable</span><br><span style="color:hsl(0,0%,0%);">d) Dynamic and Extensible</span><br><span style="color:hsl(0,0%,0%);"><strong>Answer:</strong> b) Use of pointers</span></p>
<h3 id="8.2."><span style="color:hsl(0,0%,0%);">2. What is the default value of a local variable?</span></h3>
<p><span style="color:hsl(0,0%,0%);">a) null</span><br><span style="color:hsl(0,0%,0%);">b) 0</span><br><span style="color:hsl(0,0%,0%);">c) Undefined</span><br><span style="color:hsl(0,0%,0%);">d) Garbage value</span><br><span style="color:hsl(0,0%,0%);"><strong>Answer:</strong> c) Undefined</span></p>
<h3 id="8.3."><span style="color:hsl(0,0%,0%);">3. Which of these is a valid keyword in Java?</span></h3>
<p><span style="color:hsl(0,0%,0%);">a) interface</span><br><span style="color:hsl(0,0%,0%);">b) string</span><br><span style="color:hsl(0,0%,0%);">c) float</span><br><span style="color:hsl(0,0%,0%);">d) unsigned</span><br><span style="color:hsl(0,0%,0%);"><strong>Answer:</strong> a) interface</span></p>
<h3 id="8.4."><span style="color:hsl(0,0%,0%);">4. What will be the output of the following code?</span></h3>
<pre><code class="language-plaintext">int x = 10;
int y = 20;
System.out.println(x + y + " is the result");
</code></pre>
<p><span style="color:hsl(0,0%,0%);">a) 30 is the result</span><br><span style="color:hsl(0,0%,0%);">b) 1020 is the result</span><br><span style="color:hsl(0,0%,0%);">c) Compilation error</span><br><span style="color:hsl(0,0%,0%);">d) Runtime error</span><br><span style="color:hsl(0,0%,0%);"><strong>Answer:</strong> a) 30 is the result</span></p>
<h3 id="8.5."><span style="color:hsl(0,0%,0%);">5. In Java, javac is used for:</span></h3>
<p><span style="color:hsl(0,0%,0%);">a) Interpreting Java bytecode</span><br><span style="color:hsl(0,0%,0%);">b) Compiling Java source code</span><br><span style="color:hsl(0,0%,0%);">c) Debugging Java applications</span><br><span style="color:hsl(0,0%,0%);">d) Executing Java programs</span><br><span style="color:hsl(0,0%,0%);"><strong>Answer:</strong> b) Compiling Java source code</span></p>
<h3 id="8.6."><span style="color:hsl(0,0%,0%);">6. What is the size of an int data type in Java?</span></h3>
<p><span style="color:hsl(0,0%,0%);">a) 16 bits</span><br><span style="color:hsl(0,0%,0%);">b) 8 bits</span><br><span style="color:hsl(0,0%,0%);">c) 32 bits</span><br><span style="color:hsl(0,0%,0%);">d) 64 bits</span><br><span style="color:hsl(0,0%,0%);"><strong>Answer:</strong> c) 32 bits</span></p>
<h3 id="8.7."><span style="color:hsl(0,0%,0%);">7. Which method is called first in a Java application?</span></h3>
<p><span style="color:hsl(0,0%,0%);">a) start()</span><br><span style="color:hsl(0,0%,0%);">b) init()</span><br><span style="color:hsl(0,0%,0%);">c) main()</span><br><span style="color:hsl(0,0%,0%);">d) run()</span><br><span style="color:hsl(0,0%,0%);"><strong>Answer:</strong> c) main()</span></p>
<h3 id="8.8."><span style="color:hsl(0,0%,0%);">8. What is the output of the following code?</span></h3>
<pre><code class="language-plaintext">String str = "Hello";
str.concat("World");
System.out.println(str);
</code></pre>
<p><span style="color:hsl(0,0%,0%);">a) Hello</span><br><span style="color:hsl(0,0%,0%);">b) HelloWorld</span><br><span style="color:hsl(0,0%,0%);">c) World</span><br><span style="color:hsl(0,0%,0%);">d) Compilation error</span><br><span style="color:hsl(0,0%,0%);"><strong>Answer:</strong> a) Hello</span></p>
<h3 id="8.9."><span style="color:hsl(0,0%,0%);">9. Which of the following is not a control statement in Java?</span></h3>
<p><span style="color:hsl(0,0%,0%);">a) if</span><br><span style="color:hsl(0,0%,0%);">b) for</span><br><span style="color:hsl(0,0%,0%);">c) break</span><br><span style="color:hsl(0,0%,0%);">d) print</span><br><span style="color:hsl(0,0%,0%);"><strong>Answer:</strong> d) print</span></p>
<h3 id="8.10."><span style="color:hsl(0,0%,0%);">10. What is the return type of the hashCode() method in Java?</span></h3>
<p><span style="color:hsl(0,0%,0%);">a) Object</span><br><span style="color:hsl(0,0%,0%);">b) int</span><br><span style="color:hsl(0,0%,0%);">c) double</span><br><span style="color:hsl(0,0%,0%);">d) void</span><br><span style="color:hsl(0,0%,0%);"><strong>Answer:</strong> b) int</span></p>
<div class="parent-heading"><h2 id="9."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Frequently Asked Questions</strong></span></h2><div class="line" style="width:100%;margin-top:50px;"></div></div>
<h3 id="9.1."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>How to prepare Java interview questions?</strong></span></h3>
<p><span style="color:hsl(0,0%,0%);">Study fundamental concepts like OOP, data structures, and multithreading to prepare for Java interview questions. Practice coding, review common questions, and understand real-world applications.</span></p>
<h3 id="9.2."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>What are the most important topics of Java?</strong></span></h3>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Java's crucial topics include OOP concepts, data types, control structures, exception handling, classes and objects, inheritance, polymorphism, collections, and multithreading.</span></p>
<h3 id="9.3."><span style="color:hsl(0,0%,0%);"><strong>What is a Java Developer’s Salary in India?</strong></span></h3>
<p><span style="color:hsl(0,0%,0%);">The average annual salary for a Java developer in India ranges from ₹3.5 lakh to ₹10 lakh, depending on experience, location, and expertise. Senior professionals can earn up to ₹20 lakh or more in top IT hubs like Bangalore and Pune.</span></p>
<h3 id="9.4."><span style="color:hsl(0,0%,0%);"><strong>What are the Essential Skills Required for a Java Developer?</strong></span></h3>
<p><span style="color:hsl(0,0%,0%);">Key skills for Java developers include proficiency in core Java, object-oriented programming, frameworks like Spring and Hibernate, database management, version control (e.g., Git), and familiarity with tools for testing and debugging.</span></p>
<div class="parent-heading"><h2 id="10."><span style="background-color:transparent;color:hsl(0,0%,0%);"><strong>Conclusion</strong></span></h2><div class="line" style="width:100%;margin-top:50px;"></div></div>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">In this article, we have discussed Java interview questions. Preparing for Java interview questions is essential for anyone aspiring to excel in the field of software development. The breadth and depth of questions range from fundamental concepts to advanced programming techniques, reflecting the diverse skill set required in today's tech industry. By mastering these questions and practicing coding problems, candidates can build confidence and enhance their problem-solving abilities.</span></p>
<p><span style="background-color:transparent;color:hsl(0,0%,0%);">Some of the articles you might find useful:</span></p>
<ul>
<li>
<a href="https://www.codingninjas.com/programs/java-dsa-course" target="_blank"><span style="background-color:transparent;color:#4a6ee0;"><strong><u>Data structures and algorithms using Java</u></strong></span></a><br>&nbsp;</li>
<li>
<a href="https://www.naukri.com/code360/library/how-is-java-platform-independent" target="_blank"><span style="background-color:transparent;color:#4a6ee0;"><strong><u>Why is Java Platform Independent</u></strong></span></a><br>&nbsp;</li>
<li><a href="https://www.naukri.com/code360/library/java-tokens" target="_blank"><span style="background-color:transparent;color:#4a6ee0;"><strong><u>Java Tokens</u></strong></span></a></li>
</ul>

</div>
