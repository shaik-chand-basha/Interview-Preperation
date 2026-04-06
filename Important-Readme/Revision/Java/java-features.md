<div class="crayons-article__main ">
            <div class="crayons-article__body text-styles spec__body" data-article-id="2913894" id="article-body">
                <h2>
  <a name="introduction" href="#introduction">
  </a>
  Introduction
</h2>

<p>Java has undergone tremendous evolution since Java 8, transforming from a verbose, traditional language into a modern, expressive platform. This comprehensive guide explores every major feature introduced across all versions from Java 8 to Java 25.</p>


<hr>

<h2>
  <a name="java-8-march-2014-lts" href="#java-8-march-2014-lts">
  </a>
  Java 8 (March 2014) - LTS
</h2>

<p>Java 8 was revolutionary, introducing functional programming concepts that changed how developers write Java code.</p>

<h3>
  <a name="lambda-expressions" href="#lambda-expressions">
  </a>
  Lambda Expressions
</h3>

<p>The most significant addition, enabling functional-style programming:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Before Java 8</span>
<span class="nc">List</span><span class="o">&lt;</span><span class="nc">String</span><span class="o">&gt;</span> <span class="n">names</span> <span class="o">=</span> <span class="nc">Arrays</span><span class="o">.</span><span class="na">asList</span><span class="o">(</span><span class="s">"John"</span><span class="o">,</span> <span class="s">"Jane"</span><span class="o">,</span> <span class="s">"Bob"</span><span class="o">);</span>
<span class="nc">Collections</span><span class="o">.</span><span class="na">sort</span><span class="o">(</span><span class="n">names</span><span class="o">,</span> <span class="k">new</span> <span class="nc">Comparator</span><span class="o">&lt;</span><span class="nc">String</span><span class="o">&gt;()</span> <span class="o">{</span>
    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">compare</span><span class="o">(</span><span class="nc">String</span> <span class="n">a</span><span class="o">,</span> <span class="nc">String</span> <span class="n">b</span><span class="o">)</span> <span class="o">{</span>
        <span class="k">return</span> <span class="n">a</span><span class="o">.</span><span class="na">compareTo</span><span class="o">(</span><span class="n">b</span><span class="o">);</span>
    <span class="o">}</span>
<span class="o">});</span>

<span class="c1">// Java 8 with Lambda</span>
<span class="nc">Collections</span><span class="o">.</span><span class="na">sort</span><span class="o">(</span><span class="n">names</span><span class="o">,</span> <span class="o">(</span><span class="n">a</span><span class="o">,</span> <span class="n">b</span><span class="o">)</span> <span class="o">-&gt;</span> <span class="n">a</span><span class="o">.</span><span class="na">compareTo</span><span class="o">(</span><span class="n">b</span><span class="o">));</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="stream-api" href="#stream-api">
  </a>
  Stream API
</h3>

<p>Process collections declaratively with powerful operations:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">List</span><span class="o">&lt;</span><span class="nc">Integer</span><span class="o">&gt;</span> <span class="n">numbers</span> <span class="o">=</span> <span class="nc">Arrays</span><span class="o">.</span><span class="na">asList</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="mi">2</span><span class="o">,</span> <span class="mi">3</span><span class="o">,</span> <span class="mi">4</span><span class="o">,</span> <span class="mi">5</span><span class="o">,</span> <span class="mi">6</span><span class="o">);</span>
<span class="kt">int</span> <span class="n">sum</span> <span class="o">=</span> <span class="n">numbers</span><span class="o">.</span><span class="na">stream</span><span class="o">()</span>
    <span class="o">.</span><span class="na">filter</span><span class="o">(</span><span class="n">n</span> <span class="o">-&gt;</span> <span class="n">n</span> <span class="o">%</span> <span class="mi">2</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span>
    <span class="o">.</span><span class="na">mapToInt</span><span class="o">(</span><span class="nl">Integer:</span><span class="o">:</span><span class="n">intValue</span><span class="o">)</span>
    <span class="o">.</span><span class="na">sum</span><span class="o">();</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="functional-interfaces" href="#functional-interfaces">
  </a>
  Functional Interfaces
</h3>

<p>Single abstract method interfaces that enable lambdas:</p>

<ul>
<li>
<code>Function&lt;T,R&gt;</code> - transforms input to output</li>
<li>
<code>Predicate&lt;T&gt;</code> - tests conditions</li>
<li>
<code>Consumer&lt;T&gt;</code> - performs operations without return</li>
<li>
<code>Supplier&lt;T&gt;</code> - supplies values</li>
</ul>

<h3>
  <a name="method-references" href="#method-references">
  </a>
  Method References
</h3>

<p>Simplified lambda syntax for existing methods:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Lambda</span>
<span class="n">names</span><span class="o">.</span><span class="na">forEach</span><span class="o">(</span><span class="n">name</span> <span class="o">-&gt;</span> <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="n">name</span><span class="o">));</span>

<span class="c1">// Method reference</span>
<span class="n">names</span><span class="o">.</span><span class="na">forEach</span><span class="o">(</span><span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">::</span><span class="n">println</span><span class="o">);</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="default-methods-in-interfaces" href="#default-methods-in-interfaces">
  </a>
  Default Methods in Interfaces
</h3>

<p>Add methods to interfaces without breaking implementations:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kd">interface</span> <span class="nc">Vehicle</span> <span class="o">{</span>
    <span class="k">default</span> <span class="kt">void</span> <span class="nf">start</span><span class="o">()</span> <span class="o">{</span>
        <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"Starting vehicle..."</span><span class="o">);</span>
    <span class="o">}</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="optional-class" href="#optional-class">
  </a>
  Optional Class
</h3>

<p>Eliminate null pointer exceptions:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">Optional</span><span class="o">&lt;</span><span class="nc">String</span><span class="o">&gt;</span> <span class="n">optional</span> <span class="o">=</span> <span class="nc">Optional</span><span class="o">.</span><span class="na">ofNullable</span><span class="o">(</span><span class="n">getValue</span><span class="o">());</span>
<span class="nc">String</span> <span class="n">result</span> <span class="o">=</span> <span class="n">optional</span><span class="o">.</span><span class="na">orElse</span><span class="o">(</span><span class="s">"default"</span><span class="o">);</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="new-date-and-time-api-javatime" href="#new-date-and-time-api-javatime">
  </a>
  New Date and Time API (java.time)
</h3>

<p>Based on Joda-Time, providing immutable date/time classes:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">LocalDate</span> <span class="n">date</span> <span class="o">=</span> <span class="nc">LocalDate</span><span class="o">.</span><span class="na">now</span><span class="o">();</span>
<span class="nc">LocalDateTime</span> <span class="n">dateTime</span> <span class="o">=</span> <span class="nc">LocalDateTime</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="mi">2024</span><span class="o">,</span> <span class="mi">3</span><span class="o">,</span> <span class="mi">15</span><span class="o">,</span> <span class="mi">10</span><span class="o">,</span> <span class="mi">30</span><span class="o">);</span>
<span class="nc">ZonedDateTime</span> <span class="n">zoned</span> <span class="o">=</span> <span class="nc">ZonedDateTime</span><span class="o">.</span><span class="na">now</span><span class="o">(</span><span class="nc">ZoneId</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="s">"America/New_York"</span><span class="o">));</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="nashorn-javascript-engine" href="#nashorn-javascript-engine">
  </a>
  Nashorn JavaScript Engine
</h3>

<p>Run JavaScript code from Java (deprecated in Java 11).</p>


<hr>

<h2>
  <a name="java-9-september-2017" href="#java-9-september-2017">
  </a>
  Java 9 (September 2017)
</h2>

<h3>
  <a name="module-system-project-jigsaw" href="#module-system-project-jigsaw">
  </a>
  Module System (Project Jigsaw)
</h3>

<p>Revolutionized application structure with modules:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// module-info.java</span>
<span class="n">module</span> <span class="n">com</span><span class="o">.</span><span class="na">example</span><span class="o">.</span><span class="na">myapp</span> <span class="o">{</span>
    <span class="n">requires</span> <span class="n">java</span><span class="o">.</span><span class="na">sql</span><span class="o">;</span>
    <span class="n">exports</span> <span class="n">com</span><span class="o">.</span><span class="na">example</span><span class="o">.</span><span class="na">myapp</span><span class="o">.</span><span class="na">api</span><span class="o">;</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="jshell-repl" href="#jshell-repl">
  </a>
  JShell (REPL)
</h3>

<p>Interactive Java shell for experimentation:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight shell"><code>jshell&gt; int x <span class="o">=</span> 10
x <span class="o">==&gt;</span> 10
jshell&gt; x <span class="k">*</span> 2
<span class="nv">$2</span> <span class="o">==&gt;</span> 20
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="factory-methods-for-collections" href="#factory-methods-for-collections">
  </a>
  Factory Methods for Collections
</h3>

<p>Create immutable collections easily:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">List</span><span class="o">&lt;</span><span class="nc">String</span><span class="o">&gt;</span> <span class="n">list</span> <span class="o">=</span> <span class="nc">List</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="s">"a"</span><span class="o">,</span> <span class="s">"b"</span><span class="o">,</span> <span class="s">"c"</span><span class="o">);</span>
<span class="nc">Set</span><span class="o">&lt;</span><span class="nc">Integer</span><span class="o">&gt;</span> <span class="n">set</span> <span class="o">=</span> <span class="nc">Set</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="mi">2</span><span class="o">,</span> <span class="mi">3</span><span class="o">);</span>
<span class="nc">Map</span><span class="o">&lt;</span><span class="nc">String</span><span class="o">,</span> <span class="nc">Integer</span><span class="o">&gt;</span> <span class="n">map</span> <span class="o">=</span> <span class="nc">Map</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="s">"key1"</span><span class="o">,</span> <span class="mi">1</span><span class="o">,</span> <span class="s">"key2"</span><span class="o">,</span> <span class="mi">2</span><span class="o">);</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="private-methods-in-interfaces" href="#private-methods-in-interfaces">
  </a>
  Private Methods in Interfaces
</h3>

<p>Share code between default methods:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kd">interface</span> <span class="nc">MyInterface</span> <span class="o">{</span>
    <span class="k">default</span> <span class="kt">void</span> <span class="nf">method1</span><span class="o">()</span> <span class="o">{</span>
        <span class="n">commonLogic</span><span class="o">();</span>
    <span class="o">}</span>

    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">commonLogic</span><span class="o">()</span> <span class="o">{</span>
        <span class="c1">// Shared implementation</span>
    <span class="o">}</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="trywithresources-enhancement" href="#trywithresources-enhancement">
  </a>
  Try-With-Resources Enhancement
</h3>

<p>Use effectively final variables:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">BufferedReader</span> <span class="n">reader</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">BufferedReader</span><span class="o">(</span><span class="k">new</span> <span class="nc">FileReader</span><span class="o">(</span><span class="s">"file.txt"</span><span class="o">));</span>
<span class="k">try</span> <span class="o">(</span><span class="n">reader</span><span class="o">)</span> <span class="o">{</span>
    <span class="c1">// Use reader</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="stream-api-improvements" href="#stream-api-improvements">
  </a>
  Stream API Improvements
</h3>

<ul>
<li>
<code>takeWhile()</code> and <code>dropWhile()</code>
</li>
<li><code>ofNullable()</code></li>
<li>
<code>iterate()</code> with predicate</li>
</ul>

<h3>
  <a name="process-api-updates" href="#process-api-updates">
  </a>
  Process API Updates
</h3>

<p>Better control over OS processes.</p>

<h3>
  <a name="reactive-streams-flow-api" href="#reactive-streams-flow-api">
  </a>
  Reactive Streams (Flow API)
</h3>

<p>Foundation for reactive programming.</p>


<hr>

<h2>
  <a name="java-10-march-2018" href="#java-10-march-2018">
  </a>
  Java 10 (March 2018)
</h2>

<h3>
  <a name="local-variable-type-inference-var" href="#local-variable-type-inference-var">
  </a>
  Local Variable Type Inference (var)
</h3>

<p>Reduce verbosity without sacrificing type safety:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Before</span>
<span class="nc">Map</span><span class="o">&lt;</span><span class="nc">String</span><span class="o">,</span> <span class="nc">List</span><span class="o">&lt;</span><span class="nc">Integer</span><span class="o">&gt;&gt;</span> <span class="n">map</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">HashMap</span><span class="o">&lt;&gt;();</span>

<span class="c1">// Java 10</span>
<span class="kt">var</span> <span class="n">map</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">HashMap</span><span class="o">&lt;</span><span class="nc">String</span><span class="o">,</span> <span class="nc">List</span><span class="o">&lt;</span><span class="nc">Integer</span><span class="o">&gt;&gt;();</span>
<span class="kt">var</span> <span class="n">list</span> <span class="o">=</span> <span class="nc">List</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="mi">2</span><span class="o">,</span> <span class="mi">3</span><span class="o">);</span>
<span class="kt">var</span> <span class="n">stream</span> <span class="o">=</span> <span class="n">list</span><span class="o">.</span><span class="na">stream</span><span class="o">();</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="unmodifiable-collections" href="#unmodifiable-collections">
  </a>
  Unmodifiable Collections
