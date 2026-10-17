import java.util.HashSet;
import java.util.Set;
class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> num = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            num.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(!num.contains(i)){
                return i;
            }
        }
        return -1;
    }
}