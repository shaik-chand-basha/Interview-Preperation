A prefix sum array stores the cumulative total of elements from the start of the original array up to each index
The primary advantage is speed. Without this pattern, calculating the sum of a subarray of size \(N\) takes \(O(N)\) time because you have to loop through every element. With the prefix sum pattern, you can find the sum of any subarray from index L to R using a single subtraction:

1D Prefix Sums
Warm-up:
- https://leetcode.com/problems/running-sum-of-1d-array/
- https://leetcode.com/problems/find-the-highest-altitude/
- https://leetcode.com/problems/find-the-middle-index-in-array/
- https://codeforces.com/contest/327/problem/A
