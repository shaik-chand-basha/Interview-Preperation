<div class="Markdownstyles-sc-dd1icp-0 bkuoMs MarkdownStyles__StyledMarkdown-sc-ee165f5-0 bycxaT"><h3 id="introduction"><a href="#introduction" onclick="navigator.clipboard.writeText(this.href);">Introduction</a><a class="hash-anchor" href="#introduction" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h3>
<p>If you’re interviewing for a Java programming role, then your coding skills will probably be tested. Whether you’re a beginner in Java or an expert programmer, this article provides some common Java interview questions and answers to help you prepare.</p>
<details class="collapsible" open="">
<summary>
<h2 id="1-how-do-you-reverse-a-string-in-java"><a href="#1-how-do-you-reverse-a-string-in-java" onclick="navigator.clipboard.writeText(this.href);">1. How do you reverse a string in Java?</a><a class="hash-anchor" href="#1-how-do-you-reverse-a-string-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>There is no <code>reverse()</code> utility method in the <code>String</code> class. However, you can create a character array from the string and then iterate it from the end to the start. You can append the characters to a string builder and finally return the reversed string.</p>
<p>The following example code shows one way to reverse a string:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">StringPrograms</span> <span class="token punctuation">{</span>

 <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">String</span> str <span class="token operator">=</span> <span class="token string">"123"</span><span class="token punctuation">;</span>

  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token function">reverse</span><span class="token punctuation">(</span>str<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

 <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token class-name">String</span> <span class="token function">reverse</span><span class="token punctuation">(</span><span class="token class-name">String</span> in<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">if</span> <span class="token punctuation">(</span>in <span class="token operator">==</span> <span class="token keyword">null</span><span class="token punctuation">)</span>
   <span class="token keyword">throw</span> <span class="token keyword">new</span> <span class="token class-name">IllegalArgumentException</span><span class="token punctuation">(</span><span class="token string">"Null is not valid input"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token class-name">StringBuilder</span> out <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">StringBuilder</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token keyword">char</span><span class="token punctuation">[</span><span class="token punctuation">]</span> chars <span class="token operator">=</span> in<span class="token punctuation">.</span><span class="token function">toCharArray</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">=</span> chars<span class="token punctuation">.</span>length <span class="token operator">-</span> <span class="token number">1</span><span class="token punctuation">;</span> i <span class="token operator">&gt;=</span> <span class="token number">0</span><span class="token punctuation">;</span> i<span class="token operator">--</span><span class="token punctuation">)</span>
   out<span class="token punctuation">.</span><span class="token function">append</span><span class="token punctuation">(</span>chars<span class="token punctuation">[</span>i<span class="token punctuation">]</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token keyword">return</span> out<span class="token punctuation">.</span><span class="token function">toString</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>Bonus points for adding <code>null</code> check in the method and using <code>StringBuilder</code> for appending the characters. Note that the indexing in Java starts from 0, so you need to start at <code>chars.length - 1</code> in the <code>for</code> loop.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="2-how-do-you-swap-two-numbers-without-using-a-third-variable-in-java"><a href="#2-how-do-you-swap-two-numbers-without-using-a-third-variable-in-java" onclick="navigator.clipboard.writeText(this.href);">2. How do you swap two numbers without using a third variable in Java?</a><a class="hash-anchor" href="#2-how-do-you-swap-two-numbers-without-using-a-third-variable-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>Swapping numbers without using a third variable is a three-step process that’s better visualized in code:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-bash"><code>b <span class="token operator">=</span> b + a<span class="token punctuation">;</span> // now b is <span class="token function">sum</span> of both the numbers
a <span class="token operator">=</span> b - a<span class="token punctuation">;</span> // b - a <span class="token operator">=</span> <span class="token punctuation">(</span>b + a<span class="token punctuation">)</span> - a <span class="token operator">=</span> b <span class="token punctuation">(</span>a is swapped<span class="token punctuation">)</span>
b <span class="token operator">=</span> b - a<span class="token punctuation">;</span> // <span class="token punctuation">(</span>b + a<span class="token punctuation">)</span> - b <span class="token operator">=</span> a <span class="token punctuation">(</span>b is swapped<span class="token punctuation">)</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>The following example code shows one way to implement the number swap method:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">SwapNumbers</span> <span class="token punctuation">{</span>

<span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token keyword">int</span> a <span class="token operator">=</span> <span class="token number">10</span><span class="token punctuation">;</span>
 <span class="token keyword">int</span> b <span class="token operator">=</span> <span class="token number">20</span><span class="token punctuation">;</span>

    <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"a is "</span> <span class="token operator">+</span> a <span class="token operator">+</span> <span class="token string">" and b is "</span> <span class="token operator">+</span> b<span class="token punctuation">)</span><span class="token punctuation">;</span>

 a <span class="token operator">=</span> a <span class="token operator">+</span> b<span class="token punctuation">;</span>
 b <span class="token operator">=</span> a <span class="token operator">-</span> b<span class="token punctuation">;</span>
 a <span class="token operator">=</span> a <span class="token operator">-</span> b<span class="token punctuation">;</span>

    <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"After swapping, a is "</span> <span class="token operator">+</span> a <span class="token operator">+</span> <span class="token string">" and b is "</span> <span class="token operator">+</span> b<span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>

