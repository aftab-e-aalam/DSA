class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i =0;

        int avg =0;
        int count =0;
        for(;i<k;i++){
            avg +=arr[i];
            
        }
        if(avg>=threshold*k){
            count++;
        }
        while(i<arr.length){

            avg +=arr[i];
            avg -=arr[i-k];
            i++;
    
            if(avg>=threshold*k){
                count++;
            }
            
        }
        return count;
    }
}