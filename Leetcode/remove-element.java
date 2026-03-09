/**
The intuition behind this solution is to iterate through the array and keep track of two pointers: index and i. 
The index pointer represents the position where the next non-target element should be placed, while the i pointer iterates through the array elements.
By overwriting the target elements with non-target elements, the solution effectively removes all occurrences of the target value from the array.
*/
import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}
