class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double maxSum=Integer.MIN_VALUE;
        int i=0;
        for(;i<k;i++){
            sum += nums[i];
        }
        maxSum = Math.max(sum,maxSum);
        for(;i<nums.length;i++){
            sum = sum + nums[i]-nums[i-k];
            maxSum = Math.max(sum,maxSum);
            
        }
        return maxSum/k;
    }
}