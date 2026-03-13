// sliding window approach
/*
Sliding Window maintains a contiguous range (subarray/substring) by expanding/contracting its size, ideal for maximum/minimum sum subarrays.
1. Fixed sliding window -> fixed window, and we know, find sub array, max of fixed length
2. Dynamic Sliding window -> adjust the window left and right. like longest, shorted in subsarray


Fixed Sliding window:
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int n = nums.length;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }

        int max=sum;
        for(int i=k;i<n;i++){
            sum  = sum + nums[i];
            sum = sum - nums[i-k];
            max=Math.max(sum,max);
        }
        return (double)max/k;
    }
}

where we will move at fixed pace from starting of the array


Dynamic sliding window
In dyamic sliding window
1. first we will initialize left pointer with 0 and max=0
2. we will increment shrink the array till it doesn't contains duplicates
3. else will expand and calculate the max length
*/
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        /**
        Expand if unique are there
        Shrink if duplicate found
         */
         Set<Character> seen = new HashSet<>();
         int max=0;
         int left=0;
         for(int right=0;right<s.length();right++){
               
            while(seen.contains(s.charAt(right))){
                    seen.remove(s.charAt(left));
                    left++;
                } 
            
                seen.add(s.charAt(right));
            
            max =  Math.max(max,right-left+1);
            
         }
         return max;
    }
}
