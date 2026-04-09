# 🧵 Java Concurrency – One-Page Cheat Sheet

## 🔹 1. Semaphore

### 📌 Definition

A **Semaphore** controls access to a shared resource using a fixed number of **permits**, allowing multiple threads to access the resource simultaneously.

### 🛠️ Syntax

```java
Semaphore semaphore = new Semaphore(int permits, boolean fair);
```

### 🔑 Key Methods

| Method                      | Description                        |
| --------------------------- | ---------------------------------- |
| `acquire()`                 | Blocks until a permit is available |
| `release()`                 | Releases a permit                  |
| `tryAcquire()`              | Non-blocking attempt               |
| `tryAcquire(timeout, unit)` | Attempts with timeout              |
| `availablePermits()`        | Returns available permits          |

### 📌 Use Cases

* Database connection pools
* Rate limiting
* Resource pooling
* Limiting concurrent API requests

### ✅ Pros

* Controls multiple concurrent accesses
* Optional fairness (FIFO)
* Flexible permit management

### ❌ Cons

* No ownership (any thread can release)
* Risk of permit leaks
* Can be complex to debug

---

## 🔹 2. ReentrantLock

### 📌 Definition

`ReentrantLock` is an advanced locking mechanism that provides **mutual exclusion** with greater flexibility than the `synchronized` keyword. It allows the **same thread to acquire the lock multiple times**.

### 🛠️ Syntax

```java
ReentrantLock lock = new ReentrantLock(boolean fair);
```

### 🔑 Key Methods

| Method                   | Description                       |
| ------------------------ | --------------------------------- |
| `lock()`                 | Acquires the lock                 |
| `unlock()`               | Releases the lock                 |
| `tryLock()`              | Non-blocking attempt              |
| `tryLock(timeout, unit)` | Attempts with timeout             |
| `lockInterruptibly()`    | Allows interruption while waiting |
| `newCondition()`         | Creates condition variables       |

### 🧑‍💻 Basic Pattern

```java
lock.lock();
try {
    // Critical section
} finally {
    lock.unlock();
}
```

### 📌 Use Cases

* Complex synchronization
* Timed or interruptible locking
* Multiple condition variables
* Fair scheduling requirements

### ✅ Pros

* Reentrant (same thread can re-acquire)
* Supports fairness and timeouts
* Interruptible lock acquisition
* Multiple `Condition` objects

### ❌ Cons

* More verbose than `synchronized`
* Risk of forgetting `unlock()`

---

## 🔹 3. CountDownLatch

### 📌 Definition

A synchronization aid that allows one or more threads to **wait until a set of operations completes**.

### 🛠️ Syntax

```java
CountDownLatch latch = new CountDownLatch(int count);
```

### 🔑 Key Methods

| Method        | Description                        |
| ------------- | ---------------------------------- |
| `await()`     | Waits until the count reaches zero |
| `countDown()` | Decrements the count               |
| `getCount()`  | Returns the current count          |

### 📌 Use Cases

* Waiting for services to start
* Parallel task completion
* Integration testing

### ✅ Pros

* Simple and effective
* Ensures tasks complete before proceeding

### ❌ Cons

* **Not reusable** (one-time use)
* Count cannot be reset

---

## 🔹 4. CyclicBarrier

### 📌 Definition

A synchronization aid that allows a group of threads to **wait for each other at a common barrier point**. It is **reusable** after the barrier is reached.

### 🛠️ Syntax

```java
CyclicBarrier barrier = new CyclicBarrier(int parties, Runnable barrierAction);
```

### 🔑 Key Methods

| Method               | Description                    |
| -------------------- | ------------------------------ |
| `await()`            | Waits until all parties arrive |
| `reset()`            | Resets the barrier             |
| `getNumberWaiting()` | Returns waiting threads        |

### 📌 Use Cases

* Parallel computations
* Multi-phase processing
* Simulation systems

### ✅ Pros

* Reusable across phases
* Supports optional barrier action

### ❌ Cons

* All threads must reach the barrier
* Broken barrier exceptions if a thread fails

---

## 🆚 Quick Comparison Tables

### 🔸 Semaphore vs ReentrantLock

| Feature     | Semaphore                  | ReentrantLock                    |
| ----------- | -------------------------- | -------------------------------- |
| Access Type | Multiple threads (permits) | Single thread (mutual exclusion) |
| Ownership   | Not enforced               | Enforced                         |
| Reentrancy  | ❌                          | ✅                                |
| Fairness    | Optional                   | Optional                         |
| Primary Use | Resource limiting          | Critical section protection      |

### 🔸 CountDownLatch vs CyclicBarrier

| Feature          | CountDownLatch      | CyclicBarrier             |
| ---------------- | ------------------- | ------------------------- |
| Reusable         | ❌ No                | ✅ Yes                     |
| Who Waits        | One or more threads | All participating threads |
| Counter Behavior | Decrements to zero  | Resets after each cycle   |
| Barrier Action   | ❌                   | ✅ Optional                |
| Best For         | Task completion     | Phased execution          |

---

## 🎯 When to Use What?

| Scenario                            | Recommended Utility |
| ----------------------------------- | ------------------- |
| Limit number of concurrent users    | Semaphore           |
| Need timed or interruptible locking | ReentrantLock       |
| Wait for multiple tasks to finish   | CountDownLatch      |
| Synchronize threads in phases       | CyclicBarrier       |
| Simple mutual exclusion             | `synchronized`      |

---

## 🧠 Interview Tips

* ✅ Always release locks in a `finally` block.
* ✅ Use **Semaphore** for **resource limiting**, not mutual exclusion.
* ✅ Remember: **CountDownLatch = one-time**, **CyclicBarrier = reusable**.
* ✅ Prefer `synchronized` for simple scenarios.
* ✅ Mention **fairness** and **interruptibility** when discussing `ReentrantLock`.

---

## 📝 Memory Trick

| Utility            | Keyword to Remember   |
| ------------------ | --------------------- |
| **Semaphore**      | *Permits*             |
| **ReentrantLock**  | *Flexibility*         |
| **CountDownLatch** | *Wait for completion* |
| **CyclicBarrier**  | *Meet at barrier*     |

---

### 📌 10-Second Revision

```
Semaphore        → Limits concurrent access using permits.
ReentrantLock    → Advanced mutual exclusion with flexibility.
CountDownLatch   → One-time wait for tasks to complete.
CyclicBarrier    → Reusable synchronization at a common point.
```

---

If you’d like, I can also provide this cheat sheet as a **PDF** or **printable version** for easy offline revision. 😊
