import java.util.*;
/**
it's useful for the sorted array
**/
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> seen= new HashSet<>();
        /**
            increasing order array num
            return no of unique elements
            first k elements be unique with sorted order in increasing order 
         */
        if(nums.length == 0) return 0;
        int left=0;
        for(int right=1;right<nums.length;right++){
           if(nums[left] != nums[right]){
                nums[++left] = nums[right];
           }
           
        }
        return ++left;
    }
}
