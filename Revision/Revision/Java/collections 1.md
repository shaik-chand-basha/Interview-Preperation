# List of commonly asked interview questions on the Java Collection Framework(Part 1):

![](https://miro.medium.com/v2/resize:fit:866/1*linlgFV2AGXiMjd4kKmAgw.png)

**1.Explain the hierarchy of the Java Collection Framework.**

The Java Collection Framework provides a set of interfaces and classes for storing and manipulating groups of data as a single unit. It includes implementations of various data structures, such as lists, sets, queues, and maps, and algorithms for searching, sorting, and manipulating these data structures. Here's a brief overview:

1.  - **Collection Interface**: The root interface for all collection classes (excluding Map).  
    - **List Interface**: Ordered collection that allows duplicate elements.  
    - Implementations: ArrayList, LinkedList, Vector  
    - **Set Interface**: Collection that does not allow duplicate elements.  
    - Implementations: HashSet, LinkedHashSet, TreeSet  
    - **Queue Interface**: Collection used to hold multiple elements prior to processing.  
    - Implementations: LinkedList, PriorityQueue, ArrayDeque  
    - **Deque Interface**: Double-ended queue that supports element insertion/removal at both ends.  
    - Implementations: LinkedList, ArrayDeque
2.  - **Map Interface**: An object that maps keys to values, no duplicate keys allowed.  
    - Implementations: HashMap, LinkedHashMap, TreeMap, Hashtable, WeakHashMap, IdentityHashMap, ConcurrentHashMap

**2. What are the main interfaces in the Collection Framework?**  
The core interfaces are:  
- `Collection`: The root interface representing a group of objects.  
- `List`: An ordered collection (sequence) that allows duplicate elements.  
- `Set`: A collection that does not allow duplicate elements.  
- `Queue`: A collection used to hold multiple elements prior to processing.  
- `Map`: An object that maps keys to values.

**3. What is the difference between `List`, `Set`, and `Map`?**  
- `List` allows duplicate elements and maintains the insertion order.  
- `Set` does not allow duplicate elements and does not maintain any order (unless it is a `SortedSet`).  
- `Map` stores key-value pairs, does not allow duplicate keys, and keys are unique.

**4. What are the differences between `ArrayList` and `LinkedList`?**  
- `ArrayList` uses a dynamic array to store elements, providing fast random access but slower insertions and deletions in the middle of the list.  
- `LinkedList` uses a doubly-linked list, providing faster insertions and deletions but slower random access.

**5. What is the difference between `HashSet` and `TreeSet`?**  
- `HashSet` uses a **_hash table_** for storage and does not guarantee any order of elements.  
- `TreeSet` uses a **_red-black tree_** and guarantees that elements are sorted in natural order or by a specified comparator.

**6. What are the differences between `HashMap`, `LinkedHashMap`, and `TreeMap`?**  
- `HashMap` does not maintain any order of its elements.  
- `LinkedHashMap` maintains the order of elements in which they were inserted.  
- `TreeMap` stores elements in a sorted order, either by natural ordering or a specified comparator.

**7. How does `HashMap` work internally?**  
`HashMap` uses an array of buckets, where each bucket is a linked list. The key's hash code determines the bucket. In case of collisions, new entries are added to the linked list in the bucket. From Java 8, linked lists are replaced by balanced trees when the bucket size exceeds a certain threshold for better performance.

**8. What is the difference between `HashMap` and `Hashtable`?**  
- `HashMap` is **_unsynchronized_** and allows one null key and multiple null values.  
- `Hashtable` is **_synchronized_** and does not allow null keys or values.

**9. What is a `ConcurrentHashMap` and how is it different from `HashMap`?**  
`ConcurrentHashMap` is a thread-safe implementation of `HashMap`. It allows concurrent read and write operations by dividing the map into segments, reducing lock contention.

**10. What are the differences between `Comparable` and `Comparator`?**  
- `Comparable` is an interface that defines a natural ordering of objects by implementing the `compareTo()` method.  
- `Comparator` is an interface used to define an external comparison method by implementing the `compare()` method.

**11. What is the difference between `ArrayList` and `Vector`?**  
- `ArrayList` is unsynchronized, making it faster but not thread-safe.  
- `Vector` is synchronized, making it thread-safe but slower.

**12. What is the `Collection` interface?**  
`Collection` is the root interface in the collection hierarchy. It represents a group of objects known as elements and includes methods for adding, removing, and querying elements.

**13. How do you synchronize a collection in Java?**  
You can use synchronized wrappers provided by the `Collections` class, such as `Collections.synchronizedList()`, `Collections.synchronizedSet()`, etc., or use concurrent collections from the `java.util.concurrent` package.

**14. What is the `Queue` interface and its main implementations?**  
`Queue` represents a collection designed for holding elements prior to processing. Main implementations include `LinkedList`, `PriorityQueue`, and `ArrayBlockingQueue`.

**15. What is the `Set` interface and its main implementations?**  
`Set` represents a collection that does not allow duplicate elements. Main implementations include `HashSet`, `LinkedHashSet`, and `TreeSet`.

**16. What is the difference between `Iterator` and `ListIterator`?**  
- `Iterator` can traverse the collection in one direction (forward) and allows removal of elements during iteration.  
- `ListIterator` extends `Iterator` and can traverse the list in both directions (forward and backward) and allows modification of elements during iteration.

**17. What is the `fail-fast` behavior of an iterator?**  
`Fail-fast` iterators throw a `ConcurrentModificationException` if the collection is modified after the iterator is created, except through the iterator's own remove method.

**18. How can you create a synchronized collection from a non-synchronized collection?**  
Use `Collections.synchronizedList()`,`Collections.synchronizedSet()`, or `Collections.synchronizedMap()` to create synchronized versions of non-synchronized collections.

**19. What are `BlockingQueue` and its main implementations?**  
`BlockingQueue` is a type of queue that supports operations that wait for the queue to become non-empty when retrieving an element and wait for space to become available when storing an element. Main implementations include `ArrayBlockingQueue`, `LinkedBlockingQueue`, and `PriorityBlockingQueue`.

**20. What are the advantages of using the `NavigableMap` and `NavigableSet` interfaces?**  
They provide methods for navigation, such as getting the closest matches for keys or elements. For example, `floorEntry()`, `ceilingEntry()`, `lowerEntry()`, and `higherEntry()` in `NavigableMap`.

**21. What is the `Collections` utility class?**  
`Collections` provides static methods for operating on or returning collections, such as sorting, searching, and synchronized collection wrappers.

**22. How does `TreeSet` ensure that elements are sorted?**  
`TreeSet` uses a `NavigableMap` (specifically a `TreeMap`) to store elements. Elements are sorted according to their natural ordering or by a comparator provided at set creation time.

**23. What is the difference between `remove()` and `removeIf()` methods in the `Collection` interface?**  
- `remove()` removes a single instance of the specified element from the collection.  
- `removeIf()` removes all elements of the collection that satisfy the given predicate.

**24. What are some of the differences between `Collection` and `Collections`?**  
- `Collection` is an interface that represents a group of objects.  
- `Collections` is a utility class that provides methods to operate on collections.

**25. How can you convert a `List` to a `Set`?**  
You can use the constructor of `HashSet` or other set implementations:
```java
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "A"));  
Set<String> set = new HashSet<>(list);
```
**26. Explain the concept of `immutability` in collections. How can you create an immutable collection?**  
An immutable collection cannot be modified after it's created. Use `Collections.unmodifiableList()`, `Collections.unmodifiableSet()`, etc., or use the `List.of()`, `Set.of()`, and `Map.of()` methods introduced in Java 9.

**27. What are `WeakHashMap` and its use cases?**  
`WeakHashMap` uses weak references for its keys, allowing them to be garbage collected when there are no other strong references. It is useful for implementing memory-sensitive caches.

**28. How can you filter a collection in Java 8 and above?**  
Use the `stream()` method and `filter()`:
```java

List<String> list = Arrays.asList("A", "B", "C", "D");  
List<String> filteredList = list.stream()  
 .filter(s -> s.startsWith("A"))  
 .collect(Collectors.toList());  
```
**29. What is a `PriorityQueue` and how does it work?**  
`PriorityQueue` is a queue that orders elements based on their natural ordering or by a comparator provided at queue construction time. It provides O(log(n)) time complexity for the enqueuing and dequeuing methods.


**30. What is the difference between `peek()`, `poll()`, and `remove()` in a `Queue`?**  
- `peek()`: Retrieves, but does not remove, the head of the queue, returning `null` if the queue is empty.  
- `poll()`: Retrieves and removes the head of the queue, returning `null` if the queue is empty.  
- `remove()`: Retrieves and removes the head of the queue, throwing an exception if the queue is empty.

**31.What is the role of the ListIterator interface?**

ListIterator is an interface that extends the Iterator interface and is used to iterate over the elements of a list. It allows bidirectional traversal of a list (forward and backward). Key methods include:

- hasNext(): Returns true if there are more elements when moving forward.  
- next(): Returns the next element.  
- hasPrevious(): Returns true if there are more elements when moving backward.  
- previous(): Returns the previous element.  
- add(E e): Inserts the specified element into the list.  
- remove(): Removes the last element returned by next() or previous().  
- set(E e): Replaces the last element returned by next() or previous() with the specified element.

**32.What are the characteristics of a ConcurrentSkipListSet?**

ConcurrentSkipListSet is a thread-safe implementation of the NavigableSet interface. It uses a skip list for storage. Key characteristics include:

- Thread-Safety: Concurrent access is handled efficiently without locking the entire set.  
- Sorted Order: Elements are stored in their natural order or by a Comparator provided at set creation.  
- Non-blocking Algorithms: It provides better performance under high contention compared to synchronized collections.

**33.How does a HashMap work internally?**

HashMap works using an array of nodes, where each node represents a key-value pair (entry). Key steps involved:

- Hashing: HashMap uses the hashCode() method of the key to compute an index for storing the key-value pair in the array.  
- Buckets: Each index in the array (bucket) may contain multiple entries (due to hash collisions), which are stored in a linked list or a balanced tree (in Java 8 and later, if the list size exceeds a threshold).  
- Operations:  
- put(): Computes the bucket index, places the entry in the appropriate bucket. If an entry with the same key exists, it replaces the old value.  
- get(): Computes the bucket index, searches the bucket for the entry with the matching key, and returns the associated value.  
- remove(): Computes the bucket index, searches and removes the entry with the matching key.

**34.What is the purpose of IdentityHashMap?**

IdentityHashMap is a Map implementation that uses reference equality (==) instead of object equality (equals()) for comparing keys and values. Its purposes include:

- Identity-based Comparison: Used when distinct instances of keys are required, even if they are logically equivalent.  
- Memory-sensitive Caches: Suitable for scenarios where key identity is important.

**35.How does ConcurrentHashMap ensure thread safety?**

ConcurrentHashMap ensures thread safety through several mechanisms:

- Segmented Locking: Initially divided the map into segments, each of which could be locked independently (in Java 7 and earlier). In Java 8 and later, segments are replaced by finer-grained internal data structures and algorithms.  
- Non-blocking Algorithms: Utilizes CAS (Compare-And-Swap) and other non-blocking algorithms to manage concurrent access.  
- Concurrency Level: Allows specifying the concurrency level, determining the number of threads that can concurrently modify the map.

**36.What is the WeakHashMap class used for?**

WeakHashMap is a map-based implementation that uses weak references for its keys. Entries in a WeakHashMap can be garbage collected when their keys are no longer in use. It is useful for:

- Memory-sensitive Caches: Automatically removes entries when the keys are no longer referenced elsewhere.  
- Preventing Memory Leaks: Avoids holding strong references to keys, allowing them to be garbage collected.

**37.What is the difference between synchronized and concurrent collections?**

- Synchronized Collections: These collections are thread-safe, with each method being synchronized to ensure atomic operations. Examples include Collections.synchronizedList(new ArrayList<>()) and Hashtable. They are suitable for low-contention scenarios but can suffer from performance bottlenecks under high contention due to lock contention.

- Concurrent Collections: Designed for concurrent access with better performance under high contention. They use advanced techniques like lock-free algorithms, segmented locking, and atomic operations. Examples include ConcurrentHashMap, CopyOnWriteArrayList, and ConcurrentLinkedQueue.

**38.How do you make a collection thread-safe?**

To make a collection thread-safe, you can:

- Use synchronized wrappers: Utilize Collections.synchronizedList(), Collections.synchronizedSet(), and Collections.synchronizedMap().
```java
List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
```
- Use concurrent collections: Prefer collections from the java.util.concurrent package, like ConcurrentHashMap, CopyOnWriteArrayList, and ConcurrentLinkedQueue.

**39.What are CopyOnWriteArrayList and CopyOnWriteArraySet?**

- CopyOnWriteArrayList: A thread-safe variant of ArrayList where all mutative operations (add, set, remove) are implemented by making a fresh copy of the underlying array. Suitable for scenarios where reads are more frequent than writes.

- CopyOnWriteArraySet: A thread-safe Set implementation backed by a CopyOnWriteArrayList. It shares the same properties and use cases as CopyOnWriteArrayList.

**40.How does a ConcurrentLinkedQueue differ from other Queue implementations?**

ConcurrentLinkedQueue is a thread-safe, non-blocking queue implementation. Key differences include:

- Non-blocking: Utilizes CAS (Compare-And-Swap) operations for thread safety, allowing concurrent access without locks.  
- FIFO Order: Maintains the order of elements in a first-in-first-out (FIFO) manner.  
- High Throughput: Provides better performance under high contention compared to blocking queues like LinkedBlockingQueue.

**41.What is a ConcurrentSkipListMap?**

ConcurrentSkipListMap is a thread-safe implementation of the NavigableMap interface. It is based on skip lists and provides several features:

- Thread Safety: Allows concurrent access and modification without locking the entire map.  
- Sorted Order: Maintains elements in their natural order or by a provided Comparator.  
- Efficient Range Queries: Supports efficient range queries and submaps due to its sorted nature.