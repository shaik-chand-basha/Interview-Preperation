# Introduction
------------------------------

There is **no prerequisite** to read this one shot blog.

If you know how to build a basic backend, understand what an API is, and have used a database at least once, you are good to go.

This article is designed to be a **single source of truth** for system design fundamentals. You should be able to read this and then directly start attempting system design interview problems or designing real-world systems with confidence.

Most system design content online focuses heavily on theory. This cheatsheet focuses on:

*   Practical intuition
*   Real-world usage
*   How things break at scale
*   Why certain design decisions exist

Think of this as notes shared by a friend who has already made mistakes so you do not have to repeat all of them.

What This One Shot Blog Covers?[#](#what-this-one-shot-blog-covers)
-------------------------------------------------------------------

This is a long read by design. Roughly 60 minutes if read properly.

You will learn:

*   Why system design matters
*   What servers actually are
*   Latency vs throughput
*   Scaling fundamentals
*   Auto scaling
*   Back-of-the-envelope estimation

Later parts will go much deeper into databases, caching, distributed systems, messaging, consistency, and interview strategy.

* * *

Why Study System Design?[#](#why-study-system-design)
-----------------------------------------------------

Most developers start by building systems like this:

![Basic Single-Server Architecture.avif](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/Basic_Single_Server_Architecture_a0a59a8deb.avif)

This architecture works perfectly for:

*   College projects
*   Hackathons
*   Early MVPs
*   Side projects with limited users

Now imagine this same system when:

*   Thousands of users hit it simultaneously
*   Database queries increase massively
*   One server goes down
*   Traffic spikes unexpectedly

Suddenly:

*   APIs slow down
*   Requests start failing
*   The database becomes the bottleneck
*   The system crashes at the worst possible time

System design is about **preparing for growth and failure**.

It answers questions like:

*   How do we scale without rewriting everything?
*   How do we handle failures gracefully?
*   How do we make systems reliable under load?
*   How do real companies handle millions of users?

If you do not design for scale early, scale will force redesign later.

What Is a Server?[#](#what-is-a-server)
---------------------------------------

A server is simply a **computer running your application**.

There is nothing special about it.

When you run a backend locally on:

[http://localhost:8080](http://localhost:8080)

You are already running a server.

### Breaking it down[#](#breaking-it-down)

*   `localhost` resolves to the IP address `127.0.0.1`
*   This IP points to your own machine
*   `8080` is the port number
*   The port tells the operating system which application should receive the request

Your laptop can run multiple applications at the same time. Ports help the OS route requests to the correct application.

### What happens when you visit a website?[#](#what-happens-when-you-visit-a-website)

When you type:

[https://example.com](https://example.com)

![DNS + Request Flow.avif](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/DNS_Request_Flow_440532caf0.avif)

Behind the scenes:

1.  DNS resolves `example.com` to an IP address
2.  Your browser sends a request to that IP
3.  The request hits a server on a specific port
4.  The server routes it to the correct application
5.  The application processes the request and sends a response

Remembering IP addresses is hard, so humans use domain names. Machines still talk using IP addresses.

How Do We Deploy an Application?[#](#how-do-we-deploy-an-application)
---------------------------------------------------------------------

Locally, your application runs on your laptop.

To make it accessible to others:

*   You need a public IP address
*   You need a machine that stays online
*   You need to expose your application to the internet

Managing physical servers is painful. That is why cloud providers exist.

Cloud providers give you:

*   Virtual machines
*   Public IP addresses
*   Networking
*   Security tools

In AWS, a virtual machine is called an **EC2 instance**.

Uploading your application code from your laptop to a cloud server is called **deployment**.

Latency and Throughput[#](#latency-and-throughput)
--------------------------------------------------

These two terms appear everywhere in system design discussions. They measure different things and both matter.

### Latency[#](#latency)

Latency is the **time taken for a single request** to go from the client to the server and back.

It is usually measured in milliseconds.

Examples:

*   API responds in 120 ms
*   Webpage loads in 300 ms

Lower latency means:

*   Faster responses
*   Better user experience

Higher latency means:

*   Slower apps
*   Frustrated users
*   More retries and refreshes

### Round Trip Time (RTT)[#](#round-trip-time-rtt)

RTT is the total time taken for:

*   Request to reach the server
*   Response to come back

RTT is often used interchangeably with latency.

### Throughput[#](#throughput)

Throughput is the **number of requests a system can handle per second**.

It is measured as:

*   Requests per second (RPS)
*   Transactions per second (TPS)

A system can have:

*   Low latency but low throughput
*   High throughput but high latency

The ideal system has:

*   Low latency
*   High throughput

In reality, you usually balance between the two.

### Simple Analogy[#](#simple-analogy)

Concept

Real World Example

Latency

Time taken by one car to travel a road

Throughput

Number of cars that can pass per hour

![Latency vs Throughput.avif](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/Latency_vs_Throughput_6e25483303.avif)

Scaling Basics[#](#scaling-basics)
----------------------------------

Scaling means **handling more load**.

Load can be:

*   More users
*   More requests
*   More data

There are only two ways to scale a system.

### Vertical Scaling[#](#vertical-scaling)

Vertical scaling means increasing the power of a single machine.

Examples:

*   More CPU cores
*   More RAM
*   Larger disk

### Pros[#](#pros)

*   Simple to implement
*   No architectural changes required

### Cons[#](#cons)

*   Has a hard upper limit
*   Expensive
*   Single point of failure

Vertical scaling is usually the first step because it is easy.

### Horizontal Scaling[#](#horizontal-scaling)

Horizontal scaling means adding more machines and distributing the load.

Instead of one powerful server:

*   Use many smaller servers
*   Spread traffic evenly

Clients cannot decide which server to talk to. That is where load balancers come in.

![Horizontal Scaling + Load Balancer.avif](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/Horizontal_Scaling_Load_Balancer_fe3308760c.avif)

Load Balancer (High Level)[#](#load-balancer-high-level)
--------------------------------------------------------

A load balancer:

*   Acts as a single entry point
*   Receives all incoming requests
*   Forwards them to backend servers

Clients only know the load balancer. Servers can be added or removed freely.

Horizontal scaling is the most common approach in real-world systems.

Auto Scaling[#](#auto-scaling)
------------------------------

Traffic is rarely constant.

Some days:

*   Low usage

Some days:

*   Traffic spikes suddenly

Running maximum servers all the time is expensive and wasteful.

Auto scaling solves this.

![Auto Scaling.avif](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/Auto_Scaling_0ed0186537.avif)

### How Auto Scaling Works[#](#how-auto-scaling-works)

*   Monitor server metrics like CPU or memory
*   Define thresholds
*   Add servers when load increases
*   Remove servers when load decreases

This allows:

*   Cost efficiency
*   High availability
*   Automatic recovery

Auto scaling should always be combined with monitoring and alerts.

Back-of-the-Envelope Estimation[#](#back-of-the-envelope-estimation)
--------------------------------------------------------------------

In system design interviews, you are expected to estimate scale.

Exact numbers are not required. Reasonable approximations are.

Spend around 5 minutes on this in interviews.

### Memory and Storage Reference Table[#](#memory-and-storage-reference-table)

Unit

Approximate Size

Power of 10

1 KB

1,000 bytes

10³

1 MB

1,000,000 bytes

10⁶

1 GB

1,000,000,000 bytes

10⁹

1 TB

1,000,000,000,000 bytes

10¹²

### What We Usually Estimate[#](#what-we-usually-estimate)

1.  Load estimation
2.  Storage estimation
3.  Resource estimation

### Example: Load Estimation[#](#example-load-estimation)

Assume:

*   50 million daily active users
*   Each user performs 10 actions per day

Total actions per day:

50,000,000 x 10 = 500,000,000 actions/day

Approximate requests per second:

500,000,000 / 86,400 ≈ 5,800 requests/sec

### Example: Storage Estimation[#](#example-storage-estimation)

Assume:

*   Each record is 1 KB
*   500 million records per day

Daily storage required:

500 million x 1 KB = 500 GB per day

Monthly storage:

500 GB x 30 ≈ 15 TB

### Example: Resource Estimation[#](#example-resource-estimation)

Assume:

*   6,000 requests per second
*   Each request takes 10 ms of CPU time

Total CPU time per second:

6,000 x 10 ms = 60,000 ms

If one CPU core handles 1,000 ms per second:

60,000 / 1,000 = 60 CPU cores

If one server has 4 cores:

60 / 4 = 15 servers

CAP Theorem[#](#cap-theorem)
----------------------------

CAP theorem is one of the most important ideas in system design.

It explains **why distributed systems are forced to make trade-offs**.

CAP stands for:

*   Consistency
*   Availability
*   Partition Tolerance

![CAP Theorem Triangle.avif](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/CAP_Theorem_Triangle_0e865ed113.avif)

This discussion always assumes we are talking about **distributed systems**.

What Is a Distributed System?[#](#what-is-a-distributed-system)
---------------------------------------------------------------

A distributed system is one where:

*   Data is stored across multiple machines
*   Requests are served by multiple nodes
*   Systems communicate over a network

We use distributed systems because:

*   One machine is not enough at scale
*   We want fault tolerance
*   We want lower latency by serving users from nearby locations

Each individual machine in a distributed system is called a **node**.

![Distributed Nodes.avif](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/Distributed_Nodes_6de50cb8df.avif)

The Three Properties Explained[#](#the-three-properties-explained)
------------------------------------------------------------------

### Consistency[#](#consistency)

Consistency means:

*   Every read returns the most recent write
*   All nodes see the same data at the same time

If data is updated on one node, that update must be reflected on all nodes before reads are allowed.

Example:

*   User updates their profile name
*   Any request from any node should show the updated name immediately

* * *

### Availability[#](#availability)

Availability means:

*   Every request receives a response
*   The system continues to function even if some nodes fail

The response does not need to be correct or latest, but the system should not refuse requests.

Example:

*   One database replica crashes
*   Other replicas continue serving traffic

* * *

### Partition Tolerance[#](#partition-tolerance)

Partition tolerance means:

*   The system continues to operate even if network communication breaks between nodes

Network failures are unavoidable in real systems. Because of this, **partition tolerance is mandatory** in distributed systems.

* * *

The Core Idea of CAP Theorem[#](#the-core-idea-of-cap-theorem)
--------------------------------------------------------------

In a distributed system, you can only guarantee **two out of three** properties at the same time.

Possible combinations:

*   CP (Consistency + Partition Tolerance)
*   AP (Availability + Partition Tolerance)

Impossible combination:

*   CAP (all three at once)

* * *

Why Can We Not Have All Three?[#](#why-can-we-not-have-all-three)
-----------------------------------------------------------------

Assume three nodes:

*   Node A
*   Node B
*   Node C

Now assume a network partition occurs:

*   Node B loses connection with A and C

### If we choose Availability:[#](#if-we-choose-availability)

*   Node B continues serving requests
*   Node A and C continue serving requests
*   Data may become inconsistent

Result:

*   Availability achieved
*   Consistency sacrificed

### If we choose Consistency:[#](#if-we-choose-consistency)

*   Stop serving requests until network is restored
*   Prevent inconsistent writes

Result:

*   Consistency achieved
*   Availability sacrificed

There is no way to avoid this trade-off.

* * *

Why Not Choose CA?[#](#why-not-choose-ca)
-----------------------------------------

CA assumes:

*   No network failures

In real-world distributed systems:

*   Network partitions will happen
*   Latency spikes will happen
*   Nodes will temporarily disconnect

That is why real systems always choose between **CP or AP**.

* * *

When to Choose CP vs AP[#](#when-to-choose-cp-vs-ap)
----------------------------------------------------

### Choose CP When:[#](#choose-cp-when)

*   Data correctness is critical
*   Inconsistent data is unacceptable

Examples:

*   Banking systems
*   Payment systems
*   Stock trading platforms
*   Account balances

* * *

### Choose AP When:[#](#choose-ap-when)

*   High availability is more important than strict consistency
*   Slightly stale data is acceptable

Examples:

*   Social media feeds
*   Like counts
*   Comments
*   View counts

* * *

Database Scaling[#](#database-scaling)
--------------------------------------

Initially, applications use a single database server.

As traffic increases:

*   Queries slow down
*   CPU usage increases
*   Disk IO becomes a bottleneck

We scale databases **step by step**, not all at once.

Over-engineering early is just as bad as under-engineering.

* * *

Indexing[#](#indexing)
----------------------

Without indexes:

*   Database scans every row
*   Time complexity is O(N)

With indexes:

*   Database uses a data structure like B-trees
*   Time complexity becomes O(log N)

Indexes are created on columns that are frequently queried.

### Key Points About Indexing[#](#key-points-about-indexing)

*   Improves read performance
*   Slightly slows down writes
*   Uses extra storage
*   Should be added thoughtfully

You rarely regret adding the right index.

* * *

Partitioning[#](#partitioning)
------------------------------

Partitioning means:

*   Breaking a large table into smaller tables
*   All partitions live on the same database server

Each partition has:

*   Its own index
*   Smaller data size
*   Faster queries

The database engine decides which partition to query.

Partitioning improves performance without changing application logic.

* * *

Master Slave Architecture[#](#master-slave-architecture)
--------------------------------------------------------

Used when:

*   Reads heavily outnumber writes
*   One database cannot handle read traffic

### How It Works[#](#how-it-works)

*   One **master** handles all writes
*   Multiple **slaves** handle reads
*   Data is replicated from master to slaves

![Master-Slave Database.png](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/Master_Slave_Database_d569ad9f45.png)

Reads are distributed. Writes remain centralized.

* * *

Multi-Master Architecture[#](#multi-master-architecture)
--------------------------------------------------------

Used when:

*   Write traffic becomes very high
*   One master cannot handle all writes

Multiple masters:

*   Handle writes independently
*   Periodically sync data

### Challenges[#](#challenges)

*   Write conflicts
*   Data reconciliation
*   Complex business logic

Multi-master setups are powerful but risky.

* * *

Database Sharding[#](#database-sharding)
----------------------------------------

Sharding means:

*   Splitting data across multiple database servers
*   Each server holds a subset of the data

Each server is called a **shard**.

Sharding is done using a **sharding key**.

* * *

Sharding Strategies[#](#sharding-strategies)
--------------------------------------------

### Range-Based Sharding[#](#range-based-sharding)

Data split by ranges.

Example:

*   Users 1 to 1,000 on shard 1
*   Users 1,001 to 2,000 on shard 2

Pros:

*   Simple logic

Cons:

*   Uneven load
*   Hot shards

* * *

### Hash-Based Sharding[#](#hash-based-sharding)

Shard determined by hash function.

Example: hash(user\_id) % number\_of\_shards

Pros:

*   Even data distribution

Cons:

*   Hard to rebalance
*   Adding shards is complex

* * *

### Geographic Sharding[#](#geographic-sharding)

Data split by region.

Example:

*   Asia users on one shard
*   Europe users on another shard

Pros:

*   Low latency

Cons:

*   Traffic imbalance

* * *

### Directory-Based Sharding[#](#directory-based-sharding)

A lookup table maps keys to shards.

Pros:

*   Flexible
*   Easy to reassign shards

Cons:

*   Lookup table becomes a bottleneck

* * *

Disadvantages of Sharding[#](#disadvantages-of-sharding)
--------------------------------------------------------

*   Complex application logic
*   Expensive joins
*   Hard consistency guarantees
*   Difficult rebalancing

Avoid sharding until absolutely necessary.

* * *

Summary of Database Scaling[#](#summary-of-database-scaling)
------------------------------------------------------------

Follow this order:

1.  Vertical scaling
2.  Indexing
3.  Partitioning
4.  Read replicas
5.  Sharding

Scale only when needed.

* * *

SQL vs NoSQL Databases[#](#sql-vs-nosql-databases)
--------------------------------------------------

Choosing the right database matters more than choosing the popular one.

* * *

SQL Databases[#](#sql-databases)
--------------------------------

Characteristics:

*   Structured schema
*   Tables and rows
*   Strong consistency
*   ACID guarantees

Examples:

*   MySQL
*   PostgreSQL
*   Oracle

Use SQL when:

*   Data integrity matters
*   Complex joins are required
*   Transactions are critical

* * *

NoSQL Databases[#](#nosql-databases)
------------------------------------

Characteristics:

*   Flexible schema
*   Horizontal scaling
*   High availability
*   Eventual consistency

Types:

Type

Example

Use Case

Document

MongoDB

JSON-like data

Key-Value

Redis

Caching

Column

Cassandra

Large-scale writes

Graph

Neo4j

Relationship queries

* * *

Scaling Differences[#](#scaling-differences)
--------------------------------------------

Feature

SQL

NoSQL

Scaling

Vertical

Horizontal

Schema

Fixed

Flexible

Consistency

Strong

Eventual

Joins

Supported

Limited

* * *

When to Use Which[#](#when-to-use-which)
----------------------------------------

Use SQL when:

*   Financial data
*   User accounts
*   Orders and payments

Use NoSQL when:

*   High traffic
*   Large datasets
*   Real-time systems
*   Low latency requirements

Many production systems use **both together**.

* * *

End of Part 2[#](#end-of-part-2)
--------------------------------

In this part, you learned:

*   CAP theorem
*   Distributed system trade-offs
*   Database scaling strategies
*   SQL vs NoSQL decision making

Next part will cover:

*   Microservices
*   Load balancer deep dive
*   Caching and Redis

Microservices[#](#microservices)
--------------------------------

Before microservices became popular, most applications were built as **monoliths**.

Understanding the difference is critical.

* * *

Monolith Architecture[#](#monolith-architecture)
------------------------------------------------

In a monolith:

*   Entire backend is one single application
*   All features live in the same codebase
*   Deployed as one unit

Example for an e-commerce app:

*   User management
*   Product listing
*   Orders
*   Payments

All of this exists in one backend service.

### Advantages of Monolith[#](#advantages-of-monolith)

*   Simple to build initially
*   Easy to debug at small scale
*   Faster development for small teams

### Disadvantages of Monolith[#](#disadvantages-of-monolith)

*   Hard to scale individual features
*   One crash can bring down everything
*   Codebase becomes messy over time
*   Deployments become risky

Most startups begin with a monolith. That is normal and often the right choice.

* * *

Microservice Architecture[#](#microservice-architecture)
--------------------------------------------------------

Microservices break a large application into **small, independent services**.

Each service:

*   Has its own codebase
*   Has its own database (usually)
*   Can be deployed independently

![Monolith vs Microservices.png](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/Monolith_vs_Microservices_a5569b287a.png)

Example microservices for e-commerce:

*   User Service
*   Product Service
*   Order Service
*   Payment Service

* * *

Why Do We Use Microservices?[#](#why-do-we-use-microservices)
-------------------------------------------------------------

### Independent Scaling[#](#independent-scaling)

If Product Service gets more traffic:

*   Scale only Product Service
*   No need to scale entire system

### Independent Deployments[#](#independent-deployments)

*   Deploy Order Service without touching Payment Service
*   Fewer production risks

### Fault Isolation[#](#fault-isolation)

*   Payment Service crash does not kill User Service
*   System degrades gracefully

### Technology Flexibility[#](#technology-flexibility)

*   One service in Node.js
*   Another in Go
*   Another in Java

Each team can choose what fits best.

* * *

When Should You Use Microservices?[#](#when-should-you-use-microservices)
-------------------------------------------------------------------------

Do not start with microservices blindly.

Microservices make sense when:

*   Team size increases
*   Multiple teams work independently
*   Application grows large
*   Deployment frequency increases
*   You want to avoid single point of failure

Small teams with early-stage products should usually start with a monolith.

* * *

How Clients Communicate in Microservices[#](#how-clients-communicate-in-microservices)
--------------------------------------------------------------------------------------

Each microservice runs on:

*   Different machines
*   Different IP addresses
*   Different ports

Clients should not manage this complexity.

So we introduce an **API Gateway**.

* * *

API Gateway[#](#api-gateway)
----------------------------

API Gateway:

*   Acts as a single entry point
*   Routes requests to correct microservices
*   Hides internal architecture from clients

Client: /login /products /orders

Gateway:

*   Sends `/login` to User Service
*   Sends `/products` to Product Service
*   Sends `/orders` to Order Service

* * *

Additional Responsibilities of API Gateway[#](#additional-responsibilities-of-api-gateway)
------------------------------------------------------------------------------------------

*   Authentication and authorization
*   Rate limiting
*   Request validation
*   Response aggregation
*   Caching

API Gateway simplifies client logic and centralizes cross-cutting concerns.

* * *

Load Balancer Deep Dive[#](#load-balancer-deep-dive)
----------------------------------------------------

Whenever you horizontally scale services, you need a load balancer.

Clients should not know:

*   How many servers exist
*   Which server is healthy
*   Which server is busy

* * *

Why Load Balancer Is Required[#](#why-load-balancer-is-required)
----------------------------------------------------------------

Without a load balancer:

*   Clients must know all server IPs
*   Clients must decide routing
*   Failures become client problems

With a load balancer:

*   Single entry point
*   Automatic traffic distribution
*   Health checks
*   Failover handling

* * *

Load Balancer Algorithms[#](#load-balancer-algorithms)
------------------------------------------------------

### Round Robin[#](#round-robin)

Requests are sent to servers sequentially.

Example:

*   Request 1 to Server A
*   Request 2 to Server B
*   Request 3 to Server C
*   Repeat

Pros:

*   Simple
*   Fair distribution

Cons:

*   Ignores server load
*   Assumes equal capacity

* * *

### Weighted Round Robin[#](#weighted-round-robin)

Each server has a weight.

Servers with higher weight:

*   Receive more requests

Useful when:

*   Servers have different hardware capacity

* * *

### Least Connections[#](#least-connections)

Traffic is routed to:

*   Server with fewest active connections

Pros:

*   Dynamic
*   Adapts to real-time load

Cons:

*   Not ideal when requests vary greatly in duration

* * *

### Hash-Based Routing[#](#hash-based-routing)

Routing based on:

*   Client IP
*   User ID
*   Session ID

Ensures:

*   Same user hits same server

Useful for:

*   Session persistence
*   Stateful applications

* * *

Caching[#](#caching)
--------------------

Caching is one of the highest impact optimizations in system design.

Caching stores:

*   Frequently accessed data
*   In fast storage
*   For quick retrieval

* * *

Why Caching Is Needed[#](#why-caching-is-needed)
------------------------------------------------

Database access is slow compared to memory.

Example:

*   Database fetch takes 500 ms
*   Processing takes 100 ms
*   Total response time is 600 ms

With caching:

*   Cached response served in 50 ms

![Cache Hit vs Cache Miss.avif](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/Cache_Hit_vs_Cache_Miss_3292a7b3d9.avif)

Huge improvement with minimal effort.

* * *

Where Can We Cache?[#](#where-can-we-cache)
-------------------------------------------

### Client Side Cache[#](#client-side-cache)

*   Browser cache
*   Mobile app cache

Used for:

*   Static files
*   Images
*   Scripts

* * *

### Server Side Cache[#](#server-side-cache)

*   Stored on backend servers
*   Often in memory

Examples:

*   Redis
*   Memcached

* * *

### CDN Cache[#](#cdn-cache)

*   Used for static content
*   Geographically distributed

Examples:

*   Images
*   Videos
*   Stylesheets

* * *

### Application Level Cache[#](#application-level-cache)

*   Inside application code
*   Stores computed results
*   Avoids repeated computation

* * *

Cache Invalidation[#](#cache-invalidation)
------------------------------------------

Caching is easy. Invalidation is hard.

Whenever data changes:

*   Cached value must be updated or removed

Common strategies:

*   Time based expiration
*   Manual eviction
*   Write-through cache

Poor invalidation leads to stale data bugs.

* * *

Redis Introduction[#](#redis-introduction)
------------------------------------------

Redis is an in-memory data store.

In-memory means:

*   Data stored in RAM
*   Extremely fast read and write

Redis is commonly used for:

*   Caching
*   Rate limiting
*   Pub-sub
*   Session storage

* * *

Why Not Store Everything in Redis?[#](#why-not-store-everything-in-redis)
-------------------------------------------------------------------------

RAM is expensive and limited.

Databases:

*   Store data on disk
*   Handle large volumes
*   Persist data reliably

Redis:

*   Fast but volatile
*   Data may be lost if not persisted

Redis complements databases. It does not replace them.

* * *

Redis Data Model[#](#redis-data-model)
--------------------------------------

Redis stores data as **key-value pairs**.

Key naming convention: user:1 user:1:email product:45

Colon separation helps readability and grouping.

* * *

Common Redis Data Types[#](#common-redis-data-types)
----------------------------------------------------

### String[#](#string)

*   Simple key-value
*   Most commonly used

Commands:

*   SET
*   GET
*   MGET

* * *

### List[#](#list)

Ordered collection.

Commands:

*   LPUSH
*   RPUSH
*   LPOP
*   RPOP

Use cases:

*   Queues
*   Stacks

* * *

### Set[#](#set)

*   Unique values
*   No duplicates

Use cases:

*   Unique visitors
*   Tags

* * *

### Hash[#](#hash)

*   Key-value pairs inside a key
*   Similar to an object

Use cases:

*   User profiles
*   Configurations

* * *

Redis TTL (Time To Live)[#](#redis-ttl-time-to-live)
----------------------------------------------------

Keys can have expiration time.

Example:

*   Cache valid for 24 hours
*   Automatically deleted after expiry

TTL helps:

*   Avoid stale data
*   Control memory usage

* * *

Cache Hit and Cache Miss[#](#cache-hit-and-cache-miss)
------------------------------------------------------

*   Cache hit: Data found in cache
*   Cache miss: Data not found in cache

Flow:

1.  Check cache
2.  If hit, return data
3.  If miss, fetch from database
4.  Store in cache
5.  Return response

* * *

Write-Through vs Read-Through Cache[#](#write-through-vs-read-through-cache)
----------------------------------------------------------------------------

### Read-Through[#](#read-through)

*   Cache populated on read
*   Cache miss triggers database read

### Write-Through[#](#write-through)

*   Data written to cache and database together
*   Ensures cache consistency

Choice depends on use case.

* * *

End of Part 3[#](#end-of-part-3)
--------------------------------

In this part, you learned:

*   Monolith vs microservices
*   API gateway
*   Load balancer internals
*   Caching strategies
*   Redis fundamentals

Next part will cover:

*   Blob storage
*   CDN
*   Message brokers
*   Kafka
*   Pub-sub systems

Blob Storage[#](#blob-storage)
------------------------------

Databases are great at storing:

*   Text
*   Numbers
*   Structured records

Databases are terrible at storing:

*   Images
*   Videos
*   PDFs
*   Audio files

Trying to store large binary files inside databases leads to:

*   Slow queries
*   Huge backups
*   Scaling nightmares

That is why blob storage exists.

* * *

What Is a Blob?[#](#what-is-a-blob)
-----------------------------------

Blob stands for **Binary Large Object**.

Any file such as:

*   Image
*   Video
*   PDF
*   ZIP
*   Audio

Can be represented as a sequence of binary data. That binary data is called a blob.

* * *

Why We Do Not Store Blobs in Databases[#](#why-we-do-not-store-blobs-in-databases)
----------------------------------------------------------------------------------

Problems with storing blobs in databases:

*   Large row sizes
*   Slow reads and writes
*   Difficult scaling
*   Expensive storage

Databases are optimized for structured data, not large files.

* * *

Blob Storage Services[#](#blob-storage-services)
------------------------------------------------

Blob storage is usually a managed service.

Examples:

*   AWS S3
*   Cloudflare R2
*   Google Cloud Storage
*   Azure Blob Storage

These services handle:

*   Scaling
*   Durability
*   Replication
*   Availability

You treat them like a black box.

* * *

How Blob Storage Is Used[#](#how-blob-storage-is-used)
------------------------------------------------------

Typical flow:

1.  Client uploads file
2.  Backend generates upload credentials
3.  File stored in blob storage
4.  Database stores file URL or metadata
5.  Client accesses file via URL

Database stores references, not the file itself.

* * *

AWS S3 Basics[#](#aws-s3-basics)
--------------------------------

You can think of S3 like Google Drive for applications.

Key properties:

*   Extremely cheap storage
*   Virtually unlimited size
*   High durability
*   Global availability

S3 is ideal for:

*   Images
*   Videos
*   Static website files
*   Backups
*   Logs

* * *

Important S3 Concepts[#](#important-s3-concepts)
------------------------------------------------

Concept

Meaning

Bucket

Container for files

Object

A file stored in S3

Key

Path of the file

Region

Physical location

S3 provides durability close to 100 percent by replicating data internally.

* * *

Content Delivery Network (CDN)[#](#content-delivery-network-cdn)
----------------------------------------------------------------

Serving files directly from blob storage works. Serving them fast worldwide does not.

CDN solves this problem.

* * *

What Is a CDN?[#](#what-is-a-cdn)
---------------------------------

A CDN is a network of servers distributed across the world.

These servers:

*   Cache static content
*   Serve users from nearby locations
*   Reduce latency

Examples:

*   AWS CloudFront
*   Cloudflare CDN
*   Akamai

* * *

Why CDN Is Needed[#](#why-cdn-is-needed)
----------------------------------------

Assume:

*   Files stored in India
*   User requests from USA

Without CDN:

*   High latency
*   Slow loading
*   Poor experience

With CDN:

*   File cached near user
*   Faster response
*   Reduced load on origin server

* * *

How CDN Works[#](#how-cdn-works)
--------------------------------

1.  User requests a file
2.  Request goes to nearest edge server
3.  If file exists in cache, return it
4.  If not, fetch from origin
5.  Cache it at edge
6.  Serve future requests locally

![CDN — How It Works.avif](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/CDN_How_It_Works_25cacb90f4.avif)

* * *

CDN Terminology[#](#cdn-terminology)
------------------------------------

Term

Description

Edge Server

CDN server near user

Origin Server

Original source like S3

TTL

Cache expiry duration

Cache Hit

File served from CDN

Cache Miss

File fetched from origin

* * *

Message Broker[#](#message-broker)
----------------------------------

Not all tasks should be handled synchronously.

Some tasks:

*   Take too long
*   Are non-critical
*   Should not block user response

That is where message brokers are used.

* * *

Synchronous vs Asynchronous Processing[#](#synchronous-vs-asynchronous-processing)
----------------------------------------------------------------------------------

### Synchronous[#](#synchronous)

*   Client waits for response
*   Used for quick operations
*   Risk of timeouts for long tasks

### Asynchronous[#](#asynchronous)

*   Client gets immediate acknowledgement
*   Task processed in background
*   User notified later if needed

* * *

Why Message Brokers Are Used[#](#why-message-brokers-are-used)
--------------------------------------------------------------

Message brokers help with:

*   Decoupling services
*   Reliability
*   Retry mechanisms
*   Load buffering

Producer and consumer do not need to know about each other.

* * *

Message Broker Components[#](#message-broker-components)
--------------------------------------------------------

Role

Description

Producer

Sends messages

Broker

Stores messages

Consumer

Processes messages

* * *

Types of Message Brokers[#](#types-of-message-brokers)
------------------------------------------------------

There are two major types:

1.  Message Queues
2.  Message Streams

![Message Queue vs Stream.avif](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/Message_Queue_vs_Stream_36bd8af61e.avif)

They solve different problems.

* * *

Message Queue[#](#message-queue)
--------------------------------

In a message queue:

*   One message is processed by one consumer
*   Message is deleted after processing

Examples:

*   RabbitMQ
*   AWS SQS

* * *

When to Use Message Queues[#](#when-to-use-message-queues)
----------------------------------------------------------

Use message queues when:

*   One consumer should handle a task
*   Task must not be duplicated
*   Order matters less

Examples:

*   Email sending
*   PDF generation
*   Image resizing

* * *

Message Stream[#](#message-stream)
----------------------------------

In a message stream:

*   One message can be consumed by many consumers
*   Messages are not deleted immediately
*   Consumers track their own progress

Examples:

*   Apache Kafka
*   AWS Kinesis

* * *

When to Use Message Streams[#](#when-to-use-message-streams)
------------------------------------------------------------

Use message streams when:

*   Same event must trigger multiple actions
*   High throughput is required
*   Event history is valuable

Examples:

*   Activity logs
*   Analytics
*   Event sourcing

* * *

Apache Kafka Overview[#](#apache-kafka-overview)
------------------------------------------------

Kafka is a distributed message streaming platform.

It is designed for:

*   High throughput
*   Fault tolerance
*   Scalability

Kafka can handle millions of messages per second.

* * *

Kafka Core Concepts[#](#kafka-core-concepts)
--------------------------------------------

Concept

Meaning

Producer

Sends messages

Consumer

Reads messages

Broker

Kafka server

Topic

Message category

Partition

Subdivision of topic

![Kafka Topics & Consumer Groups.avif](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/Kafka_Topics_and_Consumer_Groups_cdab8f6af9.avif)

* * *

Kafka Topics and Partitions[#](#kafka-topics-and-partitions)
------------------------------------------------------------

Topics are split into partitions.

Partitions allow:

*   Parallel processing
*   Horizontal scaling

Each partition:

*   Is ordered
*   Can be processed by only one consumer per group

* * *

Consumer Groups[#](#consumer-groups)
------------------------------------

Consumers belong to groups.

Rules:

*   One partition assigned to one consumer per group
*   Multiple groups can read same topic
*   Enables parallelism

* * *

Kafka Rebalancing[#](#kafka-rebalancing)
----------------------------------------

When:

*   Consumer joins
*   Consumer leaves
*   Partition count changes

Kafka automatically reassigns partitions. No manual intervention required.

* * *

Kafka Use Case Example[#](#kafka-use-case-example)
--------------------------------------------------

Assume:

*   Ride-sharing app
*   Driver location updated every 2 seconds

Instead of writing directly to database:

*   Write updates to Kafka
*   Batch write to database later

This reduces database load drastically.

* * *

Realtime PubSub[#](#realtime-pubsub)
------------------------------------

PubSub stands for Publish Subscribe.

In PubSub:

*   Messages are pushed immediately
*   No storage by default
*   Real-time delivery

* * *

PubSub vs Message Broker[#](#pubsub-vs-message-broker)
------------------------------------------------------

Feature

Message Broker

PubSub

Storage

Yes

No

Delivery

Pull based

Push based

Latency

Medium

Very low

Use Case

Background jobs

Realtime updates

* * *

Redis PubSub[#](#redis-pubsub)
------------------------------

Redis supports PubSub.

Used for:

*   Realtime chat
*   Notifications
*   Live updates

* * *

PubSub Example[#](#pubsub-example)
----------------------------------

In a chat application:

*   Clients connected to different servers
*   Messages published to Redis channel
*   All subscribed servers receive message
*   Servers forward message to connected clients

This enables realtime communication across servers.

* * *

Limitations of PubSub[#](#limitations-of-pubsub)
------------------------------------------------

*   No message persistence
*   If consumer is offline, message is lost
*   Not suitable for critical workflows

PubSub is for speed, not reliability.

* * *

End of Part 4[#](#end-of-part-4)
--------------------------------

In this part, you learned:

*   Blob storage and S3
*   CDN concepts
*   Message brokers
*   Message queues vs streams
*   Kafka internals
*   Realtime PubSub

Next part will cover:

*   Event-driven architecture
*   Distributed systems
*   Leader election
*   Consistency deep dive
*   Consistent hashing
*   Data redundancy
*   Proxy
*   How to solve any system design problem

Event-Driven Architecture (EDA)[#](#event-driven-architecture-eda)
------------------------------------------------------------------

Event-driven architecture is a way of designing systems where:

*   Services react to events
*   Components are loosely coupled
*   Workflows are asynchronous by default

Instead of calling services directly, systems communicate by emitting events.

* * *

Why Do We Need Event-Driven Architecture?[#](#why-do-we-need-event-driven-architecture)
---------------------------------------------------------------------------------------

Consider an e-commerce application.

When an order is placed:

*   Order service creates the order
*   Payment service processes payment
*   Inventory service updates stock
*   Notification service sends confirmation
*   Analytics service records the event

If these are synchronous calls:

*   One failure breaks everything
*   Latency increases
*   Tight coupling forms

EDA solves this.

* * *

How EDA Works[#](#how-eda-works)
--------------------------------

1.  An event occurs
2.  Event is published to an event bus
3.  Multiple consumers listen to the event
4.  Each consumer reacts independently

The producer does not know who consumes the event.

* * *

Event Notification vs Event-Carried State[#](#event-notification-vs-event-carried-state)
----------------------------------------------------------------------------------------

### Event Notification[#](#event-notification)

Event contains minimal information.

Example: order\_created { order\_id }

Consumers fetch required data separately.

Pros:

*   Lightweight events

Cons:

*   Extra database calls

* * *

### Event-Carried State Transfer[#](#event-carried-state-transfer)

Event carries full data.

Example: order\_created { order\_id, user\_id, amount, items }

Pros:

*   No extra fetch required

Cons:

*   Larger events
*   Schema evolution complexity

* * *

Distributed Systems[#](#distributed-systems)
--------------------------------------------

A distributed system consists of:

*   Multiple nodes
*   Network communication
*   Shared responsibility

Distributed systems exist because:

*   One machine is not enough
*   We need fault tolerance
*   We want scalability

* * *

Problems in Distributed Systems[#](#problems-in-distributed-systems)
--------------------------------------------------------------------

Distributed systems introduce challenges:

*   Partial failures
*   Network latency
*   Clock synchronization
*   Data consistency

Designing distributed systems is about **handling failures gracefully**.

* * *

Leader Election[#](#leader-election)
------------------------------------

In many distributed systems:

*   One node must act as leader
*   Leader coordinates work
*   Followers execute tasks

Leader election decides:

*   Which node becomes leader
*   How leadership changes on failure

* * *

Why Leader Election Is Needed[#](#why-leader-election-is-needed)
----------------------------------------------------------------

Examples:

*   Distributed locks
*   Scheduled jobs
*   Master coordination
*   Metadata management

Without a leader:

*   Duplicate work
*   Conflicts
*   Inconsistent state

* * *

How Leader Election Works (High Level)[#](#how-leader-election-works-high-level)
--------------------------------------------------------------------------------

Common approaches:

*   Using distributed coordination systems
*   Heartbeats to detect failure
*   Automatic re-election

Popular tools:

*   ZooKeeper
*   etcd
*   Consul

When leader fails:

*   New leader is elected automatically
*   System recovers without downtime

* * *

Consistency Deep Dive[#](#consistency-deep-dive)
------------------------------------------------

Consistency defines how up-to-date data appears across nodes.

There are multiple consistency models.

* * *

Strong Consistency[#](#strong-consistency)
------------------------------------------

Strong consistency guarantees:

*   Reads always return latest write
*   No stale data

Used when correctness matters.

Examples:

*   Banking balances
*   Financial ledgers
*   Inventory counts for purchases

Trade-off:

*   Higher latency
*   Lower availability during failures

* * *

Eventual Consistency[#](#eventual-consistency)
----------------------------------------------

Eventual consistency guarantees:

*   Data will become consistent over time
*   Temporary inconsistency is allowed

Used when availability matters more.

Examples:

*   Social media likes
*   Feed updates
*   View counts

* * *

When to Choose Which[#](#when-to-choose-which)
----------------------------------------------

Use Case

Consistency Type

Payments

Strong

Orders

Strong

Social feeds

Eventual

Analytics

Eventual

* * *

Achieving Strong Consistency[#](#achieving-strong-consistency)
--------------------------------------------------------------

Common techniques:

*   Distributed locks
*   Synchronous replication
*   Two-phase commit
*   Leader-based writes

These approaches reduce availability but ensure correctness.

* * *

Achieving Eventual Consistency[#](#achieving-eventual-consistency)
------------------------------------------------------------------

Common techniques:

*   Asynchronous replication
*   Conflict resolution
*   Versioning
*   Last-write-wins strategy

Eventual consistency trades accuracy for speed and availability.

* * *

Consistent Hashing[#](#consistent-hashing)
------------------------------------------

Consistent hashing is used to:

*   Distribute data evenly
*   Reduce data movement when nodes change

Used in:

*   Caching systems
*   Load balancers
*   Distributed databases

* * *

Problem With Normal Hashing[#](#problem-with-normal-hashing)
------------------------------------------------------------

Normal hashing: hash(key) % number\_of\_nodes

When nodes change:

*   Almost all keys are remapped
*   Cache becomes useless

* * *

How Consistent Hashing Solves This[#](#how-consistent-hashing-solves-this)
--------------------------------------------------------------------------

*   Nodes placed on a hash ring
*   Keys mapped to nearest node clockwise
*   Only a small subset of keys move when nodes change

![Consistent Hashing Ring.avif](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/Consistent_Hashing_Ring_d0d019e13b.avif)

This makes scaling efficient.

* * *

Virtual Nodes[#](#virtual-nodes)
--------------------------------

To avoid uneven distribution:

*   Each physical node has multiple virtual nodes
*   Improves balance
*   Reduces hotspots

Most real implementations use virtual nodes.

* * *

Data Redundancy and Data Recovery[#](#data-redundancy-and-data-recovery)
------------------------------------------------------------------------

Failures are inevitable.

Disks fail. Servers crash. Regions go down.

Data redundancy protects against data loss.

* * *

Why Data Redundancy Is Needed[#](#why-data-redundancy-is-needed)
----------------------------------------------------------------

*   Hardware failure
*   Human error
*   Natural disasters
*   Software bugs

If data exists only in one place, it will be lost eventually.

* * *

Common Redundancy Techniques[#](#common-redundancy-techniques)
--------------------------------------------------------------

### Replication[#](#replication)

*   Multiple copies of data
*   Stored across nodes or regions

### Backups[#](#backups)

*   Periodic snapshots
*   Stored separately
*   Used for recovery

### Continuous Backup[#](#continuous-backup)

*   Near real-time replication
*   Minimal data loss

* * *

Recovery Strategies[#](#recovery-strategies)
--------------------------------------------

Strategy

Purpose

Point-in-time recovery

Restore to specific moment

Failover

Switch to replica

Disaster recovery

Region-level failure

Always test backups. Untested backups do not exist.

* * *

Proxy[#](#proxy)
----------------

A proxy acts as an intermediary between:

*   Client and server
*   Server and backend services

* * *

Forward Proxy[#](#forward-proxy)
--------------------------------

Used on client side.

Examples:

*   Corporate proxies
*   VPNs
*   Content filtering

Client knows proxy exists.

* * *

Reverse Proxy[#](#reverse-proxy)
--------------------------------

Used on server side.

Examples:

*   Nginx
*   HAProxy
*   Cloudflare

Client does not know backend servers.

* * *

Why Reverse Proxies Are Used[#](#why-reverse-proxies-are-used)
--------------------------------------------------------------

*   Load balancing
*   Security
*   SSL termination
*   Caching
*   Request routing

Reverse proxies are foundational in modern architectures.

* * *

How to Solve Any System Design Problem[#](#how-to-solve-any-system-design-problem)
----------------------------------------------------------------------------------

This is the most important section.

* * *

Step 1: Clarify Requirements[#](#step-1-clarify-requirements)
-------------------------------------------------------------

Ask questions:

*   Scale
*   Read vs write ratio
*   Latency expectations
*   Consistency needs

Never assume.

* * *

Step 2: Estimate Scale[#](#step-2-estimate-scale)
-------------------------------------------------

*   Users
*   Requests per second
*   Storage growth

Use back-of-the-envelope estimation.

* * *

Step 3: High-Level Design[#](#step-3-high-level-design)
-------------------------------------------------------

*   Clients
*   APIs
*   Databases
*   Caches
*   Message brokers

Draw boxes first, not tables.

* * *

Step 4: Identify Bottlenecks[#](#step-4-identify-bottlenecks)
-------------------------------------------------------------

Ask:

*   What fails first?
*   What does not scale?
*   What is expensive?

* * *

Step 5: Apply Scaling Techniques[#](#step-5-apply-scaling-techniques)
---------------------------------------------------------------------

*   Caching
*   Replication
*   Sharding
*   Load balancing
*   Async processing

* * *

Step 6: Discuss Trade-offs[#](#step-6-discuss-trade-offs)
---------------------------------------------------------

Every design has trade-offs.

Talk about:

*   Consistency vs availability
*   Cost vs performance
*   Simplicity vs scalability

Interviewers care about reasoning, not perfection.

![System Design Interview Framework.avif](https://cs-prod-assets-bucket.s3.ap-south-1.amazonaws.com/System_Design_Interview_Framework_c9d8a5aa28.avif)

* * *

Final Thoughts[#](#final-thoughts)
----------------------------------

System design is not about drawing fancy diagrams.

It is about:

*   Thinking clearly
*   Making reasonable trade-offs
*   Designing for failure
*   Keeping systems simple

Everyone learns system design by building systems that break.

Build. Observe. Fix. Repeat.

#### Want to Master Spring Boot and Land Your Dream Job?

Struggling with coding interviews? Learn Data Structures & Algorithms (DSA) with our expert-led course. Build strong problem-solving skills, write optimized code, and crack top tech interviews with ease

[Learn more](/courses/java-spring-boot-0-to-100/)

system design

system design interview

distributed systems

scalability

microservices

load balancer

caching

Redis

Apache Kafka

CAP theorem

database sharding

CDN

API gateway

horizontal scaling

vertical scaling

auto scaling