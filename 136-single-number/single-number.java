import java.util.Map;
import java.util.HashMap;
class Solution {
    public int singleNumber(int[] nums) {
        int keyOfOne=0;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num : nums){
            freq.merge(num,1,Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                keyOfOne = entry.getKey();
                break; 
            }
        }
        return keyOfOne;
    }
    
}
