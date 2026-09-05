import java.util.ArrayList;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] posArray=new int[n/2];
        int[] negArray=new int[n/2];

        int j=0;
       
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                negArray[j]=nums[i];
                j++;

            }
        }
        j=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                posArray[j]=nums[i];
                j++;
            }
        }
        j=0;
        for(int i=0;i<n/2;i++){
            nums[j]=posArray[i];
            j++;
            nums[j]=negArray[i];
            j++;
        }
        return nums;
    }
}