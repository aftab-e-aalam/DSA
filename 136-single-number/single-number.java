import java.util.Map;
import java.util.HashMap;
class Solution {
    public int singleNumber(int[] nums) {
       int single=0;
       for(int num:nums){
        single=num^single;
       }
    return single;
    }
    
}
