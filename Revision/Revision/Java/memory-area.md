# How Many Types of Memory Areas are Allocated by JVM?

**Last Updated : 2 Feb, 2026**

The Java Virtual Machine (JVM) is responsible for managing memory during the execution of a Java program. To efficiently handle data, objects, method calls, and execution, JVM divides memory into different runtime memory areas, each serving a specific purpose.

---

## Explanation

The JVM divides memory into different runtime areas to efficiently manage program execution. Each memory area has a specific role, such as storing class data, objects, method calls, or execution instructions. Together, these memory areas help the JVM run Java programs smoothly and efficiently.

**JVM Memory Areas**

The JVM mainly allocates the following five types of memory areas:

---

## 1. Class (Method) Area

The Method Area stores class-level information that is loaded by the JVM. This includes class metadata, method details, and static variables, and it is shared among all threads.

* Stores class structure, methods, and static data
* Shared by all threads
* Created once when JVM starts
* Contains Runtime Constant Pool

---

## 2. Heap

The Heap Area is the runtime memory where objects and instance variables are stored. It is the largest memory area and is managed by the Garbage Collector.

* Stores objects created using `new`
* Shared across all threads
* Managed automatically by Garbage Collector
* Memory leaks mainly occur here

---

## 3. Stack

The Stack Area stores method execution information for each thread. Every method call creates a stack frame that holds local variables and references.

* Each thread has its own stack
* Stores local variables and method calls
* Memory is freed after method execution
* Faster than heap memory

---

## 4. Program Counter Register

The Program Counter Register keeps track of the current instruction being executed by a thread. It helps JVM resume execution after thread switching.

* One PC register per thread
* Stores address of current JVM instruction
* Undefined for native methods
* Supports thread scheduling

---

## 5. Native Method Stack

The Native Method Stack stores execution details of native methods written in languages like C or C++. It works alongside the Java Stack.

* Used for native (non-Java) methods
* Thread-specific memory area
* Depends on underlying OS
* Separate from Java Stack

---

# MetaSpace in Java 8 with Examples

**Last Updated : 15 Jul, 2025**

In every programming language, memory is a vital resource and is also scarce in nature. Hence it’s essential that the memory is managed thoroughly without any leaks. In this article, we will understand what metaspace is and how is it different from permgen.

---

## Before understanding metaspace, lets first understand JVM memory structure

### JVM Memory Structure

JVM defines various run-time data area which are used during execution of a program. Some of the areas are created by the JVM whereas some are created by the threads that are used in a program.

* Memory area created by JVM is destroyed only when the JVM exits
* Data areas of thread are created during instantiation and destroyed when the thread exits

JVM Memory Structure is divided into multiple memory areas like:

* Heap area
* Stack area
* Method area
* PC Registers

---

## Heap Memory Details

The heap area is one of the most important memory areas of JVM. Here, all the java objects are stored. The heap is created when the JVM starts.

The heap is generally divided into two parts:

### 1. Young Generation (Nursery)

* All the new objects are allocated in this memory
* When this memory gets filled → **Minor Garbage Collection**

### 2. Old Generation

* Long-lived objects (survived multiple GC cycles) are stored here
* When this memory gets filled → **Major Garbage Collection**

---

## PermGen Memory

This is a special space in java heap which is separated from the main memory where all the static content is stored.

* Stores application metadata required by JVM
* Metadata = data that describes data
* Garbage collection happens here
* String pool was part of this memory before Java 7

### Method Area in PermGen

* Stores class structure
* Stores method and constructor code

### Problems with PermGen

* Limited size → causes `OutOfMemoryError`
* Default size:

  * 64 MB (32-bit JVM)
  * 82 MB (64-bit JVM)
* Frequent garbage collection (costly operation)
* Cannot auto increase
* Difficult to tune
* Inefficient garbage collection

---

## MetaSpace (Java 8)

Due to PermGen limitations, it was **removed in Java 8** and replaced with **MetaSpace**.

### Features of MetaSpace

* Auto grows by default
* Uses native memory (OS memory)
* Garbage collection triggered when metadata usage reaches limit

---

## Difference Between PermGen and MetaSpace

| PermGen             | MetaSpace                  |
| ------------------- | -------------------------- |
| Removed in Java 8   | Introduced in Java 8       |
| Fixed maximum size  | Auto increases based on OS |
| Part of Heap memory | Uses Native Memory         |
| Inefficient GC      | Efficient GC               |

---
