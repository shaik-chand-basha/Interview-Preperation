# Important DSA Patterns

## 1. Prefix Sum (0:33)
Used for efficient **subarray sum queries**.

- Reduces time complexity from **O(N × M)** to **O(1)** for each query.
- Requires **O(N)** precomputation.
- Commonly used in range sum queries.

---

## 2. Two Pointers (1:23)
Uses two pointers moving **towards or away from each other**.

- Useful for problems like **palindrome checking**.
- Reduces complexity from **O(N²)** to **O(N)**.

---

## 3. Sliding Window (2:04)
Optimizes **subarray or substring problems**.

Example:
- Maximum sum subarray of size **K**.

Improvement:
- From **O(N × K)** → **O(N)**  
- Avoids recalculating sums repeatedly.

---

## 4. Fast and Slow Pointers (2:51)
Uses pointers moving at **different speeds**.

Applications:
- Detect **cycles in linked lists**
- Find the **middle node** of a list

---

## 5. Linked List In-place Reversal (3:38)
Reverses a linked list **without extra memory**.

- Space Complexity: **O(1)**
- Works by changing node pointers.

---

## 6. Monotonic Stack (4:35)
Used to find **next greater or smaller elements** in arrays.

- Time Complexity: **O(N)**
- Maintains elements in **increasing or decreasing order**.

---

## 7. Top K Elements (5:24)
Uses **Heap / Priority Queue**.

- **Min Heap** → Find K largest elements  
- **Max Heap** → Find K smallest elements

Time Complexity:
- **O(N log K)**

---

## 8. Overlapping Intervals (6:32)
Handles **interval-based problems**.

Examples:
- Merging intervals
- Interval intersections
- Meeting room scheduling

---

## 9. Modified Binary Search (7:25)
Binary search variations.

Used for:
- **Rotated sorted arrays**
- **Finding boundaries**
- **Peak elements**

---

## 10. Binary Tree Traversal (8:01)

Types:

- **Pre-order**
- **In-order**
- **Post-order**
- **Level-order**

Methods:
- Recursive
- Iterative
- Queue (for level-order)

---

## 11. DFS and BFS (8:54, 9:29)

### DFS (Depth First Search)
- Explores **deep paths first**
- Uses **stack or recursion**

### BFS (Breadth First Search)
- Explores **level by level**
- Uses a **queue**

Used in:
- Graphs
- Trees
- Path finding

---

## 12. Matrix Traversal (10:10)

Treat a **grid as a graph**.

Common uses:
- Island counting
- Pathfinding
- Flood fill

Usually implemented using:
- **DFS**
- **BFS**

---

## 13. Backtracking (11:03)

Explores **all possible solutions**.

Used in:
- Permutations
- Combinations
- Sudoku
- N-Queens

Works by:
- Trying a solution
- Undoing (backtracking) if it fails

---

## 14. Dynamic Programming (11:51)

Solves problems by breaking them into **smaller overlapping subproblems**.

Key idea:
- Store previous results (**memoization or tabulation**)

Examples:
- Knapsack Problem
- Longest Common Subsequence (LCS)
- Fibonacci
