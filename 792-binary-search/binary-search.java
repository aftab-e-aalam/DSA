class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        return binary(nums, target, start, end);
    }

    public int binary(int[] nums, int target, int start, int end) {

        // Target doesn't exist
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target < nums[mid]) {
            return binary(nums, target, start, mid - 1);
        }

        else if (target > nums[mid]) {
            return binary(nums, target, mid + 1, end);
        }

        else {
            return mid;
        }
    }
}