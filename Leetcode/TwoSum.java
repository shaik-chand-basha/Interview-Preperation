import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> pair = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp = target-nums[i];
            if(pair.containsKey(comp)){
                return new int[]{i,pair.get(comp)};
            }
            pair.put(nums[i],i);
        }
        return new int[]{};
    }
}