</h3>

<p><code>copyOf()</code> methods create immutable copies:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">List</span><span class="o">&lt;</span><span class="nc">String</span><span class="o">&gt;</span> <span class="n">original</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">ArrayList</span><span class="o">&lt;&gt;();</span>
<span class="nc">List</span><span class="o">&lt;</span><span class="nc">String</span><span class="o">&gt;</span> <span class="n">copy</span> <span class="o">=</span> <span class="nc">List</span><span class="o">.</span><span class="na">copyOf</span><span class="o">(</span><span class="n">original</span><span class="o">);</span> <span class="c1">// Immutable</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="optionalorelsethrow" href="#optionalorelsethrow">
  </a>
  Optional.orElseThrow()
</h3>

<p>Cleaner way to throw exceptions:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">String</span> <span class="n">value</span> <span class="o">=</span> <span class="n">optional</span><span class="o">.</span><span class="na">orElseThrow</span><span class="o">();</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="application-classdata-sharing-appcds" href="#application-classdata-sharing-appcds">
  </a>
  Application Class-Data Sharing (AppCDS)
</h3>

<p>Improved startup time and memory footprint.</p>


<hr>

<h2>
  <a name="java-11-september-2018-lts" href="#java-11-september-2018-lts">
  </a>
  Java 11 (September 2018) - LTS
</h2>

<h3>
  <a name="new-string-methods" href="#new-string-methods">
  </a>
  New String Methods
</h3>

<p>Powerful string manipulation:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="s">" "</span><span class="o">.</span><span class="na">isBlank</span><span class="o">();</span>                    <span class="c1">// true</span>
<span class="s">" Hello "</span><span class="o">.</span><span class="na">strip</span><span class="o">();</span>                <span class="c1">// "Hello"</span>
<span class="s">"Line1\nLine2"</span><span class="o">.</span><span class="na">lines</span><span class="o">()</span>            <span class="c1">// Stream of lines</span>
<span class="s">"Java"</span><span class="o">.</span><span class="na">repeat</span><span class="o">(</span><span class="mi">3</span><span class="o">);</span>                 <span class="c1">// "JavaJavaJava"</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="local-variable-syntax-for-lambda-parameters" href="#local-variable-syntax-for-lambda-parameters">
  </a>
  Local Variable Syntax for Lambda Parameters
</h3>

<p>Use <code>var</code> in lambda expressions:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="o">(</span><span class="kt">var</span> <span class="n">x</span><span class="o">,</span> <span class="kt">var</span> <span class="n">y</span><span class="o">)</span> <span class="o">-&gt;</span> <span class="n">x</span> <span class="o">+</span> <span class="n">y</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="http-client-api-standard" href="#http-client-api-standard">
  </a>
  HTTP Client API (Standard)
</h3>

<p>Modern, asynchronous HTTP client:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">HttpClient</span> <span class="n">client</span> <span class="o">=</span> <span class="nc">HttpClient</span><span class="o">.</span><span class="na">newHttpClient</span><span class="o">();</span>
<span class="nc">HttpRequest</span> <span class="n">request</span> <span class="o">=</span> <span class="nc">HttpRequest</span><span class="o">.</span><span class="na">newBuilder</span><span class="o">()</span>
    <span class="o">.</span><span class="na">uri</span><span class="o">(</span><span class="no">URI</span><span class="o">.</span><span class="na">create</span><span class="o">(</span><span class="s">"https://api.example.com"</span><span class="o">))</span>
    <span class="o">.</span><span class="na">build</span><span class="o">();</span>

<span class="nc">HttpResponse</span><span class="o">&lt;</span><span class="nc">String</span><span class="o">&gt;</span> <span class="n">response</span> <span class="o">=</span> <span class="n">client</span><span class="o">.</span><span class="na">send</span><span class="o">(</span><span class="n">request</span><span class="o">,</span> 
    <span class="nc">HttpResponse</span><span class="o">.</span><span class="na">BodyHandlers</span><span class="o">.</span><span class="na">ofString</span><span class="o">());</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="files-methods" href="#files-methods">
  </a>
  Files Methods
</h3>

<p>Read/write files as strings:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">String</span> <span class="n">content</span> <span class="o">=</span> <span class="nc">Files</span><span class="o">.</span><span class="na">readString</span><span class="o">(</span><span class="nc">Path</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="s">"file.txt"</span><span class="o">));</span>
<span class="nc">Files</span><span class="o">.</span><span class="na">writeString</span><span class="o">(</span><span class="nc">Path</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="s">"file.txt"</span><span class="o">),</span> <span class="s">"content"</span><span class="o">);</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="collectiontoarray-enhancement" href="#collectiontoarray-enhancement">
  </a>
  Collection.toArray() Enhancement
</h3>

<p>Convert to specific array type:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">String</span><span class="o">[]</span> <span class="n">array</span> <span class="o">=</span> <span class="n">list</span><span class="o">.</span><span class="na">toArray</span><span class="o">(</span><span class="nc">String</span><span class="o">[]::</span><span class="k">new</span><span class="o">);</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="nestbased-access-control" href="#nestbased-access-control">
  </a>
  Nest-Based Access Control
</h3>

<p>Better nested class handling.</p>

<h3>
  <a name="epsilon-gc" href="#epsilon-gc">
  </a>
  Epsilon GC
</h3>

<p>No-op garbage collector for testing.</p>

<h3>
  <a name="removal-of-java-ee-and-corba-modules" href="#removal-of-java-ee-and-corba-modules">
  </a>
  Removal of Java EE and CORBA Modules
</h3>

<p>Deprecated modules removed.</p>


<hr>

<h2>
  <a name="java-12-march-2019" href="#java-12-march-2019">
  </a>
  Java 12 (March 2019)
</h2>

<h3>
  <a name="switch-expressions-preview" href="#switch-expressions-preview">
  </a>
  Switch Expressions (Preview)
</h3>

<p>Treat switch as an expression:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kt">int</span> <span class="n">numLetters</span> <span class="o">=</span> <span class="k">switch</span> <span class="o">(</span><span class="n">day</span><span class="o">)</span> <span class="o">{</span>
    <span class="k">case</span> <span class="no">MONDAY</span><span class="o">,</span> <span class="no">FRIDAY</span><span class="o">,</span> <span class="no">SUNDAY</span> <span class="o">-&gt;</span> <span class="mi">6</span><span class="o">;</span>
    <span class="k">case</span> <span class="no">TUESDAY</span> <span class="o">-&gt;</span> <span class="mi">7</span><span class="o">;</span>
    <span class="k">case</span> <span class="no">THURSDAY</span><span class="o">,</span> <span class="no">SATURDAY</span> <span class="o">-&gt;</span> <span class="mi">8</span><span class="o">;</span>
    <span class="k">case</span> <span class="no">WEDNESDAY</span> <span class="o">-&gt;</span> <span class="mi">9</span><span class="o">;</span>
<span class="o">};</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="string-methods" href="#string-methods">
  </a>
  String Methods
</h3>

<ul>
<li>
<code>indent()</code> - adjust indentation</li>
<li>
<code>transform()</code> - apply function to string
</li>
</ul>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">String</span> <span class="n">result</span> <span class="o">=</span> <span class="s">"hello"</span><span class="o">.</span><span class="na">transform</span><span class="o">(</span><span class="nl">String:</span><span class="o">:</span><span class="n">toUpperCase</span><span class="o">);</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="filesmismatch" href="#filesmismatch">
  </a>
  Files.mismatch()
</h3>

<p>Compare two files and find first difference.</p>

<h3>
  <a name="collectorsteeing" href="#collectorsteeing">
  </a>
  Collectors.teeing()
</h3>

<p>Combine two collectors:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kt">var</span> <span class="n">result</span> <span class="o">=</span> <span class="n">stream</span><span class="o">.</span><span class="na">collect</span><span class="o">(</span><span class="nc">Collectors</span><span class="o">.</span><span class="na">teeing</span><span class="o">(</span>
    <span class="nc">Collectors</span><span class="o">.</span><span class="na">summingInt</span><span class="o">(</span><span class="n">i</span> <span class="o">-&gt;</span> <span class="n">i</span><span class="o">),</span>
    <span class="nc">Collectors</span><span class="o">.</span><span class="na">counting</span><span class="o">(),</span>
    <span class="o">(</span><span class="n">sum</span><span class="o">,</span> <span class="n">count</span><span class="o">)</span> <span class="o">-&gt;</span> <span class="n">sum</span> <span class="o">/</span> <span class="n">count</span>
<span class="o">));</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="compact-number-formatting" href="#compact-number-formatting">
  </a>
  Compact Number Formatting
</h3>

<p>Format numbers in compact form:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">NumberFormat</span> <span class="n">fmt</span> <span class="o">=</span> <span class="nc">NumberFormat</span><span class="o">.</span><span class="na">getCompactNumberInstance</span><span class="o">();</span>
<span class="n">fmt</span><span class="o">.</span><span class="na">format</span><span class="o">(</span><span class="mi">1000</span><span class="o">);</span> <span class="c1">// "1K"</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>




<hr>

<h2>
  <a name="java-13-september-2019" href="#java-13-september-2019">
  </a>
  Java 13 (September 2019)
</h2>

<h3>
  <a name="text-blocks-preview" href="#text-blocks-preview">
  </a>
  Text Blocks (Preview)
</h3>

