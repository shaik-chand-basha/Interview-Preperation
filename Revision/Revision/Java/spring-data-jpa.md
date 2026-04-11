<div class="cm bd fw fx fy fz">
    <div>
        <h1 id="f140"
            class="pw-post-title gp gq gr bb gs gt gu gv gw gx gy gz ha hb hc hd he hf hg hh hi hj hk hl hm hn ho hp hq hr bg"
            data-testid="storyTitle" data-selectable-paragraph="">Important JPA Interview Questions: A Detailed Guide
        </h1>
       
    </div>
    
    <p id="0130"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Java Persistence API (JPA) is a specification for object-relational mapping (ORM)
        in Java, providing a framework for managing relational data in Java applications. JPA abstracts the complexities
        of interacting with a database, allowing developers to focus on business logic. If you’re preparing for an
        interview involving JPA, understanding the following key concepts and questions can help you demonstrate your
        expertise.</p>
    <p id="617f"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">1. What is JPA?</strong><br>Answer:<br>JPA (Java Persistence
        API) is a specification for managing relational data in Java applications. It provides an abstraction over
        various ORM tools like Hibernate, EclipseLink, and OpenJPA. JPA allows developers to map Java objects to
        database tables and perform CRUD operations without writing SQL code directly.</p>
    <p id="dda4"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="fd34" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph=""><span class="hljs-variable">@Entity</span><br>public class Employee {<br> <span class="hljs-variable">@Id</span><br> <span class="hljs-variable">@GeneratedValue</span>(strategy = GenerationType.IDENTITY)<br> private Long id;<br><br> <span class="hljs-selector-tag">private</span> <span class="hljs-selector-tag">String</span> <span class="hljs-selector-tag">name</span>;<br> <span class="hljs-selector-tag">private</span> <span class="hljs-selector-tag">String</span> <span class="hljs-selector-tag">department</span>;<br><br><span class="hljs-comment">// Getters and setters</span><br><br>}</span></pre>
    <p id="7546"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">2. What are the main components of JPA?</strong><br>Answer:
    </p>
    <figure class="nj nk nl nm nn mj mb mc paragraph-image">
        <div class="mb mc ny">
            <picture>
                <source
                    srcset="https://miro.medium.com/v2/resize:fit:640/format:webp/1*657iyqAb-vkpykLESSDTrA.png 640w, https://miro.medium.com/v2/resize:fit:720/format:webp/1*657iyqAb-vkpykLESSDTrA.png 720w, https://miro.medium.com/v2/resize:fit:750/format:webp/1*657iyqAb-vkpykLESSDTrA.png 750w, https://miro.medium.com/v2/resize:fit:786/format:webp/1*657iyqAb-vkpykLESSDTrA.png 786w, https://miro.medium.com/v2/resize:fit:828/format:webp/1*657iyqAb-vkpykLESSDTrA.png 828w, https://miro.medium.com/v2/resize:fit:1100/format:webp/1*657iyqAb-vkpykLESSDTrA.png 1100w, https://miro.medium.com/v2/resize:fit:1156/format:webp/1*657iyqAb-vkpykLESSDTrA.png 1156w"
                    sizes="(min-resolution: 4dppx) and (max-width: 700px) 50vw, (-webkit-min-device-pixel-ratio: 4) and (max-width: 700px) 50vw, (min-resolution: 3dppx) and (max-width: 700px) 67vw, (-webkit-min-device-pixel-ratio: 3) and (max-width: 700px) 65vw, (min-resolution: 2.5dppx) and (max-width: 700px) 80vw, (-webkit-min-device-pixel-ratio: 2.5) and (max-width: 700px) 80vw, (min-resolution: 2dppx) and (max-width: 700px) 100vw, (-webkit-min-device-pixel-ratio: 2) and (max-width: 700px) 100vw, 578px"
                    type="image/webp">
                <source data-testid="og"
                    srcset="https://miro.medium.com/v2/resize:fit:640/1*657iyqAb-vkpykLESSDTrA.png 640w, https://miro.medium.com/v2/resize:fit:720/1*657iyqAb-vkpykLESSDTrA.png 720w, https://miro.medium.com/v2/resize:fit:750/1*657iyqAb-vkpykLESSDTrA.png 750w, https://miro.medium.com/v2/resize:fit:786/1*657iyqAb-vkpykLESSDTrA.png 786w, https://miro.medium.com/v2/resize:fit:828/1*657iyqAb-vkpykLESSDTrA.png 828w, https://miro.medium.com/v2/resize:fit:1100/1*657iyqAb-vkpykLESSDTrA.png 1100w, https://miro.medium.com/v2/resize:fit:1156/1*657iyqAb-vkpykLESSDTrA.png 1156w"
                    sizes="(min-resolution: 4dppx) and (max-width: 700px) 50vw, (-webkit-min-device-pixel-ratio: 4) and (max-width: 700px) 50vw, (min-resolution: 3dppx) and (max-width: 700px) 67vw, (-webkit-min-device-pixel-ratio: 3) and (max-width: 700px) 65vw, (min-resolution: 2.5dppx) and (max-width: 700px) 80vw, (-webkit-min-device-pixel-ratio: 2.5) and (max-width: 700px) 80vw, (min-resolution: 2dppx) and (max-width: 700px) 100vw, (-webkit-min-device-pixel-ratio: 2) and (max-width: 700px) 100vw, 578px">
                <img alt="" class="bd ll mk c" width="578" height="413" loading="lazy" role="presentation"
                    src="https://miro.medium.com/v2/resize:fit:723/1*657iyqAb-vkpykLESSDTrA.png">
            </picture>
        </div>
    </figure>
    <p id="ddcb"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">The main components of JPA include:<br>- Entity: A lightweight, persistent domain
        object.<br>- EntityManager: Manages lifecycle operations on entities.<br>- EntityManagerFactory: Factory for
        creating `EntityManager` instances.<br>- Persistence Unit: Defines all entity classes managed by an
        `EntityManager`.<br>- EntityTransaction: Manages transaction boundaries.<br>- Query: Interface for executing
        database queries.</p>
    <p id="b4b5"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="78d9" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph=""><span class="hljs-type">EntityManagerFactory</span> <span class="hljs-variable">emf</span> <span class="hljs-operator">=</span> Persistence.createEntityManagerFactory(<span class="hljs-string">"my-persistence-unit"</span>);<br><span class="hljs-type">EntityManager</span> <span class="hljs-variable">em</span> <span class="hljs-operator">=</span> emf.createEntityManager();</span></pre>
    <p id="7735"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">3. What is an Entity in JPA?</strong><br>Answer:<br>An entity
        in JPA is a lightweight, persistent domain object that represents a table in a relational database. Each entity
        instance corresponds to a row in the table. Entities are annotated with `<a class="z nz"
            href="http://twitter.com/Entity" rel="noopener ugc nofollow" target="_blank">@Entity</a>` and have a primary
        key field annotated with `<a class="z nz" href="http://twitter.com/Id" rel="noopener ugc nofollow"
            target="_blank">@Id</a>`.</p>
    <p id="e9b5"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="59c0" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph=""><span class="hljs-variable">@Entity</span><br>public class Product {<br> <span class="hljs-variable">@Id</span><br> <span class="hljs-variable">@GeneratedValue</span>(strategy = GenerationType.IDENTITY)<br> private Long id;<br><br> <span class="hljs-selector-tag">private</span> <span class="hljs-selector-tag">String</span> <span class="hljs-selector-tag">name</span>;<br> <span class="hljs-selector-tag">private</span> <span class="hljs-selector-tag">Double</span> <span class="hljs-selector-tag">price</span>;<br><span class="hljs-comment">// Getters and setters</span><br>}</span></pre>
    <p id="cfc4"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">4. What is the difference between `EntityManager` and
            `EntityManagerFactory`?<br></strong>Answer:<br>- EntityManagerFactory: A factory for creating
        `EntityManager` instances. It is thread-safe and expensive to create, so it should be created once per
        application and reused.<br>- EntityManager: Manages the lifecycle of entity instances, performs CRUD operations,
        and executes queries. It is not thread-safe and should be used per transaction or per request.</p>
    <p id="de64"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="f38f" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph=""><span class="hljs-type">EntityManagerFactory</span> <span class="hljs-variable">emf</span> <span class="hljs-operator">=</span> Persistence.createEntityManagerFactory(<span class="hljs-string">"my-persistence-unit"</span>);<br><span class="hljs-type">EntityManager</span> <span class="hljs-variable">em</span> <span class="hljs-operator">=</span> emf.createEntityManager();</span></pre>
    <p id="d0be"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">5. Explain the concept of `Persistence
            Unit`.</strong><br>Answer:<br>A persistence unit is a logical grouping of related entity classes and their
        configurations, defined in the `persistence.xml` file. It specifies which entity classes are managed by an
        `EntityManager` and includes database connection details.</p>
    <p id="eb3c"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example: `persistence.xml`</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="38d9" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph=""><span class="hljs-tag">&lt;<span class="hljs-name">persistence</span> <span class="hljs-attr">xmlns</span>=<span class="hljs-string">"http://xmlns.jcp.org/xml/ns/persistence"</span> <span class="hljs-attr">version</span>=<span class="hljs-string">"2.1"</span>&gt;</span><br> <span class="hljs-tag">&lt;<span class="hljs-name">persistence-unit</span> <span class="hljs-attr">name</span>=<span class="hljs-string">"my-persistence-unit"</span>&gt;</span><br> <span class="hljs-tag">&lt;<span class="hljs-name">class</span>&gt;</span>com.example.Product<span class="hljs-tag">&lt;/<span class="hljs-name">class</span>&gt;</span><br>   <span class="hljs-tag">&lt;<span class="hljs-name">properties</span>&gt;</span><br>   <span class="hljs-tag">&lt;<span class="hljs-name">property</span> <span class="hljs-attr">name</span>=<span class="hljs-string">"javax.persistence.jdbc.url"</span> <span class="hljs-attr">value</span>=<span class="hljs-string">"jdbc:h2:mem:test"</span>/&gt;</span><br>   <span class="hljs-tag">&lt;<span class="hljs-name">property</span> <span class="hljs-attr">name</span>=<span class="hljs-string">"javax.persistence.jdbc.user"</span> <span class="hljs-attr">value</span>=<span class="hljs-string">"sa"</span>/&gt;</span><br>   <span class="hljs-tag">&lt;<span class="hljs-name">property</span> <span class="hljs-attr">name</span>=<span class="hljs-string">"javax.persistence.jdbc.driver"</span> <span class="hljs-attr">value</span>=<span class="hljs-string">"org.h2.Driver"</span>/&gt;</span><br>   <span class="hljs-tag">&lt;<span class="hljs-name">property</span> <span class="hljs-attr">name</span>=<span class="hljs-string">"javax.persistence.jdbc.password"</span> <span class="hljs-attr">value</span>=<span class="hljs-string">""</span>/&gt;</span><br>   <span class="hljs-tag">&lt;<span class="hljs-name">property</span> <span class="hljs-attr">name</span>=<span class="hljs-string">"hibernate.dialect"</span> <span class="hljs-attr">value</span>=<span class="hljs-string">"org.hibernate.dialect.H2Dialect"</span>/&gt;</span><br>   <span class="hljs-tag">&lt;/<span class="hljs-name">properties</span>&gt;</span><br> <span class="hljs-tag">&lt;/<span class="hljs-name">persistence-unit</span>&gt;</span><br><span class="hljs-tag">&lt;/<span class="hljs-name">persistence</span>&gt;</span></span></pre>
    <p id="5559"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">6. What is the purpose of `</strong><a class="z nz"
            href="http://twitter.com/Entity" rel="noopener ugc nofollow" target="_blank"><strong
                class="mn gs">@Entity</strong></a><strong class="mn gs">` annotation?</strong><br>Answer:<br>The `<a
            class="z nz" href="http://twitter.com/Entity" rel="noopener ugc nofollow" target="_blank">@Entity</a>`
        annotation marks a class as an entity, indicating that it should be mapped to a database table. It is mandatory
        for all entity classes.</p>
    <p id="990f"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="84b6" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph=""><span class="hljs-variable">@Entity</span><br>public class Customer {<br> <span class="hljs-variable">@Id</span><br> <span class="hljs-variable">@GeneratedValue</span>(strategy = GenerationType.IDENTITY)<br> private Long id;<br><br> <span class="hljs-selector-tag">private</span> <span class="hljs-selector-tag">String</span> <span class="hljs-selector-tag">firstName</span>;<br> <span class="hljs-selector-tag">private</span> <span class="hljs-selector-tag">String</span> <span class="hljs-selector-tag">lastName</span>;<br><br><span class="hljs-comment">// Getters and setters</span><br>}</span></pre>
    <p id="d055"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">7. What is `</strong><a class="z nz"
            href="http://twitter.com/Id" rel="noopener ugc nofollow" target="_blank"><strong
                class="mn gs">@Id</strong></a><strong class="mn gs">` and why is it
            important?</strong><br>Answer:<br>The `<a class="z nz" href="http://twitter.com/Id"
            rel="noopener ugc nofollow" target="_blank">@Id</a>` annotation specifies the primary key of an entity.
        Every entity must have a primary key, which uniquely identifies each record in the database.</p>
    <p id="0254"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="ee99" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph=""><span class="hljs-variable">@Entity</span><br>public class Order {<br> <span class="hljs-variable">@Id</span><br> <span class="hljs-variable">@GeneratedValue</span>(strategy = GenerationType.IDENTITY)<br> private Long orderId;<br><br> <span class="hljs-selector-tag">private</span> <span class="hljs-selector-tag">String</span> <span class="hljs-selector-tag">product</span>;<br> <span class="hljs-selector-tag">private</span> <span class="hljs-selector-tag">int</span> <span class="hljs-selector-tag">quantity</span>;<br><br><span class="hljs-comment">// Getters and setters</span><br>}</span></pre>
    <p id="187e"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">8. What is the difference between `</strong><a class="z nz"
            href="http://twitter.com/OneToOne" rel="noopener ugc nofollow" target="_blank"><strong
                class="mn gs">@OneToOne</strong></a><strong class="mn gs">`, `</strong><a class="z nz"
            href="http://twitter.com/OneToMany" rel="noopener ugc nofollow" target="_blank"><strong
                class="mn gs">@OneToMany</strong></a><strong class="mn gs">`, `</strong><a class="z nz"
            href="http://twitter.com/ManyToOne" rel="noopener ugc nofollow" target="_blank"><strong
                class="mn gs">@ManyToOne</strong></a><strong class="mn gs">`, and `</strong><a class="z nz"
            href="http://twitter.com/ManyToMany" rel="noopener ugc nofollow" target="_blank"><strong
                class="mn gs">@ManyToMany</strong></a><strong class="mn gs">` annotations?<br></strong>Answer:<br>-
        @OneToOne: A relationship where one entity is associated with one other entity.<br>- @OneToMany: A relationship
        where one entity is associated with multiple instances of another entity.<br>- @ManyToOne: A relationship where
        multiple instances of an entity are associated with one instance of another entity.<br>- @ManyToMany: A
        relationship where multiple instances of one entity are associated with multiple instances of another entity.
    </p>
    <p id="05b9"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="a7fd" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph=""><span class="hljs-meta">@Entity</span><br><span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title.class">Author</span> {<br> <span class="hljs-meta">@Id</span><br> <span class="hljs-meta">@GeneratedValue(strategy = GenerationType.IDENTITY)</span><br> <span class="hljs-keyword">private</span> <span class="hljs-built_in">Long</span> id;<br><br> <span class="hljs-keyword">private</span> String name;<br><br> <span class="hljs-meta">@OneToMany(mappedBy = <span class="hljs-string">"author"</span>)</span><br> <span class="hljs-keyword">private</span> List&lt;Book&gt; books;<br><br><span class="hljs-comment">// Getters and setters</span><br>}<br><br><span class="hljs-meta">@Entity</span><br><span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title.class">Book</span> {<br> <span class="hljs-meta">@Id</span><br> <span class="hljs-meta">@GeneratedValue(strategy = GenerationType.IDENTITY)</span><br> <span class="hljs-keyword">private</span> <span class="hljs-built_in">Long</span> id;<br><br> <span class="hljs-keyword">private</span> String title;<br><br> <span class="hljs-meta">@ManyToOne</span><br> <span class="hljs-meta">@JoinColumn(name = <span class="hljs-string">"author_id"</span>)</span><br> <span class="hljs-keyword">private</span> Author author;<br><span class="hljs-comment">// Getters and setters</span><br>}</span></pre>
    <p id="a17a"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">9. How do you define a primary key generation strategy in
            JPA?</strong><br>Answer:<br>You define a primary key generation strategy using the `<a class="z nz"
            href="http://twitter.com/GeneratedValue" rel="noopener ugc nofollow" target="_blank">@GeneratedValue</a>`
        annotation, specifying one of the following strategies:<br>- `GenerationType.AUTO`<br>-
        `GenerationType.IDENTITY`<br>- `GenerationType.SEQUENCE`<br>- `GenerationType.TABLE`</p>
    <p id="775d"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">1. `GenerationType.AUTO`</strong></p>
    <p id="12ac"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">`GenerationType.AUTO` lets the persistence provider choose the appropriate
        generation strategy. The actual strategy used may depend on the database dialect and provider settings.</p>
    <div class="oa v">
        <div class="e"><a class="z ab ac fg af ag ah ai aj ak al am an ao ap v" rel="noopener follow"
                href="/write?source=promotion_paragraph---post_body_banner_home_for_stories_scribble--5c1405e0927b---------------------------------------"
                data-discover="true">
                <picture>
                    <source media="(max-width: 551.98px)"
                        srcset="https://miro.medium.com/v2/da:true/resize:fit:0/3a5056060d0e12a49f4886839cc1b04a9f339283ad768862dd3053c847f3e63d">
                    <source media="(min-width: 552px) and (max-width: 727.98px)"
                        srcset="https://miro.medium.com/v2/da:true/resize:fit:0/3a5056060d0e12a49f4886839cc1b04a9f339283ad768862dd3053c847f3e63d">
                    <source media="(min-width: 728px) and (max-width: 903.98px)"
                        srcset="https://miro.medium.com/v2/da:true/resize:fit:0/0a282e8385c2f908271621219fec60181ef042b94164af733ebb6b67235b51c0">
                    <source media="(min-width: 904px) and (max-width: 1079.98px)"
                        srcset="https://miro.medium.com/v2/da:true/resize:fit:0/0a282e8385c2f908271621219fec60181ef042b94164af733ebb6b67235b51c0">
                    <source media="(min-width: 1080px)"
                        srcset="https://miro.medium.com/v2/da:true/resize:fit:0/0a282e8385c2f908271621219fec60181ef042b94164af733ebb6b67235b51c0">
                    <img alt="Write on Medium" class="bd" loading="lazy">
                </picture>
            </a></div>
    </div>
    <p id="2e3c" class="pw-post-body-paragraph ml mm gr mn b mo mq mr ms mu mv mw my mz na nc nd ne ng nh oa ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="281c" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph=""><span class="hljs-selector-tag">import</span> <span class="hljs-selector-tag">javax</span><span class="hljs-selector-class">.persistence</span>.*;<br>@<span class="hljs-selector-tag">Entity</span><br><span class="hljs-selector-tag">public</span> <span class="hljs-selector-tag">class</span> <span class="hljs-selector-tag">AutoGeneratedEntity</span> {<br> <span class="hljs-variable">@Id</span><br> <span class="hljs-variable">@GeneratedValue</span>(strategy = GenerationType.AUTO)<br> private Long id;<br><span class="hljs-selector-tag">private</span> <span class="hljs-selector-tag">String</span> <span class="hljs-selector-tag">name</span>;<br><span class="hljs-comment">// Getters and setters</span><br>}</span></pre>
    <p id="24ca"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">2. `GenerationType.IDENTITY`</strong></p>
    <p id="b792"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">`GenerationType.IDENTITY` relies on the database to automatically generate the
        primary key value using an identity column. This strategy is common in databases like MySQL, PostgreSQL, etc.
    </p>
    <p id="bffc"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="7f63" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph=""><span class="hljs-selector-tag">import</span> <span class="hljs-selector-tag">javax</span><span class="hljs-selector-class">.persistence</span>.*;<br><br>@<span class="hljs-selector-tag">Entity</span><br><span class="hljs-selector-tag">public</span> <span class="hljs-selector-tag">class</span> <span class="hljs-selector-tag">IdentityGeneratedEntity</span> {<br> <span class="hljs-variable">@Id</span><br> <span class="hljs-variable">@GeneratedValue</span>(strategy = GenerationType.IDENTITY)<br> private Long id;<br> <span class="hljs-selector-tag">private</span> <span class="hljs-selector-tag">String</span> <span class="hljs-selector-tag">name</span>;<br><span class="hljs-comment">// Getters and setters</span><br>}</span></pre>
    <p id="bedd"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">3. `GenerationType.SEQUENCE`</strong></p>
    <p id="5864"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">`GenerationType.SEQUENCE` uses a database sequence to generate unique primary key
        values. This strategy is commonly used in databases that support sequences, like Oracle, PostgreSQL, etc.</p>
    <p id="959e"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="32d2" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph=""><span class="hljs-keyword">import</span> javax.persistence.*;<br><span class="hljs-meta">@Entity</span><br><span class="hljs-meta">@SequenceGenerator(name = <span class="hljs-string">"sequence_generator"</span>, sequenceName = <span class="hljs-string">"entity_sequence"</span>, allocationSize = 1)</span><br><span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title.class">SequenceGeneratedEntity</span> {<br> <span class="hljs-meta">@Id</span><br> <span class="hljs-meta">@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = <span class="hljs-string">"sequence_generator"</span>)</span><br> <span class="hljs-keyword">private</span> <span class="hljs-built_in">Long</span> id;<br> <span class="hljs-keyword">private</span> String name;<br><span class="hljs-comment">// Getters and setters</span><br>}</span></pre>
    <p id="12b1"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">4. `GenerationType.TABLE`</strong></p>
    <p id="86a7"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">`GenerationType.TABLE` uses a database table to generate unique primary key values.
        This strategy is database-agnostic and can be used with any database, but it can be slower compared to other
        strategies.</p>
    <p id="4de3"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="68c3" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph=""><span class="hljs-keyword">import</span> javax.persistence.*;<br><span class="hljs-meta">@Entity</span><br><span class="hljs-meta">@TableGenerator(name = <span class="hljs-string">"table_generator"</span>, table = <span class="hljs-string">"id_generator"</span>, pkColumnName = <span class="hljs-string">"gen_name"</span>, valueColumnName = <span class="hljs-string">"gen_value"</span>, pkColumnValue = <span class="hljs-string">"entity_id"</span>, allocationSize = 1)</span><br><span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title.class">TableGeneratedEntity</span> {<br> <span class="hljs-meta">@Id</span><br> <span class="hljs-meta">@GeneratedValue(strategy = GenerationType.TABLE, generator = <span class="hljs-string">"table_generator"</span>)</span><br> <span class="hljs-keyword">private</span> <span class="hljs-built_in">Long</span> id;<br><span class="hljs-keyword">private</span> String name;<br><span class="hljs-comment">// Getters and setters</span><br>}</span></pre>
    <p id="ffaa"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Thus,</p>
    <p id="ff4e"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">- AUTO: Lets the persistence provider choose the generation strategy.<br>-
        IDENTITY: Relies on the database’s identity column for primary key generation.<br>- SEQUENCE: Uses a database
        sequence to generate primary keys.<br>- TABLE: Uses a dedicated database table to generate primary keys.</p>
    <p id="910b"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Each strategy has its use cases, and the choice depends on the specific
        requirements and capabilities of the database you are working with.</p>
    <p id="6461"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">10. What is the purpose of
            `EntityTransaction`?</strong><br>Answer:<br>The `EntityTransaction` interface manages transaction
        boundaries. It allows you to begin, commit, and rollback transactions to ensure data consistency and integrity.
    </p>
    <p id="2478"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="de86" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph=""><span class="hljs-type">EntityManager</span> <span class="hljs-variable">em</span> <span class="hljs-operator">=</span> emf.createEntityManager();<br><span class="hljs-type">EntityTransaction</span> <span class="hljs-variable">transaction</span> <span class="hljs-operator">=</span> em.getTransaction();<br><br><span class="hljs-keyword">try</span> {<br> transaction.begin();<br> <span class="hljs-type">Product</span> <span class="hljs-variable">product</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title.class">Product</span>();<br> product.setName(<span class="hljs-string">"Laptop"</span>);<br> product.setPrice(<span class="hljs-number">1200.00</span>);<br> em.persist(product);<br> transaction.commit();<br>} <span class="hljs-keyword">catch</span> (Exception e) {<br> <span class="hljs-keyword">if</span> (transaction.isActive()) {<br> transaction.rollback();<br> }<br> e.printStackTrace();<br>} <span class="hljs-keyword">finally</span> {<br> em.close();<br>}</span></pre>
    <p id="2eeb"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">11. What is JPQL?</strong><br>Answer:<br>JPQL (Java
        Persistence Query Language) is a query language for JPA, similar to SQL but operates on entity objects rather
        than database tables. It allows querying of entities using an object-oriented syntax.</p>
    <p id="208c"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="48ca" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph="">EntityManager em = emf.createEntityManager();<br>TypedQuery&lt;Product&gt; query = em.createQuery(<span class="hljs-string">"SELECT p FROM Product p WHERE p.price &gt; :price"</span>, Product.<span class="hljs-keyword">class</span>);<br>query.setParameter(<span class="hljs-string">"price"</span>, <span class="hljs-number">1000.00</span>);<br>List&lt;Product&gt; products = query.getResultList();<br><span class="hljs-keyword">for</span> (Product product : products) {<br> System.<span class="hljs-keyword">out</span>.println(product.getName());<br>}<br>em.close();</span></pre>
    <p id="7054"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">12. How do you handle exceptions in
            JPA?</strong><br>Answer:<br>In JPA, exceptions are handled using `try-catch` blocks. The
        `javax.persistence.PersistenceException` is the base class for all JPA-related exceptions.</p>
    <p id="3db5"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="2baf" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph=""><span class="hljs-type">EntityManager</span> <span class="hljs-variable">em</span> <span class="hljs-operator">=</span> emf.createEntityManager();<br><span class="hljs-type">EntityTransaction</span> <span class="hljs-variable">transaction</span> <span class="hljs-operator">=</span> em.getTransaction();<br><br><span class="hljs-keyword">try</span> {<br> transaction.begin();<br> <span class="hljs-type">Product</span> <span class="hljs-variable">product</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title.class">Product</span>();<br> product.setName(<span class="hljs-string">"Smartphone"</span>);<br> product.setPrice(<span class="hljs-number">800.00</span>);<br> em.persist(product);<br> transaction.commit();<br>} <span class="hljs-keyword">catch</span> (PersistenceException e) {<br> <span class="hljs-keyword">if</span> (transaction.isActive()) {<br> transaction.rollback();<br> }<br> e.printStackTrace();<br>} <span class="hljs-keyword">finally</span> {<br> em.close();<br>}</span></pre>
    <p id="575e"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph=""><strong class="mn gs">13. What is the `Criteria API`?</strong><br>Answer:<br>The
        `Criteria API` is an alternative to JPQL for creating queries in a programmatic and type-safe manner. It uses a
        fluent API to construct queries dynamically.</p>
    <p id="2a4d"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Example:</p>
    <pre
        class="nj nk nl nm nn no np nq bl nr ax bg"><span id="ce9b" class="ns nt gr np b bc nu nv e nw nx" data-selectable-paragraph="">EntityManager em = emf.createEntityManager();<br>CriteriaBuilder cb = em.getCriteriaBuilder();<br><br>CriteriaQuery&lt;Product&gt; cq = cb.createQuery(Product.<span class="hljs-keyword">class</span>);<br><br>Root&lt;Product&gt; product = cq.<span class="hljs-keyword">from</span>(Product.<span class="hljs-keyword">class</span>);<br><br>cq.<span class="hljs-keyword">select</span>(product).<span class="hljs-keyword">where</span>(cb.gt(product.<span class="hljs-keyword">get</span>(<span class="hljs-string">"price"</span>), <span class="hljs-number">1000.00</span>));<br>TypedQuery&lt;Product&gt; query = em.createQuery(cq);<br>List&lt;Product&gt; products = query.getResultList();<br><span class="hljs-keyword">for</span> (Product p : products) {<br> System.<span class="hljs-keyword">out</span>.println(p.getName());<br>}<br>em.close();<br></span></pre>
    <h3 id="bfe4" class="ob nt gr bb oc od oe of og oh oi oj ok mw ol om on na oo op oq ne or os ot ou bg"
        data-selectable-paragraph="">Conclusion</h3>
    <p id="649d"
        class="pw-post-body-paragraph ml mm gr mn b mo ov mq mr ms ow mu mv mw ox my mz na oy nc nd ne oz ng nh ni gk bg"
        data-selectable-paragraph="">Understanding these core JPA concepts and questions can help you excel in
        interviews and demonstrate your knowledge of JPA. Mastery of JPA is crucial for developing robust and scalable
        Java applications that interact with databases efficiently. Make sure to practice these concepts and explore
        further to deepen your understanding.</p>
    <p id="4836"
        class="pw-post-body-paragraph ml mm gr mn b mo mp mq mr ms mt mu mv mw mx my mz na nb nc nd ne nf ng nh ni gk bg"
        data-selectable-paragraph="">Thank you for taking the time to read this article! If you found it helpful and
        enjoyed the content, please consider giving it applause on Medium. Your support and encouragement mean a lot and
        will motivate me to continue writing and sharing more valuable insights in the future. Thank you!</p>
</div>