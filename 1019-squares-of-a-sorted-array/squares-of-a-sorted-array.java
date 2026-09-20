class Solution {
    public int[] sortedSquares(int[] nums) {
        int N=nums.length;
        int[] square=new int[N];
        int r=N-1,l=0;

        for(int i=N-1;i>=0;i--){
            if(nums[r]*nums[r]>nums[l]*nums[l]){
                square[i]=nums[r]*nums[r];
                r--;
            }
            else if(nums[r]*nums[r]<=nums[l]*nums[l]){
                square[i]=nums[l]*nums[l];
                l++;

            }



        }
        return square;
        
    }
}