<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>The output shows that the integer values are swapped:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-bash"><code><div class="secondary-code-label" title="Output">Output</div>a is <span class="token number">10</span> and b is <span class="token number">20</span>
After swapping, a is <span class="token number">20</span> and b is <span class="token number">10</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="3-write-a-java-program-to-check-if-a-vowel-is-present-in-a-string"><a href="#3-write-a-java-program-to-check-if-a-vowel-is-present-in-a-string" onclick="navigator.clipboard.writeText(this.href);">3. Write a Java program to check if a vowel is present in a string</a><a class="hash-anchor" href="#3-write-a-java-program-to-check-if-a-vowel-is-present-in-a-string" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The following example code shows how to use a regular expression to check whether the string contains vowels:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">StringContainsVowels</span> <span class="token punctuation">{</span>

 <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token function">stringContainsVowels</span><span class="token punctuation">(</span><span class="token string">"Hello"</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span> <span class="token comment">// true</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token function">stringContainsVowels</span><span class="token punctuation">(</span><span class="token string">"TV"</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span> <span class="token comment">// false</span>
 <span class="token punctuation">}</span>

 <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">boolean</span> <span class="token function">stringContainsVowels</span><span class="token punctuation">(</span><span class="token class-name">String</span> input<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">return</span> input<span class="token punctuation">.</span><span class="token function">toLowerCase</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">matches</span><span class="token punctuation">(</span><span class="token string">".*[aeiou].*"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="4-write-a-java-program-to-check-if-the-given-number-is-a-prime-number"><a href="#4-write-a-java-program-to-check-if-the-given-number-is-a-prime-number" onclick="navigator.clipboard.writeText(this.href);">4. Write a Java program to check if the given number is a prime number</a><a class="hash-anchor" href="#4-write-a-java-program-to-check-if-the-given-number-is-a-prime-number" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>You can write a program to divide the given number <code>n</code>, by a number from 2 to <code>n</code>/2 and check the remainder. If the remainder is 0, then it’s not a prime number. The following example code shows one way to check if a given number is a Prime number:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">PrimeNumberCheck</span> <span class="token punctuation">{</span>

 <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token function">isPrime</span><span class="token punctuation">(</span><span class="token number">19</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span> <span class="token comment">// true</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token function">isPrime</span><span class="token punctuation">(</span><span class="token number">49</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span> <span class="token comment">// false</span>
 <span class="token punctuation">}</span>

 <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">boolean</span> <span class="token function">isPrime</span><span class="token punctuation">(</span><span class="token keyword">int</span> n<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">if</span> <span class="token punctuation">(</span>n <span class="token operator">==</span> <span class="token number">0</span> <span class="token operator">||</span> n <span class="token operator">==</span> <span class="token number">1</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
   <span class="token keyword">return</span> <span class="token boolean">false</span><span class="token punctuation">;</span>
  <span class="token punctuation">}</span>
  <span class="token keyword">if</span> <span class="token punctuation">(</span>n <span class="token operator">==</span> <span class="token number">2</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
   <span class="token keyword">return</span> <span class="token boolean">true</span><span class="token punctuation">;</span>
  <span class="token punctuation">}</span>
  <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">=</span> <span class="token number">2</span><span class="token punctuation">;</span> i <span class="token operator">&lt;=</span> n <span class="token operator">/</span> <span class="token number">2</span><span class="token punctuation">;</span> i<span class="token operator">++</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
   <span class="token keyword">if</span> <span class="token punctuation">(</span>n <span class="token operator">%</span> i <span class="token operator">==</span> <span class="token number">0</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
    <span class="token keyword">return</span> <span class="token boolean">false</span><span class="token punctuation">;</span>
   <span class="token punctuation">}</span>
  <span class="token punctuation">}</span>

  <span class="token keyword">return</span> <span class="token boolean">true</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>Although this program works, it’s not very memory and time-efficient. Consider that, for a given number <code>N</code>, if there is a prime number <code>M</code> between <code>2</code> to <code>√N</code> (square root of N) that evenly divides it, then <code>N</code> is not a prime number.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="5-write-a-java-program-to-print-a-fibonacci-sequence-using-recursion"><a href="#5-write-a-java-program-to-print-a-fibonacci-sequence-using-recursion" onclick="navigator.clipboard.writeText(this.href);">5. Write a Java program to print a Fibonacci sequence using recursion</a><a class="hash-anchor" href="#5-write-a-java-program-to-print-a-fibonacci-sequence-using-recursion" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>A Fibonacci sequence is one in which each number is the sum of the two previous numbers. In this example, the sequence begins with <code>0</code> and <code>1</code>. The following example code shows how to use a <code>for</code> loop to print a Fibonacci sequence:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">PrintFibonacci</span> <span class="token punctuation">{</span>

 <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">printFibonacciSequence</span><span class="token punctuation">(</span><span class="token keyword">int</span> count<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">int</span> a <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span>
  <span class="token keyword">int</span> b <span class="token operator">=</span> <span class="token number">1</span><span class="token punctuation">;</span>
  <span class="token keyword">int</span> c <span class="token operator">=</span> <span class="token number">1</span><span class="token punctuation">;</span>

  <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">=</span> <span class="token number">1</span><span class="token punctuation">;</span> i <span class="token operator">&lt;=</span> count<span class="token punctuation">;</span> i<span class="token operator">++</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
   <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">print</span><span class="token punctuation">(</span>a <span class="token operator">+</span> <span class="token string">", "</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

            a <span class="token operator">=</span> b<span class="token punctuation">;</span>
   b <span class="token operator">=</span> c<span class="token punctuation">;</span>
   c <span class="token operator">=</span> a <span class="token operator">+</span> b<span class="token punctuation">;</span>
  <span class="token punctuation">}</span>
 <span class="token punctuation">}</span>

 <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
     <span class="token function">printFibonacciSequence</span><span class="token punctuation">(</span><span class="token number">10</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-bash"><code><div class="secondary-code-label" title="Output">Output</div>0, <span class="token number">1</span>, <span class="token number">1</span>, <span class="token number">2</span>, <span class="token number">3</span>, <span class="token number">5</span>, <span class="token number">8</span>, <span class="token number">13</span>, <span class="token number">21</span>, <span class="token number">34</span>,
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>You can also use recursion to print a Fibonacci sequence, because the Fibonacci number is generated by adding the previous two numbers in the sequence:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-bash"><code>F<span class="token punctuation">(</span>N<span class="token punctuation">)</span> <span class="token operator">=</span> F<span class="token punctuation">(</span>N-1<span class="token punctuation">)</span> + F<span class="token punctuation">(</span>N-2<span class="token punctuation">)</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>The following example class shows how to use recursion to calculate a Fibonacci sequence that is 10 numbers long:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">PrintFibonacciRecursive</span> <span class="token punctuation">{</span>

    <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">int</span> <span class="token function">fibonacci</span><span class="token punctuation">(</span><span class="token keyword">int</span> count<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">if</span> <span class="token punctuation">(</span>count <span class="token operator">&lt;=</span> <span class="token number">1</span><span class="token punctuation">)</span>
   <span class="token keyword">return</span> count<span class="token punctuation">;</span>

  <span class="token keyword">return</span> <span class="token function">fibonacci</span><span class="token punctuation">(</span>count <span class="token operator">-</span> <span class="token number">1</span><span class="token punctuation">)</span> <span class="token operator">+</span> <span class="token function">fibonacci</span><span class="token punctuation">(</span>count <span class="token operator">-</span> <span class="token number">2</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

 <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span> args<span class="token punctuation">[</span><span class="token punctuation">]</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
     <span class="token keyword">int</span> seqLength <span class="token operator">=</span> <span class="token number">10</span><span class="token punctuation">;</span>

     <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">print</span><span class="token punctuation">(</span><span class="token string">"A Fibonacci sequence of "</span> <span class="token operator">+</span> seqLength <span class="token operator">+</span> <span class="token string">" numbers: "</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

     <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span> i <span class="token operator">&lt;</span> seqLength<span class="token punctuation">;</span> i<span class="token operator">++</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
           <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">print</span><span class="token punctuation">(</span><span class="token function">fibonacci</span><span class="token punctuation">(</span>i<span class="token punctuation">)</span> <span class="token operator">+</span> <span class="token string">" "</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
     <span class="token punctuation">}</span>
   <span class="token punctuation">}</span>

<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-bash"><code><div class="secondary-code-label" title="Output">Output</div>A Fibonacci sequence of <span class="token number">10</span> numbers: <span class="token number">0</span> <span class="token number">1</span> <span class="token number">1</span> <span class="token number">2</span> <span class="token number">3</span> <span class="token number">5</span> <span class="token number">8</span> <span class="token number">13</span> <span class="token number">21</span> <span class="token number">34</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="6-how-do-you-check-if-a-list-of-integers-contains-only-odd-numbers-in-java"><a href="#6-how-do-you-check-if-a-list-of-integers-contains-only-odd-numbers-in-java" onclick="navigator.clipboard.writeText(this.href);">6. How do you check if a list of integers contains only odd numbers in Java?</a><a class="hash-anchor" href="#6-how-do-you-check-if-a-list-of-integers-contains-only-odd-numbers-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>You can use a <code>for</code> loop and check whether each element is odd:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">boolean</span> <span class="token function">onlyOddNumbers</span><span class="token punctuation">(</span><span class="token class-name">List</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">Integer</span><span class="token punctuation">&gt;</span></span> list<span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">:</span> list<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">if</span> <span class="token punctuation">(</span>i <span class="token operator">%</span> <span class="token number">2</span> <span class="token operator">==</span> <span class="token number">0</span><span class="token punctuation">)</span>
   <span class="token keyword">return</span> <span class="token boolean">false</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

 <span class="token keyword">return</span> <span class="token boolean">true</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>If the list is large, you can use parallel stream for faster processing, as shown in the following example code:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">boolean</span> <span class="token function">onlyOddNumbers</span><span class="token punctuation">(</span><span class="token class-name">List</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">Integer</span><span class="token punctuation">&gt;</span></span> list<span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token keyword">return</span> list
   <span class="token punctuation">.</span><span class="token function">parallelStream</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token comment">// parallel stream for faster processing</span>
   <span class="token punctuation">.</span><span class="token function">anyMatch</span><span class="token punctuation">(</span>x <span class="token operator">-&gt;</span> x <span class="token operator">%</span> <span class="token number">2</span> <span class="token operator">!=</span> <span class="token number">0</span><span class="token punctuation">)</span><span class="token punctuation">;</span> <span class="token comment">// return as soon as any elements match the condition</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>To learn more about the math behind determining if an integer is odd, refer to the <a href="https://en.wikipedia.org/wiki/Modulo_operation" rel="ugc nofollow noopener" target="_blank">Modulo operation on Wikipedia</a>.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="7-how-do-you-check-whether-a-string-is-a-palindrome-in-java"><a href="#7-how-do-you-check-whether-a-string-is-a-palindrome-in-java" onclick="navigator.clipboard.writeText(this.href);">7. How do you check whether a string is a palindrome in Java?</a><a class="hash-anchor" href="#7-how-do-you-check-whether-a-string-is-a-palindrome-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>A palindrome string is the same string backwards or forwards. To check for a palindrome, you can reverse the input string and check if the result is equal to the input. The following example code shows how to use the <code>String charAt(int index)</code> method to check for palindrome strings:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">boolean</span> <span class="token function">checkPalindromeString</span><span class="token punctuation">(</span><span class="token class-name">String</span> input<span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token keyword">boolean</span> result <span class="token operator">=</span> <span class="token boolean">true</span><span class="token punctuation">;</span>
 <span class="token keyword">int</span> length <span class="token operator">=</span> input<span class="token punctuation">.</span><span class="token function">length</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

 <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span> i <span class="token operator">&lt;</span> length<span class="token operator">/</span><span class="token number">2</span><span class="token punctuation">;</span> i<span class="token operator">++</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">if</span> <span class="token punctuation">(</span>input<span class="token punctuation">.</span><span class="token function">charAt</span><span class="token punctuation">(</span>i<span class="token punctuation">)</span> <span class="token operator">!=</span> input<span class="token punctuation">.</span><span class="token function">charAt</span><span class="token punctuation">(</span>length <span class="token operator">-</span> i <span class="token operator">-</span> <span class="token number">1</span><span class="token punctuation">)</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
   result <span class="token operator">=</span> <span class="token boolean">false</span><span class="token punctuation">;</span>
   <span class="token keyword">break</span><span class="token punctuation">;</span>
  <span class="token punctuation">}</span>
 <span class="token punctuation">}</span>

 <span class="token keyword">return</span> result<span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="8-how-do-you-remove-spaces-from-a-string-in-java"><a href="#8-how-do-you-remove-spaces-from-a-string-in-java" onclick="navigator.clipboard.writeText(this.href);">8. How do you remove spaces from a string in Java?</a><a class="hash-anchor" href="#8-how-do-you-remove-spaces-from-a-string-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The following example code shows one way to remove spaces from a string using with the <code>Character.isWhitespace()</code> method:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">String</span> <span class="token function">removeWhiteSpaces</span><span class="token punctuation">(</span><span class="token class-name">String</span> input<span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token class-name">StringBuilder</span> output <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">StringBuilder</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 
 <span class="token keyword">char</span><span class="token punctuation">[</span><span class="token punctuation">]</span> charArray <span class="token operator">=</span> input<span class="token punctuation">.</span><span class="token function">toCharArray</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 
 <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">char</span> c <span class="token operator">:</span> charArray<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">if</span> <span class="token punctuation">(</span><span class="token operator">!</span><span class="token class-name">Character</span><span class="token punctuation">.</span><span class="token function">isWhitespace</span><span class="token punctuation">(</span>c<span class="token punctuation">)</span><span class="token punctuation">)</span>
   output<span class="token punctuation">.</span><span class="token function">append</span><span class="token punctuation">(</span>c<span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>
 
 <span class="token keyword">return</span> output<span class="token punctuation">.</span><span class="token function">toString</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>Learn more about removing spaces and other <a href="/community/tutorials/java-remove-character-string">characters from a string in Java</a>.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="9-how-do-you-remove-leading-and-trailing-spaces-from-a-string-in-java"><a href="#9-how-do-you-remove-leading-and-trailing-spaces-from-a-string-in-java" onclick="navigator.clipboard.writeText(this.href);">9. How do you remove leading and trailing spaces from a string in Java?</a><a class="hash-anchor" href="#9-how-do-you-remove-leading-and-trailing-spaces-from-a-string-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The <code>String</code> class contains two methods to remove leading and trailing whitespaces: <code>trim()</code> and <code>strip()</code>. The <code>strip()</code> method was added to the <code>String</code> class in Java 11. The <code>strip()</code> method uses the <code>Character.isWhitespace()</code> method to check if the character is a whitespace. This method uses Unicode code points, while the <code>trim()</code> method identifies any character with a codepoint value less than or equal to <code>U+0020</code> as a whitespace character.</p>
<p>The <code>strip()</code> method is the recommended way to remove whitespaces because it uses the Unicode standard. The following example code shows how to use the <code>strip()</code> method to remove whitespaces:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">String</span> s <span class="token operator">=</span> <span class="token string">"  abc  def\t"</span><span class="token punctuation">;</span>
  
s <span class="token operator">=</span> s<span class="token punctuation">.</span><span class="token function">strip</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
  
<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>s<span class="token punctuation">)</span><span class="token punctuation">;</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>Because <code>String</code> is immutable, you have to assign the <code>strip()</code> output to the string.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="10-how-do-you-sort-an-array-in-java"><a href="#10-how-do-you-sort-an-array-in-java" onclick="navigator.clipboard.writeText(this.href);">10. How do you sort an array in Java?</a><a class="hash-anchor" href="#10-how-do-you-sort-an-array-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The <code>Arrays</code> utility class has many overloaded <code>sort()</code> methods to sort primitive and to object arrays. If you are sorting a primitive array in the natural order, then you can use the <code>Arrays.sort()</code> method, as shown in the following example:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> array <span class="token operator">=</span> <span class="token punctuation">{</span><span class="token number">1</span><span class="token punctuation">,</span> <span class="token number">2</span><span class="token punctuation">,</span> <span class="token number">3</span><span class="token punctuation">,</span> <span class="token operator">-</span><span class="token number">1</span><span class="token punctuation">,</span> <span class="token operator">-</span><span class="token number">2</span><span class="token punctuation">,</span> <span class="token number">4</span><span class="token punctuation">}</span><span class="token punctuation">;</span>

<span class="token class-name">Arrays</span><span class="token punctuation">.</span><span class="token function">sort</span><span class="token punctuation">(</span>array<span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token class-name">Arrays</span><span class="token punctuation">.</span><span class="token function">toString</span><span class="token punctuation">(</span>array<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>However, if you want to sort an array of objects, then the object must implement the <code>Comparable</code> interface. If you want to specify the sorting criteria, then you can pass the <code>Comparator</code> for the sorting logic. Learn more about <a href="/community/tutorials/comparable-and-comparator-in-java-example">Comparable and Comparator in Java</a>.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="11-how-do-you-create-a-deadlock-scenario-programmatically-in-java"><a href="#11-how-do-you-create-a-deadlock-scenario-programmatically-in-java" onclick="navigator.clipboard.writeText(this.href);">11. How do you create a deadlock scenario programmatically in Java?</a><a class="hash-anchor" href="#11-how-do-you-create-a-deadlock-scenario-programmatically-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>Deadlock is a scenario in a multi-threaded Java environment where two or more threads are blocked forever. The deadlock situation arises with at two or more threads. The following example code creates a deadlock scenario:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">ThreadDeadlock</span> <span class="token punctuation">{</span>

    <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token keyword">throws</span> <span class="token class-name">InterruptedException</span> <span class="token punctuation">{</span>
        <span class="token class-name">Object</span> obj1 <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Object</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token class-name">Object</span> obj2 <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Object</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token class-name">Object</span> obj3 <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Object</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
    
        <span class="token class-name">Thread</span> t1 <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Thread</span><span class="token punctuation">(</span><span class="token keyword">new</span> <span class="token class-name">SyncThread</span><span class="token punctuation">(</span>obj1<span class="token punctuation">,</span> obj2<span class="token punctuation">)</span><span class="token punctuation">,</span> <span class="token string">"t1"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token class-name">Thread</span> t2 <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Thread</span><span class="token punctuation">(</span><span class="token keyword">new</span> <span class="token class-name">SyncThread</span><span class="token punctuation">(</span>obj2<span class="token punctuation">,</span> obj3<span class="token punctuation">)</span><span class="token punctuation">,</span> <span class="token string">"t2"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token class-name">Thread</span> t3 <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Thread</span><span class="token punctuation">(</span><span class="token keyword">new</span> <span class="token class-name">SyncThread</span><span class="token punctuation">(</span>obj3<span class="token punctuation">,</span> obj1<span class="token punctuation">)</span><span class="token punctuation">,</span> <span class="token string">"t3"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        
        t1<span class="token punctuation">.</span><span class="token function">start</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token class-name">Thread</span><span class="token punctuation">.</span><span class="token function">sleep</span><span class="token punctuation">(</span><span class="token number">5000</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        t2<span class="token punctuation">.</span><span class="token function">start</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token class-name">Thread</span><span class="token punctuation">.</span><span class="token function">sleep</span><span class="token punctuation">(</span><span class="token number">5000</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        t3<span class="token punctuation">.</span><span class="token function">start</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>        
    <span class="token punctuation">}</span>

<span class="token punctuation">}</span>

<span class="token keyword">class</span> <span class="token class-name">SyncThread</span> <span class="token keyword">implements</span> <span class="token class-name">Runnable</span> <span class="token punctuation">{</span>

    <span class="token keyword">private</span> <span class="token class-name">Object</span> obj1<span class="token punctuation">;</span>
    <span class="token keyword">private</span> <span class="token class-name">Object</span> obj2<span class="token punctuation">;</span>

    <span class="token keyword">public</span> <span class="token class-name">SyncThread</span><span class="token punctuation">(</span><span class="token class-name">Object</span> o1<span class="token punctuation">,</span> <span class="token class-name">Object</span> o2<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        <span class="token keyword">this</span><span class="token punctuation">.</span>obj1 <span class="token operator">=</span> o1<span class="token punctuation">;</span>
        <span class="token keyword">this</span><span class="token punctuation">.</span>obj2 <span class="token operator">=</span> o2<span class="token punctuation">;</span>
    <span class="token punctuation">}</span>

    <span class="token annotation punctuation">@Override</span>
    <span class="token keyword">public</span> <span class="token keyword">void</span> <span class="token function">run</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
        <span class="token class-name">String</span> name <span class="token operator">=</span> <span class="token class-name">Thread</span><span class="token punctuation">.</span><span class="token function">currentThread</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">getName</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

        <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>name <span class="token operator">+</span> <span class="token string">" acquiring lock on "</span> <span class="token operator">+</span> obj1<span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token keyword">synchronized</span> <span class="token punctuation">(</span>obj1<span class="token punctuation">)</span> <span class="token punctuation">{</span>
            <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>name <span class="token operator">+</span> <span class="token string">" acquired lock on "</span> <span class="token operator">+</span> obj1<span class="token punctuation">)</span><span class="token punctuation">;</span>
            <span class="token function">work</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
            <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>name <span class="token operator">+</span> <span class="token string">" acquiring lock on "</span> <span class="token operator">+</span> obj2<span class="token punctuation">)</span><span class="token punctuation">;</span>
            <span class="token keyword">synchronized</span> <span class="token punctuation">(</span>obj2<span class="token punctuation">)</span> <span class="token punctuation">{</span>
                <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>name <span class="token operator">+</span> <span class="token string">" acquired lock on "</span> <span class="token operator">+</span> obj2<span class="token punctuation">)</span><span class="token punctuation">;</span>
                <span class="token function">work</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
            <span class="token punctuation">}</span>
            <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>name <span class="token operator">+</span> <span class="token string">" released lock on "</span> <span class="token operator">+</span> obj2<span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token punctuation">}</span>
        <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>name <span class="token operator">+</span> <span class="token string">" released lock on "</span> <span class="token operator">+</span> obj1<span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>name <span class="token operator">+</span> <span class="token string">" finished execution."</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>

    <span class="token keyword">private</span> <span class="token keyword">void</span> <span class="token function">work</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
        <span class="token keyword">try</span> <span class="token punctuation">{</span>
            <span class="token class-name">Thread</span><span class="token punctuation">.</span><span class="token function">sleep</span><span class="token punctuation">(</span><span class="token number">30000</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token punctuation">}</span> <span class="token keyword">catch</span> <span class="token punctuation">(</span><span class="token class-name">InterruptedException</span> e<span class="token punctuation">)</span> <span class="token punctuation">{</span>
            e<span class="token punctuation">.</span><span class="token function">printStackTrace</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token punctuation">}</span>
    <span class="token punctuation">}</span>

<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>All three threads will be able to acquire a lock on the first object. However, they are using shared resources and are started in such a way that they will keep on waiting indefinitely to acquire the lock on the second object. You can use the Java thread dump to detect the deadlocks. Learn more about <a href="/community/tutorials/deadlock-in-java-example">deadlock in Java</a>.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="12-how-can-you-find-the-factorial-of-an-integer-in-java"><a href="#12-how-can-you-find-the-factorial-of-an-integer-in-java" onclick="navigator.clipboard.writeText(this.href);">12. How can you find the factorial of an integer in Java?</a><a class="hash-anchor" href="#12-how-can-you-find-the-factorial-of-an-integer-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The factorial of an integer is calculated by multiplying all the numbers from 1 to the given number:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-bash"><code>F<span class="token punctuation">(</span>n<span class="token punctuation">)</span> <span class="token operator">=</span> F<span class="token punctuation">(</span><span class="token number">1</span><span class="token punctuation">)</span>*F<span class="token punctuation">(</span><span class="token number">2</span><span class="token punctuation">)</span><span class="token punctuation">..</span>.F<span class="token punctuation">(</span>n-1<span class="token punctuation">)</span>*F<span class="token punctuation">(</span>n<span class="token punctuation">)</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>The following example code shows how to use recursion to find the factorial of an integer:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">long</span> <span class="token function">factorial</span><span class="token punctuation">(</span><span class="token keyword">long</span> n<span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token keyword">if</span> <span class="token punctuation">(</span>n <span class="token operator">==</span> <span class="token number">1</span><span class="token punctuation">)</span>
  <span class="token keyword">return</span> <span class="token number">1</span><span class="token punctuation">;</span>
 <span class="token keyword">else</span>
  <span class="token keyword">return</span> <span class="token punctuation">(</span>n <span class="token operator">*</span> <span class="token function">factorial</span><span class="token punctuation">(</span>n <span class="token operator">-</span> <span class="token number">1</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="13-how-do-you-reverse-a-linked-list-in-java"><a href="#13-how-do-you-reverse-a-linked-list-in-java" onclick="navigator.clipboard.writeText(this.href);">13. How do you reverse a linked list in Java?</a><a class="hash-anchor" href="#13-how-do-you-reverse-a-linked-list-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p><code>LinkedList descendingIterator()</code> returns an iterator that iterates over the element in reverse order. The following example code shows how to use this iterator to create a new Linked List with elements listed in the reverse order:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">LinkedList</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">Integer</span><span class="token punctuation">&gt;</span></span> ll <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">LinkedList</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token punctuation">&gt;</span></span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

ll<span class="token punctuation">.</span><span class="token function">add</span><span class="token punctuation">(</span><span class="token number">1</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
ll<span class="token punctuation">.</span><span class="token function">add</span><span class="token punctuation">(</span><span class="token number">2</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
ll<span class="token punctuation">.</span><span class="token function">add</span><span class="token punctuation">(</span><span class="token number">3</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>ll<span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token class-name">LinkedList</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">Integer</span><span class="token punctuation">&gt;</span></span> ll1 <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">LinkedList</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token punctuation">&gt;</span></span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

ll<span class="token punctuation">.</span><span class="token function">descendingIterator</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">forEachRemaining</span><span class="token punctuation">(</span>ll1<span class="token operator">::</span><span class="token function">add</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>ll1<span class="token punctuation">)</span><span class="token punctuation">;</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>Learn more about <a href="/community/tutorials/reverse-a-linked-list">reversing a linked list</a> from a data structures and algorithms perspective.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="14-how-do-you-implement-a-binary-search-in-java"><a href="#14-how-do-you-implement-a-binary-search-in-java" onclick="navigator.clipboard.writeText(this.href);">14. How do you implement a binary search in Java?</a><a class="hash-anchor" href="#14-how-do-you-implement-a-binary-search-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The array elements must be sorted to implement binary search. The binary search algorithm is based on the following conditions:</p>
<ul>
<li>If the key is less than the middle element, then you now need to search only in the first half of the array.</li>
<li>If the key is greater than the middle element, then you need to search only in the second half of the array.</li>
<li>If the key is equal to the middle element in the array, then the search ends.</li>
<li>Finally, if the key is not found in the whole array, then it should return <code>-1</code>. This indicates that the element is not present.</li>
</ul>
<p>The following example code implements a binary search:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">int</span> <span class="token function">binarySearch</span><span class="token punctuation">(</span><span class="token keyword">int</span> arr<span class="token punctuation">[</span><span class="token punctuation">]</span><span class="token punctuation">,</span> <span class="token keyword">int</span> low<span class="token punctuation">,</span> <span class="token keyword">int</span> high<span class="token punctuation">,</span> <span class="token keyword">int</span> key<span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token keyword">int</span> mid <span class="token operator">=</span> <span class="token punctuation">(</span>low <span class="token operator">+</span> high<span class="token punctuation">)</span> <span class="token operator">/</span> <span class="token number">2</span><span class="token punctuation">;</span>

 <span class="token keyword">while</span> <span class="token punctuation">(</span>low <span class="token operator">&lt;=</span> high<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">if</span> <span class="token punctuation">(</span>arr<span class="token punctuation">[</span>mid<span class="token punctuation">]</span> <span class="token operator">&lt;</span> key<span class="token punctuation">)</span> <span class="token punctuation">{</span>
   low <span class="token operator">=</span> mid <span class="token operator">+</span> <span class="token number">1</span><span class="token punctuation">;</span>
  <span class="token punctuation">}</span> <span class="token keyword">else</span> <span class="token keyword">if</span> <span class="token punctuation">(</span>arr<span class="token punctuation">[</span>mid<span class="token punctuation">]</span> <span class="token operator">==</span> key<span class="token punctuation">)</span> <span class="token punctuation">{</span>
   <span class="token keyword">return</span> mid<span class="token punctuation">;</span>
  <span class="token punctuation">}</span> <span class="token keyword">else</span> <span class="token punctuation">{</span>
   high <span class="token operator">=</span> mid <span class="token operator">-</span> <span class="token number">1</span><span class="token punctuation">;</span>
  <span class="token punctuation">}</span>
  mid <span class="token operator">=</span> <span class="token punctuation">(</span>low <span class="token operator">+</span> high<span class="token punctuation">)</span> <span class="token operator">/</span> <span class="token number">2</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

 <span class="token keyword">if</span> <span class="token punctuation">(</span>low <span class="token operator">&gt;</span> high<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">return</span> <span class="token operator">-</span><span class="token number">1</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

 <span class="token keyword">return</span> <span class="token operator">-</span><span class="token number">1</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="15-write-a-java-program-that-illustrates-merge-sort"><a href="#15-write-a-java-program-that-illustrates-merge-sort" onclick="navigator.clipboard.writeText(this.href);">15. Write a Java program that illustrates merge sort</a><a class="hash-anchor" href="#15-write-a-java-program-that-illustrates-merge-sort" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>Merge sort is one of the most efficient sorting algorithms. It works on the principle of “divide and conquer”. It is based on the idea of breaking down a list into several sub-lists until each sub-list consists of a single element, and then merging those sub-lists in a manner that results in a sorted list. The following example code shows one way to use merge sort:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">MergeSort</span> <span class="token punctuation">{</span>

 <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> arr <span class="token operator">=</span> <span class="token punctuation">{</span> <span class="token number">70</span><span class="token punctuation">,</span> <span class="token number">50</span><span class="token punctuation">,</span> <span class="token number">30</span><span class="token punctuation">,</span> <span class="token number">10</span><span class="token punctuation">,</span> <span class="token number">20</span><span class="token punctuation">,</span> <span class="token number">40</span><span class="token punctuation">,</span> <span class="token number">60</span> <span class="token punctuation">}</span><span class="token punctuation">;</span>

  <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> merged <span class="token operator">=</span> <span class="token function">mergeSort</span><span class="token punctuation">(</span>arr<span class="token punctuation">,</span> <span class="token number">0</span><span class="token punctuation">,</span> arr<span class="token punctuation">.</span>length <span class="token operator">-</span> <span class="token number">1</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> val <span class="token operator">:</span> merged<span class="token punctuation">)</span> <span class="token punctuation">{</span>
   <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">print</span><span class="token punctuation">(</span>val <span class="token operator">+</span> <span class="token string">" "</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
  <span class="token punctuation">}</span>
 <span class="token punctuation">}</span>

 <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> <span class="token function">mergeTwoSortedArrays</span><span class="token punctuation">(</span><span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> one<span class="token punctuation">,</span> <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> two<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> sorted <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token keyword">int</span><span class="token punctuation">[</span>one<span class="token punctuation">.</span>length <span class="token operator">+</span> two<span class="token punctuation">.</span>length<span class="token punctuation">]</span><span class="token punctuation">;</span>

  <span class="token keyword">int</span> i <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span>
  <span class="token keyword">int</span> j <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span>
  <span class="token keyword">int</span> k <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span>

  <span class="token keyword">while</span> <span class="token punctuation">(</span>i <span class="token operator">&lt;</span> one<span class="token punctuation">.</span>length <span class="token operator">&amp;&amp;</span> j <span class="token operator">&lt;</span> two<span class="token punctuation">.</span>length<span class="token punctuation">)</span> <span class="token punctuation">{</span>
   <span class="token keyword">if</span> <span class="token punctuation">(</span>one<span class="token punctuation">[</span>i<span class="token punctuation">]</span> <span class="token operator">&lt;</span> two<span class="token punctuation">[</span>j<span class="token punctuation">]</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
    sorted<span class="token punctuation">[</span>k<span class="token punctuation">]</span> <span class="token operator">=</span> one<span class="token punctuation">[</span>i<span class="token punctuation">]</span><span class="token punctuation">;</span>
    k<span class="token operator">++</span><span class="token punctuation">;</span>
    i<span class="token operator">++</span><span class="token punctuation">;</span>
   <span class="token punctuation">}</span> <span class="token keyword">else</span> <span class="token punctuation">{</span>
    sorted<span class="token punctuation">[</span>k<span class="token punctuation">]</span> <span class="token operator">=</span> two<span class="token punctuation">[</span>j<span class="token punctuation">]</span><span class="token punctuation">;</span>
    k<span class="token operator">++</span><span class="token punctuation">;</span>
    j<span class="token operator">++</span><span class="token punctuation">;</span>
   <span class="token punctuation">}</span>
  <span class="token punctuation">}</span>

  <span class="token keyword">if</span> <span class="token punctuation">(</span>i <span class="token operator">==</span> one<span class="token punctuation">.</span>length<span class="token punctuation">)</span> <span class="token punctuation">{</span>
   <span class="token keyword">while</span> <span class="token punctuation">(</span>j <span class="token operator">&lt;</span> two<span class="token punctuation">.</span>length<span class="token punctuation">)</span> <span class="token punctuation">{</span>
    sorted<span class="token punctuation">[</span>k<span class="token punctuation">]</span> <span class="token operator">=</span> two<span class="token punctuation">[</span>j<span class="token punctuation">]</span><span class="token punctuation">;</span>
    k<span class="token operator">++</span><span class="token punctuation">;</span>
    j<span class="token operator">++</span><span class="token punctuation">;</span>
   <span class="token punctuation">}</span>
  <span class="token punctuation">}</span>

  <span class="token keyword">if</span> <span class="token punctuation">(</span>j <span class="token operator">==</span> two<span class="token punctuation">.</span>length<span class="token punctuation">)</span> <span class="token punctuation">{</span>
   <span class="token keyword">while</span> <span class="token punctuation">(</span>i <span class="token operator">&lt;</span> one<span class="token punctuation">.</span>length<span class="token punctuation">)</span> <span class="token punctuation">{</span>
    sorted<span class="token punctuation">[</span>k<span class="token punctuation">]</span> <span class="token operator">=</span> one<span class="token punctuation">[</span>i<span class="token punctuation">]</span><span class="token punctuation">;</span>
    k<span class="token operator">++</span><span class="token punctuation">;</span>
    i<span class="token operator">++</span><span class="token punctuation">;</span>
   <span class="token punctuation">}</span>
  <span class="token punctuation">}</span>

  <span class="token keyword">return</span> sorted<span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

 <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> <span class="token function">mergeSort</span><span class="token punctuation">(</span><span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> arr<span class="token punctuation">,</span> <span class="token keyword">int</span> lo<span class="token punctuation">,</span> <span class="token keyword">int</span> hi<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">if</span> <span class="token punctuation">(</span>lo <span class="token operator">==</span> hi<span class="token punctuation">)</span> <span class="token punctuation">{</span>
   <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> br <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token number">1</span><span class="token punctuation">]</span><span class="token punctuation">;</span>
   br<span class="token punctuation">[</span><span class="token number">0</span><span class="token punctuation">]</span> <span class="token operator">=</span> arr<span class="token punctuation">[</span>lo<span class="token punctuation">]</span><span class="token punctuation">;</span>

   <span class="token keyword">return</span> br<span class="token punctuation">;</span>
  <span class="token punctuation">}</span>

  <span class="token keyword">int</span> mid <span class="token operator">=</span> <span class="token punctuation">(</span>lo <span class="token operator">+</span> hi<span class="token punctuation">)</span> <span class="token operator">/</span> <span class="token number">2</span><span class="token punctuation">;</span>

  <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> fh <span class="token operator">=</span> <span class="token function">mergeSort</span><span class="token punctuation">(</span>arr<span class="token punctuation">,</span> lo<span class="token punctuation">,</span> mid<span class="token punctuation">)</span><span class="token punctuation">;</span>
  <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> sh <span class="token operator">=</span> <span class="token function">mergeSort</span><span class="token punctuation">(</span>arr<span class="token punctuation">,</span> mid <span class="token operator">+</span> <span class="token number">1</span><span class="token punctuation">,</span> hi<span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> merged <span class="token operator">=</span> <span class="token function">mergeTwoSortedArrays</span><span class="token punctuation">(</span>fh<span class="token punctuation">,</span> sh<span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token keyword">return</span> merged<span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="16-can-you-create-a-pyramid-of-characters-in-java"><a href="#16-can-you-create-a-pyramid-of-characters-in-java" onclick="navigator.clipboard.writeText(this.href);">16. Can you create a pyramid of characters in Java?</a><a class="hash-anchor" href="#16-can-you-create-a-pyramid-of-characters-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>Pattern programs are a very popular interview topic. This type of question is used to understand the logical thinking abilities of the interviewee. Refer to <a href="/community/tutorials/pyramid-pattern-programs-in-java">Pyramid Pattern Programs in Java</a> for examples of different ways to create pyramid patterns.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="17-write-java-program-that-checks-if-two-arrays-contain-the-same-elements"><a href="#17-write-java-program-that-checks-if-two-arrays-contain-the-same-elements" onclick="navigator.clipboard.writeText(this.href);">17. Write  Java program that checks if two arrays contain the same elements</a><a class="hash-anchor" href="#17-write-java-program-that-checks-if-two-arrays-contain-the-same-elements" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>To check if two arrays contain the same elements, you need to first <a href="https://www.digitalsilk.com/web-development/custom-web-development/" rel="ugc nofollow noopener" target="_blank">create a set of elements</a> from both the arrays, and then compare the elements in these sets to find if there is an element that is not present in both sets. The following example code shows how to check if two arrays only contain common elements:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">import</span> <span class="token import"><span class="token namespace">java<span class="token punctuation">.</span>util<span class="token punctuation">.</span></span><span class="token class-name">Arrays</span></span><span class="token punctuation">;</span>
<span class="token keyword">import</span> <span class="token import"><span class="token namespace">java<span class="token punctuation">.</span>util<span class="token punctuation">.</span></span><span class="token class-name">HashSet</span></span><span class="token punctuation">;</span>
<span class="token keyword">import</span> <span class="token import"><span class="token namespace">java<span class="token punctuation">.</span>util<span class="token punctuation">.</span></span><span class="token class-name">Set</span></span><span class="token punctuation">;</span>

<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">ArraySameElements</span> <span class="token punctuation">{</span>

 <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">Integer</span><span class="token punctuation">[</span><span class="token punctuation">]</span> a1 <span class="token operator">=</span> <span class="token punctuation">{</span><span class="token number">1</span><span class="token punctuation">,</span><span class="token number">2</span><span class="token punctuation">,</span><span class="token number">3</span><span class="token punctuation">,</span><span class="token number">2</span><span class="token punctuation">,</span><span class="token number">1</span><span class="token punctuation">}</span><span class="token punctuation">;</span>
  <span class="token class-name">Integer</span><span class="token punctuation">[</span><span class="token punctuation">]</span> a2 <span class="token operator">=</span> <span class="token punctuation">{</span><span class="token number">1</span><span class="token punctuation">,</span><span class="token number">2</span><span class="token punctuation">,</span><span class="token number">3</span><span class="token punctuation">}</span><span class="token punctuation">;</span>
  <span class="token class-name">Integer</span><span class="token punctuation">[</span><span class="token punctuation">]</span> a3 <span class="token operator">=</span> <span class="token punctuation">{</span><span class="token number">1</span><span class="token punctuation">,</span><span class="token number">2</span><span class="token punctuation">,</span><span class="token number">3</span><span class="token punctuation">,</span><span class="token number">4</span><span class="token punctuation">}</span><span class="token punctuation">;</span>
  
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token function">sameElements</span><span class="token punctuation">(</span>a1<span class="token punctuation">,</span> a2<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token function">sameElements</span><span class="token punctuation">(</span>a1<span class="token punctuation">,</span> a3<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

 <span class="token keyword">static</span> <span class="token keyword">boolean</span> <span class="token function">sameElements</span><span class="token punctuation">(</span><span class="token class-name">Object</span><span class="token punctuation">[</span><span class="token punctuation">]</span> array1<span class="token punctuation">,</span> <span class="token class-name">Object</span><span class="token punctuation">[</span><span class="token punctuation">]</span> array2<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">Set</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">Object</span><span class="token punctuation">&gt;</span></span> uniqueElements1 <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">HashSet</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token punctuation">&gt;</span></span><span class="token punctuation">(</span><span class="token class-name">Arrays</span><span class="token punctuation">.</span><span class="token function">asList</span><span class="token punctuation">(</span>array1<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
  <span class="token class-name">Set</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">Object</span><span class="token punctuation">&gt;</span></span> uniqueElements2 <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">HashSet</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token punctuation">&gt;</span></span><span class="token punctuation">(</span><span class="token class-name">Arrays</span><span class="token punctuation">.</span><span class="token function">asList</span><span class="token punctuation">(</span>array2<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
  
  <span class="token comment">// if size is different, means there will be a mismatch</span>
  <span class="token keyword">if</span> <span class="token punctuation">(</span>uniqueElements1<span class="token punctuation">.</span><span class="token function">size</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token operator">!=</span> uniqueElements2<span class="token punctuation">.</span><span class="token function">size</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span> <span class="token keyword">return</span> <span class="token boolean">false</span><span class="token punctuation">;</span>
  
  <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token class-name">Object</span> obj <span class="token operator">:</span> uniqueElements1<span class="token punctuation">)</span> <span class="token punctuation">{</span>
   <span class="token comment">// element not present in both?</span>
   <span class="token keyword">if</span> <span class="token punctuation">(</span><span class="token operator">!</span>uniqueElements2<span class="token punctuation">.</span><span class="token function">contains</span><span class="token punctuation">(</span>obj<span class="token punctuation">)</span><span class="token punctuation">)</span> <span class="token keyword">return</span> <span class="token boolean">false</span><span class="token punctuation">;</span>
  <span class="token punctuation">}</span>
  
  <span class="token keyword">return</span> <span class="token boolean">true</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-bash"><code><div class="secondary-code-label" title="Output">Output</div>true
<span class="token boolean">false</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="18-how-do-you-get-the-sum-of-all-elements-in-an-integer-array-in-java"><a href="#18-how-do-you-get-the-sum-of-all-elements-in-an-integer-array-in-java" onclick="navigator.clipboard.writeText(this.href);">18. How do you get the sum of all elements in an integer array in Java?</a><a class="hash-anchor" href="#18-how-do-you-get-the-sum-of-all-elements-in-an-integer-array-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>You can use a <code>for</code> loop to iterate over the array elements and add them to get the final sum:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> array <span class="token operator">=</span> <span class="token punctuation">{</span> <span class="token number">1</span><span class="token punctuation">,</span> <span class="token number">2</span><span class="token punctuation">,</span> <span class="token number">3</span><span class="token punctuation">,</span> <span class="token number">4</span><span class="token punctuation">,</span> <span class="token number">5</span> <span class="token punctuation">}</span><span class="token punctuation">;</span>

<span class="token keyword">int</span> sum <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span>

<span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">:</span> array<span class="token punctuation">)</span>
 sum <span class="token operator">+=</span> i<span class="token punctuation">;</span>

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>sum<span class="token punctuation">)</span><span class="token punctuation">;</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="19-how-do-you-find-the-second-largest-number-in-an-array-in-java"><a href="#19-how-do-you-find-the-second-largest-number-in-an-array-in-java" onclick="navigator.clipboard.writeText(this.href);">19. How do you find the second largest number in an array in Java?</a><a class="hash-anchor" href="#19-how-do-you-find-the-second-largest-number-in-an-array-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>There are many ways to solve this problem. You can sort the array in natural ascending order and take the second last value. However, sorting is an expensive operation. You can also use two variables to find the second largest value in a single iteration, as shown in the following example:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">private</span> <span class="token keyword">static</span> <span class="token keyword">int</span> <span class="token function">findSecondHighest</span><span class="token punctuation">(</span><span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> array<span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token keyword">int</span> highest <span class="token operator">=</span> <span class="token class-name">Integer</span><span class="token punctuation">.</span><span class="token constant">MIN_VALUE</span><span class="token punctuation">;</span>
 <span class="token keyword">int</span> secondHighest <span class="token operator">=</span> <span class="token class-name">Integer</span><span class="token punctuation">.</span><span class="token constant">MIN_VALUE</span><span class="token punctuation">;</span>

 <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">:</span> array<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">if</span> <span class="token punctuation">(</span>i <span class="token operator">&gt;</span> highest<span class="token punctuation">)</span> <span class="token punctuation">{</span>
   secondHighest <span class="token operator">=</span> highest<span class="token punctuation">;</span>
   highest <span class="token operator">=</span> i<span class="token punctuation">;</span>
  <span class="token punctuation">}</span> <span class="token keyword">else</span> <span class="token keyword">if</span> <span class="token punctuation">(</span>i <span class="token operator">&gt;</span> secondHighest<span class="token punctuation">)</span> <span class="token punctuation">{</span>
   secondHighest <span class="token operator">=</span> i<span class="token punctuation">;</span>
  <span class="token punctuation">}</span>

 <span class="token punctuation">}</span>
 <span class="token keyword">return</span> secondHighest<span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="20-how-do-you-shuffle-an-array-in-java"><a href="#20-how-do-you-shuffle-an-array-in-java" onclick="navigator.clipboard.writeText(this.href);">20. How do you shuffle an array in Java?</a><a class="hash-anchor" href="#20-how-do-you-shuffle-an-array-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The following example code shows how to use the <code>Random</code> class to generate random index numbers and shuffle the elements:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">int</span><span class="token punctuation">[</span><span class="token punctuation">]</span> array <span class="token operator">=</span> <span class="token punctuation">{</span> <span class="token number">1</span><span class="token punctuation">,</span> <span class="token number">2</span><span class="token punctuation">,</span> <span class="token number">3</span><span class="token punctuation">,</span> <span class="token number">4</span><span class="token punctuation">,</span> <span class="token number">5</span><span class="token punctuation">,</span> <span class="token number">6</span><span class="token punctuation">,</span> <span class="token number">7</span> <span class="token punctuation">}</span><span class="token punctuation">;</span>

<span class="token class-name">Random</span> rand <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Random</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span> i <span class="token operator">&lt;</span> array<span class="token punctuation">.</span>length<span class="token punctuation">;</span> i<span class="token operator">++</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token keyword">int</span> randomIndexToSwap <span class="token operator">=</span> rand<span class="token punctuation">.</span><span class="token function">nextInt</span><span class="token punctuation">(</span>array<span class="token punctuation">.</span>length<span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token keyword">int</span> temp <span class="token operator">=</span> array<span class="token punctuation">[</span>randomIndexToSwap<span class="token punctuation">]</span><span class="token punctuation">;</span>
 array<span class="token punctuation">[</span>randomIndexToSwap<span class="token punctuation">]</span> <span class="token operator">=</span> array<span class="token punctuation">[</span>i<span class="token punctuation">]</span><span class="token punctuation">;</span>
 array<span class="token punctuation">[</span>i<span class="token punctuation">]</span> <span class="token operator">=</span> temp<span class="token punctuation">;</span>
<span class="token punctuation">}</span>

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token class-name">Arrays</span><span class="token punctuation">.</span><span class="token function">toString</span><span class="token punctuation">(</span>array<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>You can run the shuffling code inside another <code>for</code> loop to shuffle multiple rounds.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="21-how-can-you-find-a-string-in-a-text-file-in-java"><a href="#21-how-can-you-find-a-string-in-a-text-file-in-java" onclick="navigator.clipboard.writeText(this.href);">21. How can you find a string in a text file in Java?</a><a class="hash-anchor" href="#21-how-can-you-find-a-string-in-a-text-file-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The following example code shows how to use the <code>Scanner</code> class to read the file contents line by line and then use the <code>String contains()</code> method to check if the string is present in the file:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">boolean</span> <span class="token function">findStringInFile</span><span class="token punctuation">(</span><span class="token class-name">String</span> filePath<span class="token punctuation">,</span> <span class="token class-name">String</span> str<span class="token punctuation">)</span> <span class="token keyword">throws</span> <span class="token class-name">FileNotFoundException</span> <span class="token punctuation">{</span>
 <span class="token class-name">File</span> file <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">File</span><span class="token punctuation">(</span>filePath<span class="token punctuation">)</span><span class="token punctuation">;</span>

 <span class="token class-name">Scanner</span> scanner <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Scanner</span><span class="token punctuation">(</span>file<span class="token punctuation">)</span><span class="token punctuation">;</span>

 <span class="token comment">// read the file line by line</span>
 <span class="token keyword">while</span> <span class="token punctuation">(</span>scanner<span class="token punctuation">.</span><span class="token function">hasNextLine</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">String</span> line <span class="token operator">=</span> scanner<span class="token punctuation">.</span><span class="token function">nextLine</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
  <span class="token keyword">if</span> <span class="token punctuation">(</span>line<span class="token punctuation">.</span><span class="token function">contains</span><span class="token punctuation">(</span>str<span class="token punctuation">)</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
   scanner<span class="token punctuation">.</span><span class="token function">close</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
   <span class="token keyword">return</span> <span class="token boolean">true</span><span class="token punctuation">;</span>
  <span class="token punctuation">}</span>
 <span class="token punctuation">}</span>
 scanner<span class="token punctuation">.</span><span class="token function">close</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

 <span class="token keyword">return</span> <span class="token boolean">false</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>Note that the example code assumes that the string that you’re searching for in the file doesn’t contain newline characters.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="22-how-do-you-print-a-date-in-specific-format-in-java"><a href="#22-how-do-you-print-a-date-in-specific-format-in-java" onclick="navigator.clipboard.writeText(this.href);">22. How do you print a date in specific format in Java?</a><a class="hash-anchor" href="#22-how-do-you-print-a-date-in-specific-format-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The following example code shows how to use the <code>SimpleDateFormat</code> class to format the date string:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">String</span> pattern <span class="token operator">=</span> <span class="token string">"MM-dd-yyyy"</span><span class="token punctuation">;</span>
<span class="token class-name">SimpleDateFormat</span> simpleDateFormat <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">SimpleDateFormat</span><span class="token punctuation">(</span>pattern<span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token class-name">String</span> date <span class="token operator">=</span> simpleDateFormat<span class="token punctuation">.</span><span class="token function">format</span><span class="token punctuation">(</span><span class="token keyword">new</span> <span class="token class-name">Date</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>date<span class="token punctuation">)</span><span class="token punctuation">;</span> <span class="token comment">// 06-23-2020</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>Lear more about the <a href="/community/tutorials/java-simpledateformat-java-date-format">Java SimpleDateFormat</a>.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="23-how-do-you-merge-two-lists-in-java"><a href="#23-how-do-you-merge-two-lists-in-java" onclick="navigator.clipboard.writeText(this.href);">23. How do you merge two lists in Java?</a><a class="hash-anchor" href="#23-how-do-you-merge-two-lists-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The following example code shows how to use the <code>addAll()</code> method to merge multiple lists in Java:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">List</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">&gt;</span></span> list1 <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">ArrayList</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token punctuation">&gt;</span></span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
list1<span class="token punctuation">.</span><span class="token function">add</span><span class="token punctuation">(</span><span class="token string">"1"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token class-name">List</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">&gt;</span></span> list2 <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">ArrayList</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token punctuation">&gt;</span></span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
list2<span class="token punctuation">.</span><span class="token function">add</span><span class="token punctuation">(</span><span class="token string">"2"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token class-name">List</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">&gt;</span></span> mergedList <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">ArrayList</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token punctuation">&gt;</span></span><span class="token punctuation">(</span>list1<span class="token punctuation">)</span><span class="token punctuation">;</span>
mergedList<span class="token punctuation">.</span><span class="token function">addAll</span><span class="token punctuation">(</span>list2<span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>mergedList<span class="token punctuation">)</span><span class="token punctuation">;</span> <span class="token comment">// [1, 2]</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="24-write-a-java-program-that-sorts-hashmap-by-value"><a href="#24-write-a-java-program-that-sorts-hashmap-by-value" onclick="navigator.clipboard.writeText(this.href);">24. Write a Java program that sorts HashMap by value</a><a class="hash-anchor" href="#24-write-a-java-program-that-sorts-hashmap-by-value" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p><code>HashMap</code> is not an ordered collection. The following example code shows how to sort the entries based on value and store them into <code>LinkedHashMap</code>, which maintains the order of insertion:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">import</span> <span class="token import"><span class="token namespace">java<span class="token punctuation">.</span>util<span class="token punctuation">.</span></span><span class="token class-name">ArrayList</span></span><span class="token punctuation">;</span>
<span class="token keyword">import</span> <span class="token import"><span class="token namespace">java<span class="token punctuation">.</span>util<span class="token punctuation">.</span></span><span class="token class-name">HashMap</span></span><span class="token punctuation">;</span>
<span class="token keyword">import</span> <span class="token import"><span class="token namespace">java<span class="token punctuation">.</span>util<span class="token punctuation">.</span></span><span class="token class-name">LinkedHashMap</span></span><span class="token punctuation">;</span>
<span class="token keyword">import</span> <span class="token import"><span class="token namespace">java<span class="token punctuation">.</span>util<span class="token punctuation">.</span></span><span class="token class-name">List</span></span><span class="token punctuation">;</span>
<span class="token keyword">import</span> <span class="token import"><span class="token namespace">java<span class="token punctuation">.</span>util<span class="token punctuation">.</span></span><span class="token class-name">Map</span></span><span class="token punctuation">;</span>
<span class="token keyword">import</span> <span class="token import"><span class="token namespace">java<span class="token punctuation">.</span>util<span class="token punctuation">.</span></span><span class="token class-name">Map</span><span class="token punctuation">.</span><span class="token class-name">Entry</span></span><span class="token punctuation">;</span>
<span class="token keyword">import</span> <span class="token import"><span class="token namespace">java<span class="token punctuation">.</span>util<span class="token punctuation">.</span></span><span class="token class-name">Set</span></span><span class="token punctuation">;</span>

<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">SortHashMapByValue</span> <span class="token punctuation">{</span>

 <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">Map</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">,</span> <span class="token class-name">Integer</span><span class="token punctuation">&gt;</span></span> scores <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">HashMap</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token punctuation">&gt;</span></span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

  scores<span class="token punctuation">.</span><span class="token function">put</span><span class="token punctuation">(</span><span class="token string">"David"</span><span class="token punctuation">,</span> <span class="token number">95</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
  scores<span class="token punctuation">.</span><span class="token function">put</span><span class="token punctuation">(</span><span class="token string">"Jane"</span><span class="token punctuation">,</span> <span class="token number">80</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
  scores<span class="token punctuation">.</span><span class="token function">put</span><span class="token punctuation">(</span><span class="token string">"Mary"</span><span class="token punctuation">,</span> <span class="token number">97</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
  scores<span class="token punctuation">.</span><span class="token function">put</span><span class="token punctuation">(</span><span class="token string">"Lisa"</span><span class="token punctuation">,</span> <span class="token number">78</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
  scores<span class="token punctuation">.</span><span class="token function">put</span><span class="token punctuation">(</span><span class="token string">"Dino"</span><span class="token punctuation">,</span> <span class="token number">65</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>scores<span class="token punctuation">)</span><span class="token punctuation">;</span>

  scores <span class="token operator">=</span> <span class="token function">sortByValue</span><span class="token punctuation">(</span>scores<span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>scores<span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

 <span class="token keyword">private</span> <span class="token keyword">static</span> <span class="token class-name">Map</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">,</span> <span class="token class-name">Integer</span><span class="token punctuation">&gt;</span></span> <span class="token function">sortByValue</span><span class="token punctuation">(</span><span class="token class-name">Map</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">,</span> <span class="token class-name">Integer</span><span class="token punctuation">&gt;</span></span> scores<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">Map</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">,</span> <span class="token class-name">Integer</span><span class="token punctuation">&gt;</span></span> sortedByValue <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">LinkedHashMap</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token punctuation">&gt;</span></span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token comment">// get the entry set</span>
  <span class="token class-name">Set</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">Entry</span><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">,</span> <span class="token class-name">Integer</span><span class="token punctuation">&gt;</span><span class="token punctuation">&gt;</span></span> entrySet <span class="token operator">=</span> scores<span class="token punctuation">.</span><span class="token function">entrySet</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>entrySet<span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token comment">// create a list since the set is unordered</span>
  <span class="token class-name">List</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">Entry</span><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">,</span> <span class="token class-name">Integer</span><span class="token punctuation">&gt;</span><span class="token punctuation">&gt;</span></span> entryList <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">ArrayList</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token punctuation">&gt;</span></span><span class="token punctuation">(</span>entrySet<span class="token punctuation">)</span><span class="token punctuation">;</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>entryList<span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token comment">// sort the list by value</span>
  entryList<span class="token punctuation">.</span><span class="token function">sort</span><span class="token punctuation">(</span><span class="token punctuation">(</span>x<span class="token punctuation">,</span> y<span class="token punctuation">)</span> <span class="token operator">-&gt;</span> x<span class="token punctuation">.</span><span class="token function">getValue</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">compareTo</span><span class="token punctuation">(</span>y<span class="token punctuation">.</span><span class="token function">getValue</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>entryList<span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token comment">// populate the new hash map</span>
  <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token class-name">Entry</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">,</span> <span class="token class-name">Integer</span><span class="token punctuation">&gt;</span></span> e <span class="token operator">:</span> entryList<span class="token punctuation">)</span>
   sortedByValue<span class="token punctuation">.</span><span class="token function">put</span><span class="token punctuation">(</span>e<span class="token punctuation">.</span><span class="token function">getKey</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">,</span> e<span class="token punctuation">.</span><span class="token function">getValue</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token keyword">return</span> sortedByValue<span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="25-how-do-you-remove-all-occurrences-of-a-given-character-from-an-input-string-in-java"><a href="#25-how-do-you-remove-all-occurrences-of-a-given-character-from-an-input-string-in-java" onclick="navigator.clipboard.writeText(this.href);">25. How do you remove all occurrences of a given character from an input string in Java?</a><a class="hash-anchor" href="#25-how-do-you-remove-all-occurrences-of-a-given-character-from-an-input-string-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The <code>String</code> class doesn’t have a method to remove characters. The following example code shows how to use the <code>replace()</code> method to create a new string without the given character:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">String</span> str1 <span class="token operator">=</span> <span class="token string">"abcdABCDabcdABCD"</span><span class="token punctuation">;</span>
  
str1 <span class="token operator">=</span> str1<span class="token punctuation">.</span><span class="token function">replace</span><span class="token punctuation">(</span><span class="token string">"a"</span><span class="token punctuation">,</span> <span class="token string">""</span><span class="token punctuation">)</span><span class="token punctuation">;</span> 

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>str1<span class="token punctuation">)</span><span class="token punctuation">;</span> <span class="token comment">// bcdABCDbcdABCD</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>String is immutable in Java. All the string manipulation methods return a new string, which is why you need to assign it to another variable. Learn more about <a href="/community/tutorials/java-remove-character-string">removing characters from a string in Java</a>.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="26-how-do-you-get-distinct-characters-and-their-count-in-a-string-in-java"><a href="#26-how-do-you-get-distinct-characters-and-their-count-in-a-string-in-java" onclick="navigator.clipboard.writeText(this.href);">26. How do you get distinct characters and their count in a string in Java?</a><a class="hash-anchor" href="#26-how-do-you-get-distinct-characters-and-their-count-in-a-string-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>You can create the character array from the string. Then iterate over it and create a <code>HashMap</code> with the character as key and their count as value. The following example code shows how to extract and count the characters of a string:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">String</span> str1 <span class="token operator">=</span> <span class="token string">"abcdABCDabcd"</span><span class="token punctuation">;</span>

<span class="token keyword">char</span><span class="token punctuation">[</span><span class="token punctuation">]</span> chars <span class="token operator">=</span> str1<span class="token punctuation">.</span><span class="token function">toCharArray</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token class-name">Map</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">Character</span><span class="token punctuation">,</span> <span class="token class-name">Integer</span><span class="token punctuation">&gt;</span></span> charsCount <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">HashMap</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token punctuation">&gt;</span></span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">char</span> c <span class="token operator">:</span> chars<span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token keyword">if</span> <span class="token punctuation">(</span>charsCount<span class="token punctuation">.</span><span class="token function">containsKey</span><span class="token punctuation">(</span>c<span class="token punctuation">)</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
  charsCount<span class="token punctuation">.</span><span class="token function">put</span><span class="token punctuation">(</span>c<span class="token punctuation">,</span> charsCount<span class="token punctuation">.</span><span class="token function">get</span><span class="token punctuation">(</span>c<span class="token punctuation">)</span> <span class="token operator">+</span> <span class="token number">1</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span> <span class="token keyword">else</span>
  charsCount<span class="token punctuation">.</span><span class="token function">put</span><span class="token punctuation">(</span>c<span class="token punctuation">,</span> <span class="token number">1</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>charsCount<span class="token punctuation">)</span><span class="token punctuation">;</span> <span class="token comment">// {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="27-can-you-prove-that-a-string-object-in-java-is-immutable-programmatically"><a href="#27-can-you-prove-that-a-string-object-in-java-is-immutable-programmatically" onclick="navigator.clipboard.writeText(this.href);">27. Can you prove that a <code>String</code> object in Java is immutable programmatically?</a><a class="hash-anchor" href="#27-can-you-prove-that-a-string-object-in-java-is-immutable-programmatically" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The following example code shows how to prove that a <code>String</code> object is immutable and the comments in the code explain each step:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">String</span> s1 <span class="token operator">=</span> <span class="token string">"Java"</span><span class="token punctuation">;</span> <span class="token comment">// "Java" String created in pool and reference assigned to s1</span>

<span class="token class-name">String</span> s2 <span class="token operator">=</span> s1<span class="token punctuation">;</span> <span class="token comment">//s2 also has the same reference to "Java" in the pool</span>

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>s1 <span class="token operator">==</span> s2<span class="token punctuation">)</span><span class="token punctuation">;</span> <span class="token comment">// proof that s1 and s2 have the same reference</span>

s1 <span class="token operator">=</span> <span class="token string">"Python"</span><span class="token punctuation">;</span> 
<span class="token comment">//s1 value got changed above, so how String is immutable?</span>

<span class="token comment">//in the above case a new String "Python" got created in the pool</span>
<span class="token comment">//s1 is now referring to the new String in the pool </span>
<span class="token comment">//BUT, the original String "Java" is still unchanged and remains in the pool</span>
<span class="token comment">//s2 is still referring to the original String "Java" in the pool</span>

<span class="token comment">// proof that s1 and s2 have different reference</span>
<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>s1 <span class="token operator">==</span> s2<span class="token punctuation">)</span><span class="token punctuation">;</span> 

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>s2<span class="token punctuation">)</span><span class="token punctuation">;</span> 
<span class="token comment">// prints "Java" supporting the fact that original String value is unchanged, hence String is immutable</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="28-can-you-write-some-code-to-showcase-inheritance-in-java"><a href="#28-can-you-write-some-code-to-showcase-inheritance-in-java" onclick="navigator.clipboard.writeText(this.href);">28. Can you write some code to showcase inheritance in Java?</a><a class="hash-anchor" href="#28-can-you-write-some-code-to-showcase-inheritance-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The following example code shows how to use the <code>extends</code> keyword to create a subclass of the class <code>Animal</code>. The new class <code>Cat</code> inherits the variable from the <code>Animal</code> class and adds more code that only belongs to the <code>Cat</code> class.</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">class</span> <span class="token class-name">Animal</span> <span class="token punctuation">{</span>
 <span class="token class-name">String</span> color<span class="token punctuation">;</span>
<span class="token punctuation">}</span>

<span class="token keyword">class</span> <span class="token class-name">Cat</span> <span class="token keyword">extends</span> <span class="token class-name">Animal</span> <span class="token punctuation">{</span>
 <span class="token keyword">void</span> <span class="token function">meow</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"Meow"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="29-how-do-you-show-a-diamond-problem-with-multiple-inheritance-in-java"><a href="#29-how-do-you-show-a-diamond-problem-with-multiple-inheritance-in-java" onclick="navigator.clipboard.writeText(this.href);">29. How do you show a diamond problem with multiple inheritance in Java?</a><a class="hash-anchor" href="#29-how-do-you-show-a-diamond-problem-with-multiple-inheritance-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The diamond problem occurs when a class inherits from multiple classes and ambiguity occurs when it’s unclear which method to execute from which class. Java doesn’t allow extending multiple classes to avoid the diamond problem illustrated by the following example:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">interface</span> <span class="token class-name">I</span> <span class="token punctuation">{</span>
 <span class="token keyword">void</span> <span class="token function">foo</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
<span class="token keyword">class</span> <span class="token class-name">A</span> <span class="token keyword">implements</span> <span class="token class-name">I</span> <span class="token punctuation">{</span>
 <span class="token keyword">public</span> <span class="token keyword">void</span> <span class="token function">foo</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span><span class="token punctuation">}</span>
<span class="token punctuation">}</span>

<span class="token keyword">class</span> <span class="token class-name">B</span> <span class="token keyword">implements</span> <span class="token class-name">I</span> <span class="token punctuation">{</span>
 <span class="token keyword">public</span> <span class="token keyword">void</span> <span class="token function">foo</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span><span class="token punctuation">}</span>
<span class="token punctuation">}</span>

<span class="token keyword">class</span> <span class="token class-name">C</span> <span class="token keyword">extends</span> <span class="token class-name">A</span><span class="token punctuation">,</span> <span class="token class-name">B</span> <span class="token punctuation">{</span> <span class="token comment">// won't compile</span>
 <span class="token keyword">public</span> <span class="token keyword">void</span> <span class="token function">bar</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">super</span><span class="token punctuation">.</span><span class="token function">foo</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="30-how-do-you-illustrate-a-try-catch-example-in-java"><a href="#30-how-do-you-illustrate-a-try-catch-example-in-java" onclick="navigator.clipboard.writeText(this.href);">30. How do you illustrate a try catch example in Java?</a><a class="hash-anchor" href="#30-how-do-you-illustrate-a-try-catch-example-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The following example code shows an example of try-catch:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">try</span> <span class="token punctuation">{</span>
 <span class="token class-name">FileInputStream</span> fis <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">FileInputStream</span><span class="token punctuation">(</span><span class="token string">"test.txt"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span> <span class="token keyword">catch</span><span class="token punctuation">(</span><span class="token class-name">FileNotFoundException</span> e<span class="token punctuation">)</span> <span class="token punctuation">{</span>
 e<span class="token punctuation">.</span><span class="token function">printStackTrace</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>From Java 7 onwards, you can also catch multiple exceptions in a single catch block, as shown in the following example. It’s useful when you have the same code in all the catch blocks.</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">foo</span><span class="token punctuation">(</span><span class="token keyword">int</span> x<span class="token punctuation">)</span> <span class="token keyword">throws</span> <span class="token class-name">IllegalArgumentException</span><span class="token punctuation">,</span> <span class="token class-name">NullPointerException</span> <span class="token punctuation">{</span>
 <span class="token comment">// some code</span>
<span class="token punctuation">}</span>

<span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token keyword">try</span> <span class="token punctuation">{</span>
  <span class="token function">foo</span><span class="token punctuation">(</span><span class="token number">10</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span> <span class="token keyword">catch</span> <span class="token punctuation">(</span><span class="token class-name">IllegalArgumentException</span> <span class="token operator">|</span> <span class="token class-name">NullPointerException</span> e<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>e<span class="token punctuation">.</span><span class="token function">getMessage</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="31-write-a-java-program-to-show-a-nullpointerexception"><a href="#31-write-a-java-program-to-show-a-nullpointerexception" onclick="navigator.clipboard.writeText(this.href);">31. Write a Java program to show a <code>NullPointerException</code></a><a class="hash-anchor" href="#31-write-a-java-program-to-show-a-nullpointerexception" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>If you are calling a function on <code>null</code>, it will throw a <code>NullPointerException</code>, as shown in the following example code:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token function">printString</span><span class="token punctuation">(</span><span class="token keyword">null</span><span class="token punctuation">,</span> <span class="token number">3</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 
<span class="token punctuation">}</span>

<span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">printString</span><span class="token punctuation">(</span><span class="token class-name">String</span> s<span class="token punctuation">,</span> <span class="token keyword">int</span> count<span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span> i <span class="token operator">&lt;</span> count<span class="token punctuation">;</span> i<span class="token operator">++</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>s<span class="token punctuation">.</span><span class="token function">toUpperCase</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span> <span class="token comment">// Exception in thread "main" java.lang.NullPointerException</span>
 <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>You should have null check in place for early validation, as shown in the following example code:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">printString</span><span class="token punctuation">(</span><span class="token class-name">String</span> s<span class="token punctuation">,</span> <span class="token keyword">int</span> count<span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token keyword">if</span> <span class="token punctuation">(</span>s <span class="token operator">==</span> <span class="token keyword">null</span><span class="token punctuation">)</span> <span class="token keyword">return</span><span class="token punctuation">;</span>
 <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span> i <span class="token operator">&lt;</span> count<span class="token punctuation">;</span> i<span class="token operator">++</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>s<span class="token punctuation">.</span><span class="token function">toUpperCase</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>You can also throw <code>IllegalArgumentException</code> based on the project requirements.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="32-how-do-you-create-a-record-in-java"><a href="#32-how-do-you-create-a-record-in-java" onclick="navigator.clipboard.writeText(this.href);">32. How do you create a record in Java?</a><a class="hash-anchor" href="#32-how-do-you-create-a-record-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>Records was added as a standard feature in Java 16. Records enable you to create a POJO class with minimal code. Records automatically generates <code>hashCode()</code>, <code>equals()</code>, getter methods, and <code>toString()</code> method code for the class. Records are final and implicitly extend the <code>java.lang.Record</code> class. The following example code shows one way to cerate a record:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">import</span> <span class="token import"><span class="token namespace">java<span class="token punctuation">.</span>util<span class="token punctuation">.</span></span><span class="token class-name">Map</span></span><span class="token punctuation">;</span>
 
<span class="token keyword">public</span> <span class="token keyword">record</span> <span class="token class-name">EmpRecord</span><span class="token punctuation">(</span><span class="token keyword">int</span> id<span class="token punctuation">,</span> <span class="token class-name">String</span> name<span class="token punctuation">,</span> <span class="token keyword">long</span> salary<span class="token punctuation">,</span> <span class="token class-name">Map</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">,</span> <span class="token class-name">String</span><span class="token punctuation">&gt;</span></span> addresses<span class="token punctuation">)</span> <span class="token punctuation">{</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>Learn more about <a href="/community/tutorials/java-records-class">records in Java</a>. For details about POJO, refer to <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" rel="ugc nofollow noopener" target="_blank">Plain old Java object on Wikipedia</a>.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="33-how-do-you-create-text-blocks-in-java"><a href="#33-how-do-you-create-text-blocks-in-java" onclick="navigator.clipboard.writeText(this.href);">33. How do you create text blocks in Java?</a><a class="hash-anchor" href="#33-how-do-you-create-text-blocks-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>Java 15 added the text blocks feature. You can create multiline strings using text blocks. The multiline string has to be written inside of a pair of triple-double quotes, as shown in the following example:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">String</span> textBlock <span class="token operator">=</span> <span class="token triple-quoted-string string">"""
  Hi
  Hello
  Yes"""</span><span class="token punctuation">;</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>It’s the same as creating a string, such as <code>Hi\\nHello\\nYes</code>.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="34-show-an-example-of-switch-expressions-and-multi-label-case-statements-in-java"><a href="#34-show-an-example-of-switch-expressions-and-multi-label-case-statements-in-java" onclick="navigator.clipboard.writeText(this.href);">34. Show an example of switch expressions and multi-label case statements in Java</a><a class="hash-anchor" href="#34-show-an-example-of-switch-expressions-and-multi-label-case-statements-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The switch expressions were added as a standard feature in Java 14. The following examples show switch expressions as well as multi-label case statements:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">int</span> choice <span class="token operator">=</span> <span class="token number">2</span><span class="token punctuation">;</span>

<span class="token keyword">int</span> x <span class="token operator">=</span> <span class="token keyword">switch</span> <span class="token punctuation">(</span>choice<span class="token punctuation">)</span> <span class="token punctuation">{</span>
    <span class="token keyword">case</span> <span class="token number">1</span><span class="token punctuation">,</span> <span class="token number">2</span><span class="token punctuation">,</span> <span class="token number">3</span><span class="token operator">:</span>
     <span class="token keyword">yield</span> choice<span class="token punctuation">;</span>
    <span class="token keyword">default</span><span class="token operator">:</span>
     <span class="token keyword">yield</span> <span class="token operator">-</span><span class="token number">1</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span><span class="token punctuation">;</span>

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"x = "</span> <span class="token operator">+</span> x<span class="token punctuation">)</span><span class="token punctuation">;</span> <span class="token comment">// x = 2</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>You can also use lambda expressions in switch expressions.</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">String</span> day <span class="token operator">=</span> <span class="token string">"TH"</span><span class="token punctuation">;</span>
<span class="token class-name">String</span> result <span class="token operator">=</span> <span class="token keyword">switch</span> <span class="token punctuation">(</span>day<span class="token punctuation">)</span> <span class="token punctuation">{</span>
    <span class="token keyword">case</span> <span class="token string">"M"</span><span class="token punctuation">,</span> <span class="token string">"W"</span><span class="token punctuation">,</span> <span class="token string">"F"</span> <span class="token operator">-&gt;</span> <span class="token string">"MWF"</span><span class="token punctuation">;</span>
    <span class="token keyword">case</span> <span class="token string">"T"</span><span class="token punctuation">,</span> <span class="token string">"TH"</span><span class="token punctuation">,</span> <span class="token string">"S"</span> <span class="token operator">-&gt;</span> <span class="token string">"TTS"</span><span class="token punctuation">;</span>

    <span class="token keyword">default</span> <span class="token operator">-&gt;</span> <span class="token punctuation">{</span>
     <span class="token keyword">if</span> <span class="token punctuation">(</span>day<span class="token punctuation">.</span><span class="token function">isEmpty</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
      <span class="token keyword">yield</span> <span class="token string">"Please insert a valid day."</span><span class="token punctuation">;</span>
     <span class="token keyword">else</span>
      <span class="token keyword">yield</span> <span class="token string">"Looks like a Sunday."</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span><span class="token punctuation">;</span>

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>result<span class="token punctuation">)</span><span class="token punctuation">;</span> <span class="token comment">// TTH</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="35-how-do-you-compile-and-run-a-java-class-from-the-command-line"><a href="#35-how-do-you-compile-and-run-a-java-class-from-the-command-line" onclick="navigator.clipboard.writeText(this.href);">35. How do you compile and run a Java class from the command line?</a><a class="hash-anchor" href="#35-how-do-you-compile-and-run-a-java-class-from-the-command-line" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>This example refers to the following Java file:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">Test</span> <span class="token punctuation">{</span>

<span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span> args<span class="token punctuation">[</span><span class="token punctuation">]</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"Hi"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>You can compile it using the following command in your terminal:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="prefixed command language-bash"><code><ol><li data-prefix="$">javac Test.java
</li></ol>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>To run the class, use the following command in your terminal:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="prefixed command language-bash"><code><ol><li data-prefix="$"><span class="token function">java</span> Test
</li></ol>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>For the recent releases, the <code>java</code> command will also compile the program if the class file is not present. If the class is in a package, such as <code>com.example</code>, then it should be inside the folder <code>com/example</code>. The command to compile and run is:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="prefixed command language-bash"><code><ol><li data-prefix="$"><span class="token function">java</span> com/example/Test.java
</li></ol>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>If your class requires some additional JARs to compile and run, you can use the <code>java -cp</code> option. For example:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="prefixed command language-bash"><code><ol><li data-prefix="$"><span class="token function">java</span> <span class="token parameter variable">-cp</span> .:~/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar  com/example/Test.java
</li></ol>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="36-how-do-you-create-an-enum-in-java"><a href="#36-how-do-you-create-an-enum-in-java" onclick="navigator.clipboard.writeText(this.href);">36. How do you create an enum in Java?</a><a class="hash-anchor" href="#36-how-do-you-create-an-enum-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The following example code shows how to create a basic enum:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">enum</span> <span class="token class-name">ThreadStates</span> <span class="token punctuation">{</span>
 <span class="token constant">START</span><span class="token punctuation">,</span>
 <span class="token constant">RUNNING</span><span class="token punctuation">,</span>
 <span class="token constant">WAITING</span><span class="token punctuation">,</span>
 <span class="token constant">DEAD</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p><code>ThreadStates</code> is the enum with fixed constants fields <code>START</code>, <code>RUNNING</code>, <code>WAITING</code>, and <code>DEAD</code>. All enums implicitly extend the <code>java.lang.Enum</code> class and implement the <code>Serializable</code> and <code>Comparable</code> interfaces. Enum can have methods also. Learn more about <a href="/community/tutorials/java-enum">enums in Java</a>.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="37-how-do-you-use-the-foreach-method-in-java"><a href="#37-how-do-you-use-the-foreach-method-in-java" onclick="navigator.clipboard.writeText(this.href);">37. How do you use the <code>forEach()</code> method in Java?</a><a class="hash-anchor" href="#37-how-do-you-use-the-foreach-method-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>The <code>forEach()</code> method provides a shortcut to perform an action on all the elements of an iterable. The following example code shows how to iterate over the list elements and print them:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">List</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">&gt;</span></span> list <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">ArrayList</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token punctuation">&gt;</span></span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token class-name">Iterator</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">&gt;</span></span> it <span class="token operator">=</span> list<span class="token punctuation">.</span><span class="token function">iterator</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token keyword">while</span> <span class="token punctuation">(</span>it<span class="token punctuation">.</span><span class="token function">hasNext</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
 <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>it<span class="token punctuation">.</span><span class="token function">next</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>You can use the <code>forEach()</code> method with a lambda expression to reduce the code size, as shown in the following example code:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">List</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">&gt;</span></span> list <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">ArrayList</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token punctuation">&gt;</span></span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

list<span class="token punctuation">.</span><span class="token function">forEach</span><span class="token punctuation">(</span><span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token operator">::</span><span class="token function">print</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="38-how-do-you-write-an-interface-with-default-and-static-method"><a href="#38-how-do-you-write-an-interface-with-default-and-static-method" onclick="navigator.clipboard.writeText(this.href);">38. How do you write an interface with <code>default</code> and <code>static</code> method?</a><a class="hash-anchor" href="#38-how-do-you-write-an-interface-with-default-and-static-method" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>Java 8 introduced default and static methods in interfaces. This bridged the gap between interfaces and abstract classes. The following example code shows one way to write an interface with the <code>default</code> and <code>static</code> method:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">interface</span> <span class="token class-name">Interface1</span> <span class="token punctuation">{</span>
 
 <span class="token comment">// regular abstract method</span>
 <span class="token keyword">void</span> <span class="token function">method1</span><span class="token punctuation">(</span><span class="token class-name">String</span> str<span class="token punctuation">)</span><span class="token punctuation">;</span>
 
 <span class="token keyword">default</span> <span class="token keyword">void</span> <span class="token function">log</span><span class="token punctuation">(</span><span class="token class-name">String</span> str<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"I1 logging::"</span> <span class="token operator">+</span> str<span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>
 
 <span class="token keyword">static</span> <span class="token keyword">boolean</span> <span class="token function">isNull</span><span class="token punctuation">(</span><span class="token class-name">String</span> str<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"Interface Null Check"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

  <span class="token keyword">return</span> str <span class="token operator">==</span> <span class="token keyword">null</span> <span class="token operator">?</span> <span class="token boolean">true</span> <span class="token operator">:</span> <span class="token string">""</span><span class="token punctuation">.</span><span class="token function">equals</span><span class="token punctuation">(</span>str<span class="token punctuation">)</span> <span class="token operator">?</span> <span class="token boolean">true</span> <span class="token operator">:</span> <span class="token boolean">false</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>Learn more about about <code>default</code> and <code>static</code> methods in interfaces in <a href="/community/tutorials/java-8-interface-changes-static-method-default-method">Java 8 interface changes</a>.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="39-how-do-you-create-a-functional-interface"><a href="#39-how-do-you-create-a-functional-interface" onclick="navigator.clipboard.writeText(this.href);">39. How do you create a functional interface?</a><a class="hash-anchor" href="#39-how-do-you-create-a-functional-interface" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>An interface with exactly one abstract method is called a functional interface. The major benefit of functional interfaces is that you can use lambda expressions to instantiate them and avoid using bulky anonymous class implementation. The <code>@FunctionalInterface</code> annotation indicates a functional interface, as shown in the following example code:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token annotation punctuation">@FunctionalInterface</span>
<span class="token keyword">interface</span> <span class="token class-name">Foo</span> <span class="token punctuation">{</span>
 <span class="token keyword">void</span> <span class="token function">test</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="40-show-an-example-of-using-lambda-expressions-in-java"><a href="#40-show-an-example-of-using-lambda-expressions-in-java" onclick="navigator.clipboard.writeText(this.href);">40. Show an example of using lambda expressions in Java</a><a class="hash-anchor" href="#40-show-an-example-of-using-lambda-expressions-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p><code>Runnable</code> is an excellent example of a functional interface. You can use lambda expressions to create a runnable, as shown in the following example code:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">Runnable</span> r1 <span class="token operator">=</span> <span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token operator">-&gt;</span> <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"My Runnable"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="41-show-examples-of-overloading-and-overriding-in-java"><a href="#41-show-examples-of-overloading-and-overriding-in-java" onclick="navigator.clipboard.writeText(this.href);">41. Show examples of overloading and overriding in Java</a><a class="hash-anchor" href="#41-show-examples-of-overloading-and-overriding-in-java" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>When a class has two or more methods with the same name, they are called overloaded methods. The following example code shows as overloaded method called <code>print</code>:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">class</span> <span class="token class-name">Foo</span> <span class="token punctuation">{</span>
 <span class="token keyword">void</span> <span class="token function">print</span><span class="token punctuation">(</span><span class="token class-name">String</span> s<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>s<span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>

 <span class="token keyword">void</span> <span class="token function">print</span><span class="token punctuation">(</span><span class="token class-name">String</span> s<span class="token punctuation">,</span> <span class="token keyword">int</span> count<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token keyword">while</span> <span class="token punctuation">(</span>count <span class="token operator">&gt;</span> <span class="token number">0</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
   <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>s<span class="token punctuation">)</span><span class="token punctuation">;</span>
   count<span class="token operator">--</span><span class="token punctuation">;</span>
  <span class="token punctuation">}</span>
 <span class="token punctuation">}</span>

<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>When a superclass method is also implemented in the child class, it’s called overriding. The following example code shows how to annotate the <code>printname()</code> method that’s implemented in both classes:</p>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">class</span> <span class="token class-name">Base</span> <span class="token punctuation">{</span>
 <span class="token keyword">void</span> <span class="token function">printName</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"Base Class"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>
<span class="token punctuation">}</span>

<span class="token keyword">class</span> <span class="token class-name">Child</span> <span class="token keyword">extends</span> <span class="token class-name">Base</span> <span class="token punctuation">{</span>
 <span class="token annotation punctuation">@Override</span>
 <span class="token keyword">void</span> <span class="token function">printName</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"Child Class"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>Learn more about <a href="/community/tutorials/overriding-vs-overloading-in-java">overriding and overloading in Java</a>.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="42-49-guess-the-output"><a href="#42-49-guess-the-output" onclick="navigator.clipboard.writeText(this.href);">42.-49. Guess the Output</a><a class="hash-anchor" href="#42-49-guess-the-output" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>Test yourself by guessing the output of the following code snippets.</p>
<hr>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">String</span> s1 <span class="token operator">=</span> <span class="token string">"abc"</span><span class="token punctuation">;</span>
<span class="token class-name">String</span> s2 <span class="token operator">=</span> <span class="token string">"abc"</span><span class="token punctuation">;</span>

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"s1 == s2 is:"</span> <span class="token operator">+</span> s1 <span class="token operator">==</span> s2<span class="token punctuation">)</span><span class="token punctuation">;</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<details>
<summary>Output</summary>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-bash"><code><span class="token boolean">false</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>The output of the given statement is <code>false</code> because the <code>+</code> operator has a higher precedence than the <code>==</code> operator. So the given expression is evaluated to <code>“s1 == s2 is:abc” == “abc”</code>, which is <code>false</code>.</p>
</details>
<hr>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">String</span> s3 <span class="token operator">=</span> <span class="token string">"JournalDev"</span><span class="token punctuation">;</span>
<span class="token keyword">int</span> start <span class="token operator">=</span> <span class="token number">1</span><span class="token punctuation">;</span>
<span class="token keyword">char</span> end <span class="token operator">=</span> <span class="token number">5</span><span class="token punctuation">;</span>

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>s3<span class="token punctuation">.</span><span class="token function">substring</span><span class="token punctuation">(</span>start<span class="token punctuation">,</span> end<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<details>
<summary>Output</summary>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-bash"><code>ourn
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>The output of the given statement is <code>ourn</code>. The first character is automatically type cast to <code>int</code>. Then, since the first character index is 0, it will start from <code>o</code> and print until <code>n</code>. Note that the <code>String substring</code> method creates a substring that begins at index <code>start</code> and extends to the character at index <code>end - 1</code>.</p>
</details>
<hr>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">HashSet</span> shortSet <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">HashSet</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

 <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">short</span> i <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span> i <span class="token operator">&lt;</span> <span class="token number">100</span><span class="token punctuation">;</span> i<span class="token operator">++</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
    shortSet<span class="token punctuation">.</span><span class="token function">add</span><span class="token punctuation">(</span>i<span class="token punctuation">)</span><span class="token punctuation">;</span>
    shortSet<span class="token punctuation">.</span><span class="token function">remove</span><span class="token punctuation">(</span>i <span class="token operator">-</span> <span class="token number">1</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>shortSet<span class="token punctuation">.</span><span class="token function">size</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<details>
<summary>Output</summary>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-bash"><code><span class="token number">100</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>The size of the <code>shortSet</code> is <code>100</code>. The autoboxing feature in Java means that the expression <code>i</code>, which has the primitive type <code>short</code>, converts to a <code>Short</code> object. Similarly, the expression <code>i - 1</code> has the primitive type <code>int</code> and is autoboxed to an <code>Integer</code> object. Since there is no <code>Integer</code> object in the <code>HashSet</code>, nothing is removed and the size is <code>100</code>.</p>
</details>
<hr>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">try</span> <span class="token punctuation">{</span>
 <span class="token keyword">if</span> <span class="token punctuation">(</span>flag<span class="token punctuation">)</span> <span class="token punctuation">{</span>
    <span class="token keyword">while</span> <span class="token punctuation">(</span><span class="token boolean">true</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
     <span class="token punctuation">}</span>
    <span class="token punctuation">}</span> <span class="token keyword">else</span> <span class="token punctuation">{</span>
     <span class="token class-name">System</span><span class="token punctuation">.</span><span class="token function">exit</span><span class="token punctuation">(</span><span class="token number">1</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span> <span class="token keyword">finally</span> <span class="token punctuation">{</span>
    <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"In Finally"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<details>
<summary>Output</summary>
<p>No output. This code results in an infinite loop if the flag is <code>true</code> and the program exists if the flag is <code>false</code>. The <code>finally</code> block will never be reached.</p>
</details>
<hr>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">String</span> str <span class="token operator">=</span> <span class="token keyword">null</span><span class="token punctuation">;</span>
<span class="token class-name">String</span> str1<span class="token operator">=</span><span class="token string">"abc"</span><span class="token punctuation">;</span>

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>str1<span class="token punctuation">.</span><span class="token function">equals</span><span class="token punctuation">(</span><span class="token string">"abc"</span><span class="token punctuation">)</span> <span class="token operator">|</span> str<span class="token punctuation">.</span><span class="token function">equals</span><span class="token punctuation">(</span><span class="token keyword">null</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<details>
<summary>Output</summary>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-bash"><code>Exception <span class="token keyword">in</span> thread <span class="token string">"main"</span> java.lang.NullPointerException: Cannot invoke <span class="token string">"String.equals(Object)"</span> because <span class="token string">"&lt;local1&gt;"</span> is null
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>The given print statement will throw a <code>java.lang.NullPointerException</code> because the <code>OR</code> logical operator evaluates both the literals before returning the result. Since <code>str</code> is <code>null</code>, the <code>.equals()</code> method will throw an exception. Its always advisable to use short-circuit logical operators, such as <code>||</code> and <code>&amp;&amp;</code>, which evaluate the literal values from left to right. In this case, since the first literal would return <code>true</code>, it would skip the second literal evaluation.</p>
</details>
<hr>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token class-name">String</span> x <span class="token operator">=</span> <span class="token string">"abc"</span><span class="token punctuation">;</span>
<span class="token class-name">String</span> y <span class="token operator">=</span> <span class="token string">"abc"</span><span class="token punctuation">;</span>

x<span class="token punctuation">.</span><span class="token function">concat</span><span class="token punctuation">(</span>y<span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">print</span><span class="token punctuation">(</span>x<span class="token punctuation">)</span><span class="token punctuation">;</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<details>
<summary>Output</summary>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-bash"><code>abc
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>The <code>x.concat(y)</code> creates a new string but is not assigned to <code>x</code>, so the value of <code>x</code> is not changed.</p>
</details>
<hr>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">MathTest</span> <span class="token punctuation">{</span>

  <span class="token keyword">public</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>    
     <span class="token keyword">int</span> x <span class="token operator">=</span> <span class="token number">10</span> <span class="token operator">*</span> <span class="token number">10</span> <span class="token operator">-</span> <span class="token number">10</span><span class="token punctuation">;</span>
     
     <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>x<span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
   
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<details>
<summary>Output</summary>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-bash"><code>Error: Main method is not static <span class="token keyword">in</span> class MathTest, please define the main method as:
   public static void main<span class="token punctuation">(</span>String<span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>While it might seem like this question is about the order of execution of the mathematical operators, the question is really about noticing that the <a href="/community/tutorials/public-static-void-main-string-args-java-main-method">main method</a> wasn’t declared <code>static</code>.</p>
</details>
<hr>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">Test</span> <span class="token punctuation">{</span>
   
   <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
     <span class="token keyword">try</span> <span class="token punctuation">{</span>
      <span class="token keyword">throw</span> <span class="token keyword">new</span> <span class="token class-name">IOException</span><span class="token punctuation">(</span><span class="token string">"Hello"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
     <span class="token punctuation">}</span> <span class="token keyword">catch</span><span class="token punctuation">(</span><span class="token class-name">IOException</span> <span class="token operator">|</span> <span class="token class-name">Exception</span> e<span class="token punctuation">)</span> <span class="token punctuation">{</span>
      <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>e<span class="token punctuation">.</span><span class="token function">getMessage</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
     <span class="token punctuation">}</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<details>
<summary>Output</summary>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-bash"><code>Test.java:5: error: cannot <span class="token function">find</span> symbol
      throw new IOException<span class="token punctuation">(</span><span class="token string">"Hello"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
                ^
  symbol:   class IOException
  location: class Test
Test.java:6: error: cannot <span class="token function">find</span> symbol
     <span class="token punctuation">}</span>catch<span class="token punctuation">(</span>IOException <span class="token operator">|</span> Exception e<span class="token punctuation">)</span> <span class="token punctuation">{</span>
            ^
  symbol:   class IOException
  location: class Test
<span class="token number">2</span> errors
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<p>This code results in a compile time error. The exception <code>IOException</code> is already caught by the alternative <code>Exception</code>.</p>
</details>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="50-find-5-mistakes-in-the-following-code-snippet"><a href="#50-find-5-mistakes-in-the-following-code-snippet" onclick="navigator.clipboard.writeText(this.href);">50. Find 5 mistakes in the following code snippet</a><a class="hash-anchor" href="#50-find-5-mistakes-in-the-following-code-snippet" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<div class="code-label" title=""></div>
<div class="code-toolbar"><pre class="language-java"><code><span class="token keyword">package</span> <span class="token namespace">com<span class="token punctuation">.</span>digitalocean<span class="token punctuation">.</span>programming</span><span class="token operator">-</span>interviews<span class="token punctuation">;</span>

<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">String</span> <span class="token class-name">Programs</span> <span class="token punctuation">{</span>

 <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token number">10</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
  <span class="token class-name">String</span> s <span class="token operator">=</span> <span class="token string">"abc"</span>
  <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span>s<span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre><div class="toolbar"><div class="toolbar-item"><button>Copy</button></div></div></div>
<details>
<summary>Answers</summary>
<ol>
<li>The package name can’t have hyphens.</li>
<li>The class name can’t have spaces.</li>
<li>The main method is not <code>public</code>, so it won’t run.</li>
<li>The main method argument shouldn’t specify the size.</li>
<li>The semicolon is missing in the string definition.</li>
</ol>
</details>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="bonus-questions"><a href="#bonus-questions" onclick="navigator.clipboard.writeText(this.href);">Bonus Questions</a><a class="hash-anchor" href="#bonus-questions" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="clear-comparison-between-collections-vs-streams-questions"><a href="#clear-comparison-between-collections-vs-streams-questions" onclick="navigator.clipboard.writeText(this.href);">Clear comparison between collections vs streams questions</a><a class="hash-anchor" href="#clear-comparison-between-collections-vs-streams-questions" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>Collections and streams are two fundamental concepts in Java that serve different purposes in handling data. Here’s a clear comparison between them:</p>
<p><strong>Collections:</strong></p>
<ul>
<li>A collection is a group of objects that can be manipulated as a single unit.</li>
<li>It is a static data structure that stores elements and provides methods to access, modify, and manipulate them.</li>
<li>Examples of collections include List, Set, Map, and Queue.</li>
<li>Collections are suitable for scenarios where data needs to be stored and manipulated in a structured way.</li>
</ul>
<p><strong>Streams:</strong></p>
<ul>
<li>A stream is a sequence of elements that can be processed in a pipeline fashion.</li>
<li>It is a dynamic data structure that allows for the creation of a pipeline of operations to process elements.</li>
<li>Streams are designed for parallel processing and are particularly useful for handling large datasets.</li>
<li>Streams are suitable for scenarios where data needs to be processed in a more functional programming style.</li>
</ul>
<p><strong>Key differences:</strong></p>
<ul>
<li><strong>Storage:</strong> Collections store elements, while streams do not store elements but rather process them on the fly.</li>
<li><strong>Processing:</strong> Collections are processed sequentially, whereas streams can be processed in parallel.</li>
<li><strong>Lazy vs Eager:</strong> Streams are lazy, meaning operations are executed only when the terminal operation is invoked. Collections are eager, meaning all operations are executed immediately.</li>
</ul>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="add-java-multithreading-and-concurrency-coding-challenges"><a href="#add-java-multithreading-and-concurrency-coding-challenges" onclick="navigator.clipboard.writeText(this.href);">Add Java multithreading and concurrency coding challenges</a><a class="hash-anchor" href="#add-java-multithreading-and-concurrency-coding-challenges" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>Here are some Java multithreading and concurrency coding challenges to help you practice and improve your skills:</p>
<p><strong>Challenge 1:</strong> Implement a thread-safe singleton class.</p>
<p><strong>Challenge 2:</strong> Write a program to demonstrate the use of synchronized blocks to achieve thread safety.</p>
<p><strong>Challenge 3:</strong> Implement a producer-consumer problem using wait() and notify() methods.</p>
<p><strong>Challenge 4:</strong> Use Java’s ExecutorService to execute a list of tasks concurrently.</p>
<p><strong>Challenge 5:</strong> Implement a thread-safe cache using ConcurrentHashMap.</p>
<p><strong>Challenge 6:</strong> Write a program to demonstrate the use of atomic variables for thread-safe operations.</p>
<p><strong>Challenge 7:</strong> Implement a deadlock scenario and explain how to avoid it.</p>
<p><strong>Challenge 8:</strong> Use Java’s Lock interface to implement a custom lock for thread synchronization.</p>
<p><strong>Challenge 9:</strong> Implement a thread-safe queue using BlockingQueue.</p>
<p><strong>Challenge 10:</strong> Write a program to demonstrate the use of CompletableFuture for asynchronous programming.</p>
<p>These challenges cover various aspects of Java multithreading and concurrency, including thread safety, synchronization, and asynchronous programming.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="faqs"><a href="#faqs" onclick="navigator.clipboard.writeText(this.href);">FAQs</a><a class="hash-anchor" href="#faqs" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<h3 id="1-what-java-topics-should-i-study-for-interviews"><a href="#1-what-java-topics-should-i-study-for-interviews" onclick="navigator.clipboard.writeText(this.href);">1. What Java topics should I study for interviews?</a><a class="hash-anchor" href="#1-what-java-topics-should-i-study-for-interviews" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h3>
<p>For Java interviews, it’s essential to have a solid grasp of the following topics:</p>
<ul>
<li>Core Java: <a href="/community/tutorials/oops-concepts-java-example">OOP concepts</a>, data types, operators, control structures, methods, and exception handling.</li>
<li>Java Collections Framework: Lists, Sets, Maps, and Queues.</li>
<li>Multithreading and Concurrency: Thread creation, synchronization, and concurrent collections.</li>
<li>Java Standard Library: Familiarity with classes like String, StringBuilder, and Arrays.</li>
<li>Java Best Practices: Code organization, naming conventions, and coding standards.</li>
</ul>
<h3 id="2-how-do-i-prepare-for-java-technical-interviews"><a href="#2-how-do-i-prepare-for-java-technical-interviews" onclick="navigator.clipboard.writeText(this.href);">2. How do I prepare for Java technical interviews?</a><a class="hash-anchor" href="#2-how-do-i-prepare-for-java-technical-interviews" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h3>
<p>To prepare for Java technical interviews, follow these steps:</p>
<ul>
<li>Review the basics: Brush up on core Java concepts, data structures, and algorithms.</li>
<li>Practice coding: Solve problems on platforms like LeetCode, HackerRank, or CodeWars.</li>
<li>Focus on common interview topics: Study multithreading, concurrency, and Java-specific topics like serialization and reflection.</li>
<li>Prepare to answer behavioral questions: Be ready to discuss your past projects, design decisions, and problem-solving approaches.</li>
<li>Practice whiteboarding: Practice explaining technical concepts and designing systems on a whiteboard.</li>
</ul>
<h3 id="3-what-java-version-should-i-focus-on-for-interviews"><a href="#3-what-java-version-should-i-focus-on-for-interviews" onclick="navigator.clipboard.writeText(this.href);">3. What Java version should I focus on for interviews?</a><a class="hash-anchor" href="#3-what-java-version-should-i-focus-on-for-interviews" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h3>
<p>For Java interviews, it’s recommended to focus on <a href="/community/tutorials/javase8-interview-questions-part1">Java 8</a> and its features, such as lambda expressions, functional programming, and the new Date and Time API. However, having knowledge of Java 11 and its improvements is also beneficial.</p>
<h3 id="4-how-important-is-multithreading-in-java-interviews"><a href="#4-how-important-is-multithreading-in-java-interviews" onclick="navigator.clipboard.writeText(this.href);">4. How important is multithreading in Java interviews?</a><a class="hash-anchor" href="#4-how-important-is-multithreading-in-java-interviews" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h3>
<p><a href="/community/tutorials/multithreading-in-java">Multithreading</a> is a crucial topic in Java interviews, as it’s a key aspect of Java programming. You should be prepared to answer questions on thread creation, synchronization, deadlocks, and concurrent collections. Multithreading concepts are often used to evaluate a candidate’s ability to write efficient, scalable, and thread-safe code.</p>
<h3 id="5-what-are-some-good-java-coding-problems-for-practice"><a href="#5-what-are-some-good-java-coding-problems-for-practice" onclick="navigator.clipboard.writeText(this.href);">5. What are some good Java coding problems for practice?</a><a class="hash-anchor" href="#5-what-are-some-good-java-coding-problems-for-practice" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h3>
<p>Here are some popular Java coding problems for practice:</p>
<ul>
<li>Reverse a string or an array</li>
<li>Find the middle element of a linked list</li>
<li>Implement a stack using two queues</li>
<li>Find the first duplicate in an array</li>
<li>Implement a binary search tree</li>
<li>Solve the producer-consumer problem using multithreading</li>
<li>Implement a cache using a HashMap</li>
<li>Find the maximum sum of a subarray</li>
</ul>
<p>Practice these problems to improve your coding skills and prepare for common interview questions.</p>
</details>
<details class="collapsible" open="">
<summary>
<h2 id="conclusion"><a href="#conclusion" onclick="navigator.clipboard.writeText(this.href);">Conclusion</a><a class="hash-anchor" href="#conclusion" aria-hidden="true" onclick="navigator.clipboard.writeText(this.href);"></a></h2>
</summary>
<p>This collection of 50 Java programming interview questions included questions from beginner to expert level, to help you prepare for your interview. For further learning and practice, we recommend checking out the following tutorials:</p>
<ul>
<li><a href="/community/tutorials/how-to-write-your-first-program-in-java">How to Write Your First Program in Java</a></li>
<li><a href="/community/tutorials/how-to-use-operators-in-java">How to Use Operators in Java</a></li>
<li><a href="/community/tutorials/java-generics-example-method-class-interface">Java Generics Example: Method, Class, Interface</a></li>
<li><a href="/community/tutorials/constructor-in-java">Constructor in Java</a></li>
</ul>
<p>These resources will help you solidify your understanding of Java fundamentals and prepare you for more advanced topics in Java programming.</p>
<p><strong>Also Read:</strong></p>
<ul>
<li><a href="/community/tutorials/java-tricky-interview-questions">Java Tricky Interview Questions</a></li>
<li><a href="/community/tutorials/java-string-interview-questions-and-answers">Java String Interview Questions</a></li>
</ul>
</details>
</div>
