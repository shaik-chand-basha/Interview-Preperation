// https://leetcode.com/problems/maximum-subarray/solutions/3666304/beats-100-c-java-python-beginner-friendly
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
            }else if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;


    }
}
