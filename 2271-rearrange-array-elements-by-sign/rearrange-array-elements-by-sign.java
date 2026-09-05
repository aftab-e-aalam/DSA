import java.util.ArrayList;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> negArray= new ArrayList<>();
        ArrayList<Integer> posArray= new ArrayList<>();
       
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                negArray.add(nums[i]);

            }
            else{
                posArray.add(nums[i]);
            }
        }
        int j=0;
        for(int i=0;i<n/2;i++){
            nums[j]=posArray.get(i);
            j++;
            nums[j]=negArray.get(i);
            j++;
        }
        return nums;
    }
}