<p>Multi-line strings without escape sequences:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">String</span> <span class="n">json</span> <span class="o">=</span> <span class="sh">"""
    {
        "name": "John",
        "age": 30
    }
    """</span><span class="o">;</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="switch-expressions-second-preview" href="#switch-expressions-second-preview">
  </a>
  Switch Expressions (Second Preview)
</h3>

<p>Introduced <code>yield</code> keyword:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kt">int</span> <span class="n">result</span> <span class="o">=</span> <span class="k">switch</span> <span class="o">(</span><span class="n">value</span><span class="o">)</span> <span class="o">{</span>
    <span class="k">case</span> <span class="mi">1</span><span class="o">,</span> <span class="mi">2</span> <span class="o">-&gt;</span> <span class="mi">2</span><span class="o">;</span>
    <span class="k">case</span> <span class="mi">3</span> <span class="o">-&gt;</span> <span class="o">{</span>
        <span class="kt">int</span> <span class="n">temp</span> <span class="o">=</span> <span class="n">value</span> <span class="o">*</span> <span class="mi">2</span><span class="o">;</span>
        <span class="n">yield</span> <span class="n">temp</span><span class="o">;</span>
    <span class="o">}</span>
    <span class="k">default</span> <span class="o">-&gt;</span> <span class="mi">0</span><span class="o">;</span>
<span class="o">};</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="dynamic-cds-archives" href="#dynamic-cds-archives">
  </a>
  Dynamic CDS Archives
</h3>

<p>Improve application startup.</p>

<h3>
  <a name="reimplement-legacy-socket-api" href="#reimplement-legacy-socket-api">
  </a>
  Reimplement Legacy Socket API
</h3>

<p>Modern implementation using NIO.</p>


<hr>

<h2>
  <a name="java-14-march-2020" href="#java-14-march-2020">
  </a>
  Java 14 (March 2020)
</h2>

<h3>
  <a name="switch-expressions-standard" href="#switch-expressions-standard">
  </a>
  Switch Expressions (Standard)
</h3>

<p>Switch expressions became standard feature.</p>

<h3>
  <a name="pattern-matching-for-instanceof-preview" href="#pattern-matching-for-instanceof-preview">
  </a>
  Pattern Matching for instanceof (Preview)
</h3>

<p>Eliminate casting:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Before</span>
<span class="k">if</span> <span class="o">(</span><span class="n">obj</span> <span class="k">instanceof</span> <span class="nc">String</span><span class="o">)</span> <span class="o">{</span>
    <span class="nc">String</span> <span class="n">str</span> <span class="o">=</span> <span class="o">(</span><span class="nc">String</span><span class="o">)</span> <span class="n">obj</span><span class="o">;</span>
    <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="n">str</span><span class="o">.</span><span class="na">length</span><span class="o">());</span>
<span class="o">}</span>

<span class="c1">// Java 14</span>
<span class="k">if</span> <span class="o">(</span><span class="n">obj</span> <span class="k">instanceof</span> <span class="nc">String</span> <span class="n">str</span><span class="o">)</span> <span class="o">{</span>
    <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="n">str</span><span class="o">.</span><span class="na">length</span><span class="o">());</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="records-preview" href="#records-preview">
  </a>
  Records (Preview)
</h3>

<p>Concise syntax for data carrier classes:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="n">record</span> <span class="nf">Point</span><span class="o">(</span><span class="kt">int</span> <span class="n">x</span><span class="o">,</span> <span class="kt">int</span> <span class="n">y</span><span class="o">)</span> <span class="o">{</span> <span class="o">}</span>

<span class="c1">// Automatically generates:</span>
<span class="c1">// - Constructor</span>
<span class="c1">// - equals(), hashCode(), toString()</span>
<span class="c1">// - Getter methods</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="text-blocks-second-preview" href="#text-blocks-second-preview">
  </a>
  Text Blocks (Second Preview)
</h3>

<p>Improvements to text blocks.</p>

<h3>
  <a name="helpful-nullpointerexceptions" href="#helpful-nullpointerexceptions">
  </a>
  Helpful NullPointerExceptions
</h3>

<p>Detailed messages showing which variable was null:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">Exception</span> <span class="n">in</span> <span class="n">thread</span> <span class="s">"main"</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">NullPointerException</span><span class="o">:</span> 
    <span class="nc">Cannot</span> <span class="n">invoke</span> <span class="s">"String.length()"</span> <span class="n">because</span> <span class="s">"str"</span> <span class="n">is</span> <span class="kc">null</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="packaging-tool-incubator" href="#packaging-tool-incubator">
  </a>
  Packaging Tool (Incubator)
</h3>

<p>Create native installers for Java applications.</p>


<hr>

<h2>
  <a name="java-15-september-2020" href="#java-15-september-2020">
  </a>
  Java 15 (September 2020)
</h2>

<h3>
  <a name="text-blocks-standard" href="#text-blocks-standard">
  </a>
  Text Blocks (Standard)
</h3>

<p>Text blocks became a standard feature.</p>

<h3>
  <a name="sealed-classes-preview" href="#sealed-classes-preview">
  </a>
  Sealed Classes (Preview)
</h3>

<p>Control which classes can extend/implement:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kd">public</span> <span class="n">sealed</span> <span class="kd">class</span> <span class="nc">Shape</span> 
    <span class="n">permits</span> <span class="nc">Circle</span><span class="o">,</span> <span class="nc">Rectangle</span><span class="o">,</span> <span class="nc">Square</span> <span class="o">{</span> <span class="o">}</span>

<span class="kd">final</span> <span class="kd">class</span> <span class="nc">Circle</span> <span class="kd">extends</span> <span class="nc">Shape</span> <span class="o">{</span> <span class="o">}</span>
<span class="kd">final</span> <span class="kd">class</span> <span class="nc">Rectangle</span> <span class="kd">extends</span> <span class="nc">Shape</span> <span class="o">{</span> <span class="o">}</span>
<span class="kd">final</span> <span class="kd">class</span> <span class="nc">Square</span> <span class="kd">extends</span> <span class="nc">Shape</span> <span class="o">{</span> <span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="pattern-matching-for-instanceof-second-preview" href="#pattern-matching-for-instanceof-second-preview">
  </a>
  Pattern Matching for instanceof (Second Preview)
</h3>

<p>Further refinements.</p>

<h3>
  <a name="records-second-preview" href="#records-second-preview">
  </a>
  Records (Second Preview)
</h3>

<p>Additional improvements.</p>

<h3>
  <a name="hidden-classes" href="#hidden-classes">
  </a>
  Hidden Classes
</h3>

<p>Support frameworks that generate classes at runtime.</p>

<h3>
  <a name="edwardscurve-digital-signature-algorithm-eddsa" href="#edwardscurve-digital-signature-algorithm-eddsa">
  </a>
  Edwards-Curve Digital Signature Algorithm (EdDSA)
</h3>

<p>Cryptographic signature implementation.</p>

<h3>
  <a name="removed-nashorn-javascript-engine" href="#removed-nashorn-javascript-engine">
  </a>
  Removed Nashorn JavaScript Engine
</h3>

<p>Deprecated JavaScript engine removed.</p>


<hr>

<h2>
  <a name="java-16-march-2021" href="#java-16-march-2021">
  </a>
  Java 16 (March 2021)
</h2>

<h3>
  <a name="records-standard" href="#records-standard">
  </a>
  Records (Standard)
</h3>

<p>Records became standard:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="n">record</span> <span class="nf">Person</span><span class="o">(</span><span class="nc">String</span> <span class="n">name</span><span class="o">,</span> <span class="kt">int</span> <span class="n">age</span><span class="o">)</span> <span class="o">{</span>
    <span class="c1">// Compact constructor</span>
    <span class="kd">public</span> <span class="nc">Person</span> <span class="o">{</span>
        <span class="k">if</span> <span class="o">(</span><span class="n">age</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span> <span class="k">throw</span> <span class="k">new</span> <span class="nc">IllegalArgumentException</span><span class="o">();</span>
    <span class="o">}</span>

    <span class="c1">// Additional methods</span>
    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isAdult</span><span class="o">()</span> <span class="o">{</span>
        <span class="k">return</span> <span class="n">age</span> <span class="o">&gt;=</span> <span class="mi">18</span><span class="o">;</span>
    <span class="o">}</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="pattern-matching-for-instanceof-standard" href="#pattern-matching-for-instanceof-standard">
  </a>
  Pattern Matching for instanceof (Standard)
</h3>

<p>Now a standard feature.</p>

<h3>
  <a name="sealed-classes-second-preview" href="#sealed-classes-second-preview">
  </a>
  Sealed Classes (Second Preview)
</h3>

<p>Refinements to sealed classes.</p>

<h3>
  <a name="unixdomain-socket-channels" href="#unixdomain-socket-channels">
  </a>
  Unix-Domain Socket Channels
</h3>

<p>Support for Unix domain sockets in socket and server-socket channels.</p>

<h3>
  <a name="foreign-linker-api-incubator" href="#foreign-linker-api-incubator">
  </a>
  Foreign Linker API (Incubator)
</h3>

<p>Call native code without JNI.</p>

<h3>
  <a name="foreignmemory-access-api-third-incubator" href="#foreignmemory-access-api-third-incubator">
  </a>
  Foreign-Memory Access API (Third Incubator)
</h3>

<p>Safe and efficient access to memory outside Java heap.</p>

<h3>
  <a name="vector-api-incubator" href="#vector-api-incubator">
  </a>
  Vector API (Incubator)
</h3>

<p>Express vector computations for better CPU performance.</p>

<h3>
  <a name="enable-c14-language-features" href="#enable-c14-language-features">
  </a>
  Enable C++14 Language Features
</h3>

<p>JDK C++ source code can now use C++14 features.</p>

<h3>
  <a name="warnings-for-valuebased-classes" href="#warnings-for-valuebased-classes">
  </a>
  Warnings for Value-Based Classes
</h3>

<p>Prepare for future primitive classes.</p>


<hr>

<h2>
  <a name="java-17-september-2021-lts" href="#java-17-september-2021-lts">
  </a>
  Java 17 (September 2021) - LTS
</h2>

<h3>
  <a name="sealed-classes-standard" href="#sealed-classes-standard">
  </a>
  Sealed Classes (Standard)
</h3>

<p>Sealed classes finalized:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kd">public</span> <span class="n">sealed</span> <span class="kd">interface</span> <span class="nc">Vehicle</span> 
    <span class="n">permits</span> <span class="nc">Car</span><span class="o">,</span> <span class="nc">Truck</span><span class="o">,</span> <span class="nc">Motorcycle</span> <span class="o">{</span> <span class="o">}</span>

<span class="kd">final</span> <span class="kd">class</span> <span class="nc">Car</span> <span class="kd">implements</span> <span class="nc">Vehicle</span> <span class="o">{</span> <span class="o">}</span>
<span class="kd">final</span> <span class="kd">class</span> <span class="nc">Truck</span> <span class="kd">implements</span> <span class="nc">Vehicle</span> <span class="o">{</span> <span class="o">}</span>
<span class="n">non</span><span class="o">-</span><span class="n">sealed</span> <span class="kd">class</span> <span class="nc">Motorcycle</span> <span class="kd">implements</span> <span class="nc">Vehicle</span> <span class="o">{</span> <span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="pattern-matching-for-switch-preview" href="#pattern-matching-for-switch-preview">
  </a>
  Pattern Matching for switch (Preview)
</h3>

<p>Match patterns in switch:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kd">static</span> <span class="nc">String</span> <span class="nf">formatter</span><span class="o">(</span><span class="nc">Object</span> <span class="n">obj</span><span class="o">)</span> <span class="o">{</span>
    <span class="k">return</span> <span class="nf">switch</span> <span class="o">(</span><span class="n">obj</span><span class="o">)</span> <span class="o">{</span>
        <span class="k">case</span> <span class="nc">Integer</span> <span class="n">i</span> <span class="o">-&gt;</span> <span class="nc">String</span><span class="o">.</span><span class="na">format</span><span class="o">(</span><span class="s">"int %d"</span><span class="o">,</span> <span class="n">i</span><span class="o">);</span>
        <span class="k">case</span> <span class="nc">Long</span> <span class="n">l</span> <span class="o">-&gt;</span> <span class="nc">String</span><span class="o">.</span><span class="na">format</span><span class="o">(</span><span class="s">"long %d"</span><span class="o">,</span> <span class="n">l</span><span class="o">);</span>
        <span class="k">case</span> <span class="nc">Double</span> <span class="n">d</span> <span class="o">-&gt;</span> <span class="nc">String</span><span class="o">.</span><span class="na">format</span><span class="o">(</span><span class="s">"double %f"</span><span class="o">,</span> <span class="n">d</span><span class="o">);</span>
        <span class="k">case</span> <span class="nc">String</span> <span class="n">s</span> <span class="o">-&gt;</span> <span class="nc">String</span><span class="o">.</span><span class="na">format</span><span class="o">(</span><span class="s">"String %s"</span><span class="o">,</span> <span class="n">s</span><span class="o">);</span>
        <span class="k">default</span> <span class="o">-&gt;</span> <span class="n">obj</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span>
    <span class="o">};</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="restore-alwaysstrict-floatingpoint-semantics" href="#restore-alwaysstrict-floatingpoint-semantics">
  </a>
  Restore Always-Strict Floating-Point Semantics
</h3>

<p>Make floating-point operations consistently strict.</p>

<h3>
  <a name="enhanced-pseudorandom-number-generators" href="#enhanced-pseudorandom-number-generators">
  </a>
  Enhanced Pseudo-Random Number Generators
</h3>

<p>New interfaces and implementations:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">RandomGenerator</span> <span class="n">generator</span> <span class="o">=</span> <span class="nc">RandomGenerator</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="s">"L64X128MixRandom"</span><span class="o">);</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="remove-rmi-activation" href="#remove-rmi-activation">
  </a>
  Remove RMI Activation
</h3>

<p>Obsolete RMI activation mechanism removed.</p>

<h3>
  <a name="contextspecific-deserialization-filters" href="#contextspecific-deserialization-filters">
  </a>
  Context-Specific Deserialization Filters
</h3>

<p>Improve security by allowing filters for different contexts.</p>

<h3>
  <a name="deprecate-the-applet-api" href="#deprecate-the-applet-api">
  </a>
  Deprecate the Applet API
</h3>

<p>Applets marked for removal.</p>

<h3>
  <a name="strong-encapsulation-of-jdk-internals" href="#strong-encapsulation-of-jdk-internals">
  </a>
  Strong Encapsulation of JDK Internals
</h3>

<p>JDK internals strongly encapsulated by default.</p>

<h3>
  <a name="foreign-function-amp-memory-api-incubator" href="#foreign-function-amp-memory-api-incubator">
  </a>
  Foreign Function &amp; Memory API (Incubator)
</h3>

<p>Combine Foreign Linker and Memory Access APIs.</p>

<h3>
  <a name="vector-api-second-incubator" href="#vector-api-second-incubator">
  </a>
  Vector API (Second Incubator)
</h3>

<p>Improvements to vector operations.</p>


<hr>

<h2>
  <a name="java-18-march-2022" href="#java-18-march-2022">
  </a>
  Java 18 (March 2022)
</h2>

<h3>
  <a name="utf8-by-default" href="#utf8-by-default">
  </a>
  UTF-8 by Default
</h3>

<p>UTF-8 is now the default charset:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// No need to specify charset</span>
<span class="nc">Files</span><span class="o">.</span><span class="na">readString</span><span class="o">(</span><span class="nc">Path</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="s">"file.txt"</span><span class="o">));</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="simple-web-server" href="#simple-web-server">
  </a>
  Simple Web Server
</h3>

<p>Built-in HTTP server for prototyping:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight shell"><code>jwebserver
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="code-snippets-in-java-api-documentation" href="#code-snippets-in-java-api-documentation">
  </a>
  Code Snippets in Java API Documentation
</h3>

<p>Enhanced Javadoc with <code>@snippet</code>:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="cm">/**
 * {@snippet :
 *   List&lt;String&gt; list = List.of("a", "b", "c");
 *   list.forEach(System.out::println);
 * }
 */</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="pattern-matching-for-switch-second-preview" href="#pattern-matching-for-switch-second-preview">
  </a>
  Pattern Matching for switch (Second Preview)
</h3>

<p>Guarded patterns and refinements:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kd">static</span> <span class="nc">String</span> <span class="nf">test</span><span class="o">(</span><span class="nc">Object</span> <span class="n">obj</span><span class="o">)</span> <span class="o">{</span>
    <span class="k">return</span> <span class="nf">switch</span> <span class="o">(</span><span class="n">obj</span><span class="o">)</span> <span class="o">{</span>
        <span class="k">case</span> <span class="nc">String</span> <span class="n">s</span> <span class="o">&amp;&amp;</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">&gt;</span> <span class="mi">5</span> <span class="o">-&gt;</span> <span class="s">"Long string"</span><span class="o">;</span>
        <span class="k">case</span> <span class="nc">String</span> <span class="n">s</span> <span class="o">-&gt;</span> <span class="s">"Short string"</span><span class="o">;</span>
        <span class="k">case</span> <span class="nc">Integer</span> <span class="n">i</span> <span class="o">-&gt;</span> <span class="s">"Integer"</span><span class="o">;</span>
        <span class="k">default</span> <span class="o">-&gt;</span> <span class="s">"Other"</span><span class="o">;</span>
    <span class="o">};</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="foreign-function-amp-memory-api-second-incubator" href="#foreign-function-amp-memory-api-second-incubator">
  </a>
  Foreign Function &amp; Memory API (Second Incubator)
</h3>

<p>Continued refinements.</p>

<h3>
  <a name="vector-api-third-incubator" href="#vector-api-third-incubator">
  </a>
  Vector API (Third Incubator)
</h3>

<p>Further improvements.</p>

<h3>
  <a name="deprecate-finalization" href="#deprecate-finalization">
  </a>
  Deprecate Finalization
</h3>

<p>Finalization marked for removal.</p>


<hr>

<h2>
  <a name="java-19-september-2022" href="#java-19-september-2022">
  </a>
  Java 19 (September 2022)
</h2>

<h3>
  <a name="virtual-threads-preview" href="#virtual-threads-preview">
  </a>
  Virtual Threads (Preview)
</h3>

<p>Lightweight threads for massive concurrency:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Traditional thread</span>
<span class="nc">Thread</span> <span class="n">thread</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Thread</span><span class="o">(()</span> <span class="o">-&gt;</span> <span class="o">{</span>
    <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"Hello from thread"</span><span class="o">);</span>
<span class="o">});</span>

<span class="c1">// Virtual thread</span>
<span class="nc">Thread</span> <span class="n">virtualThread</span> <span class="o">=</span> <span class="nc">Thread</span><span class="o">.</span><span class="na">startVirtualThread</span><span class="o">(()</span> <span class="o">-&gt;</span> <span class="o">{</span>
    <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"Hello from virtual thread"</span><span class="o">);</span>
<span class="o">});</span>

<span class="c1">// Executor for virtual threads</span>
<span class="k">try</span> <span class="o">(</span><span class="kt">var</span> <span class="n">executor</span> <span class="o">=</span> <span class="nc">Executors</span><span class="o">.</span><span class="na">newVirtualThreadPerTaskExecutor</span><span class="o">())</span> <span class="o">{</span>
    <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="mi">1_000_000</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span>
        <span class="n">executor</span><span class="o">.</span><span class="na">submit</span><span class="o">(()</span> <span class="o">-&gt;</span> <span class="o">{</span>
            <span class="c1">// Handle task</span>
        <span class="o">});</span>
    <span class="o">}</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="pattern-matching-for-switch-third-preview" href="#pattern-matching-for-switch-third-preview">
  </a>
  Pattern Matching for switch (Third Preview)
</h3>

<p>Record patterns introduced:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="n">record</span> <span class="nf">Point</span><span class="o">(</span><span class="kt">int</span> <span class="n">x</span><span class="o">,</span> <span class="kt">int</span> <span class="n">y</span><span class="o">)</span> <span class="o">{}</span>

<span class="kd">static</span> <span class="kt">void</span> <span class="nf">printPoint</span><span class="o">(</span><span class="nc">Object</span> <span class="n">obj</span><span class="o">)</span> <span class="o">{</span>
    <span class="k">switch</span> <span class="o">(</span><span class="n">obj</span><span class="o">)</span> <span class="o">{</span>
        <span class="k">case</span> <span class="nf">Point</span><span class="o">(</span><span class="kt">int</span> <span class="n">x</span><span class="o">,</span> <span class="kt">int</span> <span class="n">y</span><span class="o">)</span> <span class="o">-&gt;</span> 
            <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"Point: "</span> <span class="o">+</span> <span class="n">x</span> <span class="o">+</span> <span class="s">", "</span> <span class="o">+</span> <span class="n">y</span><span class="o">);</span>
        <span class="k">default</span> <span class="o">-&gt;</span> <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"Not a point"</span><span class="o">);</span>
    <span class="o">}</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="structured-concurrency-incubator" href="#structured-concurrency-incubator">
  </a>
  Structured Concurrency (Incubator)
</h3>

<p>Simplify multithreaded programming:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="k">try</span> <span class="o">(</span><span class="kt">var</span> <span class="n">scope</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">StructuredTaskScope</span><span class="o">.</span><span class="na">ShutdownOnFailure</span><span class="o">())</span> <span class="o">{</span>
    <span class="nc">Future</span><span class="o">&lt;</span><span class="nc">String</span><span class="o">&gt;</span> <span class="n">user</span> <span class="o">=</span> <span class="n">scope</span><span class="o">.</span><span class="na">fork</span><span class="o">(()</span> <span class="o">-&gt;</span> <span class="n">findUser</span><span class="o">());</span>
    <span class="nc">Future</span><span class="o">&lt;</span><span class="nc">Integer</span><span class="o">&gt;</span> <span class="n">order</span> <span class="o">=</span> <span class="n">scope</span><span class="o">.</span><span class="na">fork</span><span class="o">(()</span> <span class="o">-&gt;</span> <span class="n">fetchOrder</span><span class="o">());</span>

    <span class="n">scope</span><span class="o">.</span><span class="na">join</span><span class="o">();</span>
    <span class="n">scope</span><span class="o">.</span><span class="na">throwIfFailed</span><span class="o">();</span>

    <span class="c1">// Both operations succeeded</span>
    <span class="n">processData</span><span class="o">(</span><span class="n">user</span><span class="o">.</span><span class="na">resultNow</span><span class="o">(),</span> <span class="n">order</span><span class="o">.</span><span class="na">resultNow</span><span class="o">());</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="foreign-function-amp-memory-api-preview" href="#foreign-function-amp-memory-api-preview">
  </a>
  Foreign Function &amp; Memory API (Preview)
</h3>

<p>Graduated from incubator.</p>

<h3>
  <a name="vector-api-fourth-incubator" href="#vector-api-fourth-incubator">
  </a>
  Vector API (Fourth Incubator)
</h3>

<p>Continued improvements.</p>

<h3>
  <a name="record-patterns-preview" href="#record-patterns-preview">
  </a>
  Record Patterns (Preview)
</h3>

<p>Destructure record values.</p>

<h3>
  <a name="linuxriscv-port" href="#linuxriscv-port">
  </a>
  Linux/RISC-V Port
</h3>

<p>Support for RISC-V architecture.</p>


<hr>

<h2>
  <a name="java-20-march-2023" href="#java-20-march-2023">
  </a>
  Java 20 (March 2023)
</h2>

<h3>
  <a name="scoped-values-incubator" href="#scoped-values-incubator">
  </a>
  Scoped Values (Incubator)
</h3>

<p>Share immutable data within threads:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kd">final</span> <span class="kd">static</span> <span class="nc">ScopedValue</span><span class="o">&lt;</span><span class="nc">User</span><span class="o">&gt;</span> <span class="no">CURRENT_USER</span> <span class="o">=</span> <span class="nc">ScopedValue</span><span class="o">.</span><span class="na">newInstance</span><span class="o">();</span>

<span class="nc">ScopedValue</span><span class="o">.</span><span class="na">where</span><span class="o">(</span><span class="no">CURRENT_USER</span><span class="o">,</span> <span class="n">user</span><span class="o">)</span>
    <span class="o">.</span><span class="na">run</span><span class="o">(()</span> <span class="o">-&gt;</span> <span class="n">processRequest</span><span class="o">());</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="record-patterns-second-preview" href="#record-patterns-second-preview">
  </a>
  Record Patterns (Second Preview)
</h3>

<p>Refinements and nested patterns:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="n">record</span> <span class="nf">Point</span><span class="o">(</span><span class="kt">int</span> <span class="n">x</span><span class="o">,</span> <span class="kt">int</span> <span class="n">y</span><span class="o">)</span> <span class="o">{}</span>
<span class="n">record</span> <span class="nf">Rectangle</span><span class="o">(</span><span class="nc">Point</span> <span class="n">topLeft</span><span class="o">,</span> <span class="nc">Point</span> <span class="n">bottomRight</span><span class="o">)</span> <span class="o">{}</span>

<span class="kd">static</span> <span class="kt">void</span> <span class="nf">printRectangle</span><span class="o">(</span><span class="nc">Object</span> <span class="n">obj</span><span class="o">)</span> <span class="o">{</span>
    <span class="k">if</span> <span class="o">(</span><span class="n">obj</span> <span class="k">instanceof</span> <span class="nf">Rectangle</span><span class="o">(</span><span class="nc">Point</span><span class="o">(</span><span class="kt">var</span> <span class="n">x1</span><span class="o">,</span> <span class="kt">var</span> <span class="n">y1</span><span class="o">),</span> 
                                  <span class="nc">Point</span><span class="o">(</span><span class="kt">var</span> <span class="n">x2</span><span class="o">,</span> <span class="kt">var</span> <span class="n">y2</span><span class="o">)))</span> <span class="o">{</span>
        <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"Rectangle from "</span> <span class="o">+</span> <span class="n">x1</span> <span class="o">+</span> <span class="s">","</span> <span class="o">+</span> <span class="n">y1</span><span class="o">);</span>
    <span class="o">}</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="pattern-matching-for-switch-fourth-preview" href="#pattern-matching-for-switch-fourth-preview">
  </a>
  Pattern Matching for switch (Fourth Preview)
</h3>

<p>Continued refinements with when clauses:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">String</span> <span class="n">result</span> <span class="o">=</span> <span class="k">switch</span> <span class="o">(</span><span class="n">obj</span><span class="o">)</span> <span class="o">{</span>
    <span class="k">case</span> <span class="nc">String</span> <span class="n">s</span> <span class="n">when</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">&gt;</span> <span class="mi">5</span> <span class="o">-&gt;</span> <span class="s">"Long"</span><span class="o">;</span>
    <span class="k">case</span> <span class="nc">String</span> <span class="n">s</span> <span class="o">-&gt;</span> <span class="s">"Short"</span><span class="o">;</span>
    <span class="k">default</span> <span class="o">-&gt;</span> <span class="s">"Other"</span><span class="o">;</span>
<span class="o">};</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="foreign-function-amp-memory-api-second-preview" href="#foreign-function-amp-memory-api-second-preview">
  </a>
  Foreign Function &amp; Memory API (Second Preview)
</h3>

<p>Further improvements.</p>

<h3>
  <a name="virtual-threads-second-preview" href="#virtual-threads-second-preview">
  </a>
  Virtual Threads (Second Preview)
</h3>

<p>Refinements based on feedback.</p>

<h3>
  <a name="structured-concurrency-second-incubator" href="#structured-concurrency-second-incubator">
  </a>
  Structured Concurrency (Second Incubator)
</h3>

<p>Enhanced APIs.</p>

<h3>
  <a name="vector-api-fifth-incubator" href="#vector-api-fifth-incubator">
  </a>
  Vector API (Fifth Incubator)
</h3>

<p>Continued evolution.</p>


<hr>

<h2>
  <a name="java-21-september-2023-lts" href="#java-21-september-2023-lts">
  </a>
  Java 21 (September 2023) - LTS
</h2>

<h3>
  <a name="virtual-threads-standard" href="#virtual-threads-standard">
  </a>
  Virtual Threads (Standard)
</h3>

<p>Production-ready virtual threads:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Create millions of virtual threads easily</span>
<span class="k">try</span> <span class="o">(</span><span class="kt">var</span> <span class="n">executor</span> <span class="o">=</span> <span class="nc">Executors</span><span class="o">.</span><span class="na">newVirtualThreadPerTaskExecutor</span><span class="o">())</span> <span class="o">{</span>
    <span class="nc">IntStream</span><span class="o">.</span><span class="na">range</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="mi">10_000</span><span class="o">).</span><span class="na">forEach</span><span class="o">(</span><span class="n">i</span> <span class="o">-&gt;</span> <span class="o">{</span>
        <span class="n">executor</span><span class="o">.</span><span class="na">submit</span><span class="o">(()</span> <span class="o">-&gt;</span> <span class="o">{</span>
            <span class="nc">Thread</span><span class="o">.</span><span class="na">sleep</span><span class="o">(</span><span class="nc">Duration</span><span class="o">.</span><span class="na">ofSeconds</span><span class="o">(</span><span class="mi">1</span><span class="o">));</span>
            <span class="k">return</span> <span class="n">i</span><span class="o">;</span>
        <span class="o">});</span>
    <span class="o">});</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="sequenced-collections" href="#sequenced-collections">
  </a>
  Sequenced Collections
</h3>

<p>New interfaces for collections with defined encounter order:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kd">interface</span> <span class="nc">SequencedCollection</span><span class="o">&lt;</span><span class="no">E</span><span class="o">&gt;</span> <span class="kd">extends</span> <span class="nc">Collection</span><span class="o">&lt;</span><span class="no">E</span><span class="o">&gt;</span> <span class="o">{</span>
    <span class="nc">SequencedCollection</span><span class="o">&lt;</span><span class="no">E</span><span class="o">&gt;</span> <span class="nf">reversed</span><span class="o">();</span>
    <span class="kt">void</span> <span class="nf">addFirst</span><span class="o">(</span><span class="no">E</span><span class="o">);</span>
    <span class="kt">void</span> <span class="nf">addLast</span><span class="o">(</span><span class="no">E</span><span class="o">);</span>
    <span class="no">E</span> <span class="nf">getFirst</span><span class="o">();</span>
    <span class="no">E</span> <span class="nf">getLast</span><span class="o">();</span>
    <span class="no">E</span> <span class="nf">removeFirst</span><span class="o">();</span>
    <span class="no">E</span> <span class="nf">removeLast</span><span class="o">();</span>
<span class="o">}</span>

<span class="nc">List</span><span class="o">&lt;</span><span class="nc">String</span><span class="o">&gt;</span> <span class="n">list</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">ArrayList</span><span class="o">&lt;&gt;();</span>
<span class="n">list</span><span class="o">.</span><span class="na">addFirst</span><span class="o">(</span><span class="s">"first"</span><span class="o">);</span>
<span class="n">list</span><span class="o">.</span><span class="na">addLast</span><span class="o">(</span><span class="s">"last"</span><span class="o">);</span>
<span class="nc">String</span> <span class="n">first</span> <span class="o">=</span> <span class="n">list</span><span class="o">.</span><span class="na">getFirst</span><span class="o">();</span>
<span class="nc">List</span><span class="o">&lt;</span><span class="nc">String</span><span class="o">&gt;</span> <span class="n">reversed</span> <span class="o">=</span> <span class="n">list</span><span class="o">.</span><span class="na">reversed</span><span class="o">();</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="pattern-matching-for-switch-standard" href="#pattern-matching-for-switch-standard">
  </a>
  Pattern Matching for switch (Standard)
</h3>

<p>Full pattern matching in switch:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kd">static</span> <span class="nc">String</span> <span class="nf">formatValue</span><span class="o">(</span><span class="nc">Object</span> <span class="n">obj</span><span class="o">)</span> <span class="o">{</span>
    <span class="k">return</span> <span class="nf">switch</span> <span class="o">(</span><span class="n">obj</span><span class="o">)</span> <span class="o">{</span>
        <span class="k">case</span> <span class="nc">Integer</span> <span class="n">i</span> <span class="o">-&gt;</span> <span class="nc">String</span><span class="o">.</span><span class="na">format</span><span class="o">(</span><span class="s">"int %d"</span><span class="o">,</span> <span class="n">i</span><span class="o">);</span>
        <span class="k">case</span> <span class="nc">Long</span> <span class="n">l</span> <span class="o">-&gt;</span> <span class="nc">String</span><span class="o">.</span><span class="na">format</span><span class="o">(</span><span class="s">"long %d"</span><span class="o">,</span> <span class="n">l</span><span class="o">);</span>
        <span class="k">case</span> <span class="nc">Double</span> <span class="n">d</span> <span class="o">-&gt;</span> <span class="nc">String</span><span class="o">.</span><span class="na">format</span><span class="o">(</span><span class="s">"double %f"</span><span class="o">,</span> <span class="n">d</span><span class="o">);</span>
        <span class="k">case</span> <span class="nc">String</span> <span class="n">s</span> <span class="o">-&gt;</span> <span class="nc">String</span><span class="o">.</span><span class="na">format</span><span class="o">(</span><span class="s">"String %s"</span><span class="o">,</span> <span class="n">s</span><span class="o">);</span>
        <span class="k">case</span> <span class="kc">null</span> <span class="o">-&gt;</span> <span class="s">"null"</span><span class="o">;</span>
        <span class="k">default</span> <span class="o">-&gt;</span> <span class="n">obj</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span>
    <span class="o">};</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="record-patterns-standard" href="#record-patterns-standard">
  </a>
  Record Patterns (Standard)
</h3>

<p>Destructure records in pattern matching:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="n">record</span> <span class="nf">Point</span><span class="o">(</span><span class="kt">int</span> <span class="n">x</span><span class="o">,</span> <span class="kt">int</span> <span class="n">y</span><span class="o">)</span> <span class="o">{}</span>

<span class="kd">static</span> <span class="kt">void</span> <span class="nf">printSum</span><span class="o">(</span><span class="nc">Object</span> <span class="n">obj</span><span class="o">)</span> <span class="o">{</span>
    <span class="k">if</span> <span class="o">(</span><span class="n">obj</span> <span class="k">instanceof</span> <span class="nf">Point</span><span class="o">(</span><span class="kt">int</span> <span class="n">x</span><span class="o">,</span> <span class="kt">int</span> <span class="n">y</span><span class="o">))</span> <span class="o">{</span>
        <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="n">x</span> <span class="o">+</span> <span class="n">y</span><span class="o">);</span>
    <span class="o">}</span>
<span class="o">}</span>

<span class="c1">// In switch</span>
<span class="kd">static</span> <span class="kt">int</span> <span class="nf">sumCoordinates</span><span class="o">(</span><span class="nc">Object</span> <span class="n">obj</span><span class="o">)</span> <span class="o">{</span>
    <span class="k">return</span> <span class="nf">switch</span> <span class="o">(</span><span class="n">obj</span><span class="o">)</span> <span class="o">{</span>
        <span class="k">case</span> <span class="nf">Point</span><span class="o">(</span><span class="kt">int</span> <span class="n">x</span><span class="o">,</span> <span class="kt">int</span> <span class="n">y</span><span class="o">)</span> <span class="o">-&gt;</span> <span class="n">x</span> <span class="o">+</span> <span class="n">y</span><span class="o">;</span>
        <span class="k">default</span> <span class="o">-&gt;</span> <span class="mi">0</span><span class="o">;</span>
    <span class="o">};</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="string-templates-preview" href="#string-templates-preview">
  </a>
  String Templates (Preview)
</h3>

<p>Safe and convenient string interpolation:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">String</span> <span class="n">name</span> <span class="o">=</span> <span class="s">"John"</span><span class="o">;</span>
<span class="kt">int</span> <span class="n">age</span> <span class="o">=</span> <span class="mi">30</span><span class="o">;</span>

<span class="c1">// String template</span>
<span class="nc">String</span> <span class="n">message</span> <span class="o">=</span> <span class="no">STR</span><span class="o">.</span><span class="s">"Hello \{name}, you are \{age} years old"</span><span class="o">;</span>

<span class="c1">// With expressions</span>
<span class="nc">String</span> <span class="n">result</span> <span class="o">=</span> <span class="no">STR</span><span class="o">.</span><span class="s">"2 + 2 = \{2 + 2}"</span><span class="o">;</span>

<span class="c1">// FMT for formatting</span>
<span class="nc">String</span> <span class="n">formatted</span> <span class="o">=</span> <span class="no">FMT</span><span class="o">.</span><span class="s">"Value: %.2f\{value}"</span><span class="o">;</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="unnamed-patterns-and-variables" href="#unnamed-patterns-and-variables">
  </a>
  Unnamed Patterns and Variables
</h3>

<p>Use <code>_</code> for unused variables:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Unused variables in patterns</span>
<span class="k">if</span> <span class="o">(</span><span class="n">obj</span> <span class="k">instanceof</span> <span class="nf">Point</span><span class="o">(</span><span class="kt">int</span> <span class="n">x</span><span class="o">,</span> <span class="kt">int</span> <span class="n">_</span><span class="o">))</span> <span class="o">{</span>
    <span class="c1">// Only use x, ignore y</span>
<span class="o">}</span>

<span class="c1">// In switch</span>
<span class="k">switch</span> <span class="o">(</span><span class="n">obj</span><span class="o">)</span> <span class="o">{</span>
    <span class="k">case</span> <span class="nf">Point</span><span class="o">(</span><span class="kt">int</span> <span class="n">x</span><span class="o">,</span> <span class="kt">int</span> <span class="n">_</span><span class="o">)</span> <span class="o">-&gt;</span> <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="n">x</span><span class="o">);</span>
<span class="o">}</span>

<span class="c1">// In lambda</span>
<span class="n">list</span><span class="o">.</span><span class="na">forEach</span><span class="o">(</span><span class="n">_</span> <span class="o">-&gt;</span> <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"Item"</span><span class="o">));</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="unnamed-classes-and-instance-main-methods-preview" href="#unnamed-classes-and-instance-main-methods-preview">
  </a>
  Unnamed Classes and Instance Main Methods (Preview)
</h3>

<p>Simplify learning and prototyping:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Traditional main method</span>
<span class="kd">public</span> <span class="kd">class</span> <span class="nc">HelloWorld</span> <span class="o">{</span>
    <span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">main</span><span class="o">(</span><span class="nc">String</span><span class="o">[]</span> <span class="n">args</span><span class="o">)</span> <span class="o">{</span>
        <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"Hello World"</span><span class="o">);</span>
    <span class="o">}</span>
<span class="o">}</span>

<span class="c1">// Java 21 simplified</span>
<span class="kt">void</span> <span class="nf">main</span><span class="o">()</span> <span class="o">{</span>
    <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"Hello World"</span><span class="o">);</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="scoped-values-preview" href="#scoped-values-preview">
  </a>
  Scoped Values (Preview)
</h3>

<p>Share immutable data efficiently:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kd">final</span> <span class="kd">static</span> <span class="nc">ScopedValue</span><span class="o">&lt;</span><span class="nc">User</span><span class="o">&gt;</span> <span class="no">CURRENT_USER</span> <span class="o">=</span> <span class="nc">ScopedValue</span><span class="o">.</span><span class="na">newInstance</span><span class="o">();</span>

<span class="kt">void</span> <span class="nf">serve</span><span class="o">(</span><span class="nc">Request</span> <span class="n">request</span><span class="o">)</span> <span class="o">{</span>
    <span class="nc">User</span> <span class="n">user</span> <span class="o">=</span> <span class="n">authenticate</span><span class="o">(</span><span class="n">request</span><span class="o">);</span>
    <span class="nc">ScopedValue</span><span class="o">.</span><span class="na">where</span><span class="o">(</span><span class="no">CURRENT_USER</span><span class="o">,</span> <span class="n">user</span><span class="o">)</span>
               <span class="o">.</span><span class="na">run</span><span class="o">(()</span> <span class="o">-&gt;</span> <span class="n">processRequest</span><span class="o">(</span><span class="n">request</span><span class="o">));</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="structured-concurrency-preview" href="#structured-concurrency-preview">
  </a>
  Structured Concurrency (Preview)
</h3>

<p>Treat multiple tasks as single unit:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="k">try</span> <span class="o">(</span><span class="kt">var</span> <span class="n">scope</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">StructuredTaskScope</span><span class="o">.</span><span class="na">ShutdownOnFailure</span><span class="o">())</span> <span class="o">{</span>
    <span class="nc">Subtask</span><span class="o">&lt;</span><span class="nc">String</span><span class="o">&gt;</span> <span class="n">user</span>  <span class="o">=</span> <span class="n">scope</span><span class="o">.</span><span class="na">fork</span><span class="o">(()</span> <span class="o">-&gt;</span> <span class="n">findUser</span><span class="o">());</span>
    <span class="nc">Subtask</span><span class="o">&lt;</span><span class="nc">Integer</span><span class="o">&gt;</span> <span class="n">order</span> <span class="o">=</span> <span class="n">scope</span><span class="o">.</span><span class="na">fork</span><span class="o">(()</span> <span class="o">-&gt;</span> <span class="n">fetchOrder</span><span class="o">());</span>

    <span class="n">scope</span><span class="o">.</span><span class="na">join</span><span class="o">();</span>
    <span class="n">scope</span><span class="o">.</span><span class="na">throwIfFailed</span><span class="o">();</span>

    <span class="k">return</span> <span class="k">new</span> <span class="nf">Response</span><span class="o">(</span><span class="n">user</span><span class="o">.</span><span class="na">get</span><span class="o">(),</span> <span class="n">order</span><span class="o">.</span><span class="na">get</span><span class="o">());</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="foreign-function-amp-memory-api-third-preview" href="#foreign-function-amp-memory-api-third-preview">
  </a>
  Foreign Function &amp; Memory API (Third Preview)
</h3>

<p>Call native code safely.</p>

<h3>
  <a name="vector-api-sixth-incubator" href="#vector-api-sixth-incubator">
  </a>
  Vector API (Sixth Incubator)
</h3>

<p>Express vector computations.</p>

<h3>
  <a name="key-encapsulation-mechanism-api" href="#key-encapsulation-mechanism-api">
  </a>
  Key Encapsulation Mechanism API
</h3>

<p>Support for Key Encapsulation Mechanism (KEM).</p>

<h3>
  <a name="deprecate-windows-32bit-x86-port" href="#deprecate-windows-32bit-x86-port">
  </a>
  Deprecate Windows 32-bit x86 Port
</h3>

<p>Prepare for removal.</p>

<h3>
  <a name="prepare-to-disallow-dynamic-loading-of-agents" href="#prepare-to-disallow-dynamic-loading-of-agents">
  </a>
  Prepare to Disallow Dynamic Loading of Agents
</h3>

<p>Improve integrity by default.</p>


<hr>

<h2>
  <a name="java-22-march-2024" href="#java-22-march-2024">
  </a>
  Java 22 (March 2024)
</h2>

<h3>
  <a name="unnamed-variables-amp-patterns-standard" href="#unnamed-variables-amp-patterns-standard">
  </a>
  Unnamed Variables &amp; Patterns (Standard)
</h3>

<p>Using <code>_</code> is now standard:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Multiple unused variables</span>
<span class="kt">int</span> <span class="n">sum</span> <span class="o">=</span> <span class="k">switch</span> <span class="o">(</span><span class="n">point</span><span class="o">)</span> <span class="o">{</span>
    <span class="k">case</span> <span class="nf">Point</span><span class="o">(</span><span class="kt">int</span> <span class="n">x</span><span class="o">,</span> <span class="kt">int</span> <span class="n">_</span><span class="o">)</span> <span class="o">-&gt;</span> <span class="n">x</span><span class="o">;</span>
<span class="o">};</span>

<span class="c1">// Try-catch with unused exception</span>
<span class="k">try</span> <span class="o">{</span>
    <span class="n">riskyOperation</span><span class="o">();</span>
<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">Exception</span> <span class="n">_</span><span class="o">)</span> <span class="o">{</span>
    <span class="n">handleError</span><span class="o">();</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="statements-before-super-preview" href="#statements-before-super-preview">
  </a>
  Statements before super() (Preview)
</h3>

<p>Initialize fields before calling superclass constructor:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kd">public</span> <span class="kd">class</span> <span class="nc">SubClass</span> <span class="kd">extends</span> <span class="nc">SuperClass</span> <span class="o">{</span>
    <span class="kd">private</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">value</span><span class="o">;</span>

    <span class="kd">public</span> <span class="nf">SubClass</span><span class="o">(</span><span class="kt">int</span> <span class="n">input</span><span class="o">)</span> <span class="o">{</span>
        <span class="c1">// Process before super()</span>
        <span class="n">value</span> <span class="o">=</span> <span class="n">validateAndTransform</span><span class="o">(</span><span class="n">input</span><span class="o">);</span>
        <span class="kd">super</span><span class="o">(</span><span class="n">value</span><span class="o">);</span>
    <span class="o">}</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="string-templates-second-preview" href="#string-templates-second-preview">
  </a>
  String Templates (Second Preview)
</h3>

<p>Refinements to string templates.</p>

<h3>
  <a name="implicitly-declared-classes-and-instance-main-second-preview" href="#implicitly-declared-classes-and-instance-main-second-preview">
  </a>
  Implicitly Declared Classes and Instance Main (Second Preview)
</h3>

<p>Simplified entry point:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Entire program</span>
<span class="kt">void</span> <span class="nf">main</span><span class="o">()</span> <span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Hello, World!"</span><span class="o">);</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="scoped-values-second-preview" href="#scoped-values-second-preview">
  </a>
  Scoped Values (Second Preview)
</h3>

<p>Performance improvements.</p>

<h3>
  <a name="structured-concurrency-second-preview" href="#structured-concurrency-second-preview">
  </a>
  Structured Concurrency (Second Preview)
</h3>

<p>API refinements.</p>

<h3>
  <a name="foreign-function-amp-memory-api-standard" href="#foreign-function-amp-memory-api-standard">
  </a>
  Foreign Function &amp; Memory API (Standard)
</h3>

<p>Production-ready FFM API:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Call native function</span>
<span class="nc">Linker</span> <span class="n">linker</span> <span class="o">=</span> <span class="nc">Linker</span><span class="o">.</span><span class="na">nativeLinker</span><span class="o">();</span>
<span class="nc">SymbolLookup</span> <span class="n">stdlib</span> <span class="o">=</span> <span class="n">linker</span><span class="o">.</span><span class="na">defaultLookup</span><span class="o">();</span>

<span class="nc">MethodHandle</span> <span class="n">strlen</span> <span class="o">=</span> <span class="n">linker</span><span class="o">.</span><span class="na">downcallHandle</span><span class="o">(</span>
    <span class="n">stdlib</span><span class="o">.</span><span class="na">find</span><span class="o">(</span><span class="s">"strlen"</span><span class="o">).</span><span class="na">orElseThrow</span><span class="o">(),</span>
    <span class="nc">FunctionDescriptor</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="no">JAVA_LONG</span><span class="o">,</span> <span class="no">ADDRESS</span><span class="o">)</span>
<span class="o">);</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="vector-api-seventh-incubator" href="#vector-api-seventh-incubator">
  </a>
  Vector API (Seventh Incubator)
</h3>

<p>Continued improvements.</p>

<h3>
  <a name="stream-gatherers-preview" href="#stream-gatherers-preview">
  </a>
  Stream Gatherers (Preview)
</h3>

<p>Custom intermediate operations:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Custom gathering operation</span>
<span class="nc">Stream</span><span class="o">&lt;</span><span class="nc">Integer</span><span class="o">&gt;</span> <span class="n">result</span> <span class="o">=</span> <span class="nc">Stream</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="mi">2</span><span class="o">,</span> <span class="mi">3</span><span class="o">,</span> <span class="mi">4</span><span class="o">,</span> <span class="mi">5</span><span class="o">)</span>
    <span class="o">.</span><span class="na">gather</span><span class="o">(</span><span class="n">windowFixed</span><span class="o">(</span><span class="mi">2</span><span class="o">))</span>  <span class="c1">// Sliding window</span>
    <span class="o">.</span><span class="na">map</span><span class="o">(</span><span class="n">window</span> <span class="o">-&gt;</span> <span class="n">window</span><span class="o">.</span><span class="na">stream</span><span class="o">().</span><span class="na">mapToInt</span><span class="o">(</span><span class="n">i</span> <span class="o">-&gt;</span> <span class="n">i</span><span class="o">).</span><span class="na">sum</span><span class="o">());</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="classfile-api-preview" href="#classfile-api-preview">
  </a>
  Class-File API (Preview)
</h3>

<p>Parse, generate, transform class files:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">ClassFile</span> <span class="n">cf</span> <span class="o">=</span> <span class="nc">ClassFile</span><span class="o">.</span><span class="na">of</span><span class="o">();</span>
<span class="kt">byte</span><span class="o">[]</span> <span class="n">bytes</span> <span class="o">=</span> <span class="n">cf</span><span class="o">.</span><span class="na">build</span><span class="o">(</span><span class="nc">ClassDesc</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="s">"MyClass"</span><span class="o">),</span> <span class="n">cb</span> <span class="o">-&gt;</span> <span class="o">{</span>
    <span class="n">cb</span><span class="o">.</span><span class="na">withMethod</span><span class="o">(</span><span class="s">"myMethod"</span><span class="o">,</span> 
        <span class="nc">MethodTypeDesc</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="n">CD_void</span><span class="o">),</span> 
        <span class="no">ACC_PUBLIC</span><span class="o">,</span> <span class="n">mb</span> <span class="o">-&gt;</span> <span class="o">{</span>
            <span class="c1">// Build method</span>
        <span class="o">});</span>
<span class="o">});</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="launch-multifile-sourcecode-programs" href="#launch-multifile-sourcecode-programs">
  </a>
  Launch Multi-File Source-Code Programs
</h3>

<p>Run programs with multiple source files:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight shell"><code>java MainClass.java  <span class="c"># Compiles and runs all dependencies</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>




<hr>

<h2>
  <a name="java-23-september-2024" href="#java-23-september-2024">
  </a>
  Java 23 (September 2024)
</h2>

<h3>
  <a name="primitive-types-in-patterns-preview" href="#primitive-types-in-patterns-preview">
  </a>
  Primitive Types in Patterns (Preview)
</h3>

<p>Pattern matching for primitive types:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Match on primitive types</span>
<span class="kt">int</span> <span class="n">result</span> <span class="o">=</span> <span class="k">switch</span> <span class="o">(</span><span class="n">value</span><span class="o">)</span> <span class="o">{</span>
    <span class="k">case</span> <span class="kt">byte</span> <span class="n">b</span> <span class="o">-&gt;</span> <span class="n">b</span><span class="o">;</span>
    <span class="k">case</span> <span class="kt">short</span> <span class="n">s</span> <span class="o">-&gt;</span> <span class="n">s</span><span class="o">;</span>
    <span class="k">case</span> <span class="kt">int</span> <span class="n">i</span> <span class="o">-&gt;</span> <span class="n">i</span><span class="o">;</span>
    <span class="k">case</span> <span class="kt">long</span> <span class="n">l</span> <span class="o">-&gt;</span> <span class="o">(</span><span class="kt">int</span><span class="o">)</span> <span class="n">l</span><span class="o">;</span>
<span class="o">};</span>

<span class="c1">// In instanceof</span>
<span class="k">if</span> <span class="o">(</span><span class="n">obj</span> <span class="k">instanceof</span> <span class="kt">int</span> <span class="n">i</span><span class="o">)</span> <span class="o">{</span>
    <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"Integer: "</span> <span class="o">+</span> <span class="n">i</span><span class="o">);</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="module-import-declarations-preview" href="#module-import-declarations-preview">
  </a>
  Module Import Declarations (Preview)
</h3>

<p>Import entire modules:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kn">import</span> <span class="nn">module</span> <span class="n">java</span><span class="o">.</span><span class="na">base</span><span class="o">;</span>

<span class="c1">// All public APIs from java.base are available</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="markdown-documentation-comments-preview" href="#markdown-documentation-comments-preview">
  </a>
  Markdown Documentation Comments (Preview)
</h3>

<p>Use Markdown in Javadoc:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">/// # This is a heading</span>
<span class="c1">/// </span>
<span class="c1">/// This method does something **important**.</span>
<span class="c1">/// </span>
<span class="c1">/// ## Parameters</span>
<span class="c1">/// - `value` - the input value</span>
<span class="c1">/// </span>
<span class="c1">/// ## Returns</span>
<span class="c1">/// The processed result</span>
<span class="kd">public</span> <span class="nc">String</span> <span class="nf">process</span><span class="o">(</span><span class="nc">String</span> <span class="n">value</span><span class="o">)</span> <span class="o">{</span>
    <span class="k">return</span> <span class="n">value</span><span class="o">.</span><span class="na">toUpperCase</span><span class="o">();</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="flexible-constructor-bodies-second-preview" href="#flexible-constructor-bodies-second-preview">
  </a>
  Flexible Constructor Bodies (Second Preview)
</h3>

<p>More flexibility before super():<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kd">public</span> <span class="nf">SubClass</span><span class="o">(</span><span class="nc">String</span> <span class="n">data</span><span class="o">)</span> <span class="o">{</span>
    <span class="c1">// Validate and prepare</span>
    <span class="k">if</span> <span class="o">(</span><span class="n">data</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="k">throw</span> <span class="k">new</span> <span class="nc">IllegalArgumentException</span><span class="o">();</span>
    <span class="nc">String</span> <span class="n">processed</span> <span class="o">=</span> <span class="n">data</span><span class="o">.</span><span class="na">trim</span><span class="o">().</span><span class="na">toLowerCase</span><span class="o">();</span>

    <span class="kd">super</span><span class="o">(</span><span class="n">processed</span><span class="o">);</span>

    <span class="c1">// Post-super initialization</span>
    <span class="k">this</span><span class="o">.</span><span class="na">timestamp</span> <span class="o">=</span> <span class="nc">System</span><span class="o">.</span><span class="na">currentTimeMillis</span><span class="o">();</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="implicitly-declared-classes-and-instance-main-third-preview" href="#implicitly-declared-classes-and-instance-main-third-preview">
  </a>
  Implicitly Declared Classes and Instance Main (Third Preview)
</h3>

<p>Further refinements.</p>

<h3>
  <a name="stream-gatherers-second-preview" href="#stream-gatherers-second-preview">
  </a>
  Stream Gatherers (Second Preview)
</h3>

<p>Enhanced gathering operations:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Sliding window with custom logic</span>
<span class="nc">List</span><span class="o">&lt;</span><span class="nc">List</span><span class="o">&lt;</span><span class="nc">Integer</span><span class="o">&gt;&gt;</span> <span class="n">windows</span> <span class="o">=</span> <span class="nc">Stream</span><span class="o">.</span><span class="na">of</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="mi">2</span><span class="o">,</span> <span class="mi">3</span><span class="o">,</span> <span class="mi">4</span><span class="o">,</span> <span class="mi">5</span><span class="o">)</span>
    <span class="o">.</span><span class="na">gather</span><span class="o">(</span><span class="n">slidingWindow</span><span class="o">(</span><span class="mi">3</span><span class="o">))</span>
    <span class="o">.</span><span class="na">toList</span><span class="o">();</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="structured-concurrency-third-preview" href="#structured-concurrency-third-preview">
  </a>
  Structured Concurrency (Third Preview)
</h3>

<p>Improved structured task handling.</p>

<h3>
  <a name="scoped-values-third-preview" href="#scoped-values-third-preview">
  </a>
  Scoped Values (Third Preview)
</h3>

<p>Additional optimizations.</p>

<h3>
  <a name="classfile-api-second-preview" href="#classfile-api-second-preview">
  </a>
  Class-File API (Second Preview)
</h3>

<p>Improvements to class file manipulation.</p>

<h3>
  <a name="vector-api-eighth-incubator" href="#vector-api-eighth-incubator">
  </a>
  Vector API (Eighth Incubator)
</h3>

<p>Performance enhancements.</p>

<h3>
  <a name="zgc-generational-mode-by-default" href="#zgc-generational-mode-by-default">
  </a>
  ZGC: Generational Mode by Default
</h3>

<p>Z Garbage Collector uses generational mode.</p>

<h3>
  <a name="deprecate-memoryaccess-methods-in-sunmiscunsafe" href="#deprecate-memoryaccess-methods-in-sunmiscunsafe">
  </a>
  Deprecate Memory-Access Methods in sun.misc.Unsafe
</h3>

<p>Prepare for removal in favor of FFM API.</p>


<hr>

<h2>
  <a name="java-24-march-2025" href="#java-24-march-2025">
  </a>
  Java 24 (March 2025)
</h2>

<h3>
  <a name="primitive-types-in-patterns-second-preview" href="#primitive-types-in-patterns-second-preview">
  </a>
  Primitive Types in Patterns (Second Preview)
</h3>

<p>Refinements to primitive pattern matching.</p>

<h3>
  <a name="module-import-declarations-second-preview" href="#module-import-declarations-second-preview">
  </a>
  Module Import Declarations (Second Preview)
</h3>

<p>Enhanced module imports.</p>

<h3>
  <a name="statements-before-super-standard" href="#statements-before-super-standard">
  </a>
  Statements before super() (Standard)
</h3>

<p>Constructor flexibility is now standard:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="kd">public</span> <span class="kd">class</span> <span class="nc">User</span> <span class="kd">extends</span> <span class="nc">Entity</span> <span class="o">{</span>
    <span class="kd">private</span> <span class="kd">final</span> <span class="nc">String</span> <span class="n">normalizedName</span><span class="o">;</span>

    <span class="kd">public</span> <span class="nf">User</span><span class="o">(</span><span class="nc">String</span> <span class="n">name</span><span class="o">)</span> <span class="o">{</span>
        <span class="c1">// Logic before super()</span>
        <span class="n">normalizedName</span> <span class="o">=</span> <span class="n">name</span><span class="o">.</span><span class="na">trim</span><span class="o">().</span><span class="na">toLowerCase</span><span class="o">();</span>
        <span class="kd">super</span><span class="o">(</span><span class="n">normalizedName</span><span class="o">);</span>
    <span class="o">}</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="flexible-constructor-bodies-third-preview" href="#flexible-constructor-bodies-third-preview">
  </a>
  Flexible Constructor Bodies (Third Preview)
</h3>

<p>Continued enhancements.</p>

<h3>
  <a name="markdown-documentation-comments-second-preview" href="#markdown-documentation-comments-second-preview">
  </a>
  Markdown Documentation Comments (Second Preview)
</h3>

<p>Improved Markdown support in docs.</p>

<h3>
  <a name="late-barrier-expansion-for-g1-experimental" href="#late-barrier-expansion-for-g1-experimental">
  </a>
  Late Barrier Expansion for G1 (Experimental)
</h3>

<p>Optimize G1 garbage collector performance.</p>

<h3>
  <a name="new-classfile-api-methods" href="#new-classfile-api-methods">
  </a>
  New Class-File API Methods
</h3>

<p>Additional utilities for class file processing.</p>


<hr>

<h2>
  <a name="java-25-september-2025" href="#java-25-september-2025">
  </a>
  Java 25 (September 2025)
</h2>

<p><strong>Note:</strong> Java 25 is scheduled for release in September 2025. The features listed here are based on current JEPs and proposals, but may change before the final release.</p>

<h3>
  <a name="string-templates-final" href="#string-templates-final">
  </a>
  String Templates (Final)
</h3>

<p>String templates expected to be finalized:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="nc">String</span> <span class="n">name</span> <span class="o">=</span> <span class="s">"Alice"</span><span class="o">;</span>
<span class="kt">int</span> <span class="n">score</span> <span class="o">=</span> <span class="mi">95</span><span class="o">;</span>
<span class="nc">String</span> <span class="n">message</span> <span class="o">=</span> <span class="no">STR</span><span class="o">.</span><span class="s">"Student \{name} scored \{score}%"</span><span class="o">;</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="simplified-main-methods-final" href="#simplified-main-methods-final">
  </a>
  Simplified Main Methods (Final)
</h3>

<p>Simplified Java learning:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="c1">// Simple program</span>
<span class="kt">void</span> <span class="nf">main</span><span class="o">()</span> <span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Getting started with Java!"</span><span class="o">);</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="value-objects-preview-expected" href="#value-objects-preview-expected">
  </a>
  Value Objects (Preview Expected)
</h3>

<p>Memory-efficient, immutable objects:<br>
</p>

<div class="highlight js-code-highlight">
<pre class="highlight java"><code><span class="n">value</span> <span class="kd">class</span> <span class="nc">Point</span> <span class="o">{</span>
    <span class="kt">int</span> <span class="n">x</span><span class="o">;</span>
    <span class="kt">int</span> <span class="n">y</span><span class="o">;</span>
<span class="o">}</span>
</code></pre>
<div class="highlight__panel js-actions-panel">
<div class="highlight__panel-action js-fullscreen-code-action">
    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-on"><title>Enter fullscreen mode</title>
    <path d="M16 3h6v6h-2V5h-4V3zM2 3h6v2H4v4H2V3zm18 16v-4h2v6h-6v-2h4zM4 19h4v2H2v-6h2v4z"></path>
</svg>

    <svg xmlns="http://www.w3.org/2000/svg" width="20px" height="20px" viewBox="0 0 24 24" class="highlight-action crayons-icon highlight-action--fullscreen-off"><title>Exit fullscreen mode</title>
    <path d="M18 7h4v2h-6V3h2v4zM8 9H2V7h4V3h2v6zm10 8v4h-2v-6h6v2h-4zM8 15v6H6v-4H2v-2h6z"></path>
</svg>

</div>
</div>
</div>



<h3>
  <a name="enhanced-pattern-matching" href="#enhanced-pattern-matching">
  </a>
  Enhanced Pattern Matching
</h3>

<p>More sophisticated pattern matching capabilities.</p>

<h3>
  <a name="project-leyden-previews" href="#project-leyden-previews">
  </a>
  Project Leyden Previews
</h3>

<p>Ahead-of-time compilation features for improved startup and performance.</p>

<h3>
  <a name="additional-vector-api-enhancements" href="#additional-vector-api-enhancements">
  </a>
  Additional Vector API Enhancements
</h3>

<p>Further performance improvements for vector operations.</p>

<h3>
  <a name="expanded-foreign-function-support" href="#expanded-foreign-function-support">
  </a>
  Expanded Foreign Function Support
</h3>

<p>More capabilities for native interoperability.</p>


<hr>

<h2>
  <a name="migration-guide-key-considerations" href="#migration-guide-key-considerations">
  </a>
  Migration Guide: Key Considerations
</h2>

<h3>
  <a name="moving-from-java-8-to-java-11" href="#moving-from-java-8-to-java-11">
  </a>
  Moving from Java 8 to Java 11
</h3>

<ol>
<li>
<strong>Module system</strong> - Reorganize dependencies</li>
<li>
<strong>Deprecated API removal</strong> - Update Java EE references</li>
<li>
<strong>HTTP Client</strong> - Migrate from old APIs</li>
<li>
<strong>String methods</strong> - Leverage new utilities</li>
</ol>

<h3>
  <a name="moving-from-java-11-to-java-17" href="#moving-from-java-11-to-java-17">
  </a>
  Moving from Java 11 to Java 17
</h3>

<ol>
<li>
<strong>Sealed classes</strong> - Control inheritance hierarchy</li>
<li>
<strong>Pattern matching</strong> - Simplify type checks</li>
<li>
<strong>Records</strong> - Replace verbose POJOs</li>
<li>
<strong>Text blocks</strong> - Improve string readability</li>
</ol>

<h3>
  <a name="moving-from-java-17-to-java-21" href="#moving-from-java-17-to-java-21">
  </a>
  Moving from Java 17 to Java 21
</h3>

<ol>
<li>
<strong>Virtual threads</strong> - Scale concurrent applications</li>
<li>
<strong>Sequenced collections</strong> - Use ordered collection APIs</li>
<li>
<strong>Pattern matching for switch</strong> - Modernize control flow</li>
<li>
<strong>String templates</strong> - Safer string composition</li>
</ol>

<h3>
  <a name="moving-to-java-22" href="#moving-to-java-22">
  </a>
  Moving to Java 22+
</h3>

<ol>
<li>
<strong>FFM API</strong> - Replace JNI with modern native calls</li>
<li>
<strong>Unnamed patterns</strong> - Simplify code with <code>_</code>
</li>
<li>
<strong>Class-File API</strong> - Dynamic class generation</li>
<li>
<strong>Stream gatherers</strong> - Custom stream operations</li>
</ol>


<hr>

<h2>
  <a name="performance-evolution" href="#performance-evolution">
  </a>
  Performance Evolution
</h2>

<h3>
  <a name="garbage-collection-improvements" href="#garbage-collection-improvements">
  </a>
  Garbage Collection Improvements
</h3>

<ul>
<li>
<strong>G1GC</strong> (Java 9+): Default GC with better throughput</li>
<li>
<strong>ZGC</strong> (Java 15+): Sub-millisecond pause times</li>
<li>
<strong>Shenandoah</strong> (Java 15+): Low-pause-time GC</li>
<li>
<strong>Generational ZGC</strong> (Java 21+): Improved memory management</li>
</ul>

<h3>
  <a name="startup-and-footprint" href="#startup-and-footprint">
  </a>
  Startup and Footprint
</h3>

<ul>
<li>
<strong>CDS/AppCDS</strong>: Class data sharing</li>
<li>
<strong>JLink</strong>: Custom runtime images</li>
<li>
<strong>Project Leyden</strong>: Ahead-of-time compilation (upcoming)</li>
</ul>

<h3>
  <a name="concurrency" href="#concurrency">
  </a>
  Concurrency
</h3>

<ul>
<li>
<strong>Virtual threads</strong>: Million-thread scalability</li>
<li>
<strong>Structured concurrency</strong>: Safer multithreading</li>
<li>
<strong>Scoped values</strong>: Efficient thread-local alternatives</li>
</ul>


<hr>

<h2>
  <a name="best-practices-by-version" href="#best-practices-by-version">
  </a>
  Best Practices by Version
</h2>

<h3>
  <a name="java-811-foundation" href="#java-811-foundation">
  </a>
  Java 8-11: Foundation
</h3>

<ul>
<li>Use lambda expressions and streams</li>
<li>Embrace Optional for null handling</li>
<li>Adopt new Date/Time API</li>
<li>Leverage HTTP Client</li>
</ul>

<h3>
  <a name="java-1217-modernization" href="#java-1217-modernization">
  </a>
  Java 12-17: Modernization
</h3>

<ul>
<li>Create records for data classes</li>
<li>Use text blocks for multi-line strings</li>
<li>Implement sealed classes for closed hierarchies</li>
<li>Apply pattern matching to reduce casting</li>
</ul>

<h3>
  <a name="java-1821-advanced-features" href="#java-1821-advanced-features">
  </a>
  Java 18-21: Advanced Features
</h3>

<ul>
<li>Adopt virtual threads for high concurrency</li>
<li>Use sequenced collections for ordered data</li>
<li>Leverage pattern matching in switch</li>
<li>Implement structured concurrency patterns</li>
</ul>

<h3>
  <a name="java-22-cutting-edge" href="#java-22-cutting-edge">
  </a>
  Java 22+: Cutting Edge
</h3>

<ul>
<li>Integrate FFM API for native code</li>
<li>Use unnamed patterns for cleaner code</li>
<li>Apply stream gatherers for custom operations</li>
<li>Utilize class-file API for metaprogramming</li>
</ul>


<hr>

<h2>
  <a name="conclusion" href="#conclusion">
  </a>
  Conclusion
</h2>

<p>Java's evolution from version 8 to 25 represents a remarkable transformation. The language has become more expressive, performant, and developer-friendly while maintaining backward compatibility. Key themes include:</p>

<ol>
<li>
<strong>Functional Programming</strong>: Lambdas, streams, and functional interfaces</li>
<li>
<strong>Modern Syntax</strong>: Records, text blocks, pattern matching, and string templates</li>
<li>
<strong>Concurrency</strong>: Virtual threads and structured concurrency</li>
<li>
<strong>Performance</strong>: Advanced GC, AOT compilation, and optimizations</li>
<li>
<strong>Interoperability</strong>: Foreign Function &amp; Memory API</li>
<li>
<strong>Developer Experience</strong>: Simplified syntax, better error messages, REPL</li>
</ol>

<p>Each version builds on previous innovations, making Java a powerful choice for modern application development. Whether you're maintaining legacy systems or building new applications, understanding these features helps you write better, more maintainable code.</p>

<p>The journey from Java 8's revolutionary lambdas to Java 25's value objects and ahead-of-time compilation shows a language that continuously evolves while respecting its commitment to backward compatibility and enterprise reliability.</p>


            </div>

              <div class="below-post-bb body-billboard-container" data-async-url="/nk_sk_6f24fdd730188b284bf/the-complete-guide-to-java-evolution-java-8-to-java-25-5gik/bmar11/post_body_bottom"><div>    <style>
  .long-bb-body {
    max-height: calc(100vh - 200px);
    overflow: hidden;
  }
  .long-bb-bottom {
    height: 180px;
    background: linear-gradient(to top, var(--card-bg), transparent);
    margin-top: -180px;
    position:relative;
    z-index: 5;
  }
</style>

  <div class="crayons-card crayons-card--secondary crayons-bb js-billboard body-billboard mb-2 mt-6" style="" data-display-unit="" data-id="262287" data-category-click="click" data-category-impression="impression" data-context-type="article" data-dismissal-sku="" data-special="nothing" data-article-id="2913894" data-type-of="partner" data-impression-recorded="true">
    <div class="crayons-story__top flex">
      <div class="crayons-bb__header relative">
    <div class="flex">
        <a href="/guardsquare" target="_blank" rel="noopener" class="flex">
          <img width="24" height="24" class="radius-default crayons-bb__image" src="https://media2.dev.to/dynamic/image/width=64,height=64,fit=cover,gravity=auto,format=auto/https%3A%2F%2Fdev-to-uploads.s3.amazonaws.com%2Fuploads%2Forganization%2Fprofile_image%2F11162%2Fe5b3f7d6-ec68-49b7-bd66-72b8e070a2cf.png" alt="profile" loading="lazy">
          <div class="crayons-bb__title ml-2 fs-s fw-medium">Guardsquare</div>
        </a>
        <span class="crayons-bb__indicator c-indicator c-indicator--subtle c-indicator--round fs-2xs fw-medium ml-2 py-1 px-2">Promoted</span>
    </div>

  <button id="sponsorship-dropdown-trigger-262287" aria-controls="sponsorship-dropdown-262287" aria-expanded="false" aria-haspopup="true" class="dropBtn crayons-bb__dropdown crayons-btn crayons-btn--s crayons-btn--ghost crayons-btn--icon" aria-label="Toggle dropdown menu" data-dropdown-initialized="true" data-initialized="true">
      <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" role="img" aria-labelledby="a5ugzybvnmxhm159q3k73ts2sgav3u68" class="crayons-icon pointer-events-none"><title id="a5ugzybvnmxhm159q3k73ts2sgav3u68">Dropdown menu</title>
    <path fill-rule="evenodd" clip-rule="evenodd" d="M8.25 12a1.5 1.5 0 11-3 0 1.5 1.5 0 013 0zm5.25 0a1.5 1.5 0 11-3 0 1.5 1.5 0 013 0zm3.75 1.5a1.5 1.5 0 100-3 1.5 1.5 0 000 3z"></path>
</svg>

  </button>

  <div id="sponsorship-dropdown-262287" class="crayons-dropdown bb-dropdown right-0">
    <ul class="list-none m-0">
        <li>
          <a class="crayons-link crayons-link--block" href="/billboards">
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="16" height="16" role="img" aria-hidden="true" class="crayons-icon c-btn__icon">
    <path d="M12 22C6.477 22 2 17.523 2 12S6.477 2 12 2s10 4.477 10 10-4.477 10-10 10zm0-2a8 8 0 100-16 8 8 0 000 16zM11 7h2v2h-2V7zm0 4h2v6h-2v-6z"></path>
</svg>

            What's a billboard?
          </a>
        </li>
      <li>
        <a class="crayons-link crayons-link--block" href="/settings/customization#sponsors">
          <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 24 24" fill="none" role="img" aria-hidden="true" class="crayons-icon c-btn__icon">
    <path d="M3.34 16.9999C2.91727 16.2689 2.58866 15.4874 2.362 14.6739C2.85531 14.423 3.26959 14.0406 3.55903 13.5688C3.84846 13.0971 4.00176 12.5545 4.00197 12.0011C4.00218 11.4476 3.84928 10.9049 3.5602 10.4329C3.27112 9.961 2.85712 9.57821 2.364 9.32694C2.81604 7.69243 3.67673 6.1999 4.865 4.98994C5.32909 5.29167 5.86762 5.45911 6.42098 5.47373C6.97434 5.48834 7.52095 5.34958 8.00033 5.07278C8.47971 4.79598 8.87315 4.39194 9.13713 3.90539C9.4011 3.41883 9.52531 2.86872 9.496 2.31594C11.1381 1.89157 12.8612 1.89226 14.503 2.31795C14.474 2.87071 14.5984 3.42073 14.8626 3.90715C15.1268 4.39357 15.5204 4.79742 15.9998 5.07401C16.4793 5.35059 17.0259 5.48913 17.5793 5.4743C18.1326 5.45946 18.671 5.29183 19.135 4.98994C19.714 5.57994 20.228 6.25095 20.66 6.99995C21.093 7.74895 21.417 8.52995 21.638 9.32595C21.1447 9.57685 20.7304 9.95932 20.441 10.4311C20.1515 10.9028 19.9982 11.4454 19.998 11.9988C19.9978 12.5523 20.1507 13.095 20.4398 13.5669C20.7289 14.0389 21.1429 14.4217 21.636 14.6729C21.184 16.3075 20.3233 17.8 19.135 19.0099C18.6709 18.7082 18.1324 18.5408 17.579 18.5262C17.0257 18.5115 16.479 18.6503 15.9997 18.9271C15.5203 19.2039 15.1268 19.6079 14.8629 20.0945C14.5989 20.5811 14.4747 21.1312 14.504 21.6839C12.8619 22.1083 11.1388 22.1076 9.497 21.6819C9.52605 21.1292 9.4016 20.5792 9.13742 20.0927C8.87324 19.6063 8.47964 19.2025 8.00017 18.9259C7.5207 18.6493 6.97405 18.5108 6.42073 18.5256C5.8674 18.5404 5.32896 18.7081 4.865 19.0099C4.27399 18.4069 3.76159 17.7315 3.34 16.9999ZM9 17.1959C10.0656 17.8106 10.8668 18.797 11.25 19.9659C11.749 20.0129 12.25 20.0139 12.749 19.9669C13.1324 18.7978 13.934 17.8114 15 17.1969C16.0652 16.5806 17.3205 16.3794 18.525 16.6319C18.815 16.2239 19.065 15.7889 19.273 15.3339C18.4524 14.4174 17.9991 13.2302 18 11.9999C18 10.7399 18.47 9.56295 19.273 8.66595C19.0635 8.21109 18.8125 7.77658 18.523 7.36795C17.3193 7.62025 16.0648 7.41942 15 6.80395C13.9344 6.18932 13.1332 5.20293 12.75 4.03394C12.251 3.98694 11.75 3.98594 11.251 4.03294C10.8676 5.20209 10.066 6.1885 9 6.80295C7.93478 7.41926 6.67948 7.62046 5.475 7.36795C5.18556 7.77623 4.93513 8.21081 4.727 8.66595C5.54757 9.5825 6.00088 10.7697 6 11.9999C6 13.2599 5.53 14.4369 4.727 15.3339C4.93647 15.7888 5.18754 16.2233 5.477 16.6319C6.68072 16.3796 7.93521 16.5805 9 17.1959ZM12 14.9999C11.2044 14.9999 10.4413 14.6839 9.87868 14.1213C9.31607 13.5587 9 12.7956 9 11.9999C9 11.2043 9.31607 10.4412 9.87868 9.87862C10.4413 9.31602 11.2044 8.99995 12 8.99995C12.7956 8.99995 13.5587 9.31602 14.1213 9.87862C14.6839 10.4412 15 11.2043 15 11.9999C15 12.7956 14.6839 13.5587 14.1213 14.1213C13.5587 14.6839 12.7956 14.9999 12 14.9999ZM12 12.9999C12.2652 12.9999 12.5196 12.8946 12.7071 12.7071C12.8946 12.5195 13 12.2652 13 11.9999C13 11.7347 12.8946 11.4804 12.7071 11.2928C12.5196 11.1053 12.2652 10.9999 12 10.9999C11.7348 10.9999 11.4804 11.1053 11.2929 11.2928C11.1054 11.4804 11 11.7347 11 11.9999C11 12.2652 11.1054 12.5195 11.2929 12.7071C11.4804 12.8946 11.7348 12.9999 12 12.9999Z" fill="black"></path>
</svg>

          Manage preferences
        </a>
      </li>
      <hr>
      <li>
        <a class="crayons-link crayons-link--block" href="/report-abuse?billboard=262287">
          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="16" height="16" role="img" aria-hidden="true" class="crayons-icon c-btn__icon">
    <path d="M12.382 3a1 1 0 0 1 .894.553L14 5h6a1 1 0 0 1 1 1v11a1 1 0 0 1-1 1h-6.382a1 1 0 0 1-.894-.553L12 16H5v6H3V3h9.382Zm-.618 2H5v9h8.236l1 2H19V7h-6.236l-1-2Z"></path>
</svg>

          Report billboard
        </a>
      </li>
    </ul>
  </div>
</div>

    </div>
    <div class="p-1 pt-3 text-styles text-styles--billboard long-bb-body">
      <p><a href="https://hubs.la/Q046c36v0?bb=262287" target="_blank" rel="noopener noreferrer"><img src="https://media2.dev.to/dynamic/image/width=775%2Cheight=%2Cfit=scale-down%2Cgravity=auto%2Cformat=auto/https%3A%2F%2Fi.imgur.com%2FouQCf5p.jpeg" alt="Guardsquare image" width="1080" height="1080" loading="lazy"></a></p>
<h2>  <a name="mobile-app-security-predictions-in-2026-how-you-can-stay-ahead-of-threats-and-attacks" href="#mobile-app-security-predictions-in-2026-how-you-can-stay-ahead-of-threats-and-attacks">  </a>  <a href="https://hubs.la/Q046c36v0?bb=262287" target="_blank" rel="noopener noreferrer">Mobile App Security Predictions in 2026: How You Can Stay Ahead of Threats and Attacks</a>
</h2>
<p>The mobile app threat landscape is constantly changing, with attackers continuously evolving techniques. In 2026, staying one step ahead of attackers will be crucial. With Guardsquare, achieve comprehensive mobile app security without compromises.</p>
<p><a href="https://hubs.la/Q046c36v0?bb=262287" class="ltag_cta ltag_cta--branded" role="button" target="_blank" rel="noopener noreferrer">Read more</a></p>
    </div>
      <div class="long-bb-bottom"></div>
      <div class="crayons-card__footer">
        <button class="c-cta c-cta--branded billboard-readmore-button">
          Read More
        </button>
      </div>
  </div>

</div></div>
          </div>
