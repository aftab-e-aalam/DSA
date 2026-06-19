import java.util.Arrays;
public class duplicate {
    // Not a Better answer time complexity is high 
    //
    // public static boolean containsDuplicate(int[] nums) {
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = 0; j < nums.length; j++) {
    //             if (i != j) {
    //                 if (nums[i] == nums[j]) {
    //                     return true;
    //                 }
    //             }

    //         }
    //     }
    //     return false;
    // }

    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        // int[] nums = { 1, 2, 3, 4 };
        System.out.println(containsDuplicate(nums));
    }

}
